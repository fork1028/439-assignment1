/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorTypeName <em>Sensor Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType()
 * @model
 * @generated
 */
public interface SensorDeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type Name</em>' attribute.
	 * @see #setSensorTypeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_SensorTypeName()
	 * @model
	 * @generated
	 */
	String getSensorTypeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorTypeName <em>Sensor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type Name</em>' attribute.
	 * @see #getSensorTypeName()
	 * @generated
	 */
	void setSensorTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorDevice}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_Sensordevice()
	 * @see ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype
	 * @model opposite="sensordevicetype"
	 * @generated
	 */
	EList<SensorDevice> getSensordevice();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Precondition#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference.
	 * @see #setPrecondition(Precondition)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_Precondition()
	 * @see ca.mcgill.emf.examples.hal.Precondition#getSensordevice
	 * @model opposite="sensordevice"
	 * @generated
	 */
	Precondition getPrecondition();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getPrecondition <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);

	/**
	 * Returns the value of the '<em><b>Sensorreading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorReading#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorreading</em>' reference.
	 * @see #setSensorreading(SensorReading)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_Sensorreading()
	 * @see ca.mcgill.emf.examples.hal.SensorReading#getSensordevice
	 * @model opposite="sensordevice"
	 * @generated
	 */
	SensorReading getSensorreading();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorreading <em>Sensorreading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensorreading</em>' reference.
	 * @see #getSensorreading()
	 * @generated
	 */
	void setSensorreading(SensorReading value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Room#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_Room()
	 * @see ca.mcgill.emf.examples.hal.Room#getSensordevice
	 * @model opposite="sensordevice"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // SensorDeviceType
