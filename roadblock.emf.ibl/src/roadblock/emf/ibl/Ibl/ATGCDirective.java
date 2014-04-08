/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATGC Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective()
 * @model kind="class"
 * @generated
 */
public class ATGCDirective extends EObjectImpl implements IVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATGCDirective() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.ATGC_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ATGCDirective
