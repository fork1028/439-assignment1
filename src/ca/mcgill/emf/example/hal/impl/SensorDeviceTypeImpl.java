/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.HalPackage;
import ca.mcgill.emf.example.hal.SensorDevice;
import ca.mcgill.emf.example.hal.SensorDeviceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl#getSensorTypeName <em>Sensor Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceTypeImpl#getSensordevice <em>Sensordevice</em>}</li>
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
	 * The cached value of the '{@link #getSensordevice() <em>Sensordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevice()
	 * @generated
	 * @ordered
	 */
	protected SensorDevice sensordevice;

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
	public SensorDevice getSensordevice() {
		if (sensordevice != null && sensordevice.eIsProxy()) {
			InternalEObject oldSensordevice = (InternalEObject)sensordevice;
			sensordevice = (SensorDevice)eResolveProxy(oldSensordevice);
			if (sensordevice != oldSensordevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, oldSensordevice, sensordevice));
			}
		}
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDevice basicGetSensordevice() {
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensordevice(SensorDevice newSensordevice, NotificationChain msgs) {
		SensorDevice oldSensordevice = sensordevice;
		sensordevice = newSensordevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, oldSensordevice, newSensordevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensordevice(SensorDevice newSensordevice) {
		if (newSensordevice != sensordevice) {
			NotificationChain msgs = null;
			if (sensordevice != null)
				msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, SensorDevice.class, msgs);
			if (newSensordevice != null)
				msgs = ((InternalEObject)newSensordevice).eInverseAdd(this, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, SensorDevice.class, msgs);
			msgs = basicSetSensordevice(newSensordevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, newSensordevice, newSensordevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				if (sensordevice != null)
					msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, SensorDevice.class, msgs);
				return basicSetSensordevice((SensorDevice)otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				return getSensorTypeName();
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
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
			case HalPackage.SENSOR_DEVICE_TYPE__SENSOR_TYPE_NAME:
				setSensorTypeName((String)newValue);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE:
				setSensordevice((SensorDevice)newValue);
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
				setSensordevice((SensorDevice)null);
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
		result.append(" (sensorTypeName: ");
		result.append(sensorTypeName);
		result.append(')');
		return result.toString();
	}

} //SensorDeviceTypeImpl
