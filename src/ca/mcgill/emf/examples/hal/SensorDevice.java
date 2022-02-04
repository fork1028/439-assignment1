/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDevice#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDevice()
 * @model
 * @generated
 */
public interface SensorDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDevice_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDevice#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Sensordevicetype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevicetype</em>' reference.
	 * @see #setSensordevicetype(SensorDeviceType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDevice_Sensordevicetype()
	 * @see ca.mcgill.emf.examples.hal.SensorDeviceType#getSensordevice
	 * @model opposite="sensordevice" required="true"
	 * @generated
	 */
	SensorDeviceType getSensordevicetype();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensordevicetype</em>' reference.
	 * @see #getSensordevicetype()
	 * @generated
	 */
	void setSensordevicetype(SensorDeviceType value);

} // SensorDevice
