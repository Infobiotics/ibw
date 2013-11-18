/**
 */
package roadblock.emf.ibl.Ibl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roadblock.emf.ibl.Ibl.IblPackage;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#isIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getForwardRate <em>Forward Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getReverseRate <em>Reverse Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.RuleImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
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
	protected static final String ID_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBidirectional() {
		return isBidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBidirectional(boolean newIsBidirectional) {
		boolean oldIsBidirectional = isBidirectional;
		isBidirectional = newIsBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForwardRate() {
		return forwardRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardRate(double newForwardRate) {
		double oldForwardRate = forwardRate;
		forwardRate = newForwardRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__FORWARD_RATE, oldForwardRate, forwardRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReverseRate() {
		return reverseRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseRate(double newReverseRate) {
		double oldReverseRate = reverseRate;
		reverseRate = newReverseRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__REVERSE_RATE, oldReverseRate, reverseRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSpecies> getLeftHandSide() {
		if (leftHandSide == null) {
			leftHandSide = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.RULE__LEFT_HAND_SIDE);
		}
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSpecies> getRightHandSide() {
		if (rightHandSide == null) {
			rightHandSide = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.RULE__RIGHT_HAND_SIDE);
		}
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE__ID, oldID, id));
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
		result.append(')');
		return result.toString();
	}

} //RuleImpl
