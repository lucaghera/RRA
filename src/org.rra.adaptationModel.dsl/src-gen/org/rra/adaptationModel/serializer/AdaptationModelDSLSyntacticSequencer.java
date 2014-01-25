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
	protected AbstractElementAlias match_Rule_ELSETerminalRuleCall_7_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdaptationModelDSLGrammarAccess) access;
		match_Rule_ELSETerminalRuleCall_7_0_q = new TokenAlias(false, true, grammarAccess.getRuleAccess().getELSETerminalRuleCall_7_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getASRule())
			return getASToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCHANGERule())
			return getCHANGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDESELECTRule())
			return getDESELECTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPORT_TERMINALRule())
			return getIMPORT_TERMINALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLOGICAL_OPERATORRule())
			return getLOGICAL_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPERATORRule())
			return getOPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQualifiedNameWithWildcardRule())
			return getQualifiedNameWithWildcardToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRULE_TERMINALRule())
			return getRULE_TERMINALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSELECTRule())
			return getSELECTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTHENRule())
			return getTHENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVALUERule())
			return getVALUEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWITHRule())
			return getWITHToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AS              returns ecore::EString: 'as';
	 */
	protected String getASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "as";
	}
	
	/**
	 * terminal CHANGE          returns ecore::EString: 'change feature attribute';
	 */
	protected String getCHANGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "change feature attribute";
	}
	
	/**
	 * terminal DESELECT        returns ecore::EString: 'deselect feature';
	 */
	protected String getDESELECTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "deselect feature";
	}
	
	/**
	 * terminal ELSE            returns ecore::EString: 'else';
	 */
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * terminal IF              returns ecore::EString: 'if';
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal IMPORT_TERMINAL returns ecore::EString: 'import';
	 */
	protected String getIMPORT_TERMINALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import";
	}
	
	/**
	 * LOGICAL_OPERATOR:
	 * 	AND | OR 
	 * ;
	 */
	protected String getLOGICAL_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AND";
	}
	
	/**
	 * OPERATOR:
	 * 	SMALLER | BIGGER | EQUAL	
	 * ;
	 */
	protected String getOPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * QualifiedNameWithWildcard:
	 * 	QualifiedName '.*'?
	 * ;
	 */
	protected String getQualifiedNameWithWildcardToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal RULE_TERMINAL   returns ecore::EString: 'rule';
	 */
	protected String getRULE_TERMINALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "rule";
	}
	
	/**
	 * terminal SELECT          returns ecore::EString: 'select feature';
	 */
	protected String getSELECTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "select feature";
	}
	
	/**
	 * terminal THEN            returns ecore::EString: 'then';
	 */
	protected String getTHENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "then";
	}
	
	/**
	 * terminal VALUE returns ecore::EString: '"' ('0'..'9' | 'a'..'z' | '0'..'9' '.' '0'..'9')+'"';
	 */
	protected String getVALUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal WITH            returns ecore::EString: 'with';
	 */
	protected String getWITHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "with";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Rule_ELSETerminalRuleCall_7_0_q.equals(syntax))
				emit_Rule_ELSETerminalRuleCall_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ELSE?
	 */
	protected void emit_Rule_ELSETerminalRuleCall_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
