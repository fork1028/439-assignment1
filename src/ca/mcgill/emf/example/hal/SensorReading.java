/**
 */
package ca.mcgill.emf.example.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorReading#getReadingValue <em>Reading Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorReading#getSensorTimestamp <em>Sensor Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorReading#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.example.hal.SensorReading#getSensordevice <em>Sensordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorReading()
 * @model
 * @generated
 */
public interface SensorReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Reading Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Value</em>' attribute.
	 * @see #setReadingValue(String)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorReading_ReadingValue()
	 * @model
	 * @generated
	 */
	String getReadingValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorReading#getReadingValue <em>Reading Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Value</em>' attribute.
	 * @see #getReadingValue()
	 * @generated
	 */
	void setReadingValue(String value);

	/**
	 * Returns the value of the '<em><b>Sensor Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Timestamp</em>' attribute.
	 * @see #setSensorTimestamp(String)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorReading_SensorTimestamp()
	 * @model
	 * @generated
	 */
	String getSensorTimestamp();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorReading#getSensorTimestamp <em>Sensor Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Timestamp</em>' attribute.
	 * @see #getSensorTimestamp()
	 * @generated
	 */
	void setSensorTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.ActivityLog#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorReading_Activitylog()
	 * @see ca.mcgill.emf.example.hal.ActivityLog#getSensorreading
	 * @model opposite="sensorreading" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorReading#getActivitylog <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.example.hal.SensorDevice#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' reference.
	 * @see #setSensordevice(SensorDevice)
	 * @see ca.mcgill.emf.example.hal.HalPackage#getSensorReading_Sensordevice()
	 * @see ca.mcgill.emf.example.hal.SensorDevice#getSensorreading
	 * @model opposite="sensorreading" required="true"
	 * @generated
	 */
	SensorDevice getSensordevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.example.hal.SensorReading#getSensordevice <em>Sensordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensordevice</em>' reference.
	 * @see #getSensordevice()
	 * @generated
	 */
	void setSensordevice(SensorDevice value);

} // SensorReading
