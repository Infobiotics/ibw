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
      case IblPackage.FUNCTION_PARAMETER_MEMBER:
      {
        FunctionParameterMember functionParameterMember = (FunctionParameterMember)theEObject;
        T result = caseFunctionParameterMember(functionParameterMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.FUNCTION_BODY_MEMBER:
      {
        FunctionBodyMember functionBodyMember = (FunctionBodyMember)theEObject;
        T result = caseFunctionBodyMember(functionBodyMember);
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
      case IblPackage.USER_DEFINED_TYPE:
      {
        UserDefinedType userDefinedType = (UserDefinedType)theEObject;
        T result = caseUserDefinedType(userDefinedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.VARIABLE_DEFINITION:
      {
        VariableDefinition variableDefinition = (VariableDefinition)theEObject;
        T result = caseVariableDefinition(variableDefinition);
        if (result == null) result = caseFunctionBodyMember(variableDefinition);
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
        if (result == null) result = caseFunctionBodyMember(variableAssignment);
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
        if (result == null) result = caseFunctionBodyMember(ruleDefinition);
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
      case IblPackage.DEVICE_DEFINITION:
      {
        DeviceDefinition deviceDefinition = (DeviceDefinition)theEObject;
        T result = caseDeviceDefinition(deviceDefinition);
        if (result == null) result = caseFunctionBodyMember(deviceDefinition);
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
      case IblPackage.ATGC_DEFINITION:
      {
        ATGCDefinition atgcDefinition = (ATGCDefinition)theEObject;
        T result = caseATGCDefinition(atgcDefinition);
        if (result == null) result = caseFunctionBodyMember(atgcDefinition);
        if (result == null) result = caseDeviceMembers(atgcDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROPERTY_DEFINITION:
      {
        PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
        T result = casePropertyDefinition(propertyDefinition);
        if (result == null) result = caseFunctionBodyMember(propertyDefinition);
        if (result == null) result = caseDeviceMembers(propertyDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IblPackage.PROPERTY_CONDITION:
      {
        PropertyCondition propertyCondition = (PropertyCondition)theEObject;
        T result = casePropertyCondition(propertyCondition);
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
   * Returns the result of interpreting the object as an instance of '<em>Function Body Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBodyMember(FunctionBodyMember object)
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
   * Returns the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserDefinedType(UserDefinedType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyCondition(PropertyCondition object)
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
