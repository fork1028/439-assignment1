/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.ActivityLog;
import ca.mcgill.emf.example.hal.HalPackage;
import ca.mcgill.emf.example.hal.SensorDevice;
import ca.mcgill.emf.example.hal.SensorReading;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl#getReadingValue <em>Reading Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl#getSensorTimestamp <em>Sensor Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorReadingImpl#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorReadingImpl extends MinimalEObjectImpl.Container implements SensorReading {
	/**
	 * The default value of the '{@link #getReadingValue() <em>Reading Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingValue()
	 * @generated
	 * @ordered
	 */
	protected static final String READING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadingValue() <em>Reading Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingValue()
	 * @generated
	 * @ordered
	 */
	protected String readingValue = READING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorTimestamp() <em>Sensor Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorTimestamp() <em>Sensor Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String sensorTimestamp = SENSOR_TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivitylog() <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitylog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activitylog;

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
	protected SensorReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReadingValue() {
		return readingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingValue(String newReadingValue) {
		String oldReadingValue = readingValue;
		readingValue = newReadingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__READING_VALUE, oldReadingValue, readingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorTimestamp() {
		return sensorTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorTimestamp(String newSensorTimestamp) {
		String oldSensorTimestamp = sensorTimestamp;
		sensorTimestamp = newSensorTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__SENSOR_TIMESTAMP, oldSensorTimestamp, sensorTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog getActivitylog() {
		if (activitylog != null && activitylog.eIsProxy()) {
			InternalEObject oldActivitylog = (InternalEObject)activitylog;
			activitylog = (ActivityLog)eResolveProxy(oldActivitylog);
			if (activitylog != oldActivitylog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_READING__ACTIVITYLOG, oldActivitylog, activitylog));
			}
		}
		return activitylog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog basicGetActivitylog() {
		return activitylog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitylog(ActivityLog newActivitylog, NotificationChain msgs) {
		ActivityLog oldActivitylog = activitylog;
		activitylog = newActivitylog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__ACTIVITYLOG, oldActivitylog, newActivitylog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitylog(ActivityLog newActivitylog) {
		if (newActivitylog != activitylog) {
			NotificationChain msgs = null;
			if (activitylog != null)
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__SENSORREADING, ActivityLog.class, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, HalPackage.ACTIVITY_LOG__SENSORREADING, ActivityLog.class, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__ACTIVITYLOG, newActivitylog, newActivitylog));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_READING__SENSORDEVICE, oldSensordevice, sensordevice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__SENSORDEVICE, oldSensordevice, newSensordevice);
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
				msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE__SENSORREADING, SensorDevice.class, msgs);
			if (newSensordevice != null)
				msgs = ((InternalEObject)newSensordevice).eInverseAdd(this, HalPackage.SENSOR_DEVICE__SENSORREADING, SensorDevice.class, msgs);
			msgs = basicSetSensordevice(newSensordevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__SENSORDEVICE, newSensordevice, newSensordevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				if (activitylog != null)
					msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__SENSORREADING, ActivityLog.class, msgs);
				return basicSetActivitylog((ActivityLog)otherEnd, msgs);
			case HalPackage.SENSOR_READING__SENSORDEVICE:
				if (sensordevice != null)
					msgs = ((InternalEObject)sensordevice).eInverseRemove(this, HalPackage.SENSOR_DEVICE__SENSORREADING, SensorDevice.class, msgs);
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
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
			case HalPackage.SENSOR_READING__SENSORDEVICE:
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
			case HalPackage.SENSOR_READING__READING_VALUE:
				return getReadingValue();
			case HalPackage.SENSOR_READING__SENSOR_TIMESTAMP:
				return getSensorTimestamp();
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				if (resolve) return getActivitylog();
				return basicGetActivitylog();
			case HalPackage.SENSOR_READING__SENSORDEVICE:
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
			case HalPackage.SENSOR_READING__READING_VALUE:
				setReadingValue((String)newValue);
				return;
			case HalPackage.SENSOR_READING__SENSOR_TIMESTAMP:
				setSensorTimestamp((String)newValue);
				return;
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
				return;
			case HalPackage.SENSOR_READING__SENSORDEVICE:
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
			case HalPackage.SENSOR_READING__READING_VALUE:
				setReadingValue(READING_VALUE_EDEFAULT);
				return;
			case HalPackage.SENSOR_READING__SENSOR_TIMESTAMP:
				setSensorTimestamp(SENSOR_TIMESTAMP_EDEFAULT);
				return;
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
				return;
			case HalPackage.SENSOR_READING__SENSORDEVICE:
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
			case HalPackage.SENSOR_READING__READING_VALUE:
				return READING_VALUE_EDEFAULT == null ? readingValue != null : !READING_VALUE_EDEFAULT.equals(readingValue);
			case HalPackage.SENSOR_READING__SENSOR_TIMESTAMP:
				return SENSOR_TIMESTAMP_EDEFAULT == null ? sensorTimestamp != null : !SENSOR_TIMESTAMP_EDEFAULT.equals(sensorTimestamp);
			case HalPackage.SENSOR_READING__ACTIVITYLOG:
				return activitylog != null;
			case HalPackage.SENSOR_READING__SENSORDEVICE:
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
		result.append(" (readingValue: ");
		result.append(readingValue);
		result.append(", sensorTimestamp: ");
		result.append(sensorTimestamp);
		result.append(')');
		return result.toString();
	}

} //SensorReadingImpl
