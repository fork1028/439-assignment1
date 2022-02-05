/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ControlCommand#getCommandId <em>Command Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ControlCommand#getControlTimestamp <em>Control Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice <em>Actuatordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ControlCommand#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ControlCommand#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand()
 * @model
 * @generated
 */
public interface ControlCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Id</em>' attribute.
	 * @see #setCommandId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand_CommandId()
	 * @model
	 * @generated
	 */
	String getCommandId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ControlCommand#getCommandId <em>Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Id</em>' attribute.
	 * @see #getCommandId()
	 * @generated
	 */
	void setCommandId(String value);

	/**
	 * Returns the value of the '<em><b>Control Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Timestamp</em>' attribute.
	 * @see #setControlTimestamp(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand_ControlTimestamp()
	 * @model
	 * @generated
	 */
	String getControlTimestamp();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ControlCommand#getControlTimestamp <em>Control Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Timestamp</em>' attribute.
	 * @see #getControlTimestamp()
	 * @generated
	 */
	void setControlTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Actuatordevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevice</em>' reference.
	 * @see #setActuatordevice(ActuatorDevice)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand_Actuatordevice()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDevice#getControlcommand
	 * @model opposite="controlcommand" required="true"
	 * @generated
	 */
	ActuatorDevice getActuatordevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuatordevice <em>Actuatordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuatordevice</em>' reference.
	 * @see #getActuatordevice()
	 * @generated
	 */
	void setActuatordevice(ActuatorDevice value);

	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActivityLog#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand_Activitylog()
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getControlcommand
	 * @model opposite="controlcommand" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActivitylog <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Action#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getControlCommand_Action()
	 * @see ca.mcgill.emf.examples.hal.Action#getControlcommand
	 * @model opposite="controlcommand" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ControlCommand#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // ControlCommand
