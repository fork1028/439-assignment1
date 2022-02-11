package ca.mcgill.emf.examples.hal.application;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.util.HalResourceFactoryImpl;
import ca.mcgill.emf.examples.hal.util.ResourceHelper;
import ca.mcgill.emf.examples.hal.view.HALPage;

public class HALApplication {
	
	private static SmartHome smartHome;
	private static String filename = "data/activity.log";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize HAL package and prepare resource helper
        HalPackage.eINSTANCE.eClass();
        ResourceHelper.INSTANCE.addResourceFactory("Smart home", new HalResourceFactoryImpl());
		
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
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty smart home
			smartHome = HalFactory.eINSTANCE.createSmartHome();
			smartHome.setHomeName("My Smart Home");
			// create sensors
			temperatureSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			temperatureSensor.setTypeName("Temperature Sensor");
			movementSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			movementSensor.setTypeName("Movement Sensor");
			lightSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			lightSensor.setTypeName("Light Sensor");
			// create actuators
			heater = HalFactory.eINSTANCE.createActuatorDeviceType();
			heater.setTypeName("Heater");
			lock = HalFactory.eINSTANCE.createActuatorDeviceType();
			lock.setTypeName("Lock");
			lightSwitch = HalFactory.eINSTANCE.createActuatorDeviceType();
			lightSwitch.setTypeName("Light Switch");
		}
		return smartHome;
	}

}
