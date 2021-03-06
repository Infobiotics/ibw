/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage
 * @generated
 */
public class IblFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IblFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IblFactory init() {
		try {
			IblFactory theIblFactory = (IblFactory)EPackage.Registry.INSTANCE.getEFactory(IblPackage.eNS_URI);
			if (theIblFactory != null) {
				return theIblFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IblFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IblFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IblPackage.MODEL: return (EObject)createModel();
			case IblPackage.KINETICS: return (EObject)createKinetics();
			case IblPackage.RULE: return (EObject)createRule();
			case IblPackage.MOLECULAR_SPECIES: return (EObject)createMolecularSpecies();
			case IblPackage.DEVICE: return (EObject)createDevice();
			case IblPackage.CELL: return (EObject)createCell();
			case IblPackage.ATGC_DIRECTIVE: return (EObject)createATGCDirective();
			case IblPackage.SYSTEM: return (EObject)createSystem();
			case IblPackage.CHROMOSOME: return (EObject)createChromosome();
			case IblPackage.PLASMID: return (EObject)createPlasmid();
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT: return (EObject)createConcreteProbabilityConstraint();
			case IblPackage.UNKNOWN_PROBABILITY_CONSTRAINT: return (EObject)createUnknownProbabilityConstraint();
			case IblPackage.TIME_INTERVAL: return (EObject)createTimeInterval();
			case IblPackage.TIME_INSTANT: return (EObject)createTimeInstant();
			case IblPackage.UNARY_PROBABILITY_PROPERTY: return (EObject)createUnaryProbabilityProperty();
			case IblPackage.BINARY_PROBABILITY_PROPERTY: return (EObject)createBinaryProbabilityProperty();
			case IblPackage.REWARD_PROPERTY: return (EObject)createRewardProperty();
			case IblPackage.STEADY_STATE_PROPERTY: return (EObject)createSteadyStateProperty();
			case IblPackage.CONCENTRATION_CONSTRAINT: return (EObject)createConcentrationConstraint();
			case IblPackage.BINARY_STATE_FORMULA: return (EObject)createBinaryStateFormula();
			case IblPackage.NOT_STATE_FORMULA: return (EObject)createNotStateFormula();
			case IblPackage.STATE_EXPRESSION: return (EObject)createStateExpression();
			case IblPackage.REGION: return (EObject)createRegion();
			case IblPackage.EMF_VARIABLE_ASSIGNMENT: return (EObject)createEMFVariableAssignment();
			case IblPackage.FLAT_MODEL: return (EObject)createFlatModel();
			case IblPackage.PROPERTY_INITIAL_CONDITION: return (EObject)createPropertyInitialCondition();
			case IblPackage.RATE_UNIT: return (EObject)createRateUnit();
			case IblPackage.ATGC_DIRECTION: return (EObject)createATGCDirection();
			case IblPackage.ATGC_ARRANGE: return (EObject)createATGCArrange();
			case IblPackage.ATGC_CLONING_SITES: return (EObject)createATGCCloningSites();
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR: return (EObject)createFlatModelPropertyPair();
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION: return (EObject)createBinaryArithmeticExpression();
			case IblPackage.NUMERIC_LITERAL: return (EObject)createNumericLiteral();
			case IblPackage.VARIABLE_REFERENCE: return (EObject)createVariableReference();
			case IblPackage.MONOTONICITY_EXPRESSION: return (EObject)createMonotonicityExpression();
			case IblPackage.RELATIONAL_EXPRESSION: return (EObject)createRelationalExpression();
			case IblPackage.CONCENTRATION_QUANTITY: return (EObject)createConcentrationQuantity();
			case IblPackage.ATGC_TRANSLATION_RATE: return (EObject)createATGCTranslationRate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IblPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case IblPackage.TEMPORAL_PATTERN:
				return createTemporalPatternFromString(eDataType, initialValue);
			case IblPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case IblPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case IblPackage.CONCENTRATION_UNIT:
				return createConcentrationUnitFromString(eDataType, initialValue);
			case IblPackage.RATE_TIME_UNIT:
				return createRateTimeUnitFromString(eDataType, initialValue);
			case IblPackage.RATE_CONCENTRATION_UNIT:
				return createRateConcentrationUnitFromString(eDataType, initialValue);
			case IblPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case IblPackage.MONOTONICITY_TYPE:
				return createMonotonicityTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IblPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case IblPackage.TEMPORAL_PATTERN:
				return convertTemporalPatternToString(eDataType, instanceValue);
			case IblPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case IblPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case IblPackage.CONCENTRATION_UNIT:
				return convertConcentrationUnitToString(eDataType, instanceValue);
			case IblPackage.RATE_TIME_UNIT:
				return convertRateTimeUnitToString(eDataType, instanceValue);
			case IblPackage.RATE_CONCENTRATION_UNIT:
				return convertRateConcentrationUnitToString(eDataType, instanceValue);
			case IblPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case IblPackage.MONOTONICITY_TYPE:
				return convertMonotonicityTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		Model model = new Model();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kinetics createKinetics() {
		Kinetics kinetics = new Kinetics();
		return kinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		Rule rule = new Rule();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSpecies createMolecularSpecies() {
		MolecularSpecies molecularSpecies = new MolecularSpecies();
		return molecularSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		Device device = new Device();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		Cell cell = new Cell();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATGCDirective createATGCDirective() {
		ATGCDirective atgcDirective = new ATGCDirective();
		return atgcDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public System createSystem() {
		System system = new System();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromosome createChromosome() {
		Chromosome chromosome = new Chromosome();
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plasmid createPlasmid() {
		Plasmid plasmid = new Plasmid();
		return plasmid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteProbabilityConstraint createConcreteProbabilityConstraint() {
		ConcreteProbabilityConstraint concreteProbabilityConstraint = new ConcreteProbabilityConstraint();
		return concreteProbabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownProbabilityConstraint createUnknownProbabilityConstraint() {
		UnknownProbabilityConstraint unknownProbabilityConstraint = new UnknownProbabilityConstraint();
		return unknownProbabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeInterval timeInterval = new TimeInterval();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInstant createTimeInstant() {
		TimeInstant timeInstant = new TimeInstant();
		return timeInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryProbabilityProperty createUnaryProbabilityProperty() {
		UnaryProbabilityProperty unaryProbabilityProperty = new UnaryProbabilityProperty();
		return unaryProbabilityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryProbabilityProperty createBinaryProbabilityProperty() {
		BinaryProbabilityProperty binaryProbabilityProperty = new BinaryProbabilityProperty();
		return binaryProbabilityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewardProperty createRewardProperty() {
		RewardProperty rewardProperty = new RewardProperty();
		return rewardProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteadyStateProperty createSteadyStateProperty() {
		SteadyStateProperty steadyStateProperty = new SteadyStateProperty();
		return steadyStateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcentrationConstraint createConcentrationConstraint() {
		ConcentrationConstraint concentrationConstraint = new ConcentrationConstraint();
		return concentrationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryStateFormula createBinaryStateFormula() {
		BinaryStateFormula binaryStateFormula = new BinaryStateFormula();
		return binaryStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotStateFormula createNotStateFormula() {
		NotStateFormula notStateFormula = new NotStateFormula();
		return notStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExpression createStateExpression() {
		StateExpression stateExpression = new StateExpression();
		return stateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		Region region = new Region();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVariableAssignment createEMFVariableAssignment() {
		EMFVariableAssignment emfVariableAssignment = new EMFVariableAssignment();
		return emfVariableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatModel createFlatModel() {
		FlatModel flatModel = new FlatModel();
		return flatModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyInitialCondition createPropertyInitialCondition() {
		PropertyInitialCondition propertyInitialCondition = new PropertyInitialCondition();
		return propertyInitialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateUnit createRateUnit() {
		RateUnit rateUnit = new RateUnit();
		return rateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATGCDirection createATGCDirection() {
		ATGCDirection atgcDirection = new ATGCDirection();
		return atgcDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATGCArrange createATGCArrange() {
		ATGCArrange atgcArrange = new ATGCArrange();
		return atgcArrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATGCCloningSites createATGCCloningSites() {
		ATGCCloningSites atgcCloningSites = new ATGCCloningSites();
		return atgcCloningSites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatModelPropertyPair createFlatModelPropertyPair() {
		FlatModelPropertyPair flatModelPropertyPair = new FlatModelPropertyPair();
		return flatModelPropertyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryArithmeticExpression createBinaryArithmeticExpression() {
		BinaryArithmeticExpression binaryArithmeticExpression = new BinaryArithmeticExpression();
		return binaryArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericLiteral createNumericLiteral() {
		NumericLiteral numericLiteral = new NumericLiteral();
		return numericLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReference variableReference = new VariableReference();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonotonicityExpression createMonotonicityExpression() {
		MonotonicityExpression monotonicityExpression = new MonotonicityExpression();
		return monotonicityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpression relationalExpression = new RelationalExpression();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcentrationQuantity createConcentrationQuantity() {
		ConcentrationQuantity concentrationQuantity = new ConcentrationQuantity();
		return concentrationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATGCTranslationRate createATGCTranslationRate() {
		ATGCTranslationRate atgcTranslationRate = new ATGCTranslationRate();
		return atgcTranslationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPattern createTemporalPatternFromString(EDataType eDataType, String initialValue) {
		TemporalPattern result = TemporalPattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcentrationUnit createConcentrationUnitFromString(EDataType eDataType, String initialValue) {
		ConcentrationUnit result = ConcentrationUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcentrationUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateTimeUnit createRateTimeUnitFromString(EDataType eDataType, String initialValue) {
		RateTimeUnit result = RateTimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateConcentrationUnit createRateConcentrationUnitFromString(EDataType eDataType, String initialValue) {
		RateConcentrationUnit result = RateConcentrationUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateConcentrationUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonotonicityType createMonotonicityTypeFromString(EDataType eDataType, String initialValue) {
		MonotonicityType result = MonotonicityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonotonicityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IblPackage getIblPackage() {
		return (IblPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IblPackage getPackage() {
		return IblPackage.eINSTANCE;
	}

} //IblFactory
