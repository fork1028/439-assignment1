/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.SensorDevice;
import ca.mcgill.emf.examples.hal.SensorDeviceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceImpl#getSensordevicetype <em>Sensordevicetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDeviceImpl extends MinimalEObjectImpl.Container implements SensorDevice {
	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensordevicetype() <em>Sensordevicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevicetype()
	 * @generated
	 * @ordered
	 */
	protected SensorDeviceType sensordevicetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDeviceType getSensordevicetype() {
		if (sensordevicetype != null && sensordevicetype.eIsProxy()) {
			InternalEObject oldSensordevicetype = (InternalEObject)sensordevicetype;
			sensordevicetype = (SensorDeviceType)eResolveProxy(oldSensordevicetype);
			if (sensordevicetype != oldSensordevicetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, oldSensordevicetype, sensordevicetype));
			}
		}
		return sensordevicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDeviceType basicGetSensordevicetype() {
		return sensordevicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensordevicetype(SensorDeviceType newSensordevicetype, NotificationChain msgs) {
		SensorDeviceType oldSensordevicetype = sensordevicetype;
		sensordevicetype = newSensordevicetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, oldSensordevicetype, newSensordevicetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensordevicetype(SensorDeviceType newSensordevicetype) {
		if (newSensordevicetype != sensordevicetype) {
			NotificationChain msgs = null;
			if (sensordevicetype != null)
				msgs = ((InternalEObject)sensordevicetype).eInverseRemove(this, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, SensorDeviceType.class, msgs);
			if (newSensordevicetype != null)
				msgs = ((InternalEObject)newSensordevicetype).eInverseAdd(this, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, SensorDeviceType.class, msgs);
			msgs = basicSetSensordevicetype(newSensordevicetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, newSensordevicetype, newSensordevicetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				if (sensordevicetype != null)
					msgs = ((InternalEObject)sensordevicetype).eInverseRemove(this, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE, SensorDeviceType.class, msgs);
				return basicSetSensordevicetype((SensorDeviceType)otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return basicSetSensordevicetype(null, msgs);
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
			case HalPackage.SENSOR_DEVICE__DEVICE_NAME:
				return getDeviceName();
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				if (resolve) return getSensordevicetype();
				return basicGetSensordevicetype();
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
			case HalPackage.SENSOR_DEVICE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				setSensordevicetype((SensorDeviceType)newValue);
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
			case HalPackage.SENSOR_DEVICE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				setSensordevicetype((SensorDeviceType)null);
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
			case HalPackage.SENSOR_DEVICE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return sensordevicetype != null;
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
		result.append(" (deviceName: ");
		result.append(deviceName);
		result.append(')');
		return result.toString();
	}

} //SensorDeviceImpl
