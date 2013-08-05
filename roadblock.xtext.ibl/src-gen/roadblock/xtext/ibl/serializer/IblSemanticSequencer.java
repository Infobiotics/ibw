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
import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Import;
import roadblock.xtext.ibl.ibl.Model;
import roadblock.xtext.ibl.ibl.ProcessDeclaration;
import roadblock.xtext.ibl.ibl.Property;
import roadblock.xtext.ibl.ibl.PropertyCondition;
import roadblock.xtext.ibl.ibl.PropertyStatement;
import roadblock.xtext.ibl.ibl.Quantity;
import roadblock.xtext.ibl.ibl.RuleDefinition;
import roadblock.xtext.ibl.ibl.RuleObject;
import roadblock.xtext.ibl.ibl.VariableAssignment;
import roadblock.xtext.ibl.ibl.VariableAttribute;
import roadblock.xtext.ibl.ibl.VariableDeclaration;
import roadblock.xtext.ibl.ibl.VariableDefinition;
import roadblock.xtext.ibl.ibl.VariableExpression;
import roadblock.xtext.ibl.ibl.VerificationStatement;
import roadblock.xtext.ibl.services.IblGrammarAccess;

@SuppressWarnings("all")
public class IblSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IblGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IblPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IblPackage.ATGC_DEFINITION:
				if(context == grammarAccess.getATGCDefinitionRule() ||
				   context == grammarAccess.getFunctionDefinitionMemberRule()) {
					sequence_ATGCDefinition(context, (ATGCDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.DEVICE_DEFINITION:
				if(context == grammarAccess.getDeviceDefinitionRule() ||
				   context == grammarAccess.getFunctionDefinitionMemberRule()) {
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
				if(context == grammarAccess.getImportRule() ||
				   context == grammarAccess.getModelMemberRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROCESS_DECLARATION:
				if(context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getProcessDeclarationRule()) {
					sequence_ProcessDeclaration(context, (ProcessDeclaration) semanticObject); 
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
			case IblPackage.PROPERTY_STATEMENT:
				if(context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getFunctionDefinitionMemberRule() ||
				   context == grammarAccess.getPropertyDefinitionRule() ||
				   context == grammarAccess.getPropertyStatementRule()) {
					sequence_PropertyStatement(context, (PropertyStatement) semanticObject); 
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
				if(context == grammarAccess.getFunctionDefinitionMemberRule() ||
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
				if(context == grammarAccess.getFunctionDefinitionMemberRule() ||
				   context == grammarAccess.getVariableAssignmentRule()) {
					sequence_VariableAssignment(context, (VariableAssignment) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_ATTRIBUTE:
				if(context == grammarAccess.getVariableAttributeRule()) {
					sequence_VariableAttribute(context, (VariableAttribute) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getFunctionDefinitionMemberRule() ||
				   context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getVariableDefinitionMemberRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION:
				if(context == grammarAccess.getModelMemberRule() ||
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
			case IblPackage.VERIFICATION_STATEMENT:
				if(context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getFunctionDefinitionMemberRule() ||
				   context == grammarAccess.getPropertyDefinitionRule() ||
				   context == grammarAccess.getVerificationStatementRule()) {
					sequence_VerificationStatement(context, (VerificationStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (command=ID arguments+=ID arguments+=ID*)
	 */
	protected void sequence_ATGCDefinition(EObject context, ATGCDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parts+=ID parts+=ID* (parameters+=VariableAssignment parameters+=VariableAssignment*)? members+=DeviceMembers*)
	 */
	protected void sequence_DeviceDefinition(EObject context, DeviceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=ID? 
	 *         name=ID 
	 *         (parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? 
	 *         members+=FunctionDefinitionMember* 
	 *         (uses+=FunctionUseMember uses+=FunctionUseMember*)?
	 *     )
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID name=ID scope=ParameterScope)
	 */
	protected void sequence_FunctionParameterMember(EObject context, FunctionParameterMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__TYPE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__SCOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.FUNCTION_PARAMETER_MEMBER__SCOPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0(), semanticObject.getScope());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID name=ID)
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
		feeder.accept(grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
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
	 *     (name=ID constructor=ID (parameters+=VariableAssignment parameters+=VariableAssignment*)?)
	 */
	protected void sequence_ProcessDeclaration(EObject context, ProcessDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((lowerBound=REAL upperBounds=REAL (operator=RelationalOperator probability=REAL)?)?)
	 */
	protected void sequence_PropertyCondition(EObject context, PropertyCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID arguments=STRING)
	 */
	protected void sequence_PropertyStatement(EObject context, PropertyStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.DEVICE_MEMBERS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.DEVICE_MEMBERS__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.PROPERTY_STATEMENT__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.PROPERTY_STATEMENT__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyStatementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyStatementAccess().getArgumentsSTRINGTerminalRuleCall_4_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=ID operator=RelationalOperator rhs=Quantity)
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
		feeder.accept(grammarAccess.getPropertyAccess().getLhsIDTerminalRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getPropertyAccess().getOperatorRelationalOperatorParserRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getPropertyAccess().getRhsQuantityParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=REAL units=ID)
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
		feeder.accept(grammarAccess.getQuantityAccess().getUnitsIDTerminalRuleCall_2_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (lhs+=RuleObject lhs+=RuleObject*)? (rhs+=RuleObject rhs+=RuleObject*)?)
	 */
	protected void sequence_RuleDefinition(EObject context, RuleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subobjects+=ID subobjects+=ID*)
	 */
	protected void sequence_RuleObject(EObject context, RuleObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableAttribute expression=VariableExpression)
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
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=REAL) attribute=ID?)
	 */
	protected void sequence_VariableAttribute(EObject context, VariableAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifier=VariableQualifier? 
	 *         ((type=ID name=ID) | (collection=CollectionID type=ID name=ID)) 
	 *         (constructor=ID (parameters+=VariableAssignment parameters+=VariableAssignment*)?)?
	 *     )
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID? name=ID members+=VariableDefinitionMember*)
	 */
	protected void sequence_VariableDefinition(EObject context, VariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=VariableAttribute members+=VariableAttribute*)
	 */
	protected void sequence_VariableExpression(EObject context, VariableExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (property+=Property property+=Property* condition=PropertyCondition) | 
	 *         (name=ID time=REAL (operator=RelationalOperator concentration=Quantity)?)
	 *     )
	 */
	protected void sequence_VerificationStatement(EObject context, VerificationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
