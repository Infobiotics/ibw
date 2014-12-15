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
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getKinetics <em>Kinetics</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getMoleculeList <em>Molecule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getCellList <em>Cell List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Region#getVariableAssignmentList <em>Variable Assignment List</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion()
 * @model kind="class"
 * @generated
 */
public class Region extends EObjectImpl implements IVisitable, IRuleContainer, IMoleculeContainer {
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
	 * The cached value of the '{@link #getKinetics() <em>Kinetics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinetics()
	 * @generated
	 * @ordered
	 */
	protected Kinetics kinetics;

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
	 * The cached value of the '{@link #getMoleculeList() <em>Molecule List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoleculeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> moleculeList;

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
	 * The cached value of the '{@link #getCellList() <em>Cell List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellList()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cellList;

	/**
	 * The cached value of the '{@link #getVariableAssignmentList() <em>Variable Assignment List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAssignmentList()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFVariableAssignment> variableAssignmentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Region() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.REGION;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Region#getDisplayName <em>Display Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REGION__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinetics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinetics</em>' containment reference.
	 * @see #setKinetics(Kinetics)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_Kinetics()
	 * @model containment="true"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.REGION__KINETICS, oldKinetics, newKinetics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Region#getKinetics <em>Kinetics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinetics</em>' containment reference.
	 * @see #getKinetics()
	 * @generated
	 */
	public void setKinetics(Kinetics newKinetics) {
		if (newKinetics != kinetics) {
			NotificationChain msgs = null;
			if (kinetics != null)
				msgs = ((InternalEObject)kinetics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.REGION__KINETICS, null, msgs);
			if (newKinetics != null)
				msgs = ((InternalEObject)newKinetics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.REGION__KINETICS, null, msgs);
			msgs = basicSetKinetics(newKinetics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REGION__KINETICS, newKinetics, newKinetics));
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.REGION__RULE_LIST);
		}
		return ruleList;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_MoleculeList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.REGION__MOLECULE_LIST);
		}
		return moleculeList;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Region#getID <em>ID</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.REGION__ID, oldID, id));
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_CellList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Cell> getCellList() {
		if (cellList == null) {
			cellList = new EObjectContainmentEList<Cell>(Cell.class, this, IblPackage.REGION__CELL_LIST);
		}
		return cellList;
	}

	/**
	 * Returns the value of the '<em><b>Variable Assignment List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.EMFVariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Assignment List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignment List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion_VariableAssignmentList()
	 * @model containment="true"
	 * @generated
	 */
	public List<EMFVariableAssignment> getVariableAssignmentList() {
		if (variableAssignmentList == null) {
			variableAssignmentList = new EObjectContainmentEList<EMFVariableAssignment>(EMFVariableAssignment.class, this, IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST);
		}
		return variableAssignmentList;
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
			case IblPackage.REGION__KINETICS:
				return basicSetKinetics(null, msgs);
			case IblPackage.REGION__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.REGION__MOLECULE_LIST:
				return ((InternalEList<?>)getMoleculeList()).basicRemove(otherEnd, msgs);
			case IblPackage.REGION__CELL_LIST:
				return ((InternalEList<?>)getCellList()).basicRemove(otherEnd, msgs);
			case IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST:
				return ((InternalEList<?>)getVariableAssignmentList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.REGION__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.REGION__KINETICS:
				return getKinetics();
			case IblPackage.REGION__RULE_LIST:
				return getRuleList();
			case IblPackage.REGION__MOLECULE_LIST:
				return getMoleculeList();
			case IblPackage.REGION__ID:
				return getID();
			case IblPackage.REGION__CELL_LIST:
				return getCellList();
			case IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST:
				return getVariableAssignmentList();
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
			case IblPackage.REGION__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.REGION__KINETICS:
				setKinetics((Kinetics)newValue);
				return;
			case IblPackage.REGION__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.REGION__MOLECULE_LIST:
				getMoleculeList().clear();
				getMoleculeList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.REGION__ID:
				setID((String)newValue);
				return;
			case IblPackage.REGION__CELL_LIST:
				getCellList().clear();
				getCellList().addAll((Collection<? extends Cell>)newValue);
				return;
			case IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
				getVariableAssignmentList().addAll((Collection<? extends EMFVariableAssignment>)newValue);
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
			case IblPackage.REGION__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.REGION__KINETICS:
				setKinetics((Kinetics)null);
				return;
			case IblPackage.REGION__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.REGION__MOLECULE_LIST:
				getMoleculeList().clear();
				return;
			case IblPackage.REGION__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.REGION__CELL_LIST:
				getCellList().clear();
				return;
			case IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
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
			case IblPackage.REGION__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.REGION__KINETICS:
				return kinetics != null;
			case IblPackage.REGION__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.REGION__MOLECULE_LIST:
				return moleculeList != null && !moleculeList.isEmpty();
			case IblPackage.REGION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.REGION__CELL_LIST:
				return cellList != null && !cellList.isEmpty();
			case IblPackage.REGION__VARIABLE_ASSIGNMENT_LIST:
				return variableAssignmentList != null && !variableAssignmentList.isEmpty();
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

} // Region
