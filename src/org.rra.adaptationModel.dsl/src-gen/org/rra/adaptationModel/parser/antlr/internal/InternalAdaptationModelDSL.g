/*
* generated by Xtext
*/
grammar InternalAdaptationModelDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.rra.adaptationModel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.rra.adaptationModel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

}

@parser::members {

 	private AdaptationModelDSLGrammarAccess grammarAccess;
 	
    public InternalAdaptationModelDSLParser(TokenStream input, AdaptationModelDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "AdaptationModel";	
   	}
   	
   	@Override
   	protected AdaptationModelDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAdaptationModel
entryRuleAdaptationModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdaptationModelRule()); }
	 iv_ruleAdaptationModel=ruleAdaptationModel 
	 { $current=$iv_ruleAdaptationModel.current; } 
	 EOF 
;

// Rule AdaptationModel
ruleAdaptationModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 
	    }
		lv_imports_0_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_0_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_1='feature model' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAdaptationModelAccess().getFeatureModelKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getAdaptationModelAccess().getFeatureModelFeatureModelCrossReference_2_0()); 
	}

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_3());
    }
	otherlv_4='template system model' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAdaptationModelAccess().getTemplateSystemModelKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getAdaptationModelAccess().getTempalteSystemModelSystemCrossReference_5_0()); 
	}

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_6());
    }
	otherlv_7='resolution model' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAdaptationModelAccess().getResolutionModelKeyword_7());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getAdaptationModelAccess().getResolutionModelResolutionModelCrossReference_8_0()); 
	}

)
)	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_9());
    }
	otherlv_10='cdm model' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAdaptationModelAccess().getCdmModelKeyword_10());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getAdaptationModelAccess().getCdmModelContextDependentMeasurementsModelCrossReference_11_0()); 
	}

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_12());
    }
	otherlv_13='data types model' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getAdaptationModelAccess().getDataTypesModelKeyword_13());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
        }
	otherlv_14=RULE_ID
	{
		newLeafNode(otherlv_14, grammarAccess.getAdaptationModelAccess().getDataTypesModelDataTypesModelCrossReference_14_0()); 
	}

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_15());
    }
	otherlv_16='name' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getAdaptationModelAccess().getNameKeyword_16());
    }
(
(
		lv_name_17_0=RULE_ID
		{
			newLeafNode(lv_name_17_0, grammarAccess.getAdaptationModelAccess().getNameIDTerminalRuleCall_17_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_17_0, 
        		"ID");
	    }

)
)	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_18());
    }
	otherlv_19='period[ms]' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getAdaptationModelAccess().getPeriodMsKeyword_19());
    }
(
(
		lv_period_20_0=RULE_INT
		{
			newLeafNode(lv_period_20_0, grammarAccess.getAdaptationModelAccess().getPeriodINTTerminalRuleCall_20_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdaptationModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"period",
        		lv_period_20_0, 
        		"INT");
	    }

)
)	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_21());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_22_0()); 
	    }
		lv_adaptationRules_22_0=ruleAdaptationRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
	        }
       		add(
       			$current, 
       			"adaptationRules",
        		lv_adaptationRules_22_0, 
        		"AdaptationRule");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		lv_importURI_1_0=RULE_STRING
		{
			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_1_0, 
        		"STRING");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
    }
)
;







// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleAdaptationRule
entryRuleAdaptationRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdaptationRuleRule()); }
	 iv_ruleAdaptationRule=ruleAdaptationRule 
	 { $current=$iv_ruleAdaptationRule.current; } 
	 EOF 
;

// Rule AdaptationRule
ruleAdaptationRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAdaptationRuleAccess().getAtomicRuleParserRuleCall_0()); 
    }
    this_AtomicRule_0=ruleAtomicRule
    { 
        $current = $this_AtomicRule_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1()); 
    }
    this_RuleSet_1=ruleRuleSet
    { 
        $current = $this_RuleSet_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAtomicRule
entryRuleAtomicRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRuleRule()); }
	 iv_ruleAtomicRule=ruleAtomicRule 
	 { $current=$iv_ruleAtomicRule.current; } 
	 EOF 
;

// Rule AtomicRule
ruleAtomicRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 
	    }
		lv_ruleBody_3_0=ruleRuleBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicRuleRule());
	        }
       		set(
       			$current, 
       			"ruleBody",
        		lv_ruleBody_3_0, 
        		"RuleBody");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtomicRuleAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleRuleSet
entryRuleRuleSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleSetRule()); }
	 iv_ruleRuleSet=ruleRuleSet 
	 { $current=$iv_ruleRuleSet.current; } 
	 EOF 
;

// Rule RuleSet
ruleRuleSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule_set' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRuleSetAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleSetRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getAtomicRulesAtomicRuleWithPriorityParserRuleCall_3_0()); 
	    }
		lv_atomicRules_3_0=ruleAtomicRuleWithPriority		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		add(
       			$current, 
       			"atomicRules",
        		lv_atomicRules_3_0, 
        		"AtomicRuleWithPriority");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleAtomicRuleWithPriority
