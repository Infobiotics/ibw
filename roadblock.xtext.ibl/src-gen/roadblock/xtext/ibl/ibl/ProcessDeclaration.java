/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.ProcessDeclaration#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.ProcessDeclaration#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getProcessDeclaration()
 * @model
 * @generated
 */
public interface ProcessDeclaration extends DeviceMembers
{
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getProcessDeclaration_Constructor()
   * @model
   * @generated
   */
  String getConstructor();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.ProcessDeclaration#getConstructor <em>Constructor</em>}' attribute.
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getProcessDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<VariableAssignment> getParameters();

} // ProcessDeclaration
