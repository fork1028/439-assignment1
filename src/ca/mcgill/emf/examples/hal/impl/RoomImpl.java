/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SensorDevice;

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
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getRoomId <em>Room Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getRoomName <em>Room Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.RoomImpl#getActuatordevice <em>Actuatordevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomId() <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomId() <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomId()
	 * @generated
	 * @ordered
	 */
	protected String roomId = ROOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected String roomName = ROOM_NAME_EDEFAULT;

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
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomId() {
		return roomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomId(String newRoomId) {
		String oldRoomId = roomId;
		roomId = newRoomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ROOM__ROOM_ID, oldRoomId, roomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomName(String newRoomName) {
		String oldRoomName = roomName;
		roomName = newRoomName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ROOM__ROOM_NAME, oldRoomName, roomName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorDevice> getSensordevice() {
		if (sensordevice == null) {
			sensordevice = new EObjectWithInverseResolvingEList<SensorDevice>(SensorDevice.class, this, HalPackage.ROOM__SENSORDEVICE, HalPackage.SENSOR_DEVICE__ROOM);
		}
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorDevice> getActuatordevice() {
		if (actuatordevice == null) {
			actuatordevice = new EObjectWithInverseResolvingEList<ActuatorDevice>(ActuatorDevice.class, this, HalPackage.ROOM__ACTUATORDEVICE, HalPackage.ACTUATOR_DEVICE__ROOM);
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
			case HalPackage.ROOM__SENSORDEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensordevice()).basicAdd(otherEnd, msgs);
			case HalPackage.ROOM__ACTUATORDEVICE:
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
			case HalPackage.ROOM__SENSORDEVICE:
				return ((InternalEList<?>)getSensordevice()).basicRemove(otherEnd, msgs);
			case HalPackage.ROOM__ACTUATORDEVICE:
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
			case HalPackage.ROOM__ROOM_ID:
				return getRoomId();
			case HalPackage.ROOM__ROOM_NAME:
				return getRoomName();
			case HalPackage.ROOM__SENSORDEVICE:
				return getSensordevice();
			case HalPackage.ROOM__ACTUATORDEVICE:
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
			case HalPackage.ROOM__ROOM_ID:
				setRoomId((String)newValue);
				return;
			case HalPackage.ROOM__ROOM_NAME:
				setRoomName((String)newValue);
				return;
			case HalPackage.ROOM__SENSORDEVICE:
				getSensordevice().clear();
				getSensordevice().addAll((Collection<? extends SensorDevice>)newValue);
				return;
			case HalPackage.ROOM__ACTUATORDEVICE:
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
			case HalPackage.ROOM__ROOM_ID:
				setRoomId(ROOM_ID_EDEFAULT);
				return;
			case HalPackage.ROOM__ROOM_NAME:
				setRoomName(ROOM_NAME_EDEFAULT);
				return;
			case HalPackage.ROOM__SENSORDEVICE:
				getSensordevice().clear();
				return;
			case HalPackage.ROOM__ACTUATORDEVICE:
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
			case HalPackage.ROOM__ROOM_ID:
				return ROOM_ID_EDEFAULT == null ? roomId != null : !ROOM_ID_EDEFAULT.equals(roomId);
			case HalPackage.ROOM__ROOM_NAME:
				return ROOM_NAME_EDEFAULT == null ? roomName != null : !ROOM_NAME_EDEFAULT.equals(roomName);
			case HalPackage.ROOM__SENSORDEVICE:
				return sensordevice != null && !sensordevice.isEmpty();
			case HalPackage.ROOM__ACTUATORDEVICE:
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
		result.append(" (roomId: ");
		result.append(roomId);
		result.append(", roomName: ");
		result.append(roomName);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
