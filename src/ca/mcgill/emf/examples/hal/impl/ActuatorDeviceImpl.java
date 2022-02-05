/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceImpl#getActuatordevicetype <em>Actuatordevicetype</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceImpl#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorDeviceImpl extends MinimalEObjectImpl.Container implements ActuatorDevice {
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
	 * The cached value of the '{@link #getActuatordevicetype() <em>Actuatordevicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatordevicetype()
	 * @generated
	 * @ordered
	 */
	protected ActuatorDeviceType actuatordevicetype;

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
	 * The cached value of the '{@link #getControlcommand() <em>Controlcommand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlcommand()
	 * @generated
	 * @ordered
	 */
	protected ControlCommand controlcommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR_DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDeviceType getActuatordevicetype() {
		if (actuatordevicetype != null && actuatordevicetype.eIsProxy()) {
			InternalEObject oldActuatordevicetype = (InternalEObject)actuatordevicetype;
			actuatordevicetype = (ActuatorDeviceType)eResolveProxy(oldActuatordevicetype);
			if (actuatordevicetype != oldActuatordevicetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, oldActuatordevicetype, actuatordevicetype));
			}
		}
		return actuatordevicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorDeviceType basicGetActuatordevicetype() {
		return actuatordevicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatordevicetype(ActuatorDeviceType newActuatordevicetype, NotificationChain msgs) {
		ActuatorDeviceType oldActuatordevicetype = actuatordevicetype;
		actuatordevicetype = newActuatordevicetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, oldActuatordevicetype, newActuatordevicetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatordevicetype(ActuatorDeviceType newActuatordevicetype) {
		if (newActuatordevicetype != actuatordevicetype) {
			NotificationChain msgs = null;
			if (actuatordevicetype != null)
				msgs = ((InternalEObject)actuatordevicetype).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, ActuatorDeviceType.class, msgs);
			if (newActuatordevicetype != null)
				msgs = ((InternalEObject)newActuatordevicetype).eInverseAdd(this, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, ActuatorDeviceType.class, msgs);
			msgs = basicSetActuatordevicetype(newActuatordevicetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE, newActuatordevicetype, newActuatordevicetype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR_DEVICE__ROOM, oldRoom, room));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__ROOM, oldRoom, newRoom);
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
				msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__ACTUATORDEVICE, Room.class, msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, HalPackage.ROOM__ACTUATORDEVICE, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand getControlcommand() {
		if (controlcommand != null && controlcommand.eIsProxy()) {
			InternalEObject oldControlcommand = (InternalEObject)controlcommand;
			controlcommand = (ControlCommand)eResolveProxy(oldControlcommand);
			if (controlcommand != oldControlcommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND, oldControlcommand, controlcommand));
			}
		}
		return controlcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand basicGetControlcommand() {
		return controlcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlcommand(ControlCommand newControlcommand, NotificationChain msgs) {
		ControlCommand oldControlcommand = controlcommand;
		controlcommand = newControlcommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND, oldControlcommand, newControlcommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlcommand(ControlCommand newControlcommand) {
		if (newControlcommand != controlcommand) {
			NotificationChain msgs = null;
			if (controlcommand != null)
				msgs = ((InternalEObject)controlcommand).eInverseRemove(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICE, ControlCommand.class, msgs);
			if (newControlcommand != null)
				msgs = ((InternalEObject)newControlcommand).eInverseAdd(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICE, ControlCommand.class, msgs);
			msgs = basicSetControlcommand(newControlcommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND, newControlcommand, newControlcommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				if (actuatordevicetype != null)
					msgs = ((InternalEObject)actuatordevicetype).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE, ActuatorDeviceType.class, msgs);
				return basicSetActuatordevicetype((ActuatorDeviceType)otherEnd, msgs);
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				if (room != null)
					msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__ACTUATORDEVICE, Room.class, msgs);
				return basicSetRoom((Room)otherEnd, msgs);
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				if (controlcommand != null)
					msgs = ((InternalEObject)controlcommand).eInverseRemove(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICE, ControlCommand.class, msgs);
				return basicSetControlcommand((ControlCommand)otherEnd, msgs);
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
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				return basicSetActuatordevicetype(null, msgs);
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				return basicSetRoom(null, msgs);
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				return basicSetControlcommand(null, msgs);
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
			case HalPackage.ACTUATOR_DEVICE__DEVICE_NAME:
				return getDeviceName();
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				if (resolve) return getActuatordevicetype();
				return basicGetActuatordevicetype();
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				if (resolve) return getControlcommand();
				return basicGetControlcommand();
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
			case HalPackage.ACTUATOR_DEVICE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				setActuatordevicetype((ActuatorDeviceType)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				setRoom((Room)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				setControlcommand((ControlCommand)newValue);
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
			case HalPackage.ACTUATOR_DEVICE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				setActuatordevicetype((ActuatorDeviceType)null);
				return;
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				setRoom((Room)null);
				return;
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				setControlcommand((ControlCommand)null);
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
			case HalPackage.ACTUATOR_DEVICE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case HalPackage.ACTUATOR_DEVICE__ACTUATORDEVICETYPE:
				return actuatordevicetype != null;
			case HalPackage.ACTUATOR_DEVICE__ROOM:
				return room != null;
			case HalPackage.ACTUATOR_DEVICE__CONTROLCOMMAND:
				return controlcommand != null;
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

} //ActuatorDeviceImpl
