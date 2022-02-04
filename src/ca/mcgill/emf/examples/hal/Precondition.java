/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Precondition#getPreconditionId <em>Precondition Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Precondition#getConstraintValue <em>Constraint Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Precondition#getAutomationrule <em>Automationrule</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Precondition#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Precondition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition Id</em>' attribute.
	 * @see #setPreconditionId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPrecondition_PreconditionId()
	 * @model
	 * @generated
	 */
	String getPreconditionId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Precondition#getPreconditionId <em>Precondition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition Id</em>' attribute.
	 * @see #getPreconditionId()
	 * @generated
	 */
	void setPreconditionId(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Value</em>' attribute.
	 * @see #setConstraintValue(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPrecondition_ConstraintValue()
	 * @model
	 * @generated
	 */
	String getConstraintValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Precondition#getConstraintValue <em>Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Value</em>' attribute.
	 * @see #getConstraintValue()
	 * @generated
	 */
	void setConstraintValue(String value);

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' reference.
	 * @see #setAutomationrule(AutomationRule)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPrecondition_Automationrule()
	 * @see ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition
	 * @model opposite="precondition" required="true"
	 * @generated
	 */
	AutomationRule getAutomationrule();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Precondition#getAutomationrule <em>Automationrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automationrule</em>' reference.
	 * @see #getAutomationrule()
	 * @generated
	 */
	void setAutomationrule(AutomationRule value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' reference.
	 * @see #setSensordevice(SensorDeviceType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPrecondition_Sensordevice()
	 * @see ca.mcgill.emf.examples.hal.SensorDeviceType#getPrecondition
	 * @model opposite="precondition"
	 * @generated
	 */
	SensorDeviceType getSensordevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Precondition#getSensordevice <em>Sensordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensordevice</em>' reference.
	 * @see #getSensordevice()
	 * @generated
	 */
	void setSensordevice(SensorDeviceType value);

} // Precondition
