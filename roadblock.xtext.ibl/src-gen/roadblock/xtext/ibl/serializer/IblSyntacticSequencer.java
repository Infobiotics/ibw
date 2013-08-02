package roadblock.xtext.ibl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import roadblock.xtext.ibl.services.IblGrammarAccess;

@SuppressWarnings("all")
public class IblSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IblGrammarAccess grammarAccess;
	protected AbstractElementAlias match_RuleDefinition_HyphenMinusGreaterThanSignKeyword_5_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_5_1;
	protected AbstractElementAlias match_VariableAttribute_FullStopKeyword_2_0_0_or_TildeKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IblGrammarAccess) access;
		match_RuleDefinition_HyphenMinusGreaterThanSignKeyword_5_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_5_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1()));
		match_VariableAttribute_FullStopKeyword_2_0_0_or_TildeKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getVariableAttributeAccess().getTildeKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getVariableExpressionOperatorRule())
			return getVariableExpressionOperatorToken(semanticObject, ruleCall, node);
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_RuleDefinition_HyphenMinusGreaterThanSignKeyword_5_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_5_1.equals(syntax))
				emit_RuleDefinition_HyphenMinusGreaterThanSignKeyword_5_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_5_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableAttribute_FullStopKeyword_2_0_0_or_TildeKeyword_2_0_1.equals(syntax))
				emit_VariableAttribute_FullStopKeyword_2_0_0_or_TildeKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '<->' | '->'
	 */
	protected void emit_RuleDefinition_HyphenMinusGreaterThanSignKeyword_5_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_5_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '.' | '~'
	 */
	protected void emit_VariableAttribute_FullStopKeyword_2_0_0_or_TildeKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
