/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getSystem()
 * @model kind="class"
 * @generated
 */
public class System extends EObjectImpl implements IVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected System() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		return visitor.visit(this);
	}

} // System
