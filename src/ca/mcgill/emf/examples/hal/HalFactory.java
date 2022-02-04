/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalPackage
 * @generated
 */
public interface HalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalFactory eINSTANCE = ca.mcgill.emf.examples.hal.impl.HalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Automation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Rule</em>'.
	 * @generated
	 */
	AutomationRule createAutomationRule();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Activity Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Log</em>'.
	 * @generated
	 */
	ActivityLog createActivityLog();

	/**
	 * Returns a new object of class '<em>Sensor Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Reading</em>'.
	 * @generated
	 */
	SensorReading createSensorReading();

	/**
	 * Returns a new object of class '<em>Control Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Command</em>'.
	 * @generated
	 */
	ControlCommand createControlCommand();

	/**
	 * Returns a new object of class '<em>Sensor Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Device</em>'.
	 * @generated
	 */
	SensorDevice createSensorDevice();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Actuator Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Device</em>'.
	 * @generated
	 */
	ActuatorDevice createActuatorDevice();

	/**
	 * Returns a new object of class '<em>Sensor Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Device Type</em>'.
	 * @generated
	 */
	SensorDeviceType createSensorDeviceType();

	/**
	 * Returns a new object of class '<em>Actuator Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Device Type</em>'.
	 * @generated
	 */
	ActuatorDeviceType createActuatorDeviceType();

	/**
	 * Returns a new object of class '<em>Logic Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Bool</em>'.
	 * @generated
	 */
	LogicBool createLogicBool();

	/**
	 * Returns a new object of class '<em>Precondition Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Composite</em>'.
	 * @generated
	 */
	PreconditionComposite createPreconditionComposite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HalPackage getHalPackage();

} //HalFactory
