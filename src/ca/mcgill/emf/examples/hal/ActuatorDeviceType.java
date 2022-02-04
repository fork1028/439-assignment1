/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatorTypeName <em>Actuator Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType()
 * @model
 * @generated
 */
public interface ActuatorDeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuator Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Type Name</em>' attribute.
	 * @see #setActuatorTypeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_ActuatorTypeName()
	 * @model
	 * @generated
	 */
	String getActuatorTypeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatorTypeName <em>Actuator Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Type Name</em>' attribute.
	 * @see #getActuatorTypeName()
	 * @generated
	 */
	void setActuatorTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Actuatordevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorDevice}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype <em>Actuatordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevice</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_Actuatordevice()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype
	 * @model opposite="actuatordevicetype"
	 * @generated
	 */
	EList<ActuatorDevice> getActuatordevice();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Room#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_Room()
	 * @see ca.mcgill.emf.examples.hal.Room#getActuatordevice
	 * @model opposite="actuatordevice"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice <em>Actuatordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference.
	 * @see #setControlcommand(ControlCommand)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_Controlcommand()
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice
	 * @model opposite="actuatordevice"
	 * @generated
	 */
	ControlCommand getControlcommand();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getControlcommand <em>Controlcommand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlcommand</em>' reference.
	 * @see #getControlcommand()
	 * @generated
	 */
	void setControlcommand(ControlCommand value);

} // ActuatorDeviceType
