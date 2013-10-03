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
import roadblock.emf.ibl.Ibl.Molecule;
import roadblock.emf.ibl.Ibl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl#getInputList <em>Input List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl#getOutputList <em>Output List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl#getOptionList <em>Option List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements roadblock.emf.ibl.Ibl.Process {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleList() <em>Rule List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleList()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> ruleList;

	/**
	 * The cached value of the '{@link #getInputList() <em>Input List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputList()
	 * @generated
	 * @ordered
	 */
	protected EList<Molecule> inputList;

	/**
	 * The cached value of the '{@link #getOutputList() <em>Output List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputList()
	 * @generated
	 * @ordered
	 */
	protected EList<Molecule> outputList;

	/**
	 * The cached value of the '{@link #getOptionList() <em>Option List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Molecule> optionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.PROCESS__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Molecule> getInputList() {
		if (inputList == null) {
			inputList = new EObjectContainmentEList<Molecule>(Molecule.class, this, IblPackage.PROCESS__INPUT_LIST);
		}
		return inputList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Molecule> getOutputList() {
		if (outputList == null) {
			outputList = new EObjectContainmentEList<Molecule>(Molecule.class, this, IblPackage.PROCESS__OUTPUT_LIST);
		}
		return outputList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Molecule> getOptionList() {
		if (optionList == null) {
			optionList = new EObjectContainmentEList<Molecule>(Molecule.class, this, IblPackage.PROCESS__OPTION_LIST);
		}
		return optionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.PROCESS__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.PROCESS__INPUT_LIST:
				return ((InternalEList<?>)getInputList()).basicRemove(otherEnd, msgs);
			case IblPackage.PROCESS__OUTPUT_LIST:
				return ((InternalEList<?>)getOutputList()).basicRemove(otherEnd, msgs);
			case IblPackage.PROCESS__OPTION_LIST:
				return ((InternalEList<?>)getOptionList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.PROCESS__NAME:
				return getName();
			case IblPackage.PROCESS__RULE_LIST:
				return getRuleList();
			case IblPackage.PROCESS__INPUT_LIST:
				return getInputList();
			case IblPackage.PROCESS__OUTPUT_LIST:
				return getOutputList();
			case IblPackage.PROCESS__OPTION_LIST:
				return getOptionList();
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
			case IblPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case IblPackage.PROCESS__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.PROCESS__INPUT_LIST:
				getInputList().clear();
				getInputList().addAll((Collection<? extends Molecule>)newValue);
				return;
			case IblPackage.PROCESS__OUTPUT_LIST:
				getOutputList().clear();
				getOutputList().addAll((Collection<? extends Molecule>)newValue);
				return;
			case IblPackage.PROCESS__OPTION_LIST:
				getOptionList().clear();
				getOptionList().addAll((Collection<? extends Molecule>)newValue);
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
			case IblPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IblPackage.PROCESS__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.PROCESS__INPUT_LIST:
				getInputList().clear();
				return;
			case IblPackage.PROCESS__OUTPUT_LIST:
				getOutputList().clear();
				return;
			case IblPackage.PROCESS__OPTION_LIST:
				getOptionList().clear();
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
			case IblPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IblPackage.PROCESS__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.PROCESS__INPUT_LIST:
				return inputList != null && !inputList.isEmpty();
			case IblPackage.PROCESS__OUTPUT_LIST:
				return outputList != null && !outputList.isEmpty();
			case IblPackage.PROCESS__OPTION_LIST:
				return optionList != null && !optionList.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
