/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDefinition#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends FunctionBodyMember, DeviceMembers
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(EObject)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableDefinition_Definition()
   * @model containment="true"
   * @generated
   */
  EObject getDefinition();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(EObject value);

} // VariableDefinition
