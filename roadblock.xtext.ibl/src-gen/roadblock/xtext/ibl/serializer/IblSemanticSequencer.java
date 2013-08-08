package roadblock.xtext.ibl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import roadblock.xtext.ibl.ibl.ATGCDefinition;
import roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject;
import roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject;
import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Import;
import roadblock.xtext.ibl.ibl.List;
import roadblock.xtext.ibl.ibl.Model;
import roadblock.xtext.ibl.ibl.ParameterAssignment;
import roadblock.xtext.ibl.ibl.Property;
import roadblock.xtext.ibl.ibl.PropertyCondition;
import roadblock.xtext.ibl.ibl.PropertyDefinition;
import roadblock.xtext.ibl.ibl.PropertyInitialCondition;
import roadblock.xtext.ibl.ibl.Quantity;
import roadblock.xtext.ibl.ibl.RuleDefinition;
import roadblock.xtext.ibl.ibl.RuleObject;
import roadblock.xtext.ibl.ibl.VariableAssignment;
import roadblock.xtext.ibl.ibl.VariableAssignmentObject;
import roadblock.xtext.ibl.ibl.VariableAttribute;
import roadblock.xtext.ibl.ibl.VariableComplex;
import roadblock.xtext.ibl.ibl.VariableDefinition;
import roadblock.xtext.ibl.ibl.VariableExpression;
import roadblock.xtext.ibl.services.IblGrammarAccess;

