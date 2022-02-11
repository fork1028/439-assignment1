package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.application.HALApplication;

public class HALController {
	
	/**
	 * 
	 * @param String roomName
	 * @return null
	 */
	
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
	
	/**
	 * 
	 * @param String oldRoomName
	 * @param String newRoomName
	 * @return null
	 */
	
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
	
	/**
	 * 
	 * @param String roomName
	 * @return null
	 */
	
	public static String deleteRoom(String roomName) {
		Room r = findRoom(roomName);
		// if r is not found, no error message is returned because the end result is the same:
		if (r != null) {
			SmartHome smartHome = HALApplication.getSmartHome();
			// remove all actuators of the room
			for (ActuatorDevice ad : smartHome.getActuatordevice()) {
				if (ad.getRoom().equals(r)) {
					ad.setRoom(null);
					// delete the actuator
					String actuatorName = ad.getDeviceName();
					deleteActuator(actuatorName);
				}
			}
			// remove all sensors of the room
			for (SensorDevice sd : smartHome.getSensordevice()) {
				if (sd.getRoom().equals(r)) {
					// sd.setPrecondition(null);
					// delete the sensor
					String sensorName = sd.getDeviceName();
					deleteSensor(sensorName);
					// delete the sensor's sensor readings
//					SensorReading sensorReading = sd.getSensorreading();
//					ActivityLog activityLog = sensorReading.getActivitylog();
//					activityLog.getSensorreading().remove(sensorReading);		
				}
			}
			// remove the room
			smartHome.getRoom().remove(r);
			HALApplication.save();
		}
		return null;
	}
	
	/**
	 * 
	 * @param String roomName
	 * @return
	 */
	
	public static TORoom getRoom(String roomName) {
		TORoom result = null;
		Room r = findRoom(roomName);
		if (r != null) {
			List<String> sensorDeviceNames = new ArrayList<String>();
			List<String> actuatorDeviceNames = new ArrayList<String>();
			for (SensorDevice sd : r.getSensordevice()) {
				sensorDeviceNames.add(sd.getDeviceName());
			}
			for (ActuatorDevice ad : r.getActuatordevice()) {
				actuatorDeviceNames.add(ad.getDeviceName());
			}
			result = new TORoom(r.getRoomName(), sensorDeviceNames, actuatorDeviceNames);
		}
		return result;
	}
	
	/**
	 * 
	 * @return list<String>
	 */

	public static List<String> getRooms() {
		ArrayList<String> roomNames = new ArrayList<String>();
		SmartHome smartHome = HALApplication.getSmartHome();
		for (Room r : smartHome.getRoom()) {
			roomNames.add(r.getRoomName());
		}
		return roomNames;
	}
	
	// sensor

