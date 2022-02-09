/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorDeviceType#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorDeviceType()
 * @model
 * @generated
 */
public interface SensorDeviceType extends DeviceType {
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
