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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getForwardRateUnit <em>Forward Rate Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Rule#getReverseRateUnit <em>Reverse Rate Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule()
 * @model kind="class"
 * @generated
 */
public class Rule extends EObjectImpl implements IVisitable {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean isBidirectional = IS_BIDIRECTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getForwardRate() <em>Forward Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRate()
	 * @generated
	 * @ordered
	 */
	protected static final double FORWARD_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForwardRate() <em>Forward Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRate()
	 * @generated
	 * @ordered
	 */
	protected double forwardRate = FORWARD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverseRate() <em>Reverse Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseRate()
	 * @generated
	 * @ordered
	 */
	protected static final double REVERSE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReverseRate() <em>Reverse Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseRate()
	 * @generated
	 * @ordered
	 */
	protected double reverseRate = REVERSE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> leftHandSide;

	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> rightHandSide;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getForwardRateUnit() <em>Forward Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final RateUnit FORWARD_RATE_UNIT_EDEFAULT = RateUnit.PER_SECOND;

	/**
	 * The cached value of the '{@link #getForwardRateUnit() <em>Forward Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRateUnit()
	 * @generated
	 * @ordered
	 */
	protected RateUnit forwardRateUnit = FORWARD_RATE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverseRateUnit() <em>Reverse Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final RateUnit REVERSE_RATE_UNIT_EDEFAULT = RateUnit.PER_SECOND;

