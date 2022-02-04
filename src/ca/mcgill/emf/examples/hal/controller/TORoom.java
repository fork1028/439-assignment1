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
	List<SensorDeviceType> sensorDevices;
	List<ActuatorDeviceType> actuatorDevices;

	public TORoom(String name, List<SensorDeviceType> sensorDevices, List<ActuatorDeviceType> actuatorDevices) {
		this.name = name;
		this.sensorDevices = sensorDevices;
		this.actuatorDevices = actuatorDevices;
	}

	public String getName() {
		return name;
	}

	public List<SensorDeviceType> getSensorDevices() {
		return sensorDevices;
	}

	public List<ActuatorDeviceType> getActuatorDevices() {
		return actuatorDevices;
	}
}
