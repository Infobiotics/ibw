/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import roadblock.xtext.ibl.ibl.ATGCDefinition;
import roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject;
import roadblock.xtext.ibl.ibl.CellBody;
import roadblock.xtext.ibl.ibl.CellInstantiation;
import roadblock.xtext.ibl.ibl.ChromosomeBody;
import roadblock.xtext.ibl.ibl.ChromosomeInstantiation;
import roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject;
import roadblock.xtext.ibl.ibl.ConcentrationConstraint;
import roadblock.xtext.ibl.ibl.ConcentrationQuantity;
import roadblock.xtext.ibl.ibl.CustomFunctionBody;
import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.DeviceMembers;
import roadblock.xtext.ibl.ibl.FunctionBodyMember;
import roadblock.xtext.ibl.ibl.FunctionBodyType;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblFactory;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Import;
import roadblock.xtext.ibl.ibl.ImportStatement;
import roadblock.xtext.ibl.ibl.List;
import roadblock.xtext.ibl.ibl.Model;
import roadblock.xtext.ibl.ibl.ModelMember;
import roadblock.xtext.ibl.ibl.ParameterAssignment;
import roadblock.xtext.ibl.ibl.PlasmidBody;
import roadblock.xtext.ibl.ibl.PlasmidInstantiation;
import roadblock.xtext.ibl.ibl.ProbabilityConstraint;
import roadblock.xtext.ibl.ibl.ProbabilityProperty;
import roadblock.xtext.ibl.ibl.ProcessBody;
import roadblock.xtext.ibl.ibl.ProcessInstantiation;
import roadblock.xtext.ibl.ibl.PropertyDefinition;
import roadblock.xtext.ibl.ibl.PropertyInitialCondition;
import roadblock.xtext.ibl.ibl.Quantity;
import roadblock.xtext.ibl.ibl.RegionBody;
import roadblock.xtext.ibl.ibl.RewardProperty;
import roadblock.xtext.ibl.ibl.RewardTimeInstant;
import roadblock.xtext.ibl.ibl.RuleDefinition;
import roadblock.xtext.ibl.ibl.RuleObject;
import roadblock.xtext.ibl.ibl.StateExpression;
import roadblock.xtext.ibl.ibl.StateFormula;
import roadblock.xtext.ibl.ibl.SystemBody;
import roadblock.xtext.ibl.ibl.SystemInstantiation;
import roadblock.xtext.ibl.ibl.TimeInstant;
import roadblock.xtext.ibl.ibl.TimeInterval;
import roadblock.xtext.ibl.ibl.VariableAssignment;
import roadblock.xtext.ibl.ibl.VariableAssignmentObject;
import roadblock.xtext.ibl.ibl.VariableAttribute;
import roadblock.xtext.ibl.ibl.VariableComplex;
import roadblock.xtext.ibl.ibl.VariableDefinition;
import roadblock.xtext.ibl.ibl.VariableDefinitionBasic;
import roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn;
import roadblock.xtext.ibl.ibl.VariableDefinitionCollection;
import roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined;
import roadblock.xtext.ibl.ibl.VariableExpression;
import roadblock.xtext.ibl.ibl.VariableExpressionObject;

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
  private EClass importStatementEClass = null;

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
  private EClass functionBodyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plasmidBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chromosomeBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customFunctionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBodyMemberEClass = null;

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
  private EClass functionUseMemberEClass = null;

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
  private EClass processInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plasmidInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chromosomeInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableComplexEClass = null;

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
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionBuiltInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionUserDefinedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionBasicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterAssignmentEClass = null;

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
  private EClass variableAssignmentObjectEClass = null;

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
  private EClass variableExpressionObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicVariableExpressionObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundVariableExpressionObjectEClass = null;

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
  private EClass probabilityPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewardPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeInstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewardTimeInstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass probabilityConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concentrationConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyInitialConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concentrationQuantityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
  public EClass getImportStatement()
  {
    return importStatementEClass;
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
  public EAttribute getFunctionDefinition_Name()
  {
    return (EAttribute)functionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_FunctionBody()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Uses()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBodyType()
  {
    return functionBodyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBodyType_Parameters()
  {
    return (EReference)functionBodyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBodyType_Members()
  {
    return (EReference)functionBodyTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessBody()
  {
    return processBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemBody()
  {
    return systemBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlasmidBody()
  {
    return plasmidBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChromosomeBody()
  {
    return chromosomeBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellBody()
  {
    return cellBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegionBody()
  {
    return regionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomFunctionBody()
  {
    return customFunctionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomFunctionBody_FunctionType()
  {
    return (EAttribute)customFunctionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBodyMember()
  {
    return functionBodyMemberEClass;
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
  public EAttribute getFunctionParameterMember_Collection()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameterMember_Name()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameterMember_Scope()
  {
    return (EAttribute)functionParameterMemberEClass.getEStructuralFeatures().get(3);
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
  public EReference getDeviceDefinition_Parts()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceDefinition_Input()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceDefinition_Outputput()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceDefinition_Members()
  {
    return (EReference)deviceDefinitionEClass.getEStructuralFeatures().get(4);
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
  public EClass getProcessInstantiation()
  {
    return processInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessInstantiation_Name()
  {
    return (EAttribute)processInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessInstantiation_Constructor()
  {
    return (EAttribute)processInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessInstantiation_Parameters()
  {
    return (EReference)processInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemInstantiation()
  {
    return systemInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemInstantiation_Name()
  {
    return (EAttribute)systemInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemInstantiation_Constructor()
  {
    return (EAttribute)systemInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemInstantiation_Parameters()
  {
    return (EReference)systemInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlasmidInstantiation()
  {
    return plasmidInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlasmidInstantiation_Name()
  {
    return (EAttribute)plasmidInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlasmidInstantiation_Constructor()
  {
    return (EAttribute)plasmidInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlasmidInstantiation_Parameters()
  {
    return (EReference)plasmidInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChromosomeInstantiation()
  {
    return chromosomeInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChromosomeInstantiation_Name()
  {
    return (EAttribute)chromosomeInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChromosomeInstantiation_Constructor()
  {
    return (EAttribute)chromosomeInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChromosomeInstantiation_Parameters()
  {
    return (EReference)chromosomeInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellInstantiation()
  {
    return cellInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellInstantiation_Name()
  {
    return (EAttribute)cellInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellInstantiation_Constructor()
  {
    return (EAttribute)cellInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellInstantiation_Parameters()
  {
    return (EReference)cellInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableComplex()
  {
    return variableComplexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableComplex_Components()
  {
    return (EAttribute)variableComplexEClass.getEStructuralFeatures().get(0);
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
  public EReference getVariableAttribute_Complex()
  {
    return (EReference)variableAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAttribute_Attribute()
  {
    return (EAttribute)variableAttributeEClass.getEStructuralFeatures().get(2);
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
  public EReference getVariableDefinition_Definition()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Qualifier()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinitionBuiltIn()
  {
    return variableDefinitionBuiltInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionBuiltIn_Type()
  {
    return (EAttribute)variableDefinitionBuiltInEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionBuiltIn_Name()
  {
    return (EAttribute)variableDefinitionBuiltInEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinitionBuiltIn_Complex()
  {
    return (EReference)variableDefinitionBuiltInEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionBuiltIn_Constructor()
  {
    return (EAttribute)variableDefinitionBuiltInEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinitionBuiltIn_Parameters()
  {
    return (EReference)variableDefinitionBuiltInEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinitionUserDefined()
  {
    return variableDefinitionUserDefinedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionUserDefined_Type()
  {
    return (EAttribute)variableDefinitionUserDefinedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionUserDefined_Name()
  {
    return (EAttribute)variableDefinitionUserDefinedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionUserDefined_Constructor()
  {
    return (EAttribute)variableDefinitionUserDefinedEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinitionUserDefined_Parameters()
  {
    return (EReference)variableDefinitionUserDefinedEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinitionCollection()
  {
    return variableDefinitionCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionCollection_Collection()
  {
    return (EAttribute)variableDefinitionCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionCollection_Type()
  {
    return (EAttribute)variableDefinitionCollectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionCollection_Name()
  {
    return (EAttribute)variableDefinitionCollectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinitionCollection_Value()
  {
    return (EReference)variableDefinitionCollectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinitionBasic()
  {
    return variableDefinitionBasicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionBasic_Type()
  {
    return (EAttribute)variableDefinitionBasicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinitionBasic_Name()
  {
    return (EAttribute)variableDefinitionBasicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinitionBasic_Expression()
  {
    return (EReference)variableDefinitionBasicEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterAssignment()
  {
    return parameterAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAssignment_Name()
  {
    return (EAttribute)parameterAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAssignment_Value()
  {
    return (EReference)parameterAssignmentEClass.getEStructuralFeatures().get(1);
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
  public EClass getVariableAssignmentObject()
  {
    return variableAssignmentObjectEClass;
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
  public EClass getVariableExpressionObject()
  {
    return variableExpressionObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicVariableExpressionObject()
  {
    return atomicVariableExpressionObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicVariableExpressionObject_Variable()
  {
    return (EAttribute)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicVariableExpressionObject_Attribute()
  {
    return (EReference)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicVariableExpressionObject_Complex()
  {
    return (EReference)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicVariableExpressionObject_Value()
  {
    return (EAttribute)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicVariableExpressionObject_Quantity()
  {
    return (EReference)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicVariableExpressionObject_String()
  {
    return (EAttribute)atomicVariableExpressionObjectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundVariableExpressionObject()
  {
    return compoundVariableExpressionObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundVariableExpressionObject_List()
  {
    return (EReference)compoundVariableExpressionObjectEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getRuleDefinition_Reversible()
  {
    return (EAttribute)ruleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleDefinition_Rhs()
  {
    return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(3);
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
  public EReference getPropertyDefinition_Property()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProbabilityProperty()
  {
    return probabilityPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_StateFormula1()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsEventually()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsNever()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsAlways()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsUntilThen()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsFollowedBy()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_StateFormula2()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_TimeInstant()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_TimeInterval()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsSteadyState()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_IsInfinitelyOften()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_ProbabilityConstraint()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbabilityProperty_InitialConditions()
  {
    return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRewardProperty()
  {
    return rewardPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardProperty_Name()
  {
    return (EAttribute)rewardPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewardProperty_TimeInstant()
  {
    return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewardProperty_ConcentrationConstraint()
  {
    return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewardProperty_InitialConditions()
  {
    return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateExpression()
  {
    return stateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateExpression_Name()
  {
    return (EAttribute)stateExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateExpression_Operator()
  {
    return (EAttribute)stateExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateExpression_ConcentrationQuantity()
  {
    return (EReference)stateExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateFormula()
  {
    return stateFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateFormula_Formula()
  {
    return (EAttribute)stateFormulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFormula_AtomicFormula()
  {
    return (EReference)stateFormulaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateFormula_IsNegation()
  {
    return (EAttribute)stateFormulaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFormula_NegatedFormula()
  {
    return (EReference)stateFormulaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFormula_LeftFormula()
  {
    return (EReference)stateFormulaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateFormula_IsConjunction()
  {
    return (EAttribute)stateFormulaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateFormula_IsDisjunction()
  {
    return (EAttribute)stateFormulaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateFormula_IsImplication()
  {
    return (EAttribute)stateFormulaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFormula_RightFormula()
  {
    return (EReference)stateFormulaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeInstant()
  {
    return timeInstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInstant_IsEqualTo()
  {
    return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInstant_TimeInstant()
  {
    return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInstant_IsLessThanOrEqual()
  {
    return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInstant_IsGreaterThanOrEqual()
  {
    return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInstant_TimeUnit()
  {
    return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeInterval()
  {
    return timeIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_LowerBound()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_UpperBound()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_TimeUnit()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRewardTimeInstant()
  {
    return rewardTimeInstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardTimeInstant_IsEqualTo()
  {
    return (EAttribute)rewardTimeInstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardTimeInstant_IsLessThanOrEqual()
  {
    return (EAttribute)rewardTimeInstantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardTimeInstant_TimeValue()
  {
    return (EAttribute)rewardTimeInstantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardTimeInstant_TimeUnit()
  {
    return (EAttribute)rewardTimeInstantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProbabilityConstraint()
  {
    return probabilityConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityConstraint_Operator()
  {
    return (EAttribute)probabilityConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityConstraint_Probability()
  {
    return (EAttribute)probabilityConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityConstraint_HasUnknownProbability()
  {
    return (EAttribute)probabilityConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcentrationConstraint()
  {
    return concentrationConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationConstraint_Operator()
  {
    return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationConstraint_Value()
  {
    return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationConstraint_Unit()
  {
    return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationConstraint_IsUnknown()
  {
    return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyInitialCondition()
  {
    return propertyInitialConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyInitialCondition_Variable()
  {
    return (EReference)propertyInitialConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyInitialCondition_Value()
  {
    return (EReference)propertyInitialConditionEClass.getEStructuralFeatures().get(1);
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
  public EClass getConcentrationQuantity()
  {
    return concentrationQuantityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationQuantity_Value()
  {
    return (EAttribute)concentrationQuantityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcentrationQuantity_Unit()
  {
    return (EAttribute)concentrationQuantityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Entries()
  {
    return (EReference)listEClass.getEStructuralFeatures().get(0);
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

    importStatementEClass = createEClass(IMPORT_STATEMENT);

    functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
    createEAttribute(functionDefinitionEClass, FUNCTION_DEFINITION__NAME);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__FUNCTION_BODY);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__USES);

    functionBodyTypeEClass = createEClass(FUNCTION_BODY_TYPE);
    createEReference(functionBodyTypeEClass, FUNCTION_BODY_TYPE__PARAMETERS);
    createEReference(functionBodyTypeEClass, FUNCTION_BODY_TYPE__MEMBERS);

    processBodyEClass = createEClass(PROCESS_BODY);

    systemBodyEClass = createEClass(SYSTEM_BODY);

    plasmidBodyEClass = createEClass(PLASMID_BODY);

    chromosomeBodyEClass = createEClass(CHROMOSOME_BODY);

    cellBodyEClass = createEClass(CELL_BODY);

    regionBodyEClass = createEClass(REGION_BODY);

    customFunctionBodyEClass = createEClass(CUSTOM_FUNCTION_BODY);
    createEAttribute(customFunctionBodyEClass, CUSTOM_FUNCTION_BODY__FUNCTION_TYPE);

    functionBodyMemberEClass = createEClass(FUNCTION_BODY_MEMBER);

    functionParameterMemberEClass = createEClass(FUNCTION_PARAMETER_MEMBER);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__TYPE);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__COLLECTION);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__NAME);
    createEAttribute(functionParameterMemberEClass, FUNCTION_PARAMETER_MEMBER__SCOPE);

    functionUseMemberEClass = createEClass(FUNCTION_USE_MEMBER);
    createEAttribute(functionUseMemberEClass, FUNCTION_USE_MEMBER__TYPE);
    createEAttribute(functionUseMemberEClass, FUNCTION_USE_MEMBER__NAME);

    deviceDefinitionEClass = createEClass(DEVICE_DEFINITION);
    createEAttribute(deviceDefinitionEClass, DEVICE_DEFINITION__NAME);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__PARTS);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__INPUT);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__OUTPUTPUT);
    createEReference(deviceDefinitionEClass, DEVICE_DEFINITION__MEMBERS);

    deviceMembersEClass = createEClass(DEVICE_MEMBERS);

    processInstantiationEClass = createEClass(PROCESS_INSTANTIATION);
    createEAttribute(processInstantiationEClass, PROCESS_INSTANTIATION__NAME);
    createEAttribute(processInstantiationEClass, PROCESS_INSTANTIATION__CONSTRUCTOR);
    createEReference(processInstantiationEClass, PROCESS_INSTANTIATION__PARAMETERS);

    systemInstantiationEClass = createEClass(SYSTEM_INSTANTIATION);
    createEAttribute(systemInstantiationEClass, SYSTEM_INSTANTIATION__NAME);
    createEAttribute(systemInstantiationEClass, SYSTEM_INSTANTIATION__CONSTRUCTOR);
    createEReference(systemInstantiationEClass, SYSTEM_INSTANTIATION__PARAMETERS);

    plasmidInstantiationEClass = createEClass(PLASMID_INSTANTIATION);
    createEAttribute(plasmidInstantiationEClass, PLASMID_INSTANTIATION__NAME);
    createEAttribute(plasmidInstantiationEClass, PLASMID_INSTANTIATION__CONSTRUCTOR);
    createEReference(plasmidInstantiationEClass, PLASMID_INSTANTIATION__PARAMETERS);

    chromosomeInstantiationEClass = createEClass(CHROMOSOME_INSTANTIATION);
    createEAttribute(chromosomeInstantiationEClass, CHROMOSOME_INSTANTIATION__NAME);
    createEAttribute(chromosomeInstantiationEClass, CHROMOSOME_INSTANTIATION__CONSTRUCTOR);
    createEReference(chromosomeInstantiationEClass, CHROMOSOME_INSTANTIATION__PARAMETERS);

    cellInstantiationEClass = createEClass(CELL_INSTANTIATION);
    createEAttribute(cellInstantiationEClass, CELL_INSTANTIATION__NAME);
    createEAttribute(cellInstantiationEClass, CELL_INSTANTIATION__CONSTRUCTOR);
    createEReference(cellInstantiationEClass, CELL_INSTANTIATION__PARAMETERS);

    variableComplexEClass = createEClass(VARIABLE_COMPLEX);
    createEAttribute(variableComplexEClass, VARIABLE_COMPLEX__COMPONENTS);

    variableAttributeEClass = createEClass(VARIABLE_ATTRIBUTE);
    createEAttribute(variableAttributeEClass, VARIABLE_ATTRIBUTE__NAME);
    createEReference(variableAttributeEClass, VARIABLE_ATTRIBUTE__COMPLEX);
    createEAttribute(variableAttributeEClass, VARIABLE_ATTRIBUTE__ATTRIBUTE);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__QUALIFIER);

    variableDefinitionBuiltInEClass = createEClass(VARIABLE_DEFINITION_BUILT_IN);
    createEAttribute(variableDefinitionBuiltInEClass, VARIABLE_DEFINITION_BUILT_IN__TYPE);
    createEAttribute(variableDefinitionBuiltInEClass, VARIABLE_DEFINITION_BUILT_IN__NAME);
    createEReference(variableDefinitionBuiltInEClass, VARIABLE_DEFINITION_BUILT_IN__COMPLEX);
    createEAttribute(variableDefinitionBuiltInEClass, VARIABLE_DEFINITION_BUILT_IN__CONSTRUCTOR);
    createEReference(variableDefinitionBuiltInEClass, VARIABLE_DEFINITION_BUILT_IN__PARAMETERS);

    variableDefinitionUserDefinedEClass = createEClass(VARIABLE_DEFINITION_USER_DEFINED);
    createEAttribute(variableDefinitionUserDefinedEClass, VARIABLE_DEFINITION_USER_DEFINED__TYPE);
    createEAttribute(variableDefinitionUserDefinedEClass, VARIABLE_DEFINITION_USER_DEFINED__NAME);
    createEAttribute(variableDefinitionUserDefinedEClass, VARIABLE_DEFINITION_USER_DEFINED__CONSTRUCTOR);
    createEReference(variableDefinitionUserDefinedEClass, VARIABLE_DEFINITION_USER_DEFINED__PARAMETERS);

    variableDefinitionCollectionEClass = createEClass(VARIABLE_DEFINITION_COLLECTION);
    createEAttribute(variableDefinitionCollectionEClass, VARIABLE_DEFINITION_COLLECTION__COLLECTION);
    createEAttribute(variableDefinitionCollectionEClass, VARIABLE_DEFINITION_COLLECTION__TYPE);
    createEAttribute(variableDefinitionCollectionEClass, VARIABLE_DEFINITION_COLLECTION__NAME);
    createEReference(variableDefinitionCollectionEClass, VARIABLE_DEFINITION_COLLECTION__VALUE);

    variableDefinitionBasicEClass = createEClass(VARIABLE_DEFINITION_BASIC);
    createEAttribute(variableDefinitionBasicEClass, VARIABLE_DEFINITION_BASIC__TYPE);
    createEAttribute(variableDefinitionBasicEClass, VARIABLE_DEFINITION_BASIC__NAME);
    createEReference(variableDefinitionBasicEClass, VARIABLE_DEFINITION_BASIC__EXPRESSION);

    parameterAssignmentEClass = createEClass(PARAMETER_ASSIGNMENT);
    createEAttribute(parameterAssignmentEClass, PARAMETER_ASSIGNMENT__NAME);
    createEReference(parameterAssignmentEClass, PARAMETER_ASSIGNMENT__VALUE);

    variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);

    variableAssignmentObjectEClass = createEClass(VARIABLE_ASSIGNMENT_OBJECT);

    variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
    createEReference(variableExpressionEClass, VARIABLE_EXPRESSION__MEMBERS);

    variableExpressionObjectEClass = createEClass(VARIABLE_EXPRESSION_OBJECT);

    atomicVariableExpressionObjectEClass = createEClass(ATOMIC_VARIABLE_EXPRESSION_OBJECT);
    createEAttribute(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__VARIABLE);
    createEReference(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__ATTRIBUTE);
    createEReference(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__COMPLEX);
    createEAttribute(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__VALUE);
    createEReference(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__QUANTITY);
    createEAttribute(atomicVariableExpressionObjectEClass, ATOMIC_VARIABLE_EXPRESSION_OBJECT__STRING);

    compoundVariableExpressionObjectEClass = createEClass(COMPOUND_VARIABLE_EXPRESSION_OBJECT);
    createEReference(compoundVariableExpressionObjectEClass, COMPOUND_VARIABLE_EXPRESSION_OBJECT__LIST);

    ruleDefinitionEClass = createEClass(RULE_DEFINITION);
    createEAttribute(ruleDefinitionEClass, RULE_DEFINITION__NAME);
    createEReference(ruleDefinitionEClass, RULE_DEFINITION__LHS);
    createEAttribute(ruleDefinitionEClass, RULE_DEFINITION__REVERSIBLE);
    createEReference(ruleDefinitionEClass, RULE_DEFINITION__RHS);

    ruleObjectEClass = createEClass(RULE_OBJECT);

    atgcDefinitionEClass = createEClass(ATGC_DEFINITION);
    createEAttribute(atgcDefinitionEClass, ATGC_DEFINITION__COMMAND);
    createEAttribute(atgcDefinitionEClass, ATGC_DEFINITION__ARGUMENTS);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__PROPERTY);

    probabilityPropertyEClass = createEClass(PROBABILITY_PROPERTY);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__STATE_FORMULA1);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_EVENTUALLY);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_NEVER);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_ALWAYS);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_UNTIL_THEN);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_FOLLOWED_BY);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__STATE_FORMULA2);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__TIME_INSTANT);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__TIME_INTERVAL);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_STEADY_STATE);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__IS_INFINITELY_OFTEN);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT);
    createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__INITIAL_CONDITIONS);

    rewardPropertyEClass = createEClass(REWARD_PROPERTY);
    createEAttribute(rewardPropertyEClass, REWARD_PROPERTY__NAME);
    createEReference(rewardPropertyEClass, REWARD_PROPERTY__TIME_INSTANT);
    createEReference(rewardPropertyEClass, REWARD_PROPERTY__CONCENTRATION_CONSTRAINT);
    createEReference(rewardPropertyEClass, REWARD_PROPERTY__INITIAL_CONDITIONS);

    stateExpressionEClass = createEClass(STATE_EXPRESSION);
    createEAttribute(stateExpressionEClass, STATE_EXPRESSION__NAME);
    createEAttribute(stateExpressionEClass, STATE_EXPRESSION__OPERATOR);
    createEReference(stateExpressionEClass, STATE_EXPRESSION__CONCENTRATION_QUANTITY);

    stateFormulaEClass = createEClass(STATE_FORMULA);
    createEAttribute(stateFormulaEClass, STATE_FORMULA__FORMULA);
    createEReference(stateFormulaEClass, STATE_FORMULA__ATOMIC_FORMULA);
    createEAttribute(stateFormulaEClass, STATE_FORMULA__IS_NEGATION);
    createEReference(stateFormulaEClass, STATE_FORMULA__NEGATED_FORMULA);
    createEReference(stateFormulaEClass, STATE_FORMULA__LEFT_FORMULA);
    createEAttribute(stateFormulaEClass, STATE_FORMULA__IS_CONJUNCTION);
    createEAttribute(stateFormulaEClass, STATE_FORMULA__IS_DISJUNCTION);
    createEAttribute(stateFormulaEClass, STATE_FORMULA__IS_IMPLICATION);
    createEReference(stateFormulaEClass, STATE_FORMULA__RIGHT_FORMULA);

    timeInstantEClass = createEClass(TIME_INSTANT);
    createEAttribute(timeInstantEClass, TIME_INSTANT__IS_EQUAL_TO);
    createEAttribute(timeInstantEClass, TIME_INSTANT__TIME_INSTANT);
    createEAttribute(timeInstantEClass, TIME_INSTANT__IS_LESS_THAN_OR_EQUAL);
    createEAttribute(timeInstantEClass, TIME_INSTANT__IS_GREATER_THAN_OR_EQUAL);
    createEAttribute(timeInstantEClass, TIME_INSTANT__TIME_UNIT);

    timeIntervalEClass = createEClass(TIME_INTERVAL);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__LOWER_BOUND);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__UPPER_BOUND);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__TIME_UNIT);

    rewardTimeInstantEClass = createEClass(REWARD_TIME_INSTANT);
    createEAttribute(rewardTimeInstantEClass, REWARD_TIME_INSTANT__IS_EQUAL_TO);
    createEAttribute(rewardTimeInstantEClass, REWARD_TIME_INSTANT__IS_LESS_THAN_OR_EQUAL);
    createEAttribute(rewardTimeInstantEClass, REWARD_TIME_INSTANT__TIME_VALUE);
    createEAttribute(rewardTimeInstantEClass, REWARD_TIME_INSTANT__TIME_UNIT);

    probabilityConstraintEClass = createEClass(PROBABILITY_CONSTRAINT);
    createEAttribute(probabilityConstraintEClass, PROBABILITY_CONSTRAINT__OPERATOR);
    createEAttribute(probabilityConstraintEClass, PROBABILITY_CONSTRAINT__PROBABILITY);
    createEAttribute(probabilityConstraintEClass, PROBABILITY_CONSTRAINT__HAS_UNKNOWN_PROBABILITY);

    concentrationConstraintEClass = createEClass(CONCENTRATION_CONSTRAINT);
    createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__OPERATOR);
    createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__VALUE);
    createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__UNIT);
    createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__IS_UNKNOWN);

    propertyInitialConditionEClass = createEClass(PROPERTY_INITIAL_CONDITION);
    createEReference(propertyInitialConditionEClass, PROPERTY_INITIAL_CONDITION__VARIABLE);
    createEReference(propertyInitialConditionEClass, PROPERTY_INITIAL_CONDITION__VALUE);

    quantityEClass = createEClass(QUANTITY);
    createEAttribute(quantityEClass, QUANTITY__VALUE);
    createEAttribute(quantityEClass, QUANTITY__UNITS);

    concentrationQuantityEClass = createEClass(CONCENTRATION_QUANTITY);
    createEAttribute(concentrationQuantityEClass, CONCENTRATION_QUANTITY__VALUE);
    createEAttribute(concentrationQuantityEClass, CONCENTRATION_QUANTITY__UNIT);

    listEClass = createEClass(LIST);
    createEReference(listEClass, LIST__ENTRIES);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);
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
    importStatementEClass.getESuperTypes().add(this.getModelMember());
    functionDefinitionEClass.getESuperTypes().add(this.getModelMember());
    processBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    systemBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    plasmidBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    chromosomeBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    cellBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    regionBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    customFunctionBodyEClass.getESuperTypes().add(this.getFunctionBodyType());
    deviceDefinitionEClass.getESuperTypes().add(this.getFunctionBodyMember());
    processInstantiationEClass.getESuperTypes().add(this.getFunctionBodyMember());
    processInstantiationEClass.getESuperTypes().add(this.getDeviceMembers());
    systemInstantiationEClass.getESuperTypes().add(this.getFunctionBodyMember());
    plasmidInstantiationEClass.getESuperTypes().add(this.getFunctionBodyMember());
    chromosomeInstantiationEClass.getESuperTypes().add(this.getFunctionBodyMember());
    cellInstantiationEClass.getESuperTypes().add(this.getFunctionBodyMember());
    variableComplexEClass.getESuperTypes().add(this.getRuleObject());
    variableAttributeEClass.getESuperTypes().add(this.getVariableAssignmentObject());
    variableDefinitionEClass.getESuperTypes().add(this.getFunctionBodyMember());
    variableDefinitionEClass.getESuperTypes().add(this.getDeviceMembers());
    variableAssignmentEClass.getESuperTypes().add(this.getFunctionBodyMember());
    atomicVariableExpressionObjectEClass.getESuperTypes().add(this.getVariableExpressionObject());
    compoundVariableExpressionObjectEClass.getESuperTypes().add(this.getVariableExpressionObject());
    ruleDefinitionEClass.getESuperTypes().add(this.getFunctionBodyMember());
    atgcDefinitionEClass.getESuperTypes().add(this.getFunctionBodyMember());
    atgcDefinitionEClass.getESuperTypes().add(this.getDeviceMembers());
    propertyDefinitionEClass.getESuperTypes().add(this.getFunctionBodyMember());
    propertyDefinitionEClass.getESuperTypes().add(this.getDeviceMembers());
    importEClass.getESuperTypes().add(this.getImportStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Members(), this.getModelMember(), null, "members", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelMemberEClass, ModelMember.class, "ModelMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_FunctionBody(), this.getFunctionBodyType(), null, "functionBody", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Uses(), this.getFunctionUseMember(), null, "uses", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBodyTypeEClass, FunctionBodyType.class, "FunctionBodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionBodyType_Parameters(), this.getFunctionParameterMember(), null, "parameters", null, 0, -1, FunctionBodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBodyType_Members(), this.getFunctionBodyMember(), null, "members", null, 0, -1, FunctionBodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processBodyEClass, ProcessBody.class, "ProcessBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemBodyEClass, SystemBody.class, "SystemBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plasmidBodyEClass, PlasmidBody.class, "PlasmidBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(chromosomeBodyEClass, ChromosomeBody.class, "ChromosomeBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cellBodyEClass, CellBody.class, "CellBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(regionBodyEClass, RegionBody.class, "RegionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(customFunctionBodyEClass, CustomFunctionBody.class, "CustomFunctionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomFunctionBody_FunctionType(), ecorePackage.getEString(), "functionType", null, 0, 1, CustomFunctionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBodyMemberEClass, FunctionBodyMember.class, "FunctionBodyMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionParameterMemberEClass, FunctionParameterMember.class, "FunctionParameterMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionParameterMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParameterMember_Collection(), ecorePackage.getEString(), "collection", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParameterMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParameterMember_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, FunctionParameterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionUseMemberEClass, FunctionUseMember.class, "FunctionUseMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionUseMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionUseMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionUseMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionUseMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceDefinitionEClass, DeviceDefinition.class, "DeviceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Parts(), this.getList(), null, "parts", null, 0, 1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Input(), this.getList(), null, "input", null, 0, 1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Outputput(), this.getList(), null, "outputput", null, 0, 1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceDefinition_Members(), this.getDeviceMembers(), null, "members", null, 0, -1, DeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceMembersEClass, DeviceMembers.class, "DeviceMembers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processInstantiationEClass, ProcessInstantiation.class, "ProcessInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessInstantiation_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, ProcessInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessInstantiation_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, ProcessInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemInstantiationEClass, SystemInstantiation.class, "SystemInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemInstantiation_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, SystemInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemInstantiation_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, SystemInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plasmidInstantiationEClass, PlasmidInstantiation.class, "PlasmidInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlasmidInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlasmidInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlasmidInstantiation_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, PlasmidInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlasmidInstantiation_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, PlasmidInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chromosomeInstantiationEClass, ChromosomeInstantiation.class, "ChromosomeInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChromosomeInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChromosomeInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChromosomeInstantiation_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, ChromosomeInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChromosomeInstantiation_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, ChromosomeInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellInstantiationEClass, CellInstantiation.class, "CellInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, CellInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCellInstantiation_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, CellInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellInstantiation_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, CellInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableComplexEClass, VariableComplex.class, "VariableComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableComplex_Components(), ecorePackage.getEString(), "components", null, 0, -1, VariableComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAttributeEClass, VariableAttribute.class, "VariableAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableAttribute_Complex(), this.getVariableComplex(), null, "complex", null, 0, 1, VariableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, VariableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDefinition_Definition(), ecorePackage.getEObject(), null, "definition", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionBuiltInEClass, VariableDefinitionBuiltIn.class, "VariableDefinitionBuiltIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinitionBuiltIn_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDefinitionBuiltIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionBuiltIn_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDefinitionBuiltIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinitionBuiltIn_Complex(), this.getVariableComplex(), null, "complex", null, 0, 1, VariableDefinitionBuiltIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionBuiltIn_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, VariableDefinitionBuiltIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinitionBuiltIn_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, VariableDefinitionBuiltIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionUserDefinedEClass, VariableDefinitionUserDefined.class, "VariableDefinitionUserDefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinitionUserDefined_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDefinitionUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionUserDefined_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDefinitionUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionUserDefined_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, VariableDefinitionUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinitionUserDefined_Parameters(), this.getParameterAssignment(), null, "parameters", null, 0, -1, VariableDefinitionUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionCollectionEClass, VariableDefinitionCollection.class, "VariableDefinitionCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinitionCollection_Collection(), ecorePackage.getEString(), "collection", null, 0, 1, VariableDefinitionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionCollection_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDefinitionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDefinitionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinitionCollection_Value(), this.getList(), null, "value", null, 0, 1, VariableDefinitionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionBasicEClass, VariableDefinitionBasic.class, "VariableDefinitionBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinitionBasic_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDefinitionBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinitionBasic_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDefinitionBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinitionBasic_Expression(), this.getVariableExpression(), null, "expression", null, 0, 1, VariableDefinitionBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterAssignmentEClass, ParameterAssignment.class, "ParameterAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterAssignment_Value(), this.getVariableExpressionObject(), null, "value", null, 0, 1, ParameterAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableAssignment_Variable(), this.getVariableAssignmentObject(), null, "variable", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableAssignment_Expression(), this.getVariableExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAssignmentObjectEClass, VariableAssignmentObject.class, "VariableAssignmentObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableExpression_Members(), this.getVariableExpressionObject(), null, "members", null, 0, -1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableExpressionObjectEClass, VariableExpressionObject.class, "VariableExpressionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomicVariableExpressionObjectEClass, AtomicVariableExpressionObject.class, "AtomicVariableExpressionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomicVariableExpressionObject_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicVariableExpressionObject_Attribute(), this.getVariableAttribute(), null, "attribute", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicVariableExpressionObject_Complex(), this.getVariableComplex(), null, "complex", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicVariableExpressionObject_Value(), ecorePackage.getEString(), "value", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicVariableExpressionObject_Quantity(), this.getQuantity(), null, "quantity", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicVariableExpressionObject_String(), ecorePackage.getEString(), "string", null, 0, 1, AtomicVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundVariableExpressionObjectEClass, CompoundVariableExpressionObject.class, "CompoundVariableExpressionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundVariableExpressionObject_List(), this.getList(), null, "list", null, 0, 1, CompoundVariableExpressionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleDefinitionEClass, RuleDefinition.class, "RuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleDefinition_Lhs(), this.getRuleObject(), null, "lhs", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDefinition_Reversible(), ecorePackage.getEBoolean(), "reversible", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleDefinition_Rhs(), this.getRuleObject(), null, "rhs", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleObjectEClass, RuleObject.class, "RuleObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atgcDefinitionEClass, ATGCDefinition.class, "ATGCDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getATGCDefinition_Command(), ecorePackage.getEString(), "command", null, 0, 1, ATGCDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getATGCDefinition_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, ATGCDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDefinition_Property(), ecorePackage.getEObject(), null, "property", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(probabilityPropertyEClass, ProbabilityProperty.class, "ProbabilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProbabilityProperty_StateFormula1(), this.getStateFormula(), null, "stateFormula1", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsEventually(), ecorePackage.getEBoolean(), "isEventually", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsNever(), ecorePackage.getEBoolean(), "isNever", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsAlways(), ecorePackage.getEBoolean(), "isAlways", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsUntilThen(), ecorePackage.getEBoolean(), "isUntilThen", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsFollowedBy(), ecorePackage.getEBoolean(), "isFollowedBy", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbabilityProperty_StateFormula2(), this.getStateFormula(), null, "stateFormula2", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbabilityProperty_TimeInstant(), this.getTimeInstant(), null, "timeInstant", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbabilityProperty_TimeInterval(), this.getTimeInterval(), null, "timeInterval", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsSteadyState(), ecorePackage.getEBoolean(), "isSteadyState", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_IsInfinitelyOften(), ecorePackage.getEBoolean(), "isInfinitelyOften", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbabilityProperty_ProbabilityConstraint(), this.getProbabilityConstraint(), null, "probabilityConstraint", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbabilityProperty_InitialConditions(), this.getPropertyInitialCondition(), null, "initialConditions", null, 0, -1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewardPropertyEClass, RewardProperty.class, "RewardProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRewardProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewardProperty_TimeInstant(), this.getRewardTimeInstant(), null, "timeInstant", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewardProperty_ConcentrationConstraint(), this.getConcentrationConstraint(), null, "concentrationConstraint", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewardProperty_InitialConditions(), this.getPropertyInitialCondition(), null, "initialConditions", null, 0, -1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateExpressionEClass, StateExpression.class, "StateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, StateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateExpression_ConcentrationQuantity(), this.getConcentrationQuantity(), null, "concentrationQuantity", null, 0, 1, StateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateFormulaEClass, StateFormula.class, "StateFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateFormula_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFormula_AtomicFormula(), this.getStateExpression(), null, "atomicFormula", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateFormula_IsNegation(), ecorePackage.getEBoolean(), "isNegation", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFormula_NegatedFormula(), this.getStateFormula(), null, "negatedFormula", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFormula_LeftFormula(), this.getStateFormula(), null, "leftFormula", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateFormula_IsConjunction(), ecorePackage.getEBoolean(), "isConjunction", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateFormula_IsDisjunction(), ecorePackage.getEBoolean(), "isDisjunction", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateFormula_IsImplication(), ecorePackage.getEBoolean(), "isImplication", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFormula_RightFormula(), this.getStateFormula(), null, "rightFormula", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeInstantEClass, TimeInstant.class, "TimeInstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeInstant_IsEqualTo(), ecorePackage.getEBoolean(), "isEqualTo", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInstant_TimeInstant(), ecorePackage.getEInt(), "timeInstant", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInstant_IsLessThanOrEqual(), ecorePackage.getEBoolean(), "isLessThanOrEqual", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInstant_IsGreaterThanOrEqual(), ecorePackage.getEBoolean(), "isGreaterThanOrEqual", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInstant_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeInterval_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewardTimeInstantEClass, RewardTimeInstant.class, "RewardTimeInstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRewardTimeInstant_IsEqualTo(), ecorePackage.getEBoolean(), "isEqualTo", null, 0, 1, RewardTimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRewardTimeInstant_IsLessThanOrEqual(), ecorePackage.getEBoolean(), "isLessThanOrEqual", null, 0, 1, RewardTimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRewardTimeInstant_TimeValue(), ecorePackage.getEInt(), "timeValue", null, 0, 1, RewardTimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRewardTimeInstant_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 0, 1, RewardTimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(probabilityConstraintEClass, ProbabilityConstraint.class, "ProbabilityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProbabilityConstraint_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ProbabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityConstraint_Probability(), ecorePackage.getEString(), "probability", null, 0, 1, ProbabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityConstraint_HasUnknownProbability(), ecorePackage.getEBoolean(), "hasUnknownProbability", null, 0, 1, ProbabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concentrationConstraintEClass, ConcentrationConstraint.class, "ConcentrationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcentrationConstraint_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcentrationConstraint_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcentrationConstraint_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcentrationConstraint_IsUnknown(), ecorePackage.getEBoolean(), "isUnknown", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyInitialConditionEClass, PropertyInitialCondition.class, "PropertyInitialCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyInitialCondition_Variable(), this.getVariableAssignmentObject(), null, "variable", null, 0, 1, PropertyInitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyInitialCondition_Value(), this.getConcentrationQuantity(), null, "value", null, 0, 1, PropertyInitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantity_Value(), ecorePackage.getEString(), "value", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantity_Units(), ecorePackage.getEString(), "units", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concentrationQuantityEClass, ConcentrationQuantity.class, "ConcentrationQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcentrationQuantity_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConcentrationQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcentrationQuantity_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ConcentrationQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList_Entries(), this.getAtomicVariableExpressionObject(), null, "entries", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //IblPackageImpl
