/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.HalPackage;

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
	 * The cached value of the '{@link #getActuatordevice() <em>Actuatordevice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatordevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorDevice> actuatordevice;

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
	public EList<ActuatorDevice> getActuatordevice() {
		if (actuatordevice == null) {
			actuatordevice = new EObjectWithInverseResolvingEList<ActuatorDevice>(ActuatorDevice.class, this, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE);
		}
		return actuatordevice;
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActuatordevice()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getActuatordevice()).basicRemove(otherEnd, msgs);
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
				return getActuatordevice();
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATOR_TYPE_NAME:
				setActuatorTypeName((String)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				getActuatordevice().clear();
				getActuatordevice().addAll((Collection<? extends ActuatorDevice>)newValue);
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
				getActuatordevice().clear();
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
				return actuatordevice != null && !actuatordevice.isEmpty();
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
