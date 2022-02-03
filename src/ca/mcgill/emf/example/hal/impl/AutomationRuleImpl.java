/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.Action;
import ca.mcgill.emf.example.hal.AutomationRule;
import ca.mcgill.emf.example.hal.HalPackage;
import ca.mcgill.emf.example.hal.Precondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.AutomationRuleImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.AutomationRuleImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.AutomationRuleImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomationRuleImpl extends MinimalEObjectImpl.Container implements AutomationRule {
	/**
	 * The default value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected String ruleId = RULE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Precondition precondition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.AUTOMATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(String newRuleId) {
		String oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__RULE_ID, oldRuleId, ruleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition getPrecondition() {
		if (precondition != null && precondition.eIsProxy()) {
			InternalEObject oldPrecondition = (InternalEObject)precondition;
			precondition = (Precondition)eResolveProxy(oldPrecondition);
			if (precondition != oldPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.AUTOMATION_RULE__PRECONDITION, oldPrecondition, precondition));
			}
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition basicGetPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Precondition newPrecondition, NotificationChain msgs) {
		Precondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Precondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, HalPackage.PRECONDITION__AUTOMATIONRULE, Precondition.class, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, HalPackage.PRECONDITION__AUTOMATIONRULE, Precondition.class, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.AUTOMATION_RULE__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, HalPackage.ACTION__AUTOMATIONRULE, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, HalPackage.ACTION__AUTOMATIONRULE, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				if (precondition != null)
					msgs = ((InternalEObject)precondition).eInverseRemove(this, HalPackage.PRECONDITION__AUTOMATIONRULE, Precondition.class, msgs);
				return basicSetPrecondition((Precondition)otherEnd, msgs);
			case HalPackage.AUTOMATION_RULE__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, HalPackage.ACTION__AUTOMATIONRULE, Action.class, msgs);
				return basicSetAction((Action)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case HalPackage.AUTOMATION_RULE__ACTION:
				return basicSetAction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__RULE_ID:
				return getRuleId();
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				if (resolve) return getPrecondition();
				return basicGetPrecondition();
			case HalPackage.AUTOMATION_RULE__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__RULE_ID:
				setRuleId((String)newValue);
				return;
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				setPrecondition((Precondition)newValue);
				return;
			case HalPackage.AUTOMATION_RULE__ACTION:
				setAction((Action)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__RULE_ID:
				setRuleId(RULE_ID_EDEFAULT);
				return;
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				setPrecondition((Precondition)null);
				return;
			case HalPackage.AUTOMATION_RULE__ACTION:
				setAction((Action)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__RULE_ID:
				return RULE_ID_EDEFAULT == null ? ruleId != null : !RULE_ID_EDEFAULT.equals(ruleId);
			case HalPackage.AUTOMATION_RULE__PRECONDITION:
				return precondition != null;
			case HalPackage.AUTOMATION_RULE__ACTION:
				return action != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ruleId: ");
		result.append(ruleId);
		result.append(')');
		return result.toString();
	}

} //AutomationRuleImpl
