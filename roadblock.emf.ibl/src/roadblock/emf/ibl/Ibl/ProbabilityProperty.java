/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Probability Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getTimeConstraint <em>Time Constraint</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getProbabilityConstraint <em>Probability Constraint</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getInitialConditions <em>Initial Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class ProbabilityProperty extends EObjectImpl implements IProperty {
	/**
	 * The cached value of the '{@link #getTimeConstraint() <em>Time Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected ITimeConstraint timeConstraint;

	/**
	 * The cached value of the '{@link #getProbabilityConstraint()
	 * <em>Probability Constraint</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProbabilityConstraint()
	 * @generated
	 * @ordered
	 */
	protected IProbabilityConstraint probabilityConstraint;

	/**
	 * The cached value of the '{@link #getInitialConditions()
	 * <em>Initial Conditions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyInitialCondition> initialConditions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityProperty() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.PROBABILITY_PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constraint</em>' containment reference.
	 * @see #setTimeConstraint(ITimeConstraint)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty_TimeConstraint()
	 * @model containment="true"
	 * @generated
	 */
	public ITimeConstraint getTimeConstraint() {
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeConstraint(ITimeConstraint newTimeConstraint, NotificationChain msgs) {
		ITimeConstraint oldTimeConstraint = timeConstraint;
		timeConstraint = newTimeConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT, oldTimeConstraint, newTimeConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getTimeConstraint <em>Time Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constraint</em>' containment reference.
	 * @see #getTimeConstraint()
	 * @generated
	 */
	public void setTimeConstraint(ITimeConstraint newTimeConstraint) {
		if (newTimeConstraint != timeConstraint) {
			NotificationChain msgs = null;
			if (timeConstraint != null)
				msgs = ((InternalEObject)timeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT, null, msgs);
			if (newTimeConstraint != null)
				msgs = ((InternalEObject)newTimeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT, null, msgs);
			msgs = basicSetTimeConstraint(newTimeConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT, newTimeConstraint, newTimeConstraint));
	}

	/**
	 * Returns the value of the '<em><b>Probability Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Constraint</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Constraint</em>' containment reference.
	 * @see #setProbabilityConstraint(IProbabilityConstraint)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty_ProbabilityConstraint()
	 * @model containment="true"
	 * @generated
	 */
	public IProbabilityConstraint getProbabilityConstraint() {
		return probabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilityConstraint(IProbabilityConstraint newProbabilityConstraint, NotificationChain msgs) {
		IProbabilityConstraint oldProbabilityConstraint = probabilityConstraint;
		probabilityConstraint = newProbabilityConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT, oldProbabilityConstraint, newProbabilityConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '
	 * {@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getProbabilityConstraint
	 * <em>Probability Constraint</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Probability Constraint</em>'
	 *            containment reference.
	 * @see #getProbabilityConstraint()
	 * @generated
	 */
	public void setProbabilityConstraint(IProbabilityConstraint newProbabilityConstraint) {
		if (newProbabilityConstraint != probabilityConstraint) {
			NotificationChain msgs = null;
			if (probabilityConstraint != null)
				msgs = ((InternalEObject)probabilityConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT, null, msgs);
			if (newProbabilityConstraint != null)
				msgs = ((InternalEObject)newProbabilityConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT, null, msgs);
			msgs = basicSetProbabilityConstraint(newProbabilityConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT, newProbabilityConstraint, newProbabilityConstraint));
	}

	/**
	 * Returns the value of the '<em><b>Initial Conditions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link roadblock.emf.ibl.Ibl.PropertyInitialCondition}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Conditions</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initial Conditions</em>' containment
	 *         reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty_InitialConditions()
	 * @model containment="true"
	 * @generated
	 */
	public List<PropertyInitialCondition> getInitialConditions() {
		if (initialConditions == null) {
			initialConditions = new EObjectContainmentEList<PropertyInitialCondition>(PropertyInitialCondition.class, this, IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS);
		}
		return initialConditions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT:
				return basicSetTimeConstraint(null, msgs);
			case IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT:
				return basicSetProbabilityConstraint(null, msgs);
			case IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS:
				return ((InternalEList<?>)getInitialConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT:
				return getTimeConstraint();
			case IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT:
				return getProbabilityConstraint();
			case IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS:
				return getInitialConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT:
				setTimeConstraint((ITimeConstraint)newValue);
				return;
			case IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT:
				setProbabilityConstraint((IProbabilityConstraint)newValue);
				return;
			case IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS:
				getInitialConditions().clear();
				getInitialConditions().addAll((Collection<? extends PropertyInitialCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT:
				setTimeConstraint((ITimeConstraint)null);
				return;
			case IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT:
				setProbabilityConstraint((IProbabilityConstraint)null);
				return;
			case IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS:
				getInitialConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IblPackage.PROBABILITY_PROPERTY__TIME_CONSTRAINT:
				return timeConstraint != null;
			case IblPackage.PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT:
				return probabilityConstraint != null;
			case IblPackage.PROBABILITY_PROPERTY__INITIAL_CONDITIONS:
				return initialConditions != null && !initialConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ProbabilityProperty
