package roadblock.xtext.ibl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import roadblock.xtext.ibl.services.IblGrammarAccess;

@SuppressWarnings("all")
public class IblSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IblGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PropertyCondition_ALWAYSHOLDSKeyword_1_2_or_EVENTUALLYHOLDSKeyword_1_3_or_NEVERHOLDSKeyword_1_1_or_SOMETIMESHOLDSKeyword_1_4_or_WILLHOLDKeyword_1_0;
	protected AbstractElementAlias match_PropertyCondition___WITHPROBABILITYBOUNDKeyword_2_6_0_QuestionMarkKeyword_2_6_1_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IblGrammarAccess) access;
		match_PropertyCondition_ALWAYSHOLDSKeyword_1_2_or_EVENTUALLYHOLDSKeyword_1_3_or_NEVERHOLDSKeyword_1_1_or_SOMETIMESHOLDSKeyword_1_4_or_WILLHOLDKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getALWAYSHOLDSKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getEVENTUALLYHOLDSKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getNEVERHOLDSKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getSOMETIMESHOLDSKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getWILLHOLDKeyword_1_0()));
		match_PropertyCondition___WITHPROBABILITYBOUNDKeyword_2_6_0_QuestionMarkKeyword_2_6_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getWITHPROBABILITYBOUNDKeyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getPropertyConditionAccess().getQuestionMarkKeyword_2_6_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBooleanOperatorRule())
			return getBooleanOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVariableExpressionOperatorRule())
			return getVariableExpressionOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVariableNameRule())
			return getVariableNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BooleanOperator:
	 * 	'&' | '|' | 'AND' | 'OR' | 'AND' 'NOT' | 'OR' 'NOT'
	 * ;
	 */
	protected String getBooleanOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * VariableExpressionOperator:
	 * 	'+' | '-' | '|'
	 * ;
	 */
	protected String getVariableExpressionOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * VariableName:
	 * 	ID
	 * ;
	 */
	protected String getVariableNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PropertyCondition_ALWAYSHOLDSKeyword_1_2_or_EVENTUALLYHOLDSKeyword_1_3_or_NEVERHOLDSKeyword_1_1_or_SOMETIMESHOLDSKeyword_1_4_or_WILLHOLDKeyword_1_0.equals(syntax))
				emit_PropertyCondition_ALWAYSHOLDSKeyword_1_2_or_EVENTUALLYHOLDSKeyword_1_3_or_NEVERHOLDSKeyword_1_1_or_SOMETIMESHOLDSKeyword_1_4_or_WILLHOLDKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertyCondition___WITHPROBABILITYBOUNDKeyword_2_6_0_QuestionMarkKeyword_2_6_1_1__q.equals(syntax))
				emit_PropertyCondition___WITHPROBABILITYBOUNDKeyword_2_6_0_QuestionMarkKeyword_2_6_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'NEVER HOLDS' | 'SOMETIMES HOLDS' | 'ALWAYS HOLDS' | 'WILL HOLD' | 'EVENTUALLY HOLDS'
	 */
	protected void emit_PropertyCondition_ALWAYSHOLDSKeyword_1_2_or_EVENTUALLYHOLDSKeyword_1_3_or_NEVERHOLDSKeyword_1_1_or_SOMETIMESHOLDSKeyword_1_4_or_WILLHOLDKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('WITH PROBABILITY BOUND' '?')?
	 */
	protected void emit_PropertyCondition___WITHPROBABILITYBOUNDKeyword_2_6_0_QuestionMarkKeyword_2_6_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
