package ca.mcgill.emf.examples.hal.controller;

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
