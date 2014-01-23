/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import roadblock.xtext.ibl.ibl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IblFactoryImpl extends EFactoryImpl implements IblFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IblFactory init()
  {
    try
    {
      IblFactory theIblFactory = (IblFactory)EPackage.Registry.INSTANCE.getEFactory(IblPackage.eNS_URI);
      if (theIblFactory != null)
      {
        return theIblFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IblFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IblFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IblPackage.MODEL: return createModel();
      case IblPackage.MODEL_MEMBER: return createModelMember();
      case IblPackage.IMPORT_STATEMENT: return createImportStatement();
      case IblPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case IblPackage.PROCESS_BODY: return createProcessBody();
      case IblPackage.SYSTEM_BODY: return createSystemBody();
      case IblPackage.PLASMID_BODY: return createPlasmidBody();
      case IblPackage.CHROMOSOME_BODY: return createChromosomeBody();
      case IblPackage.CELL_BODY: return createCellBody();
      case IblPackage.REGION_BODY: return createRegionBody();
      case IblPackage.CUSTOM_FUNCTION_BODY: return createCustomFunctionBody();
      case IblPackage.PROCESS_BODY_MEMBER: return createProcessBodyMember();
      case IblPackage.SYSTEM_BODY_MEMBER: return createSystemBodyMember();
      case IblPackage.PLASMID_BODY_MEMBER: return createPlasmidBodyMember();
      case IblPackage.CHROMOSOME_BODY_MEMBER: return createChromosomeBodyMember();
      case IblPackage.CELL_BODY_MEMBER: return createCellBodyMember();
      case IblPackage.REGION_BODY_MEMBER: return createRegionBodyMember();
      case IblPackage.CUSTOM_FUNCTION_BODY_MEMBER: return createCustomFunctionBodyMember();
      case IblPackage.FUNCTION_PARAMETER_MEMBER: return createFunctionParameterMember();
      case IblPackage.FUNCTION_USE_MEMBER: return createFunctionUseMember();
      case IblPackage.DEVICE_DEFINITION: return createDeviceDefinition();
      case IblPackage.DEVICE_MEMBERS: return createDeviceMembers();
      case IblPackage.PROCESS_INSTANTIATION: return createProcessInstantiation();
      case IblPackage.SYSTEM_INSTANTIATION: return createSystemInstantiation();
      case IblPackage.PLASMID_INSTANTIATION: return createPlasmidInstantiation();
      case IblPackage.CHROMOSOME_INSTANTIATION: return createChromosomeInstantiation();
      case IblPackage.CELL_INSTANTIATION: return createCellInstantiation();
      case IblPackage.VARIABLE_COMPLEX: return createVariableComplex();
      case IblPackage.VARIABLE_ATTRIBUTE: return createVariableAttribute();
      case IblPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case IblPackage.VARIABLE_DEFINITION_BUILT_IN: return createVariableDefinitionBuiltIn();
      case IblPackage.VARIABLE_DEFINITION_USER_DEFINED: return createVariableDefinitionUserDefined();
      case IblPackage.VARIABLE_DEFINITION_COLLECTION: return createVariableDefinitionCollection();
      case IblPackage.VARIABLE_DEFINITION_BASIC: return createVariableDefinitionBasic();
      case IblPackage.PARAMETER_ASSIGNMENT: return createParameterAssignment();
      case IblPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case IblPackage.VARIABLE_ASSIGNMENT_OBJECT: return createVariableAssignmentObject();
      case IblPackage.VARIABLE_EXPRESSION: return createVariableExpression();
      case IblPackage.VARIABLE_EXPRESSION_OBJECT: return createVariableExpressionObject();
      case IblPackage.ATOMIC_VARIABLE_EXPRESSION_OBJECT: return createAtomicVariableExpressionObject();
      case IblPackage.COMPOUND_VARIABLE_EXPRESSION_OBJECT: return createCompoundVariableExpressionObject();
      case IblPackage.RULE_DEFINITION: return createRuleDefinition();
      case IblPackage.RULE_OBJECT: return createRuleObject();
      case IblPackage.ATGC_DEFINITION: return createATGCDefinition();
      case IblPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case IblPackage.PROBABILITY_PROPERTY: return createProbabilityProperty();
      case IblPackage.REWARD_PROPERTY: return createRewardProperty();
      case IblPackage.STATE_EXPRESSION: return createStateExpression();
      case IblPackage.STATE_FORMULA: return createStateFormula();
      case IblPackage.TIME_INSTANT: return createTimeInstant();
      case IblPackage.TIME_INTERVAL: return createTimeInterval();
      case IblPackage.REWARD_TIME_INSTANT: return createRewardTimeInstant();
      case IblPackage.PROBABILITY_CONSTRAINT: return createProbabilityConstraint();
      case IblPackage.CONCENTRATION_CONSTRAINT: return createConcentrationConstraint();
      case IblPackage.PROPERTY_INITIAL_CONDITION: return createPropertyInitialCondition();
      case IblPackage.QUANTITY: return createQuantity();
      case IblPackage.CONCENTRATION_QUANTITY: return createConcentrationQuantity();
      case IblPackage.LIST: return createList();
      case IblPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMember createModelMember()
  {
    ModelMemberImpl modelMember = new ModelMemberImpl();
    return modelMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessBody createProcessBody()
  {
    ProcessBodyImpl processBody = new ProcessBodyImpl();
    return processBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemBody createSystemBody()
  {
    SystemBodyImpl systemBody = new SystemBodyImpl();
    return systemBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlasmidBody createPlasmidBody()
  {
    PlasmidBodyImpl plasmidBody = new PlasmidBodyImpl();
    return plasmidBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChromosomeBody createChromosomeBody()
  {
    ChromosomeBodyImpl chromosomeBody = new ChromosomeBodyImpl();
    return chromosomeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellBody createCellBody()
  {
    CellBodyImpl cellBody = new CellBodyImpl();
    return cellBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionBody createRegionBody()
  {
    RegionBodyImpl regionBody = new RegionBodyImpl();
    return regionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFunctionBody createCustomFunctionBody()
  {
    CustomFunctionBodyImpl customFunctionBody = new CustomFunctionBodyImpl();
    return customFunctionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessBodyMember createProcessBodyMember()
  {
    ProcessBodyMemberImpl processBodyMember = new ProcessBodyMemberImpl();
    return processBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemBodyMember createSystemBodyMember()
  {
    SystemBodyMemberImpl systemBodyMember = new SystemBodyMemberImpl();
    return systemBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlasmidBodyMember createPlasmidBodyMember()
  {
    PlasmidBodyMemberImpl plasmidBodyMember = new PlasmidBodyMemberImpl();
    return plasmidBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChromosomeBodyMember createChromosomeBodyMember()
  {
    ChromosomeBodyMemberImpl chromosomeBodyMember = new ChromosomeBodyMemberImpl();
    return chromosomeBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellBodyMember createCellBodyMember()
  {
    CellBodyMemberImpl cellBodyMember = new CellBodyMemberImpl();
    return cellBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionBodyMember createRegionBodyMember()
  {
    RegionBodyMemberImpl regionBodyMember = new RegionBodyMemberImpl();
    return regionBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFunctionBodyMember createCustomFunctionBodyMember()
  {
    CustomFunctionBodyMemberImpl customFunctionBodyMember = new CustomFunctionBodyMemberImpl();
    return customFunctionBodyMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionParameterMember createFunctionParameterMember()
  {
    FunctionParameterMemberImpl functionParameterMember = new FunctionParameterMemberImpl();
    return functionParameterMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionUseMember createFunctionUseMember()
  {
    FunctionUseMemberImpl functionUseMember = new FunctionUseMemberImpl();
    return functionUseMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceDefinition createDeviceDefinition()
  {
    DeviceDefinitionImpl deviceDefinition = new DeviceDefinitionImpl();
    return deviceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceMembers createDeviceMembers()
  {
    DeviceMembersImpl deviceMembers = new DeviceMembersImpl();
    return deviceMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessInstantiation createProcessInstantiation()
  {
    ProcessInstantiationImpl processInstantiation = new ProcessInstantiationImpl();
    return processInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation createSystemInstantiation()
  {
    SystemInstantiationImpl systemInstantiation = new SystemInstantiationImpl();
    return systemInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlasmidInstantiation createPlasmidInstantiation()
  {
    PlasmidInstantiationImpl plasmidInstantiation = new PlasmidInstantiationImpl();
    return plasmidInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChromosomeInstantiation createChromosomeInstantiation()
  {
    ChromosomeInstantiationImpl chromosomeInstantiation = new ChromosomeInstantiationImpl();
    return chromosomeInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellInstantiation createCellInstantiation()
  {
    CellInstantiationImpl cellInstantiation = new CellInstantiationImpl();
    return cellInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableComplex createVariableComplex()
  {
    VariableComplexImpl variableComplex = new VariableComplexImpl();
    return variableComplex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAttribute createVariableAttribute()
  {
    VariableAttributeImpl variableAttribute = new VariableAttributeImpl();
    return variableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinitionBuiltIn createVariableDefinitionBuiltIn()
  {
    VariableDefinitionBuiltInImpl variableDefinitionBuiltIn = new VariableDefinitionBuiltInImpl();
    return variableDefinitionBuiltIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinitionUserDefined createVariableDefinitionUserDefined()
  {
    VariableDefinitionUserDefinedImpl variableDefinitionUserDefined = new VariableDefinitionUserDefinedImpl();
    return variableDefinitionUserDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinitionCollection createVariableDefinitionCollection()
  {
    VariableDefinitionCollectionImpl variableDefinitionCollection = new VariableDefinitionCollectionImpl();
    return variableDefinitionCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinitionBasic createVariableDefinitionBasic()
  {
    VariableDefinitionBasicImpl variableDefinitionBasic = new VariableDefinitionBasicImpl();
    return variableDefinitionBasic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAssignment createParameterAssignment()
  {
    ParameterAssignmentImpl parameterAssignment = new ParameterAssignmentImpl();
    return parameterAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignment createVariableAssignment()
  {
    VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
    return variableAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignmentObject createVariableAssignmentObject()
  {
    VariableAssignmentObjectImpl variableAssignmentObject = new VariableAssignmentObjectImpl();
    return variableAssignmentObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableExpression createVariableExpression()
  {
    VariableExpressionImpl variableExpression = new VariableExpressionImpl();
    return variableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableExpressionObject createVariableExpressionObject()
  {
    VariableExpressionObjectImpl variableExpressionObject = new VariableExpressionObjectImpl();
    return variableExpressionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicVariableExpressionObject createAtomicVariableExpressionObject()
  {
    AtomicVariableExpressionObjectImpl atomicVariableExpressionObject = new AtomicVariableExpressionObjectImpl();
    return atomicVariableExpressionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundVariableExpressionObject createCompoundVariableExpressionObject()
  {
    CompoundVariableExpressionObjectImpl compoundVariableExpressionObject = new CompoundVariableExpressionObjectImpl();
    return compoundVariableExpressionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDefinition createRuleDefinition()
  {
    RuleDefinitionImpl ruleDefinition = new RuleDefinitionImpl();
    return ruleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleObject createRuleObject()
  {
    RuleObjectImpl ruleObject = new RuleObjectImpl();
    return ruleObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ATGCDefinition createATGCDefinition()
  {
    ATGCDefinitionImpl atgcDefinition = new ATGCDefinitionImpl();
    return atgcDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefinition createPropertyDefinition()
  {
    PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
    return propertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbabilityProperty createProbabilityProperty()
  {
    ProbabilityPropertyImpl probabilityProperty = new ProbabilityPropertyImpl();
    return probabilityProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RewardProperty createRewardProperty()
  {
    RewardPropertyImpl rewardProperty = new RewardPropertyImpl();
    return rewardProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateExpression createStateExpression()
  {
    StateExpressionImpl stateExpression = new StateExpressionImpl();
    return stateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateFormula createStateFormula()
  {
    StateFormulaImpl stateFormula = new StateFormulaImpl();
    return stateFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeInstant createTimeInstant()
  {
    TimeInstantImpl timeInstant = new TimeInstantImpl();
    return timeInstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeInterval createTimeInterval()
  {
    TimeIntervalImpl timeInterval = new TimeIntervalImpl();
    return timeInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RewardTimeInstant createRewardTimeInstant()
  {
    RewardTimeInstantImpl rewardTimeInstant = new RewardTimeInstantImpl();
    return rewardTimeInstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbabilityConstraint createProbabilityConstraint()
  {
    ProbabilityConstraintImpl probabilityConstraint = new ProbabilityConstraintImpl();
    return probabilityConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcentrationConstraint createConcentrationConstraint()
  {
    ConcentrationConstraintImpl concentrationConstraint = new ConcentrationConstraintImpl();
    return concentrationConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyInitialCondition createPropertyInitialCondition()
  {
    PropertyInitialConditionImpl propertyInitialCondition = new PropertyInitialConditionImpl();
    return propertyInitialCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantity createQuantity()
  {
    QuantityImpl quantity = new QuantityImpl();
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcentrationQuantity createConcentrationQuantity()
  {
    ConcentrationQuantityImpl concentrationQuantity = new ConcentrationQuantityImpl();
    return concentrationQuantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IblPackage getIblPackage()
  {
    return (IblPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IblPackage getPackage()
  {
    return IblPackage.eINSTANCE;
  }

} //IblFactoryImpl
