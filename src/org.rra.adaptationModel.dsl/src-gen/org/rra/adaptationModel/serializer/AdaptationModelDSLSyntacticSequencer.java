package org.rra.adaptationModel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

@SuppressWarnings("all")
public class AdaptationModelDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AdaptationModelDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MeasurementComparison_LOGICAL_OPERATORParserRuleCall_3_q;
	protected AbstractElementAlias match_Rule_ElseKeyword_7_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdaptationModelDSLGrammarAccess) access;
		match_MeasurementComparison_LOGICAL_OPERATORParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3());
		match_Rule_ElseKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getRuleAccess().getElseKeyword_7_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getLOGICAL_OPERATORRule())
			return getLOGICAL_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPERATORRule())
			return getOPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * LOGICAL_OPERATOR:
	 * 	'AND' | 'OR' 
	 * ;
	 */
	protected String getLOGICAL_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AND";
	}
	
	/**
	 * OPERATOR:
	 * 	'<' | '>' | '==' | '<>'	
	 * ;
	 */
	protected String getOPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_MeasurementComparison_LOGICAL_OPERATORParserRuleCall_3_q.equals(syntax))
				emit_MeasurementComparison_LOGICAL_OPERATORParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rule_ElseKeyword_7_0_q.equals(syntax))
				emit_Rule_ElseKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     LOGICAL_OPERATOR?
	 */
	protected void emit_MeasurementComparison_LOGICAL_OPERATORParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_Rule_ElseKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
