/**
 */
package roadblock.xtext.ibl.ibl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import roadblock.xtext.ibl.ibl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see roadblock.xtext.ibl.ibl.IblPackage
 * @generated
 */
public class IblSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IblPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IblSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IblPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IblPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.MODEL_MEMBER:
      {
        ModelMember modelMember = (ModelMember)theEObject;
        T result = caseModelMember(modelMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = caseModelMember(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = caseModelMember(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROCESS_BODY:
      {
        ProcessBody processBody = (ProcessBody)theEObject;
        T result = caseProcessBody(processBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.SYSTEM_BODY:
      {
        SystemBody systemBody = (SystemBody)theEObject;
        T result = caseSystemBody(systemBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PLASMID_BODY:
      {
        PlasmidBody plasmidBody = (PlasmidBody)theEObject;
        T result = casePlasmidBody(plasmidBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CHROMOSOME_BODY:
      {
        ChromosomeBody chromosomeBody = (ChromosomeBody)theEObject;
        T result = caseChromosomeBody(chromosomeBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CELL_BODY:
      {
        CellBody cellBody = (CellBody)theEObject;
        T result = caseCellBody(cellBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.REGION_BODY:
      {
        RegionBody regionBody = (RegionBody)theEObject;
        T result = caseRegionBody(regionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CUSTOM_FUNCTION_BODY:
      {
        CustomFunctionBody customFunctionBody = (CustomFunctionBody)theEObject;
        T result = caseCustomFunctionBody(customFunctionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROCESS_BODY_MEMBER:
      {
        ProcessBodyMember processBodyMember = (ProcessBodyMember)theEObject;
        T result = caseProcessBodyMember(processBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.SYSTEM_BODY_MEMBER:
      {
        SystemBodyMember systemBodyMember = (SystemBodyMember)theEObject;
        T result = caseSystemBodyMember(systemBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PLASMID_BODY_MEMBER:
      {
        PlasmidBodyMember plasmidBodyMember = (PlasmidBodyMember)theEObject;
        T result = casePlasmidBodyMember(plasmidBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CHROMOSOME_BODY_MEMBER:
      {
        ChromosomeBodyMember chromosomeBodyMember = (ChromosomeBodyMember)theEObject;
        T result = caseChromosomeBodyMember(chromosomeBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CELL_BODY_MEMBER:
      {
        CellBodyMember cellBodyMember = (CellBodyMember)theEObject;
        T result = caseCellBodyMember(cellBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.REGION_BODY_MEMBER:
      {
        RegionBodyMember regionBodyMember = (RegionBodyMember)theEObject;
        T result = caseRegionBodyMember(regionBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CUSTOM_FUNCTION_BODY_MEMBER:
      {
        CustomFunctionBodyMember customFunctionBodyMember = (CustomFunctionBodyMember)theEObject;
        T result = caseCustomFunctionBodyMember(customFunctionBodyMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.FUNCTION_PARAMETER_MEMBER:
      {
        FunctionParameterMember functionParameterMember = (FunctionParameterMember)theEObject;
        T result = caseFunctionParameterMember(functionParameterMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.FUNCTION_USE_MEMBER:
      {
        FunctionUseMember functionUseMember = (FunctionUseMember)theEObject;
        T result = caseFunctionUseMember(functionUseMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.DEVICE_DEFINITION:
      {
        DeviceDefinition deviceDefinition = (DeviceDefinition)theEObject;
        T result = caseDeviceDefinition(deviceDefinition);
        if (result == null) result = caseSystemBodyMember(deviceDefinition);
        if (result == null) result = casePlasmidBodyMember(deviceDefinition);
        if (result == null) result = caseChromosomeBodyMember(deviceDefinition);
        if (result == null) result = caseCellBodyMember(deviceDefinition);
        if (result == null) result = caseCustomFunctionBodyMember(deviceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.DEVICE_MEMBERS:
      {
        DeviceMembers deviceMembers = (DeviceMembers)theEObject;
        T result = caseDeviceMembers(deviceMembers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROCESS_INSTANTIATION:
      {
        ProcessInstantiation processInstantiation = (ProcessInstantiation)theEObject;
        T result = caseProcessInstantiation(processInstantiation);
        if (result == null) result = caseProcessBodyMember(processInstantiation);
        if (result == null) result = caseSystemBodyMember(processInstantiation);
        if (result == null) result = casePlasmidBodyMember(processInstantiation);
        if (result == null) result = caseChromosomeBodyMember(processInstantiation);
        if (result == null) result = caseCellBodyMember(processInstantiation);
        if (result == null) result = caseCustomFunctionBodyMember(processInstantiation);
        if (result == null) result = caseDeviceMembers(processInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.SYSTEM_INSTANTIATION:
      {
        SystemInstantiation systemInstantiation = (SystemInstantiation)theEObject;
        T result = caseSystemInstantiation(systemInstantiation);
        if (result == null) result = casePlasmidBodyMember(systemInstantiation);
        if (result == null) result = caseChromosomeBodyMember(systemInstantiation);
        if (result == null) result = caseCellBodyMember(systemInstantiation);
        if (result == null) result = caseCustomFunctionBodyMember(systemInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PLASMID_INSTANTIATION:
      {
        PlasmidInstantiation plasmidInstantiation = (PlasmidInstantiation)theEObject;
        T result = casePlasmidInstantiation(plasmidInstantiation);
        if (result == null) result = caseCellBodyMember(plasmidInstantiation);
        if (result == null) result = caseCustomFunctionBodyMember(plasmidInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CHROMOSOME_INSTANTIATION:
      {
        ChromosomeInstantiation chromosomeInstantiation = (ChromosomeInstantiation)theEObject;
        T result = caseChromosomeInstantiation(chromosomeInstantiation);
        if (result == null) result = caseCellBodyMember(chromosomeInstantiation);
        if (result == null) result = caseCustomFunctionBodyMember(chromosomeInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CELL_INSTANTIATION:
      {
        CellInstantiation cellInstantiation = (CellInstantiation)theEObject;
        T result = caseCellInstantiation(cellInstantiation);
        if (result == null) result = caseRegionBodyMember(cellInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_COMPLEX:
      {
        VariableComplex variableComplex = (VariableComplex)theEObject;
        T result = caseVariableComplex(variableComplex);
        if (result == null) result = caseRuleObject(variableComplex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_ATTRIBUTE:
      {
        VariableAttribute variableAttribute = (VariableAttribute)theEObject;
        T result = caseVariableAttribute(variableAttribute);
        if (result == null) result = caseVariableAssignmentObject(variableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION:
      {
        VariableDefinition variableDefinition = (VariableDefinition)theEObject;
        T result = caseVariableDefinition(variableDefinition);
        if (result == null) result = caseProcessBodyMember(variableDefinition);
        if (result == null) result = caseSystemBodyMember(variableDefinition);
        if (result == null) result = casePlasmidBodyMember(variableDefinition);
        if (result == null) result = caseChromosomeBodyMember(variableDefinition);
        if (result == null) result = caseCellBodyMember(variableDefinition);
        if (result == null) result = caseRegionBodyMember(variableDefinition);
        if (result == null) result = caseCustomFunctionBodyMember(variableDefinition);
        if (result == null) result = caseDeviceMembers(variableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION_BUILT_IN:
      {
        VariableDefinitionBuiltIn variableDefinitionBuiltIn = (VariableDefinitionBuiltIn)theEObject;
        T result = caseVariableDefinitionBuiltIn(variableDefinitionBuiltIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION_USER_DEFINED:
      {
        VariableDefinitionUserDefined variableDefinitionUserDefined = (VariableDefinitionUserDefined)theEObject;
        T result = caseVariableDefinitionUserDefined(variableDefinitionUserDefined);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION_COLLECTION:
      {
        VariableDefinitionCollection variableDefinitionCollection = (VariableDefinitionCollection)theEObject;
        T result = caseVariableDefinitionCollection(variableDefinitionCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION_BASIC:
      {
        VariableDefinitionBasic variableDefinitionBasic = (VariableDefinitionBasic)theEObject;
        T result = caseVariableDefinitionBasic(variableDefinitionBasic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PARAMETER_ASSIGNMENT:
      {
        ParameterAssignment parameterAssignment = (ParameterAssignment)theEObject;
        T result = caseParameterAssignment(parameterAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_ASSIGNMENT:
      {
        VariableAssignment variableAssignment = (VariableAssignment)theEObject;
        T result = caseVariableAssignment(variableAssignment);
        if (result == null) result = caseProcessBodyMember(variableAssignment);
        if (result == null) result = caseSystemBodyMember(variableAssignment);
        if (result == null) result = casePlasmidBodyMember(variableAssignment);
        if (result == null) result = caseChromosomeBodyMember(variableAssignment);
        if (result == null) result = caseCellBodyMember(variableAssignment);
        if (result == null) result = caseRegionBodyMember(variableAssignment);
        if (result == null) result = caseCustomFunctionBodyMember(variableAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_ASSIGNMENT_OBJECT:
      {
        VariableAssignmentObject variableAssignmentObject = (VariableAssignmentObject)theEObject;
        T result = caseVariableAssignmentObject(variableAssignmentObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_EXPRESSION:
      {
        VariableExpression variableExpression = (VariableExpression)theEObject;
        T result = caseVariableExpression(variableExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_EXPRESSION_OBJECT:
      {
        VariableExpressionObject variableExpressionObject = (VariableExpressionObject)theEObject;
        T result = caseVariableExpressionObject(variableExpressionObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.ATOMIC_VARIABLE_EXPRESSION_OBJECT:
      {
        AtomicVariableExpressionObject atomicVariableExpressionObject = (AtomicVariableExpressionObject)theEObject;
        T result = caseAtomicVariableExpressionObject(atomicVariableExpressionObject);
        if (result == null) result = caseVariableExpressionObject(atomicVariableExpressionObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.COMPOUND_VARIABLE_EXPRESSION_OBJECT:
      {
        CompoundVariableExpressionObject compoundVariableExpressionObject = (CompoundVariableExpressionObject)theEObject;
        T result = caseCompoundVariableExpressionObject(compoundVariableExpressionObject);
        if (result == null) result = caseVariableExpressionObject(compoundVariableExpressionObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.RULE_DEFINITION:
      {
        RuleDefinition ruleDefinition = (RuleDefinition)theEObject;
        T result = caseRuleDefinition(ruleDefinition);
        if (result == null) result = caseProcessBodyMember(ruleDefinition);
        if (result == null) result = caseSystemBodyMember(ruleDefinition);
        if (result == null) result = casePlasmidBodyMember(ruleDefinition);
        if (result == null) result = caseChromosomeBodyMember(ruleDefinition);
        if (result == null) result = caseCellBodyMember(ruleDefinition);
        if (result == null) result = caseRegionBodyMember(ruleDefinition);
        if (result == null) result = caseCustomFunctionBodyMember(ruleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.RULE_OBJECT:
      {
        RuleObject ruleObject = (RuleObject)theEObject;
        T result = caseRuleObject(ruleObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.ATGC_DEFINITION:
      {
        ATGCDefinition atgcDefinition = (ATGCDefinition)theEObject;
        T result = caseATGCDefinition(atgcDefinition);
        if (result == null) result = caseSystemBodyMember(atgcDefinition);
        if (result == null) result = casePlasmidBodyMember(atgcDefinition);
        if (result == null) result = caseChromosomeBodyMember(atgcDefinition);
        if (result == null) result = caseCellBodyMember(atgcDefinition);
        if (result == null) result = caseCustomFunctionBodyMember(atgcDefinition);
        if (result == null) result = caseDeviceMembers(atgcDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROPERTY_DEFINITION:
      {
        PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
        T result = casePropertyDefinition(propertyDefinition);
        if (result == null) result = caseSystemBodyMember(propertyDefinition);
        if (result == null) result = casePlasmidBodyMember(propertyDefinition);
        if (result == null) result = caseChromosomeBodyMember(propertyDefinition);
        if (result == null) result = caseCellBodyMember(propertyDefinition);
        if (result == null) result = caseCustomFunctionBodyMember(propertyDefinition);
        if (result == null) result = caseDeviceMembers(propertyDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROBABILITY_PROPERTY:
      {
        ProbabilityProperty probabilityProperty = (ProbabilityProperty)theEObject;
        T result = caseProbabilityProperty(probabilityProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.REWARD_PROPERTY:
      {
        RewardProperty rewardProperty = (RewardProperty)theEObject;
        T result = caseRewardProperty(rewardProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.STATE_EXPRESSION:
      {
        StateExpression stateExpression = (StateExpression)theEObject;
        T result = caseStateExpression(stateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.STATE_FORMULA:
      {
        StateFormula stateFormula = (StateFormula)theEObject;
        T result = caseStateFormula(stateFormula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.TIME_INSTANT:
      {
        TimeInstant timeInstant = (TimeInstant)theEObject;
        T result = caseTimeInstant(timeInstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.TIME_INTERVAL:
      {
        TimeInterval timeInterval = (TimeInterval)theEObject;
        T result = caseTimeInterval(timeInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.REWARD_TIME_INSTANT:
      {
        RewardTimeInstant rewardTimeInstant = (RewardTimeInstant)theEObject;
        T result = caseRewardTimeInstant(rewardTimeInstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROBABILITY_CONSTRAINT:
      {
        ProbabilityConstraint probabilityConstraint = (ProbabilityConstraint)theEObject;
        T result = caseProbabilityConstraint(probabilityConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CONCENTRATION_CONSTRAINT:
      {
        ConcentrationConstraint concentrationConstraint = (ConcentrationConstraint)theEObject;
        T result = caseConcentrationConstraint(concentrationConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROPERTY_INITIAL_CONDITION:
      {
        PropertyInitialCondition propertyInitialCondition = (PropertyInitialCondition)theEObject;
        T result = casePropertyInitialCondition(propertyInitialCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.QUANTITY:
      {
        Quantity quantity = (Quantity)theEObject;
        T result = caseQuantity(quantity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.CONCENTRATION_QUANTITY:
      {
        ConcentrationQuantity concentrationQuantity = (ConcentrationQuantity)theEObject;
        T result = caseConcentrationQuantity(concentrationQuantity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseImportStatement(import_);
        if (result == null) result = caseModelMember(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelMember(ModelMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportStatement(ImportStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessBody(ProcessBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemBody(SystemBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plasmid Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plasmid Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlasmidBody(PlasmidBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chromosome Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chromosome Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChromosomeBody(ChromosomeBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellBody(CellBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegionBody(RegionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFunctionBody(CustomFunctionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessBodyMember(ProcessBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemBodyMember(SystemBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plasmid Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plasmid Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlasmidBodyMember(PlasmidBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chromosome Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chromosome Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChromosomeBodyMember(ChromosomeBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellBodyMember(CellBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegionBodyMember(RegionBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Function Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Function Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFunctionBodyMember(CustomFunctionBodyMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Parameter Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Parameter Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionParameterMember(FunctionParameterMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Use Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Use Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionUseMember(FunctionUseMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceDefinition(DeviceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Members</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Members</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceMembers(DeviceMembers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessInstantiation(ProcessInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemInstantiation(SystemInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plasmid Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plasmid Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlasmidInstantiation(PlasmidInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chromosome Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chromosome Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChromosomeInstantiation(ChromosomeInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellInstantiation(CellInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Complex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Complex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableComplex(VariableComplex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAttribute(VariableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinition(VariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition Built In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition Built In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinitionBuiltIn(VariableDefinitionBuiltIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition User Defined</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition User Defined</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinitionUserDefined(VariableDefinitionUserDefined object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinitionCollection(VariableDefinitionCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition Basic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition Basic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinitionBasic(VariableDefinitionBasic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAssignment(ParameterAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignment(VariableAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignmentObject(VariableAssignmentObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableExpression(VariableExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Expression Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableExpressionObject(VariableExpressionObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Variable Expression Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicVariableExpressionObject(AtomicVariableExpressionObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Variable Expression Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundVariableExpressionObject(CompoundVariableExpressionObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleDefinition(RuleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleObject(RuleObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ATGC Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ATGC Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseATGCDefinition(ATGCDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDefinition(PropertyDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probability Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probability Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbabilityProperty(ProbabilityProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reward Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reward Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRewardProperty(RewardProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateExpression(StateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateFormula(StateFormula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Instant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Instant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeInstant(TimeInstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeInterval(TimeInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reward Time Instant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reward Time Instant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRewardTimeInstant(RewardTimeInstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probability Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probability Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbabilityConstraint(ProbabilityConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concentration Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concentration Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcentrationConstraint(ConcentrationConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyInitialCondition(PropertyInitialCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantity(Quantity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concentration Quantity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concentration Quantity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcentrationQuantity(ConcentrationQuantity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IblSwitch
