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
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 
	    }
		lv_rules_1_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
	        }
       		add(
       			$current, 
       			"rules",
        		lv_rules_1_0, 
        		"Rule");
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
(this_IMPORT_TERMINAL_0=RULE_IMPORT_TERMINAL
    { 
    newLeafNode(this_IMPORT_TERMINAL_0, grammarAccess.getImportAccess().getIMPORT_TERMINALTerminalRuleCall_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getImportAccess().getQualifiedNameWithWildcardParserRuleCall_1()); 
    }
ruleQualifiedNameWithWildcard
    { 
        afterParserOrEnumRuleCall();
    }
this_AS_2=RULE_AS
    { 
    newLeafNode(this_AS_2, grammarAccess.getImportAccess().getASTerminalRuleCall_2()); 
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard 
	 { $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }  
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
    }
    this_QualifiedName_0=ruleQualifiedName    {
		$current.merge(this_QualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
    }
)?)
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





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_RULE_TERMINAL_0=RULE_RULE_TERMINAL
    { 
    newLeafNode(this_RULE_TERMINAL_0, grammarAccess.getRuleAccess().getRULE_TERMINALTerminalRuleCall_0()); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
    }
this_IF_3=RULE_IF
    { 
    newLeafNode(this_IF_3, grammarAccess.getRuleAccess().getIFTerminalRuleCall_3()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
	    }
		lv_condition_4_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"condition",
        		lv_condition_4_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)this_THEN_5=RULE_THEN
    { 
    newLeafNode(this_THEN_5, grammarAccess.getRuleAccess().getTHENTerminalRuleCall_5()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
	    }
		lv_atomicAction_6_0=ruleAtomicAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"atomicAction",
        		lv_atomicAction_6_0, 
        		"AtomicAction");
	        afterParserOrEnumRuleCall();
	    }

)
)+(this_ELSE_7=RULE_ELSE
    { 
    newLeafNode(this_ELSE_7, grammarAccess.getRuleAccess().getELSETerminalRuleCall_7_0()); 
    }
(this_IF_8=RULE_IF
    { 
    newLeafNode(this_IF_8, grammarAccess.getRuleAccess().getIFTerminalRuleCall_7_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
	    }
		lv_condition_9_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"condition",
        		lv_condition_9_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)this_THEN_10=RULE_THEN
    { 
    newLeafNode(this_THEN_10, grammarAccess.getRuleAccess().getTHENTerminalRuleCall_7_1_2()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
	    }
		lv_atomicAction_11_0=ruleAtomicAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"atomicAction",
        		lv_atomicAction_11_0, 
        		"AtomicAction");
	        afterParserOrEnumRuleCall();
	    }

)
)+)*)
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
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementImportCrossReference_0_0()); 
	}

)
)
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_1()); 
    }
ruleOPERATOR
    { 
        afterParserOrEnumRuleCall();
    }
this_VALUE_2=RULE_VALUE
    { 
    newLeafNode(this_VALUE_2, grammarAccess.getConditionAccess().getVALUETerminalRuleCall_2()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getLOGICAL_OPERATORParserRuleCall_3_0()); 
    }
ruleLOGICAL_OPERATOR
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getMeasImportCrossReference_3_1_0()); 
	}

)
)
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_3_2()); 
    }
ruleOPERATOR
    { 
        afterParserOrEnumRuleCall();
    }
this_VALUE_6=RULE_VALUE
    { 
    newLeafNode(this_VALUE_6, grammarAccess.getConditionAccess().getVALUETerminalRuleCall_3_3()); 
    }
)*)
;





// Entry rule entryRuleOPERATOR
entryRuleOPERATOR returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getOPERATORRule()); } 
	 iv_ruleOPERATOR=ruleOPERATOR 
	 { $current=$iv_ruleOPERATOR.current.getText(); }  
	 EOF 
;

// Rule OPERATOR
ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_SMALLER_0=RULE_SMALLER    {
		$current.merge(this_SMALLER_0);
    }

    { 
    newLeafNode(this_SMALLER_0, grammarAccess.getOPERATORAccess().getSMALLERTerminalRuleCall_0()); 
    }

    |    this_BIGGER_1=RULE_BIGGER    {
		$current.merge(this_BIGGER_1);
    }

    { 
    newLeafNode(this_BIGGER_1, grammarAccess.getOPERATORAccess().getBIGGERTerminalRuleCall_1()); 
    }

    |    this_EQUAL_2=RULE_EQUAL    {
		$current.merge(this_EQUAL_2);
    }

    { 
    newLeafNode(this_EQUAL_2, grammarAccess.getOPERATORAccess().getEQUALTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleLOGICAL_OPERATOR
entryRuleLOGICAL_OPERATOR returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); } 
	 iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR 
	 { $current=$iv_ruleLOGICAL_OPERATOR.current.getText(); }  
	 EOF 
;

