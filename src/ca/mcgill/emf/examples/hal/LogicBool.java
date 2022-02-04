/**
 */
package ca.mcgill.emf.examples.hal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.LogicBool#getBool <em>Bool</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicBool()
 * @model
 * @generated
 */
public interface LogicBool extends Precondition {
	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.Logic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.Logic
	 * @see #setBool(Logic)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLogicBool_Bool()
	 * @model
	 * @generated
	 */
	Logic getBool();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.LogicBool#getBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.Logic
	 * @see #getBool()
	 * @generated
	 */
	void setBool(Logic value);

} // LogicBool
