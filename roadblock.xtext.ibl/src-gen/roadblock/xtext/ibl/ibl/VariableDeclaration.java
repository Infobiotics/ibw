/**
 */
package roadblock.xtext.ibl.ibl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends VariableDefinitionMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(VariableType)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(VariableType value);

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

} // VariableDeclaration