// Rule LOGICAL_OPERATOR
ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_AND_0=RULE_AND    {
		$current.merge(this_AND_0);
    }

    { 
    newLeafNode(this_AND_0, grammarAccess.getLOGICAL_OPERATORAccess().getANDTerminalRuleCall_0()); 
    }

    |    this_OR_1=RULE_OR    {
		$current.merge(this_OR_1);
    }

    { 
    newLeafNode(this_OR_1, grammarAccess.getLOGICAL_OPERATORAccess().getORTerminalRuleCall_1()); 
    }
)
    ;







// Entry rule entryRuleAVG
entryRuleAVG returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAVGRule()); }
	 iv_ruleAVG=ruleAVG 
	 { $current=$iv_ruleAVG.current; } 
	 EOF 
;

// Rule AVG
ruleAVG returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='AVG (' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAVGAccess().getAVGKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAVGRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getAVGAccess().getMeasurementImportCrossReference_1_0_0()); 
	}

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAVGAccess().getCommaKeyword_1_1());
    }
)+	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAVGAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleMIN
entryRuleMIN returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMINRule()); }
	 iv_ruleMIN=ruleMIN 
	 { $current=$iv_ruleMIN.current; } 
	 EOF 
;

// Rule MIN
ruleMIN returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MIN (' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMINAccess().getMINKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMINRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMINAccess().getMeasurementImportCrossReference_1_0_0()); 
	}

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMINAccess().getCommaKeyword_1_1());
    }
)+	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMINAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleMAX
entryRuleMAX returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMAXRule()); }
	 iv_ruleMAX=ruleMAX 
	 { $current=$iv_ruleMAX.current; } 
	 EOF 
;

// Rule MAX
ruleMAX returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MAX (' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAXAccess().getMAXKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAXRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMAXAccess().getMeasurementImportCrossReference_1_0_0()); 
	}

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMAXAccess().getCommaKeyword_1_1());
    }
)+	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMAXAccess().getRightParenthesisKeyword_2());
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
(
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
    }
    this_SelectAction_0=ruleSelectAction
    { 
        $current = $this_SelectAction_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
    }
    this_DeselectAction_1=ruleDeselectAction
    { 
        $current = $this_DeselectAction_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
    }
    this_ModifyAttribute_2=ruleModifyAttribute
    { 
        $current = $this_ModifyAttribute_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSelectAction
entryRuleSelectAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelectActionRule()); }
	 iv_ruleSelectAction=ruleSelectAction 
	 { $current=$iv_ruleSelectAction.current; } 
	 EOF 
;

// Rule SelectAction
ruleSelectAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_SELECT_0=RULE_SELECT
    { 
    newLeafNode(this_SELECT_0, grammarAccess.getSelectActionAccess().getSELECTTerminalRuleCall_0()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectActionRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSelectActionAccess().getFeatureImportCrossReference_1_0()); 
	}

)
))
;





// Entry rule entryRuleDeselectAction
entryRuleDeselectAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeselectActionRule()); }
	 iv_ruleDeselectAction=ruleDeselectAction 
	 { $current=$iv_ruleDeselectAction.current; } 
	 EOF 
;

// Rule DeselectAction
ruleDeselectAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_DESELECT_0=RULE_DESELECT
    { 
    newLeafNode(this_DESELECT_0, grammarAccess.getDeselectActionAccess().getDESELECTTerminalRuleCall_0()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeselectActionRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getDeselectActionAccess().getFeatureImportCrossReference_1_0()); 
	}

)
))
;





// Entry rule entryRuleModifyAttribute
entryRuleModifyAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifyAttributeRule()); }
	 iv_ruleModifyAttribute=ruleModifyAttribute 
	 { $current=$iv_ruleModifyAttribute.current; } 
	 EOF 
;

// Rule ModifyAttribute
ruleModifyAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_CHANGE_0=RULE_CHANGE
    { 
    newLeafNode(this_CHANGE_0, grammarAccess.getModifyAttributeAccess().getCHANGETerminalRuleCall_0()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifyAttributeRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportCrossReference_1_0()); 
	}

)
)this_WITH_2=RULE_WITH
    { 
    newLeafNode(this_WITH_2, grammarAccess.getModifyAttributeAccess().getWITHTerminalRuleCall_2()); 
    }
(
(
		lv_value_3_0=RULE_VALUE
		{
			newLeafNode(lv_value_3_0, grammarAccess.getModifyAttributeAccess().getValueVALUETerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifyAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"VALUE");
	    }

)
))
;





RULE_VALUE : '"' ('0'..'9'|'a'..'z'|'0'..'9' '.' '0'..'9')+ '"';

RULE_AND : 'AND';

RULE_OR : 'OR';

RULE_IF : 'if';

RULE_ELSE : 'else';

RULE_THEN : 'then';

RULE_RULE_TERMINAL : 'rule';

RULE_SELECT : 'select feature';

RULE_DESELECT : 'deselect feature';

RULE_CHANGE : 'change feature attribute';

RULE_WITH : 'with';

RULE_IMPORT_TERMINAL : 'import';

RULE_AS : 'as';

RULE_SMALLER : '<';

RULE_BIGGER : '>';

RULE_EQUAL : '==';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


