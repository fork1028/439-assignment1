/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.SensorDevice;
import ca.mcgill.emf.examples.hal.SensorDeviceType;

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
 * An implementation of the model object '<em><b>Sensor Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceTypeImpl#getSensorTypeName <em>Sensor Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceTypeImpl#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDeviceTypeImpl extends MinimalEObjectImpl.Container implements SensorDeviceType {
	/**
	 * The default value of the '{@link #getSensorTypeName() <em>Sensor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorTypeName() <em>Sensor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTypeName()
	 * @generated
	 * @ordered
	 */
	protected String sensorTypeName = SENSOR_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensordevice() <em>Sensordevice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevice()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorDevice> sensordevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorTypeName() {
		return sensorTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorTypeName(String newSensorTypeName) {
		String oldSensorTypeName = sensorTypeName;
		sensorTypeName = newSensorTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME, oldSensorTypeName, sensorTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorDevice> getSensordevice() {
		if (sensordevice == null) {
			sensordevice = new EObjectWithInverseResolvingEList<SensorDevice>(SensorDevice.class, this, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE);
		}
		return sensordevice;
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensordevice()).basicAdd(otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				return ((InternalEList<?>)getSensordevice()).basicRemove(otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				return getSensorTypeName();
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				return getSensordevice();
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				setSensorTypeName((String)newValue);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				getSensordevice().clear();
				getSensordevice().addAll((Collection<? extends SensorDevice>)newValue);
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				setSensorTypeName(SENSOR_TYPE_NAME_EDEFAULT);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				getSensordevice().clear();
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				return SENSOR_TYPE_NAME_EDEFAULT == null ? sensorTypeName != null : !SENSOR_TYPE_NAME_EDEFAULT.equals(sensorTypeName);
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				return sensordevice != null && !sensordevice.isEmpty();
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
		result.append(" (sensorTypeName: ");
		result.append(sensorTypeName);
		result.append(')');
		return result.toString();
	}

} //SensorDeviceTypeImpl
