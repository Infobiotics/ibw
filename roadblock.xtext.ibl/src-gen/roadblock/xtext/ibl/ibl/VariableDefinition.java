/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDefinition#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDefinition#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDefinition#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends ModelMember
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition_Type()
   * @model containment="true"
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getType <em>Type</em>}' containment reference.
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.VariableDefinitionMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition_Members()
   * @model containment="true"
   * @generated
   */
  EList<VariableDefinitionMember> getMembers();

} // VariableDefinition
