package org.rra.adaptationModel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptationModelDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'=='", "'<>'", "'AND'", "'OR'", "'max'", "'min'", "'avg'", "'count'", "'import'", "'.'", "'rule'", "':'", "'if'", "'then'", "'else'", "'select feature'", "'with'", "'attribute'", "'from feature'", "'deselect feature'", "'set attribute'", "'with value'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAdaptationModelDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdaptationModelDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdaptationModelDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g"; }


     
     	private AdaptationModelDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AdaptationModelDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAdaptationModel"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:60:1: entryRuleAdaptationModel : ruleAdaptationModel EOF ;
    public final void entryRuleAdaptationModel() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:61:1: ( ruleAdaptationModel EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:62:1: ruleAdaptationModel EOF
            {
             before(grammarAccess.getAdaptationModelRule()); 
            pushFollow(FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel61);
            ruleAdaptationModel();

            state._fsp--;

             after(grammarAccess.getAdaptationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdaptationModel"


    // $ANTLR start "ruleAdaptationModel"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:69:1: ruleAdaptationModel : ( ( rule__AdaptationModel__Group__0 ) ) ;
    public final void ruleAdaptationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:73:2: ( ( ( rule__AdaptationModel__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:74:1: ( ( rule__AdaptationModel__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:74:1: ( ( rule__AdaptationModel__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:75:1: ( rule__AdaptationModel__Group__0 )
            {
             before(grammarAccess.getAdaptationModelAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:76:1: ( rule__AdaptationModel__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:76:2: rule__AdaptationModel__Group__0
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__0_in_ruleAdaptationModel94);
            rule__AdaptationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdaptationModel"


    // $ANTLR start "entryRuleImport"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:89:1: ( ruleImport EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:104:1: ( rule__Import__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:118:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:119:1: ( ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:120:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName183);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:127:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:131:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:132:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:132:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:133:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:134:1: ( rule__QualifiedName__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:134:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName216);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRule"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:146:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:147:1: ( ruleRule EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:148:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule243);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:155:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:159:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:160:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:160:1: ( ( rule__Rule__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:161:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:162:1: ( rule__Rule__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:162:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule276);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:174:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:175:1: ( ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:176:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition303);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:183:1: ruleCondition : ( ( rule__Condition__MeasurementComparisonAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:187:2: ( ( ( rule__Condition__MeasurementComparisonAssignment ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:188:1: ( ( rule__Condition__MeasurementComparisonAssignment ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:188:1: ( ( rule__Condition__MeasurementComparisonAssignment ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:189:1: ( rule__Condition__MeasurementComparisonAssignment )
            {
             before(grammarAccess.getConditionAccess().getMeasurementComparisonAssignment()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:190:1: ( rule__Condition__MeasurementComparisonAssignment )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:190:2: rule__Condition__MeasurementComparisonAssignment
            {
            pushFollow(FOLLOW_rule__Condition__MeasurementComparisonAssignment_in_ruleCondition336);
            rule__Condition__MeasurementComparisonAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getMeasurementComparisonAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleMeasurementComparison"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:202:1: entryRuleMeasurementComparison : ruleMeasurementComparison EOF ;
    public final void entryRuleMeasurementComparison() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:203:1: ( ruleMeasurementComparison EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:204:1: ruleMeasurementComparison EOF
            {
             before(grammarAccess.getMeasurementComparisonRule()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison363);
            ruleMeasurementComparison();

            state._fsp--;

             after(grammarAccess.getMeasurementComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementComparison370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementComparison"


    // $ANTLR start "ruleMeasurementComparison"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:211:1: ruleMeasurementComparison : ( ( rule__MeasurementComparison__Group__0 ) ) ;
    public final void ruleMeasurementComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:215:2: ( ( ( rule__MeasurementComparison__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:216:1: ( ( rule__MeasurementComparison__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:216:1: ( ( rule__MeasurementComparison__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:217:1: ( rule__MeasurementComparison__Group__0 )
            {
             before(grammarAccess.getMeasurementComparisonAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:218:1: ( rule__MeasurementComparison__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:218:2: rule__MeasurementComparison__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__0_in_ruleMeasurementComparison396);
            rule__MeasurementComparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementComparison"


    // $ANTLR start "entryRuleOPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:230:1: entryRuleOPERATOR : ruleOPERATOR EOF ;
    public final void entryRuleOPERATOR() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:231:1: ( ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:232:1: ruleOPERATOR EOF
            {
             before(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR423);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getOPERATORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOPERATOR"


    // $ANTLR start "ruleOPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:239:1: ruleOPERATOR : ( ( rule__OPERATOR__Alternatives ) ) ;
    public final void ruleOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:243:2: ( ( ( rule__OPERATOR__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:244:1: ( ( rule__OPERATOR__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:244:1: ( ( rule__OPERATOR__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:245:1: ( rule__OPERATOR__Alternatives )
            {
             before(grammarAccess.getOPERATORAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:246:1: ( rule__OPERATOR__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:246:2: rule__OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__OPERATOR__Alternatives_in_ruleOPERATOR456);
            rule__OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATORAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERATOR"


    // $ANTLR start "entryRuleLOGICAL_OPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:258:1: entryRuleLOGICAL_OPERATOR : ruleLOGICAL_OPERATOR EOF ;
    public final void entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:259:1: ( ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:260:1: ruleLOGICAL_OPERATOR EOF
            {
             before(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR483);
            ruleLOGICAL_OPERATOR();

            state._fsp--;

             after(grammarAccess.getLOGICAL_OPERATORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLOGICAL_OPERATOR"


    // $ANTLR start "ruleLOGICAL_OPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:267:1: ruleLOGICAL_OPERATOR : ( ( rule__LOGICAL_OPERATOR__Alternatives ) ) ;
    public final void ruleLOGICAL_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:271:2: ( ( ( rule__LOGICAL_OPERATOR__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:272:1: ( ( rule__LOGICAL_OPERATOR__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:272:1: ( ( rule__LOGICAL_OPERATOR__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:273:1: ( rule__LOGICAL_OPERATOR__Alternatives )
            {
             before(grammarAccess.getLOGICAL_OPERATORAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:274:1: ( rule__LOGICAL_OPERATOR__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:274:2: rule__LOGICAL_OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__LOGICAL_OPERATOR__Alternatives_in_ruleLOGICAL_OPERATOR516);
            rule__LOGICAL_OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLOGICAL_OPERATORAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLOGICAL_OPERATOR"


    // $ANTLR start "entryRuleMATH_OPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:286:1: entryRuleMATH_OPERATOR : ruleMATH_OPERATOR EOF ;
    public final void entryRuleMATH_OPERATOR() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:287:1: ( ruleMATH_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:288:1: ruleMATH_OPERATOR EOF
            {
             before(grammarAccess.getMATH_OPERATORRule()); 
            pushFollow(FOLLOW_ruleMATH_OPERATOR_in_entryRuleMATH_OPERATOR543);
            ruleMATH_OPERATOR();

            state._fsp--;

             after(grammarAccess.getMATH_OPERATORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_OPERATOR550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMATH_OPERATOR"


    // $ANTLR start "ruleMATH_OPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:295:1: ruleMATH_OPERATOR : ( ( rule__MATH_OPERATOR__Alternatives ) ) ;
    public final void ruleMATH_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:299:2: ( ( ( rule__MATH_OPERATOR__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:300:1: ( ( rule__MATH_OPERATOR__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:300:1: ( ( rule__MATH_OPERATOR__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:301:1: ( rule__MATH_OPERATOR__Alternatives )
            {
             before(grammarAccess.getMATH_OPERATORAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:302:1: ( rule__MATH_OPERATOR__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:302:2: rule__MATH_OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__MATH_OPERATOR__Alternatives_in_ruleMATH_OPERATOR576);
            rule__MATH_OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMATH_OPERATORAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMATH_OPERATOR"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:320:1: entryRuleAtomicAction : ruleAtomicAction EOF ;
    public final void entryRuleAtomicAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:321:1: ( ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:322:1: ruleAtomicAction EOF
            {
             before(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction609);
            ruleAtomicAction();

            state._fsp--;

             after(grammarAccess.getAtomicActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction616); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicAction"


    // $ANTLR start "ruleAtomicAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:329:1: ruleAtomicAction : ( ( rule__AtomicAction__Alternatives ) ) ;
    public final void ruleAtomicAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:333:2: ( ( ( rule__AtomicAction__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:334:1: ( ( rule__AtomicAction__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:334:1: ( ( rule__AtomicAction__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:335:1: ( rule__AtomicAction__Alternatives )
            {
             before(grammarAccess.getAtomicActionAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:336:1: ( rule__AtomicAction__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:336:2: rule__AtomicAction__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction642);
            rule__AtomicAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicAction"


    // $ANTLR start "entryRuleQueryAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:348:1: entryRuleQueryAction : ruleQueryAction EOF ;
    public final void entryRuleQueryAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:349:1: ( ruleQueryAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:350:1: ruleQueryAction EOF
            {
             before(grammarAccess.getQueryActionRule()); 
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction669);
            ruleQueryAction();

            state._fsp--;

             after(grammarAccess.getQueryActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction676); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryAction"


    // $ANTLR start "ruleQueryAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:357:1: ruleQueryAction : ( ( rule__QueryAction__Group__0 ) ) ;
    public final void ruleQueryAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:361:2: ( ( ( rule__QueryAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:362:1: ( ( rule__QueryAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:362:1: ( ( rule__QueryAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:363:1: ( rule__QueryAction__Group__0 )
            {
             before(grammarAccess.getQueryActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:364:1: ( rule__QueryAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:364:2: rule__QueryAction__Group__0
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__0_in_ruleQueryAction702);
            rule__QueryAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryAction"


    // $ANTLR start "entryRuleSelectAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:376:1: entryRuleSelectAction : ruleSelectAction EOF ;
    public final void entryRuleSelectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:377:1: ( ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:378:1: ruleSelectAction EOF
            {
             before(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction729);
            ruleSelectAction();

            state._fsp--;

             after(grammarAccess.getSelectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction736); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectAction"


    // $ANTLR start "ruleSelectAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:385:1: ruleSelectAction : ( ( rule__SelectAction__Group__0 ) ) ;
    public final void ruleSelectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:389:2: ( ( ( rule__SelectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:390:1: ( ( rule__SelectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:390:1: ( ( rule__SelectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:391:1: ( rule__SelectAction__Group__0 )
            {
             before(grammarAccess.getSelectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:392:1: ( rule__SelectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:392:2: rule__SelectAction__Group__0
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction762);
            rule__SelectAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectAction"


    // $ANTLR start "entryRuleDeselectAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:404:1: entryRuleDeselectAction : ruleDeselectAction EOF ;
    public final void entryRuleDeselectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:405:1: ( ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:406:1: ruleDeselectAction EOF
            {
             before(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction789);
            ruleDeselectAction();

            state._fsp--;

             after(grammarAccess.getDeselectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction796); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeselectAction"


    // $ANTLR start "ruleDeselectAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:413:1: ruleDeselectAction : ( ( rule__DeselectAction__Group__0 ) ) ;
    public final void ruleDeselectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:417:2: ( ( ( rule__DeselectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:418:1: ( ( rule__DeselectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:418:1: ( ( rule__DeselectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:419:1: ( rule__DeselectAction__Group__0 )
            {
             before(grammarAccess.getDeselectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:420:1: ( rule__DeselectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:420:2: rule__DeselectAction__Group__0
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction822);
            rule__DeselectAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeselectActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeselectAction"


    // $ANTLR start "entryRuleModifyAttribute"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:432:1: entryRuleModifyAttribute : ruleModifyAttribute EOF ;
    public final void entryRuleModifyAttribute() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:433:1: ( ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:434:1: ruleModifyAttribute EOF
            {
             before(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute849);
            ruleModifyAttribute();

            state._fsp--;

             after(grammarAccess.getModifyAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute856); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifyAttribute"


    // $ANTLR start "ruleModifyAttribute"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:441:1: ruleModifyAttribute : ( ( rule__ModifyAttribute__Group__0 ) ) ;
    public final void ruleModifyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:445:2: ( ( ( rule__ModifyAttribute__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:446:1: ( ( rule__ModifyAttribute__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:446:1: ( ( rule__ModifyAttribute__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:447:1: ( rule__ModifyAttribute__Group__0 )
            {
             before(grammarAccess.getModifyAttributeAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:448:1: ( rule__ModifyAttribute__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:448:2: rule__ModifyAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute882);
            rule__ModifyAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifyAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:460:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:461:1: ( ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:462:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue909);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue916); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:469:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:473:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:474:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:474:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:475:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:476:1: ( rule__AttributeValue__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:476:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue942);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleStringAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:488:1: entryRuleStringAttributeValue : ruleStringAttributeValue EOF ;
    public final void entryRuleStringAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:489:1: ( ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:490:1: ruleStringAttributeValue EOF
            {
             before(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue969);
            ruleStringAttributeValue();

            state._fsp--;

             after(grammarAccess.getStringAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue976); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringAttributeValue"


    // $ANTLR start "ruleStringAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:497:1: ruleStringAttributeValue : ( ( rule__StringAttributeValue__ValueAssignment ) ) ;
    public final void ruleStringAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:501:2: ( ( ( rule__StringAttributeValue__ValueAssignment ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:502:1: ( ( rule__StringAttributeValue__ValueAssignment ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:502:1: ( ( rule__StringAttributeValue__ValueAssignment ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:503:1: ( rule__StringAttributeValue__ValueAssignment )
            {
             before(grammarAccess.getStringAttributeValueAccess().getValueAssignment()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:504:1: ( rule__StringAttributeValue__ValueAssignment )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:504:2: rule__StringAttributeValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringAttributeValue__ValueAssignment_in_ruleStringAttributeValue1002);
            rule__StringAttributeValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringAttributeValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringAttributeValue"


    // $ANTLR start "entryRuleNFRAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:516:1: entryRuleNFRAttributeValue : ruleNFRAttributeValue EOF ;
    public final void entryRuleNFRAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:517:1: ( ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:518:1: ruleNFRAttributeValue EOF
            {
             before(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue1029);
            ruleNFRAttributeValue();

            state._fsp--;

             after(grammarAccess.getNFRAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue1036); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNFRAttributeValue"


    // $ANTLR start "ruleNFRAttributeValue"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:525:1: ruleNFRAttributeValue : ( ( rule__NFRAttributeValue__ValueAssignment ) ) ;
    public final void ruleNFRAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:529:2: ( ( ( rule__NFRAttributeValue__ValueAssignment ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:530:1: ( ( rule__NFRAttributeValue__ValueAssignment ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:530:1: ( ( rule__NFRAttributeValue__ValueAssignment ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:531:1: ( rule__NFRAttributeValue__ValueAssignment )
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueAssignment()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:532:1: ( rule__NFRAttributeValue__ValueAssignment )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:532:2: rule__NFRAttributeValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NFRAttributeValue__ValueAssignment_in_ruleNFRAttributeValue1062);
            rule__NFRAttributeValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNFRAttributeValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNFRAttributeValue"


    // $ANTLR start "rule__OPERATOR__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:544:1: rule__OPERATOR__Alternatives : ( ( '<' ) | ( '>' ) | ( '==' ) | ( '<>' ) );
    public final void rule__OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:548:1: ( ( '<' ) | ( '>' ) | ( '==' ) | ( '<>' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:549:1: ( '<' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:549:1: ( '<' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:550:1: '<'
                    {
                     before(grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__OPERATOR__Alternatives1099); 
                     after(grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:557:6: ( '>' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:557:6: ( '>' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:558:1: '>'
                    {
                     before(grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__OPERATOR__Alternatives1119); 
                     after(grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:565:6: ( '==' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:565:6: ( '==' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:566:1: '=='
                    {
                     before(grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__OPERATOR__Alternatives1139); 
                     after(grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:573:6: ( '<>' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:573:6: ( '<>' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:574:1: '<>'
                    {
                     before(grammarAccess.getOPERATORAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__OPERATOR__Alternatives1159); 
                     after(grammarAccess.getOPERATORAccess().getLessThanSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPERATOR__Alternatives"


    // $ANTLR start "rule__LOGICAL_OPERATOR__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:586:1: rule__LOGICAL_OPERATOR__Alternatives : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__LOGICAL_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:590:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:591:1: ( 'AND' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:591:1: ( 'AND' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:592:1: 'AND'
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__LOGICAL_OPERATOR__Alternatives1194); 
                     after(grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:599:6: ( 'OR' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:599:6: ( 'OR' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:600:1: 'OR'
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getORKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__LOGICAL_OPERATOR__Alternatives1214); 
                     after(grammarAccess.getLOGICAL_OPERATORAccess().getORKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOGICAL_OPERATOR__Alternatives"


    // $ANTLR start "rule__MATH_OPERATOR__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:612:1: rule__MATH_OPERATOR__Alternatives : ( ( 'max' ) | ( 'min' ) | ( 'avg' ) | ( 'count' ) );
    public final void rule__MATH_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:616:1: ( ( 'max' ) | ( 'min' ) | ( 'avg' ) | ( 'count' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:617:1: ( 'max' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:617:1: ( 'max' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:618:1: 'max'
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getMaxKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__MATH_OPERATOR__Alternatives1249); 
                     after(grammarAccess.getMATH_OPERATORAccess().getMaxKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:625:6: ( 'min' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:625:6: ( 'min' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:626:1: 'min'
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getMinKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__MATH_OPERATOR__Alternatives1269); 
                     after(grammarAccess.getMATH_OPERATORAccess().getMinKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:633:6: ( 'avg' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:633:6: ( 'avg' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:634:1: 'avg'
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getAvgKeyword_2()); 
                    match(input,19,FOLLOW_19_in_rule__MATH_OPERATOR__Alternatives1289); 
                     after(grammarAccess.getMATH_OPERATORAccess().getAvgKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:641:6: ( 'count' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:641:6: ( 'count' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:642:1: 'count'
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getCountKeyword_3()); 
                    match(input,20,FOLLOW_20_in_rule__MATH_OPERATOR__Alternatives1309); 
                     after(grammarAccess.getMATH_OPERATORAccess().getCountKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_OPERATOR__Alternatives"


    // $ANTLR start "rule__AtomicAction__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:654:1: rule__AtomicAction__Alternatives : ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) | ( ruleQueryAction ) );
    public final void rule__AtomicAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:658:1: ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) | ( ruleQueryAction ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==29) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:659:1: ( ruleSelectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:659:1: ( ruleSelectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:660:1: ruleSelectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1343);
                    ruleSelectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:665:6: ( ruleDeselectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:665:6: ( ruleDeselectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:666:1: ruleDeselectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1360);
                    ruleDeselectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:671:6: ( ruleModifyAttribute )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:671:6: ( ruleModifyAttribute )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:672:1: ruleModifyAttribute
                    {
                     before(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1377);
                    ruleModifyAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:677:6: ( ruleQueryAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:677:6: ( ruleQueryAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:678:1: ruleQueryAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQueryAction_in_rule__AtomicAction__Alternatives1394);
                    ruleQueryAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicAction__Alternatives"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:688:1: rule__AttributeValue__Alternatives : ( ( ruleStringAttributeValue ) | ( ruleNFRAttributeValue ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:692:1: ( ( ruleStringAttributeValue ) | ( ruleNFRAttributeValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:693:1: ( ruleStringAttributeValue )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:693:1: ( ruleStringAttributeValue )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:694:1: ruleStringAttributeValue
                    {
                     before(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_rule__AttributeValue__Alternatives1426);
                    ruleStringAttributeValue();

                    state._fsp--;

                     after(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:699:6: ( ruleNFRAttributeValue )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:699:6: ( ruleNFRAttributeValue )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:700:1: ruleNFRAttributeValue
                    {
                     before(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_rule__AttributeValue__Alternatives1443);
                    ruleNFRAttributeValue();

                    state._fsp--;

                     after(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__AdaptationModel__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:712:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:716:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:717:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01473);
            rule__AdaptationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01476);
            rule__AdaptationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__0"


    // $ANTLR start "rule__AdaptationModel__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:724:1: rule__AdaptationModel__Group__0__Impl : ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:728:1: ( ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:730:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:731:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:731:2: rule__AdaptationModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1503);
            	    rule__AdaptationModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAdaptationModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__0__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:741:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:745:1: ( rule__AdaptationModel__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:746:2: rule__AdaptationModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11534);
            rule__AdaptationModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__1"


    // $ANTLR start "rule__AdaptationModel__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:752:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__RulesAssignment_1 )* ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:756:1: ( ( ( rule__AdaptationModel__RulesAssignment_1 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:757:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:757:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:758:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:759:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:759:2: rule__AdaptationModel__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1561);
            	    rule__AdaptationModel__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAdaptationModelAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:773:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:777:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:778:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01596);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01599);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:785:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:789:1: ( ( 'import' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:790:1: ( 'import' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:790:1: ( 'import' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:791:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Import__Group__0__Impl1627); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:804:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:808:1: ( rule__Import__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:809:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11658);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:815:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:819:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:820:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:820:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:821:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:822:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:822:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1685);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:837:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:841:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:842:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01720);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01723);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:849:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:853:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:854:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:854:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:855:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1750); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:866:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:870:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:871:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11779);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:877:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:881:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:882:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:882:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:883:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:884:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:884:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1806);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:898:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:902:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:903:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01841);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01844);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:910:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:914:1: ( ( '.' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:915:1: ( '.' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:915:1: ( '.' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:916:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl1872); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:929:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:933:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:934:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11903);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:940:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:944:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:945:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:945:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:946:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1930); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:961:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:965:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:966:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01963);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01966);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:973:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:977:1: ( ( 'rule' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:978:1: ( 'rule' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:978:1: ( 'rule' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:979:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group__0__Impl1994); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:992:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:996:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:997:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12025);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12028);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1004:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1008:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1010:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1011:1: ( rule__Rule__NameAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1011:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2055);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1021:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1025:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1026:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22085);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22088);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1033:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1037:1: ( ( ':' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1038:1: ( ':' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1038:1: ( ':' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1039:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Rule__Group__2__Impl2116); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1052:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1056:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1057:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32147);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32150);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1064:1: rule__Rule__Group__3__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1068:1: ( ( 'if' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1069:1: ( 'if' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1069:1: ( 'if' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1070:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Rule__Group__3__Impl2178); 
             after(grammarAccess.getRuleAccess().getIfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1083:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1087:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1088:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42209);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42212);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1095:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ConditionAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1099:1: ( ( ( rule__Rule__ConditionAssignment_4 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1100:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1100:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1101:1: ( rule__Rule__ConditionAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_4()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1102:1: ( rule__Rule__ConditionAssignment_4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1102:2: rule__Rule__ConditionAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2239);
            rule__Rule__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1112:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1116:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1117:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52269);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52272);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1124:1: rule__Rule__Group__5__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1128:1: ( ( 'then' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1129:1: ( 'then' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1129:1: ( 'then' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1130:1: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Rule__Group__5__Impl2300); 
             after(grammarAccess.getRuleAccess().getThenKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1143:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1147:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1148:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62331);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62334);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1155:1: rule__Rule__Group__6__Impl : ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1159:1: ( ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1160:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1160:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1161:1: ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1161:1: ( ( rule__Rule__AtomicActionAssignment_6 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1162:1: ( rule__Rule__AtomicActionAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1163:1: ( rule__Rule__AtomicActionAssignment_6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1163:2: rule__Rule__AtomicActionAssignment_6
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2363);
            rule__Rule__AtomicActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1166:1: ( ( rule__Rule__AtomicActionAssignment_6 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1167:1: ( rule__Rule__AtomicActionAssignment_6 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1168:1: ( rule__Rule__AtomicActionAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||(LA9_0>=32 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1168:2: rule__Rule__AtomicActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2375);
            	    rule__Rule__AtomicActionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1179:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1183:1: ( rule__Rule__Group__7__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1184:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72408);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1190:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1194:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1195:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1195:1: ( ( rule__Rule__Group_7__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1196:1: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1197:1: ( rule__Rule__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1197:2: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2435);
            	    rule__Rule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_7__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1223:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1227:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1228:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02482);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02485);
            rule__Rule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0"


    // $ANTLR start "rule__Rule__Group_7__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1235:1: rule__Rule__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1239:1: ( ( 'else' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1240:1: ( 'else' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1240:1: ( 'else' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1241:1: 'else'
            {
             before(grammarAccess.getRuleAccess().getElseKeyword_7_0()); 
            match(input,27,FOLLOW_27_in_rule__Rule__Group_7__0__Impl2513); 
             after(grammarAccess.getRuleAccess().getElseKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_7__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1254:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1258:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1259:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12544);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12547);
            rule__Rule__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1"


    // $ANTLR start "rule__Rule__Group_7__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1266:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Group_7_1__0 )* ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1270:1: ( ( ( rule__Rule__Group_7_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1271:1: ( ( rule__Rule__Group_7_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1271:1: ( ( rule__Rule__Group_7_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1272:1: ( rule__Rule__Group_7_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1273:1: ( rule__Rule__Group_7_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1273:2: rule__Rule__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2574);
            	    rule__Rule__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1__Impl"


    // $ANTLR start "rule__Rule__Group_7__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1283:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1287:1: ( rule__Rule__Group_7__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1288:2: rule__Rule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22605);
            rule__Rule__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__2"


    // $ANTLR start "rule__Rule__Group_7__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1294:1: rule__Rule__Group_7__2__Impl : ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1298:1: ( ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1299:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1299:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1300:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1300:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1301:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1302:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1302:2: rule__Rule__AtomicActionAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2634);
            rule__Rule__AtomicActionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1305:1: ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1306:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1307:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28||(LA12_0>=32 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1307:2: rule__Rule__AtomicActionAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2646);
            	    rule__Rule__AtomicActionAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__2__Impl"


    // $ANTLR start "rule__Rule__Group_7_1__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1324:1: rule__Rule__Group_7_1__0 : rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 ;
    public final void rule__Rule__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1328:1: ( rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1329:2: rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02685);
            rule__Rule__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02688);
            rule__Rule__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__0"


    // $ANTLR start "rule__Rule__Group_7_1__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1336:1: rule__Rule__Group_7_1__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1340:1: ( ( 'if' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1341:1: ( 'if' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1341:1: ( 'if' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1342:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_7_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Rule__Group_7_1__0__Impl2716); 
             after(grammarAccess.getRuleAccess().getIfKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_7_1__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1355:1: rule__Rule__Group_7_1__1 : rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 ;
    public final void rule__Rule__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1359:1: ( rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1360:2: rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12747);
            rule__Rule__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12750);
            rule__Rule__Group_7_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__1"


    // $ANTLR start "rule__Rule__Group_7_1__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1367:1: rule__Rule__Group_7_1__1__Impl : ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) ;
    public final void rule__Rule__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1371:1: ( ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1372:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1372:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1373:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_7_1_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1374:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1374:2: rule__Rule__ConditionAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2777);
            rule__Rule__ConditionAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_7_1__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1384:1: rule__Rule__Group_7_1__2 : rule__Rule__Group_7_1__2__Impl ;
    public final void rule__Rule__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1388:1: ( rule__Rule__Group_7_1__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1389:2: rule__Rule__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22807);
            rule__Rule__Group_7_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__2"


    // $ANTLR start "rule__Rule__Group_7_1__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1395:1: rule__Rule__Group_7_1__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1399:1: ( ( 'then' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1400:1: ( 'then' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1400:1: ( 'then' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1401:1: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_7_1_2()); 
            match(input,26,FOLLOW_26_in_rule__Rule__Group_7_1__2__Impl2835); 
             after(grammarAccess.getRuleAccess().getThenKeyword_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_1__2__Impl"


    // $ANTLR start "rule__MeasurementComparison__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1420:1: rule__MeasurementComparison__Group__0 : rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1 ;
    public final void rule__MeasurementComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1424:1: ( rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1425:2: rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__0__Impl_in_rule__MeasurementComparison__Group__02872);
            rule__MeasurementComparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__1_in_rule__MeasurementComparison__Group__02875);
            rule__MeasurementComparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__0"


    // $ANTLR start "rule__MeasurementComparison__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1432:1: rule__MeasurementComparison__Group__0__Impl : ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) ) ;
    public final void rule__MeasurementComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1436:1: ( ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1437:1: ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1437:1: ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1438:1: ( rule__MeasurementComparison__MeasurementAssignment_0 )
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1439:1: ( rule__MeasurementComparison__MeasurementAssignment_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1439:2: rule__MeasurementComparison__MeasurementAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__MeasurementAssignment_0_in_rule__MeasurementComparison__Group__0__Impl2902);
            rule__MeasurementComparison__MeasurementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementComparisonAccess().getMeasurementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__0__Impl"


    // $ANTLR start "rule__MeasurementComparison__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1449:1: rule__MeasurementComparison__Group__1 : rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2 ;
    public final void rule__MeasurementComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1453:1: ( rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1454:2: rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__1__Impl_in_rule__MeasurementComparison__Group__12932);
            rule__MeasurementComparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__2_in_rule__MeasurementComparison__Group__12935);
            rule__MeasurementComparison__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__1"


    // $ANTLR start "rule__MeasurementComparison__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1461:1: rule__MeasurementComparison__Group__1__Impl : ( ruleOPERATOR ) ;
    public final void rule__MeasurementComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1465:1: ( ( ruleOPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1466:1: ( ruleOPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1466:1: ( ruleOPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1467:1: ruleOPERATOR
            {
             before(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_rule__MeasurementComparison__Group__1__Impl2962);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__1__Impl"


    // $ANTLR start "rule__MeasurementComparison__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1478:1: rule__MeasurementComparison__Group__2 : rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3 ;
    public final void rule__MeasurementComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1482:1: ( rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1483:2: rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__2__Impl_in_rule__MeasurementComparison__Group__22991);
            rule__MeasurementComparison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__3_in_rule__MeasurementComparison__Group__22994);
            rule__MeasurementComparison__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__2"


    // $ANTLR start "rule__MeasurementComparison__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1490:1: rule__MeasurementComparison__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__MeasurementComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1494:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1495:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1495:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1496:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementComparisonAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementComparison__Group__2__Impl3021); 
             after(grammarAccess.getMeasurementComparisonAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__2__Impl"


    // $ANTLR start "rule__MeasurementComparison__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1507:1: rule__MeasurementComparison__Group__3 : rule__MeasurementComparison__Group__3__Impl ;
    public final void rule__MeasurementComparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1511:1: ( rule__MeasurementComparison__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1512:2: rule__MeasurementComparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__3__Impl_in_rule__MeasurementComparison__Group__33050);
            rule__MeasurementComparison__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__3"


    // $ANTLR start "rule__MeasurementComparison__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1518:1: rule__MeasurementComparison__Group__3__Impl : ( ( ruleLOGICAL_OPERATOR )? ) ;
    public final void rule__MeasurementComparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1522:1: ( ( ( ruleLOGICAL_OPERATOR )? ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1523:1: ( ( ruleLOGICAL_OPERATOR )? )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1523:1: ( ( ruleLOGICAL_OPERATOR )? )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1524:1: ( ruleLOGICAL_OPERATOR )?
            {
             before(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1525:1: ( ruleLOGICAL_OPERATOR )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1525:3: ruleLOGICAL_OPERATOR
                    {
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_rule__MeasurementComparison__Group__3__Impl3078);
                    ruleLOGICAL_OPERATOR();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__Group__3__Impl"


    // $ANTLR start "rule__QueryAction__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1549:1: rule__QueryAction__Group__0 : rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1 ;
    public final void rule__QueryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1553:1: ( rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1554:2: rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__0__Impl_in_rule__QueryAction__Group__03123);
            rule__QueryAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__1_in_rule__QueryAction__Group__03126);
            rule__QueryAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__0"


    // $ANTLR start "rule__QueryAction__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1561:1: rule__QueryAction__Group__0__Impl : ( 'select feature' ) ;
    public final void rule__QueryAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1565:1: ( ( 'select feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1566:1: ( 'select feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1566:1: ( 'select feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1567:1: 'select feature'
            {
             before(grammarAccess.getQueryActionAccess().getSelectFeatureKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__QueryAction__Group__0__Impl3154); 
             after(grammarAccess.getQueryActionAccess().getSelectFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__0__Impl"


    // $ANTLR start "rule__QueryAction__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1580:1: rule__QueryAction__Group__1 : rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2 ;
    public final void rule__QueryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1584:1: ( rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1585:2: rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__1__Impl_in_rule__QueryAction__Group__13185);
            rule__QueryAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__2_in_rule__QueryAction__Group__13188);
            rule__QueryAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__1"


    // $ANTLR start "rule__QueryAction__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1592:1: rule__QueryAction__Group__1__Impl : ( 'with' ) ;
    public final void rule__QueryAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1596:1: ( ( 'with' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1597:1: ( 'with' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1597:1: ( 'with' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1598:1: 'with'
            {
             before(grammarAccess.getQueryActionAccess().getWithKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__QueryAction__Group__1__Impl3216); 
             after(grammarAccess.getQueryActionAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__1__Impl"


    // $ANTLR start "rule__QueryAction__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1611:1: rule__QueryAction__Group__2 : rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3 ;
    public final void rule__QueryAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1615:1: ( rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1616:2: rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__2__Impl_in_rule__QueryAction__Group__23247);
            rule__QueryAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__3_in_rule__QueryAction__Group__23250);
            rule__QueryAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__2"


    // $ANTLR start "rule__QueryAction__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1623:1: rule__QueryAction__Group__2__Impl : ( ruleMATH_OPERATOR ) ;
    public final void rule__QueryAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1627:1: ( ( ruleMATH_OPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1628:1: ( ruleMATH_OPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1628:1: ( ruleMATH_OPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1629:1: ruleMATH_OPERATOR
            {
             before(grammarAccess.getQueryActionAccess().getMATH_OPERATORParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleMATH_OPERATOR_in_rule__QueryAction__Group__2__Impl3277);
            ruleMATH_OPERATOR();

            state._fsp--;

             after(grammarAccess.getQueryActionAccess().getMATH_OPERATORParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__2__Impl"


    // $ANTLR start "rule__QueryAction__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1640:1: rule__QueryAction__Group__3 : rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4 ;
    public final void rule__QueryAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1644:1: ( rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1645:2: rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__3__Impl_in_rule__QueryAction__Group__33306);
            rule__QueryAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__4_in_rule__QueryAction__Group__33309);
            rule__QueryAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__3"


    // $ANTLR start "rule__QueryAction__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1652:1: rule__QueryAction__Group__3__Impl : ( 'attribute' ) ;
    public final void rule__QueryAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1656:1: ( ( 'attribute' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1657:1: ( 'attribute' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1657:1: ( 'attribute' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1658:1: 'attribute'
            {
             before(grammarAccess.getQueryActionAccess().getAttributeKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__QueryAction__Group__3__Impl3337); 
             after(grammarAccess.getQueryActionAccess().getAttributeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__3__Impl"


    // $ANTLR start "rule__QueryAction__Group__4"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1671:1: rule__QueryAction__Group__4 : rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5 ;
    public final void rule__QueryAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1675:1: ( rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1676:2: rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__4__Impl_in_rule__QueryAction__Group__43368);
            rule__QueryAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__5_in_rule__QueryAction__Group__43371);
            rule__QueryAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__4"


    // $ANTLR start "rule__QueryAction__Group__4__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1683:1: rule__QueryAction__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__QueryAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1687:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1688:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1688:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1689:1: RULE_STRING
            {
             before(grammarAccess.getQueryActionAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QueryAction__Group__4__Impl3398); 
             after(grammarAccess.getQueryActionAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__4__Impl"


    // $ANTLR start "rule__QueryAction__Group__5"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1700:1: rule__QueryAction__Group__5 : rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6 ;
    public final void rule__QueryAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1704:1: ( rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1705:2: rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__5__Impl_in_rule__QueryAction__Group__53427);
            rule__QueryAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__6_in_rule__QueryAction__Group__53430);
            rule__QueryAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__5"


    // $ANTLR start "rule__QueryAction__Group__5__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1712:1: rule__QueryAction__Group__5__Impl : ( 'from feature' ) ;
    public final void rule__QueryAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1716:1: ( ( 'from feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1717:1: ( 'from feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1717:1: ( 'from feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1718:1: 'from feature'
            {
             before(grammarAccess.getQueryActionAccess().getFromFeatureKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__QueryAction__Group__5__Impl3458); 
             after(grammarAccess.getQueryActionAccess().getFromFeatureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__5__Impl"


    // $ANTLR start "rule__QueryAction__Group__6"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1731:1: rule__QueryAction__Group__6 : rule__QueryAction__Group__6__Impl ;
    public final void rule__QueryAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1735:1: ( rule__QueryAction__Group__6__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1736:2: rule__QueryAction__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__6__Impl_in_rule__QueryAction__Group__63489);
            rule__QueryAction__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__6"


    // $ANTLR start "rule__QueryAction__Group__6__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1742:1: rule__QueryAction__Group__6__Impl : ( ( rule__QueryAction__FeatureAssignment_6 ) ) ;
    public final void rule__QueryAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1746:1: ( ( ( rule__QueryAction__FeatureAssignment_6 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1747:1: ( ( rule__QueryAction__FeatureAssignment_6 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1747:1: ( ( rule__QueryAction__FeatureAssignment_6 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1748:1: ( rule__QueryAction__FeatureAssignment_6 )
            {
             before(grammarAccess.getQueryActionAccess().getFeatureAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1749:1: ( rule__QueryAction__FeatureAssignment_6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1749:2: rule__QueryAction__FeatureAssignment_6
            {
            pushFollow(FOLLOW_rule__QueryAction__FeatureAssignment_6_in_rule__QueryAction__Group__6__Impl3516);
            rule__QueryAction__FeatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueryActionAccess().getFeatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__Group__6__Impl"


    // $ANTLR start "rule__SelectAction__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1773:1: rule__SelectAction__Group__0 : rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 ;
    public final void rule__SelectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1777:1: ( rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1778:2: rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__03560);
            rule__SelectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__03563);
            rule__SelectAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__0"


    // $ANTLR start "rule__SelectAction__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1785:1: rule__SelectAction__Group__0__Impl : ( 'select feature' ) ;
    public final void rule__SelectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1789:1: ( ( 'select feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1790:1: ( 'select feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1790:1: ( 'select feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1791:1: 'select feature'
            {
             before(grammarAccess.getSelectActionAccess().getSelectFeatureKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SelectAction__Group__0__Impl3591); 
             after(grammarAccess.getSelectActionAccess().getSelectFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__0__Impl"


    // $ANTLR start "rule__SelectAction__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1804:1: rule__SelectAction__Group__1 : rule__SelectAction__Group__1__Impl ;
    public final void rule__SelectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1808:1: ( rule__SelectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1809:2: rule__SelectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__13622);
            rule__SelectAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__1"


    // $ANTLR start "rule__SelectAction__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1815:1: rule__SelectAction__Group__1__Impl : ( ( rule__SelectAction__FeatureAssignment_1 ) ) ;
    public final void rule__SelectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1819:1: ( ( ( rule__SelectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1820:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1820:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1821:1: ( rule__SelectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1822:1: ( rule__SelectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1822:2: rule__SelectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl3649);
            rule__SelectAction__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__1__Impl"


    // $ANTLR start "rule__DeselectAction__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1836:1: rule__DeselectAction__Group__0 : rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 ;
    public final void rule__DeselectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1840:1: ( rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1841:2: rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__03683);
            rule__DeselectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__03686);
            rule__DeselectAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectAction__Group__0"


    // $ANTLR start "rule__DeselectAction__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1848:1: rule__DeselectAction__Group__0__Impl : ( 'deselect feature' ) ;
    public final void rule__DeselectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1852:1: ( ( 'deselect feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1853:1: ( 'deselect feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1853:1: ( 'deselect feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1854:1: 'deselect feature'
            {
             before(grammarAccess.getDeselectActionAccess().getDeselectFeatureKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__DeselectAction__Group__0__Impl3714); 
             after(grammarAccess.getDeselectActionAccess().getDeselectFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectAction__Group__0__Impl"


    // $ANTLR start "rule__DeselectAction__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1867:1: rule__DeselectAction__Group__1 : rule__DeselectAction__Group__1__Impl ;
    public final void rule__DeselectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1871:1: ( rule__DeselectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1872:2: rule__DeselectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__13745);
            rule__DeselectAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectAction__Group__1"


    // $ANTLR start "rule__DeselectAction__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1878:1: rule__DeselectAction__Group__1__Impl : ( ( rule__DeselectAction__FeatureAssignment_1 ) ) ;
    public final void rule__DeselectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1882:1: ( ( ( rule__DeselectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1883:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1883:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1884:1: ( rule__DeselectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1885:1: ( rule__DeselectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1885:2: rule__DeselectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl3772);
            rule__DeselectAction__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeselectActionAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectAction__Group__1__Impl"


    // $ANTLR start "rule__ModifyAttribute__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1899:1: rule__ModifyAttribute__Group__0 : rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 ;
    public final void rule__ModifyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1903:1: ( rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1904:2: rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__03806);
            rule__ModifyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__03809);
            rule__ModifyAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__0"


    // $ANTLR start "rule__ModifyAttribute__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1911:1: rule__ModifyAttribute__Group__0__Impl : ( 'set attribute' ) ;
    public final void rule__ModifyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1915:1: ( ( 'set attribute' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1916:1: ( 'set attribute' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1916:1: ( 'set attribute' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1917:1: 'set attribute'
            {
             before(grammarAccess.getModifyAttributeAccess().getSetAttributeKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ModifyAttribute__Group__0__Impl3837); 
             after(grammarAccess.getModifyAttributeAccess().getSetAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__0__Impl"


    // $ANTLR start "rule__ModifyAttribute__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1930:1: rule__ModifyAttribute__Group__1 : rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 ;
    public final void rule__ModifyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1934:1: ( rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1935:2: rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__13868);
            rule__ModifyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__13871);
            rule__ModifyAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__1"


    // $ANTLR start "rule__ModifyAttribute__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1942:1: rule__ModifyAttribute__Group__1__Impl : ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) ;
    public final void rule__ModifyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1946:1: ( ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1947:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1947:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1948:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1949:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1949:2: rule__ModifyAttribute__FeatureAttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl3898);
            rule__ModifyAttribute__FeatureAttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__1__Impl"


    // $ANTLR start "rule__ModifyAttribute__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1959:1: rule__ModifyAttribute__Group__2 : rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 ;
    public final void rule__ModifyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1963:1: ( rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1964:2: rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__23928);
            rule__ModifyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__23931);
            rule__ModifyAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__2"


    // $ANTLR start "rule__ModifyAttribute__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1971:1: rule__ModifyAttribute__Group__2__Impl : ( 'with value' ) ;
    public final void rule__ModifyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1975:1: ( ( 'with value' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1976:1: ( 'with value' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1976:1: ( 'with value' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1977:1: 'with value'
            {
             before(grammarAccess.getModifyAttributeAccess().getWithValueKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__ModifyAttribute__Group__2__Impl3959); 
             after(grammarAccess.getModifyAttributeAccess().getWithValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__2__Impl"


    // $ANTLR start "rule__ModifyAttribute__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1990:1: rule__ModifyAttribute__Group__3 : rule__ModifyAttribute__Group__3__Impl ;
    public final void rule__ModifyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1994:1: ( rule__ModifyAttribute__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1995:2: rule__ModifyAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__33990);
            rule__ModifyAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__3"


    // $ANTLR start "rule__ModifyAttribute__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2001:1: rule__ModifyAttribute__Group__3__Impl : ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) ) ;
    public final void rule__ModifyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2005:1: ( ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2006:1: ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2006:1: ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2007:1: ( rule__ModifyAttribute__AttributeValueAssignment_3 )
            {
             before(grammarAccess.getModifyAttributeAccess().getAttributeValueAssignment_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2008:1: ( rule__ModifyAttribute__AttributeValueAssignment_3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2008:2: rule__ModifyAttribute__AttributeValueAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__AttributeValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl4017);
            rule__ModifyAttribute__AttributeValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyAttributeAccess().getAttributeValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__Group__3__Impl"


    // $ANTLR start "rule__AdaptationModel__ImportsAssignment_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2027:1: rule__AdaptationModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AdaptationModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2031:1: ( ( ruleImport ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2032:1: ( ruleImport )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2032:1: ( ruleImport )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2033:1: ruleImport
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_04060);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__ImportsAssignment_0"


    // $ANTLR start "rule__AdaptationModel__RulesAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2042:1: rule__AdaptationModel__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__AdaptationModel__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2046:1: ( ( ruleRule ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2047:1: ( ruleRule )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2047:1: ( ruleRule )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2048:1: ruleRule
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_14091);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__RulesAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2057:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2061:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2062:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2062:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2063:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14122); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2072:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2076:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2077:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2077:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2078:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14153); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__ConditionAssignment_4"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2087:1: rule__Rule__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2091:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2092:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2092:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2093:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_44184);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_4"


    // $ANTLR start "rule__Rule__AtomicActionAssignment_6"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2102:1: rule__Rule__AtomicActionAssignment_6 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2106:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2107:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2107:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2108:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_64215);
            ruleAtomicAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AtomicActionAssignment_6"


    // $ANTLR start "rule__Rule__ConditionAssignment_7_1_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2117:1: rule__Rule__ConditionAssignment_7_1_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2121:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2122:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2122:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2123:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_14246);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_7_1_1"


    // $ANTLR start "rule__Rule__AtomicActionAssignment_7_2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2132:1: rule__Rule__AtomicActionAssignment_7_2 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2136:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2137:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2137:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2138:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_24277);
            ruleAtomicAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AtomicActionAssignment_7_2"


    // $ANTLR start "rule__Condition__MeasurementComparisonAssignment"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2147:1: rule__Condition__MeasurementComparisonAssignment : ( ruleMeasurementComparison ) ;
    public final void rule__Condition__MeasurementComparisonAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2151:1: ( ( ruleMeasurementComparison ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2152:1: ( ruleMeasurementComparison )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2152:1: ( ruleMeasurementComparison )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2153:1: ruleMeasurementComparison
            {
             before(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_rule__Condition__MeasurementComparisonAssignment4308);
            ruleMeasurementComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__MeasurementComparisonAssignment"


    // $ANTLR start "rule__MeasurementComparison__MeasurementAssignment_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2162:1: rule__MeasurementComparison__MeasurementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MeasurementComparison__MeasurementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2166:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2167:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2167:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2168:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2169:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2170:1: ruleQualifiedName
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MeasurementComparison__MeasurementAssignment_04343);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementComparison__MeasurementAssignment_0"


    // $ANTLR start "rule__QueryAction__FeatureAssignment_6"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2184:1: rule__QueryAction__FeatureAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__QueryAction__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2188:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2189:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2189:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2190:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_6_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2191:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2192:1: RULE_ID
            {
             before(grammarAccess.getQueryActionAccess().getFeatureFeatureIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryAction__FeatureAssignment_64385); 
             after(grammarAccess.getQueryActionAccess().getFeatureFeatureIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryAction__FeatureAssignment_6"


    // $ANTLR start "rule__SelectAction__FeatureAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2203:1: rule__SelectAction__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2207:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2208:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2208:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2209:1: ( RULE_ID )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2210:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2211:1: RULE_ID
            {
             before(grammarAccess.getSelectActionAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectAction__FeatureAssignment_14424); 
             after(grammarAccess.getSelectActionAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__FeatureAssignment_1"


    // $ANTLR start "rule__DeselectAction__FeatureAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2222:1: rule__DeselectAction__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeselectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2226:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2227:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2227:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2228:1: ( RULE_ID )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2229:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2230:1: RULE_ID
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeselectAction__FeatureAssignment_14463); 
             after(grammarAccess.getDeselectActionAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectAction__FeatureAssignment_1"


    // $ANTLR start "rule__ModifyAttribute__FeatureAttributeAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2241:1: rule__ModifyAttribute__FeatureAttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyAttribute__FeatureAttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2245:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2246:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2246:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2247:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2248:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2249:1: RULE_ID
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyAttribute__FeatureAttributeAssignment_14502); 
             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__FeatureAttributeAssignment_1"


    // $ANTLR start "rule__ModifyAttribute__AttributeValueAssignment_3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2260:1: rule__ModifyAttribute__AttributeValueAssignment_3 : ( ruleAttributeValue ) ;
    public final void rule__ModifyAttribute__AttributeValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2264:1: ( ( ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2265:1: ( ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2265:1: ( ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2266:1: ruleAttributeValue
            {
             before(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__ModifyAttribute__AttributeValueAssignment_34537);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifyAttribute__AttributeValueAssignment_3"


    // $ANTLR start "rule__StringAttributeValue__ValueAssignment"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2275:1: rule__StringAttributeValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttributeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2279:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2280:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2280:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2281:1: RULE_STRING
            {
             before(grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringAttributeValue__ValueAssignment4568); 
             after(grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttributeValue__ValueAssignment"


    // $ANTLR start "rule__NFRAttributeValue__ValueAssignment"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2290:1: rule__NFRAttributeValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__NFRAttributeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2294:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2295:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2295:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2296:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2297:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2298:1: ruleQualifiedName
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NFRAttributeValue__ValueAssignment4603);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NFRAttributeValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__0_in_ruleAdaptationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__MeasurementComparisonAssignment_in_ruleCondition336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementComparison370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__0_in_ruleMeasurementComparison396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OPERATOR__Alternatives_in_ruleOPERATOR456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOGICAL_OPERATOR__Alternatives_in_ruleLOGICAL_OPERATOR516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OPERATOR_in_entryRuleMATH_OPERATOR543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_OPERATOR550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_OPERATOR__Alternatives_in_ruleMATH_OPERATOR576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__0_in_ruleQueryAction702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttributeValue__ValueAssignment_in_ruleStringAttributeValue1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NFRAttributeValue__ValueAssignment_in_ruleNFRAttributeValue1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OPERATOR__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OPERATOR__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OPERATOR__Alternatives1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OPERATOR__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LOGICAL_OPERATOR__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LOGICAL_OPERATOR__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MATH_OPERATOR__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MATH_OPERATOR__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MATH_OPERATOR__Alternatives1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MATH_OPERATOR__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_rule__AtomicAction__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_rule__AttributeValue__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_rule__AttributeValue__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01473 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1503 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1561 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Import__Group__0__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01720 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1806 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12025 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22085 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Rule__Group__2__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group__3__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52269 = new BitSet(new long[]{0x0000000310000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rule__Group__5__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62331 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2363 = new BitSet(new long[]{0x0000000310000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2375 = new BitSet(new long[]{0x0000000310000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2435 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02482 = new BitSet(new long[]{0x0000000312000000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rule__Group_7__0__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12544 = new BitSet(new long[]{0x0000000312000000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2574 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2634 = new BitSet(new long[]{0x0000000312000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2646 = new BitSet(new long[]{0x0000000312000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group_7_1__0__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12747 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rule__Group_7_1__2__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__0__Impl_in_rule__MeasurementComparison__Group__02872 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__1_in_rule__MeasurementComparison__Group__02875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__MeasurementAssignment_0_in_rule__MeasurementComparison__Group__0__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__1__Impl_in_rule__MeasurementComparison__Group__12932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__2_in_rule__MeasurementComparison__Group__12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_rule__MeasurementComparison__Group__1__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__2__Impl_in_rule__MeasurementComparison__Group__22991 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__3_in_rule__MeasurementComparison__Group__22994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementComparison__Group__2__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__3__Impl_in_rule__MeasurementComparison__Group__33050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_rule__MeasurementComparison__Group__3__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__0__Impl_in_rule__QueryAction__Group__03123 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__1_in_rule__QueryAction__Group__03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QueryAction__Group__0__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__1__Impl_in_rule__QueryAction__Group__13185 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__2_in_rule__QueryAction__Group__13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QueryAction__Group__1__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__2__Impl_in_rule__QueryAction__Group__23247 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__3_in_rule__QueryAction__Group__23250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OPERATOR_in_rule__QueryAction__Group__2__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__3__Impl_in_rule__QueryAction__Group__33306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__4_in_rule__QueryAction__Group__33309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QueryAction__Group__3__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__4__Impl_in_rule__QueryAction__Group__43368 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__5_in_rule__QueryAction__Group__43371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QueryAction__Group__4__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__5__Impl_in_rule__QueryAction__Group__53427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__6_in_rule__QueryAction__Group__53430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QueryAction__Group__5__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__6__Impl_in_rule__QueryAction__Group__63489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__FeatureAssignment_6_in_rule__QueryAction__Group__6__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__03560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__03563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SelectAction__Group__0__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__13622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__03683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__03686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DeselectAction__Group__0__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__03806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__03809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModifyAttribute__Group__0__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__13868 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__13871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__23928 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__23931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModifyAttribute__Group__2__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__33990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__AttributeValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_04060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_14091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_44184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_64215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_24277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_rule__Condition__MeasurementComparisonAssignment4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MeasurementComparison__MeasurementAssignment_04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryAction__FeatureAssignment_64385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectAction__FeatureAssignment_14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeselectAction__FeatureAssignment_14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyAttribute__FeatureAttributeAssignment_14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__ModifyAttribute__AttributeValueAssignment_34537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAttributeValue__ValueAssignment4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NFRAttributeValue__ValueAssignment4603 = new BitSet(new long[]{0x0000000000000002L});

}