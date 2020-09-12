/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Probability Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcreteProbabilityConstraint()
 * @model kind="class"
 * @generated
 */
public class ConcreteProbabilityConstraint extends EObjectImpl implements IProbabilityConstraint {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperator OPERATOR_EDEFAULT = RelationalOperator.GT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final double BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected double bound = BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteProbabilityConstraint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.CONCRETE_PROBABILITY_CONSTRAINT;
	}

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RelationalOperator
	 * @see #setOperator(RelationalOperator)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcreteProbabilityConstraint_Operator()
	 * @model
	 * @generated
	 */
	public RelationalOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	public void setOperator(RelationalOperator newOperator) {
		RelationalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcreteProbabilityConstraint_Bound()
	 * @model
	 * @generated
	 */
	public double getBound() {
		return bound;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	public void setBound(double newBound) {
		double oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__BOUND, oldBound, bound));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR:
				return getOperator();
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__BOUND:
				return getBound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR:
				setOperator((RelationalOperator)newValue);
				return;
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__BOUND:
				setBound((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__BOUND:
				setBound(BOUND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT__BOUND:
				return bound != BOUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(", bound: ");
		result.append(bound);
		result.append(')');
		return result.toString();
	}

} // ConcreteProbabilityConstraint
