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
		// if r is not found, no error message is returned because the end result is the same:
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

}
