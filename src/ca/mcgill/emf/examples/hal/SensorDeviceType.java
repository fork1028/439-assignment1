/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorTypeName <em>Sensor Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType()
 * @model
 * @generated
 */
public interface SensorDeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type Name</em>' attribute.
	 * @see #setSensorTypeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_SensorTypeName()
	 * @model
	 * @generated
	 */
	String getSensorTypeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensorTypeName <em>Sensor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type Name</em>' attribute.
	 * @see #getSensorTypeName()
	 * @generated
	 */
	void setSensorTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorDevice}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype <em>Sensordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType_Sensordevice()
	 * @see ca.mcgill.emf.examples.hal.SensorDevice#getSensordevicetype
	 * @model opposite="sensordevicetype"
	 * @generated
	 */
	EList<SensorDevice> getSensordevice();

} // SensorDeviceType
