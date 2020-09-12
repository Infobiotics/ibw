/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Not State Formula</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand <em>Negated Operand</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula()
 * @model kind="class"
 * @generated
 */
public class NotStateFormula extends EObjectImpl implements IStateFormula {
	/**
	 * The cached value of the '{@link #getNegatedOperand() <em>Negated Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegatedOperand()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula negatedOperand;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NotStateFormula() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.NOT_STATE_FORMULA;
	}

	/**
	 * Returns the value of the '<em><b>Negated Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated Operand</em>' containment reference.
	 * @see #setNegatedOperand(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula_NegatedOperand()
	 * @model containment="true"
	 * @generated
	 */
	public IStateFormula getNegatedOperand() {
		return negatedOperand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegatedOperand(IStateFormula newNegatedOperand, NotificationChain msgs) {
		IStateFormula oldNegatedOperand = negatedOperand;
		negatedOperand = newNegatedOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, oldNegatedOperand, newNegatedOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand <em>Negated Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated Operand</em>' containment reference.
	 * @see #getNegatedOperand()
	 * @generated
	 */
	public void setNegatedOperand(IStateFormula newNegatedOperand) {
		if (newNegatedOperand != negatedOperand) {
			NotificationChain msgs = null;
			if (negatedOperand != null)
				msgs = ((InternalEObject)negatedOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, null, msgs);
			if (newNegatedOperand != null)
				msgs = ((InternalEObject)newNegatedOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, null, msgs);
			msgs = basicSetNegatedOperand(newNegatedOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, newNegatedOperand, newNegatedOperand));
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				return basicSetNegatedOperand(null, msgs);
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				return getNegatedOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				setNegatedOperand((IStateFormula)newValue);
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				setNegatedOperand((IStateFormula)null);
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				return negatedOperand != null;
		}
		return super.eIsSet(featureID);
	}

} // NotStateFormula
