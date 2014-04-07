/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getURI <em>URI</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount <em>Amount</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit <em>Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRate <em>Degradation Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRate <em>Binding Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRate <em>Unbinding Rate</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBiologicalType <em>Biological Type</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getSequence <em>Sequence</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRateUnit <em>Degradation Rate Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRateUnit <em>Binding Rate Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRateUnit <em>Unbinding Rate Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies()
 * @model kind="class"
 * @generated
 */
public class MolecularSpecies extends EObjectImpl implements IVisitable {
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
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final ConcentrationUnit UNIT_EDEFAULT = ConcentrationUnit.M;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ConcentrationUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegradationRate() <em>Degradation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegradationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double DEGRADATION_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDegradationRate() <em>Degradation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegradationRate()
	 * @generated
	 * @ordered
	 */
	protected double degradationRate = DEGRADATION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingRate() <em>Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double BINDING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingRate() <em>Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRate()
	 * @generated
	 * @ordered
	 */
	protected Double bindingRate = BINDING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnbindingRate() <em>Unbinding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbindingRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double UNBINDING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnbindingRate() <em>Unbinding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbindingRate()
	 * @generated
	 * @ordered
	 */
	protected Double unbindingRate = UNBINDING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBiologicalType() <em>Biological Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalType()
	 * @generated
	 * @ordered
	 */
	protected static final String BIOLOGICAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBiologicalType() <em>Biological Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalType()
	 * @generated
	 * @ordered
	 */
	protected String biologicalType = BIOLOGICAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected String sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegradationRateUnit() <em>Degradation Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegradationRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGRADATION_RATE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegradationRateUnit() <em>Degradation Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegradationRateUnit()
	 * @generated
	 * @ordered
	 */
	protected String degradationRateUnit = DEGRADATION_RATE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingRateUnit() <em>Binding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_RATE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingRateUnit() <em>Binding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected String bindingRateUnit = BINDING_RATE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnbindingRateUnit() <em>Unbinding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbindingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNBINDING_RATE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnbindingRateUnit() <em>Unbinding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbindingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected String unbindingRateUnit = UNBINDING_RATE_UNIT_EDEFAULT;

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
	protected MolecularSpecies() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.MOLECULAR_SPECIES;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName <em>Display Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_URI()
	 * @model
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__URI, oldURI, uri));
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_Amount()
	 * @model
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__AMOUNT, oldAmount, amount));
	}

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.ConcentrationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @see #setUnit(ConcentrationUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_Unit()
	 * @model
	 * @generated
	 */
	public ConcentrationUnit getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @see #getUnit()
	 * @generated
	 */
	public void setUnit(ConcentrationUnit newUnit) {
		ConcentrationUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__UNIT, oldUnit, unit));
	}

	/**
	 * Returns the value of the '<em><b>Degradation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degradation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degradation Rate</em>' attribute.
	 * @see #setDegradationRate(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_DegradationRate()
	 * @model
	 * @generated
	 */
	public double getDegradationRate() {
		return degradationRate;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRate <em>Degradation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degradation Rate</em>' attribute.
	 * @see #getDegradationRate()
	 * @generated
	 */
	public void setDegradationRate(double newDegradationRate) {
		double oldDegradationRate = degradationRate;
		degradationRate = newDegradationRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE, oldDegradationRate, degradationRate));
	}

	/**
	 * Returns the value of the '<em><b>Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Rate</em>' attribute.
	 * @see #setBindingRate(Double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_BindingRate()
	 * @model
	 * @generated
	 */
	public Double getBindingRate() {
		return bindingRate;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRate <em>Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Rate</em>' attribute.
	 * @see #getBindingRate()
	 * @generated
	 */
	public void setBindingRate(Double newBindingRate) {
		Double oldBindingRate = bindingRate;
		bindingRate = newBindingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__BINDING_RATE, oldBindingRate, bindingRate));
	}

	/**
	 * Returns the value of the '<em><b>Unbinding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbinding Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbinding Rate</em>' attribute.
	 * @see #setUnbindingRate(Double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_UnbindingRate()
	 * @model
	 * @generated
	 */
	public Double getUnbindingRate() {
		return unbindingRate;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRate <em>Unbinding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbinding Rate</em>' attribute.
	 * @see #getUnbindingRate()
	 * @generated
	 */
	public void setUnbindingRate(Double newUnbindingRate) {
		Double oldUnbindingRate = unbindingRate;
		unbindingRate = newUnbindingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE, oldUnbindingRate, unbindingRate));
	}

	/**
	 * Returns the value of the '<em><b>Biological Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biological Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biological Type</em>' attribute.
	 * @see #setBiologicalType(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_BiologicalType()
	 * @model
	 * @generated
	 */
	public String getBiologicalType() {
		return biologicalType;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBiologicalType <em>Biological Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biological Type</em>' attribute.
	 * @see #getBiologicalType()
	 * @generated
	 */
	public void setBiologicalType(String newBiologicalType) {
		String oldBiologicalType = biologicalType;
		biologicalType = newBiologicalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__BIOLOGICAL_TYPE, oldBiologicalType, biologicalType));
	}

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_Sequence()
	 * @model
	 * @generated
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	public void setSequence(String newSequence) {
		String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * Returns the value of the '<em><b>Degradation Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degradation Rate Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degradation Rate Unit</em>' attribute.
	 * @see #setDegradationRateUnit(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_DegradationRateUnit()
	 * @model
	 * @generated
	 */
	public String getDegradationRateUnit() {
		return degradationRateUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRateUnit <em>Degradation Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degradation Rate Unit</em>' attribute.
	 * @see #getDegradationRateUnit()
	 * @generated
	 */
	public void setDegradationRateUnit(String newDegradationRateUnit) {
		String oldDegradationRateUnit = degradationRateUnit;
		degradationRateUnit = newDegradationRateUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT, oldDegradationRateUnit, degradationRateUnit));
	}

	/**
	 * Returns the value of the '<em><b>Binding Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Rate Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Rate Unit</em>' attribute.
	 * @see #setBindingRateUnit(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_BindingRateUnit()
	 * @model
	 * @generated
	 */
	public String getBindingRateUnit() {
		return bindingRateUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRateUnit <em>Binding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Rate Unit</em>' attribute.
	 * @see #getBindingRateUnit()
	 * @generated
	 */
	public void setBindingRateUnit(String newBindingRateUnit) {
		String oldBindingRateUnit = bindingRateUnit;
		bindingRateUnit = newBindingRateUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__BINDING_RATE_UNIT, oldBindingRateUnit, bindingRateUnit));
	}

	/**
	 * Returns the value of the '<em><b>Unbinding Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbinding Rate Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbinding Rate Unit</em>' attribute.
	 * @see #setUnbindingRateUnit(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_UnbindingRateUnit()
	 * @model
	 * @generated
	 */
	public String getUnbindingRateUnit() {
		return unbindingRateUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRateUnit <em>Unbinding Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbinding Rate Unit</em>' attribute.
	 * @see #getUnbindingRateUnit()
	 * @generated
	 */
	public void setUnbindingRateUnit(String newUnbindingRateUnit) {
		String oldUnbindingRateUnit = unbindingRateUnit;
		unbindingRateUnit = newUnbindingRateUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE_UNIT, oldUnbindingRateUnit, unbindingRateUnit));
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getID <em>ID</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.MOLECULAR_SPECIES__ID, oldID, id));
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
			case IblPackage.MOLECULAR_SPECIES__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.MOLECULAR_SPECIES__URI:
				return getURI();
			case IblPackage.MOLECULAR_SPECIES__AMOUNT:
				return getAmount();
			case IblPackage.MOLECULAR_SPECIES__UNIT:
				return getUnit();
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE:
				return getDegradationRate();
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE:
				return getBindingRate();
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE:
				return getUnbindingRate();
			case IblPackage.MOLECULAR_SPECIES__BIOLOGICAL_TYPE:
				return getBiologicalType();
			case IblPackage.MOLECULAR_SPECIES__SEQUENCE:
				return getSequence();
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT:
				return getDegradationRateUnit();
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE_UNIT:
				return getBindingRateUnit();
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE_UNIT:
				return getUnbindingRateUnit();
			case IblPackage.MOLECULAR_SPECIES__ID:
				return getID();
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
			case IblPackage.MOLECULAR_SPECIES__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__URI:
				setURI((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__AMOUNT:
				setAmount((Double)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNIT:
				setUnit((ConcentrationUnit)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE:
				setDegradationRate((Double)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE:
				setBindingRate((Double)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE:
				setUnbindingRate((Double)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__BIOLOGICAL_TYPE:
				setBiologicalType((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__SEQUENCE:
				setSequence((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT:
				setDegradationRateUnit((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE_UNIT:
				setBindingRateUnit((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE_UNIT:
				setUnbindingRateUnit((String)newValue);
				return;
			case IblPackage.MOLECULAR_SPECIES__ID:
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
			case IblPackage.MOLECULAR_SPECIES__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__URI:
				setURI(URI_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE:
				setDegradationRate(DEGRADATION_RATE_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE:
				setBindingRate(BINDING_RATE_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE:
				setUnbindingRate(UNBINDING_RATE_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__BIOLOGICAL_TYPE:
				setBiologicalType(BIOLOGICAL_TYPE_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT:
				setDegradationRateUnit(DEGRADATION_RATE_UNIT_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE_UNIT:
				setBindingRateUnit(BINDING_RATE_UNIT_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE_UNIT:
				setUnbindingRateUnit(UNBINDING_RATE_UNIT_EDEFAULT);
				return;
			case IblPackage.MOLECULAR_SPECIES__ID:
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
			case IblPackage.MOLECULAR_SPECIES__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.MOLECULAR_SPECIES__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IblPackage.MOLECULAR_SPECIES__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case IblPackage.MOLECULAR_SPECIES__UNIT:
				return unit != UNIT_EDEFAULT;
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE:
				return degradationRate != DEGRADATION_RATE_EDEFAULT;
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE:
				return BINDING_RATE_EDEFAULT == null ? bindingRate != null : !BINDING_RATE_EDEFAULT.equals(bindingRate);
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE:
				return UNBINDING_RATE_EDEFAULT == null ? unbindingRate != null : !UNBINDING_RATE_EDEFAULT.equals(unbindingRate);
			case IblPackage.MOLECULAR_SPECIES__BIOLOGICAL_TYPE:
				return BIOLOGICAL_TYPE_EDEFAULT == null ? biologicalType != null : !BIOLOGICAL_TYPE_EDEFAULT.equals(biologicalType);
			case IblPackage.MOLECULAR_SPECIES__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case IblPackage.MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT:
				return DEGRADATION_RATE_UNIT_EDEFAULT == null ? degradationRateUnit != null : !DEGRADATION_RATE_UNIT_EDEFAULT.equals(degradationRateUnit);
			case IblPackage.MOLECULAR_SPECIES__BINDING_RATE_UNIT:
				return BINDING_RATE_UNIT_EDEFAULT == null ? bindingRateUnit != null : !BINDING_RATE_UNIT_EDEFAULT.equals(bindingRateUnit);
			case IblPackage.MOLECULAR_SPECIES__UNBINDING_RATE_UNIT:
				return UNBINDING_RATE_UNIT_EDEFAULT == null ? unbindingRateUnit != null : !UNBINDING_RATE_UNIT_EDEFAULT.equals(unbindingRateUnit);
			case IblPackage.MOLECULAR_SPECIES__ID:
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
		result.append(" (DisplayName: ");
		result.append(displayName);
		result.append(", URI: ");
		result.append(uri);
		result.append(", amount: ");
		result.append(amount);
		result.append(", unit: ");
		result.append(unit);
		result.append(", degradationRate: ");
		result.append(degradationRate);
		result.append(", bindingRate: ");
		result.append(bindingRate);
		result.append(", unbindingRate: ");
		result.append(unbindingRate);
		result.append(", biologicalType: ");
		result.append(biologicalType);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(", degradationRateUnit: ");
		result.append(degradationRateUnit);
		result.append(", bindingRateUnit: ");
		result.append(bindingRateUnit);
		result.append(", unbindingRateUnit: ");
		result.append(unbindingRateUnit);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // MolecularSpecies
