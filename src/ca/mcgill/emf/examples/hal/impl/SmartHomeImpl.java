/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.DeviceType;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SensorDevice;
import ca.mcgill.emf.examples.hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getHomeName <em>Home Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getActuatordevice <em>Actuatordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getDevicetype <em>Devicetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartHomeImpl extends MinimalEObjectImpl.Container implements SmartHome {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The default value of the '{@link #getHomeName() <em>Home Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeName() <em>Home Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeName()
	 * @generated
	 * @ordered
	 */
	protected String homeName = HOME_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensordevice() <em>Sensordevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevice()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorDevice> sensordevice;

	/**
	 * The cached value of the '{@link #getActuatordevice() <em>Actuatordevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatordevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorDevice> actuatordevice;

	/**
	 * The cached value of the '{@link #getDevicetype() <em>Devicetype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicetype()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> devicetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SMART_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentEList<Room>(Room.class, this, HalPackage.SMART_HOME__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomeName() {
		return homeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeName(String newHomeName) {
		String oldHomeName = homeName;
		homeName = newHomeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__HOME_NAME, oldHomeName, homeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorDevice> getSensordevice() {
		if (sensordevice == null) {
			sensordevice = new EObjectContainmentEList<SensorDevice>(SensorDevice.class, this, HalPackage.SMART_HOME__SENSORDEVICE);
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
			actuatordevice = new EObjectContainmentEList<ActuatorDevice>(ActuatorDevice.class, this, HalPackage.SMART_HOME__ACTUATORDEVICE);
		}
		return actuatordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getDevicetype() {
		if (devicetype == null) {
			devicetype = new EObjectWithInverseResolvingEList<DeviceType>(DeviceType.class, this, HalPackage.SMART_HOME__DEVICETYPE, HalPackage.DEVICE_TYPE__SMARTHOME);
		}
		return devicetype;
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
			case HalPackage.SMART_HOME__DEVICETYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevicetype()).basicAdd(otherEnd, msgs);
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
			case HalPackage.SMART_HOME__ROOM:
				return ((InternalEList<?>)getRoom()).basicRemove(otherEnd, msgs);
			case HalPackage.SMART_HOME__SENSORDEVICE:
				return ((InternalEList<?>)getSensordevice()).basicRemove(otherEnd, msgs);
			case HalPackage.SMART_HOME__ACTUATORDEVICE:
				return ((InternalEList<?>)getActuatordevice()).basicRemove(otherEnd, msgs);
			case HalPackage.SMART_HOME__DEVICETYPE:
				return ((InternalEList<?>)getDevicetype()).basicRemove(otherEnd, msgs);
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
			case HalPackage.SMART_HOME__ROOM:
				return getRoom();
			case HalPackage.SMART_HOME__HOME_NAME:
				return getHomeName();
			case HalPackage.SMART_HOME__SENSORDEVICE:
				return getSensordevice();
			case HalPackage.SMART_HOME__ACTUATORDEVICE:
				return getActuatordevice();
			case HalPackage.SMART_HOME__DEVICETYPE:
				return getDevicetype();
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
			case HalPackage.SMART_HOME__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case HalPackage.SMART_HOME__HOME_NAME:
				setHomeName((String)newValue);
				return;
			case HalPackage.SMART_HOME__SENSORDEVICE:
				getSensordevice().clear();
				getSensordevice().addAll((Collection<? extends SensorDevice>)newValue);
				return;
			case HalPackage.SMART_HOME__ACTUATORDEVICE:
				getActuatordevice().clear();
				getActuatordevice().addAll((Collection<? extends ActuatorDevice>)newValue);
				return;
			case HalPackage.SMART_HOME__DEVICETYPE:
				getDevicetype().clear();
				getDevicetype().addAll((Collection<? extends DeviceType>)newValue);
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
			case HalPackage.SMART_HOME__ROOM:
				getRoom().clear();
				return;
			case HalPackage.SMART_HOME__HOME_NAME:
				setHomeName(HOME_NAME_EDEFAULT);
				return;
			case HalPackage.SMART_HOME__SENSORDEVICE:
				getSensordevice().clear();
				return;
			case HalPackage.SMART_HOME__ACTUATORDEVICE:
				getActuatordevice().clear();
				return;
			case HalPackage.SMART_HOME__DEVICETYPE:
				getDevicetype().clear();
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
			case HalPackage.SMART_HOME__ROOM:
				return room != null && !room.isEmpty();
			case HalPackage.SMART_HOME__HOME_NAME:
				return HOME_NAME_EDEFAULT == null ? homeName != null : !HOME_NAME_EDEFAULT.equals(homeName);
			case HalPackage.SMART_HOME__SENSORDEVICE:
				return sensordevice != null && !sensordevice.isEmpty();
			case HalPackage.SMART_HOME__ACTUATORDEVICE:
				return actuatordevice != null && !actuatordevice.isEmpty();
			case HalPackage.SMART_HOME__DEVICETYPE:
				return devicetype != null && !devicetype.isEmpty();
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
		result.append(" (homeName: ");
		result.append(homeName);
		result.append(')');
		return result.toString();
	}

} //SmartHomeImpl
