/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableType()
 * @model
 * @generated
 */
public interface VariableType extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive</em>' attribute.
   * @see #setPrimitive(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableType_Primitive()
   * @model
   * @generated
   */
  String getPrimitive();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableType#getPrimitive <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive</em>' attribute.
   * @see #getPrimitive()
   * @generated
   */
  void setPrimitive(String value);

} // VariableType
