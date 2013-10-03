/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #setIsBidirectional(boolean)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_IsBidirectional()
	 * @model
	 * @generated
	 */
	boolean isIsBidirectional();

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #isIsBidirectional()
	 * @generated
	 */
	void setIsBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Forward Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Rate</em>' attribute.
	 * @see #setForwardRate(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ForwardRate()
	 * @model
	 * @generated
	 */
	double getForwardRate();

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Rate</em>' attribute.
	 * @see #getForwardRate()
	 * @generated
	 */
	void setForwardRate(double value);

	/**
	 * Returns the value of the '<em><b>Reverse Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Rate</em>' attribute.
	 * @see #setReverseRate(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ReverseRate()
	 * @model
	 * @generated
	 */
	double getReverseRate();

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Rate</em>' attribute.
	 * @see #getReverseRate()
	 * @generated
	 */
	void setReverseRate(double value);

	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Molecule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Side</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_LeftHandSide()
	 * @model containment="true"
	 * @generated
	 */
	EList<Molecule> getLeftHandSide();

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Molecule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_RightHandSide()
	 * @model containment="true"
	 * @generated
	 */
	EList<Molecule> getRightHandSide();

} // Rule
