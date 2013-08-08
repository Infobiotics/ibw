/**
 */
package roadblock.xtext.ibl.ibl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import roadblock.xtext.ibl.ibl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see roadblock.xtext.ibl.ibl.IblPackage
 * @generated
 */
public class IblAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IblPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IblAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IblPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IblSwitch<Adapter> modelSwitch =
    new IblSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelMember(ModelMember object)
      {
        return createModelMemberAdapter();
      }
      @Override
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionParameterMember(FunctionParameterMember object)
      {
        return createFunctionParameterMemberAdapter();
      }
      @Override
      public Adapter caseFunctionBodyMember(FunctionBodyMember object)
      {
        return createFunctionBodyMemberAdapter();
      }
      @Override
      public Adapter caseFunctionUseMember(FunctionUseMember object)
      {
        return createFunctionUseMemberAdapter();
      }
      @Override
      public Adapter caseVariableComplex(VariableComplex object)
      {
        return createVariableComplexAdapter();
      }
      @Override
      public Adapter caseVariableAttribute(VariableAttribute object)
      {
        return createVariableAttributeAdapter();
      }
      @Override
      public Adapter caseVariableDefinition(VariableDefinition object)
      {
        return createVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterAssignment(ParameterAssignment object)
      {
        return createParameterAssignmentAdapter();
      }
      @Override
      public Adapter caseVariableAssignment(VariableAssignment object)
      {
        return createVariableAssignmentAdapter();
      }
      @Override
      public Adapter caseVariableAssignmentObject(VariableAssignmentObject object)
      {
        return createVariableAssignmentObjectAdapter();
      }
      @Override
      public Adapter caseVariableExpression(VariableExpression object)
      {
        return createVariableExpressionAdapter();
      }
      @Override
      public Adapter caseVariableExpressionObject(VariableExpressionObject object)
      {
        return createVariableExpressionObjectAdapter();
      }
      @Override
      public Adapter caseAtomicVariableExpressionObject(AtomicVariableExpressionObject object)
      {
        return createAtomicVariableExpressionObjectAdapter();
      }
      @Override
      public Adapter caseCompoundVariableExpressionObject(CompoundVariableExpressionObject object)
      {
        return createCompoundVariableExpressionObjectAdapter();
      }
      @Override
      public Adapter caseRuleDefinition(RuleDefinition object)
      {
        return createRuleDefinitionAdapter();
      }
      @Override
      public Adapter caseRuleObject(RuleObject object)
      {
        return createRuleObjectAdapter();
      }
      @Override
      public Adapter caseDeviceDefinition(DeviceDefinition object)
      {
        return createDeviceDefinitionAdapter();
      }
      @Override
      public Adapter caseDeviceMembers(DeviceMembers object)
      {
        return createDeviceMembersAdapter();
      }
      @Override
      public Adapter caseATGCDefinition(ATGCDefinition object)
      {
        return createATGCDefinitionAdapter();
      }
      @Override
      public Adapter casePropertyDefinition(PropertyDefinition object)
      {
        return createPropertyDefinitionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropertyCondition(PropertyCondition object)
      {
        return createPropertyConditionAdapter();
      }
      @Override
      public Adapter caseQuantity(Quantity object)
      {
        return createQuantityAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.ModelMember <em>Model Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.ModelMember
   * @generated
   */
  public Adapter createModelMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember <em>Function Parameter Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember
   * @generated
   */
  public Adapter createFunctionParameterMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.FunctionBodyMember <em>Function Body Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.FunctionBodyMember
   * @generated
   */
  public Adapter createFunctionBodyMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.FunctionUseMember <em>Function Use Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.FunctionUseMember
   * @generated
   */
  public Adapter createFunctionUseMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableComplex <em>Variable Complex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableComplex
   * @generated
   */
  public Adapter createVariableComplexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableAttribute <em>Variable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableAttribute
   * @generated
   */
  public Adapter createVariableAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition
   * @generated
   */
  public Adapter createVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.ParameterAssignment <em>Parameter Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.ParameterAssignment
   * @generated
   */
  public Adapter createParameterAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableAssignment
   * @generated
   */
  public Adapter createVariableAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableAssignmentObject <em>Variable Assignment Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableAssignmentObject
   * @generated
   */
  public Adapter createVariableAssignmentObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableExpression
   * @generated
   */
  public Adapter createVariableExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.VariableExpressionObject <em>Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.VariableExpressionObject
   * @generated
   */
  public Adapter createVariableExpressionObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject <em>Atomic Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject
   * @generated
   */
  public Adapter createAtomicVariableExpressionObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject <em>Compound Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject
   * @generated
   */
  public Adapter createCompoundVariableExpressionObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.RuleDefinition <em>Rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition
   * @generated
   */
  public Adapter createRuleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.RuleObject <em>Rule Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.RuleObject
   * @generated
   */
  public Adapter createRuleObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.DeviceDefinition <em>Device Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition
   * @generated
   */
  public Adapter createDeviceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.DeviceMembers <em>Device Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.DeviceMembers
   * @generated
   */
  public Adapter createDeviceMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.ATGCDefinition <em>ATGC Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.ATGCDefinition
   * @generated
   */
  public Adapter createATGCDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition
   * @generated
   */
  public Adapter createPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.PropertyCondition <em>Property Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition
   * @generated
   */
  public Adapter createPropertyConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.Quantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.Quantity
   * @generated
   */
  public Adapter createQuantityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link roadblock.xtext.ibl.ibl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see roadblock.xtext.ibl.ibl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //IblAdapterFactory
