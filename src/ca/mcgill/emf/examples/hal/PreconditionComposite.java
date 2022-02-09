/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.PreconditionComposite#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.PreconditionComposite#getBool <em>Bool</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getPreconditionComposite()
 * @model
 * @generated
 */
public interface PreconditionComposite extends Precondition {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPreconditionComposite_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.Logic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.Logic
	 * @see #setBool(Logic)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getPreconditionComposite_Bool()
	 * @model
	 * @generated
	 */
	Logic getBool();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.PreconditionComposite#getBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.Logic
	 * @see #getBool()
	 * @generated
	 */
	void setBool(Logic value);

} // PreconditionComposite
