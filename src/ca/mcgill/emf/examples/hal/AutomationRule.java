/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule()
 * @model
 * @generated
 */
public interface AutomationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' attribute.
	 * @see #setRuleId(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_RuleId()
	 * @model
	 * @generated
	 */
	String getRuleId();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#getRuleId <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' attribute.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Precondition#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference.
	 * @see #setPrecondition(Precondition)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Precondition()
	 * @see ca.mcgill.emf.examples.hal.Precondition#getAutomationrule
	 * @model opposite="automationrule" required="true"
	 * @generated
	 */
	Precondition getPrecondition();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Action#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Action()
	 * @see ca.mcgill.emf.examples.hal.Action#getAutomationrule
	 * @model opposite="automationrule" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // AutomationRule
