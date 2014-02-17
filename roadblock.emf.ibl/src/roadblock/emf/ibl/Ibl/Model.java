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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getCellList <em>Cell List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getDeviceList <em>Device List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getMoleculeList <em>Molecule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getATGCcommandList <em>ATG Ccommand List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Model#getRegionList <em>Region List</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel()
 * @model kind="class"
 * @generated
 */
public class Model extends EObjectImpl implements IVisitable {
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
	 * The cached value of the '{@link #getProcessList() <em>Process List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessList()
	 * @generated
	 * @ordered
	 */
	protected EList<Kinetics> processList;

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
	protected EList<MolecularSpecies> moleculeList;

	/**
	 * The cached value of the '{@link #getATGCcommandList() <em>ATG Ccommand List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATGCcommandList()
	 * @generated
	 * @ordered
	 */
	protected EList<ATGCDirective> atgCcommandList;

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
	 * The cached value of the '{@link #getRegionList() <em>Region List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model() {
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
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Model#getDisplayName <em>Display Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MODEL__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>Process List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Kinetics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_ProcessList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Kinetics> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<Kinetics>(Kinetics.class, this, IblPackage.MODEL__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * Returns the value of the '<em><b>Cell List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_CellList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Cell> getCellList() {
		if (cellList == null) {
			cellList = new EObjectContainmentEList<Cell>(Cell.class, this, IblPackage.MODEL__CELL_LIST);
		}
		return cellList;
	}

	/**
	 * Returns the value of the '<em><b>Rule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.MODEL__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * Returns the value of the '<em><b>Device List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_DeviceList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Device> getDeviceList() {
		if (deviceList == null) {
			deviceList = new EObjectContainmentEList<Device>(Device.class, this, IblPackage.MODEL__DEVICE_LIST);
		}
		return deviceList;
	}

	/**
	 * Returns the value of the '<em><b>Molecule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecule List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_MoleculeList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.MODEL__MOLECULE_LIST);
		}
		return moleculeList;
	}

	/**
	 * Returns the value of the '<em><b>ATG Ccommand List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.ATGCDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATG Ccommand List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATG Ccommand List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_ATGCcommandList()
	 * @model containment="true"
	 * @generated
	 */
	public List<ATGCDirective> getATGCcommandList() {
		if (atgCcommandList == null) {
			atgCcommandList = new EObjectContainmentEList<ATGCDirective>(ATGCDirective.class, this, IblPackage.MODEL__ATG_CCOMMAND_LIST);
		}
		return atgCcommandList;
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Model#getID <em>ID</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MODEL__ID, oldID, id));
	}

	/**
	 * Returns the value of the '<em><b>Region List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel_RegionList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Region> getRegionList() {
		if (regionList == null) {
			regionList = new EObjectContainmentEList<Region>(Region.class, this, IblPackage.MODEL__REGION_LIST);
		}
		return regionList;
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
			case IblPackage.MODEL__ATG_CCOMMAND_LIST:
				return ((InternalEList<?>)getATGCcommandList()).basicRemove(otherEnd, msgs);
			case IblPackage.MODEL__REGION_LIST:
				return ((InternalEList<?>)getRegionList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.MODEL__DISPLAY_NAME:
				return getDisplayName();
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
			case IblPackage.MODEL__ATG_CCOMMAND_LIST:
				return getATGCcommandList();
			case IblPackage.MODEL__ID:
				return getID();
			case IblPackage.MODEL__REGION_LIST:
				return getRegionList();
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
			case IblPackage.MODEL__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.MODEL__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Kinetics>)newValue);
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
				getMoleculeList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.MODEL__ATG_CCOMMAND_LIST:
				getATGCcommandList().clear();
				getATGCcommandList().addAll((Collection<? extends ATGCDirective>)newValue);
				return;
			case IblPackage.MODEL__ID:
				setID((String)newValue);
				return;
			case IblPackage.MODEL__REGION_LIST:
				getRegionList().clear();
				getRegionList().addAll((Collection<? extends Region>)newValue);
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
			case IblPackage.MODEL__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
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
			case IblPackage.MODEL__ATG_CCOMMAND_LIST:
				getATGCcommandList().clear();
				return;
			case IblPackage.MODEL__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.MODEL__REGION_LIST:
				getRegionList().clear();
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
			case IblPackage.MODEL__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
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
			case IblPackage.MODEL__ATG_CCOMMAND_LIST:
				return atgCcommandList != null && !atgCcommandList.isEmpty();
			case IblPackage.MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.MODEL__REGION_LIST:
				return regionList != null && !regionList.isEmpty();
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
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // Model
