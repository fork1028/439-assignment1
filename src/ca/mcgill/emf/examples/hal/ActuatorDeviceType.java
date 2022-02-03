/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatorTypeName <em>Actuator Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType()
 * @model
 * @generated
 */
public interface ActuatorDeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuator Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Type Name</em>' attribute.
	 * @see #setActuatorTypeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_ActuatorTypeName()
	 * @model
	 * @generated
	 */
	String getActuatorTypeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatorTypeName <em>Actuator Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Type Name</em>' attribute.
	 * @see #getActuatorTypeName()
	 * @generated
	 */
	void setActuatorTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Actuatordevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype <em>Actuatordevicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatordevice</em>' reference.
	 * @see #setActuatordevice(ActuatorDevice)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorDeviceType_Actuatordevice()
	 * @see ca.mcgill.emf.examples.hal.ActuatorDevice#getActuatordevicetype
	 * @model opposite="actuatordevicetype" required="true"
	 * @generated
	 */
	ActuatorDevice getActuatordevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.ActuatorDeviceType#getActuatordevice <em>Actuatordevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuatordevice</em>' reference.
	 * @see #getActuatordevice()
	 * @generated
	 */
	void setActuatordevice(ActuatorDevice value);

} // ActuatorDeviceType
