/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype <em>Actuatordevicetype</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice()
 * @model
 * @generated
 */
public interface ActuatorDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Actuatordevicetype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevicetype</em>' reference.
	 * @see #setActuatordevicetype(ActuatorDeviceType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice_Actuatordevicetype()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice
	 * @model opposite="actuatordevice" required="true"
	 * @generated
	 */
	ActuatorDeviceType getActuatordevicetype();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype <em>Actuatordevicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuatordevicetype</em>' reference.
	 * @see #getActuatordevicetype()
	 * @generated
	 */
	void setActuatordevicetype(ActuatorDeviceType value);

} // ActuatorDevice
