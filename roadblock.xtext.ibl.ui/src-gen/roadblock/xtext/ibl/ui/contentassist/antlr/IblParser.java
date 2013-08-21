/*
* generated by Xtext
*/
package roadblock.xtext.ibl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import roadblock.xtext.ibl.services.IblGrammarAccess;

public class IblParser extends AbstractContentAssistParser {
	
	@Inject
	private IblGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected roadblock.xtext.ibl.ui.contentassist.antlr.internal.InternalIblParser createParser() {
		roadblock.xtext.ibl.ui.contentassist.antlr.internal.InternalIblParser result = new roadblock.xtext.ibl.ui.contentassist.antlr.internal.InternalIblParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelMemberAccess().getAlternatives(), "rule__ModelMember__Alternatives");
					put(grammarAccess.getFunctionTypeAccess().getAlternatives(), "rule__FunctionType__Alternatives");
					put(grammarAccess.getFunctionParameterScopeAccess().getAlternatives(), "rule__FunctionParameterScope__Alternatives");
					put(grammarAccess.getFunctionBodyMemberAccess().getAlternatives(), "rule__FunctionBodyMember__Alternatives");
					put(grammarAccess.getVariableDefinitionAccess().getAlternatives_2(), "rule__VariableDefinition__Alternatives_2");
					put(grammarAccess.getVariableDefinitionAccess().getAlternatives_3_1(), "rule__VariableDefinition__Alternatives_3_1");
					put(grammarAccess.getVariableDefinitionAccess().getConstructorAlternatives_3_1_0_0_0(), "rule__VariableDefinition__ConstructorAlternatives_3_1_0_0_0");
					put(grammarAccess.getVariableTypeAccess().getAlternatives(), "rule__VariableType__Alternatives");
					put(grammarAccess.getCollectionIDAccess().getAlternatives(), "rule__CollectionID__Alternatives");
					put(grammarAccess.getVariableAssignmentObjectAccess().getAlternatives(), "rule__VariableAssignmentObject__Alternatives");
					put(grammarAccess.getVariableExpressionObjectAccess().getAlternatives(), "rule__VariableExpressionObject__Alternatives");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getAlternatives(), "rule__AtomicVariableExpressionObject__Alternatives");
					put(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives(), "rule__VariableExpressionOperator__Alternatives");
					put(grammarAccess.getRuleDefinitionAccess().getAlternatives_5(), "rule__RuleDefinition__Alternatives_5");
					put(grammarAccess.getRuleObjectAccess().getAlternatives(), "rule__RuleObject__Alternatives");
					put(grammarAccess.getDeviceMembersAccess().getAlternatives(), "rule__DeviceMembers__Alternatives");
					put(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2(), "rule__PropertyDefinition__Alternatives_2");
					put(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2_1_7(), "rule__PropertyDefinition__Alternatives_2_1_7");
					put(grammarAccess.getPropertyConditionAccess().getAlternatives_1(), "rule__PropertyCondition__Alternatives_1");
					put(grammarAccess.getPropertyConditionAccess().getAlternatives_2_6_1(), "rule__PropertyCondition__Alternatives_2_6_1");
					put(grammarAccess.getREALAccess().getAlternatives(), "rule__REAL__Alternatives");
					put(grammarAccess.getDecimalAccess().getAlternatives_0(), "rule__Decimal__Alternatives_0");
					put(grammarAccess.getDecimalExpAccess().getAlternatives_0(), "rule__DecimalExp__Alternatives_0");
					put(grammarAccess.getDecimalExpAccess().getAlternatives_3(), "rule__DecimalExp__Alternatives_3");
					put(grammarAccess.getDecimalExpAccess().getAlternatives_4(), "rule__DecimalExp__Alternatives_4");
					put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup(), "rule__ImportStatement__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_6(), "rule__FunctionDefinition__Group_6__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_6_1(), "rule__FunctionDefinition__Group_6_1__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_11(), "rule__FunctionDefinition__Group_11__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_11_2(), "rule__FunctionDefinition__Group_11_2__0");
					put(grammarAccess.getFunctionParameterMemberAccess().getGroup(), "rule__FunctionParameterMember__Group__0");
					put(grammarAccess.getFunctionParameterMemberAccess().getGroup_2(), "rule__FunctionParameterMember__Group_2__0");
					put(grammarAccess.getFunctionUseMemberAccess().getGroup(), "rule__FunctionUseMember__Group__0");
					put(grammarAccess.getVariableComplexAccess().getGroup(), "rule__VariableComplex__Group__0");
					put(grammarAccess.getVariableComplexAccess().getGroup_2(), "rule__VariableComplex__Group_2__0");
					put(grammarAccess.getVariableAttributeAccess().getGroup(), "rule__VariableAttribute__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup(), "rule__VariableDefinition__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_2_0(), "rule__VariableDefinition__Group_2_0__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_2_1(), "rule__VariableDefinition__Group_2_1__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_3(), "rule__VariableDefinition__Group_3__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_3_1_0(), "rule__VariableDefinition__Group_3_1_0__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_3_1_0_2(), "rule__VariableDefinition__Group_3_1_0_2__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_3_1_0_2_1(), "rule__VariableDefinition__Group_3_1_0_2_1__0");
					put(grammarAccess.getParameterAssignmentAccess().getGroup(), "rule__ParameterAssignment__Group__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
					put(grammarAccess.getVariableAssignmentObjectAccess().getGroup_0(), "rule__VariableAssignmentObject__Group_0__0");
					put(grammarAccess.getVariableExpressionAccess().getGroup(), "rule__VariableExpression__Group__0");
					put(grammarAccess.getVariableExpressionAccess().getGroup_2(), "rule__VariableExpression__Group_2__0");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getGroup_0(), "rule__AtomicVariableExpressionObject__Group_0__0");
					put(grammarAccess.getCompoundVariableExpressionObjectAccess().getGroup(), "rule__CompoundVariableExpressionObject__Group__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup(), "rule__RuleDefinition__Group__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_4(), "rule__RuleDefinition__Group_4__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_4_1(), "rule__RuleDefinition__Group_4_1__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_6(), "rule__RuleDefinition__Group_6__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_6_1(), "rule__RuleDefinition__Group_6_1__0");
					put(grammarAccess.getRuleObjectAccess().getGroup_0(), "rule__RuleObject__Group_0__0");
					put(grammarAccess.getDeviceDefinitionAccess().getGroup(), "rule__DeviceDefinition__Group__0");
					put(grammarAccess.getDeviceDefinitionAccess().getGroup_6(), "rule__DeviceDefinition__Group_6__0");
					put(grammarAccess.getDeviceDefinitionAccess().getGroup_6_1(), "rule__DeviceDefinition__Group_6_1__0");
					put(grammarAccess.getDeviceDefinitionAccess().getGroup_9(), "rule__DeviceDefinition__Group_9__0");
					put(grammarAccess.getDeviceDefinitionAccess().getGroup_9_1(), "rule__DeviceDefinition__Group_9_1__0");
					put(grammarAccess.getATGCDefinitionAccess().getGroup(), "rule__ATGCDefinition__Group__0");
					put(grammarAccess.getATGCDefinitionAccess().getGroup_5(), "rule__ATGCDefinition__Group_5__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup_2_0(), "rule__PropertyDefinition__Group_2_0__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup_2_0_2(), "rule__PropertyDefinition__Group_2_0_2__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup_2_1(), "rule__PropertyDefinition__Group_2_1__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup_2_1_7_0(), "rule__PropertyDefinition__Group_2_1_7_0__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup(), "rule__PropertyCondition__Group__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup_2(), "rule__PropertyCondition__Group_2__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup_2_6(), "rule__PropertyCondition__Group_2_6__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup_2_6_1_0(), "rule__PropertyCondition__Group_2_6_1_0__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup_3(), "rule__PropertyCondition__Group_3__0");
					put(grammarAccess.getPropertyConditionAccess().getGroup_3_2(), "rule__PropertyCondition__Group_3_2__0");
					put(grammarAccess.getPropertyInitialConditionAccess().getGroup(), "rule__PropertyInitialCondition__Group__0");
					put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
					put(grammarAccess.getDecimalAccess().getGroup_2(), "rule__Decimal__Group_2__0");
					put(grammarAccess.getDecimalExpAccess().getGroup(), "rule__DecimalExp__Group__0");
					put(grammarAccess.getDecimalExpAccess().getGroup_2(), "rule__DecimalExp__Group_2__0");
					put(grammarAccess.getQuantityAccess().getGroup(), "rule__Quantity__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_3(), "rule__List__Group_3__0");
					put(grammarAccess.getModelAccess().getMembersAssignment_1(), "rule__Model__MembersAssignment_1");
					put(grammarAccess.getImportStatementAccess().getImportedNamespaceAssignment_2(), "rule__ImportStatement__ImportedNamespaceAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_2(), "rule__FunctionDefinition__NameAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_4(), "rule__FunctionDefinition__TypeAssignment_4");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6_0(), "rule__FunctionDefinition__ParametersAssignment_6_0");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6_1_1(), "rule__FunctionDefinition__ParametersAssignment_6_1_1");
					put(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_9(), "rule__FunctionDefinition__MembersAssignment_9");
					put(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_1(), "rule__FunctionDefinition__UsesAssignment_11_1");
					put(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_2_1(), "rule__FunctionDefinition__UsesAssignment_11_2_1");
					put(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0(), "rule__FunctionParameterMember__TypeAssignment_0");
					put(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1(), "rule__FunctionParameterMember__NameAssignment_1");
					put(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_2_1(), "rule__FunctionParameterMember__ScopeAssignment_2_1");
					put(grammarAccess.getFunctionUseMemberAccess().getTypeAssignment_0(), "rule__FunctionUseMember__TypeAssignment_0");
					put(grammarAccess.getFunctionUseMemberAccess().getNameAssignment_1(), "rule__FunctionUseMember__NameAssignment_1");
					put(grammarAccess.getVariableComplexAccess().getComponentsAssignment_1(), "rule__VariableComplex__ComponentsAssignment_1");
					put(grammarAccess.getVariableComplexAccess().getComponentsAssignment_2_1(), "rule__VariableComplex__ComponentsAssignment_2_1");
					put(grammarAccess.getVariableAttributeAccess().getNameAssignment_1(), "rule__VariableAttribute__NameAssignment_1");
					put(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_3(), "rule__VariableAttribute__AttributeAssignment_3");
					put(grammarAccess.getVariableDefinitionAccess().getQualifierAssignment_1(), "rule__VariableDefinition__QualifierAssignment_1");
					put(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2_0_0(), "rule__VariableDefinition__TypeAssignment_2_0_0");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment_2_0_1(), "rule__VariableDefinition__NameAssignment_2_0_1");
					put(grammarAccess.getVariableDefinitionAccess().getCollectionAssignment_2_1_0(), "rule__VariableDefinition__CollectionAssignment_2_1_0");
					put(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2_1_2(), "rule__VariableDefinition__TypeAssignment_2_1_2");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment_2_1_4(), "rule__VariableDefinition__NameAssignment_2_1_4");
					put(grammarAccess.getVariableDefinitionAccess().getConstructorAssignment_3_1_0_0(), "rule__VariableDefinition__ConstructorAssignment_3_1_0_0");
					put(grammarAccess.getVariableDefinitionAccess().getParametersAssignment_3_1_0_2_0(), "rule__VariableDefinition__ParametersAssignment_3_1_0_2_0");
					put(grammarAccess.getVariableDefinitionAccess().getParametersAssignment_3_1_0_2_1_1(), "rule__VariableDefinition__ParametersAssignment_3_1_0_2_1_1");
					put(grammarAccess.getVariableDefinitionAccess().getValueAssignment_3_1_1(), "rule__VariableDefinition__ValueAssignment_3_1_1");
					put(grammarAccess.getParameterAssignmentAccess().getNameAssignment_0(), "rule__ParameterAssignment__NameAssignment_0");
					put(grammarAccess.getParameterAssignmentAccess().getValueAssignment_2(), "rule__ParameterAssignment__ValueAssignment_2");
					put(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1(), "rule__VariableAssignment__VariableAssignment_1");
					put(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3(), "rule__VariableAssignment__ExpressionAssignment_3");
					put(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1(), "rule__VariableExpression__MembersAssignment_1");
					put(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1(), "rule__VariableExpression__MembersAssignment_2_1");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableAssignment_0_1(), "rule__AtomicVariableExpressionObject__VariableAssignment_0_1");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeAssignment_1(), "rule__AtomicVariableExpressionObject__AttributeAssignment_1");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexAssignment_2(), "rule__AtomicVariableExpressionObject__ComplexAssignment_2");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueAssignment_3(), "rule__AtomicVariableExpressionObject__ValueAssignment_3");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityAssignment_4(), "rule__AtomicVariableExpressionObject__QuantityAssignment_4");
					put(grammarAccess.getAtomicVariableExpressionObjectAccess().getStringAssignment_5(), "rule__AtomicVariableExpressionObject__StringAssignment_5");
					put(grammarAccess.getCompoundVariableExpressionObjectAccess().getListAssignment_1(), "rule__CompoundVariableExpressionObject__ListAssignment_1");
					put(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2(), "rule__RuleDefinition__NameAssignment_2");
					put(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0(), "rule__RuleDefinition__LhsAssignment_4_0");
					put(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1(), "rule__RuleDefinition__LhsAssignment_4_1_1");
					put(grammarAccess.getRuleDefinitionAccess().getReversibleAssignment_5_1(), "rule__RuleDefinition__ReversibleAssignment_5_1");
					put(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0(), "rule__RuleDefinition__RhsAssignment_6_0");
					put(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1(), "rule__RuleDefinition__RhsAssignment_6_1_1");
					put(grammarAccess.getDeviceDefinitionAccess().getNameAssignment_2(), "rule__DeviceDefinition__NameAssignment_2");
					put(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_0(), "rule__DeviceDefinition__PartsAssignment_6_0");
					put(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_1_1(), "rule__DeviceDefinition__PartsAssignment_6_1_1");
					put(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_0(), "rule__DeviceDefinition__ParametersAssignment_9_0");
					put(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_1_1(), "rule__DeviceDefinition__ParametersAssignment_9_1_1");
					put(grammarAccess.getDeviceDefinitionAccess().getMembersAssignment_12(), "rule__DeviceDefinition__MembersAssignment_12");
					put(grammarAccess.getATGCDefinitionAccess().getCommandAssignment_2(), "rule__ATGCDefinition__CommandAssignment_2");
					put(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_4(), "rule__ATGCDefinition__ArgumentsAssignment_4");
					put(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_5_1(), "rule__ATGCDefinition__ArgumentsAssignment_5_1");
					put(grammarAccess.getPropertyDefinitionAccess().getPropertyAssignment_2_0_1(), "rule__PropertyDefinition__PropertyAssignment_2_0_1");
					put(grammarAccess.getPropertyDefinitionAccess().getPropertyAssignment_2_0_2_1(), "rule__PropertyDefinition__PropertyAssignment_2_0_2_1");
					put(grammarAccess.getPropertyDefinitionAccess().getConditionAssignment_2_0_4(), "rule__PropertyDefinition__ConditionAssignment_2_0_4");
					put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_1_2(), "rule__PropertyDefinition__NameAssignment_2_1_2");
					put(grammarAccess.getPropertyDefinitionAccess().getTimeAssignment_2_1_5(), "rule__PropertyDefinition__TimeAssignment_2_1_5");
					put(grammarAccess.getPropertyDefinitionAccess().getOperatorAssignment_2_1_7_0_0(), "rule__PropertyDefinition__OperatorAssignment_2_1_7_0_0");
					put(grammarAccess.getPropertyDefinitionAccess().getConcentrationAssignment_2_1_7_0_1(), "rule__PropertyDefinition__ConcentrationAssignment_2_1_7_0_1");
					put(grammarAccess.getPropertyAccess().getLhsAssignment_1(), "rule__Property__LhsAssignment_1");
					put(grammarAccess.getPropertyAccess().getOperatorAssignment_2(), "rule__Property__OperatorAssignment_2");
					put(grammarAccess.getPropertyAccess().getRhsAssignment_3(), "rule__Property__RhsAssignment_3");
					put(grammarAccess.getPropertyConditionAccess().getLowerBoundAssignment_2_2(), "rule__PropertyCondition__LowerBoundAssignment_2_2");
					put(grammarAccess.getPropertyConditionAccess().getUpperBoundsAssignment_2_4(), "rule__PropertyCondition__UpperBoundsAssignment_2_4");
					put(grammarAccess.getPropertyConditionAccess().getOperatorAssignment_2_6_1_0_0(), "rule__PropertyCondition__OperatorAssignment_2_6_1_0_0");
					put(grammarAccess.getPropertyConditionAccess().getProbabilityAssignment_2_6_1_0_1(), "rule__PropertyCondition__ProbabilityAssignment_2_6_1_0_1");
					put(grammarAccess.getPropertyConditionAccess().getInitialConditionsAssignment_3_1(), "rule__PropertyCondition__InitialConditionsAssignment_3_1");
					put(grammarAccess.getPropertyConditionAccess().getInitialConditionsAssignment_3_2_1(), "rule__PropertyCondition__InitialConditionsAssignment_3_2_1");
					put(grammarAccess.getPropertyInitialConditionAccess().getVariableAssignment_1(), "rule__PropertyInitialCondition__VariableAssignment_1");
					put(grammarAccess.getPropertyInitialConditionAccess().getValueAssignment_3(), "rule__PropertyInitialCondition__ValueAssignment_3");
					put(grammarAccess.getQuantityAccess().getValueAssignment_1(), "rule__Quantity__ValueAssignment_1");
					put(grammarAccess.getQuantityAccess().getUnitsAssignment_2(), "rule__Quantity__UnitsAssignment_2");
					put(grammarAccess.getListAccess().getEntriesAssignment_2(), "rule__List__EntriesAssignment_2");
					put(grammarAccess.getListAccess().getEntriesAssignment_3_1(), "rule__List__EntriesAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			roadblock.xtext.ibl.ui.contentassist.antlr.internal.InternalIblParser typedParser = (roadblock.xtext.ibl.ui.contentassist.antlr.internal.InternalIblParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IblGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IblGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