@SuppressWarnings("all")
public class IblSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IblGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IblPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IblPackage.ATGC_DEFINITION:
				if(context == grammarAccess.getATGCDefinitionRule() ||
				   context == grammarAccess.getFunctionBodyMemberRule()) {
					sequence_ATGCDefinition(context, (ATGCDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.ATOMIC_VARIABLE_EXPRESSION_OBJECT:
				if(context == grammarAccess.getAtomicVariableExpressionObjectRule() ||
				   context == grammarAccess.getVariableExpressionObjectRule()) {
					sequence_AtomicVariableExpressionObject(context, (AtomicVariableExpressionObject) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.COMPOUND_VARIABLE_EXPRESSION_OBJECT:
				if(context == grammarAccess.getCompoundVariableExpressionObjectRule() ||
				   context == grammarAccess.getVariableExpressionObjectRule()) {
					sequence_CompoundVariableExpressionObject(context, (CompoundVariableExpressionObject) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.DEVICE_DEFINITION:
				if(context == grammarAccess.getDeviceDefinitionRule() ||
				   context == grammarAccess.getFunctionBodyMemberRule()) {
					sequence_DeviceDefinition(context, (DeviceDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getFunctionDefinitionRule() ||
				   context == grammarAccess.getModelMemberRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.FUNCTION_PARAMETER_MEMBER:
				if(context == grammarAccess.getFunctionParameterMemberRule()) {
					sequence_FunctionParameterMember(context, (FunctionParameterMember) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.FUNCTION_USE_MEMBER:
				if(context == grammarAccess.getFunctionUseMemberRule()) {
					sequence_FunctionUseMember(context, (FunctionUseMember) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.IMPORT:
				if(context == grammarAccess.getImportStatementRule() ||
				   context == grammarAccess.getModelMemberRule()) {
					sequence_ImportStatement(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PARAMETER_ASSIGNMENT:
				if(context == grammarAccess.getParameterAssignmentRule()) {
					sequence_ParameterAssignment(context, (ParameterAssignment) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROPERTY_CONDITION:
				if(context == grammarAccess.getPropertyConditionRule()) {
					sequence_PropertyCondition(context, (PropertyCondition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getFunctionBodyMemberRule() ||
				   context == grammarAccess.getPropertyDefinitionRule()) {
					sequence_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROPERTY_INITIAL_CONDITION:
				if(context == grammarAccess.getPropertyInitialConditionRule()) {
					sequence_PropertyInitialCondition(context, (PropertyInitialCondition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.QUANTITY:
				if(context == grammarAccess.getQuantityRule()) {
					sequence_Quantity(context, (Quantity) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.RULE_DEFINITION:
				if(context == grammarAccess.getFunctionBodyMemberRule() ||
				   context == grammarAccess.getRuleDefinitionRule()) {
					sequence_RuleDefinition(context, (RuleDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.RULE_OBJECT:
				if(context == grammarAccess.getRuleObjectRule()) {
					sequence_RuleObject(context, (RuleObject) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_ASSIGNMENT:
				if(context == grammarAccess.getFunctionBodyMemberRule() ||
				   context == grammarAccess.getVariableAssignmentRule()) {
					sequence_VariableAssignment(context, (VariableAssignment) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_ASSIGNMENT_OBJECT:
				if(context == grammarAccess.getVariableAssignmentObjectRule()) {
					sequence_VariableAssignmentObject(context, (VariableAssignmentObject) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_ATTRIBUTE:
				if(context == grammarAccess.getVariableAssignmentObjectRule() ||
				   context == grammarAccess.getVariableAttributeRule()) {
					sequence_VariableAttribute(context, (VariableAttribute) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_COMPLEX:
				if(context == grammarAccess.getRuleObjectRule() ||
				   context == grammarAccess.getVariableComplexRule()) {
					sequence_VariableComplex(context, (VariableComplex) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION:
				if(context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getFunctionBodyMemberRule() ||
				   context == grammarAccess.getVariableDefinitionRule()) {
					sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_EXPRESSION:
				if(context == grammarAccess.getVariableExpressionRule()) {
					sequence_VariableExpression(context, (VariableExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (command=ATGCCommand arguments+=VariableName arguments+=VariableName*)
	 */
	protected void sequence_ATGCDefinition(EObject context, ATGCDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=VariableName
	 */
	protected void sequence_AtomicVariableExpressionObject(EObject context, AtomicVariableExpressionObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list=List
	 */
	protected void sequence_CompoundVariableExpressionObject(EObject context, CompoundVariableExpressionObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.COMPOUND_VARIABLE_EXPRESSION_OBJECT__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.COMPOUND_VARIABLE_EXPRESSION_OBJECT__LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=VariableName 
	 *         parts+=VariableName 
	 *         parts+=VariableName* 
	 *         (parameters+=ParameterAssignment parameters+=ParameterAssignment*)? 
	 *         members+=DeviceMembers*
	 *     )
	 */
	protected void sequence_DeviceDefinition(EObject context, DeviceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=FunctionType 
	 *         name=VariableName 
	 *         (parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? 
	 *         members+=FunctionBodyMember* 
	 *         (uses+=FunctionUseMember uses+=FunctionUseMember*)?
	 *     )
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=VariableType name=VariableName scope=FunctionParameterScope?)
	 */
	protected void sequence_FunctionParameterMember(EObject context, FunctionParameterMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=VariableType name=VariableName)
	 */
	protected void sequence_FunctionUseMember(EObject context, FunctionUseMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.FUNCTION_USE_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.FUNCTION_USE_MEMBER__TYPE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.FUNCTION_USE_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.FUNCTION_USE_MEMBER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionUseMemberAccess().getTypeVariableTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFunctionUseMemberAccess().getNameVariableNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportStatement(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=AtomicVariableExpressionObject entries+=AtomicVariableExpressionObject*)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=ModelMember*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName value=VariableExpressionObject)
	 */
	protected void sequence_ParameterAssignment(EObject context, ParameterAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PARAMETER_ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PARAMETER_ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PARAMETER_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PARAMETER_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (lowerBound=Quantity upperBounds=Quantity (operator=RelationalOperator probability=REAL)?)? 
	 *         (initialConditions+=PropertyInitialCondition initialConditions+=PropertyInitialCondition*)?
	 *     )
	 */
	protected void sequence_PropertyCondition(EObject context, PropertyCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (property+=Property property+=Property* condition=PropertyCondition) | 
	 *         (name=VariableName time=Quantity (operator=RelationalOperator concentration=Quantity)?)
	 *     )
	 */
	protected void sequence_PropertyDefinition(EObject context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableAssignmentObject value=Quantity)
	 */
	protected void sequence_PropertyInitialCondition(EObject context, PropertyInitialCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY_INITIAL_CONDITION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY_INITIAL_CONDITION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY_INITIAL_CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY_INITIAL_CONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getPropertyInitialConditionAccess().getValueQuantityParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=VariableName operator=RelationalOperator rhs=Quantity)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY__LHS));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getLhsVariableNameParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getPropertyAccess().getOperatorRelationalOperatorParserRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getPropertyAccess().getRhsQuantityParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=REAL units=Unit)
	 */
	protected void sequence_Quantity(EObject context, Quantity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.QUANTITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.QUANTITY__VALUE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.QUANTITY__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.QUANTITY__UNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (lhs+=RuleObject lhs+=RuleObject*)? reversible?='<->'? (rhs+=RuleObject rhs+=RuleObject*)?)
	 */
	protected void sequence_RuleDefinition(EObject context, RuleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RuleObject}
	 */
	protected void sequence_RuleObject(EObject context, RuleObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VariableAssignmentObject}
	 */
	protected void sequence_VariableAssignmentObject(EObject context, VariableAssignmentObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableAssignmentObject expression=VariableExpression)
	 */
	protected void sequence_VariableAssignment(EObject context, VariableAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_ASSIGNMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_ASSIGNMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName attribute=VariableName)
	 */
	protected void sequence_VariableAttribute(EObject context, VariableAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_ATTRIBUTE__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAttributeAccess().getNameVariableNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAttributeAccess().getAttributeVariableNameParserRuleCall_3_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (components+=VariableName components+=VariableName+)
	 */
	protected void sequence_VariableComplex(EObject context, VariableComplex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifier=VariableQualifier? 
	 *         ((type=VariableType name=VariableName) | (collection=CollectionID type=VariableType name=VariableName)) 
	 *         (
	 *             ((constructor=VariableType | constructor=VariableName) (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?) | 
	 *             value=VariableExpressionObject
	 *         )?
	 *     )
	 */
	protected void sequence_VariableDefinition(EObject context, VariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=VariableExpressionObject members+=VariableExpressionObject*)
	 */
	protected void sequence_VariableExpression(EObject context, VariableExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
