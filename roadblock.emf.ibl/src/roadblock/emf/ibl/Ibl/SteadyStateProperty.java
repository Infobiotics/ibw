/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steady State Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getStateFormula <em>State Formula</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getProbabilityConstraint <em>Probability Constraint</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getInitialConditions <em>Initial Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty()
 * @model kind="class"
 * @generated
 */
public class SteadyStateProperty extends EObjectImpl implements IProperty {
	/**
	 * The cached value of the '{@link #getStateFormula() <em>State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFormula()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula stateFormula;

	/**
	 * The cached value of the '{@link #getProbabilityConstraint() <em>Probability Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityConstraint()
	 * @generated
	 * @ordered
	 */
	protected IProbabilityConstraint probabilityConstraint;

	/**
	 * The cached value of the '{@link #getInitialConditions() <em>Initial Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyInitialCondition> initialConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteadyStateProperty() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.STEADY_STATE_PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Formula</em>' reference.
	 * @see #setStateFormula(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty_StateFormula()
	 * @model
	 * @generated
	 */
	public IStateFormula getStateFormula() {
		if (stateFormula != null && ((EObject)stateFormula).eIsProxy()) {
			InternalEObject oldStateFormula = (InternalEObject)stateFormula;
			stateFormula = (IStateFormula)eResolveProxy(oldStateFormula);
			if (stateFormula != oldStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA, oldStateFormula, stateFormula));
			}
		}
		return stateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStateFormula basicGetStateFormula() {
		return stateFormula;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getStateFormula <em>State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Formula</em>' reference.
	 * @see #getStateFormula()
	 * @generated
	 */
	public void setStateFormula(IStateFormula newStateFormula) {
		IStateFormula oldStateFormula = stateFormula;
		stateFormula = newStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA, oldStateFormula, stateFormula));
	}

	/**
	 * Returns the value of the '<em><b>Probability Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Constraint</em>' reference.
	 * @see #setProbabilityConstraint(IProbabilityConstraint)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty_ProbabilityConstraint()
	 * @model
	 * @generated
	 */
	public IProbabilityConstraint getProbabilityConstraint() {
		if (probabilityConstraint != null && ((EObject)probabilityConstraint).eIsProxy()) {
			InternalEObject oldProbabilityConstraint = (InternalEObject)probabilityConstraint;
			probabilityConstraint = (IProbabilityConstraint)eResolveProxy(oldProbabilityConstraint);
			if (probabilityConstraint != oldProbabilityConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT, oldProbabilityConstraint, probabilityConstraint));
			}
		}
		return probabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProbabilityConstraint basicGetProbabilityConstraint() {
		return probabilityConstraint;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getProbabilityConstraint <em>Probability Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Constraint</em>' reference.
	 * @see #getProbabilityConstraint()
	 * @generated
	 */
	public void setProbabilityConstraint(IProbabilityConstraint newProbabilityConstraint) {
		IProbabilityConstraint oldProbabilityConstraint = probabilityConstraint;
		probabilityConstraint = newProbabilityConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT, oldProbabilityConstraint, probabilityConstraint));
	}

	/**
	 * Returns the value of the '<em><b>Initial Conditions</b></em>' reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.PropertyInitialCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Conditions</em>' reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty_InitialConditions()
	 * @model
	 * @generated
	 */
	public List<PropertyInitialCondition> getInitialConditions() {
		if (initialConditions == null) {
			initialConditions = new EObjectResolvingEList<PropertyInitialCondition>(PropertyInitialCondition.class, this, IblPackage.STEADY_STATE_PROPERTY__INITIAL_CONDITIONS);
		}
		return initialConditions;
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
			case IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA:
				if (resolve) return getStateFormula();
				return basicGetStateFormula();
			case IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT:
				if (resolve) return getProbabilityConstraint();
				return basicGetProbabilityConstraint();
			case IblPackage.STEADY_STATE_PROPERTY__INITIAL_CONDITIONS:
				return getInitialConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA:
				setStateFormula((IStateFormula)newValue);
				return;
			case IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT:
				setProbabilityConstraint((IProbabilityConstraint)newValue);
				return;
			case IblPackage.STEADY_STATE_PROPERTY__INITIAL_CONDITIONS:
				getInitialConditions().clear();
				getInitialConditions().addAll((Collection<? extends PropertyInitialCondition>)newValue);
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
			case IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA:
				setStateFormula((IStateFormula)null);
				return;
			case IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT:
				setProbabilityConstraint((IProbabilityConstraint)null);
				return;
			case IblPackage.STEADY_STATE_PROPERTY__INITIAL_CONDITIONS:
				getInitialConditions().clear();
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
			case IblPackage.STEADY_STATE_PROPERTY__STATE_FORMULA:
				return stateFormula != null;
			case IblPackage.STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT:
				return probabilityConstraint != null;
			case IblPackage.STEADY_STATE_PROPERTY__INITIAL_CONDITIONS:
				return initialConditions != null && !initialConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SteadyStateProperty
