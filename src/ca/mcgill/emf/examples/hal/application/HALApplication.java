package ca.mcgill.emf.examples.hal.application;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.impl.SensorDeviceImpl;
import ca.mcgill.emf.examples.hal.util.HalResourceFactoryImpl;
import ca.mcgill.emf.examples.hal.util.ResourceHelper;
import ca.mcgill.emf.examples.hal.view.HALPage;

public class HALApplication {
	
	private static SmartHome smartHome;
	private static SensorDeviceType temperatureSensor;
	private static SensorDeviceType movementSensor;
	private static SensorDeviceType lightSensor;
	private static ActuatorDeviceType heater;
	private static ActuatorDeviceType lock;
	private static ActuatorDeviceType lightSwitch;
	private static String filename = "data/activity.log";
	Resource resource;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize HAL package and prepare resource helper
        HalPackage.eINSTANCE.eClass();
        ResourceHelper.INSTANCE.addResourceFactory("Smart Home", new HalResourceFactoryImpl());
		
        // start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HALPage().setVisible(true);
            }
        });
        
	}

	public static SmartHome getSmartHome() {
		// make sure that only one instance of Smart home exists
		if (smartHome == null) {
			smartHome = load();
		}
 		return smartHome;
	}
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(smartHome, filename);
		// haha
//		System.out.println(resource);
//		System.out.println(resource.getContents());
//		resource.getContents().add(temperatureSensor);
//		System.out.println(resource.getContents());
//        try {
//            resource.save(Collections.EMPTY_MAP);
//        } catch (IOException e) {
//            System.err.println("Error saving model: " + e.getLocalizedMessage());
//        }
	}
	
	public static SmartHome load() {
		SmartHome smartHome;
		SensorDeviceType temperatureSensor;
		SensorDeviceType movementSensor;
		SensorDeviceType lightSensor;
		ActuatorDeviceType heater;
		ActuatorDeviceType lock;
		ActuatorDeviceType lightSwitch;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
	        smartHome = (SmartHome) resource.getContents().get(0);
	        
			temperatureSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			temperatureSensor.setTypeName("Temperature Sensor");
			smartHome.getDevicetype().add(temperatureSensor);
	        // Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
//			System.out.println("111111111111");
//			System.out.println(resource.getContents());
//			System.out.println("111111111111");
			System.out.println(resource.getContents().get(0));
			System.out.println("111111111111");
			System.out.println(resource.getContents().get(1));
			temperatureSensor = (SensorDeviceType) resource.getContents().get(1);
			System.out.println(resource.getContents());
			System.out.println("111111111111");
			ResourceHelper.INSTANCE.saveResource(temperatureSensor, filename);
			
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty smart home
			smartHome = HalFactory.eINSTANCE.createSmartHome();
			smartHome.setHomeName("My Smart Home");
			// create sensors
			temperatureSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			temperatureSensor.setTypeName("Temperature Sensor");
			smartHome.getDevicetype().add(temperatureSensor);
//			movementSensor = HalFactory.eINSTANCE.createSensorDeviceType();
//			movementSensor.setTypeName("Movement Sensor");
//			smartHome.getDevicetype().add(movementSensor);
//			lightSensor = HalFactory.eINSTANCE.createSensorDeviceType();
//			lightSensor.setTypeName("Light Sensor");
//			smartHome.getDevicetype().add(lightSensor);
//			// create actuators
//			heater = HalFactory.eINSTANCE.createActuatorDeviceType();
//			heater.setTypeName("Heater");
//			smartHome.getDevicetype().add(heater);
//			lock = HalFactory.eINSTANCE.createActuatorDeviceType();
//			lock.setTypeName("Lock");
//			smartHome.getDevicetype().add(lock);
//			lightSwitch = HalFactory.eINSTANCE.createActuatorDeviceType();
//			lightSwitch.setTypeName("Light Switch");
//			smartHome.getDevicetype().add(lightSwitch);
		}
		return smartHome;
	}

}
