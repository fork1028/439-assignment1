package ca.mcgill.emf.examples.hal.controller;

import java.util.List;

import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.SensorDeviceType;

public class TORoom {

	// a transfer object (TO) is used to enforce a strict interpretation of the MVC
	// pattern:
	// the view must not know anything about the model (i.e., no imports of model
	// classes in the view)
	// a TO is a simple class with instance variables of basic types and only the
	// constructor and getters

	String name;
	List<String> sensorDeviceNames;
	List<String> actuatorDeviceNames;

	public TORoom(String name, List<String> sensorDeviceNames, List<String> actuatorDeviceNames) {
		this.name = name;
		this.sensorDeviceNames = sensorDeviceNames;
		this.actuatorDeviceNames = actuatorDeviceNames;
	}

	public String getName() {
		return name;
	}

	public List<String> getSensorDeviceNames() {
		return sensorDeviceNames;
	}

	public List<String> getActuatorDeviceNames() {
		return actuatorDeviceNames;
	}
}
