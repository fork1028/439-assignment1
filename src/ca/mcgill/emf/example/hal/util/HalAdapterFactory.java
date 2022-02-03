/**
 */
package ca.mcgill.emf.example.hal.util;

import ca.mcgill.emf.example.hal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.example.hal.HalPackage
 * @generated
 */
public class HalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalSwitch<Adapter> modelSwitch =
		new HalSwitch<Adapter>() {
			@Override
			public Adapter caseAutomationRule(AutomationRule object) {
				return createAutomationRuleAdapter();
			}
			@Override
			public Adapter casePrecondition(Precondition object) {
				return createPreconditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActivityLog(ActivityLog object) {
				return createActivityLogAdapter();
			}
			@Override
			public Adapter caseSensorReading(SensorReading object) {
				return createSensorReadingAdapter();
			}
			@Override
			public Adapter caseControlCommand(ControlCommand object) {
				return createControlCommandAdapter();
			}
			@Override
			public Adapter caseSensorDevice(SensorDevice object) {
				return createSensorDeviceAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseActuatorDevice(ActuatorDevice object) {
				return createActuatorDeviceAdapter();
			}
			@Override
			public Adapter caseSensorDeviceType(SensorDeviceType object) {
				return createSensorDeviceTypeAdapter();
			}
			@Override
			public Adapter caseActuatorDeviceType(ActuatorDeviceType object) {
				return createActuatorDeviceTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.AutomationRule
	 * @generated
	 */
	public Adapter createAutomationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.ActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.ActivityLog
	 * @generated
	 */
	public Adapter createActivityLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.SensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.SensorReading
	 * @generated
	 */
	public Adapter createSensorReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.ControlCommand
	 * @generated
	 */
	public Adapter createControlCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.SensorDevice <em>Sensor Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.SensorDevice
	 * @generated
	 */
	public Adapter createSensorDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.ActuatorDevice <em>Actuator Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.ActuatorDevice
	 * @generated
	 */
	public Adapter createActuatorDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.SensorDeviceType <em>Sensor Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.SensorDeviceType
	 * @generated
	 */
	public Adapter createSensorDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.example.hal.ActuatorDeviceType <em>Actuator Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.example.hal.ActuatorDeviceType
	 * @generated
	 */
	public Adapter createActuatorDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HalAdapterFactory
