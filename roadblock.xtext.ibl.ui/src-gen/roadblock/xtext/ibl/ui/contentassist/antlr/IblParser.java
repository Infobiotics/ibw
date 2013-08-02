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
					put(grammarAccess.getParameterScopeAccess().getAlternatives(), "rule__ParameterScope__Alternatives");
					put(grammarAccess.getFunctionDefinitionMemberAccess().getAlternatives(), "rule__FunctionDefinitionMember__Alternatives");
					put(grammarAccess.getVariableDeclarationAccess().getAlternatives(), "rule__VariableDeclaration__Alternatives");
					put(grammarAccess.getVariableTypeAccess().getPrimitiveAlternatives_1_0(), "rule__VariableType__PrimitiveAlternatives_1_0");
					put(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives(), "rule__VariableExpressionOperator__Alternatives");
					put(grammarAccess.getPrimitiveVariableTypeAccess().getAlternatives(), "rule__PrimitiveVariableType__Alternatives");
					put(grammarAccess.getCollectionIDAccess().getAlternatives(), "rule__CollectionID__Alternatives");
					put(grammarAccess.getRuleDefinitionAccess().getAlternatives_5(), "rule__RuleDefinition__Alternatives_5");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup(), "rule__VariableDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_6(), "rule__FunctionDefinition__Group_6__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_11(), "rule__FunctionDefinition__Group_11__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_11_2(), "rule__FunctionDefinition__Group_11_2__0");
					put(grammarAccess.getFunctionUseMemberAccess().getGroup(), "rule__FunctionUseMember__Group__0");
					put(grammarAccess.getFunctionParameterMemberAccess().getGroup(), "rule__FunctionParameterMember__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_0(), "rule__VariableDeclaration__Group_0__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_0_1(), "rule__VariableDeclaration__Group_0_1__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_1(), "rule__VariableDeclaration__Group_1__0");
					put(grammarAccess.getVariableTypeAccess().getGroup(), "rule__VariableType__Group__0");
					put(grammarAccess.getVariableAttributeAccess().getGroup(), "rule__VariableAttribute__Group__0");
					put(grammarAccess.getVariableAttributeAccess().getGroup_2(), "rule__VariableAttribute__Group_2__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
					put(grammarAccess.getVariableExpressionAccess().getGroup(), "rule__VariableExpression__Group__0");
					put(grammarAccess.getVariableExpressionAccess().getGroup_2(), "rule__VariableExpression__Group_2__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup(), "rule__RuleDefinition__Group__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_4(), "rule__RuleDefinition__Group_4__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_4_1(), "rule__RuleDefinition__Group_4_1__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_6(), "rule__RuleDefinition__Group_6__0");
					put(grammarAccess.getRuleDefinitionAccess().getGroup_6_1(), "rule__RuleDefinition__Group_6_1__0");
					put(grammarAccess.getRuleObjectAccess().getGroup(), "rule__RuleObject__Group__0");
					put(grammarAccess.getRuleObjectAccess().getGroup_2(), "rule__RuleObject__Group_2__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getModelAccess().getMembersAssignment_1(), "rule__Model__MembersAssignment_1");
					put(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2(), "rule__VariableDefinition__TypeAssignment_2");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3(), "rule__VariableDefinition__NameAssignment_3");
					put(grammarAccess.getVariableDefinitionAccess().getMembersAssignment_5(), "rule__VariableDefinition__MembersAssignment_5");
					put(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_2(), "rule__FunctionDefinition__TypeAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_3(), "rule__FunctionDefinition__NameAssignment_3");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5(), "rule__FunctionDefinition__ParametersAssignment_5");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6_1(), "rule__FunctionDefinition__ParametersAssignment_6_1");
					put(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_9(), "rule__FunctionDefinition__MembersAssignment_9");
					put(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_1(), "rule__FunctionDefinition__UsesAssignment_11_1");
					put(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_2_1(), "rule__FunctionDefinition__UsesAssignment_11_2_1");
					put(grammarAccess.getFunctionUseMemberAccess().getTypeAssignment_0(), "rule__FunctionUseMember__TypeAssignment_0");
					put(grammarAccess.getFunctionUseMemberAccess().getNameAssignment_1(), "rule__FunctionUseMember__NameAssignment_1");
					put(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0(), "rule__FunctionParameterMember__TypeAssignment_0");
					put(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1(), "rule__FunctionParameterMember__NameAssignment_1");
					put(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_3(), "rule__FunctionParameterMember__ScopeAssignment_3");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0_1_0(), "rule__VariableDeclaration__TypeAssignment_0_1_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0_1_1(), "rule__VariableDeclaration__NameAssignment_0_1_1");
					put(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_1_0(), "rule__VariableDeclaration__CollectionAssignment_1_0");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1_2(), "rule__VariableDeclaration__TypeAssignment_1_2");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1_4(), "rule__VariableDeclaration__NameAssignment_1_4");
					put(grammarAccess.getVariableTypeAccess().getPrimitiveAssignment_1(), "rule__VariableType__PrimitiveAssignment_1");
					put(grammarAccess.getVariableAttributeAccess().getNameAssignment_1(), "rule__VariableAttribute__NameAssignment_1");
					put(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_2_1(), "rule__VariableAttribute__AttributeAssignment_2_1");
					put(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1(), "rule__VariableAssignment__VariableAssignment_1");
					put(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3(), "rule__VariableAssignment__ExpressionAssignment_3");
					put(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1(), "rule__VariableExpression__MembersAssignment_1");
					put(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1(), "rule__VariableExpression__MembersAssignment_2_1");
					put(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2(), "rule__RuleDefinition__NameAssignment_2");
					put(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0(), "rule__RuleDefinition__LhsAssignment_4_0");
					put(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1(), "rule__RuleDefinition__LhsAssignment_4_1_1");
					put(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0(), "rule__RuleDefinition__RhsAssignment_6_0");
					put(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1(), "rule__RuleDefinition__RhsAssignment_6_1_1");
					put(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_1(), "rule__RuleObject__SubobjectsAssignment_1");
					put(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_2_1(), "rule__RuleObject__SubobjectsAssignment_2_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2(), "rule__Import__ImportedNamespaceAssignment_2");
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
