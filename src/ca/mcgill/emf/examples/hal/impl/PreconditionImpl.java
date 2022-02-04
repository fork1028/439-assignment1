/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Precondition;
import ca.mcgill.emf.examples.hal.SensorDeviceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl#getPreconditionId <em>Precondition Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl#getConstraintValue <em>Constraint Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl#getAutomationrule <em>Automationrule</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition {
	/**
	 * The default value of the '{@link #getPreconditionId() <em>Precondition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditionId() <em>Precondition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionId()
	 * @generated
	 * @ordered
	 */
	protected String preconditionId = PRECONDITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintValue() <em>Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintValue() <em>Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintValue()
	 * @generated
	 * @ordered
	 */
	protected String constraintValue = CONSTRAINT_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getSensordevice() <em>Sensordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevice()
	 * @generated
	 * @ordered
	 */
	protected SensorDeviceType sensordevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreconditionId() {
		return preconditionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreconditionId(String newPreconditionId) {
		String oldPreconditionId = preconditionId;
		preconditionId = newPreconditionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__PRECONDITION_ID, oldPreconditionId, preconditionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintValue() {
		return constraintValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintValue(String newConstraintValue) {
		String oldConstraintValue = constraintValue;
		constraintValue = newConstraintValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__CONSTRAINT_VALUE, oldConstraintValue, constraintValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.PRECONDITION__AUTOMATIONRULE, oldAutomationrule, automationrule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__AUTOMATIONRULE, oldAutomationrule, newAutomationrule);
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
				msgs = ((InternalEObject)automationrule).eInverseRemove(this, HalPackage.AUTOMATION_RULE__PRECONDITION, AutomationRule.class, msgs);
			if (newAutomationrule != null)
				msgs = ((InternalEObject)newAutomationrule).eInverseAdd(this, HalPackage.AUTOMATION_RULE__PRECONDITION, AutomationRule.class, msgs);
			msgs = basicSetAutomationrule(newAutomationrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__AUTOMATIONRULE, newAutomationrule, newAutomationrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDeviceType getSensordevice() {
		if (sensordevice != null && sensordevice.eIsProxy()) {
			InternalEObject oldSensordevice = (InternalEObject)sensordevice;
			sensordevice = (SensorDeviceType)eResolveProxy(oldSensordevice);
			if (sensordevice != oldSensordevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.PRECONDITION__SENSORDEVICE, oldSensordevice, sensordevice));
			}
		}
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDeviceType basicGetSensordevice() {
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensordevice(SensorDeviceType newSensordevice, NotificationChain msgs) {
		SensorDeviceType oldSensordevice = sensordevice;
		sensordevice = newSensordevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__SENSORDEVICE, oldSensordevice, newSensordevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensordevice(SensorDeviceType newSensordevice) {
		if (newSensordevice != sensordevice) {
			NotificationChain msgs = null;
			if (sensordevice != null)
				msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, SensorDeviceType.class, msgs);
			if (newSensordevice != null)
				msgs = ((InternalEObject)newSensordevice).eInverseAdd(this, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, SensorDeviceType.class, msgs);
			msgs = basicSetSensordevice(newSensordevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.PRECONDITION__SENSORDEVICE, newSensordevice, newSensordevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				if (automationrule != null)
					msgs = ((InternalEObject)automationrule).eInverseRemove(this, HalPackage.AUTOMATION_RULE__PRECONDITION, AutomationRule.class, msgs);
				return basicSetAutomationrule((AutomationRule)otherEnd, msgs);
			case HalPackage.PRECONDITION__SENSORDEVICE:
				if (sensordevice != null)
					msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, SensorDeviceType.class, msgs);
				return basicSetSensordevice((SensorDeviceType)otherEnd, msgs);
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
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				return basicSetAutomationrule(null, msgs);
			case HalPackage.PRECONDITION__SENSORDEVICE:
				return basicSetSensordevice(null, msgs);
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
			case HalPackage.PRECONDITION__PRECONDITION_ID:
				return getPreconditionId();
			case HalPackage.PRECONDITION__CONSTRAINT_VALUE:
				return getConstraintValue();
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				if (resolve) return getAutomationrule();
				return basicGetAutomationrule();
			case HalPackage.PRECONDITION__SENSORDEVICE:
				if (resolve) return getSensordevice();
				return basicGetSensordevice();
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
			case HalPackage.PRECONDITION__PRECONDITION_ID:
				setPreconditionId((String)newValue);
				return;
			case HalPackage.PRECONDITION__CONSTRAINT_VALUE:
				setConstraintValue((String)newValue);
				return;
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				setAutomationrule((AutomationRule)newValue);
				return;
			case HalPackage.PRECONDITION__SENSORDEVICE:
				setSensordevice((SensorDeviceType)newValue);
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
			case HalPackage.PRECONDITION__PRECONDITION_ID:
				setPreconditionId(PRECONDITION_ID_EDEFAULT);
				return;
			case HalPackage.PRECONDITION__CONSTRAINT_VALUE:
				setConstraintValue(CONSTRAINT_VALUE_EDEFAULT);
				return;
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				setAutomationrule((AutomationRule)null);
				return;
			case HalPackage.PRECONDITION__SENSORDEVICE:
				setSensordevice((SensorDeviceType)null);
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
			case HalPackage.PRECONDITION__PRECONDITION_ID:
				return PRECONDITION_ID_EDEFAULT == null ? preconditionId != null : !PRECONDITION_ID_EDEFAULT.equals(preconditionId);
			case HalPackage.PRECONDITION__CONSTRAINT_VALUE:
				return CONSTRAINT_VALUE_EDEFAULT == null ? constraintValue != null : !CONSTRAINT_VALUE_EDEFAULT.equals(constraintValue);
			case HalPackage.PRECONDITION__AUTOMATIONRULE:
				return automationrule != null;
			case HalPackage.PRECONDITION__SENSORDEVICE:
				return sensordevice != null;
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
		result.append(" (preconditionId: ");
		result.append(preconditionId);
		result.append(", constraintValue: ");
		result.append(constraintValue);
		result.append(')');
		return result.toString();
	}

} //PreconditionImpl
