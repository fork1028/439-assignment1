/**
 */
package ca.mcgill.emf.example.hal.impl;

import ca.mcgill.emf.example.hal.ActivityLog;
import ca.mcgill.emf.example.hal.ControlCommand;
import ca.mcgill.emf.example.hal.HalPackage;
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
 * An implementation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActivityLogImpl#getLogId <em>Log Id</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActivityLogImpl#getSensorreading <em>Sensorreading</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.impl.ActivityLogImpl#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityLogImpl extends MinimalEObjectImpl.Container implements ActivityLog {
	/**
	 * The default value of the '{@link #getLogId() <em>Log Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogId() <em>Log Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogId()
	 * @generated
	 * @ordered
	 */
	protected String logId = LOG_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getControlcommand() <em>Controlcommand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlCommand> controlcommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTIVITY_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogId() {
		return logId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogId(String newLogId) {
		String oldLogId = logId;
		logId = newLogId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTIVITY_LOG__LOG_ID, oldLogId, logId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorReading> getSensorreading() {
		if (sensorreading == null) {
			sensorreading = new EObjectWithInverseResolvingEList<SensorReading>(SensorReading.class, this, HalPackage.ACTIVITY_LOG__SENSORREADING, HalPackage.SENSOR_READING__ACTIVITYLOG);
		}
		return sensorreading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlCommand> getControlcommand() {
		if (controlcommand == null) {
			controlcommand = new EObjectWithInverseResolvingEList<ControlCommand>(ControlCommand.class, this, HalPackage.ACTIVITY_LOG__CONTROLCOMMAND, HalPackage.CONTROL_COMMAND__ACTIVITYLOG);
		}
		return controlcommand;
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
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensorreading()).basicAdd(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlcommand()).basicAdd(otherEnd, msgs);
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
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				return ((InternalEList<?>)getSensorreading()).basicRemove(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				return ((InternalEList<?>)getControlcommand()).basicRemove(otherEnd, msgs);
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
			case HalPackage.ACTIVITY_LOG__LOG_ID:
				return getLogId();
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				return getSensorreading();
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				return getControlcommand();
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
			case HalPackage.ACTIVITY_LOG__LOG_ID:
				setLogId((String)newValue);
				return;
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				getSensorreading().clear();
				getSensorreading().addAll((Collection<? extends SensorReading>)newValue);
				return;
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				getControlcommand().clear();
				getControlcommand().addAll((Collection<? extends ControlCommand>)newValue);
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
			case HalPackage.ACTIVITY_LOG__LOG_ID:
				setLogId(LOG_ID_EDEFAULT);
				return;
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				getSensorreading().clear();
				return;
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				getControlcommand().clear();
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
			case HalPackage.ACTIVITY_LOG__LOG_ID:
				return LOG_ID_EDEFAULT == null ? logId != null : !LOG_ID_EDEFAULT.equals(logId);
			case HalPackage.ACTIVITY_LOG__SENSORREADING:
				return sensorreading != null && !sensorreading.isEmpty();
			case HalPackage.ACTIVITY_LOG__CONTROLCOMMAND:
				return controlcommand != null && !controlcommand.isEmpty();
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
		result.append(" (logId: ");
		result.append(logId);
		result.append(')');
		return result.toString();
	}

} //ActivityLogImpl
