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
      case IblPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case IblPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case IblPackage.FUNCTION_PARAMETER_MEMBER: return createFunctionParameterMember();
      case IblPackage.FUNCTION_DEFINITION_MEMBER: return createFunctionDefinitionMember();
      case IblPackage.VARIABLE_DEFINITION_MEMBER: return createVariableDefinitionMember();
      case IblPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case IblPackage.VARIABLE_TYPE: return createVariableType();
      case IblPackage.RULE_DEFINITION: return createRuleDefinition();
      case IblPackage.RULE_OBJECT: return createRuleObject();
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
  public FunctionDefinitionMember createFunctionDefinitionMember()
  {
    FunctionDefinitionMemberImpl functionDefinitionMember = new FunctionDefinitionMemberImpl();
    return functionDefinitionMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinitionMember createVariableDefinitionMember()
  {
    VariableDefinitionMemberImpl variableDefinitionMember = new VariableDefinitionMemberImpl();
    return variableDefinitionMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType createVariableType()
  {
    VariableTypeImpl variableType = new VariableTypeImpl();
    return variableType;
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