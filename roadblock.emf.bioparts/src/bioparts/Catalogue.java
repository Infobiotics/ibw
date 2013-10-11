/**
 */
package bioparts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bioparts.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link bioparts.Catalogue#getBiopartList <em>Biopart List</em>}</li>
 * </ul>
 * </p>
 *
 * @see bioparts.BiopartsPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
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
	 * @see bioparts.BiopartsPackage#getCatalogue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bioparts.Catalogue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Biopart List</b></em>' containment reference list.
	 * The list contents are of type {@link bioparts.Biopart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biopart List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biopart List</em>' containment reference list.
	 * @see bioparts.BiopartsPackage#getCatalogue_BiopartList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Biopart> getBiopartList();

} // Catalogue