	/**
	 * 
	 * @param roomName
	 * @param sensorDeviceName
	 * @param sensorDeviceType
	 * @return
	 */
	public static String addSensor(String roomName, String sensorDeviceName, String sensorDeviceTypeName) {
		if (!isRoomExisted(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
//		if (existsSensorDeviceType(sensorDeviceTypeName, roomName)) {
//			return "Sensor device with type " + sensorDeviceTypeName + " already exists";
//		}
		SmartHome smartHome = HALApplication.getSmartHome();
		SensorDevice sd = HalFactory.eINSTANCE.createSensorDevice();
		sd.setDeviceName(sensorDeviceName);
		sd.setSensordevicetype((SensorDeviceType)getDeviceType(sensorDeviceTypeName));
		Room r = findRoom(roomName);
		r.getSensordevice().add(sd);
		smartHome.getSensordevice().add(sd);
		HALApplication.save();
		return null;
	}

	/**
	 * 
	 * @param sensorDeviceName
	 * @return
	 */
	public static String deleteSensor(String sensorDeviceName) {
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
	
	/**
	 * 
	 * @param roomName
	 * @param actuatorDeviceName
	 * @param actuatorDeviceType
	 * @return
	 */
	public static String addActuator(String roomName, String actuatorDeviceName, ActuatorDeviceType actuatorDeviceType) {
		if (!isRoomExisted(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
//		if (existsActuatorDeviceType(actuatorDeviceType, roomName)) {
//			return "Actuator device with type " + actuatorDeviceType + " already exists";
//		}
		SmartHome smartHome = HALApplication.getSmartHome();
		ActuatorDevice ad = HalFactory.eINSTANCE.createActuatorDevice();
		ad.setDeviceName(actuatorDeviceName);
		Room r = findRoom(roomName);
		r.getActuatordevice().add(ad);
		smartHome.getActuatordevice().add(ad);
		HALApplication.save();
		return null;
	}

	/**
	 * 
	 * @param String actuatorDeviceName
	 */
	public static String deleteActuator(String actuatorDeviceName) {
		ActuatorDevice ad = findActuatorDevice(actuatorDeviceName);
		if (ad != null) {
			ad.setRoom(null);
			SmartHome smartHome = HALApplication.getSmartHome();
			smartHome.getActuatordevice().remove(ad);
			HALApplication.save();
		}
		return null;
	}

	/**
	 * 
	 * @param String s
	 * @return Boolean
	 */

	private static boolean isNameValid(String s) {
		return s == null || s.length() == 0;
	}
	
	/**
	 * 
	 * @param String roomName
	 * @return Boolean
	 */

	private static boolean isRoomExisted(String roomName) {
		return findRoom(roomName) != null;
	}
	
	/**
	 * 
	 * @param roomName
	 * @return Room
	 */

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

	/**
	 * 
	 * @param sensorDeviceName
	 * @return SensorDevice
	 */
	private static SensorDevice findSensorDevice(String sensorDeviceName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (SensorDevice sd : smartHome.getSensordevice()) {
			if (sd.getDeviceName().equals(sensorDeviceName)) {
				return sd;
			}
		}
		return null;
	}
	
	public static String getSensorDeviceTypeName(String sensorDeviceName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (SensorDevice sd : smartHome.getSensordevice()) {
			if (sd.getDeviceName().equals(sensorDeviceName)) {
				return sd.getSensordevicetype().getTypeName();
			}
		}
		return null;
	}
	
	private static DeviceType getDeviceType(String deviceTypeName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (DeviceType type : smartHome.getDevicetype()) {
			if (type.getTypeName().equals(deviceTypeName)) {
				return type;
			}
		}
		return null;
	}
	
	public static List<String> getAllDeviceTypes() {
		ArrayList<String> deviceTypeNames = new ArrayList<String>();
		SmartHome smartHome = HALApplication.getSmartHome();
		for (DeviceType type : smartHome.getDevicetype()) {
			deviceTypeNames.add(type.getTypeName());
		}
		return deviceTypeNames;
	}
	
//	/**
//	 * 
//	 * @param sensorDeviceType
//	 * @param roomName
//	 * @return Boolean
//	 */
//	private static Boolean existsSensorDeviceType(String sensorDeviceTypeName, String roomName) {
//		Room r = findRoom(roomName);
//		for (SensorDevice sd : r.getSensordevice()) {
//			if (sd.getSensordevicetype().toString().equals(sensorDeviceTypeName)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	// actuator
	
	/**
	 * 
	 * @param actuatorDeviceName
	 * @return ActuatorDevice
	 */
	private static ActuatorDevice findActuatorDevice(String actuatorDeviceName) {
		SmartHome smartHome = HALApplication.getSmartHome();
		for (ActuatorDevice ad : smartHome.getActuatordevice()) {
			if (ad.getDeviceName().equals(actuatorDeviceName)) {
				return ad;
			}
		}
		return null;
	}

//	/**
//	 * 
//	 * @param actuatorDeviceType
//	 * @param roomName
//	 * @return Boolean
//	 */
//	private static Boolean existsActuatorDeviceType(ActuatorDeviceType actuatorDeviceType, String roomName) {
//		Room r = findRoom(roomName);
//		for (ActuatorDevice ad : r.getActuatordevice()) {
//			if (ad.getActuatordevicetype() == actuatorDeviceType) {
//				return true;
//			}
//		}
//		return false;
//	}
	

}
