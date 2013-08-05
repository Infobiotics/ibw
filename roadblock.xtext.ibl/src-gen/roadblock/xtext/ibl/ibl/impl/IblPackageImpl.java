/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import roadblock.xtext.ibl.ibl.ATGCDefinition;
import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.DeviceMembers;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionDefinitionMember;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblFactory;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Import;
import roadblock.xtext.ibl.ibl.Model;
import roadblock.xtext.ibl.ibl.ModelMember;
import roadblock.xtext.ibl.ibl.ProcessDeclaration;
import roadblock.xtext.ibl.ibl.Property;
import roadblock.xtext.ibl.ibl.PropertyCondition;
import roadblock.xtext.ibl.ibl.PropertyDefinition;
import roadblock.xtext.ibl.ibl.PropertyStatement;
import roadblock.xtext.ibl.ibl.Quantity;
import roadblock.xtext.ibl.ibl.RuleDefinition;
import roadblock.xtext.ibl.ibl.RuleObject;
import roadblock.xtext.ibl.ibl.VariableAssignment;
import roadblock.xtext.ibl.ibl.VariableAttribute;
import roadblock.xtext.ibl.ibl.VariableDeclaration;
import roadblock.xtext.ibl.ibl.VariableDefinition;
import roadblock.xtext.ibl.ibl.VariableDefinitionMember;
import roadblock.xtext.ibl.ibl.VariableExpression;
import roadblock.xtext.ibl.ibl.VerificationStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IblPackageImpl extends EPackageImpl implements IblPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionParameterMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionUseMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceMembersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atgcDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantityEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see roadblock.xtext.ibl.ibl.IblPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IblPackageImpl()
  {
    super(eNS_URI, IblFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link IblPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IblPackage init()
  {
    if (isInited) return (IblPackage)EPackage.Registry.INSTANCE.getEPackage(IblPackage.eNS_URI);

    // Obtain or create and register package
    IblPackageImpl theIblPackage = (IblPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IblPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IblPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theIblPackage.createPackageContents();

    // Initialize created meta-data
    theIblPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIblPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IblPackage.eNS_URI, theIblPackage);
    return theIblPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Members()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelMember()
  {
    return modelMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Type()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Name()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinition_Members()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinition()
  {
    return functionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDefinition_Type()
  {
    return (EAttribute)functionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDefinition_Name()
  {
    return (EAttribute)functionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Parameters()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Members()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Uses()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionParameterMember()
  {
    return functionParameterMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameterMember_Type()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameterMember_Name()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameterMember_Scope()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinitionMember()
  {
    return functionDefinitionMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionUseMember()
  {
    return functionUseMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionUseMember_Type()
  {
    return (EAttribute)functionUseMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionUseMember_Name()
  {
    return (EAttribute)functionUseMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinitionMember()
  {
    return variableDefinitionMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Qualifier()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Type()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Collection()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Constructor()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Parameters()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAssignment()
  {
    return variableAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Variable()
  {
    return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Expression()
  {
    return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAttribute()
  {
    return variableAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAttribute_Name()
  {
    return (EAttribute)variableAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAttribute_Attribute()
  {
    return (EAttribute)variableAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableExpression()
  {
    return variableExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableExpression_Members()
  {
    return (EReference)variableExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleDefinition()
  {
    return ruleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDefinition_Name()
  {
    return (EAttribute)ruleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleDefinition_Lhs()
  {
    return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleDefinition_Rhs()
  {
    return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleObject()
  {
    return ruleObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleObject_Subobjects()
  {
    return (EAttribute)ruleObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessDeclaration()
  {
    return processDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessDeclaration_Constructor()
  {
    return (EAttribute)processDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessDeclaration_Parameters()
  {
    return (EReference)processDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceDefinition()
  {
    return deviceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceDefinition_Name()
  {
    return (EAttribute)deviceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceDefinition_Parts()
  {
    return (EAttribute)deviceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceDefinition_Parameters()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceDefinition_Members()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceMembers()
  {
    return deviceMembersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceMembers_Name()
  {
    return (EAttribute)deviceMembersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getATGCDefinition()
  {
    return atgcDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getATGCDefinition_Command()
  {
    return (EAttribute)atgcDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getATGCDefinition_Arguments()
  {
    return (EAttribute)atgcDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyStatement()
  {
    return propertyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyStatement_Arguments()
  {
    return (EAttribute)propertyStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationStatement()
  {
    return verificationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationStatement_Property()
  {
    return (EReference)verificationStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationStatement_Condition()
  {
    return (EReference)verificationStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationStatement_Time()
  {
    return (EAttribute)verificationStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationStatement_Operator()
  {
    return (EAttribute)verificationStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationStatement_Concentration()
  {
    return (EReference)verificationStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Lhs()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Operator()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Rhs()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyCondition()
  {
    return propertyConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCondition_LowerBound()
  {
    return (EAttribute)propertyConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCondition_UpperBounds()
  {
    return (EAttribute)propertyConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCondition_Operator()
  {
    return (EAttribute)propertyConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCondition_Probability()
  {
    return (EAttribute)propertyConditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantity()
  {
    return quantityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantity_Value()
  {
    return (EAttribute)quantityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantity_Units()
  {
    return (EAttribute)quantityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IblFactory getIblFactory()
  {
    return (IblFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MEMBERS);

    modelMemberEClass = createEClass(MODEL_MEMBER);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__TYPE);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__NAME);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__MEMBERS);

    functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
    createEAttribute(functionDefinitionEClass, FUNCTION_DEFINITION__TYPE);
    createEAttribute(functionDefinitionEClass, FUNCTION_DEFINITION__NAME);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PARAMETERS);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__MEMBERS);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__USES);

    functionParameterMemberEClass = createEClass(FUNCTION_PARAMETER_MEMBER);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__TYPE);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__NAME);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__SCOPE);

    functionDefinitionMemberEClass = createEClass(FUNCTION_DEFINITION_MEMBER);

    functionUseMemberEClass = createEClass(FUNCTION_USE_MEMBER);
    createEAttribute(functionUseMemberEClass, FUNCTION_USE_MEMBER__TYPE);
    createEAttribute(functionUseMemberEClass, FUNCTION_USE_MEMBER__NAME);

    variableDefinitionMemberEClass = createEClass(VARIABLE_DEFINITION_MEMBER);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__QUALIFIER);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__COLLECTION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__CONSTRUCTOR);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__PARAMETERS);

    variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);

    variableAttributeEClass = createEClass(VARIABLE_ATTRIBUTE);
    createEAttribute(variableAttributeEClass, VARIABLE_ATTRIBUTE__NAME);
    createEAttribute(variableAttributeEClass, VARIABLE_ATTRIBUTE__ATTRIBUTE);

    variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
    createEReference(variableExpressionEClass, VARIABLE_EXPRESSION__MEMBERS);

    ruleDefinitionEClass = createEClass(RULE_DEFINITION);
    createEAttribute(ruleDefinitionEClass, RULE_DEFINITION__NAME);
    createEReference(ruleDefinitionEClass, RULE_DEFINITION__LHS);
    createEReference(ruleDefinitionEClass, RULE_DEFINITION__RHS);

    ruleObjectEClass = createEClass(RULE_OBJECT);
    createEAttribute(ruleObjectEClass, RULE_OBJECT__SUBOBJECTS);

    processDeclarationEClass = createEClass(PROCESS_DECLARATION);
    createEAttribute(processDeclarationEClass, PROCESS_DECLARATION__CONSTRUCTOR);
    createEReference(processDeclarationEClass, PROCESS_DECLARATION__PARAMETERS);

    deviceDefinitionEClass = createEClass(DEVICE_DEFINITION);
    createEAttribute(deviceDefinitionEClass, DEVICE_DEFINITION__NAME);
    createEAttribute(deviceDefinitionEClass, DEVICE_DEFINITION__PARTS);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__PARAMETERS);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__MEMBERS);

    deviceMembersEClass = createEClass(DEVICE_MEMBERS);
    createEAttribute(deviceMembersEClass, DEVICE_MEMBERS__NAME);

    atgcDefinitionEClass = createEClass(ATGC_DEFINITION);
    createEAttribute(atgcDefinitionEClass, ATGC_DEFINITION__COMMAND);
    createEAttribute(atgcDefinitionEClass, ATGC_DEFINITION__ARGUMENTS);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);

    propertyStatementEClass = createEClass(PROPERTY_STATEMENT);
    createEAttribute(propertyStatementEClass, PROPERTY_STATEMENT__ARGUMENTS);

    verificationStatementEClass = createEClass(VERIFICATION_STATEMENT);
    createEReference(verificationStatementEClass, VERIFICATION_STATEMENT__PROPERTY);
    createEReference(verificationStatementEClass, VERIFICATION_STATEMENT__CONDITION);
    createEAttribute(verificationStatementEClass, VERIFICATION_STATEMENT__TIME);
    createEAttribute(verificationStatementEClass, VERIFICATION_STATEMENT__OPERATOR);
    createEReference(verificationStatementEClass, VERIFICATION_STATEMENT__CONCENTRATION);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__LHS);
    createEAttribute(propertyEClass, PROPERTY__OPERATOR);
    createEReference(propertyEClass, PROPERTY__RHS);

    propertyConditionEClass = createEClass(PROPERTY_CONDITION);
    createEAttribute(propertyConditionEClass, PROPERTY_CONDITION__LOWER_BOUND);
    createEAttribute(propertyConditionEClass, PROPERTY_CONDITION__UPPER_BOUNDS);
    createEAttribute(propertyConditionEClass, PROPERTY_CONDITION__OPERATOR);
    createEAttribute(propertyConditionEClass, PROPERTY_CONDITION__PROBABILITY);

    quantityEClass = createEClass(QUANTITY);
    createEAttribute(quantityEClass, QUANTITY__VALUE);
    createEAttribute(quantityEClass, QUANTITY__UNITS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importEClass.getESuperTypes().add(this.getModelMember());
    variableDefinitionEClass.getESuperTypes().add(this.getModelMember());
    functionDefinitionEClass.getESuperTypes().add(this.getModelMember());
    variableDeclarationEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    variableDeclarationEClass.getESuperTypes().add(this.getVariableDefinitionMember());
    variableAssignmentEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    ruleDefinitionEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    processDeclarationEClass.getESuperTypes().add(this.getDeviceMembers());
    deviceDefinitionEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    atgcDefinitionEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    propertyDefinitionEClass.getESuperTypes().add(this.getFunctionDefinitionMember());
    propertyDefinitionEClass.getESuperTypes().add(this.getDeviceMembers());
    propertyStatementEClass.getESuperTypes().add(this.getPropertyDefinition());
    verificationStatementEClass.getESuperTypes().add(this.getPropertyDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Members(), this.getModelMember(), null, "members", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelMemberEClass, ModelMember.class, "ModelMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinition_Members(), this.getVariableDefinitionMember(), null, "members", null, 0, -1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Parameters(), this.getFunctionParameterMember(), null, "parameters", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Members(), this.getFunctionDefinitionMember(), null, "members", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Uses(), this.getFunctionUseMember(), null, "uses", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionParameterMemberEClass, FunctionParameterMember.class, "FunctionParameterMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionParameterMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParameterMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParameterMember_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionMemberEClass, FunctionDefinitionMember.class, "FunctionDefinitionMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionUseMemberEClass, FunctionUseMember.class, "FunctionUseMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionUseMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionUseMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionUseMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionUseMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionMemberEClass, VariableDefinitionMember.class, "VariableDefinitionMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Collection(), ecorePackage.getEString(), "collection", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Parameters(), this.getVariableAssignment(), null, "parameters", null, 0, -1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableAssignment_Variable(), this.getVariableAttribute(), null, "variable", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableAssignment_Expression(), this.getVariableExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAttributeEClass, VariableAttribute.class, "VariableAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, VariableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableExpression_Members(), this.getVariableAttribute(), null, "members", null, 0, -1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleDefinitionEClass, RuleDefinition.class, "RuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleDefinition_Lhs(), this.getRuleObject(), null, "lhs", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleDefinition_Rhs(), this.getRuleObject(), null, "rhs", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleObjectEClass, RuleObject.class, "RuleObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleObject_Subobjects(), ecorePackage.getEString(), "subobjects", null, 0, -1, RuleObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processDeclarationEClass, ProcessDeclaration.class, "ProcessDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessDeclaration_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessDeclaration_Parameters(), this.getVariableAssignment(), null, "parameters", null, 0, -1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceDefinitionEClass, DeviceDefinition.class, "DeviceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceDefinition_Parts(), ecorePackage.getEString(), "parts", null, 0, -1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Parameters(), this.getVariableAssignment(), null, "parameters", null, 0, -1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Members(), this.getDeviceMembers(), null, "members", null, 0, -1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceMembersEClass, DeviceMembers.class, "DeviceMembers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceMembers_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atgcDefinitionEClass, ATGCDefinition.class, "ATGCDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getATGCDefinition_Command(), ecorePackage.getEString(), "command", null, 0, 1, ATGCDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getATGCDefinition_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, ATGCDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyStatementEClass, PropertyStatement.class, "PropertyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyStatement_Arguments(), ecorePackage.getEString(), "arguments", null, 0, 1, PropertyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationStatementEClass, VerificationStatement.class, "VerificationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationStatement_Property(), this.getProperty(), null, "property", null, 0, -1, VerificationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationStatement_Condition(), this.getPropertyCondition(), null, "condition", null, 0, 1, VerificationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationStatement_Time(), ecorePackage.getEString(), "time", null, 0, 1, VerificationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationStatement_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, VerificationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationStatement_Concentration(), this.getQuantity(), null, "concentration", null, 0, 1, VerificationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Lhs(), ecorePackage.getEString(), "lhs", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Rhs(), this.getQuantity(), null, "rhs", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyConditionEClass, PropertyCondition.class, "PropertyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyCondition_LowerBound(), ecorePackage.getEString(), "lowerBound", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyCondition_UpperBounds(), ecorePackage.getEString(), "upperBounds", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyCondition_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyCondition_Probability(), ecorePackage.getEString(), "probability", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantity_Value(), ecorePackage.getEString(), "value", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantity_Units(), ecorePackage.getEString(), "units", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //IblPackageImpl
