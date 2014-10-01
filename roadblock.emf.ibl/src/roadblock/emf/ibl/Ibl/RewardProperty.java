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
 * <em><b>Reward Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.RewardProperty#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.RewardProperty#getTimeConstraint <em>Time Constraint</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.RewardProperty#getConcentrationConstraint <em>Concentration Constraint</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.RewardProperty#getInitialConditions <em>Initial Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty()
 * @model kind="class"
 * @generated
 */
public class RewardProperty extends EObjectImpl implements IProperty {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeConstraint() <em>Time Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected TimeInstant timeConstraint;

	/**
	 * The cached value of the '{@link #getConcentrationConstraint()
	 * <em>Concentration Constraint</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConcentrationConstraint()
	 * @generated
	 * @ordered
	 */
	protected ConcentrationConstraint concentrationConstraint;

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
	protected RewardProperty() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.REWARD_PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty_VariableName()
	 * @model
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.RewardProperty#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REWARD_PROPERTY__VARIABLE_NAME, oldVariableName, variableName));
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
	 * @see #setTimeConstraint(TimeInstant)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty_TimeConstraint()
	 * @model containment="true"
	 * @generated
	 */
	public TimeInstant getTimeConstraint() {
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeConstraint(TimeInstant newTimeConstraint, NotificationChain msgs) {
		TimeInstant oldTimeConstraint = timeConstraint;
		timeConstraint = newTimeConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT, oldTimeConstraint, newTimeConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.RewardProperty#getTimeConstraint <em>Time Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constraint</em>' containment reference.
	 * @see #getTimeConstraint()
	 * @generated
	 */
	public void setTimeConstraint(TimeInstant newTimeConstraint) {
		if (newTimeConstraint != timeConstraint) {
			NotificationChain msgs = null;
			if (timeConstraint != null)
				msgs = ((InternalEObject)timeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT, null, msgs);
			if (newTimeConstraint != null)
				msgs = ((InternalEObject)newTimeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT, null, msgs);
			msgs = basicSetTimeConstraint(newTimeConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT, newTimeConstraint, newTimeConstraint));
	}

	/**
	 * Returns the value of the '<em><b>Concentration Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration Constraint</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration Constraint</em>' containment reference.
	 * @see #setConcentrationConstraint(ConcentrationConstraint)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty_ConcentrationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	public ConcentrationConstraint getConcentrationConstraint() {
		return concentrationConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationConstraint(ConcentrationConstraint newConcentrationConstraint, NotificationChain msgs) {
		ConcentrationConstraint oldConcentrationConstraint = concentrationConstraint;
		concentrationConstraint = newConcentrationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT, oldConcentrationConstraint, newConcentrationConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '
	 * {@link roadblock.emf.ibl.Ibl.RewardProperty#getConcentrationConstraint
	 * <em>Concentration Constraint</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Concentration Constraint</em>'
	 *            containment reference.
	 * @see #getConcentrationConstraint()
	 * @generated
	 */
	public void setConcentrationConstraint(ConcentrationConstraint newConcentrationConstraint) {
		if (newConcentrationConstraint != concentrationConstraint) {
			NotificationChain msgs = null;
			if (concentrationConstraint != null)
				msgs = ((InternalEObject)concentrationConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT, null, msgs);
			if (newConcentrationConstraint != null)
				msgs = ((InternalEObject)newConcentrationConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT, null, msgs);
			msgs = basicSetConcentrationConstraint(newConcentrationConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT, newConcentrationConstraint, newConcentrationConstraint));
	}

	/**
	 * Returns the value of the '<em><b>Initial Conditions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link roadblock.emf.ibl.Ibl.PropertyInitialCondition}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Conditions</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initial Conditions</em>' containment
	 *         reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty_InitialConditions()
	 * @model containment="true"
	 * @generated
	 */
	public List<PropertyInitialCondition> getInitialConditions() {
		if (initialConditions == null) {
			initialConditions = new EObjectContainmentEList<PropertyInitialCondition>(PropertyInitialCondition.class, this, IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS);
		}
		return initialConditions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		return visitor.visit(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT:
				return basicSetTimeConstraint(null, msgs);
			case IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT:
				return basicSetConcentrationConstraint(null, msgs);
			case IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS:
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
			case IblPackage.REWARD_PROPERTY__VARIABLE_NAME:
				return getVariableName();
			case IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT:
				return getTimeConstraint();
			case IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT:
				return getConcentrationConstraint();
			case IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS:
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
			case IblPackage.REWARD_PROPERTY__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT:
				setTimeConstraint((TimeInstant)newValue);
				return;
			case IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT:
				setConcentrationConstraint((ConcentrationConstraint)newValue);
				return;
			case IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS:
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
			case IblPackage.REWARD_PROPERTY__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT:
				setTimeConstraint((TimeInstant)null);
				return;
			case IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT:
				setConcentrationConstraint((ConcentrationConstraint)null);
				return;
			case IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS:
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
			case IblPackage.REWARD_PROPERTY__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case IblPackage.REWARD_PROPERTY__TIME_CONSTRAINT:
				return timeConstraint != null;
			case IblPackage.REWARD_PROPERTY__CONCENTRATION_CONSTRAINT:
				return concentrationConstraint != null;
			case IblPackage.REWARD_PROPERTY__INITIAL_CONDITIONS:
				return initialConditions != null && !initialConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(')');
		return result.toString();
	}

} // RewardProperty
