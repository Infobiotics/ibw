/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Probability Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getStateFormula <em>State Formula</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnaryProbabilityProperty()
 * @model kind="class"
 * @generated
 */
public class UnaryProbabilityProperty extends ProbabilityProperty {
	/**
	 * The cached value of the '{@link #getStateFormula() <em>State Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFormula()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula stateFormula;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalOperator OPERATOR_EDEFAULT = TemporalOperator.UNTIL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryProbabilityProperty() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.UNARY_PROBABILITY_PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>State Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Formula</em>' containment reference.
	 * @see #setStateFormula(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnaryProbabilityProperty_StateFormula()
	 * @model containment="true"
	 * @generated
	 */
	public IStateFormula getStateFormula() {
		return stateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateFormula(IStateFormula newStateFormula, NotificationChain msgs) {
		IStateFormula oldStateFormula = stateFormula;
		stateFormula = newStateFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA, oldStateFormula, newStateFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getStateFormula <em>State Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Formula</em>' containment reference.
	 * @see #getStateFormula()
	 * @generated
	 */
	public void setStateFormula(IStateFormula newStateFormula) {
		if (newStateFormula != stateFormula) {
			NotificationChain msgs = null;
			if (stateFormula != null)
				msgs = ((InternalEObject)stateFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA, null, msgs);
			if (newStateFormula != null)
				msgs = ((InternalEObject)newStateFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA, null, msgs);
			msgs = basicSetStateFormula(newStateFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA, newStateFormula, newStateFormula));
	}

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.TemporalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.TemporalOperator
	 * @see #setOperator(TemporalOperator)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnaryProbabilityProperty_Operator()
	 * @model
	 * @generated
	 */
	public TemporalOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.TemporalOperator
	 * @see #getOperator()
	 * @generated
	 */
	public void setOperator(TemporalOperator newOperator) {
		TemporalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.UNARY_PROBABILITY_PROPERTY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA:
				return basicSetStateFormula(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA:
				return getStateFormula();
			case IblPackage.UNARY_PROBABILITY_PROPERTY__OPERATOR:
				return getOperator();
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
			case IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA:
				setStateFormula((IStateFormula)newValue);
				return;
			case IblPackage.UNARY_PROBABILITY_PROPERTY__OPERATOR:
				setOperator((TemporalOperator)newValue);
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
			case IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA:
				setStateFormula((IStateFormula)null);
				return;
			case IblPackage.UNARY_PROBABILITY_PROPERTY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case IblPackage.UNARY_PROBABILITY_PROPERTY__STATE_FORMULA:
				return stateFormula != null;
			case IblPackage.UNARY_PROBABILITY_PROPERTY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(')');
		return result.toString();
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

} // UnaryProbabilityProperty
