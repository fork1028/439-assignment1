/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.Action;
import ca.mcgill.emf.example.hal.ActivityLog;
import ca.mcgill.emf.example.hal.ActuatorDevice;
import ca.mcgill.emf.example.hal.ActuatorDeviceType;
import ca.mcgill.emf.example.hal.AutomationRule;
import ca.mcgill.emf.example.hal.ControlCommand;
import ca.mcgill.emf.example.hal.HalFactory;
import ca.mcgill.emf.example.hal.HalPackage;
import ca.mcgill.emf.example.hal.Precondition;
import ca.mcgill.emf.example.hal.Room;
import ca.mcgill.emf.example.hal.SensorDevice;
import ca.mcgill.emf.example.hal.SensorDeviceType;
import ca.mcgill.emf.example.hal.SensorReading;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalPackageImpl extends EPackageImpl implements HalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDeviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorDeviceTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.mcgill.emf.example.hal.HalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HalPackageImpl() {
		super(eNS_URI, HalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HalPackage init() {
		if (isInited) return (HalPackage)EPackage.Registry.INSTANCE.getEPackage(HalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HalPackageImpl theHalPackage = registeredHalPackage instanceof HalPackageImpl ? (HalPackageImpl)registeredHalPackage : new HalPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHalPackage.createPackageContents();

		// Initialize created meta-data
		theHalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HalPackage.eNS_URI, theHalPackage);
		return theHalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomationRule() {
		return automationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_RuleId() {
		return (EAttribute)automationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomationRule_Precondition() {
		return (EReference)automationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomationRule_Action() {
		return (EReference)automationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecondition() {
		return preconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecondition_PreconditionId() {
		return (EAttribute)preconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecondition_ConstraintValue() {
		return (EAttribute)preconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecondition_Automationrule() {
		return (EReference)preconditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecondition_Sensordevice() {
		return (EReference)preconditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ActionId() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Controlcommand() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Automationrule() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLog() {
		return activityLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLog_LogId() {
		return (EAttribute)activityLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLog_Sensorreading() {
		return (EReference)activityLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLog_Controlcommand() {
		return (EReference)activityLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorReading() {
		return sensorReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorReading_ReadingValue() {
		return (EAttribute)sensorReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorReading_SensorTimestamp() {
		return (EAttribute)sensorReadingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorReading_Activitylog() {
		return (EReference)sensorReadingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorReading_Sensordevice() {
		return (EReference)sensorReadingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCommand() {
		return controlCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlCommand_CommandId() {
		return (EAttribute)controlCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlCommand_ControlTimestamp() {
		return (EAttribute)controlCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCommand_Actuatordevice() {
		return (EReference)controlCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCommand_Activitylog() {
		return (EReference)controlCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCommand_Action() {
		return (EReference)controlCommandEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorDevice() {
		return sensorDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorDevice_DeviceName() {
		return (EAttribute)sensorDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDevice_Precondition() {
		return (EReference)sensorDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDevice_Room() {
		return (EReference)sensorDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDevice_Sensorreading() {
		return (EReference)sensorDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDevice_Sensordevicetype() {
		return (EReference)sensorDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomId() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomName() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Sensordevice() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Actuatordevice() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorDevice() {
		return actuatorDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorDevice_DeviceName() {
		return (EAttribute)actuatorDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorDevice_Room() {
		return (EReference)actuatorDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorDevice_Controlcommand() {
		return (EReference)actuatorDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorDevice_Actuatordevicetype() {
		return (EReference)actuatorDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorDeviceType() {
		return sensorDeviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorDeviceType_SensorTypeName() {
		return (EAttribute)sensorDeviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDeviceType_Sensordevice() {
		return (EReference)sensorDeviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorDeviceType() {
		return actuatorDeviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorDeviceType_ActuatorTypeName() {
		return (EAttribute)actuatorDeviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorDeviceType_Actuatordevice() {
		return (EReference)actuatorDeviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalFactory getHalFactory() {
		return (HalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		automationRuleEClass = createEClass(AUTOMATION_RULE);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__RULE_ID);
		createEReference(automationRuleEClass, AUTOMATION_RULE__PRECONDITION);
		createEReference(automationRuleEClass, AUTOMATION_RULE__ACTION);

		preconditionEClass = createEClass(PRECONDITION);
		createEAttribute(preconditionEClass, PRECONDITION__PRECONDITION_ID);
		createEAttribute(preconditionEClass, PRECONDITION__CONSTRAINT_VALUE);
		createEReference(preconditionEClass, PRECONDITION__AUTOMATIONRULE);
		createEReference(preconditionEClass, PRECONDITION__SENSORDEVICE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_ID);
		createEReference(actionEClass, ACTION__CONTROLCOMMAND);
		createEReference(actionEClass, ACTION__AUTOMATIONRULE);

		activityLogEClass = createEClass(ACTIVITY_LOG);
		createEAttribute(activityLogEClass, ACTIVITY_LOG__LOG_ID);
		createEReference(activityLogEClass, ACTIVITY_LOG__SENSORREADING);
		createEReference(activityLogEClass, ACTIVITY_LOG__CONTROLCOMMAND);

		sensorReadingEClass = createEClass(SENSOR_READING);
		createEAttribute(sensorReadingEClass, SENSOR_READING__READING_VALUE);
		createEAttribute(sensorReadingEClass, SENSOR_READING__SENSOR_TIMESTAMP);
		createEReference(sensorReadingEClass, SENSOR_READING__ACTIVITYLOG);
		createEReference(sensorReadingEClass, SENSOR_READING__SENSORDEVICE);

		controlCommandEClass = createEClass(CONTROL_COMMAND);
		createEAttribute(controlCommandEClass, CONTROL_COMMAND__COMMAND_ID);
		createEAttribute(controlCommandEClass, CONTROL_COMMAND__CONTROL_TIMESTAMP);
		createEReference(controlCommandEClass, CONTROL_COMMAND__ACTUATORDEVICE);
		createEReference(controlCommandEClass, CONTROL_COMMAND__ACTIVITYLOG);
		createEReference(controlCommandEClass, CONTROL_COMMAND__ACTION);

		sensorDeviceEClass = createEClass(SENSOR_DEVICE);
		createEAttribute(sensorDeviceEClass, SENSOR_DEVICE__DEVICE_NAME);
		createEReference(sensorDeviceEClass, SENSOR_DEVICE__PRECONDITION);
		createEReference(sensorDeviceEClass, SENSOR_DEVICE__ROOM);
		createEReference(sensorDeviceEClass, SENSOR_DEVICE__SENSORREADING);
		createEReference(sensorDeviceEClass, SENSOR_DEVICE__SENSORDEVICETYPE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_ID);
		createEAttribute(roomEClass, ROOM__ROOM_NAME);
		createEReference(roomEClass, ROOM__SENSORDEVICE);
		createEReference(roomEClass, ROOM__ACTUATORDEVICE);

		actuatorDeviceEClass = createEClass(ACTUATOR_DEVICE);
		createEAttribute(actuatorDeviceEClass, ACTUATOR_DEVICE__DEVICE_NAME);
		createEReference(actuatorDeviceEClass, ACTUATOR_DEVICE__ROOM);
		createEReference(actuatorDeviceEClass, ACTUATOR_DEVICE__CONTROLCOMMAND);
		createEReference(actuatorDeviceEClass, ACTUATOR_DEVICE__ACTUATORDEVICETYPE);

		sensorDeviceTypeEClass = createEClass(SENSOR_DEVICE_TYPE);
		createEAttribute(sensorDeviceTypeEClass, SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME);
		createEReference(sensorDeviceTypeEClass, SENSOR_DEVICE_TYPE__SENSORDEVICE);

		actuatorDeviceTypeEClass = createEClass(ACTUATOR_DEVICE_TYPE);
		createEAttribute(actuatorDeviceTypeEClass, ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME);
		createEReference(actuatorDeviceTypeEClass, ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(automationRuleEClass, AutomationRule.class, "AutomationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomationRule_RuleId(), ecorePackage.getEString(), "ruleId", null, 0, 1, AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Precondition(), this.getPrecondition(), this.getPrecondition_Automationrule(), "precondition", null, 1, 1, AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Action(), this.getAction(), this.getAction_Automationrule(), "action", null, 1, 1, AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecondition_PreconditionId(), ecorePackage.getEString(), "preconditionId", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecondition_ConstraintValue(), ecorePackage.getEString(), "constraintValue", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecondition_Automationrule(), this.getAutomationRule(), this.getAutomationRule_Precondition(), "automationrule", null, 1, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecondition_Sensordevice(), this.getSensorDevice(), this.getSensorDevice_Precondition(), "sensordevice", null, 0, -1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionId(), ecorePackage.getEString(), "actionId", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Controlcommand(), this.getControlCommand(), this.getControlCommand_Action(), "controlcommand", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Automationrule(), this.getAutomationRule(), this.getAutomationRule_Action(), "automationrule", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLogEClass, ActivityLog.class, "ActivityLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityLog_LogId(), ecorePackage.getEString(), "logId", null, 0, 1, ActivityLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityLog_Sensorreading(), this.getSensorReading(), this.getSensorReading_Activitylog(), "sensorreading", null, 0, -1, ActivityLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityLog_Controlcommand(), this.getControlCommand(), this.getControlCommand_Activitylog(), "controlcommand", null, 0, -1, ActivityLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorReadingEClass, SensorReading.class, "SensorReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorReading_ReadingValue(), ecorePackage.getEString(), "readingValue", null, 0, 1, SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorReading_SensorTimestamp(), ecorePackage.getEString(), "sensorTimestamp", null, 0, 1, SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorReading_Activitylog(), this.getActivityLog(), this.getActivityLog_Sensorreading(), "activitylog", null, 1, 1, SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorReading_Sensordevice(), this.getSensorDevice(), this.getSensorDevice_Sensorreading(), "sensordevice", null, 1, 1, SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlCommandEClass, ControlCommand.class, "ControlCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlCommand_CommandId(), ecorePackage.getEString(), "commandId", null, 0, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlCommand_ControlTimestamp(), ecorePackage.getEString(), "controlTimestamp", null, 0, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCommand_Actuatordevice(), this.getActuatorDevice(), this.getActuatorDevice_Controlcommand(), "actuatordevice", null, 1, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCommand_Activitylog(), this.getActivityLog(), this.getActivityLog_Controlcommand(), "activitylog", null, 1, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCommand_Action(), this.getAction(), this.getAction_Controlcommand(), "action", null, 1, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDeviceEClass, SensorDevice.class, "SensorDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, SensorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDevice_Precondition(), this.getPrecondition(), this.getPrecondition_Sensordevice(), "precondition", null, 1, 1, SensorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDevice_Room(), this.getRoom(), this.getRoom_Sensordevice(), "room", null, 1, 1, SensorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDevice_Sensorreading(), this.getSensorReading(), this.getSensorReading_Sensordevice(), "sensorreading", null, 0, -1, SensorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDevice_Sensordevicetype(), this.getSensorDeviceType(), this.getSensorDeviceType_Sensordevice(), "sensordevicetype", null, 0, -1, SensorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomId(), ecorePackage.getEString(), "roomId", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_RoomName(), ecorePackage.getEString(), "roomName", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Sensordevice(), this.getSensorDevice(), this.getSensorDevice_Room(), "sensordevice", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Actuatordevice(), this.getActuatorDevice(), this.getActuatorDevice_Room(), "actuatordevice", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorDeviceEClass, ActuatorDevice.class, "ActuatorDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatorDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, ActuatorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuatorDevice_Room(), this.getRoom(), this.getRoom_Actuatordevice(), "room", null, 1, 1, ActuatorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuatorDevice_Controlcommand(), this.getControlCommand(), this.getControlCommand_Actuatordevice(), "controlcommand", null, 0, -1, ActuatorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuatorDevice_Actuatordevicetype(), this.getActuatorDeviceType(), this.getActuatorDeviceType_Actuatordevice(), "actuatordevicetype", null, 0, -1, ActuatorDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDeviceTypeEClass, SensorDeviceType.class, "SensorDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorDeviceType_SensorTypeName(), ecorePackage.getEString(), "sensorTypeName", null, 0, 1, SensorDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDeviceType_Sensordevice(), this.getSensorDevice(), this.getSensorDevice_Sensordevicetype(), "sensordevice", null, 1, 1, SensorDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorDeviceTypeEClass, ActuatorDeviceType.class, "ActuatorDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatorDeviceType_ActuatorTypeName(), ecorePackage.getEString(), "actuatorTypeName", null, 0, 1, ActuatorDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuatorDeviceType_Actuatordevice(), this.getActuatorDevice(), this.getActuatorDevice_Actuatordevicetype(), "actuatordevice", null, 1, 1, ActuatorDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HalPackageImpl
