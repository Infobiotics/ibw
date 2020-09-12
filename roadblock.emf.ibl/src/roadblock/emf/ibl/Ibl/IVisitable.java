/**
 */
package roadblock.emf.ibl.Ibl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVisitable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getIVisitable()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface IVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<TResult> TResult accept(IVisitor<TResult> visitor);

} // IVisitable
