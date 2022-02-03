/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.HalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceTypeImpl#getActuatorTypeName <em>Actuator Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceTypeImpl#getActuatordevice <em>Actuatordevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorDeviceTypeImpl extends MinimalEObjectImpl.Container implements ActuatorDeviceType {
	/**
	 * The default value of the '{@link #getActuatorTypeName() <em>Actuator Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUATOR_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActuatorTypeName() <em>Actuator Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorTypeName()
	 * @generated
	 * @ordered
	 */
	protected String actuatorTypeName = ACTUATOR_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuatordevice() <em>Actuatordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatordevice()
	 * @generated
	 * @ordered
	 */
	protected ActuatorDevice actuatordevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActuatorTypeName() {
		return actuatorTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorTypeName(String newActuatorTypeName) {
		String oldActuatorTypeName = actuatorTypeName;
		actuatorTypeName = newActuatorTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME, oldActuatorTypeName, actuatorTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDevice getActuatordevice() {
		if (actuatordevice != null && actuatordevice.eIsProxy()) {
			InternalEObject oldActuatordevice = (InternalEObject)actuatordevice;
			actuatordevice = (ActuatorDevice)eResolveProxy(oldActuatordevice);
			if (actuatordevice != oldActuatordevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, oldActuatordevice, actuatordevice));
			}
		}
		return actuatordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDevice basicGetActuatordevice() {
		return actuatordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatordevice(ActuatorDevice newActuatordevice, NotificationChain msgs) {
		ActuatorDevice oldActuatordevice = actuatordevice;
		actuatordevice = newActuatordevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, oldActuatordevice, newActuatordevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatordevice(ActuatorDevice newActuatordevice) {
		if (newActuatordevice != actuatordevice) {
			NotificationChain msgs = null;
			if (actuatordevice != null)
				msgs = ((InternalEObject)actuatordevice).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, ActuatorDevice.class, msgs);
			if (newActuatordevice != null)
				msgs = ((InternalEObject)newActuatordevice).eInverseAdd(this, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, ActuatorDevice.class, msgs);
			msgs = basicSetActuatordevice(newActuatordevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, newActuatordevice, newActuatordevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				if (actuatordevice != null)
					msgs = ((InternalEObject)actuatordevice).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, ActuatorDevice.class, msgs);
				return basicSetActuatordevice((ActuatorDevice)otherEnd, msgs);
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return basicSetActuatordevice(null, msgs);
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME:
				return getActuatorTypeName();
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				if (resolve) return getActuatordevice();
				return basicGetActuatordevice();
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME:
				setActuatorTypeName((String)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				setActuatordevice((ActuatorDevice)newValue);
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME:
				setActuatorTypeName(ACTUATOR_TYPE_NAME_EDEFAULT);
				return;
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				setActuatordevice((ActuatorDevice)null);
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME:
				return ACTUATOR_TYPE_NAME_EDEFAULT == null ? actuatorTypeName != null : !ACTUATOR_TYPE_NAME_EDEFAULT.equals(actuatorTypeName);
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return actuatordevice != null;
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
		result.append(" (actuatorTypeName: ");
		result.append(actuatorTypeName);
		result.append(')');
		return result.toString();
	}

} //ActuatorDeviceTypeImpl
