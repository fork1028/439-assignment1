/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getLogId <em>Log Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog()
 * @model
 * @generated
 */
public interface ActivityLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Id</em>' attribute.
	 * @see #setLogId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_LogId()
	 * @model
	 * @generated
	 */
	String getLogId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActivityLog#getLogId <em>Log Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Id</em>' attribute.
	 * @see #getLogId()
	 * @generated
	 */
	void setLogId(String value);

	/**
	 * Returns the value of the '<em><b>Sensorreading</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorReading}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorReading#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorreading</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_Sensorreading()
	 * @see ca.mcgill.emf.examples.hal.SensorReading#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	EList<SensorReading> getSensorreading();

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_Controlcommand()
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

} // ActivityLog
