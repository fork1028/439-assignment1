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

} // PreconditionComposite
