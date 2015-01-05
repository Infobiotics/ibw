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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression()
 * @model kind="class"
 * @generated
 */
public class BinaryArithmeticExpression extends EObjectImpl implements IArithmeticExpression {
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected IArithmeticOperand leftOperand;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected IArithmeticOperand rightOperand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator OPERATOR_EDEFAULT = ArithmeticOperator.ADDITION;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryArithmeticExpression() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.BINARY_ARITHMETIC_EXPRESSION;
	}

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(IArithmeticOperand)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression_LeftOperand()
	 * @model containment="true"
	 * @generated
	 */
	public IArithmeticOperand getLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(IArithmeticOperand newLeftOperand, NotificationChain msgs) {
		IArithmeticOperand oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	public void setLeftOperand(IArithmeticOperand newLeftOperand) {
		if (newLeftOperand != leftOperand) {
			NotificationChain msgs = null;
			if (leftOperand != null)
				msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND, null, msgs);
			if (newLeftOperand != null)
				msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND, null, msgs);
			msgs = basicSetLeftOperand(newLeftOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
	}

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(IArithmeticOperand)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression_RightOperand()
	 * @model containment="true"
	 * @generated
	 */
	public IArithmeticOperand getRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperand(IArithmeticOperand newRightOperand, NotificationChain msgs) {
		IArithmeticOperand oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	public void setRightOperand(IArithmeticOperand newRightOperand) {
		if (newRightOperand != rightOperand) {
			NotificationChain msgs = null;
			if (rightOperand != null)
				msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND, null, msgs);
			if (newRightOperand != null)
				msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND, null, msgs);
			msgs = basicSetRightOperand(newRightOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND, newRightOperand, newRightOperand));
	}

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression_Operator()
	 * @model
	 * @generated
	 */
	public ArithmeticOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	public void setOperator(ArithmeticOperator newOperator) {
		ArithmeticOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.BINARY_ARITHMETIC_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return basicSetRightOperand(null, msgs);
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
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__OPERATOR:
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
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((IArithmeticOperand)newValue);
				return;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((IArithmeticOperand)newValue);
				return;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__OPERATOR:
				setOperator((ArithmeticOperator)newValue);
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
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((IArithmeticOperand)null);
				return;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((IArithmeticOperand)null);
				return;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__OPERATOR:
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
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return leftOperand != null;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return rightOperand != null;
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION__OPERATOR:
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

} // BinaryArithmeticExpression
