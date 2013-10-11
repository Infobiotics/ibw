/**
 */
package bioparts;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biopart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bioparts.Biopart#getID <em>ID</em>}</li>
 *   <li>{@link bioparts.Biopart#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link bioparts.Biopart#getSequence <em>Sequence</em>}</li>
 *   <li>{@link bioparts.Biopart#getName <em>Name</em>}</li>
 *   <li>{@link bioparts.Biopart#getNotes <em>Notes</em>}</li>
 *   <li>{@link bioparts.Biopart#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link bioparts.Biopart#getAccessionURL <em>Accession URL</em>}</li>
 *   <li>{@link bioparts.Biopart#getBiologicalFunction <em>Biological Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see bioparts.BiopartsPackage#getBiopart()
 * @model
 * @generated
 */
public interface Biopart extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see bioparts.BiopartsPackage#getBiopart_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see bioparts.BiopartsPackage#getBiopart_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see bioparts.BiopartsPackage#getBiopart_Sequence()
	 * @model
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

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
	 * @see bioparts.BiopartsPackage#getBiopart_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see bioparts.BiopartsPackage#getBiopart_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name</em>' attribute.
	 * @see #setRepositoryName(String)
	 * @see bioparts.BiopartsPackage#getBiopart_RepositoryName()
	 * @model
	 * @generated
	 */
	String getRepositoryName();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getRepositoryName <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name</em>' attribute.
	 * @see #getRepositoryName()
	 * @generated
	 */
	void setRepositoryName(String value);

	/**
	 * Returns the value of the '<em><b>Accession URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accession URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accession URL</em>' attribute.
	 * @see #setAccessionURL(String)
	 * @see bioparts.BiopartsPackage#getBiopart_AccessionURL()
	 * @model
	 * @generated
	 */
	String getAccessionURL();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getAccessionURL <em>Accession URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession URL</em>' attribute.
	 * @see #getAccessionURL()
	 * @generated
	 */
	void setAccessionURL(String value);

	/**
	 * Returns the value of the '<em><b>Biological Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biological Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biological Function</em>' attribute.
	 * @see #setBiologicalFunction(String)
	 * @see bioparts.BiopartsPackage#getBiopart_BiologicalFunction()
	 * @model
	 * @generated
	 */
	String getBiologicalFunction();

	/**
	 * Sets the value of the '{@link bioparts.Biopart#getBiologicalFunction <em>Biological Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biological Function</em>' attribute.
	 * @see #getBiologicalFunction()
	 * @generated
	 */
	void setBiologicalFunction(String value);

} // Biopart
