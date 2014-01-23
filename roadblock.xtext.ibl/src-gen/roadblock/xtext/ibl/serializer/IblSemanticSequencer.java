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
import roadblock.xtext.ibl.ibl.CellBody;
import roadblock.xtext.ibl.ibl.CellInstantiation;
import roadblock.xtext.ibl.ibl.ChromosomeBody;
import roadblock.xtext.ibl.ibl.ChromosomeInstantiation;
import roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject;
import roadblock.xtext.ibl.ibl.ConcentrationConstraint;
import roadblock.xtext.ibl.ibl.ConcentrationQuantity;
import roadblock.xtext.ibl.ibl.CustomFunctionBody;
import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Import;
import roadblock.xtext.ibl.ibl.List;
import roadblock.xtext.ibl.ibl.Model;
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
import roadblock.xtext.ibl.services.IblGrammarAccess;

@SuppressWarnings("all")
public class IblSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IblGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IblPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IblPackage.ATGC_DEFINITION:
				if(context == grammarAccess.getATGCDefinitionRule() ||
				   context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getSystemBodyMemberRule()) {
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
			case IblPackage.CELL_BODY:
				if(context == grammarAccess.getCellBodyRule()) {
					sequence_CellBody(context, (CellBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.CELL_INSTANTIATION:
				if(context == grammarAccess.getCellInstantiationRule() ||
				   context == grammarAccess.getRegionBodyMemberRule()) {
					sequence_CellInstantiation(context, (CellInstantiation) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.CHROMOSOME_BODY:
				if(context == grammarAccess.getChromosomeBodyRule()) {
					sequence_ChromosomeBody(context, (ChromosomeBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.CHROMOSOME_INSTANTIATION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeInstantiationRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule()) {
					sequence_ChromosomeInstantiation(context, (ChromosomeInstantiation) semanticObject); 
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
			case IblPackage.CONCENTRATION_CONSTRAINT:
				if(context == grammarAccess.getConcentrationConstraintRule()) {
					sequence_ConcentrationConstraint(context, (ConcentrationConstraint) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.CONCENTRATION_QUANTITY:
				if(context == grammarAccess.getConcentrationQuantityRule()) {
					sequence_ConcentrationQuantity(context, (ConcentrationQuantity) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.CUSTOM_FUNCTION_BODY:
				if(context == grammarAccess.getCustomFunctionBodyRule()) {
					sequence_CustomFunctionBody(context, (CustomFunctionBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.DEVICE_DEFINITION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getDeviceDefinitionRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getSystemBodyMemberRule()) {
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
			case IblPackage.PLASMID_BODY:
				if(context == grammarAccess.getPlasmidBodyRule()) {
					sequence_PlasmidBody(context, (PlasmidBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PLASMID_INSTANTIATION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getPlasmidInstantiationRule()) {
					sequence_PlasmidInstantiation(context, (PlasmidInstantiation) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROBABILITY_CONSTRAINT:
				if(context == grammarAccess.getProbabilityConstraintRule()) {
					sequence_ProbabilityConstraint(context, (ProbabilityConstraint) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROBABILITY_PROPERTY:
				if(context == grammarAccess.getProbabilityPropertyRule()) {
					sequence_ProbabilityProperty(context, (ProbabilityProperty) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROCESS_BODY:
				if(context == grammarAccess.getProcessBodyRule()) {
					sequence_ProcessBody(context, (ProcessBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROCESS_INSTANTIATION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getProcessBodyMemberRule() ||
				   context == grammarAccess.getProcessInstantiationRule() ||
				   context == grammarAccess.getSystemBodyMemberRule()) {
					sequence_ProcessInstantiation(context, (ProcessInstantiation) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getPropertyDefinitionRule() ||
				   context == grammarAccess.getSystemBodyMemberRule()) {
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
			case IblPackage.REGION_BODY:
				if(context == grammarAccess.getRegionBodyRule()) {
					sequence_RegionBody(context, (RegionBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.REWARD_PROPERTY:
				if(context == grammarAccess.getRewardPropertyRule()) {
					sequence_RewardProperty(context, (RewardProperty) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.REWARD_TIME_INSTANT:
				if(context == grammarAccess.getRewardTimeInstantRule()) {
					sequence_RewardTimeInstant(context, (RewardTimeInstant) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.RULE_DEFINITION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getProcessBodyMemberRule() ||
				   context == grammarAccess.getRegionBodyMemberRule() ||
				   context == grammarAccess.getRuleDefinitionRule() ||
				   context == grammarAccess.getSystemBodyMemberRule()) {
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
			case IblPackage.STATE_EXPRESSION:
				if(context == grammarAccess.getStateExpressionRule()) {
					sequence_StateExpression(context, (StateExpression) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.STATE_FORMULA:
				if(context == grammarAccess.getStateFormulaRule()) {
					sequence_StateFormula(context, (StateFormula) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.SYSTEM_BODY:
				if(context == grammarAccess.getSystemBodyRule()) {
					sequence_SystemBody(context, (SystemBody) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.SYSTEM_INSTANTIATION:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getSystemInstantiationRule()) {
					sequence_SystemInstantiation(context, (SystemInstantiation) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.TIME_INSTANT:
				if(context == grammarAccess.getTimeInstantRule()) {
					sequence_TimeInstant(context, (TimeInstant) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.TIME_INTERVAL:
				if(context == grammarAccess.getTimeIntervalRule()) {
					sequence_TimeInterval(context, (TimeInterval) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_ASSIGNMENT:
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getProcessBodyMemberRule() ||
				   context == grammarAccess.getRegionBodyMemberRule() ||
				   context == grammarAccess.getSystemBodyMemberRule() ||
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
				if(context == grammarAccess.getCellBodyMemberRule() ||
				   context == grammarAccess.getChromosomeBodyMemberRule() ||
				   context == grammarAccess.getCustomFunctionBodyMemberRule() ||
				   context == grammarAccess.getDeviceMembersRule() ||
				   context == grammarAccess.getPlasmidBodyMemberRule() ||
				   context == grammarAccess.getProcessBodyMemberRule() ||
				   context == grammarAccess.getRegionBodyMemberRule() ||
				   context == grammarAccess.getSystemBodyMemberRule() ||
				   context == grammarAccess.getVariableDefinitionRule()) {
					sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION_BASIC:
				if(context == grammarAccess.getVariableDefinitionBasicRule()) {
					sequence_VariableDefinitionBasic(context, (VariableDefinitionBasic) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION_BUILT_IN:
				if(context == grammarAccess.getVariableDefinitionBuiltInRule()) {
					sequence_VariableDefinitionBuiltIn(context, (VariableDefinitionBuiltIn) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION_COLLECTION:
				if(context == grammarAccess.getVariableDefinitionCollectionRule()) {
					sequence_VariableDefinitionCollection(context, (VariableDefinitionCollection) semanticObject); 
					return; 
				}
				else break;
			case IblPackage.VARIABLE_DEFINITION_USER_DEFINED:
				if(context == grammarAccess.getVariableDefinitionUserDefinedRule()) {
					sequence_VariableDefinitionUserDefined(context, (VariableDefinitionUserDefined) semanticObject); 
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
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=CellBodyMember*)
	 */
	protected void sequence_CellBody(EObject context, CellBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_CellInstantiation(EObject context, CellInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=ChromosomeBodyMember*)
	 */
	protected void sequence_ChromosomeBody(EObject context, ChromosomeBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_ChromosomeInstantiation(EObject context, ChromosomeInstantiation semanticObject) {
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
	 *     (operator=RelationalOperator value=REAL unit=ConcentrationUnit)
	 */
	protected void sequence_ConcentrationConstraint(EObject context, ConcentrationConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=REAL unit=ConcentrationUnit)
	 */
	protected void sequence_ConcentrationQuantity(EObject context, ConcentrationQuantity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.CONCENTRATION_QUANTITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.CONCENTRATION_QUANTITY__VALUE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.CONCENTRATION_QUANTITY__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.CONCENTRATION_QUANTITY__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcentrationQuantityAccess().getValueREALParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getConcentrationQuantityAccess().getUnitConcentrationUnitParserRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (functionType=VariableName (parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=CustomFunctionBodyMember*)
	 */
	protected void sequence_CustomFunctionBody(EObject context, CustomFunctionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName parts=List input=List? outputput=List? members+=DeviceMembers*)
	 */
	protected void sequence_DeviceDefinition(EObject context, DeviceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=VariableName 
	 *         (
	 *             functionBody=ProcessBody | 
	 *             functionBody=SystemBody | 
	 *             functionBody=PlasmidBody | 
	 *             functionBody=ChromosomeBody | 
	 *             functionBody=CellBody | 
	 *             functionBody=RegionBody | 
	 *             functionBody=CustomFunctionBody
	 *         ) 
	 *         (uses+=FunctionUseMember uses+=FunctionUseMember*)?
	 *     )
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=VariableType | (collection=CollectionID (type=VariableType | type=VariableName))) name=VariableName scope=FunctionParameterScope?)
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
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=PlasmidBodyMember*)
	 */
	protected void sequence_PlasmidBody(EObject context, PlasmidBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_PlasmidInstantiation(EObject context, PlasmidInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator=RelationalOperator probability=UnitInterval) | hasUnknownProbability?='?')
	 */
	protected void sequence_ProbabilityConstraint(EObject context, ProbabilityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         stateFormula1=StateFormula 
	 *         (
	 *             (
	 *                 (
	 *                     isEventually?='EVENTUALLY HOLDS' | 
	 *                     isNever?='NEVER HOLDS' | 
	 *                     isAlways?='ALWAYS HOLDS' | 
	 *                     ((isUntilThen?='WILL HOLD UNTIL THEN' | isFollowedBy?='IS FOLLOWED BY') stateFormula2=StateFormula)
	 *                 ) 
	 *                 (timeInstant=TimeInstant | timeInterval=TimeInterval)?
	 *             ) | 
	 *             isSteadyState?='HOLDS IN STEADY-STATE' | 
	 *             isInfinitelyOften?='HOLDS INFINITELY OFTEN'
	 *         ) 
	 *         probabilityConstraint=ProbabilityConstraint? 
	 *         (initialConditions+=PropertyInitialCondition initialConditions+=PropertyInitialCondition*)?
	 *     )
	 */
	protected void sequence_ProbabilityProperty(EObject context, ProbabilityProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=ProcessBodyMember*)
	 */
	protected void sequence_ProcessBody(EObject context, ProcessBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_ProcessInstantiation(EObject context, ProcessInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=ProbabilityProperty | property=RewardProperty)
	 */
	protected void sequence_PropertyDefinition(EObject context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableAssignmentObject value=ConcentrationQuantity)
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
		feeder.accept(grammarAccess.getPropertyInitialConditionAccess().getValueConcentrationQuantityParserRuleCall_3_0(), semanticObject.getValue());
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
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=RegionBodyMember*)
	 */
	protected void sequence_RegionBody(EObject context, RegionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=VariableName 
	 *         timeInstant=RewardTimeInstant 
	 *         concentrationConstraint=ConcentrationConstraint 
	 *         (initialConditions+=PropertyInitialCondition initialConditions+=PropertyInitialCondition*)?
	 *     )
	 */
	protected void sequence_RewardProperty(EObject context, RewardProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((isEqualTo?='AT' | isLessThanOrEqual?='WITHIN') timeValue=INT timeUnit=TimeUnit)
	 */
	protected void sequence_RewardTimeInstant(EObject context, RewardTimeInstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=VariableName operator=RelationalOperator concentrationQuantity=ConcentrationQuantity)
	 */
	protected void sequence_StateExpression(EObject context, StateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.STATE_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.STATE_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.STATE_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.STATE_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.STATE_EXPRESSION__CONCENTRATION_QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.STATE_EXPRESSION__CONCENTRATION_QUANTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateExpressionAccess().getNameVariableNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateExpressionAccess().getOperatorRelationalOperatorParserRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getStateExpressionAccess().getConcentrationQuantityConcentrationQuantityParserRuleCall_3_0(), semanticObject.getConcentrationQuantity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formula='[' atomicFormula=StateExpression)
	 */
	protected void sequence_StateFormula(EObject context, StateFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=FunctionParameterMember parameters+=FunctionParameterMember*)? members+=SystemBodyMember*)
	 */
	protected void sequence_SystemBody(EObject context, SystemBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_SystemInstantiation(EObject context, SystemInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((isEqualTo?='AT' timeInstant=INT) | (isLessThanOrEqual?='BEFORE' timeInstant=INT) | (isGreaterThanOrEqual?='AFTER' timeInstant=INT)) 
	 *         timeUnit=TimeUnit
	 *     )
	 */
	protected void sequence_TimeInstant(EObject context, TimeInstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=INT upperBound=INT timeUnit=TimeUnit)
	 */
	protected void sequence_TimeInterval(EObject context, TimeInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.TIME_INTERVAL__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.TIME_INTERVAL__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.TIME_INTERVAL__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.TIME_INTERVAL__UPPER_BOUND));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.TIME_INTERVAL__TIME_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.TIME_INTERVAL__TIME_UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeIntervalAccess().getLowerBoundINTTerminalRuleCall_3_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getTimeIntervalAccess().getUpperBoundINTTerminalRuleCall_5_0(), semanticObject.getUpperBound());
		feeder.accept(grammarAccess.getTimeIntervalAccess().getTimeUnitTimeUnitParserRuleCall_7_0(), semanticObject.getTimeUnit());
		feeder.finish();
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
	 *     ((name=VariableName | complex=VariableComplex) attribute=VariableName)
	 */
	protected void sequence_VariableAttribute(EObject context, VariableAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (type=VariableType name=VariableName expression=VariableExpression)
	 */
	protected void sequence_VariableDefinitionBasic(EObject context, VariableDefinitionBasic semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__TYPE));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__NAME));
			if(transientValues.isValueTransient(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IblPackage.Literals.VARIABLE_DEFINITION_BASIC__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=VariableType 
	 *         (name=VariableName | complex=VariableComplex) 
	 *         ((constructor=VariableType | constructor=VariableName) (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?
	 *     )
	 */
	protected void sequence_VariableDefinitionBuiltIn(EObject context, VariableDefinitionBuiltIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (collection=CollectionID (type=VariableType | type=VariableName) name=VariableName value=List?)
	 */
	protected void sequence_VariableDefinitionCollection(EObject context, VariableDefinitionCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=VariableName name=VariableName (constructor=VariableName (parameters+=ParameterAssignment parameters+=ParameterAssignment*)?)?)
	 */
	protected void sequence_VariableDefinitionUserDefined(EObject context, VariableDefinitionUserDefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             definition=VariableDefinitionBuiltIn | 
	 *             definition=VariableDefinitionUserDefined | 
	 *             definition=VariableDefinitionCollection | 
	 *             definition=VariableDefinitionBasic
	 *         ) 
	 *         qualifier=VariableQualifier?
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
