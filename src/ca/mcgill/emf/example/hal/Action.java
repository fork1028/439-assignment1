/**
 */
package ca.mcgill.emf.example.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.Action#getActionId <em>Action Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.Action#getControlcommand <em>Controlcommand</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.Action#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.example.hal.HalPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Id</em>' attribute.
	 * @see #setActionId(String)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getAction_ActionId()
	 * @model
	 * @generated
	 */
	String getActionId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.Action#getActionId <em>Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Id</em>' attribute.
	 * @see #getActionId()
	 * @generated
	 */
	void setActionId(String value);

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.example.hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.ControlCommand#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see ca.mcgill.emf.example.hal.HalPackage#getAction_Controlcommand()
	 * @see ca.mcgill.emf.example.hal.ControlCommand#getAction
	 * @model opposite="action"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.AutomationRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' reference.
	 * @see #setAutomationrule(AutomationRule)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getAction_Automationrule()
	 * @see ca.mcgill.emf.example.hal.AutomationRule#getAction
	 * @model opposite="action" required="true"
	 * @generated
	 */
	AutomationRule getAutomationrule();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.Action#getAutomationrule <em>Automationrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automationrule</em>' reference.
	 * @see #getAutomationrule()
	 * @generated
	 */
	void setAutomationrule(AutomationRule value);

} // Action
