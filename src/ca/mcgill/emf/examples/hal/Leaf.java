/**
 */
package ca.mcgill.emf.examples.hal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Leaf#getConstraintValue <em>Constraint Value</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getLeaf()
 * @model
 * @generated
 */
public interface Leaf extends Precondition {
	/**
	 * Returns the value of the '<em><b>Constraint Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Value</em>' attribute.
	 * @see #setConstraintValue(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getLeaf_ConstraintValue()
	 * @model
	 * @generated
	 */
	String getConstraintValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Leaf#getConstraintValue <em>Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Value</em>' attribute.
	 * @see #getConstraintValue()
	 * @generated
	 */
	void setConstraintValue(String value);

} // Leaf
