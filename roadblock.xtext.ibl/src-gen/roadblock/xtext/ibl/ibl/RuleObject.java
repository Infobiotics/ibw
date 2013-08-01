/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.RuleObject#getSubobjects <em>Subobjects</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleObject()
 * @model
 * @generated
 */
public interface RuleObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Subobjects</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subobjects</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subobjects</em>' attribute list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleObject_Subobjects()
   * @model unique="false"
   * @generated
   */
  EList<String> getSubobjects();

} // RuleObject
