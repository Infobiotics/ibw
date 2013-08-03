/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getCollection <em>Collection</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends FunctionDefinitionMember, VariableDefinitionMember
{
  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see #setQualifier(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Collection()
   * @model
   * @generated
   */
  String getCollection();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #getCollection()
   * @generated
   */
  void setCollection(String value);

  /**
   * Returns the value of the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' attribute.
   * @see #setConstructor(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Constructor()
   * @model
   * @generated
   */
  String getConstructor();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getConstructor <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor</em>' attribute.
   * @see #getConstructor()
   * @generated
   */
  void setConstructor(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.VariableAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<VariableAssignment> getParameters();

} // VariableDeclaration
