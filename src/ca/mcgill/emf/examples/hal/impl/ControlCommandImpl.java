/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Action;
import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.ActuatorDeviceType;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.HalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl#getCommandId <em>Command Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl#getControlTimestamp <em>Control Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl#getActuatordevicetype <em>Actuatordevicetype</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlCommandImpl extends MinimalEObjectImpl.Container implements ControlCommand {
	/**
	 * The default value of the '{@link #getCommandId() <em>Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandId() <em>Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandId()
	 * @generated
	 * @ordered
	 */
	protected String commandId = COMMAND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlTimestamp() <em>Control Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlTimestamp() <em>Control Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String controlTimestamp = CONTROL_TIMESTAMP_EDEFAULT;

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
	 * The cached value of the '{@link #getActivitylog() <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitylog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activitylog;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.CONTROL_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandId() {
		return commandId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandId(String newCommandId) {
		String oldCommandId = commandId;
		commandId = newCommandId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__COMMAND_ID, oldCommandId, commandId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlTimestamp() {
		return controlTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlTimestamp(String newControlTimestamp) {
		String oldControlTimestamp = controlTimestamp;
		controlTimestamp = newControlTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__CONTROL_TIMESTAMP, oldControlTimestamp, controlTimestamp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, oldActuatordevicetype, actuatordevicetype));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, oldActuatordevicetype, newActuatordevicetype);
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
				msgs = ((InternalEObject)actuatordevicetype).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, ActuatorDeviceType.class, msgs);
			if (newActuatordevicetype != null)
				msgs = ((InternalEObject)newActuatordevicetype).eInverseAdd(this, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, ActuatorDeviceType.class, msgs);
			msgs = basicSetActuatordevicetype(newActuatordevicetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE, newActuatordevicetype, newActuatordevicetype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.CONTROL_COMMAND__ACTIVITYLOG, oldActivitylog, activitylog));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTIVITYLOG, oldActivitylog, newActivitylog);
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
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__CONTROLCOMMAND, ActivityLog.class, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, HalPackage.ACTIVITY_LOG__CONTROLCOMMAND, ActivityLog.class, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTIVITYLOG, newActivitylog, newActivitylog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.CONTROL_COMMAND__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, HalPackage.ACTION__CONTROLCOMMAND, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, HalPackage.ACTION__CONTROLCOMMAND, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONTROL_COMMAND__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				if (actuatordevicetype != null)
					msgs = ((InternalEObject)actuatordevicetype).eInverseRemove(this, HalPackage.ACTUATOR_DEVICE_TYPE__CONTROLCOMMAND, ActuatorDeviceType.class, msgs);
				return basicSetActuatordevicetype((ActuatorDeviceType)otherEnd, msgs);
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				if (activitylog != null)
					msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__CONTROLCOMMAND, ActivityLog.class, msgs);
				return basicSetActivitylog((ActivityLog)otherEnd, msgs);
			case HalPackage.CONTROL_COMMAND__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, HalPackage.ACTION__CONTROLCOMMAND, Action.class, msgs);
				return basicSetAction((Action)otherEnd, msgs);
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
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				return basicSetActuatordevicetype(null, msgs);
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
			case HalPackage.CONTROL_COMMAND__ACTION:
				return basicSetAction(null, msgs);
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
			case HalPackage.CONTROL_COMMAND__COMMAND_ID:
				return getCommandId();
			case HalPackage.CONTROL_COMMAND__CONTROL_TIMESTAMP:
				return getControlTimestamp();
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				if (resolve) return getActuatordevicetype();
				return basicGetActuatordevicetype();
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				if (resolve) return getActivitylog();
				return basicGetActivitylog();
			case HalPackage.CONTROL_COMMAND__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case HalPackage.CONTROL_COMMAND__COMMAND_ID:
				setCommandId((String)newValue);
				return;
			case HalPackage.CONTROL_COMMAND__CONTROL_TIMESTAMP:
				setControlTimestamp((String)newValue);
				return;
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				setActuatordevicetype((ActuatorDeviceType)newValue);
				return;
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
				return;
			case HalPackage.CONTROL_COMMAND__ACTION:
				setAction((Action)newValue);
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
			case HalPackage.CONTROL_COMMAND__COMMAND_ID:
				setCommandId(COMMAND_ID_EDEFAULT);
				return;
			case HalPackage.CONTROL_COMMAND__CONTROL_TIMESTAMP:
				setControlTimestamp(CONTROL_TIMESTAMP_EDEFAULT);
				return;
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				setActuatordevicetype((ActuatorDeviceType)null);
				return;
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
				return;
			case HalPackage.CONTROL_COMMAND__ACTION:
				setAction((Action)null);
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
			case HalPackage.CONTROL_COMMAND__COMMAND_ID:
				return COMMAND_ID_EDEFAULT == null ? commandId != null : !COMMAND_ID_EDEFAULT.equals(commandId);
			case HalPackage.CONTROL_COMMAND__CONTROL_TIMESTAMP:
				return CONTROL_TIMESTAMP_EDEFAULT == null ? controlTimestamp != null : !CONTROL_TIMESTAMP_EDEFAULT.equals(controlTimestamp);
			case HalPackage.CONTROL_COMMAND__ACTUATORDEVICETYPE:
				return actuatordevicetype != null;
			case HalPackage.CONTROL_COMMAND__ACTIVITYLOG:
				return activitylog != null;
			case HalPackage.CONTROL_COMMAND__ACTION:
				return action != null;
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
		result.append(" (commandId: ");
		result.append(commandId);
		result.append(", controlTimestamp: ");
		result.append(controlTimestamp);
		result.append(')');
		return result.toString();
	}

} //ControlCommandImpl
