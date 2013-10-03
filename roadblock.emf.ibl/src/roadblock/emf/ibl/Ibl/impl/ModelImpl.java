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

import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.IblPackage;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.Molecule;
import roadblock.emf.ibl.Ibl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getCellList <em>Cell List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getDeviceList <em>Device List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.ModelImpl#getMoleculeList <em>Molecule List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
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
	 * The cached value of the '{@link #getProcessList() <em>Process List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessList()
	 * @generated
	 * @ordered
	 */
	protected EList<roadblock.emf.ibl.Ibl.Process> processList;

	/**
	 * The cached value of the '{@link #getCellList() <em>Cell List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellList()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cellList;

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
	 * The cached value of the '{@link #getDeviceList() <em>Device List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceList()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> deviceList;

	/**
	 * The cached value of the '{@link #getMoleculeList() <em>Molecule List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoleculeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Molecule> moleculeList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<roadblock.emf.ibl.Ibl.Process> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<roadblock.emf.ibl.Ibl.Process>(roadblock.emf.ibl.Ibl.Process.class, this, IblPackage.MODEL__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCellList() {
		if (cellList == null) {
			cellList = new EObjectContainmentEList<Cell>(Cell.class, this, IblPackage.MODEL__CELL_LIST);
		}
		return cellList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.MODEL__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDeviceList() {
		if (deviceList == null) {
			deviceList = new EObjectContainmentEList<Device>(Device.class, this, IblPackage.MODEL__DEVICE_LIST);
		}
		return deviceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Molecule> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<Molecule>(Molecule.class, this, IblPackage.MODEL__MOLECULE_LIST);
		}
		return moleculeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.MODEL__PROCESS_LIST:
				return ((InternalEList<?>)getProcessList()).basicRemove(otherEnd, msgs);
			case IblPackage.MODEL__CELL_LIST:
				return ((InternalEList<?>)getCellList()).basicRemove(otherEnd, msgs);
			case IblPackage.MODEL__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.MODEL__DEVICE_LIST:
				return ((InternalEList<?>)getDeviceList()).basicRemove(otherEnd, msgs);
			case IblPackage.MODEL__MOLECULE_LIST:
				return ((InternalEList<?>)getMoleculeList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.MODEL__NAME:
				return getName();
			case IblPackage.MODEL__PROCESS_LIST:
				return getProcessList();
			case IblPackage.MODEL__CELL_LIST:
				return getCellList();
			case IblPackage.MODEL__RULE_LIST:
				return getRuleList();
			case IblPackage.MODEL__DEVICE_LIST:
				return getDeviceList();
			case IblPackage.MODEL__MOLECULE_LIST:
				return getMoleculeList();
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
			case IblPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case IblPackage.MODEL__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends roadblock.emf.ibl.Ibl.Process>)newValue);
				return;
			case IblPackage.MODEL__CELL_LIST:
				getCellList().clear();
				getCellList().addAll((Collection<? extends Cell>)newValue);
				return;
			case IblPackage.MODEL__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.MODEL__DEVICE_LIST:
				getDeviceList().clear();
				getDeviceList().addAll((Collection<? extends Device>)newValue);
				return;
			case IblPackage.MODEL__MOLECULE_LIST:
				getMoleculeList().clear();
				getMoleculeList().addAll((Collection<? extends Molecule>)newValue);
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
			case IblPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IblPackage.MODEL__PROCESS_LIST:
				getProcessList().clear();
				return;
			case IblPackage.MODEL__CELL_LIST:
				getCellList().clear();
				return;
			case IblPackage.MODEL__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.MODEL__DEVICE_LIST:
				getDeviceList().clear();
				return;
			case IblPackage.MODEL__MOLECULE_LIST:
				getMoleculeList().clear();
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
			case IblPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IblPackage.MODEL__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
			case IblPackage.MODEL__CELL_LIST:
				return cellList != null && !cellList.isEmpty();
			case IblPackage.MODEL__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.MODEL__DEVICE_LIST:
				return deviceList != null && !deviceList.isEmpty();
			case IblPackage.MODEL__MOLECULE_LIST:
				return moleculeList != null && !moleculeList.isEmpty();
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

} //ModelImpl
