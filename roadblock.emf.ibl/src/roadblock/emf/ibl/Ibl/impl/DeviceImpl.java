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

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.IblPackage;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getPartList <em>Part List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getATGCCommandList <em>ATGC Command List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl#getKinetics <em>Kinetics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends EObjectImpl implements Device {
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
	 * The cached value of the '{@link #getRuleList() <em>Rule List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleList()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> ruleList;

	/**
	 * The cached value of the '{@link #getPartList() <em>Part List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> partList;

	/**
	 * The cached value of the '{@link #getATGCCommandList() <em>ATGC Command List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATGCCommandList()
	 * @generated
	 * @ordered
	 */
	protected EList<ATGCDirective> atgcCommandList;

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
	 * The cached value of the '{@link #getKinetics() <em>Kinetics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinetics()
	 * @generated
	 * @ordered
	 */
	protected Kinetics kinetics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kinetics> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<Kinetics>(Kinetics.class, this, IblPackage.DEVICE__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.DEVICE__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSpecies> getPartList() {
		if (partList == null) {
			partList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.DEVICE__PART_LIST);
		}
		return partList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATGCDirective> getATGCCommandList() {
		if (atgcCommandList == null) {
			atgcCommandList = new EObjectContainmentEList<ATGCDirective>(ATGCDirective.class, this, IblPackage.DEVICE__ATGC_COMMAND_LIST);
		}
		return atgcCommandList;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kinetics getKinetics() {
		return kinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinetics(Kinetics newKinetics, NotificationChain msgs) {
		Kinetics oldKinetics = kinetics;
		kinetics = newKinetics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__KINETICS, oldKinetics, newKinetics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKinetics(Kinetics newKinetics) {
		if (newKinetics != kinetics) {
			NotificationChain msgs = null;
			if (kinetics != null)
				msgs = ((InternalEObject)kinetics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.DEVICE__KINETICS, null, msgs);
			if (newKinetics != null)
				msgs = ((InternalEObject)newKinetics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.DEVICE__KINETICS, null, msgs);
			msgs = basicSetKinetics(newKinetics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__KINETICS, newKinetics, newKinetics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.DEVICE__PROCESS_LIST:
				return ((InternalEList<?>)getProcessList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__PART_LIST:
				return ((InternalEList<?>)getPartList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return ((InternalEList<?>)getATGCCommandList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__KINETICS:
				return basicSetKinetics(null, msgs);
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.DEVICE__PROCESS_LIST:
				return getProcessList();
			case IblPackage.DEVICE__RULE_LIST:
				return getRuleList();
			case IblPackage.DEVICE__PART_LIST:
				return getPartList();
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return getATGCCommandList();
			case IblPackage.DEVICE__ID:
				return getID();
			case IblPackage.DEVICE__KINETICS:
				return getKinetics();
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.DEVICE__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Kinetics>)newValue);
				return;
			case IblPackage.DEVICE__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.DEVICE__PART_LIST:
				getPartList().clear();
				getPartList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				getATGCCommandList().addAll((Collection<? extends ATGCDirective>)newValue);
				return;
			case IblPackage.DEVICE__ID:
				setID((String)newValue);
				return;
			case IblPackage.DEVICE__KINETICS:
				setKinetics((Kinetics)newValue);
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.DEVICE__PROCESS_LIST:
				getProcessList().clear();
				return;
			case IblPackage.DEVICE__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.DEVICE__PART_LIST:
				getPartList().clear();
				return;
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				return;
			case IblPackage.DEVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.DEVICE__KINETICS:
				setKinetics((Kinetics)null);
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.DEVICE__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
			case IblPackage.DEVICE__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.DEVICE__PART_LIST:
				return partList != null && !partList.isEmpty();
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return atgcCommandList != null && !atgcCommandList.isEmpty();
			case IblPackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.DEVICE__KINETICS:
				return kinetics != null;
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

} //DeviceImpl
