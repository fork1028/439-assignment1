/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.Action;
import ca.mcgill.emf.example.hal.AutomationRule;
import ca.mcgill.emf.example.hal.ControlCommand;
import ca.mcgill.emf.example.hal.HalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActionImpl#getActionId <em>Action Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActionImpl#getControlcommand <em>Controlcommand</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActionImpl#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getActionId() <em>Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionId() <em>Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionId()
	 * @generated
	 * @ordered
	 */
	protected String actionId = ACTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlcommand() <em>Controlcommand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlCommand> controlcommand;

	/**
	 * The cached value of the '{@link #getAutomationrule() <em>Automationrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationrule()
	 * @generated
	 * @ordered
	 */
	protected AutomationRule automationrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionId() {
		return actionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionId(String newActionId) {
		String oldActionId = actionId;
		actionId = newActionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__ACTION_ID, oldActionId, actionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlCommand> getControlcommand() {
		if (controlcommand == null) {
			controlcommand = new EObjectWithInverseResolvingEList<ControlCommand>(ControlCommand.class, this, HalPackage.ACTION__CONTROLCOMMAND, HalPackage.CONTROL_COMMAND__ACTION);
		}
		return controlcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule getAutomationrule() {
		if (automationrule != null && automationrule.eIsProxy()) {
			InternalEObject oldAutomationrule = (InternalEObject)automationrule;
			automationrule = (AutomationRule)eResolveProxy(oldAutomationrule);
			if (automationrule != oldAutomationrule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTION__AUTOMATIONRULE, oldAutomationrule, automationrule));
			}
		}
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule basicGetAutomationrule() {
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomationrule(AutomationRule newAutomationrule, NotificationChain msgs) {
		AutomationRule oldAutomationrule = automationrule;
		automationrule = newAutomationrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__AUTOMATIONRULE, oldAutomationrule, newAutomationrule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomationrule(AutomationRule newAutomationrule) {
		if (newAutomationrule != automationrule) {
			NotificationChain msgs = null;
			if (automationrule != null)
				msgs = ((InternalEObject)automationrule).eInverseRemove(this, HalPackage.AUTOMATION_RULE__ACTION, AutomationRule.class, msgs);
			if (newAutomationrule != null)
				msgs = ((InternalEObject)newAutomationrule).eInverseAdd(this, HalPackage.AUTOMATION_RULE__ACTION, AutomationRule.class, msgs);
			msgs = basicSetAutomationrule(newAutomationrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__AUTOMATIONRULE, newAutomationrule, newAutomationrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ACTION__CONTROLCOMMAND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlcommand()).basicAdd(otherEnd, msgs);
			case HalPackage.ACTION__AUTOMATIONRULE:
				if (automationrule != null)
					msgs = ((InternalEObject)automationrule).eInverseRemove(this, HalPackage.AUTOMATION_RULE__ACTION, AutomationRule.class, msgs);
				return basicSetAutomationrule((AutomationRule)otherEnd, msgs);
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
			case HalPackage.ACTION__CONTROLCOMMAND:
				return ((InternalEList<?>)getControlcommand()).basicRemove(otherEnd, msgs);
			case HalPackage.ACTION__AUTOMATIONRULE:
				return basicSetAutomationrule(null, msgs);
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
			case HalPackage.ACTION__ACTION_ID:
				return getActionId();
			case HalPackage.ACTION__CONTROLCOMMAND:
				return getControlcommand();
			case HalPackage.ACTION__AUTOMATIONRULE:
				if (resolve) return getAutomationrule();
				return basicGetAutomationrule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.ACTION__ACTION_ID:
				setActionId((String)newValue);
				return;
			case HalPackage.ACTION__CONTROLCOMMAND:
				getControlcommand().clear();
				getControlcommand().addAll((Collection<? extends ControlCommand>)newValue);
				return;
			case HalPackage.ACTION__AUTOMATIONRULE:
				setAutomationrule((AutomationRule)newValue);
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
			case HalPackage.ACTION__ACTION_ID:
				setActionId(ACTION_ID_EDEFAULT);
				return;
			case HalPackage.ACTION__CONTROLCOMMAND:
				getControlcommand().clear();
				return;
			case HalPackage.ACTION__AUTOMATIONRULE:
				setAutomationrule((AutomationRule)null);
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
			case HalPackage.ACTION__ACTION_ID:
				return ACTION_ID_EDEFAULT == null ? actionId != null : !ACTION_ID_EDEFAULT.equals(actionId);
			case HalPackage.ACTION__CONTROLCOMMAND:
				return controlcommand != null && !controlcommand.isEmpty();
			case HalPackage.ACTION__AUTOMATIONRULE:
				return automationrule != null;
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
		result.append(" (actionId: ");
		result.append(actionId);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
