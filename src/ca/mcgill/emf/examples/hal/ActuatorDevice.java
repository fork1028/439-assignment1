/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getControlcommand <em>Controlcommand</em>}</li>
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
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Room#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice_Room()
	 * @see ca.mcgill.emf.examples.hal.Room#getActuatordevice
	 * @model opposite="actuatordevice" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice_Controlcommand()
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice
	 * @model opposite="actuatordevice"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

	/**
	 * Returns the value of the '<em><b>Actuatordevicetype</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorDeviceType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevicetype</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDevice_Actuatordevicetype()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice
	 * @model opposite="actuatordevice"
	 * @generated
	 */
	EList<ActuatorDeviceType> getActuatordevicetype();

} // ActuatorDevice