	/**
	 * The cached value of the '{@link #getReverseRateUnit() <em>Reverse Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseRateUnit()
	 * @generated
	 * @ordered
	 */
	protected RateUnit reverseRateUnit = REVERSE_RATE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.RULE;
	}

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #setIsBidirectional(boolean)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_IsBidirectional()
	 * @model
	 * @generated
	 */
	public boolean isIsBidirectional() {
		return isBidirectional;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #isIsBidirectional()
	 * @generated
	 */
	public void setIsBidirectional(boolean newIsBidirectional) {
		boolean oldIsBidirectional = isBidirectional;
		isBidirectional = newIsBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional));
	}

	/**
	 * Returns the value of the '<em><b>Forward Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Rate</em>' attribute.
	 * @see #setForwardRate(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ForwardRate()
	 * @model default="0"
	 * @generated
	 */
	public double getForwardRate() {
		return forwardRate;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Rate</em>' attribute.
	 * @see #getForwardRate()
	 * @generated
	 */
	public void setForwardRate(double newForwardRate) {
		double oldForwardRate = forwardRate;
		forwardRate = newForwardRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__FORWARD_RATE, oldForwardRate, forwardRate));
	}

	/**
	 * Returns the value of the '<em><b>Reverse Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Rate</em>' attribute.
	 * @see #setReverseRate(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ReverseRate()
	 * @model default="0"
	 * @generated
	 */
	public double getReverseRate() {
		return reverseRate;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Rate</em>' attribute.
	 * @see #getReverseRate()
	 * @generated
	 */
	public void setReverseRate(double newReverseRate) {
		double oldReverseRate = reverseRate;
		reverseRate = newReverseRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__REVERSE_RATE, oldReverseRate, reverseRate));
	}

	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Side</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_LeftHandSide()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getLeftHandSide() {
		if (leftHandSide == null) {
			leftHandSide = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.RULE__LEFT_HAND_SIDE);
		}
		return leftHandSide;
	}

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_RightHandSide()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getRightHandSide() {
		if (rightHandSide == null) {
			rightHandSide = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.RULE__RIGHT_HAND_SIDE);
		}
		return rightHandSide;
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ID()
	 * @model default=""
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__ID, oldID, id));
	}

	/**
	 * Returns the value of the '<em><b>Forward Rate Unit</b></em>' attribute.
	 * The default value is <code>"PER_SECOND"</code>.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.RateUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Rate Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Rate Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @see #setForwardRateUnit(RateUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ForwardRateUnit()
	 * @model default="PER_SECOND"
	 * @generated
	 */
	public RateUnit getForwardRateUnit() {
		return forwardRateUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRateUnit <em>Forward Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Rate Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @see #getForwardRateUnit()
	 * @generated
	 */
	public void setForwardRateUnit(RateUnit newForwardRateUnit) {
		RateUnit oldForwardRateUnit = forwardRateUnit;
		forwardRateUnit = newForwardRateUnit == null ? FORWARD_RATE_UNIT_EDEFAULT : newForwardRateUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__FORWARD_RATE_UNIT, oldForwardRateUnit, forwardRateUnit));
	}

	/**
	 * Returns the value of the '<em><b>Reverse Rate Unit</b></em>' attribute.
	 * The default value is <code>"PER_SECOND"</code>.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.RateUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Rate Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Rate Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @see #setReverseRateUnit(RateUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule_ReverseRateUnit()
	 * @model default="PER_SECOND"
	 * @generated
	 */
	public RateUnit getReverseRateUnit() {
		return reverseRateUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRateUnit <em>Reverse Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Rate Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @see #getReverseRateUnit()
	 * @generated
	 */
	public void setReverseRateUnit(RateUnit newReverseRateUnit) {
		RateUnit oldReverseRateUnit = reverseRateUnit;
		reverseRateUnit = newReverseRateUnit == null ? REVERSE_RATE_UNIT_EDEFAULT : newReverseRateUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__REVERSE_RATE_UNIT, oldReverseRateUnit, reverseRateUnit));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.RULE__LEFT_HAND_SIDE:
				return ((InternalEList<?>)getLeftHandSide()).basicRemove(otherEnd, msgs);
			case IblPackage.RULE__RIGHT_HAND_SIDE:
				return ((InternalEList<?>)getRightHandSide()).basicRemove(otherEnd, msgs);
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
			case IblPackage.RULE__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.RULE__IS_BIDIRECTIONAL:
				return isIsBidirectional();
			case IblPackage.RULE__FORWARD_RATE:
				return getForwardRate();
			case IblPackage.RULE__REVERSE_RATE:
				return getReverseRate();
			case IblPackage.RULE__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case IblPackage.RULE__RIGHT_HAND_SIDE:
				return getRightHandSide();
			case IblPackage.RULE__ID:
				return getID();
			case IblPackage.RULE__FORWARD_RATE_UNIT:
				return getForwardRateUnit();
			case IblPackage.RULE__REVERSE_RATE_UNIT:
				return getReverseRateUnit();
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
			case IblPackage.RULE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.RULE__IS_BIDIRECTIONAL:
				setIsBidirectional((Boolean)newValue);
				return;
			case IblPackage.RULE__FORWARD_RATE:
				setForwardRate((Double)newValue);
				return;
			case IblPackage.RULE__REVERSE_RATE:
				setReverseRate((Double)newValue);
				return;
			case IblPackage.RULE__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				getLeftHandSide().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.RULE__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
				getRightHandSide().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.RULE__ID:
				setID((String)newValue);
				return;
			case IblPackage.RULE__FORWARD_RATE_UNIT:
				setForwardRateUnit((RateUnit)newValue);
				return;
			case IblPackage.RULE__REVERSE_RATE_UNIT:
				setReverseRateUnit((RateUnit)newValue);
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
			case IblPackage.RULE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.RULE__IS_BIDIRECTIONAL:
				setIsBidirectional(IS_BIDIRECTIONAL_EDEFAULT);
				return;
			case IblPackage.RULE__FORWARD_RATE:
				setForwardRate(FORWARD_RATE_EDEFAULT);
				return;
			case IblPackage.RULE__REVERSE_RATE:
				setReverseRate(REVERSE_RATE_EDEFAULT);
				return;
			case IblPackage.RULE__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				return;
			case IblPackage.RULE__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
				return;
			case IblPackage.RULE__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.RULE__FORWARD_RATE_UNIT:
				setForwardRateUnit(FORWARD_RATE_UNIT_EDEFAULT);
				return;
			case IblPackage.RULE__REVERSE_RATE_UNIT:
				setReverseRateUnit(REVERSE_RATE_UNIT_EDEFAULT);
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
			case IblPackage.RULE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.RULE__IS_BIDIRECTIONAL:
				return isBidirectional != IS_BIDIRECTIONAL_EDEFAULT;
			case IblPackage.RULE__FORWARD_RATE:
				return forwardRate != FORWARD_RATE_EDEFAULT;
			case IblPackage.RULE__REVERSE_RATE:
				return reverseRate != REVERSE_RATE_EDEFAULT;
			case IblPackage.RULE__LEFT_HAND_SIDE:
				return leftHandSide != null && !leftHandSide.isEmpty();
			case IblPackage.RULE__RIGHT_HAND_SIDE:
				return rightHandSide != null && !rightHandSide.isEmpty();
			case IblPackage.RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.RULE__FORWARD_RATE_UNIT:
				return forwardRateUnit != FORWARD_RATE_UNIT_EDEFAULT;
			case IblPackage.RULE__REVERSE_RATE_UNIT:
				return reverseRateUnit != REVERSE_RATE_UNIT_EDEFAULT;
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", isBidirectional: ");
		result.append(isBidirectional);
		result.append(", forwardRate: ");
		result.append(forwardRate);
		result.append(", reverseRate: ");
		result.append(reverseRate);
		result.append(", ID: ");
		result.append(id);
		result.append(", forwardRateUnit: ");
		result.append(forwardRateUnit);
		result.append(", reverseRateUnit: ");
		result.append(reverseRateUnit);
		result.append(')');
		return result.toString();
	}

} // Rule
