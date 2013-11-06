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
	protected AbstractElementAlias match_ProbabilityProperty___WITHPROBABILITYKeyword_4_0_QuestionMarkKeyword_4_1_1__q;
	protected AbstractElementAlias match_RewardProperty_ATKeyword_5_0_or_WITHINKeyword_5_1;
	protected AbstractElementAlias match_StateFormula_ANDKeyword_2_2_0_or_IMPLIESKeyword_2_2_2_or_ORKeyword_2_2_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IblGrammarAccess) access;
		match_ProbabilityProperty___WITHPROBABILITYKeyword_4_0_QuestionMarkKeyword_4_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProbabilityPropertyAccess().getWITHPROBABILITYKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getProbabilityPropertyAccess().getQuestionMarkKeyword_4_1_1()));
		match_RewardProperty_ATKeyword_5_0_or_WITHINKeyword_5_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRewardPropertyAccess().getATKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRewardPropertyAccess().getWITHINKeyword_5_1()));
		match_StateFormula_ANDKeyword_2_2_0_or_IMPLIESKeyword_2_2_2_or_ORKeyword_2_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStateFormulaAccess().getANDKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getStateFormulaAccess().getIMPLIESKeyword_2_2_2()), new TokenAlias(false, false, grammarAccess.getStateFormulaAccess().getORKeyword_2_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getVariableExpressionOperatorRule())
			return getVariableExpressionOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVariableNameRule())
			return getVariableNameToken(semanticObject, ruleCall, node);
		return "";
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
			if(match_ProbabilityProperty___WITHPROBABILITYKeyword_4_0_QuestionMarkKeyword_4_1_1__q.equals(syntax))
				emit_ProbabilityProperty___WITHPROBABILITYKeyword_4_0_QuestionMarkKeyword_4_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RewardProperty_ATKeyword_5_0_or_WITHINKeyword_5_1.equals(syntax))
				emit_RewardProperty_ATKeyword_5_0_or_WITHINKeyword_5_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateFormula_ANDKeyword_2_2_0_or_IMPLIESKeyword_2_2_2_or_ORKeyword_2_2_1.equals(syntax))
				emit_StateFormula_ANDKeyword_2_2_0_or_IMPLIESKeyword_2_2_2_or_ORKeyword_2_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('WITH PROBABILITY' '?')?
	 */
	protected void emit_ProbabilityProperty___WITHPROBABILITYKeyword_4_0_QuestionMarkKeyword_4_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'WITHIN' | 'AT'
	 */
	protected void emit_RewardProperty_ATKeyword_5_0_or_WITHINKeyword_5_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'AND' | 'IMPLIES' | 'OR'
	 */
	protected void emit_StateFormula_ANDKeyword_2_2_0_or_IMPLIESKeyword_2_2_2_or_ORKeyword_2_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
