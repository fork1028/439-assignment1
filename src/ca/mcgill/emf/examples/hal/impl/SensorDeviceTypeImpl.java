/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Precondition;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SensorDevice;
import ca.mcgill.emf.examples.hal.SensorDeviceType;

import ca.mcgill.emf.examples.hal.SensorReading;
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
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceTypeImpl#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorDeviceTypeImpl#getRoom <em>Room</em>}</li>
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
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Precondition precondition;

	/**
	 * The cached value of the '{@link #getSensorreading() <em>Sensorreading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorreading()
	 * @generated
	 * @ordered
	 */
	protected SensorReading sensorreading;

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
	public Precondition getPrecondition() {
		if (precondition != null && precondition.eIsProxy()) {
			InternalEObject oldPrecondition = (InternalEObject)precondition;
			precondition = (Precondition)eResolveProxy(oldPrecondition);
			if (precondition != oldPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, oldPrecondition, precondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading getSensorreading() {
		if (sensorreading != null && sensorreading.eIsProxy()) {
			InternalEObject oldSensorreading = (InternalEObject)sensorreading;
			sensorreading = (SensorReading)eResolveProxy(oldSensorreading);
			if (sensorreading != oldSensorreading) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING, oldSensorreading, sensorreading));
			}
		}
		return sensorreading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading basicGetSensorreading() {
		return sensorreading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorreading(SensorReading newSensorreading, NotificationChain msgs) {
		SensorReading oldSensorreading = sensorreading;
		sensorreading = newSensorreading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING, oldSensorreading, newSensorreading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorreading(SensorReading newSensorreading) {
		if (newSensorreading != sensorreading) {
			NotificationChain msgs = null;
			if (sensorreading != null)
				msgs = ((InternalEObject)sensorreading).eInverseRemove(this, HalPackage.SENSOR_READING__SENSORDEVICE, SensorReading.class, msgs);
			if (newSensorreading != null)
				msgs = ((InternalEObject)newSensorreading).eInverseAdd(this, HalPackage.SENSOR_READING__SENSORDEVICE, SensorReading.class, msgs);
			msgs = basicSetSensorreading(newSensorreading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING, newSensorreading, newSensorreading));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_DEVICE_TYPE__ROOM, oldRoom, room));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__ROOM, oldRoom, newRoom);
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_DEVICE_TYPE__ROOM, newRoom, newRoom));
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				if (precondition != null)
					msgs = ((InternalEObject)precondition).eInverseRemove(this, HalPackage.PRECONDITION__SENSORDEVICE, Precondition.class, msgs);
				return basicSetPrecondition((Precondition)otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				if (sensorreading != null)
					msgs = ((InternalEObject)sensorreading).eInverseRemove(this, HalPackage.SENSOR_READING__SENSORDEVICE, SensorReading.class, msgs);
				return basicSetSensorreading((SensorReading)otherEnd, msgs);
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				if (room != null)
					msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__SENSORDEVICE, Room.class, msgs);
				return basicSetRoom((Room)otherEnd, msgs);
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				return basicSetSensorreading(null, msgs);
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				return basicSetRoom(null, msgs);
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				if (resolve) return getPrecondition();
				return basicGetPrecondition();
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				if (resolve) return getSensorreading();
				return basicGetSensorreading();
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				setPrecondition((Precondition)newValue);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				setSensorreading((SensorReading)newValue);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				setRoom((Room)newValue);
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				setPrecondition((Precondition)null);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				setSensorreading((SensorReading)null);
				return;
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				setRoom((Room)null);
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
			case HalPackage.SENSOR_DEVICE_TYPE__PRECONDITION:
				return precondition != null;
			case HalPackage.SENSOR_DEVICE_TYPE__SENSORREADING:
				return sensorreading != null;
			case HalPackage.SENSOR_DEVICE_TYPE__ROOM:
				return room != null;
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
