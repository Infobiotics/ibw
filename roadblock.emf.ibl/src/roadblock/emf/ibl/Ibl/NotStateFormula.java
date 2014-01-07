/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not State Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand <em>Negated Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula()
 * @model kind="class"
 * @generated
 */
public class NotStateFormula extends EObjectImpl implements IStateFormula {
	/**
	 * The cached value of the '{@link #getNegatedOperand() <em>Negated Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegatedOperand()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula negatedOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotStateFormula() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.NOT_STATE_FORMULA;
	}

	/**
	 * Returns the value of the '<em><b>Negated Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated Operand</em>' reference.
	 * @see #setNegatedOperand(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula_NegatedOperand()
	 * @model
	 * @generated
	 */
	public IStateFormula getNegatedOperand() {
		if (negatedOperand != null && ((EObject)negatedOperand).eIsProxy()) {
			InternalEObject oldNegatedOperand = (InternalEObject)negatedOperand;
			negatedOperand = (IStateFormula)eResolveProxy(oldNegatedOperand);
			if (negatedOperand != oldNegatedOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, oldNegatedOperand, negatedOperand));
			}
		}
		return negatedOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStateFormula basicGetNegatedOperand() {
		return negatedOperand;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand <em>Negated Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated Operand</em>' reference.
	 * @see #getNegatedOperand()
	 * @generated
	 */
	public void setNegatedOperand(IStateFormula newNegatedOperand) {
		IStateFormula oldNegatedOperand = negatedOperand;
		negatedOperand = newNegatedOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND, oldNegatedOperand, negatedOperand));
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				if (resolve) return getNegatedOperand();
				return basicGetNegatedOperand();
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				setNegatedOperand((IStateFormula)newValue);
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				setNegatedOperand((IStateFormula)null);
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
			case IblPackage.NOT_STATE_FORMULA__NEGATED_OPERAND:
				return negatedOperand != null;
		}
		return super.eIsSet(featureID);
	}

} // NotStateFormula
