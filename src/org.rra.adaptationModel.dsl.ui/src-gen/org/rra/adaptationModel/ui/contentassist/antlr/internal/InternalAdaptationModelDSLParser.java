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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'=='", "'<>'", "'AND'", "'OR'", "'import'", "'.'", "'rule'", "':'", "'if'", "'then'", "'else'", "'AVG ('", "')'", "','", "'MIN ('", "'MAX ('", "'select feature'", "'with'", "'attribute'", "'from feature'", "'activate feature'", "'deactivate feature'", "'set attribute'", "'with value'"
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
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
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


    // $ANTLR start "entryRuleAVG"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:314:1: entryRuleAVG : ruleAVG EOF ;
    public final void entryRuleAVG() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:315:1: ( ruleAVG EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:316:1: ruleAVG EOF
            {
             before(grammarAccess.getAVGRule()); 
            pushFollow(FOLLOW_ruleAVG_in_entryRuleAVG603);
            ruleAVG();

            state._fsp--;

             after(grammarAccess.getAVGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAVG610); 

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
    // $ANTLR end "entryRuleAVG"


    // $ANTLR start "ruleAVG"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:323:1: ruleAVG : ( ( rule__AVG__Group__0 ) ) ;
    public final void ruleAVG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:327:2: ( ( ( rule__AVG__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:328:1: ( ( rule__AVG__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:328:1: ( ( rule__AVG__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:329:1: ( rule__AVG__Group__0 )
            {
             before(grammarAccess.getAVGAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:330:1: ( rule__AVG__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:330:2: rule__AVG__Group__0
            {
            pushFollow(FOLLOW_rule__AVG__Group__0_in_ruleAVG636);
            rule__AVG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAVGAccess().getGroup()); 

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
    // $ANTLR end "ruleAVG"


    // $ANTLR start "entryRuleMIN"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:342:1: entryRuleMIN : ruleMIN EOF ;
    public final void entryRuleMIN() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:343:1: ( ruleMIN EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:344:1: ruleMIN EOF
            {
             before(grammarAccess.getMINRule()); 
            pushFollow(FOLLOW_ruleMIN_in_entryRuleMIN663);
            ruleMIN();

            state._fsp--;

             after(grammarAccess.getMINRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMIN670); 

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
    // $ANTLR end "entryRuleMIN"


    // $ANTLR start "ruleMIN"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:351:1: ruleMIN : ( ( rule__MIN__Group__0 ) ) ;
    public final void ruleMIN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:355:2: ( ( ( rule__MIN__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:356:1: ( ( rule__MIN__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:356:1: ( ( rule__MIN__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:357:1: ( rule__MIN__Group__0 )
            {
             before(grammarAccess.getMINAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:358:1: ( rule__MIN__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:358:2: rule__MIN__Group__0
            {
            pushFollow(FOLLOW_rule__MIN__Group__0_in_ruleMIN696);
            rule__MIN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMINAccess().getGroup()); 

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
    // $ANTLR end "ruleMIN"


    // $ANTLR start "entryRuleMAX"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:370:1: entryRuleMAX : ruleMAX EOF ;
    public final void entryRuleMAX() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:371:1: ( ruleMAX EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:372:1: ruleMAX EOF
            {
             before(grammarAccess.getMAXRule()); 
            pushFollow(FOLLOW_ruleMAX_in_entryRuleMAX723);
            ruleMAX();

            state._fsp--;

             after(grammarAccess.getMAXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAX730); 

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
    // $ANTLR end "entryRuleMAX"


    // $ANTLR start "ruleMAX"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:379:1: ruleMAX : ( ( rule__MAX__Group__0 ) ) ;
    public final void ruleMAX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:383:2: ( ( ( rule__MAX__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:384:1: ( ( rule__MAX__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:384:1: ( ( rule__MAX__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:385:1: ( rule__MAX__Group__0 )
            {
             before(grammarAccess.getMAXAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:386:1: ( rule__MAX__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:386:2: rule__MAX__Group__0
            {
            pushFollow(FOLLOW_rule__MAX__Group__0_in_ruleMAX756);
            rule__MAX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMAXAccess().getGroup()); 

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
    // $ANTLR end "ruleMAX"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:398:1: entryRuleAtomicAction : ruleAtomicAction EOF ;
    public final void entryRuleAtomicAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:399:1: ( ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:400:1: ruleAtomicAction EOF
            {
             before(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction783);
            ruleAtomicAction();

            state._fsp--;

             after(grammarAccess.getAtomicActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction790); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:407:1: ruleAtomicAction : ( ( rule__AtomicAction__Alternatives ) ) ;
    public final void ruleAtomicAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:411:2: ( ( ( rule__AtomicAction__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:412:1: ( ( rule__AtomicAction__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:412:1: ( ( rule__AtomicAction__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:413:1: ( rule__AtomicAction__Alternatives )
            {
             before(grammarAccess.getAtomicActionAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:414:1: ( rule__AtomicAction__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:414:2: rule__AtomicAction__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction816);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:426:1: entryRuleQueryAction : ruleQueryAction EOF ;
    public final void entryRuleQueryAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:427:1: ( ruleQueryAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:428:1: ruleQueryAction EOF
            {
             before(grammarAccess.getQueryActionRule()); 
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction843);
            ruleQueryAction();

            state._fsp--;

             after(grammarAccess.getQueryActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction850); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:435:1: ruleQueryAction : ( ( rule__QueryAction__Group__0 ) ) ;
    public final void ruleQueryAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:439:2: ( ( ( rule__QueryAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:440:1: ( ( rule__QueryAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:440:1: ( ( rule__QueryAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:441:1: ( rule__QueryAction__Group__0 )
            {
             before(grammarAccess.getQueryActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:442:1: ( rule__QueryAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:442:2: rule__QueryAction__Group__0
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__0_in_ruleQueryAction876);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:454:1: entryRuleSelectAction : ruleSelectAction EOF ;
    public final void entryRuleSelectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:455:1: ( ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:456:1: ruleSelectAction EOF
            {
             before(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction903);
            ruleSelectAction();

            state._fsp--;

             after(grammarAccess.getSelectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction910); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:463:1: ruleSelectAction : ( ( rule__SelectAction__Group__0 ) ) ;
    public final void ruleSelectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:467:2: ( ( ( rule__SelectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:468:1: ( ( rule__SelectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:468:1: ( ( rule__SelectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:469:1: ( rule__SelectAction__Group__0 )
            {
             before(grammarAccess.getSelectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:470:1: ( rule__SelectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:470:2: rule__SelectAction__Group__0
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction936);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:482:1: entryRuleDeselectAction : ruleDeselectAction EOF ;
    public final void entryRuleDeselectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:483:1: ( ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:484:1: ruleDeselectAction EOF
            {
             before(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction963);
            ruleDeselectAction();

            state._fsp--;

             after(grammarAccess.getDeselectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction970); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:491:1: ruleDeselectAction : ( ( rule__DeselectAction__Group__0 ) ) ;
    public final void ruleDeselectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:495:2: ( ( ( rule__DeselectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:496:1: ( ( rule__DeselectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:496:1: ( ( rule__DeselectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:497:1: ( rule__DeselectAction__Group__0 )
            {
             before(grammarAccess.getDeselectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:498:1: ( rule__DeselectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:498:2: rule__DeselectAction__Group__0
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction996);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:510:1: entryRuleModifyAttribute : ruleModifyAttribute EOF ;
    public final void entryRuleModifyAttribute() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:511:1: ( ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:512:1: ruleModifyAttribute EOF
            {
             before(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute1023);
            ruleModifyAttribute();

            state._fsp--;

             after(grammarAccess.getModifyAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute1030); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:519:1: ruleModifyAttribute : ( ( rule__ModifyAttribute__Group__0 ) ) ;
    public final void ruleModifyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:523:2: ( ( ( rule__ModifyAttribute__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:524:1: ( ( rule__ModifyAttribute__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:524:1: ( ( rule__ModifyAttribute__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:525:1: ( rule__ModifyAttribute__Group__0 )
            {
             before(grammarAccess.getModifyAttributeAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:526:1: ( rule__ModifyAttribute__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:526:2: rule__ModifyAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute1056);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:538:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:539:1: ( ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:540:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1083);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue1090); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:547:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:551:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:552:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:552:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:553:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:554:1: ( rule__AttributeValue__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:554:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1116);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:566:1: entryRuleStringAttributeValue : ruleStringAttributeValue EOF ;
    public final void entryRuleStringAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:567:1: ( ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:568:1: ruleStringAttributeValue EOF
            {
             before(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue1143);
            ruleStringAttributeValue();

            state._fsp--;

             after(grammarAccess.getStringAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue1150); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:575:1: ruleStringAttributeValue : ( ( rule__StringAttributeValue__ValueAssignment ) ) ;
    public final void ruleStringAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:579:2: ( ( ( rule__StringAttributeValue__ValueAssignment ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:580:1: ( ( rule__StringAttributeValue__ValueAssignment ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:580:1: ( ( rule__StringAttributeValue__ValueAssignment ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:581:1: ( rule__StringAttributeValue__ValueAssignment )
            {
             before(grammarAccess.getStringAttributeValueAccess().getValueAssignment()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:582:1: ( rule__StringAttributeValue__ValueAssignment )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:582:2: rule__StringAttributeValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringAttributeValue__ValueAssignment_in_ruleStringAttributeValue1176);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:594:1: entryRuleNFRAttributeValue : ruleNFRAttributeValue EOF ;
    public final void entryRuleNFRAttributeValue() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:595:1: ( ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:596:1: ruleNFRAttributeValue EOF
            {
             before(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue1203);
            ruleNFRAttributeValue();

            state._fsp--;

             after(grammarAccess.getNFRAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue1210); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:603:1: ruleNFRAttributeValue : ( ( rule__NFRAttributeValue__ValueAssignment ) ) ;
    public final void ruleNFRAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:607:2: ( ( ( rule__NFRAttributeValue__ValueAssignment ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:608:1: ( ( rule__NFRAttributeValue__ValueAssignment ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:608:1: ( ( rule__NFRAttributeValue__ValueAssignment ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:609:1: ( rule__NFRAttributeValue__ValueAssignment )
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueAssignment()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:610:1: ( rule__NFRAttributeValue__ValueAssignment )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:610:2: rule__NFRAttributeValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NFRAttributeValue__ValueAssignment_in_ruleNFRAttributeValue1236);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:622:1: rule__OPERATOR__Alternatives : ( ( '<' ) | ( '>' ) | ( '==' ) | ( '<>' ) );
    public final void rule__OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:626:1: ( ( '<' ) | ( '>' ) | ( '==' ) | ( '<>' ) )
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
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:627:1: ( '<' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:627:1: ( '<' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:628:1: '<'
                    {
                     before(grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__OPERATOR__Alternatives1273); 
                     after(grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:635:6: ( '>' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:635:6: ( '>' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:636:1: '>'
                    {
                     before(grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__OPERATOR__Alternatives1293); 
                     after(grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:643:6: ( '==' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:643:6: ( '==' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:644:1: '=='
                    {
                     before(grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__OPERATOR__Alternatives1313); 
                     after(grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:651:6: ( '<>' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:651:6: ( '<>' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:652:1: '<>'
                    {
                     before(grammarAccess.getOPERATORAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__OPERATOR__Alternatives1333); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:664:1: rule__LOGICAL_OPERATOR__Alternatives : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__LOGICAL_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:668:1: ( ( 'AND' ) | ( 'OR' ) )
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
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:669:1: ( 'AND' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:669:1: ( 'AND' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:670:1: 'AND'
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__LOGICAL_OPERATOR__Alternatives1368); 
                     after(grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:677:6: ( 'OR' )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:677:6: ( 'OR' )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:678:1: 'OR'
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getORKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__LOGICAL_OPERATOR__Alternatives1388); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:690:1: rule__MATH_OPERATOR__Alternatives : ( ( ruleMAX ) | ( ruleMIN ) | ( ruleAVG ) );
    public final void rule__MATH_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:694:1: ( ( ruleMAX ) | ( ruleMIN ) | ( ruleAVG ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:695:1: ( ruleMAX )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:695:1: ( ruleMAX )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:696:1: ruleMAX
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getMAXParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMAX_in_rule__MATH_OPERATOR__Alternatives1422);
                    ruleMAX();

                    state._fsp--;

                     after(grammarAccess.getMATH_OPERATORAccess().getMAXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:701:6: ( ruleMIN )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:701:6: ( ruleMIN )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:702:1: ruleMIN
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getMINParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMIN_in_rule__MATH_OPERATOR__Alternatives1439);
                    ruleMIN();

                    state._fsp--;

                     after(grammarAccess.getMATH_OPERATORAccess().getMINParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:707:6: ( ruleAVG )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:707:6: ( ruleAVG )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:708:1: ruleAVG
                    {
                     before(grammarAccess.getMATH_OPERATORAccess().getAVGParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAVG_in_rule__MATH_OPERATOR__Alternatives1456);
                    ruleAVG();

                    state._fsp--;

                     after(grammarAccess.getMATH_OPERATORAccess().getAVGParserRuleCall_2()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:718:1: rule__AtomicAction__Alternatives : ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) | ( ruleQueryAction ) );
    public final void rule__AtomicAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:722:1: ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) | ( ruleQueryAction ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:723:1: ( ruleSelectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:723:1: ( ruleSelectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:724:1: ruleSelectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1488);
                    ruleSelectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:6: ( ruleDeselectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:6: ( ruleDeselectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:730:1: ruleDeselectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1505);
                    ruleDeselectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:735:6: ( ruleModifyAttribute )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:735:6: ( ruleModifyAttribute )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:736:1: ruleModifyAttribute
                    {
                     before(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1522);
                    ruleModifyAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:741:6: ( ruleQueryAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:741:6: ( ruleQueryAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:742:1: ruleQueryAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQueryAction_in_rule__AtomicAction__Alternatives1539);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:752:1: rule__AttributeValue__Alternatives : ( ( ruleStringAttributeValue ) | ( ruleNFRAttributeValue ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:756:1: ( ( ruleStringAttributeValue ) | ( ruleNFRAttributeValue ) )
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
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:757:1: ( ruleStringAttributeValue )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:757:1: ( ruleStringAttributeValue )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:758:1: ruleStringAttributeValue
                    {
                     before(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_rule__AttributeValue__Alternatives1571);
                    ruleStringAttributeValue();

                    state._fsp--;

                     after(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:763:6: ( ruleNFRAttributeValue )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:763:6: ( ruleNFRAttributeValue )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:764:1: ruleNFRAttributeValue
                    {
                     before(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_rule__AttributeValue__Alternatives1588);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:776:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:780:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:781:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01618);
            rule__AdaptationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01621);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:788:1: rule__AdaptationModel__Group__0__Impl : ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:792:1: ( ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:793:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:793:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:794:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:795:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:795:2: rule__AdaptationModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1648);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:805:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:809:1: ( rule__AdaptationModel__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:810:2: rule__AdaptationModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11679);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:816:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__RulesAssignment_1 )* ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:820:1: ( ( ( rule__AdaptationModel__RulesAssignment_1 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:821:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:821:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:822:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:823:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:823:2: rule__AdaptationModel__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1706);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:837:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:841:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:842:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01741);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01744);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:849:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:853:1: ( ( 'import' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:854:1: ( 'import' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:854:1: ( 'import' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:855:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1772); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:868:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:872:1: ( rule__Import__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:873:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11803);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:879:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:883:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:884:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:884:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:885:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:886:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:886:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1830);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:901:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:905:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:906:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01865);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01868);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:913:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:917:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:918:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:918:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:919:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1895); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:930:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:934:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:935:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11924);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:941:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:945:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:946:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:946:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:947:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:948:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:948:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1951);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:962:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:966:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:967:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01986);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01989);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:974:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:978:1: ( ( '.' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:979:1: ( '.' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:979:1: ( '.' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:980:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl2017); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:993:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:997:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:998:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12048);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1004:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1008:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1010:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2075); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1025:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1029:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1030:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02108);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02111);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1037:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1041:1: ( ( 'rule' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1042:1: ( 'rule' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1042:1: ( 'rule' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1043:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Rule__Group__0__Impl2139); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1056:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1060:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1061:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12170);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12173);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1068:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1072:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1073:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1073:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1074:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1075:1: ( rule__Rule__NameAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1075:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2200);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1085:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1089:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1090:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22230);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22233);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1097:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1101:1: ( ( ':' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1102:1: ( ':' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1102:1: ( ':' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1103:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__2__Impl2261); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1116:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1120:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1121:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32292);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32295);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1128:1: rule__Rule__Group__3__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1132:1: ( ( 'if' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1133:1: ( 'if' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1133:1: ( 'if' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1134:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group__3__Impl2323); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1147:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1151:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1152:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42354);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42357);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1159:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ConditionAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1163:1: ( ( ( rule__Rule__ConditionAssignment_4 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1164:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1164:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1165:1: ( rule__Rule__ConditionAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_4()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1166:1: ( rule__Rule__ConditionAssignment_4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1166:2: rule__Rule__ConditionAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2384);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1176:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1180:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1181:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52414);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52417);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1188:1: rule__Rule__Group__5__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1192:1: ( ( 'then' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1193:1: ( 'then' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1193:1: ( 'then' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1194:1: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Rule__Group__5__Impl2445); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1207:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1211:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1212:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62476);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62479);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1219:1: rule__Rule__Group__6__Impl : ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1223:1: ( ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1224:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1224:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1225:1: ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1225:1: ( ( rule__Rule__AtomicActionAssignment_6 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1226:1: ( rule__Rule__AtomicActionAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1227:1: ( rule__Rule__AtomicActionAssignment_6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1227:2: rule__Rule__AtomicActionAssignment_6
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2508);
            rule__Rule__AtomicActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1230:1: ( ( rule__Rule__AtomicActionAssignment_6 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1231:1: ( rule__Rule__AtomicActionAssignment_6 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1232:1: ( rule__Rule__AtomicActionAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29||(LA9_0>=33 && LA9_0<=35)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1232:2: rule__Rule__AtomicActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2520);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1243:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1247:1: ( rule__Rule__Group__7__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1248:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72553);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1254:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1258:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1259:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1259:1: ( ( rule__Rule__Group_7__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1260:1: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1261:1: ( rule__Rule__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1261:2: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2580);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1287:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1291:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1292:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02627);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02630);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1299:1: rule__Rule__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1303:1: ( ( 'else' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1304:1: ( 'else' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1304:1: ( 'else' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1305:1: 'else'
            {
             before(grammarAccess.getRuleAccess().getElseKeyword_7_0()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group_7__0__Impl2658); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1318:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1322:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1323:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12689);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12692);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1330:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Group_7_1__0 )* ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1334:1: ( ( ( rule__Rule__Group_7_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1335:1: ( ( rule__Rule__Group_7_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1335:1: ( ( rule__Rule__Group_7_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1336:1: ( rule__Rule__Group_7_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1337:1: ( rule__Rule__Group_7_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1337:2: rule__Rule__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2719);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1347:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1351:1: ( rule__Rule__Group_7__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1352:2: rule__Rule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22750);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1358:1: rule__Rule__Group_7__2__Impl : ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1362:1: ( ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1363:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1363:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1364:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1364:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1365:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1366:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1366:2: rule__Rule__AtomicActionAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2779);
            rule__Rule__AtomicActionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1369:1: ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1370:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1371:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29||(LA12_0>=33 && LA12_0<=35)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1371:2: rule__Rule__AtomicActionAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2791);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1388:1: rule__Rule__Group_7_1__0 : rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 ;
    public final void rule__Rule__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1392:1: ( rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1393:2: rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02830);
            rule__Rule__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02833);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1400:1: rule__Rule__Group_7_1__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1404:1: ( ( 'if' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1405:1: ( 'if' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1405:1: ( 'if' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1406:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_7_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group_7_1__0__Impl2861); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1419:1: rule__Rule__Group_7_1__1 : rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 ;
    public final void rule__Rule__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1423:1: ( rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1424:2: rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12892);
            rule__Rule__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12895);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1431:1: rule__Rule__Group_7_1__1__Impl : ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) ;
    public final void rule__Rule__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1435:1: ( ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1436:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1436:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1437:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_7_1_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1438:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1438:2: rule__Rule__ConditionAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2922);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1448:1: rule__Rule__Group_7_1__2 : rule__Rule__Group_7_1__2__Impl ;
    public final void rule__Rule__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1452:1: ( rule__Rule__Group_7_1__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1453:2: rule__Rule__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22952);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1459:1: rule__Rule__Group_7_1__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1463:1: ( ( 'then' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1464:1: ( 'then' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1464:1: ( 'then' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1465:1: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_7_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Rule__Group_7_1__2__Impl2980); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1484:1: rule__MeasurementComparison__Group__0 : rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1 ;
    public final void rule__MeasurementComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1488:1: ( rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1489:2: rule__MeasurementComparison__Group__0__Impl rule__MeasurementComparison__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__0__Impl_in_rule__MeasurementComparison__Group__03017);
            rule__MeasurementComparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__1_in_rule__MeasurementComparison__Group__03020);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1496:1: rule__MeasurementComparison__Group__0__Impl : ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) ) ;
    public final void rule__MeasurementComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1500:1: ( ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1501:1: ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1501:1: ( ( rule__MeasurementComparison__MeasurementAssignment_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1502:1: ( rule__MeasurementComparison__MeasurementAssignment_0 )
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1503:1: ( rule__MeasurementComparison__MeasurementAssignment_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1503:2: rule__MeasurementComparison__MeasurementAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__MeasurementAssignment_0_in_rule__MeasurementComparison__Group__0__Impl3047);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1513:1: rule__MeasurementComparison__Group__1 : rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2 ;
    public final void rule__MeasurementComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1517:1: ( rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1518:2: rule__MeasurementComparison__Group__1__Impl rule__MeasurementComparison__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__1__Impl_in_rule__MeasurementComparison__Group__13077);
            rule__MeasurementComparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__2_in_rule__MeasurementComparison__Group__13080);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1525:1: rule__MeasurementComparison__Group__1__Impl : ( ruleOPERATOR ) ;
    public final void rule__MeasurementComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1529:1: ( ( ruleOPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1530:1: ( ruleOPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1530:1: ( ruleOPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1531:1: ruleOPERATOR
            {
             before(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_rule__MeasurementComparison__Group__1__Impl3107);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1542:1: rule__MeasurementComparison__Group__2 : rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3 ;
    public final void rule__MeasurementComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1546:1: ( rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1547:2: rule__MeasurementComparison__Group__2__Impl rule__MeasurementComparison__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__2__Impl_in_rule__MeasurementComparison__Group__23136);
            rule__MeasurementComparison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementComparison__Group__3_in_rule__MeasurementComparison__Group__23139);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1554:1: rule__MeasurementComparison__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__MeasurementComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1558:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1559:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1559:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1560:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementComparisonAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementComparison__Group__2__Impl3166); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1571:1: rule__MeasurementComparison__Group__3 : rule__MeasurementComparison__Group__3__Impl ;
    public final void rule__MeasurementComparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1575:1: ( rule__MeasurementComparison__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1576:2: rule__MeasurementComparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementComparison__Group__3__Impl_in_rule__MeasurementComparison__Group__33195);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1582:1: rule__MeasurementComparison__Group__3__Impl : ( ( ruleLOGICAL_OPERATOR )? ) ;
    public final void rule__MeasurementComparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1586:1: ( ( ( ruleLOGICAL_OPERATOR )? ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1587:1: ( ( ruleLOGICAL_OPERATOR )? )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1587:1: ( ( ruleLOGICAL_OPERATOR )? )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1588:1: ( ruleLOGICAL_OPERATOR )?
            {
             before(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1589:1: ( ruleLOGICAL_OPERATOR )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1589:3: ruleLOGICAL_OPERATOR
                    {
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_rule__MeasurementComparison__Group__3__Impl3223);
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


    // $ANTLR start "rule__AVG__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1607:1: rule__AVG__Group__0 : rule__AVG__Group__0__Impl rule__AVG__Group__1 ;
    public final void rule__AVG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1611:1: ( rule__AVG__Group__0__Impl rule__AVG__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1612:2: rule__AVG__Group__0__Impl rule__AVG__Group__1
            {
            pushFollow(FOLLOW_rule__AVG__Group__0__Impl_in_rule__AVG__Group__03262);
            rule__AVG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AVG__Group__1_in_rule__AVG__Group__03265);
            rule__AVG__Group__1();

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
    // $ANTLR end "rule__AVG__Group__0"


    // $ANTLR start "rule__AVG__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1619:1: rule__AVG__Group__0__Impl : ( 'AVG (' ) ;
    public final void rule__AVG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1623:1: ( ( 'AVG (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1624:1: ( 'AVG (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1624:1: ( 'AVG (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1625:1: 'AVG ('
            {
             before(grammarAccess.getAVGAccess().getAVGKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__AVG__Group__0__Impl3293); 
             after(grammarAccess.getAVGAccess().getAVGKeyword_0()); 

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
    // $ANTLR end "rule__AVG__Group__0__Impl"


    // $ANTLR start "rule__AVG__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1638:1: rule__AVG__Group__1 : rule__AVG__Group__1__Impl rule__AVG__Group__2 ;
    public final void rule__AVG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1642:1: ( rule__AVG__Group__1__Impl rule__AVG__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1643:2: rule__AVG__Group__1__Impl rule__AVG__Group__2
            {
            pushFollow(FOLLOW_rule__AVG__Group__1__Impl_in_rule__AVG__Group__13324);
            rule__AVG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AVG__Group__2_in_rule__AVG__Group__13327);
            rule__AVG__Group__2();

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
    // $ANTLR end "rule__AVG__Group__1"


    // $ANTLR start "rule__AVG__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1650:1: rule__AVG__Group__1__Impl : ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) ) ;
    public final void rule__AVG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1654:1: ( ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1655:1: ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1655:1: ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1656:1: ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1656:1: ( ( rule__AVG__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1657:1: ( rule__AVG__Group_1__0 )
            {
             before(grammarAccess.getAVGAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1658:1: ( rule__AVG__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1658:2: rule__AVG__Group_1__0
            {
            pushFollow(FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3356);
            rule__AVG__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAVGAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1661:1: ( ( rule__AVG__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1662:1: ( rule__AVG__Group_1__0 )*
            {
             before(grammarAccess.getAVGAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1663:1: ( rule__AVG__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1663:2: rule__AVG__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3368);
            	    rule__AVG__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAVGAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AVG__Group__1__Impl"


    // $ANTLR start "rule__AVG__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1674:1: rule__AVG__Group__2 : rule__AVG__Group__2__Impl ;
    public final void rule__AVG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1678:1: ( rule__AVG__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1679:2: rule__AVG__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AVG__Group__2__Impl_in_rule__AVG__Group__23401);
            rule__AVG__Group__2__Impl();

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
    // $ANTLR end "rule__AVG__Group__2"


    // $ANTLR start "rule__AVG__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1685:1: rule__AVG__Group__2__Impl : ( ')' ) ;
    public final void rule__AVG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1689:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1690:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1690:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1691:1: ')'
            {
             before(grammarAccess.getAVGAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__AVG__Group__2__Impl3429); 
             after(grammarAccess.getAVGAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AVG__Group__2__Impl"


    // $ANTLR start "rule__AVG__Group_1__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1710:1: rule__AVG__Group_1__0 : rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1 ;
    public final void rule__AVG__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1714:1: ( rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1715:2: rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1
            {
            pushFollow(FOLLOW_rule__AVG__Group_1__0__Impl_in_rule__AVG__Group_1__03466);
            rule__AVG__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AVG__Group_1__1_in_rule__AVG__Group_1__03469);
            rule__AVG__Group_1__1();

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
    // $ANTLR end "rule__AVG__Group_1__0"


    // $ANTLR start "rule__AVG__Group_1__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1722:1: rule__AVG__Group_1__0__Impl : ( ( rule__AVG__MeasurementAssignment_1_0 ) ) ;
    public final void rule__AVG__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1726:1: ( ( ( rule__AVG__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1727:1: ( ( rule__AVG__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1727:1: ( ( rule__AVG__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1728:1: ( rule__AVG__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getAVGAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1729:1: ( rule__AVG__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1729:2: rule__AVG__MeasurementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AVG__MeasurementAssignment_1_0_in_rule__AVG__Group_1__0__Impl3496);
            rule__AVG__MeasurementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAVGAccess().getMeasurementAssignment_1_0()); 

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
    // $ANTLR end "rule__AVG__Group_1__0__Impl"


    // $ANTLR start "rule__AVG__Group_1__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1739:1: rule__AVG__Group_1__1 : rule__AVG__Group_1__1__Impl ;
    public final void rule__AVG__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1743:1: ( rule__AVG__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1744:2: rule__AVG__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AVG__Group_1__1__Impl_in_rule__AVG__Group_1__13526);
            rule__AVG__Group_1__1__Impl();

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
    // $ANTLR end "rule__AVG__Group_1__1"


    // $ANTLR start "rule__AVG__Group_1__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1750:1: rule__AVG__Group_1__1__Impl : ( ',' ) ;
    public final void rule__AVG__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1754:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1755:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1755:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1756:1: ','
            {
             before(grammarAccess.getAVGAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__AVG__Group_1__1__Impl3554); 
             after(grammarAccess.getAVGAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__AVG__Group_1__1__Impl"


    // $ANTLR start "rule__MIN__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1773:1: rule__MIN__Group__0 : rule__MIN__Group__0__Impl rule__MIN__Group__1 ;
    public final void rule__MIN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1777:1: ( rule__MIN__Group__0__Impl rule__MIN__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1778:2: rule__MIN__Group__0__Impl rule__MIN__Group__1
            {
            pushFollow(FOLLOW_rule__MIN__Group__0__Impl_in_rule__MIN__Group__03589);
            rule__MIN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MIN__Group__1_in_rule__MIN__Group__03592);
            rule__MIN__Group__1();

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
    // $ANTLR end "rule__MIN__Group__0"


    // $ANTLR start "rule__MIN__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1785:1: rule__MIN__Group__0__Impl : ( 'MIN (' ) ;
    public final void rule__MIN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1789:1: ( ( 'MIN (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1790:1: ( 'MIN (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1790:1: ( 'MIN (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1791:1: 'MIN ('
            {
             before(grammarAccess.getMINAccess().getMINKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__MIN__Group__0__Impl3620); 
             after(grammarAccess.getMINAccess().getMINKeyword_0()); 

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
    // $ANTLR end "rule__MIN__Group__0__Impl"


    // $ANTLR start "rule__MIN__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1804:1: rule__MIN__Group__1 : rule__MIN__Group__1__Impl rule__MIN__Group__2 ;
    public final void rule__MIN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1808:1: ( rule__MIN__Group__1__Impl rule__MIN__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1809:2: rule__MIN__Group__1__Impl rule__MIN__Group__2
            {
            pushFollow(FOLLOW_rule__MIN__Group__1__Impl_in_rule__MIN__Group__13651);
            rule__MIN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MIN__Group__2_in_rule__MIN__Group__13654);
            rule__MIN__Group__2();

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
    // $ANTLR end "rule__MIN__Group__1"


    // $ANTLR start "rule__MIN__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1816:1: rule__MIN__Group__1__Impl : ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) ) ;
    public final void rule__MIN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1820:1: ( ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1821:1: ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1821:1: ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1822:1: ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1822:1: ( ( rule__MIN__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1823:1: ( rule__MIN__Group_1__0 )
            {
             before(grammarAccess.getMINAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1824:1: ( rule__MIN__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1824:2: rule__MIN__Group_1__0
            {
            pushFollow(FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3683);
            rule__MIN__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMINAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1827:1: ( ( rule__MIN__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1828:1: ( rule__MIN__Group_1__0 )*
            {
             before(grammarAccess.getMINAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1829:1: ( rule__MIN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1829:2: rule__MIN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3695);
            	    rule__MIN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMINAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MIN__Group__1__Impl"


    // $ANTLR start "rule__MIN__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1840:1: rule__MIN__Group__2 : rule__MIN__Group__2__Impl ;
    public final void rule__MIN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1844:1: ( rule__MIN__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1845:2: rule__MIN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MIN__Group__2__Impl_in_rule__MIN__Group__23728);
            rule__MIN__Group__2__Impl();

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
    // $ANTLR end "rule__MIN__Group__2"


    // $ANTLR start "rule__MIN__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1851:1: rule__MIN__Group__2__Impl : ( ')' ) ;
    public final void rule__MIN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1855:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1856:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1856:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1857:1: ')'
            {
             before(grammarAccess.getMINAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__MIN__Group__2__Impl3756); 
             after(grammarAccess.getMINAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MIN__Group__2__Impl"


    // $ANTLR start "rule__MIN__Group_1__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1876:1: rule__MIN__Group_1__0 : rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1 ;
    public final void rule__MIN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1880:1: ( rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1881:2: rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1
            {
            pushFollow(FOLLOW_rule__MIN__Group_1__0__Impl_in_rule__MIN__Group_1__03793);
            rule__MIN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MIN__Group_1__1_in_rule__MIN__Group_1__03796);
            rule__MIN__Group_1__1();

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
    // $ANTLR end "rule__MIN__Group_1__0"


    // $ANTLR start "rule__MIN__Group_1__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1888:1: rule__MIN__Group_1__0__Impl : ( ( rule__MIN__MeasurementAssignment_1_0 ) ) ;
    public final void rule__MIN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1892:1: ( ( ( rule__MIN__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1893:1: ( ( rule__MIN__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1893:1: ( ( rule__MIN__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1894:1: ( rule__MIN__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getMINAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1895:1: ( rule__MIN__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1895:2: rule__MIN__MeasurementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MIN__MeasurementAssignment_1_0_in_rule__MIN__Group_1__0__Impl3823);
            rule__MIN__MeasurementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMINAccess().getMeasurementAssignment_1_0()); 

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
    // $ANTLR end "rule__MIN__Group_1__0__Impl"


    // $ANTLR start "rule__MIN__Group_1__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1905:1: rule__MIN__Group_1__1 : rule__MIN__Group_1__1__Impl ;
    public final void rule__MIN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1909:1: ( rule__MIN__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1910:2: rule__MIN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MIN__Group_1__1__Impl_in_rule__MIN__Group_1__13853);
            rule__MIN__Group_1__1__Impl();

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
    // $ANTLR end "rule__MIN__Group_1__1"


    // $ANTLR start "rule__MIN__Group_1__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1916:1: rule__MIN__Group_1__1__Impl : ( ',' ) ;
    public final void rule__MIN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1920:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1921:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1921:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1922:1: ','
            {
             before(grammarAccess.getMINAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__MIN__Group_1__1__Impl3881); 
             after(grammarAccess.getMINAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__MIN__Group_1__1__Impl"


    // $ANTLR start "rule__MAX__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1939:1: rule__MAX__Group__0 : rule__MAX__Group__0__Impl rule__MAX__Group__1 ;
    public final void rule__MAX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1943:1: ( rule__MAX__Group__0__Impl rule__MAX__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1944:2: rule__MAX__Group__0__Impl rule__MAX__Group__1
            {
            pushFollow(FOLLOW_rule__MAX__Group__0__Impl_in_rule__MAX__Group__03916);
            rule__MAX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAX__Group__1_in_rule__MAX__Group__03919);
            rule__MAX__Group__1();

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
    // $ANTLR end "rule__MAX__Group__0"


    // $ANTLR start "rule__MAX__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1951:1: rule__MAX__Group__0__Impl : ( 'MAX (' ) ;
    public final void rule__MAX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1955:1: ( ( 'MAX (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1956:1: ( 'MAX (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1956:1: ( 'MAX (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1957:1: 'MAX ('
            {
             before(grammarAccess.getMAXAccess().getMAXKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__MAX__Group__0__Impl3947); 
             after(grammarAccess.getMAXAccess().getMAXKeyword_0()); 

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
    // $ANTLR end "rule__MAX__Group__0__Impl"


    // $ANTLR start "rule__MAX__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1970:1: rule__MAX__Group__1 : rule__MAX__Group__1__Impl rule__MAX__Group__2 ;
    public final void rule__MAX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1974:1: ( rule__MAX__Group__1__Impl rule__MAX__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1975:2: rule__MAX__Group__1__Impl rule__MAX__Group__2
            {
            pushFollow(FOLLOW_rule__MAX__Group__1__Impl_in_rule__MAX__Group__13978);
            rule__MAX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAX__Group__2_in_rule__MAX__Group__13981);
            rule__MAX__Group__2();

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
    // $ANTLR end "rule__MAX__Group__1"


    // $ANTLR start "rule__MAX__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1982:1: rule__MAX__Group__1__Impl : ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) ) ;
    public final void rule__MAX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1986:1: ( ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1987:1: ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1987:1: ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1988:1: ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1988:1: ( ( rule__MAX__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1989:1: ( rule__MAX__Group_1__0 )
            {
             before(grammarAccess.getMAXAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1990:1: ( rule__MAX__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1990:2: rule__MAX__Group_1__0
            {
            pushFollow(FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4010);
            rule__MAX__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMAXAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1993:1: ( ( rule__MAX__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1994:1: ( rule__MAX__Group_1__0 )*
            {
             before(grammarAccess.getMAXAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1995:1: ( rule__MAX__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1995:2: rule__MAX__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4022);
            	    rule__MAX__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMAXAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MAX__Group__1__Impl"


    // $ANTLR start "rule__MAX__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2006:1: rule__MAX__Group__2 : rule__MAX__Group__2__Impl ;
    public final void rule__MAX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2010:1: ( rule__MAX__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2011:2: rule__MAX__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MAX__Group__2__Impl_in_rule__MAX__Group__24055);
            rule__MAX__Group__2__Impl();

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
    // $ANTLR end "rule__MAX__Group__2"


    // $ANTLR start "rule__MAX__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2017:1: rule__MAX__Group__2__Impl : ( ')' ) ;
    public final void rule__MAX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2021:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2022:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2022:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2023:1: ')'
            {
             before(grammarAccess.getMAXAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__MAX__Group__2__Impl4083); 
             after(grammarAccess.getMAXAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MAX__Group__2__Impl"


    // $ANTLR start "rule__MAX__Group_1__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2042:1: rule__MAX__Group_1__0 : rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1 ;
    public final void rule__MAX__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2046:1: ( rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2047:2: rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1
            {
            pushFollow(FOLLOW_rule__MAX__Group_1__0__Impl_in_rule__MAX__Group_1__04120);
            rule__MAX__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAX__Group_1__1_in_rule__MAX__Group_1__04123);
            rule__MAX__Group_1__1();

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
    // $ANTLR end "rule__MAX__Group_1__0"


    // $ANTLR start "rule__MAX__Group_1__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2054:1: rule__MAX__Group_1__0__Impl : ( ( rule__MAX__MeasurementAssignment_1_0 ) ) ;
    public final void rule__MAX__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2058:1: ( ( ( rule__MAX__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2059:1: ( ( rule__MAX__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2059:1: ( ( rule__MAX__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2060:1: ( rule__MAX__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getMAXAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2061:1: ( rule__MAX__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2061:2: rule__MAX__MeasurementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MAX__MeasurementAssignment_1_0_in_rule__MAX__Group_1__0__Impl4150);
            rule__MAX__MeasurementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMAXAccess().getMeasurementAssignment_1_0()); 

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
    // $ANTLR end "rule__MAX__Group_1__0__Impl"


    // $ANTLR start "rule__MAX__Group_1__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2071:1: rule__MAX__Group_1__1 : rule__MAX__Group_1__1__Impl ;
    public final void rule__MAX__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2075:1: ( rule__MAX__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2076:2: rule__MAX__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MAX__Group_1__1__Impl_in_rule__MAX__Group_1__14180);
            rule__MAX__Group_1__1__Impl();

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
    // $ANTLR end "rule__MAX__Group_1__1"


    // $ANTLR start "rule__MAX__Group_1__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2082:1: rule__MAX__Group_1__1__Impl : ( ',' ) ;
    public final void rule__MAX__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2086:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2087:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2087:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2088:1: ','
            {
             before(grammarAccess.getMAXAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__MAX__Group_1__1__Impl4208); 
             after(grammarAccess.getMAXAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__MAX__Group_1__1__Impl"


    // $ANTLR start "rule__QueryAction__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2105:1: rule__QueryAction__Group__0 : rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1 ;
    public final void rule__QueryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2109:1: ( rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2110:2: rule__QueryAction__Group__0__Impl rule__QueryAction__Group__1
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__0__Impl_in_rule__QueryAction__Group__04243);
            rule__QueryAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__1_in_rule__QueryAction__Group__04246);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2117:1: rule__QueryAction__Group__0__Impl : ( 'select feature' ) ;
    public final void rule__QueryAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2121:1: ( ( 'select feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2122:1: ( 'select feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2122:1: ( 'select feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2123:1: 'select feature'
            {
             before(grammarAccess.getQueryActionAccess().getSelectFeatureKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__QueryAction__Group__0__Impl4274); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2136:1: rule__QueryAction__Group__1 : rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2 ;
    public final void rule__QueryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2140:1: ( rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2141:2: rule__QueryAction__Group__1__Impl rule__QueryAction__Group__2
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__1__Impl_in_rule__QueryAction__Group__14305);
            rule__QueryAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__2_in_rule__QueryAction__Group__14308);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2148:1: rule__QueryAction__Group__1__Impl : ( 'with' ) ;
    public final void rule__QueryAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2152:1: ( ( 'with' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2153:1: ( 'with' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2153:1: ( 'with' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2154:1: 'with'
            {
             before(grammarAccess.getQueryActionAccess().getWithKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__QueryAction__Group__1__Impl4336); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2167:1: rule__QueryAction__Group__2 : rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3 ;
    public final void rule__QueryAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2171:1: ( rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2172:2: rule__QueryAction__Group__2__Impl rule__QueryAction__Group__3
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__2__Impl_in_rule__QueryAction__Group__24367);
            rule__QueryAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__3_in_rule__QueryAction__Group__24370);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2179:1: rule__QueryAction__Group__2__Impl : ( ruleMATH_OPERATOR ) ;
    public final void rule__QueryAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2183:1: ( ( ruleMATH_OPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2184:1: ( ruleMATH_OPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2184:1: ( ruleMATH_OPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2185:1: ruleMATH_OPERATOR
            {
             before(grammarAccess.getQueryActionAccess().getMATH_OPERATORParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleMATH_OPERATOR_in_rule__QueryAction__Group__2__Impl4397);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2196:1: rule__QueryAction__Group__3 : rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4 ;
    public final void rule__QueryAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2200:1: ( rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2201:2: rule__QueryAction__Group__3__Impl rule__QueryAction__Group__4
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__3__Impl_in_rule__QueryAction__Group__34426);
            rule__QueryAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__4_in_rule__QueryAction__Group__34429);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2208:1: rule__QueryAction__Group__3__Impl : ( 'attribute' ) ;
    public final void rule__QueryAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2212:1: ( ( 'attribute' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2213:1: ( 'attribute' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2213:1: ( 'attribute' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2214:1: 'attribute'
            {
             before(grammarAccess.getQueryActionAccess().getAttributeKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__QueryAction__Group__3__Impl4457); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2227:1: rule__QueryAction__Group__4 : rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5 ;
    public final void rule__QueryAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2231:1: ( rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2232:2: rule__QueryAction__Group__4__Impl rule__QueryAction__Group__5
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__4__Impl_in_rule__QueryAction__Group__44488);
            rule__QueryAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__5_in_rule__QueryAction__Group__44491);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2239:1: rule__QueryAction__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__QueryAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2243:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2244:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2244:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2245:1: RULE_STRING
            {
             before(grammarAccess.getQueryActionAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QueryAction__Group__4__Impl4518); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2256:1: rule__QueryAction__Group__5 : rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6 ;
    public final void rule__QueryAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2260:1: ( rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2261:2: rule__QueryAction__Group__5__Impl rule__QueryAction__Group__6
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__5__Impl_in_rule__QueryAction__Group__54547);
            rule__QueryAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryAction__Group__6_in_rule__QueryAction__Group__54550);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2268:1: rule__QueryAction__Group__5__Impl : ( 'from feature' ) ;
    public final void rule__QueryAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2272:1: ( ( 'from feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2273:1: ( 'from feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2273:1: ( 'from feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2274:1: 'from feature'
            {
             before(grammarAccess.getQueryActionAccess().getFromFeatureKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__QueryAction__Group__5__Impl4578); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2287:1: rule__QueryAction__Group__6 : rule__QueryAction__Group__6__Impl ;
    public final void rule__QueryAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2291:1: ( rule__QueryAction__Group__6__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2292:2: rule__QueryAction__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__QueryAction__Group__6__Impl_in_rule__QueryAction__Group__64609);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2298:1: rule__QueryAction__Group__6__Impl : ( ( rule__QueryAction__FeatureAssignment_6 ) ) ;
    public final void rule__QueryAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2302:1: ( ( ( rule__QueryAction__FeatureAssignment_6 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2303:1: ( ( rule__QueryAction__FeatureAssignment_6 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2303:1: ( ( rule__QueryAction__FeatureAssignment_6 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2304:1: ( rule__QueryAction__FeatureAssignment_6 )
            {
             before(grammarAccess.getQueryActionAccess().getFeatureAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2305:1: ( rule__QueryAction__FeatureAssignment_6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2305:2: rule__QueryAction__FeatureAssignment_6
            {
            pushFollow(FOLLOW_rule__QueryAction__FeatureAssignment_6_in_rule__QueryAction__Group__6__Impl4636);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2329:1: rule__SelectAction__Group__0 : rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 ;
    public final void rule__SelectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2333:1: ( rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2334:2: rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__04680);
            rule__SelectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__04683);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2341:1: rule__SelectAction__Group__0__Impl : ( 'activate feature' ) ;
    public final void rule__SelectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2345:1: ( ( 'activate feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2346:1: ( 'activate feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2346:1: ( 'activate feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2347:1: 'activate feature'
            {
             before(grammarAccess.getSelectActionAccess().getActivateFeatureKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SelectAction__Group__0__Impl4711); 
             after(grammarAccess.getSelectActionAccess().getActivateFeatureKeyword_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2360:1: rule__SelectAction__Group__1 : rule__SelectAction__Group__1__Impl ;
    public final void rule__SelectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2364:1: ( rule__SelectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2365:2: rule__SelectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__14742);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2371:1: rule__SelectAction__Group__1__Impl : ( ( rule__SelectAction__FeatureAssignment_1 ) ) ;
    public final void rule__SelectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2375:1: ( ( ( rule__SelectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2376:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2376:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2377:1: ( rule__SelectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2378:1: ( rule__SelectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2378:2: rule__SelectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl4769);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2392:1: rule__DeselectAction__Group__0 : rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 ;
    public final void rule__DeselectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2396:1: ( rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2397:2: rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__04803);
            rule__DeselectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__04806);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2404:1: rule__DeselectAction__Group__0__Impl : ( 'deactivate feature' ) ;
    public final void rule__DeselectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2408:1: ( ( 'deactivate feature' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2409:1: ( 'deactivate feature' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2409:1: ( 'deactivate feature' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2410:1: 'deactivate feature'
            {
             before(grammarAccess.getDeselectActionAccess().getDeactivateFeatureKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__DeselectAction__Group__0__Impl4834); 
             after(grammarAccess.getDeselectActionAccess().getDeactivateFeatureKeyword_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2423:1: rule__DeselectAction__Group__1 : rule__DeselectAction__Group__1__Impl ;
    public final void rule__DeselectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2427:1: ( rule__DeselectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2428:2: rule__DeselectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__14865);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2434:1: rule__DeselectAction__Group__1__Impl : ( ( rule__DeselectAction__FeatureAssignment_1 ) ) ;
    public final void rule__DeselectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2438:1: ( ( ( rule__DeselectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2439:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2439:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2440:1: ( rule__DeselectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2441:1: ( rule__DeselectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2441:2: rule__DeselectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl4892);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2455:1: rule__ModifyAttribute__Group__0 : rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 ;
    public final void rule__ModifyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2459:1: ( rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2460:2: rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__04926);
            rule__ModifyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__04929);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2467:1: rule__ModifyAttribute__Group__0__Impl : ( 'set attribute' ) ;
    public final void rule__ModifyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2471:1: ( ( 'set attribute' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2472:1: ( 'set attribute' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2472:1: ( 'set attribute' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2473:1: 'set attribute'
            {
             before(grammarAccess.getModifyAttributeAccess().getSetAttributeKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ModifyAttribute__Group__0__Impl4957); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2486:1: rule__ModifyAttribute__Group__1 : rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 ;
    public final void rule__ModifyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2490:1: ( rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2491:2: rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__14988);
            rule__ModifyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__14991);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2498:1: rule__ModifyAttribute__Group__1__Impl : ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) ;
    public final void rule__ModifyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2502:1: ( ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2503:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2503:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2504:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2505:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2505:2: rule__ModifyAttribute__FeatureAttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl5018);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2515:1: rule__ModifyAttribute__Group__2 : rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 ;
    public final void rule__ModifyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2519:1: ( rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2520:2: rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__25048);
            rule__ModifyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__25051);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2527:1: rule__ModifyAttribute__Group__2__Impl : ( 'with value' ) ;
    public final void rule__ModifyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2531:1: ( ( 'with value' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2532:1: ( 'with value' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2532:1: ( 'with value' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2533:1: 'with value'
            {
             before(grammarAccess.getModifyAttributeAccess().getWithValueKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__ModifyAttribute__Group__2__Impl5079); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2546:1: rule__ModifyAttribute__Group__3 : rule__ModifyAttribute__Group__3__Impl ;
    public final void rule__ModifyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2550:1: ( rule__ModifyAttribute__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2551:2: rule__ModifyAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__35110);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2557:1: rule__ModifyAttribute__Group__3__Impl : ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) ) ;
    public final void rule__ModifyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2561:1: ( ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2562:1: ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2562:1: ( ( rule__ModifyAttribute__AttributeValueAssignment_3 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2563:1: ( rule__ModifyAttribute__AttributeValueAssignment_3 )
            {
             before(grammarAccess.getModifyAttributeAccess().getAttributeValueAssignment_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2564:1: ( rule__ModifyAttribute__AttributeValueAssignment_3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2564:2: rule__ModifyAttribute__AttributeValueAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__AttributeValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl5137);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2583:1: rule__AdaptationModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AdaptationModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2587:1: ( ( ruleImport ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2588:1: ( ruleImport )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2588:1: ( ruleImport )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2589:1: ruleImport
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_05180);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2598:1: rule__AdaptationModel__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__AdaptationModel__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2602:1: ( ( ruleRule ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2603:1: ( ruleRule )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2603:1: ( ruleRule )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2604:1: ruleRule
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_15211);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2613:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2617:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2618:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2618:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2619:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15242); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2628:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2632:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2633:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2633:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2634:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_15273); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2643:1: rule__Rule__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2647:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2648:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2648:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2649:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_45304);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2658:1: rule__Rule__AtomicActionAssignment_6 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2662:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2663:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2663:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2664:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_65335);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2673:1: rule__Rule__ConditionAssignment_7_1_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2677:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2678:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2678:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2679:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_15366);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2688:1: rule__Rule__AtomicActionAssignment_7_2 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2692:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2693:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2693:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2694:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_25397);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2703:1: rule__Condition__MeasurementComparisonAssignment : ( ruleMeasurementComparison ) ;
    public final void rule__Condition__MeasurementComparisonAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2707:1: ( ( ruleMeasurementComparison ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2708:1: ( ruleMeasurementComparison )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2708:1: ( ruleMeasurementComparison )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2709:1: ruleMeasurementComparison
            {
             before(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_rule__Condition__MeasurementComparisonAssignment5428);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2718:1: rule__MeasurementComparison__MeasurementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MeasurementComparison__MeasurementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2722:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2723:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2723:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2724:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2725:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2726:1: ruleQualifiedName
            {
             before(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MeasurementComparison__MeasurementAssignment_05463);
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


    // $ANTLR start "rule__AVG__MeasurementAssignment_1_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2737:1: rule__AVG__MeasurementAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AVG__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2741:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2742:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2742:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2743:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getAVGAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2744:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2745:1: ruleQualifiedName
            {
             before(grammarAccess.getAVGAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AVG__MeasurementAssignment_1_05502);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAVGAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getAVGAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__AVG__MeasurementAssignment_1_0"


    // $ANTLR start "rule__MIN__MeasurementAssignment_1_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2756:1: rule__MIN__MeasurementAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIN__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2760:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2761:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2761:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2762:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMINAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2763:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2764:1: ruleQualifiedName
            {
             before(grammarAccess.getMINAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MIN__MeasurementAssignment_1_05541);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMINAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMINAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__MIN__MeasurementAssignment_1_0"


    // $ANTLR start "rule__MAX__MeasurementAssignment_1_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2775:1: rule__MAX__MeasurementAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MAX__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2779:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2780:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2780:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2781:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMAXAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2782:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2783:1: ruleQualifiedName
            {
             before(grammarAccess.getMAXAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MAX__MeasurementAssignment_1_05580);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMAXAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMAXAccess().getMeasurementContextDependentMeasurementCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__MAX__MeasurementAssignment_1_0"


    // $ANTLR start "rule__QueryAction__FeatureAssignment_6"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2794:1: rule__QueryAction__FeatureAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QueryAction__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2798:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2799:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2799:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2800:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_6_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2801:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2802:1: ruleQualifiedName
            {
             before(grammarAccess.getQueryActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QueryAction__FeatureAssignment_65619);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQueryActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_6_0_1()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2813:1: rule__SelectAction__FeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SelectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2817:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2818:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2818:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2819:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2820:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2821:1: ruleQualifiedName
            {
             before(grammarAccess.getSelectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SelectAction__FeatureAssignment_15658);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSelectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2832:1: rule__DeselectAction__FeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DeselectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2836:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2837:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2837:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2838:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2839:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2840:1: ruleQualifiedName
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DeselectAction__FeatureAssignment_15697);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDeselectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2851:1: rule__ModifyAttribute__FeatureAttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ModifyAttribute__FeatureAttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2855:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2856:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2856:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2857:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2858:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2859:1: ruleQualifiedName
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ModifyAttribute__FeatureAttributeAssignment_15736);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeQualifiedNameParserRuleCall_1_0_1()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2870:1: rule__ModifyAttribute__AttributeValueAssignment_3 : ( ruleAttributeValue ) ;
    public final void rule__ModifyAttribute__AttributeValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2874:1: ( ( ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2875:1: ( ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2875:1: ( ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2876:1: ruleAttributeValue
            {
             before(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__ModifyAttribute__AttributeValueAssignment_35771);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2885:1: rule__StringAttributeValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttributeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2889:1: ( ( RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2890:1: ( RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2890:1: ( RULE_STRING )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2891:1: RULE_STRING
            {
             before(grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringAttributeValue__ValueAssignment5802); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2900:1: rule__NFRAttributeValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__NFRAttributeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2904:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2905:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2905:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2906:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2907:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2908:1: ruleQualifiedName
            {
             before(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NFRAttributeValue__ValueAssignment5837);
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
    public static final BitSet FOLLOW_ruleAVG_in_entryRuleAVG603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAVG610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__0_in_ruleAVG636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIN_in_entryRuleMIN663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMIN670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__0_in_ruleMIN696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAX_in_entryRuleMAX723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAX730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__0_in_ruleMAX756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__0_in_ruleQueryAction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttributeValue__ValueAssignment_in_ruleStringAttributeValue1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NFRAttributeValue__ValueAssignment_in_ruleNFRAttributeValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OPERATOR__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OPERATOR__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OPERATOR__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OPERATOR__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LOGICAL_OPERATOR__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LOGICAL_OPERATOR__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAX_in_rule__MATH_OPERATOR__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIN_in_rule__MATH_OPERATOR__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVG_in_rule__MATH_OPERATOR__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_rule__AtomicAction__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_rule__AttributeValue__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_rule__AttributeValue__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01618 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1648 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1706 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01865 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1951 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rule__Group__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22230 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__2__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group__3__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42354 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52414 = new BitSet(new long[]{0x0000000E20000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rule__Group__5__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62476 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2508 = new BitSet(new long[]{0x0000000E20000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2520 = new BitSet(new long[]{0x0000000E20000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2580 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02627 = new BitSet(new long[]{0x0000000E20200000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group_7__0__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12689 = new BitSet(new long[]{0x0000000E20200000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2719 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2779 = new BitSet(new long[]{0x0000000E20200002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2791 = new BitSet(new long[]{0x0000000E20200002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group_7_1__0__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12892 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rule__Group_7_1__2__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__0__Impl_in_rule__MeasurementComparison__Group__03017 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__1_in_rule__MeasurementComparison__Group__03020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__MeasurementAssignment_0_in_rule__MeasurementComparison__Group__0__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__1__Impl_in_rule__MeasurementComparison__Group__13077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__2_in_rule__MeasurementComparison__Group__13080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_rule__MeasurementComparison__Group__1__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__2__Impl_in_rule__MeasurementComparison__Group__23136 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__3_in_rule__MeasurementComparison__Group__23139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementComparison__Group__2__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementComparison__Group__3__Impl_in_rule__MeasurementComparison__Group__33195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_rule__MeasurementComparison__Group__3__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__0__Impl_in_rule__AVG__Group__03262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AVG__Group__1_in_rule__AVG__Group__03265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AVG__Group__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__1__Impl_in_rule__AVG__Group__13324 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AVG__Group__2_in_rule__AVG__Group__13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3356 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AVG__Group__2__Impl_in_rule__AVG__Group__23401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AVG__Group__2__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0__Impl_in_rule__AVG__Group_1__03466 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__1_in_rule__AVG__Group_1__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__MeasurementAssignment_1_0_in_rule__AVG__Group_1__0__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__1__Impl_in_rule__AVG__Group_1__13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AVG__Group_1__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__0__Impl_in_rule__MIN__Group__03589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MIN__Group__1_in_rule__MIN__Group__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MIN__Group__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__1__Impl_in_rule__MIN__Group__13651 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MIN__Group__2_in_rule__MIN__Group__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3683 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MIN__Group__2__Impl_in_rule__MIN__Group__23728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MIN__Group__2__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0__Impl_in_rule__MIN__Group_1__03793 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__1_in_rule__MIN__Group_1__03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__MeasurementAssignment_1_0_in_rule__MIN__Group_1__0__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__1__Impl_in_rule__MIN__Group_1__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MIN__Group_1__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__0__Impl_in_rule__MAX__Group__03916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MAX__Group__1_in_rule__MAX__Group__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MAX__Group__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__1__Impl_in_rule__MAX__Group__13978 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MAX__Group__2_in_rule__MAX__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4010 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4022 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MAX__Group__2__Impl_in_rule__MAX__Group__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MAX__Group__2__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0__Impl_in_rule__MAX__Group_1__04120 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__1_in_rule__MAX__Group_1__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__MeasurementAssignment_1_0_in_rule__MAX__Group_1__0__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__1__Impl_in_rule__MAX__Group_1__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MAX__Group_1__1__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__0__Impl_in_rule__QueryAction__Group__04243 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__1_in_rule__QueryAction__Group__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QueryAction__Group__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__1__Impl_in_rule__QueryAction__Group__14305 = new BitSet(new long[]{0x0000000019000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__2_in_rule__QueryAction__Group__14308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QueryAction__Group__1__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__2__Impl_in_rule__QueryAction__Group__24367 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__3_in_rule__QueryAction__Group__24370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OPERATOR_in_rule__QueryAction__Group__2__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__3__Impl_in_rule__QueryAction__Group__34426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__4_in_rule__QueryAction__Group__34429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QueryAction__Group__3__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__4__Impl_in_rule__QueryAction__Group__44488 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__5_in_rule__QueryAction__Group__44491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QueryAction__Group__4__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__5__Impl_in_rule__QueryAction__Group__54547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__6_in_rule__QueryAction__Group__54550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QueryAction__Group__5__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__Group__6__Impl_in_rule__QueryAction__Group__64609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryAction__FeatureAssignment_6_in_rule__QueryAction__Group__6__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__04680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__04683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SelectAction__Group__0__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__04803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__04806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DeselectAction__Group__0__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__14865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__04926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ModifyAttribute__Group__0__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__14988 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__25048 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__25051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ModifyAttribute__Group__2__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__35110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__AttributeValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_45304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_65335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_15366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_25397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_rule__Condition__MeasurementComparisonAssignment5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MeasurementComparison__MeasurementAssignment_05463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AVG__MeasurementAssignment_1_05502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MIN__MeasurementAssignment_1_05541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MAX__MeasurementAssignment_1_05580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QueryAction__FeatureAssignment_65619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SelectAction__FeatureAssignment_15658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DeselectAction__FeatureAssignment_15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ModifyAttribute__FeatureAttributeAssignment_15736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__ModifyAttribute__AttributeValueAssignment_35771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAttributeValue__ValueAssignment5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NFRAttributeValue__ValueAssignment5837 = new BitSet(new long[]{0x0000000000000002L});

}