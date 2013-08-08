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
      IblFactory theIblFactory = (IblFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.roadblock/ibl/Ibl"); 
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
      case IblPackage.FUNCTION_PARAMETER_MEMBER: return createFunctionParameterMember();
      case IblPackage.FUNCTION_BODY_MEMBER: return createFunctionBodyMember();
      case IblPackage.FUNCTION_USE_MEMBER: return createFunctionUseMember();
      case IblPackage.VARIABLE_COMPLEX: return createVariableComplex();
      case IblPackage.VARIABLE_ATTRIBUTE: return createVariableAttribute();
      case IblPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case IblPackage.PARAMETER_ASSIGNMENT: return createParameterAssignment();
      case IblPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case IblPackage.VARIABLE_ASSIGNMENT_OBJECT: return createVariableAssignmentObject();
      case IblPackage.VARIABLE_EXPRESSION: return createVariableExpression();
      case IblPackage.VARIABLE_EXPRESSION_OBJECT: return createVariableExpressionObject();
      case IblPackage.ATOMIC_VARIABLE_EXPRESSION_OBJECT: return createAtomicVariableExpressionObject();
      case IblPackage.COMPOUND_VARIABLE_EXPRESSION_OBJECT: return createCompoundVariableExpressionObject();
      case IblPackage.RULE_DEFINITION: return createRuleDefinition();
      case IblPackage.RULE_OBJECT: return createRuleObject();
      case IblPackage.DEVICE_DEFINITION: return createDeviceDefinition();
      case IblPackage.DEVICE_MEMBERS: return createDeviceMembers();
      case IblPackage.ATGC_DEFINITION: return createATGCDefinition();
      case IblPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case IblPackage.PROPERTY: return createProperty();
      case IblPackage.PROPERTY_CONDITION: return createPropertyCondition();
      case IblPackage.QUANTITY: return createQuantity();
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
  public FunctionBodyMember createFunctionBodyMember()
  {
    FunctionBodyMemberImpl functionBodyMember = new FunctionBodyMemberImpl();
    return functionBodyMember;
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
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyCondition createPropertyCondition()
  {
    PropertyConditionImpl propertyCondition = new PropertyConditionImpl();
    return propertyCondition;
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
