/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getRoomId <em>Room Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getRoomName <em>Room Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getActuatordevice <em>Actuatordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Id</em>' attribute.
	 * @see #setRoomId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_RoomId()
	 * @model
	 * @generated
	 */
	String getRoomId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Room#getRoomId <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Id</em>' attribute.
	 * @see #getRoomId()
	 * @generated
	 */
	void setRoomId(String value);

	/**
	 * Returns the value of the '<em><b>Room Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Name</em>' attribute.
	 * @see #setRoomName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_RoomName()
	 * @model
	 * @generated
	 */
	String getRoomName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Room#getRoomName <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Name</em>' attribute.
	 * @see #getRoomName()
	 * @generated
	 */
	void setRoomName(String value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorDeviceType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Sensordevice()
	 * @see ca.mcgill.emf.examples.hal.SensorDeviceType#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<SensorDeviceType> getSensordevice();

	/**
	 * Returns the value of the '<em><b>Actuatordevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorDeviceType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevice</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Actuatordevice()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDeviceType#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<ActuatorDeviceType> getActuatordevice();

} // Room
