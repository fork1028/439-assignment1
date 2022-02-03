/**
 */
package ca.mcgill.emf.example.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.example.hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mcgill.ca/emf/examples/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = ca.mcgill.emf.example.hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.AutomationRuleImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 0;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__RULE_ID = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.PreconditionImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Precondition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__PRECONDITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Constraint Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__CONSTRAINT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__AUTOMATIONRULE = 2;

	/**
	 * The feature id for the '<em><b>Sensordevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__SENSORDEVICE = 3;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.ActionImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTROLCOMMAND = 1;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AUTOMATIONRULE = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.ActivityLogImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActivityLog()
	 * @generated
	 */
	int ACTIVITY_LOG = 3;

	/**
	 * The feature id for the '<em><b>Log Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__LOG_ID = 0;

	/**
	 * The feature id for the '<em><b>Sensorreading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__SENSORREADING = 1;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__CONTROLCOMMAND = 2;

	/**
	 * The number of structural features of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.SensorReadingImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorReading()
	 * @generated
	 */
	int SENSOR_READING = 4;

	/**
	 * The feature id for the '<em><b>Reading Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__READING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Sensor Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__SENSOR_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__ACTIVITYLOG = 2;

	/**
	 * The feature id for the '<em><b>Sensordevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__SENSORDEVICE = 3;

	/**
	 * The number of structural features of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.ControlCommandImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Command Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__COMMAND_ID = 0;

	/**
	 * The feature id for the '<em><b>Control Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__CONTROL_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Actuatordevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTUATORDEVICE = 2;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTIVITYLOG = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTION = 4;

	/**
	 * The number of structural features of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl <em>Sensor Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.SensorDeviceImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorDevice()
	 * @generated
	 */
	int SENSOR_DEVICE = 6;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__DEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Sensorreading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__SENSORREADING = 3;

	/**
	 * The feature id for the '<em><b>Sensordevicetype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__SENSORDEVICETYPE = 4;

	/**
	 * The number of structural features of the '<em>Sensor Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sensor Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.RoomImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 7;

	/**
	 * The feature id for the '<em><b>Room Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_ID = 0;

	/**
	 * The feature id for the '<em><b>Room Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sensordevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORDEVICE = 2;

	/**
	 * The feature id for the '<em><b>Actuatordevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTUATORDEVICE = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.ActuatorDeviceImpl <em>Actuator Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.ActuatorDeviceImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActuatorDevice()
	 * @generated
	 */
	int ACTUATOR_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE__DEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE__CONTROLCOMMAND = 2;

	/**
	 * The feature id for the '<em><b>Actuatordevicetype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE__ACTUATORDEVICETYPE = 3;

	/**
	 * The number of structural features of the '<em>Actuator Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actuator Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl <em>Sensor Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorDeviceType()
	 * @generated
	 */
	int SENSOR_DEVICE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Sensor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sensordevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_TYPE__SENSORDEVICE = 1;

	/**
	 * The number of structural features of the '<em>Sensor Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sensor Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.example.hal.impl.ActuatorDeviceTypeImpl <em>Actuator Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.example.hal.impl.ActuatorDeviceTypeImpl
	 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActuatorDeviceType()
	 * @generated
	 */
	int ACTUATOR_DEVICE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Actuator Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Actuatordevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE = 1;

	/**
	 * The number of structural features of the '<em>Actuator Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actuator Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_DEVICE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see ca.mcgill.emf.example.hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.AutomationRule#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Id</em>'.
	 * @see ca.mcgill.emf.example.hal.AutomationRule#getRuleId()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_RuleId();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.example.hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Precondition();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.AutomationRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ca.mcgill.emf.example.hal.AutomationRule#getAction()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Action();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.example.hal.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.Precondition#getPreconditionId <em>Precondition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Id</em>'.
	 * @see ca.mcgill.emf.example.hal.Precondition#getPreconditionId()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_PreconditionId();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.Precondition#getConstraintValue <em>Constraint Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Value</em>'.
	 * @see ca.mcgill.emf.example.hal.Precondition#getConstraintValue()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_ConstraintValue();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.Precondition#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Automationrule</em>'.
	 * @see ca.mcgill.emf.example.hal.Precondition#getAutomationrule()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Automationrule();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.Precondition#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.Precondition#getSensordevice()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Sensordevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ca.mcgill.emf.example.hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.Action#getActionId <em>Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Id</em>'.
	 * @see ca.mcgill.emf.example.hal.Action#getActionId()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionId();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.Action#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see ca.mcgill.emf.example.hal.Action#getControlcommand()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Controlcommand();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.Action#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Automationrule</em>'.
	 * @see ca.mcgill.emf.example.hal.Action#getAutomationrule()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Automationrule();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.ActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Log</em>'.
	 * @see ca.mcgill.emf.example.hal.ActivityLog
	 * @generated
	 */
	EClass getActivityLog();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.ActivityLog#getLogId <em>Log Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Id</em>'.
	 * @see ca.mcgill.emf.example.hal.ActivityLog#getLogId()
	 * @see #getActivityLog()
	 * @generated
	 */
	EAttribute getActivityLog_LogId();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.ActivityLog#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensorreading</em>'.
	 * @see ca.mcgill.emf.example.hal.ActivityLog#getSensorreading()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Sensorreading();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.ActivityLog#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see ca.mcgill.emf.example.hal.ActivityLog#getControlcommand()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Controlcommand();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.SensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Reading</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorReading
	 * @generated
	 */
	EClass getSensorReading();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.SensorReading#getReadingValue <em>Reading Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading Value</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorReading#getReadingValue()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_ReadingValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.SensorReading#getSensorTimestamp <em>Sensor Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Timestamp</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorReading#getSensorTimestamp()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_SensorTimestamp();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.SensorReading#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorReading#getActivitylog()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Activitylog();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.SensorReading#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorReading#getSensordevice()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Sensordevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Command</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand
	 * @generated
	 */
	EClass getControlCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.ControlCommand#getCommandId <em>Command Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Id</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getCommandId()
	 * @see #getControlCommand()
	 * @generated
	 */
	EAttribute getControlCommand_CommandId();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.ControlCommand#getControlTimestamp <em>Control Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Timestamp</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getControlTimestamp()
	 * @see #getControlCommand()
	 * @generated
	 */
	EAttribute getControlCommand_ControlTimestamp();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.ControlCommand#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuatordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getActuatordevice()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Actuatordevice();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.ControlCommand#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getActivitylog()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Activitylog();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.ControlCommand#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getAction()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Action();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.SensorDevice <em>Sensor Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Device</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice
	 * @generated
	 */
	EClass getSensorDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.SensorDevice#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getDeviceName()
	 * @see #getSensorDevice()
	 * @generated
	 */
	EAttribute getSensorDevice_DeviceName();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.SensorDevice#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getPrecondition()
	 * @see #getSensorDevice()
	 * @generated
	 */
	EReference getSensorDevice_Precondition();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.SensorDevice#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getRoom()
	 * @see #getSensorDevice()
	 * @generated
	 */
	EReference getSensorDevice_Room();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.SensorDevice#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensorreading</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getSensorreading()
	 * @see #getSensorDevice()
	 * @generated
	 */
	EReference getSensorDevice_Sensorreading();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensordevicetype</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getSensordevicetype()
	 * @see #getSensorDevice()
	 * @generated
	 */
	EReference getSensorDevice_Sensordevicetype();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ca.mcgill.emf.example.hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.Room#getRoomId <em>Room Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Id</em>'.
	 * @see ca.mcgill.emf.example.hal.Room#getRoomId()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomId();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.Room#getRoomName <em>Room Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Name</em>'.
	 * @see ca.mcgill.emf.example.hal.Room#getRoomName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomName();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.Room#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.Room#getSensordevice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Sensordevice();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.Room#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuatordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.Room#getActuatordevice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Actuatordevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.ActuatorDevice <em>Actuator Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Device</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice
	 * @generated
	 */
	EClass getActuatorDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.ActuatorDevice#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice#getDeviceName()
	 * @see #getActuatorDevice()
	 * @generated
	 */
	EAttribute getActuatorDevice_DeviceName();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.ActuatorDevice#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice#getRoom()
	 * @see #getActuatorDevice()
	 * @generated
	 */
	EReference getActuatorDevice_Room();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.ActuatorDevice#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice#getControlcommand()
	 * @see #getActuatorDevice()
	 * @generated
	 */
	EReference getActuatorDevice_Controlcommand();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.example.hal.ActuatorDevice#getActuatordevicetype <em>Actuatordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuatordevicetype</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice#getActuatordevicetype()
	 * @see #getActuatorDevice()
	 * @generated
	 */
	EReference getActuatorDevice_Actuatordevicetype();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.SensorDeviceType <em>Sensor Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Device Type</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDeviceType
	 * @generated
	 */
	EClass getSensorDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.SensorDeviceType#getSensorTypeName <em>Sensor Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Type Name</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDeviceType#getSensorTypeName()
	 * @see #getSensorDeviceType()
	 * @generated
	 */
	EAttribute getSensorDeviceType_SensorTypeName();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.SensorDeviceType#getSensordevice()
	 * @see #getSensorDeviceType()
	 * @generated
	 */
	EReference getSensorDeviceType_Sensordevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.example.hal.ActuatorDeviceType <em>Actuator Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Device Type</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDeviceType
	 * @generated
	 */
	EClass getActuatorDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.example.hal.ActuatorDeviceType#getActuatorTypeName <em>Actuator Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Type Name</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDeviceType#getActuatorTypeName()
	 * @see #getActuatorDeviceType()
	 * @generated
	 */
	EAttribute getActuatorDeviceType_ActuatorTypeName();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.example.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuatordevice</em>'.
	 * @see ca.mcgill.emf.example.hal.ActuatorDeviceType#getActuatordevice()
	 * @see #getActuatorDeviceType()
	 * @generated
	 */
	EReference getActuatorDeviceType_Actuatordevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.AutomationRuleImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__RULE_ID = eINSTANCE.getAutomationRule_RuleId();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTION = eINSTANCE.getAutomationRule_Action();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.PreconditionImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Precondition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__PRECONDITION_ID = eINSTANCE.getPrecondition_PreconditionId();

		/**
		 * The meta object literal for the '<em><b>Constraint Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__CONSTRAINT_VALUE = eINSTANCE.getPrecondition_ConstraintValue();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__AUTOMATIONRULE = eINSTANCE.getPrecondition_Automationrule();

		/**
		 * The meta object literal for the '<em><b>Sensordevice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__SENSORDEVICE = eINSTANCE.getPrecondition_Sensordevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.ActionImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_ID = eINSTANCE.getAction_ActionId();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTROLCOMMAND = eINSTANCE.getAction_Controlcommand();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__AUTOMATIONRULE = eINSTANCE.getAction_Automationrule();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.ActivityLogImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActivityLog()
		 * @generated
		 */
		EClass ACTIVITY_LOG = eINSTANCE.getActivityLog();

		/**
		 * The meta object literal for the '<em><b>Log Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOG__LOG_ID = eINSTANCE.getActivityLog_LogId();

		/**
		 * The meta object literal for the '<em><b>Sensorreading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__SENSORREADING = eINSTANCE.getActivityLog_Sensorreading();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__CONTROLCOMMAND = eINSTANCE.getActivityLog_Controlcommand();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.SensorReadingImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorReading()
		 * @generated
		 */
		EClass SENSOR_READING = eINSTANCE.getSensorReading();

		/**
		 * The meta object literal for the '<em><b>Reading Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__READING_VALUE = eINSTANCE.getSensorReading_ReadingValue();

		/**
		 * The meta object literal for the '<em><b>Sensor Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__SENSOR_TIMESTAMP = eINSTANCE.getSensorReading_SensorTimestamp();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__ACTIVITYLOG = eINSTANCE.getSensorReading_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Sensordevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__SENSORDEVICE = eINSTANCE.getSensorReading_Sensordevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.ControlCommandImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getControlCommand()
		 * @generated
		 */
		EClass CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '<em><b>Command Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_COMMAND__COMMAND_ID = eINSTANCE.getControlCommand_CommandId();

		/**
		 * The meta object literal for the '<em><b>Control Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_COMMAND__CONTROL_TIMESTAMP = eINSTANCE.getControlCommand_ControlTimestamp();

		/**
		 * The meta object literal for the '<em><b>Actuatordevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTUATORDEVICE = eINSTANCE.getControlCommand_Actuatordevice();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTIVITYLOG = eINSTANCE.getControlCommand_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTION = eINSTANCE.getControlCommand_Action();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl <em>Sensor Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.SensorDeviceImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorDevice()
		 * @generated
		 */
		EClass SENSOR_DEVICE = eINSTANCE.getSensorDevice();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DEVICE__DEVICE_NAME = eINSTANCE.getSensorDevice_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DEVICE__PRECONDITION = eINSTANCE.getSensorDevice_Precondition();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DEVICE__ROOM = eINSTANCE.getSensorDevice_Room();

		/**
		 * The meta object literal for the '<em><b>Sensorreading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DEVICE__SENSORREADING = eINSTANCE.getSensorDevice_Sensorreading();

		/**
		 * The meta object literal for the '<em><b>Sensordevicetype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DEVICE__SENSORDEVICETYPE = eINSTANCE.getSensorDevice_Sensordevicetype();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.RoomImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_ID = eINSTANCE.getRoom_RoomId();

		/**
		 * The meta object literal for the '<em><b>Room Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NAME = eINSTANCE.getRoom_RoomName();

		/**
		 * The meta object literal for the '<em><b>Sensordevice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SENSORDEVICE = eINSTANCE.getRoom_Sensordevice();

		/**
		 * The meta object literal for the '<em><b>Actuatordevice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ACTUATORDEVICE = eINSTANCE.getRoom_Actuatordevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.ActuatorDeviceImpl <em>Actuator Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.ActuatorDeviceImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActuatorDevice()
		 * @generated
		 */
		EClass ACTUATOR_DEVICE = eINSTANCE.getActuatorDevice();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_DEVICE__DEVICE_NAME = eINSTANCE.getActuatorDevice_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_DEVICE__ROOM = eINSTANCE.getActuatorDevice_Room();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_DEVICE__CONTROLCOMMAND = eINSTANCE.getActuatorDevice_Controlcommand();

		/**
		 * The meta object literal for the '<em><b>Actuatordevicetype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_DEVICE__ACTUATORDEVICETYPE = eINSTANCE.getActuatorDevice_Actuatordevicetype();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl <em>Sensor Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getSensorDeviceType()
		 * @generated
		 */
		EClass SENSOR_DEVICE_TYPE = eINSTANCE.getSensorDeviceType();

		/**
		 * The meta object literal for the '<em><b>Sensor Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME = eINSTANCE.getSensorDeviceType_SensorTypeName();

		/**
		 * The meta object literal for the '<em><b>Sensordevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DEVICE_TYPE__SENSORDEVICE = eINSTANCE.getSensorDeviceType_Sensordevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.example.hal.impl.ActuatorDeviceTypeImpl <em>Actuator Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.example.hal.impl.ActuatorDeviceTypeImpl
		 * @see ca.mcgill.emf.example.hal.impl.HalPackageImpl#getActuatorDeviceType()
		 * @generated
		 */
		EClass ACTUATOR_DEVICE_TYPE = eINSTANCE.getActuatorDeviceType();

		/**
		 * The meta object literal for the '<em><b>Actuator Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME = eINSTANCE.getActuatorDeviceType_ActuatorTypeName();

		/**
		 * The meta object literal for the '<em><b>Actuatordevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE = eINSTANCE.getActuatorDeviceType_Actuatordevice();

	}

} //HalPackage
