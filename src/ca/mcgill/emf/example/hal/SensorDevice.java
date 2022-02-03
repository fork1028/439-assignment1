/**
 */
package ca.mcgill.emf.example.hal;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ca.mcgill.emf.example.hal.SensorDevice#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorDevice#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorDevice#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorDevice#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice()
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
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorDevice#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.Precondition#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference.
	 * @see #setPrecondition(Precondition)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice_Precondition()
	 * @see ca.mcgill.emf.example.hal.Precondition#getSensordevice
	 * @model opposite="sensordevice" required="true"
	 * @generated
	 */
	Precondition getPrecondition();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorDevice#getPrecondition <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.Room#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice_Room()
	 * @see ca.mcgill.emf.example.hal.Room#getSensordevice
	 * @model opposite="sensordevice" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorDevice#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Sensorreading</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.example.hal.SensorReading}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.SensorReading#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorreading</em>' reference list.
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice_Sensorreading()
	 * @see ca.mcgill.emf.example.hal.SensorReading#getSensordevice
	 * @model opposite="sensordevice"
	 * @generated
	 */
	EList<SensorReading> getSensorreading();

	/**
	 * Returns the value of the '<em><b>Sensordevicetype</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.example.hal.SensorDeviceType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevicetype</em>' reference list.
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorDevice_Sensordevicetype()
	 * @see ca.mcgill.emf.example.hal.SensorDeviceType#getSensordevice
	 * @model opposite="sensordevice"
	 * @generated
	 */
	EList<SensorDeviceType> getSensordevicetype();

} // SensorDevice
