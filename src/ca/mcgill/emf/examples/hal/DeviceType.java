/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.DeviceType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.DeviceType#getSmarthome <em>Smarthome</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface DeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.DeviceType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SmartHome#getDevicetype <em>Devicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' reference.
	 * @see #setSmarthome(SmartHome)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType_Smarthome()
	 * @see ca.mcgill.emf.examples.hal.SmartHome#getDevicetype
	 * @model opposite="devicetype" required="true"
	 * @generated
	 */
	SmartHome getSmarthome();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.DeviceType#getSmarthome <em>Smarthome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smarthome</em>' reference.
	 * @see #getSmarthome()
	 * @generated
	 */
	void setSmarthome(SmartHome value);

} // DeviceType
