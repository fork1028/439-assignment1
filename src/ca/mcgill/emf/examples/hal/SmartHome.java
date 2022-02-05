/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getHomeName <em>Home Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getActuatordevice <em>Actuatordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Home Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Name</em>' attribute.
	 * @see #setHomeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_HomeName()
	 * @model
	 * @generated
	 */
	String getHomeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SmartHome#getHomeName <em>Home Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Name</em>' attribute.
	 * @see #getHomeName()
	 * @generated
	 */
	void setHomeName(String value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Sensordevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorDevice> getSensordevice();

	/**
	 * Returns the value of the '<em><b>Actuatordevice</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevice</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Actuatordevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActuatorDevice> getActuatordevice();

} // SmartHome
