/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Process#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Process#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Process#getInputList <em>Input List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Process#getOutputList <em>Output List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Process#getOptionList <em>Option List</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRuleList();

	/**
	 * Returns the value of the '<em><b>Input List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Molecule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess_InputList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Molecule> getInputList();

	/**
	 * Returns the value of the '<em><b>Output List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Molecule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess_OutputList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Molecule> getOutputList();

	/**
	 * Returns the value of the '<em><b>Option List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Molecule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProcess_OptionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Molecule> getOptionList();

} // Process
