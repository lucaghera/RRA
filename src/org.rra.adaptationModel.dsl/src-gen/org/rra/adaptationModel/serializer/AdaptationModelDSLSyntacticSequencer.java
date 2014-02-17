package org.rra.adaptationModel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

@SuppressWarnings("all")
public class AdaptationModelDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AdaptationModelDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicAction_ANDKeyword_1_q;
	protected AbstractElementAlias match_ConditionAction_ElseKeyword_2_0_q;
	protected AbstractElementAlias match_RuleSet___RightCurlyBracketKeyword_7_4_ElseKeyword_7_0_LeftCurlyBracketKeyword_7_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdaptationModelDSLGrammarAccess) access;
		match_AtomicAction_ANDKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAtomicActionAccess().getANDKeyword_1());
		match_ConditionAction_ElseKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getConditionActionAccess().getElseKeyword_2_0());
		match_RuleSet___RightCurlyBracketKeyword_7_4_ElseKeyword_7_0_LeftCurlyBracketKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_7_4()), new TokenAlias(false, false, grammarAccess.getRuleSetAccess().getElseKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_7_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getQueryOperatorRule())
			return getQueryOperatorToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * QueryOperator:
	 * 	'max' | 'min'
	 * ;
	 */
	protected String getQueryOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "max";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtomicAction_ANDKeyword_1_q.equals(syntax))
				emit_AtomicAction_ANDKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConditionAction_ElseKeyword_2_0_q.equals(syntax))
				emit_ConditionAction_ElseKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RuleSet___RightCurlyBracketKeyword_7_4_ElseKeyword_7_0_LeftCurlyBracketKeyword_7_2__q.equals(syntax))
				emit_RuleSet___RightCurlyBracketKeyword_7_4_ElseKeyword_7_0_LeftCurlyBracketKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'AND'?
	 */
	protected void emit_AtomicAction_ANDKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_ConditionAction_ElseKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'else' '{')?
	 */
	protected void emit_RuleSet___RightCurlyBracketKeyword_7_4_ElseKeyword_7_0_LeftCurlyBracketKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
