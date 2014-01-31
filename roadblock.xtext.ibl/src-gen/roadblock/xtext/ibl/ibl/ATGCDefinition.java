/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATGC Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.ATGCDefinition#getCommand <em>Command</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.ATGCDefinition#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getATGCDefinition()
 * @model
 * @generated
 */
public interface ATGCDefinition extends FunctionBodyMember, DeviceMembers
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getATGCDefinition_Command()
   * @model
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.ATGCDefinition#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getATGCDefinition_Arguments()
   * @model unique="false"
   * @generated
   */
  EList<String> getArguments();

} // ATGCDefinition
