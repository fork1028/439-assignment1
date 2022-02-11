/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActuatorDevice;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.HalPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceTypeImpl#getActuatordevice <em>Actuatordevice</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorDeviceTypeImpl#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorDeviceTypeImpl extends DeviceTypeImpl implements ActuatorDeviceType {
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
	public ControlCommand getControlcommand() {
		if (controlcommand != null && controlcommand.eIsProxy()) {
			InternalEObject oldControlcommand = (InternalEObject)controlcommand;
			controlcommand = (ControlCommand)eResolveProxy(oldControlcommand);
			if (controlcommand != oldControlcommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, oldControlcommand, controlcommand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, oldControlcommand, newControlcommand);
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
				msgs = ((InternalEObject)controlcommand).eInverseRemove(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, ControlCommand.class, msgs);
			if (newControlcommand != null)
				msgs = ((InternalEObject)newControlcommand).eInverseAdd(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, ControlCommand.class, msgs);
			msgs = basicSetControlcommand(newControlcommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, newControlcommand, newControlcommand));
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
				if (controlcommand != null)
					msgs = ((InternalEObject)controlcommand).eInverseRemove(this, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, ControlCommand.class, msgs);
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return ((InternalEList<?>)getActuatordevice()).basicRemove(otherEnd, msgs);
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return getActuatordevice();
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				getActuatordevice().clear();
				getActuatordevice().addAll((Collection<? extends ActuatorDevice>)newValue);
				return;
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				getActuatordevice().clear();
				return;
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
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
			case HalPackage.ACTUATOR_DEVICE_TYPE__ACTUATORDEVICE:
				return actuatordevice != null && !actuatordevice.isEmpty();
			case HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND:
				return controlcommand != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorDeviceTypeImpl
