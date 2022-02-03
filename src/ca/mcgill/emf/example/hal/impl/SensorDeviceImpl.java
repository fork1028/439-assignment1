/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.HalPackage;
import ca.mcgill.emf.example.hal.Precondition;
import ca.mcgill.emf.example.hal.Room;
import ca.mcgill.emf.example.hal.SensorDevice;
import ca.mcgill.emf.example.hal.SensorDeviceType;
import ca.mcgill.emf.example.hal.SensorReading;

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
 * An implementation of the model object '<em><b>Sensor Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.SensorDeviceImpl#getSensordevicetype <em>Sensordevicetype</em>}</li>
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
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Precondition precondition;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getSensorreading() <em>Sensorreading</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorreading()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorReading> sensorreading;

	/**
	 * The cached value of the '{@link #getSensordevicetype() <em>Sensordevicetype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevicetype()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorDeviceType> sensordevicetype;

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
	public Precondition getPrecondition() {
		if (precondition != null && precondition.eIsProxy()) {
			InternalEObject oldPrecondition = (InternalEObject)precondition;
			precondition = (Precondition)eResolveProxy(oldPrecondition);
			if (precondition != oldPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE__PRECONDITION, oldPrecondition, precondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__PRECONDITION, oldPrecondition, newPrecondition);
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
				msgs = ((InternalEObject)precondition).eInverseRemove(this, HalPackage.PRECONDITION__SENSORDEVICE, Precondition.class, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, HalPackage.PRECONDITION__SENSORDEVICE, Precondition.class, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__ROOM, oldRoom, newRoom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != room) {
			NotificationChain msgs = null;
			if (room != null)
				msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__SENSORDEVICE, Room.class, msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, HalPackage.ROOM__SENSORDEVICE, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorReading> getSensorreading() {
		if (sensorreading == null) {
			sensorreading = new EObjectWithInverseResolvingEList<SensorReading>(SensorReading.class, this, HalPackage.SENSOR_DEVICE__SENSORREADING, HalPackage.SENSOR_READING__SENSORDEVICE);
		}
		return sensorreading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorDeviceType> getSensordevicetype() {
		if (sensordevicetype == null) {
			sensordevicetype = new EObjectWithInverseResolvingEList<SensorDeviceType>(SensorDeviceType.class, this, HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE, HalPackage.SENSOR_DEVICE_TYPE__SENSORDEVICE);
		}
		return sensordevicetype;
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
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				if (precondition != null)
					msgs = ((InternalEObject)precondition).eInverseRemove(this, HalPackage.PRECONDITION__SENSORDEVICE, Precondition.class, msgs);
				return basicSetPrecondition((Precondition)otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE__ROOM:
				if (room != null)
					msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__SENSORDEVICE, Room.class, msgs);
				return basicSetRoom((Room)otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensorreading()).basicAdd(otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensordevicetype()).basicAdd(otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case HalPackage.SENSOR_DEVICE__ROOM:
				return basicSetRoom(null, msgs);
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				return ((InternalEList<?>)getSensorreading()).basicRemove(otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return ((InternalEList<?>)getSensordevicetype()).basicRemove(otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				if (resolve) return getPrecondition();
				return basicGetPrecondition();
			case HalPackage.SENSOR_DEVICE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				return getSensorreading();
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return getSensordevicetype();
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
			case HalPackage.SENSOR_DEVICE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				setPrecondition((Precondition)newValue);
				return;
			case HalPackage.SENSOR_DEVICE__ROOM:
				setRoom((Room)newValue);
				return;
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				getSensorreading().clear();
				getSensorreading().addAll((Collection<? extends SensorReading>)newValue);
				return;
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				getSensordevicetype().clear();
				getSensordevicetype().addAll((Collection<? extends SensorDeviceType>)newValue);
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
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				setPrecondition((Precondition)null);
				return;
			case HalPackage.SENSOR_DEVICE__ROOM:
				setRoom((Room)null);
				return;
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				getSensorreading().clear();
				return;
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				getSensordevicetype().clear();
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
			case HalPackage.SENSOR_DEVICE__PRECONDITION:
				return precondition != null;
			case HalPackage.SENSOR_DEVICE__ROOM:
				return room != null;
			case HalPackage.SENSOR_DEVICE__SENSORREADING:
				return sensorreading != null && !sensorreading.isEmpty();
			case HalPackage.SENSOR_DEVICE__SENSORDEVICETYPE:
				return sensordevicetype != null && !sensordevicetype.isEmpty();
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