entryRuleAtomicRuleWithPriority returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRuleWithPriorityRule()); }
	 iv_ruleAtomicRuleWithPriority=ruleAtomicRuleWithPriority 
	 { $current=$iv_ruleAtomicRuleWithPriority.current; } 
	 EOF 
;

// Rule AtomicRuleWithPriority
ruleAtomicRuleWithPriority returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleWithPriorityAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='priority' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
    }
(
(
		lv_priorityValue_3_0=RULE_INT
		{
			newLeafNode(lv_priorityValue_3_0, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityValueINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"priorityValue",
        		lv_priorityValue_3_0, 
        		"INT");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0()); 
	    }
		lv_ruleBody_5_0=ruleRuleBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicRuleWithPriorityRule());
	        }
       		set(
       			$current, 
       			"ruleBody",
        		lv_ruleBody_5_0, 
        		"RuleBody");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAtomicRuleWithPriorityAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleAtomicAction
entryRuleAtomicAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicActionRule()); }
	 iv_ruleAtomicAction=ruleAtomicAction 
	 { $current=$iv_ruleAtomicAction.current; } 
	 EOF 
;

// Rule AtomicAction
ruleAtomicAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionSelectFeatureParserRuleCall_0_0()); 
    }
    this_AtomicActionSelectFeature_0=ruleAtomicActionSelectFeature
    { 
        $current = $this_AtomicActionSelectFeature_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionDeselectFeatureParserRuleCall_0_1()); 
    }
    this_AtomicActionDeselectFeature_1=ruleAtomicActionDeselectFeature
    { 
        $current = $this_AtomicActionDeselectFeature_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionModifyAttributeParserRuleCall_0_2()); 
    }
    this_AtomicActionModifyAttribute_2=ruleAtomicActionModifyAttribute
    { 
        $current = $this_AtomicActionModifyAttribute_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionQueryParserRuleCall_0_3()); 
    }
    this_AtomicActionQuery_3=ruleAtomicActionQuery
    { 
        $current = $this_AtomicActionQuery_3.current; 
        afterParserOrEnumRuleCall();
    }
)(	otherlv_4='AND' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtomicActionAccess().getANDKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionAccess().getSecondActionAtomicActionParserRuleCall_1_1_0()); 
	    }
		lv_secondAction_5_0=ruleAtomicAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicActionRule());
	        }
       		set(
       			$current, 
       			"secondAction",
        		lv_secondAction_5_0, 
        		"AtomicAction");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleRuleBody
entryRuleRuleBody returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleBodyRule()); }
	 iv_ruleRuleBody=ruleRuleBody 
	 { $current=$iv_ruleRuleBody.current; } 
	 EOF 
;

// Rule RuleBody
ruleRuleBody returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getRuleBodyAccess().getPureActionParserRuleCall_0()); 
    }
    this_PureAction_0=rulePureAction
    { 
        $current = $this_PureAction_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleBodyAccess().getConditionActionParserRuleCall_1()); 
    }
    this_ConditionAction_1=ruleConditionAction
    { 
        $current = $this_ConditionAction_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePureAction
entryRulePureAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPureActionRule()); }
	 iv_rulePureAction=rulePureAction 
	 { $current=$iv_rulePureAction.current; } 
	 EOF 
;

// Rule PureAction
rulePureAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0()); 
	    }
		lv_atomicAction_0_0=ruleAtomicAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPureActionRule());
	        }
       		set(
       			$current, 
       			"atomicAction",
        		lv_atomicAction_0_0, 
        		"AtomicAction");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleConditionAction
entryRuleConditionAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionActionRule()); }
	 iv_ruleConditionAction=ruleConditionAction 
	 { $current=$iv_ruleConditionAction.current; } 
	 EOF 
;

// Rule ConditionAction
ruleConditionAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getIfKeyword_0_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionActionAccess().getConditionConditionParserRuleCall_0_2_0()); 
	    }
		lv_condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionActionRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_0_3());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_1_0()); 
	    }
		lv_atomicAction_4_0=ruleAtomicAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionActionRule());
	        }
       		set(
       			$current, 
       			"atomicAction",
        		lv_atomicAction_4_0, 
        		"AtomicAction");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='else' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getElseKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionActionAccess().getElseRuleBodyParserRuleCall_2_1_0()); 
	    }
		lv_else_6_0=ruleRuleBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionActionRule());
	        }
       		set(
       			$current, 
       			"else",
        		lv_else_6_0, 
        		"RuleBody");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 
	    }
		lv_operator_1_0=ruleMathOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_1_0, 
        		"MathOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getConditionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"STRING");
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 
	    }
		lv_logicalOp_3_0=ruleLogicalOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"logicalOp",
        		lv_logicalOp_3_0, 
        		"LogicalOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getSecondTermConditionParserRuleCall_3_1_0()); 
	    }
		lv_secondTerm_4_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"secondTerm",
        		lv_secondTerm_4_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleAtomicActionSelectFeature
entryRuleAtomicActionSelectFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicActionSelectFeatureRule()); }
	 iv_ruleAtomicActionSelectFeature=ruleAtomicActionSelectFeature 
	 { $current=$iv_ruleAtomicActionSelectFeature.current; } 
	 EOF 
;

// Rule AtomicActionSelectFeature
ruleAtomicActionSelectFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='activate_feature' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getActivate_featureKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicActionSelectFeatureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicActionSelectFeatureAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleAtomicActionDeselectFeature
entryRuleAtomicActionDeselectFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureRule()); }
	 iv_ruleAtomicActionDeselectFeature=ruleAtomicActionDeselectFeature 
	 { $current=$iv_ruleAtomicActionDeselectFeature.current; } 
	 EOF 
;

// Rule AtomicActionDeselectFeature
ruleAtomicActionDeselectFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='deactivate_feature' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getDeactivate_featureKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicActionDeselectFeatureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicActionDeselectFeatureAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleAtomicActionModifyAttribute
entryRuleAtomicActionModifyAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicActionModifyAttributeRule()); }
	 iv_ruleAtomicActionModifyAttribute=ruleAtomicActionModifyAttribute 
	 { $current=$iv_ruleAtomicActionModifyAttribute.current; } 
	 EOF 
;

// Rule AtomicActionModifyAttribute
ruleAtomicActionModifyAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='set_attribute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicActionModifyAttributeAccess().getSet_attributeKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicActionModifyAttributeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='with_value' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtomicActionModifyAttributeAccess().getWith_valueKeyword_4());
    }
	otherlv_5='(' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
	    }
		lv_attributeValue_6_0=ruleAttributeValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicActionModifyAttributeRule());
	        }
       		add(
       			$current, 
       			"attributeValue",
        		lv_attributeValue_6_0, 
        		"AttributeValue");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_7());
    }
)
;





// Entry rule entryRuleAtomicActionQuery
entryRuleAtomicActionQuery returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicActionQueryRule()); }
	 iv_ruleAtomicActionQuery=ruleAtomicActionQuery 
	 { $current=$iv_ruleAtomicActionQuery.current; } 
	 EOF 
;

// Rule AtomicActionQuery
ruleAtomicActionQuery returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='select_feature_from_variants_of' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicActionQueryAccess().getSelect_feature_from_variants_ofKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicActionQueryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getFeatureFeatureCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='where_attribue' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtomicActionQueryAccess().getWhere_attribueKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getQueryOperatorQueryOperatorEnumRuleCall_5_0()); 
	    }
		lv_queryOperator_5_0=ruleQueryOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicActionQueryRule());
	        }
       		set(
       			$current, 
       			"queryOperator",
        		lv_queryOperator_5_0, 
        		"QueryOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='(' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_6());
    }
(
(
		lv_value_7_0=RULE_STRING
		{
			newLeafNode(lv_value_7_0, grammarAccess.getAtomicActionQueryAccess().getValueSTRINGTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicActionQueryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"STRING");
	    }

)
)	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_8());
    }
)
;





// Entry rule entryRuleAttributeValue
entryRuleAttributeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeValueRule()); }
	 iv_ruleAttributeValue=ruleAttributeValue 
	 { $current=$iv_ruleAttributeValue.current; } 
	 EOF 
;

// Rule AttributeValue
ruleAttributeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
    }
    this_StringAttributeValue_0=ruleStringAttributeValue
    { 
        $current = $this_StringAttributeValue_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
    }
    this_NFRAttributeValue_1=ruleNFRAttributeValue
    { 
        $current = $this_NFRAttributeValue_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringAttributeValue
entryRuleStringAttributeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringAttributeValueRule()); }
	 iv_ruleStringAttributeValue=ruleStringAttributeValue 
	 { $current=$iv_ruleStringAttributeValue.current; } 
	 EOF 
;

// Rule StringAttributeValue
ruleStringAttributeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_STRING
		{
			newLeafNode(lv_value_0_0, grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringAttributeValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleNFRAttributeValue
entryRuleNFRAttributeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNFRAttributeValueRule()); }
	 iv_ruleNFRAttributeValue=ruleNFRAttributeValue 
	 { $current=$iv_ruleNFRAttributeValue.current; } 
	 EOF 
;

// Rule NFRAttributeValue
ruleNFRAttributeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNFRAttributeValueRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Rule MathOperator
ruleMathOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='<' 
	{
        $current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='>' 
	{
        $current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='==' 
	{
        $current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='<>' 
	{
        $current = grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3()); 
    }
));



// Rule LogicalOperator
ruleLogicalOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='AND' 
	{
        $current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='OR' 
	{
        $current = grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1()); 
    }
));



// Rule QueryOperator
ruleQueryOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='max' 
	{
        $current = grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='min' 
	{
        $current = grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='is' 
	{
        $current = grammarAccess.getQueryOperatorAccess().getISEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getQueryOperatorAccess().getISEnumLiteralDeclaration_2()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


