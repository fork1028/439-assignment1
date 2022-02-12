package ca.mcgill.emf.examples.hal.application;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
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
	private static String filename = "data/data";

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
			System.out.println("loaded");
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
			smartHome = (SmartHome) resource.getContents().get(0);
			System.out.println(resource.getContents());
		} catch (RuntimeException e) {
			System.out.println("not loaded");
			// model cannot be loaded - create an empty smart home
			smartHome = HalFactory.eINSTANCE.createSmartHome();
			smartHome.setHomeName("My Smart Home");
			// create sensors
			temperatureSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			temperatureSensor.setTypeName("Temperature Sensor");
			ResourceHelper.INSTANCE.saveResource(temperatureSensor, filename);

			smartHome.getDevicetype().add(temperatureSensor);
			movementSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			movementSensor.setTypeName("Movement Sensor");
			ResourceHelper.INSTANCE.saveResource(movementSensor, filename);

			smartHome.getDevicetype().add(movementSensor);

			lightSensor = HalFactory.eINSTANCE.createSensorDeviceType();
			lightSensor.setTypeName("Light Sensor");
			ResourceHelper.INSTANCE.saveResource(lightSensor, filename);

			smartHome.getDevicetype().add(lightSensor);

			// create actuators
			heater = HalFactory.eINSTANCE.createActuatorDeviceType();
			heater.setTypeName("Heater");
			ResourceHelper.INSTANCE.saveResource(heater, filename);

			smartHome.getDevicetype().add(heater);

			lock = HalFactory.eINSTANCE.createActuatorDeviceType();
			lock.setTypeName("Lock");
			ResourceHelper.INSTANCE.saveResource(lock, filename);

			smartHome.getDevicetype().add(lock);

			lightSwitch = HalFactory.eINSTANCE.createActuatorDeviceType();
			lightSwitch.setTypeName("Light Switch");
			ResourceHelper.INSTANCE.saveResource(lightSwitch, filename);

			smartHome.getDevicetype().add(lightSwitch);

		}
		return smartHome;
	}

}
