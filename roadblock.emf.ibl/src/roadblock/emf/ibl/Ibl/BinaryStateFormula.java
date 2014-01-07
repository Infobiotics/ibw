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
 * A representation of the model object '<em><b>Binary State Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula()
 * @model kind="class"
 * @generated
 */
public class BinaryStateFormula extends EObjectImpl implements IStateFormula {
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula leftOperand;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected IStateFormula rightOperand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator OPERATOR_EDEFAULT = BooleanOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryStateFormula() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.BINARY_STATE_FORMULA;
	}

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference.
	 * @see #setLeftOperand(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula_LeftOperand()
	 * @model
	 * @generated
	 */
	public IStateFormula getLeftOperand() {
		if (leftOperand != null && ((EObject)leftOperand).eIsProxy()) {
			InternalEObject oldLeftOperand = (InternalEObject)leftOperand;
			leftOperand = (IStateFormula)eResolveProxy(oldLeftOperand);
			if (leftOperand != oldLeftOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND, oldLeftOperand, leftOperand));
			}
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStateFormula basicGetLeftOperand() {
		return leftOperand;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getLeftOperand <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	public void setLeftOperand(IStateFormula newLeftOperand) {
		IStateFormula oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND, oldLeftOperand, leftOperand));
	}

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference.
	 * @see #setRightOperand(IStateFormula)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula_RightOperand()
	 * @model
	 * @generated
	 */
	public IStateFormula getRightOperand() {
		if (rightOperand != null && ((EObject)rightOperand).eIsProxy()) {
			InternalEObject oldRightOperand = (InternalEObject)rightOperand;
			rightOperand = (IStateFormula)eResolveProxy(oldRightOperand);
			if (rightOperand != oldRightOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND, oldRightOperand, rightOperand));
			}
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStateFormula basicGetRightOperand() {
		return rightOperand;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getRightOperand <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	public void setRightOperand(IStateFormula newRightOperand) {
		IStateFormula oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND, oldRightOperand, rightOperand));
	}

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula_Operator()
	 * @model
	 * @generated
	 */
	public BooleanOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	public void setOperator(BooleanOperator newOperator) {
		BooleanOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_STATE_FORMULA__OPERATOR, oldOperator, operator));
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
			case IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND:
				if (resolve) return getLeftOperand();
				return basicGetLeftOperand();
			case IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND:
				if (resolve) return getRightOperand();
				return basicGetRightOperand();
			case IblPackage.BINARY_STATE_FORMULA__OPERATOR:
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
			case IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND:
				setLeftOperand((IStateFormula)newValue);
				return;
			case IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND:
				setRightOperand((IStateFormula)newValue);
				return;
			case IblPackage.BINARY_STATE_FORMULA__OPERATOR:
				setOperator((BooleanOperator)newValue);
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
			case IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND:
				setLeftOperand((IStateFormula)null);
				return;
			case IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND:
				setRightOperand((IStateFormula)null);
				return;
			case IblPackage.BINARY_STATE_FORMULA__OPERATOR:
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
			case IblPackage.BINARY_STATE_FORMULA__LEFT_OPERAND:
				return leftOperand != null;
			case IblPackage.BINARY_STATE_FORMULA__RIGHT_OPERAND:
				return rightOperand != null;
			case IblPackage.BINARY_STATE_FORMULA__OPERATOR:
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

} // BinaryStateFormula
