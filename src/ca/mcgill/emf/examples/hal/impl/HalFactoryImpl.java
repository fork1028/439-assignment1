/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalFactoryImpl extends EFactoryImpl implements HalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HalFactory init() {
		try {
			HalFactory theHalFactory = (HalFactory)EPackage.Registry.INSTANCE.getEFactory(HalPackage.eNS_URI);
			if (theHalFactory != null) {
				return theHalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HalPackage.AUTOMATION_RULE: return createAutomationRule();
			case HalPackage.PRECONDITION: return createPrecondition();
			case HalPackage.ACTION: return createAction();
			case HalPackage.ACTIVITY_LOG: return createActivityLog();
			case HalPackage.SENSOR_READING: return createSensorReading();
			case HalPackage.CONTROL_COMMAND: return createControlCommand();
			case HalPackage.SENSOR_DEVICE: return createSensorDevice();
			case HalPackage.ROOM: return createRoom();
			case HalPackage.ACTUATOR_DEVICE: return createActuatorDevice();
			case HalPackage.SENSOR_DEVICE_TYPE: return createSensorDeviceType();
			case HalPackage.ACTUATOR_DEVICE_TYPE: return createActuatorDeviceType();
			case HalPackage.LOGIC_BOOL: return createLogicBool();
			case HalPackage.PRECONDITION_COMPOSITE: return createPreconditionComposite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HalPackage.LOGIC:
				return createLogicFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HalPackage.LOGIC:
				return convertLogicToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule createAutomationRule() {
		AutomationRuleImpl automationRule = new AutomationRuleImpl();
		return automationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog createActivityLog() {
		ActivityLogImpl activityLog = new ActivityLogImpl();
		return activityLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading createSensorReading() {
		SensorReadingImpl sensorReading = new SensorReadingImpl();
		return sensorReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand createControlCommand() {
		ControlCommandImpl controlCommand = new ControlCommandImpl();
		return controlCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDevice createSensorDevice() {
		SensorDeviceImpl sensorDevice = new SensorDeviceImpl();
		return sensorDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDevice createActuatorDevice() {
		ActuatorDeviceImpl actuatorDevice = new ActuatorDeviceImpl();
		return actuatorDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDeviceType createSensorDeviceType() {
		SensorDeviceTypeImpl sensorDeviceType = new SensorDeviceTypeImpl();
		return sensorDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDeviceType createActuatorDeviceType() {
		ActuatorDeviceTypeImpl actuatorDeviceType = new ActuatorDeviceTypeImpl();
		return actuatorDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicBool createLogicBool() {
		LogicBoolImpl logicBool = new LogicBoolImpl();
		return logicBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionComposite createPreconditionComposite() {
		PreconditionCompositeImpl preconditionComposite = new PreconditionCompositeImpl();
		return preconditionComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic createLogicFromString(EDataType eDataType, String initialValue) {
		Logic result = Logic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalPackage getHalPackage() {
		return (HalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HalPackage getPackage() {
		return HalPackage.eINSTANCE;
	}

} //HalFactoryImpl
