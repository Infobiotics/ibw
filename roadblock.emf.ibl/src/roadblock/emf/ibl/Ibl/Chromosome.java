/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chromosome</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getChromosome()
 * @model kind="class"
 * @generated
 */
public class Chromosome extends EObjectImpl implements IVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Chromosome() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.CHROMOSOME;
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

} // Chromosome
