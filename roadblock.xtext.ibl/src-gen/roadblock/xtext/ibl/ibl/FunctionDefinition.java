/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getFunctionBody <em>Function Body</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends ModelMember
{
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Body</em>' containment reference.
   * @see #setFunctionBody(EObject)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getFunctionDefinition_FunctionBody()
   * @model containment="true"
   * @generated
   */
  EObject getFunctionBody();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getFunctionBody <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Body</em>' containment reference.
   * @see #getFunctionBody()
   * @generated
   */
  void setFunctionBody(EObject value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.FunctionUseMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getFunctionDefinition_Uses()
   * @model containment="true"
   * @generated
   */
  EList<FunctionUseMember> getUses();

} // FunctionDefinition
