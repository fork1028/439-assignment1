package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.emf.examples.hal.Action;
import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.HalFactory;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Precondition;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SensorDevice;
import ca.mcgill.emf.examples.hal.SensorDeviceType;
import ca.mcgill.emf.examples.hal.SensorReading;
import ca.mcgill.emf.examples.hal.SmartHome;
import ca.mcgill.emf.examples.hal.application.HALApplication;

public class HALController {

	public static String addRoom(String roomName) {
		if (isNameValid(roomName)) {
			return "Room name must be specified";
		}
		if (isRoomExisted(roomName)) {
			return "Room with name " + roomName + " already exists";
		}
		SmartHome smarthome = HALApplication.getSmartHome();
		Room newRoom = HalFactory.eINSTANCE.createRoom();
		newRoom.setRoomName(roomName);
		smarthome.getRoom().add(newRoom);
		HALApplication.save();
		return null;
	}

	public static String updateRoom(String oldRoomName, String newRoomName) {
		if (!isRoomExisted(oldRoomName)) {
			return "Group with name " + oldRoomName + " does not exist";
		}
		if (oldRoomName.equals(newRoomName)) {
			return null;
		}
		if (isNameValid(newRoomName)) {
			return "Group name must be specified";
		}
		if (isRoomExisted(newRoomName)) {
			return "Group with name " + newRoomName + " already exists";
		}
		Room r = findRoom(oldRoomName);
		r.setRoomName(newRoomName);
		HALApplication.save();
		return null;
	}

	public static String deleteRoom(String roomName) {
		Room r = findRoom(roomName);
		// if r is not found, no error message is returned because the end result is the
		// same:
		if (r != null) {
			SmartHome smarthome = HALApplication.getSmartHome();
			// remove all matches of the group
			List<ActuatorDeviceType> matchesToBeDeleted = new ArrayList<ActuatorDeviceType>();
			for (ActuatorDeviceType m : smarthome.get) {
				if (m.getGroup().equals(r)) {
					m.setGroup(null);
					m.setHomeTeam(null);
					m.setGuestTeam(null);
					matchesToBeDeleted.add(m);
				}
			}
			while (matchesToBeDeleted.size() > 0) {
				Match m = matchesToBeDeleted.get(0);
				smarthome.getMatches().remove(m);
			}
			// remove all teams of a group
			while (r.getTeams().size() > 0) {
				Team t = r.getTeams().get(0);
				t.setGroup(null);
				smarthome.getTeams().remove(t);
			}
			// remove group
			smarthome.getGroups().remove(r);
			HALApplication.save();
		}
		return null;
	}
	
	// sensor

	public static String addSensor(String roomName, String sensorDeviceName, SensorDeviceType sensorDeviceType) {
		if (!isRoomExisted(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (existsSensorDeviceType(sensorDeviceType, roomName)) {
			return "Sensor device with type " + sensorDeviceType + " already exists";
		}
		SmartHome smartHome = HALApplication.getSmartHome();
		SensorDevice sd = HalFactory.eINSTANCE.createSensorDevice();
		sd.setDeviceName(sensorDeviceName);
		Room r = findRoom(roomName);
		r.getSensordevice().add(sd);
		smartHome.getSensordevice().add(sd);
		HALApplication.save();
		return null;
	}

	public static String removeSensor(String sensorDeviceName) {
		SensorDevice sd = findSensorDevice(sensorDeviceName);
		if (sd != null) {
			sd.setRoom(null);
			SmartHome smartHome = HALApplication.getSmartHome();
			smartHome.getSensordevice().remove(sd);
			HALApplication.save();
		}
		return null;
	}
	
	// actuator
	
	public static String addActuator(String roomName, String actuatorDeviceName, ActuatorDeviceType actuatorDeviceType) {
		if (!isRoomExisted(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (existsActuatorDeviceType(actuatorDeviceType, roomName)) {
			return "Actuator device with type " + actuatorDeviceType + " already exists";
		}
		SmartHome smartHome = HALApplication.getSmartHome();
		ActuatorDevice ad = HalFactory.eINSTANCE.createActuatorDevice();
		ad.setDeviceName(actuatorDeviceName);
		Room r = findRoom(roomName);
		r.getActuatordevice().add(ad);
		smartHome.getActuatordevice().add(ad);
		HALApplication.save();
		return null;
	}

	public static String removeActuator(String actuatorDeviceName) {
		ActuatorDevice ad = findActuatorDevice(actuatorDeviceName);
		if (ad != null) {
			ad.setRoom(null);
			SmartHome smartHome = HALApplication.getSmartHome();
			smartHome.getActuatordevice().remove(ad);
			HALApplication.save();
		}
		return null;
	}

	// helper methods

	private static boolean isNameValid(String s) {
		return s == null || s.length() == 0;
	}

	private static boolean isRoomExisted(String roomName) {
		return findRoom(roomName) != null;
	}

	private static Room findRoom(String roomName) {
		SmartHome smarthome = HALApplication.getSmartHome();
		for (Room r : smarthome.getRoom()) {
			if (r.getRoomName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	
	// sensor

	private static SensorDevice findSensorDevice(String sensorDeviceName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (SensorDevice sd : smartHome.getSensordevice()) {
			if (sd.getDeviceName().equals(sensorDeviceName)) {
				return sd;
			}
		}
		return null;
	}

	private static Boolean existsSensorDeviceType(SensorDeviceType sensorDeviceType, String roomName) {
		Room r = findRoom(roomName);
		for (SensorDevice sd : r.getSensordevice()) {
			if (sd.getSensordevicetype() == sensorDeviceType) {
				return true;
			}
		}
		return false;
	}
	
	// actuator
	
	private static ActuatorDevice findActuatorDevice(String actuatorDeviceName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (ActuatorDevice ad : smartHome.getActuatordevice()) {
			if (ad.getDeviceName().equals(actuatorDeviceName)) {
				return ad;
			}
		}
		return null;
	}

	private static Boolean existsActuatorDeviceType(ActuatorDeviceType actuatorDeviceType, String roomName) {
		Room r = findRoom(roomName);
		for (ActuatorDevice ad : r.getActuatordevice()) {
			if (ad.getActuatordevicetype() == actuatorDeviceType) {
				return true;
			}
		}
		return false;
	}
	

}
