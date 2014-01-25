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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SMALLER", "RULE_BIGGER", "RULE_EQUAL", "RULE_AND", "RULE_OR", "RULE_IMPORT_TERMINAL", "RULE_AS", "RULE_ID", "RULE_RULE_TERMINAL", "RULE_IF", "RULE_THEN", "RULE_ELSE", "RULE_VALUE", "RULE_SELECT", "RULE_DESELECT", "RULE_CHANGE", "RULE_WITH", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'.'", "':'", "'AVG ('", "')'", "','", "'MIN ('", "'MAX ('"
    };
    public static final int RULE_VALUE=16;
    public static final int RULE_ID=11;
    public static final int T__29=29;
    public static final int RULE_THEN=14;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_DESELECT=18;
    public static final int RULE_OR=8;
    public static final int RULE_SELECT=17;
    public static final int RULE_AND=7;
    public static final int RULE_EQUAL=6;
    public static final int RULE_SL_COMMENT=24;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SMALLER=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=22;
    public static final int T__32=32;
    public static final int RULE_BIGGER=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_INT=21;
    public static final int RULE_WITH=20;
    public static final int RULE_WS=25;
    public static final int RULE_IF=13;
    public static final int RULE_RULE_TERMINAL=12;
    public static final int RULE_IMPORT_TERMINAL=9;
    public static final int RULE_ELSE=15;
    public static final int RULE_AS=10;
    public static final int RULE_CHANGE=19;

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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:116:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:117:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:118:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:125:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:129:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:131:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:132:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:145:1: ( ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:172:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:173:1: ( ruleRule EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:174:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule301);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule308); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:181:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:185:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:186:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:186:1: ( ( rule__Rule__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:187:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:188:1: ( rule__Rule__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:188:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule334);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:200:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:201:1: ( ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:202:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition361);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition368); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:209:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:213:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:214:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:214:1: ( ( rule__Condition__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:215:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:216:1: ( rule__Condition__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:216:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition394);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleOPERATOR"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:228:1: entryRuleOPERATOR : ruleOPERATOR EOF ;
    public final void entryRuleOPERATOR() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:229:1: ( ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:230:1: ruleOPERATOR EOF
            {
             before(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR421);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getOPERATORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR428); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:237:1: ruleOPERATOR : ( ( rule__OPERATOR__Alternatives ) ) ;
    public final void ruleOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:241:2: ( ( ( rule__OPERATOR__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:242:1: ( ( rule__OPERATOR__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:242:1: ( ( rule__OPERATOR__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:243:1: ( rule__OPERATOR__Alternatives )
            {
             before(grammarAccess.getOPERATORAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:244:1: ( rule__OPERATOR__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:244:2: rule__OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__OPERATOR__Alternatives_in_ruleOPERATOR454);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:256:1: entryRuleLOGICAL_OPERATOR : ruleLOGICAL_OPERATOR EOF ;
    public final void entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:257:1: ( ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:258:1: ruleLOGICAL_OPERATOR EOF
            {
             before(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR481);
            ruleLOGICAL_OPERATOR();

            state._fsp--;

             after(grammarAccess.getLOGICAL_OPERATORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR488); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:265:1: ruleLOGICAL_OPERATOR : ( ( rule__LOGICAL_OPERATOR__Alternatives ) ) ;
    public final void ruleLOGICAL_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:269:2: ( ( ( rule__LOGICAL_OPERATOR__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:270:1: ( ( rule__LOGICAL_OPERATOR__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:270:1: ( ( rule__LOGICAL_OPERATOR__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:271:1: ( rule__LOGICAL_OPERATOR__Alternatives )
            {
             before(grammarAccess.getLOGICAL_OPERATORAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:272:1: ( rule__LOGICAL_OPERATOR__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:272:2: rule__LOGICAL_OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__LOGICAL_OPERATOR__Alternatives_in_ruleLOGICAL_OPERATOR514);
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


    // $ANTLR start "entryRuleAVG"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:286:1: entryRuleAVG : ruleAVG EOF ;
    public final void entryRuleAVG() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:287:1: ( ruleAVG EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:288:1: ruleAVG EOF
            {
             before(grammarAccess.getAVGRule()); 
            pushFollow(FOLLOW_ruleAVG_in_entryRuleAVG543);
            ruleAVG();

            state._fsp--;

             after(grammarAccess.getAVGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAVG550); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:295:1: ruleAVG : ( ( rule__AVG__Group__0 ) ) ;
    public final void ruleAVG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:299:2: ( ( ( rule__AVG__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:300:1: ( ( rule__AVG__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:300:1: ( ( rule__AVG__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:301:1: ( rule__AVG__Group__0 )
            {
             before(grammarAccess.getAVGAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:302:1: ( rule__AVG__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:302:2: rule__AVG__Group__0
            {
            pushFollow(FOLLOW_rule__AVG__Group__0_in_ruleAVG576);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:314:1: entryRuleMIN : ruleMIN EOF ;
    public final void entryRuleMIN() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:315:1: ( ruleMIN EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:316:1: ruleMIN EOF
            {
             before(grammarAccess.getMINRule()); 
            pushFollow(FOLLOW_ruleMIN_in_entryRuleMIN603);
            ruleMIN();

            state._fsp--;

             after(grammarAccess.getMINRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMIN610); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:323:1: ruleMIN : ( ( rule__MIN__Group__0 ) ) ;
    public final void ruleMIN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:327:2: ( ( ( rule__MIN__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:328:1: ( ( rule__MIN__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:328:1: ( ( rule__MIN__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:329:1: ( rule__MIN__Group__0 )
            {
             before(grammarAccess.getMINAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:330:1: ( rule__MIN__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:330:2: rule__MIN__Group__0
            {
            pushFollow(FOLLOW_rule__MIN__Group__0_in_ruleMIN636);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:342:1: entryRuleMAX : ruleMAX EOF ;
    public final void entryRuleMAX() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:343:1: ( ruleMAX EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:344:1: ruleMAX EOF
            {
             before(grammarAccess.getMAXRule()); 
            pushFollow(FOLLOW_ruleMAX_in_entryRuleMAX663);
            ruleMAX();

            state._fsp--;

             after(grammarAccess.getMAXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAX670); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:351:1: ruleMAX : ( ( rule__MAX__Group__0 ) ) ;
    public final void ruleMAX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:355:2: ( ( ( rule__MAX__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:356:1: ( ( rule__MAX__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:356:1: ( ( rule__MAX__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:357:1: ( rule__MAX__Group__0 )
            {
             before(grammarAccess.getMAXAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:358:1: ( rule__MAX__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:358:2: rule__MAX__Group__0
            {
            pushFollow(FOLLOW_rule__MAX__Group__0_in_ruleMAX696);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:370:1: entryRuleAtomicAction : ruleAtomicAction EOF ;
    public final void entryRuleAtomicAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:371:1: ( ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:372:1: ruleAtomicAction EOF
            {
             before(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction723);
            ruleAtomicAction();

            state._fsp--;

             after(grammarAccess.getAtomicActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction730); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:379:1: ruleAtomicAction : ( ( rule__AtomicAction__Alternatives ) ) ;
    public final void ruleAtomicAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:383:2: ( ( ( rule__AtomicAction__Alternatives ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:384:1: ( ( rule__AtomicAction__Alternatives ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:384:1: ( ( rule__AtomicAction__Alternatives ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:385:1: ( rule__AtomicAction__Alternatives )
            {
             before(grammarAccess.getAtomicActionAccess().getAlternatives()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:386:1: ( rule__AtomicAction__Alternatives )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:386:2: rule__AtomicAction__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction756);
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


    // $ANTLR start "entryRuleSelectAction"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:398:1: entryRuleSelectAction : ruleSelectAction EOF ;
    public final void entryRuleSelectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:399:1: ( ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:400:1: ruleSelectAction EOF
            {
             before(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction783);
            ruleSelectAction();

            state._fsp--;

             after(grammarAccess.getSelectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction790); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:407:1: ruleSelectAction : ( ( rule__SelectAction__Group__0 ) ) ;
    public final void ruleSelectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:411:2: ( ( ( rule__SelectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:412:1: ( ( rule__SelectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:412:1: ( ( rule__SelectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:413:1: ( rule__SelectAction__Group__0 )
            {
             before(grammarAccess.getSelectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:414:1: ( rule__SelectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:414:2: rule__SelectAction__Group__0
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction816);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:426:1: entryRuleDeselectAction : ruleDeselectAction EOF ;
    public final void entryRuleDeselectAction() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:427:1: ( ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:428:1: ruleDeselectAction EOF
            {
             before(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction843);
            ruleDeselectAction();

            state._fsp--;

             after(grammarAccess.getDeselectActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction850); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:435:1: ruleDeselectAction : ( ( rule__DeselectAction__Group__0 ) ) ;
    public final void ruleDeselectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:439:2: ( ( ( rule__DeselectAction__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:440:1: ( ( rule__DeselectAction__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:440:1: ( ( rule__DeselectAction__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:441:1: ( rule__DeselectAction__Group__0 )
            {
             before(grammarAccess.getDeselectActionAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:442:1: ( rule__DeselectAction__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:442:2: rule__DeselectAction__Group__0
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction876);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:454:1: entryRuleModifyAttribute : ruleModifyAttribute EOF ;
    public final void entryRuleModifyAttribute() throws RecognitionException {
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:455:1: ( ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:456:1: ruleModifyAttribute EOF
            {
             before(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute903);
            ruleModifyAttribute();

            state._fsp--;

             after(grammarAccess.getModifyAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute910); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:463:1: ruleModifyAttribute : ( ( rule__ModifyAttribute__Group__0 ) ) ;
    public final void ruleModifyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:467:2: ( ( ( rule__ModifyAttribute__Group__0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:468:1: ( ( rule__ModifyAttribute__Group__0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:468:1: ( ( rule__ModifyAttribute__Group__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:469:1: ( rule__ModifyAttribute__Group__0 )
            {
             before(grammarAccess.getModifyAttributeAccess().getGroup()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:470:1: ( rule__ModifyAttribute__Group__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:470:2: rule__ModifyAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute936);
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


    // $ANTLR start "rule__OPERATOR__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:482:1: rule__OPERATOR__Alternatives : ( ( RULE_SMALLER ) | ( RULE_BIGGER ) | ( RULE_EQUAL ) );
    public final void rule__OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:486:1: ( ( RULE_SMALLER ) | ( RULE_BIGGER ) | ( RULE_EQUAL ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_SMALLER:
                {
                alt1=1;
                }
                break;
            case RULE_BIGGER:
                {
                alt1=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:487:1: ( RULE_SMALLER )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:487:1: ( RULE_SMALLER )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:488:1: RULE_SMALLER
                    {
                     before(grammarAccess.getOPERATORAccess().getSMALLERTerminalRuleCall_0()); 
                    match(input,RULE_SMALLER,FOLLOW_RULE_SMALLER_in_rule__OPERATOR__Alternatives972); 
                     after(grammarAccess.getOPERATORAccess().getSMALLERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:493:6: ( RULE_BIGGER )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:493:6: ( RULE_BIGGER )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:494:1: RULE_BIGGER
                    {
                     before(grammarAccess.getOPERATORAccess().getBIGGERTerminalRuleCall_1()); 
                    match(input,RULE_BIGGER,FOLLOW_RULE_BIGGER_in_rule__OPERATOR__Alternatives989); 
                     after(grammarAccess.getOPERATORAccess().getBIGGERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:499:6: ( RULE_EQUAL )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:499:6: ( RULE_EQUAL )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:500:1: RULE_EQUAL
                    {
                     before(grammarAccess.getOPERATORAccess().getEQUALTerminalRuleCall_2()); 
                    match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__OPERATOR__Alternatives1006); 
                     after(grammarAccess.getOPERATORAccess().getEQUALTerminalRuleCall_2()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:510:1: rule__LOGICAL_OPERATOR__Alternatives : ( ( RULE_AND ) | ( RULE_OR ) );
    public final void rule__LOGICAL_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:514:1: ( ( RULE_AND ) | ( RULE_OR ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_AND) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_OR) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:515:1: ( RULE_AND )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:515:1: ( RULE_AND )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:516:1: RULE_AND
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getANDTerminalRuleCall_0()); 
                    match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__LOGICAL_OPERATOR__Alternatives1038); 
                     after(grammarAccess.getLOGICAL_OPERATORAccess().getANDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:521:6: ( RULE_OR )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:521:6: ( RULE_OR )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:522:1: RULE_OR
                    {
                     before(grammarAccess.getLOGICAL_OPERATORAccess().getORTerminalRuleCall_1()); 
                    match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__LOGICAL_OPERATOR__Alternatives1055); 
                     after(grammarAccess.getLOGICAL_OPERATORAccess().getORTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__AtomicAction__Alternatives"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:533:1: rule__AtomicAction__Alternatives : ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) );
    public final void rule__AtomicAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:537:1: ( ( ruleSelectAction ) | ( ruleDeselectAction ) | ( ruleModifyAttribute ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_SELECT:
                {
                alt3=1;
                }
                break;
            case RULE_DESELECT:
                {
                alt3=2;
                }
                break;
            case RULE_CHANGE:
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
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:538:1: ( ruleSelectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:538:1: ( ruleSelectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:539:1: ruleSelectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1088);
                    ruleSelectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:544:6: ( ruleDeselectAction )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:544:6: ( ruleDeselectAction )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:545:1: ruleDeselectAction
                    {
                     before(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1105);
                    ruleDeselectAction();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:550:6: ( ruleModifyAttribute )
                    {
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:550:6: ( ruleModifyAttribute )
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:551:1: ruleModifyAttribute
                    {
                     before(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1122);
                    ruleModifyAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 

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


    // $ANTLR start "rule__AdaptationModel__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:563:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:567:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:568:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01152);
            rule__AdaptationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01155);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:575:1: rule__AdaptationModel__Group__0__Impl : ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:579:1: ( ( ( rule__AdaptationModel__ImportsAssignment_0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:580:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:580:1: ( ( rule__AdaptationModel__ImportsAssignment_0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:581:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:582:1: ( rule__AdaptationModel__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_IMPORT_TERMINAL) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:582:2: rule__AdaptationModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1182);
            	    rule__AdaptationModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:592:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:596:1: ( rule__AdaptationModel__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:597:2: rule__AdaptationModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11213);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:603:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__RulesAssignment_1 )* ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:607:1: ( ( ( rule__AdaptationModel__RulesAssignment_1 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:608:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:608:1: ( ( rule__AdaptationModel__RulesAssignment_1 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:609:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:610:1: ( rule__AdaptationModel__RulesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_RULE_TERMINAL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:610:2: rule__AdaptationModel__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1240);
            	    rule__AdaptationModel__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:624:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:628:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:629:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01275);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01278);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:636:1: rule__Import__Group__0__Impl : ( RULE_IMPORT_TERMINAL ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:640:1: ( ( RULE_IMPORT_TERMINAL ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:641:1: ( RULE_IMPORT_TERMINAL )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:641:1: ( RULE_IMPORT_TERMINAL )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:642:1: RULE_IMPORT_TERMINAL
            {
             before(grammarAccess.getImportAccess().getIMPORT_TERMINALTerminalRuleCall_0()); 
            match(input,RULE_IMPORT_TERMINAL,FOLLOW_RULE_IMPORT_TERMINAL_in_rule__Import__Group__0__Impl1305); 
             after(grammarAccess.getImportAccess().getIMPORT_TERMINALTerminalRuleCall_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:653:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:657:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:658:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11334);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11337);
            rule__Import__Group__2();

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:665:1: rule__Import__Group__1__Impl : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:669:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:670:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:670:1: ( ruleQualifiedNameWithWildcard )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:671:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getQualifiedNameWithWildcardParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__Group__1__Impl1364);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getQualifiedNameWithWildcardParserRuleCall_1()); 

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


    // $ANTLR start "rule__Import__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:682:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:686:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:687:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21393);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__21396);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:694:1: rule__Import__Group__2__Impl : ( RULE_AS ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:698:1: ( ( RULE_AS ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:699:1: ( RULE_AS )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:699:1: ( RULE_AS )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:700:1: RULE_AS
            {
             before(grammarAccess.getImportAccess().getASTerminalRuleCall_2()); 
            match(input,RULE_AS,FOLLOW_RULE_AS_in_rule__Import__Group__2__Impl1423); 
             after(grammarAccess.getImportAccess().getASTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:711:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:715:1: ( rule__Import__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:716:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__31452);
            rule__Import__Group__3__Impl();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:722:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:726:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:727:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:727:1: ( ( rule__Import__NameAssignment_3 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:728:1: ( rule__Import__NameAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:1: ( rule__Import__NameAssignment_3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:729:2: rule__Import__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Import__NameAssignment_3_in_rule__Import__Group__3__Impl1479);
            rule__Import__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:747:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:751:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:752:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01517);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01520);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:759:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:763:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:764:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:764:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:765:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1547);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:776:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:780:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:781:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11576);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:787:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:791:1: ( ( ( '.*' )? ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:792:1: ( ( '.*' )? )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:792:1: ( ( '.*' )? )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:793:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:794:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:795:2: '.*'
                    {
                    match(input,27,FOLLOW_27_in_rule__QualifiedNameWithWildcard__Group__1__Impl1605); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:810:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:814:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:815:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01642);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01645);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:822:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:826:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:827:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:827:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:828:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1672); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:839:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:843:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:844:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11701);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:850:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:854:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:855:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:855:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:856:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:857:1: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:857:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1728);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:871:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:875:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:876:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01763);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01766);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:883:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:887:1: ( ( '.' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:888:1: ( '.' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:888:1: ( '.' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:889:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl1794); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:902:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:906:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:907:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11825);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:913:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:917:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:918:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:918:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:919:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1852); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:934:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:938:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:939:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01885);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01888);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:946:1: rule__Rule__Group__0__Impl : ( RULE_RULE_TERMINAL ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:950:1: ( ( RULE_RULE_TERMINAL ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:951:1: ( RULE_RULE_TERMINAL )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:951:1: ( RULE_RULE_TERMINAL )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:952:1: RULE_RULE_TERMINAL
            {
             before(grammarAccess.getRuleAccess().getRULE_TERMINALTerminalRuleCall_0()); 
            match(input,RULE_RULE_TERMINAL,FOLLOW_RULE_RULE_TERMINAL_in_rule__Rule__Group__0__Impl1915); 
             after(grammarAccess.getRuleAccess().getRULE_TERMINALTerminalRuleCall_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:963:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:967:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:968:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11944);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11947);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:975:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:979:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:980:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:980:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:981:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:982:1: ( rule__Rule__NameAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:982:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1974);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:992:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:996:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:997:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22004);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22007);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1004:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1008:1: ( ( ':' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( ':' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1009:1: ( ':' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1010:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Rule__Group__2__Impl2035); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1023:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1027:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1028:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32066);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32069);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1035:1: rule__Rule__Group__3__Impl : ( RULE_IF ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1039:1: ( ( RULE_IF ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1040:1: ( RULE_IF )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1040:1: ( RULE_IF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1041:1: RULE_IF
            {
             before(grammarAccess.getRuleAccess().getIFTerminalRuleCall_3()); 
            match(input,RULE_IF,FOLLOW_RULE_IF_in_rule__Rule__Group__3__Impl2096); 
             after(grammarAccess.getRuleAccess().getIFTerminalRuleCall_3()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1052:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1056:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1057:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42125);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42128);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1064:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ConditionAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1068:1: ( ( ( rule__Rule__ConditionAssignment_4 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1069:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1069:1: ( ( rule__Rule__ConditionAssignment_4 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1070:1: ( rule__Rule__ConditionAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_4()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1071:1: ( rule__Rule__ConditionAssignment_4 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1071:2: rule__Rule__ConditionAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2155);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1081:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1085:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1086:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52185);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52188);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1093:1: rule__Rule__Group__5__Impl : ( RULE_THEN ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1097:1: ( ( RULE_THEN ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1098:1: ( RULE_THEN )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1098:1: ( RULE_THEN )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1099:1: RULE_THEN
            {
             before(grammarAccess.getRuleAccess().getTHENTerminalRuleCall_5()); 
            match(input,RULE_THEN,FOLLOW_RULE_THEN_in_rule__Rule__Group__5__Impl2215); 
             after(grammarAccess.getRuleAccess().getTHENTerminalRuleCall_5()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1110:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1114:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1115:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62244);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62247);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1122:1: rule__Rule__Group__6__Impl : ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1126:1: ( ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1127:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1127:1: ( ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1128:1: ( ( rule__Rule__AtomicActionAssignment_6 ) ) ( ( rule__Rule__AtomicActionAssignment_6 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1128:1: ( ( rule__Rule__AtomicActionAssignment_6 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1129:1: ( rule__Rule__AtomicActionAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1130:1: ( rule__Rule__AtomicActionAssignment_6 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1130:2: rule__Rule__AtomicActionAssignment_6
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2276);
            rule__Rule__AtomicActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1133:1: ( ( rule__Rule__AtomicActionAssignment_6 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1134:1: ( rule__Rule__AtomicActionAssignment_6 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_6()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1135:1: ( rule__Rule__AtomicActionAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_SELECT && LA8_0<=RULE_CHANGE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1135:2: rule__Rule__AtomicActionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2288);
            	    rule__Rule__AtomicActionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1146:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1150:1: ( rule__Rule__Group__7__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1151:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72321);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1157:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1161:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1162:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1162:1: ( ( rule__Rule__Group_7__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1163:1: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1164:1: ( rule__Rule__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ELSE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1164:2: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2348);
            	    rule__Rule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1190:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1194:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1195:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02395);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02398);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1202:1: rule__Rule__Group_7__0__Impl : ( RULE_ELSE ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1206:1: ( ( RULE_ELSE ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1207:1: ( RULE_ELSE )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1207:1: ( RULE_ELSE )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1208:1: RULE_ELSE
            {
             before(grammarAccess.getRuleAccess().getELSETerminalRuleCall_7_0()); 
            match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_rule__Rule__Group_7__0__Impl2425); 
             after(grammarAccess.getRuleAccess().getELSETerminalRuleCall_7_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1219:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1223:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1224:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12454);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12457);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1231:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Group_7_1__0 )* ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1235:1: ( ( ( rule__Rule__Group_7_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1236:1: ( ( rule__Rule__Group_7_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1236:1: ( ( rule__Rule__Group_7_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1237:1: ( rule__Rule__Group_7_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1238:1: ( rule__Rule__Group_7_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IF) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1238:2: rule__Rule__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2484);
            	    rule__Rule__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1248:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1252:1: ( rule__Rule__Group_7__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1253:2: rule__Rule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22515);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1259:1: rule__Rule__Group_7__2__Impl : ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1263:1: ( ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1264:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1264:1: ( ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1265:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) ) ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1265:1: ( ( rule__Rule__AtomicActionAssignment_7_2 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1266:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1267:1: ( rule__Rule__AtomicActionAssignment_7_2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1267:2: rule__Rule__AtomicActionAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2544);
            rule__Rule__AtomicActionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1270:1: ( ( rule__Rule__AtomicActionAssignment_7_2 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1271:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1272:1: ( rule__Rule__AtomicActionAssignment_7_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_SELECT && LA11_0<=RULE_CHANGE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1272:2: rule__Rule__AtomicActionAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2556);
            	    rule__Rule__AtomicActionAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1289:1: rule__Rule__Group_7_1__0 : rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 ;
    public final void rule__Rule__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1293:1: ( rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1294:2: rule__Rule__Group_7_1__0__Impl rule__Rule__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02595);
            rule__Rule__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02598);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1301:1: rule__Rule__Group_7_1__0__Impl : ( RULE_IF ) ;
    public final void rule__Rule__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1305:1: ( ( RULE_IF ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1306:1: ( RULE_IF )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1306:1: ( RULE_IF )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1307:1: RULE_IF
            {
             before(grammarAccess.getRuleAccess().getIFTerminalRuleCall_7_1_0()); 
            match(input,RULE_IF,FOLLOW_RULE_IF_in_rule__Rule__Group_7_1__0__Impl2625); 
             after(grammarAccess.getRuleAccess().getIFTerminalRuleCall_7_1_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1318:1: rule__Rule__Group_7_1__1 : rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 ;
    public final void rule__Rule__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1322:1: ( rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1323:2: rule__Rule__Group_7_1__1__Impl rule__Rule__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12654);
            rule__Rule__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12657);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1330:1: rule__Rule__Group_7_1__1__Impl : ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) ;
    public final void rule__Rule__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1334:1: ( ( ( rule__Rule__ConditionAssignment_7_1_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1335:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1335:1: ( ( rule__Rule__ConditionAssignment_7_1_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1336:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_7_1_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1337:1: ( rule__Rule__ConditionAssignment_7_1_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1337:2: rule__Rule__ConditionAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2684);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1347:1: rule__Rule__Group_7_1__2 : rule__Rule__Group_7_1__2__Impl ;
    public final void rule__Rule__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1351:1: ( rule__Rule__Group_7_1__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1352:2: rule__Rule__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22714);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1358:1: rule__Rule__Group_7_1__2__Impl : ( RULE_THEN ) ;
    public final void rule__Rule__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1362:1: ( ( RULE_THEN ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1363:1: ( RULE_THEN )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1363:1: ( RULE_THEN )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1364:1: RULE_THEN
            {
             before(grammarAccess.getRuleAccess().getTHENTerminalRuleCall_7_1_2()); 
            match(input,RULE_THEN,FOLLOW_RULE_THEN_in_rule__Rule__Group_7_1__2__Impl2741); 
             after(grammarAccess.getRuleAccess().getTHENTerminalRuleCall_7_1_2()); 

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


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1381:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1385:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1386:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02776);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02779);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1393:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__MeasurementAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1397:1: ( ( ( rule__Condition__MeasurementAssignment_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1398:1: ( ( rule__Condition__MeasurementAssignment_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1398:1: ( ( rule__Condition__MeasurementAssignment_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1399:1: ( rule__Condition__MeasurementAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getMeasurementAssignment_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1400:1: ( rule__Condition__MeasurementAssignment_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1400:2: rule__Condition__MeasurementAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__MeasurementAssignment_0_in_rule__Condition__Group__0__Impl2806);
            rule__Condition__MeasurementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getMeasurementAssignment_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1410:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1414:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1415:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12836);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12839);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1422:1: rule__Condition__Group__1__Impl : ( ruleOPERATOR ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1426:1: ( ( ruleOPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1427:1: ( ruleOPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1427:1: ( ruleOPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1428:1: ruleOPERATOR
            {
             before(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_rule__Condition__Group__1__Impl2866);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1439:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1443:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1444:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22895);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__22898);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1451:1: rule__Condition__Group__2__Impl : ( RULE_VALUE ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1455:1: ( ( RULE_VALUE ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1456:1: ( RULE_VALUE )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1456:1: ( RULE_VALUE )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1457:1: RULE_VALUE
            {
             before(grammarAccess.getConditionAccess().getVALUETerminalRuleCall_2()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__Condition__Group__2__Impl2925); 
             after(grammarAccess.getConditionAccess().getVALUETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1468:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1472:1: ( rule__Condition__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1473:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__32954);
            rule__Condition__Group__3__Impl();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1479:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )* ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1483:1: ( ( ( rule__Condition__Group_3__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1484:1: ( ( rule__Condition__Group_3__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1484:1: ( ( rule__Condition__Group_3__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1485:1: ( rule__Condition__Group_3__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1486:1: ( rule__Condition__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_AND && LA12_0<=RULE_OR)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1486:2: rule__Condition__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl2981);
            	    rule__Condition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group_3__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1504:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
    public final void rule__Condition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1508:1: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1509:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__03020);
            rule__Condition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__03023);
            rule__Condition__Group_3__1();

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
    // $ANTLR end "rule__Condition__Group_3__0"


    // $ANTLR start "rule__Condition__Group_3__0__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1516:1: rule__Condition__Group_3__0__Impl : ( ruleLOGICAL_OPERATOR ) ;
    public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1520:1: ( ( ruleLOGICAL_OPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1521:1: ( ruleLOGICAL_OPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1521:1: ( ruleLOGICAL_OPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1522:1: ruleLOGICAL_OPERATOR
            {
             before(grammarAccess.getConditionAccess().getLOGICAL_OPERATORParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_rule__Condition__Group_3__0__Impl3050);
            ruleLOGICAL_OPERATOR();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLOGICAL_OPERATORParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Condition__Group_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_3__1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1533:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 ;
    public final void rule__Condition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1537:1: ( rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1538:2: rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__13079);
            rule__Condition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_3__2_in_rule__Condition__Group_3__13082);
            rule__Condition__Group_3__2();

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
    // $ANTLR end "rule__Condition__Group_3__1"


    // $ANTLR start "rule__Condition__Group_3__1__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1545:1: rule__Condition__Group_3__1__Impl : ( ( rule__Condition__MeasAssignment_3_1 ) ) ;
    public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1549:1: ( ( ( rule__Condition__MeasAssignment_3_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1550:1: ( ( rule__Condition__MeasAssignment_3_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1550:1: ( ( rule__Condition__MeasAssignment_3_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1551:1: ( rule__Condition__MeasAssignment_3_1 )
            {
             before(grammarAccess.getConditionAccess().getMeasAssignment_3_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1552:1: ( rule__Condition__MeasAssignment_3_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1552:2: rule__Condition__MeasAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Condition__MeasAssignment_3_1_in_rule__Condition__Group_3__1__Impl3109);
            rule__Condition__MeasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getMeasAssignment_3_1()); 

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
    // $ANTLR end "rule__Condition__Group_3__1__Impl"


    // $ANTLR start "rule__Condition__Group_3__2"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1562:1: rule__Condition__Group_3__2 : rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3 ;
    public final void rule__Condition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1566:1: ( rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1567:2: rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__2__Impl_in_rule__Condition__Group_3__23139);
            rule__Condition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_3__3_in_rule__Condition__Group_3__23142);
            rule__Condition__Group_3__3();

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
    // $ANTLR end "rule__Condition__Group_3__2"


    // $ANTLR start "rule__Condition__Group_3__2__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1574:1: rule__Condition__Group_3__2__Impl : ( ruleOPERATOR ) ;
    public final void rule__Condition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1578:1: ( ( ruleOPERATOR ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1579:1: ( ruleOPERATOR )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1579:1: ( ruleOPERATOR )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1580:1: ruleOPERATOR
            {
             before(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_3_2()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_rule__Condition__Group_3__2__Impl3169);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_3_2()); 

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
    // $ANTLR end "rule__Condition__Group_3__2__Impl"


    // $ANTLR start "rule__Condition__Group_3__3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1591:1: rule__Condition__Group_3__3 : rule__Condition__Group_3__3__Impl ;
    public final void rule__Condition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1595:1: ( rule__Condition__Group_3__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1596:2: rule__Condition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__3__Impl_in_rule__Condition__Group_3__33198);
            rule__Condition__Group_3__3__Impl();

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
    // $ANTLR end "rule__Condition__Group_3__3"


    // $ANTLR start "rule__Condition__Group_3__3__Impl"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1602:1: rule__Condition__Group_3__3__Impl : ( RULE_VALUE ) ;
    public final void rule__Condition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1606:1: ( ( RULE_VALUE ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1607:1: ( RULE_VALUE )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1607:1: ( RULE_VALUE )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1608:1: RULE_VALUE
            {
             before(grammarAccess.getConditionAccess().getVALUETerminalRuleCall_3_3()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__Condition__Group_3__3__Impl3225); 
             after(grammarAccess.getConditionAccess().getVALUETerminalRuleCall_3_3()); 

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
    // $ANTLR end "rule__Condition__Group_3__3__Impl"


    // $ANTLR start "rule__AVG__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1627:1: rule__AVG__Group__0 : rule__AVG__Group__0__Impl rule__AVG__Group__1 ;
    public final void rule__AVG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1631:1: ( rule__AVG__Group__0__Impl rule__AVG__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1632:2: rule__AVG__Group__0__Impl rule__AVG__Group__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1639:1: rule__AVG__Group__0__Impl : ( 'AVG (' ) ;
    public final void rule__AVG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1643:1: ( ( 'AVG (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1644:1: ( 'AVG (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1644:1: ( 'AVG (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1645:1: 'AVG ('
            {
             before(grammarAccess.getAVGAccess().getAVGKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AVG__Group__0__Impl3293); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1658:1: rule__AVG__Group__1 : rule__AVG__Group__1__Impl rule__AVG__Group__2 ;
    public final void rule__AVG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1662:1: ( rule__AVG__Group__1__Impl rule__AVG__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1663:2: rule__AVG__Group__1__Impl rule__AVG__Group__2
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1670:1: rule__AVG__Group__1__Impl : ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) ) ;
    public final void rule__AVG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1674:1: ( ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1675:1: ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1675:1: ( ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1676:1: ( ( rule__AVG__Group_1__0 ) ) ( ( rule__AVG__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1676:1: ( ( rule__AVG__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1677:1: ( rule__AVG__Group_1__0 )
            {
             before(grammarAccess.getAVGAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1678:1: ( rule__AVG__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1678:2: rule__AVG__Group_1__0
            {
            pushFollow(FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3356);
            rule__AVG__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAVGAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1681:1: ( ( rule__AVG__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1682:1: ( rule__AVG__Group_1__0 )*
            {
             before(grammarAccess.getAVGAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1683:1: ( rule__AVG__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1683:2: rule__AVG__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3368);
            	    rule__AVG__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1694:1: rule__AVG__Group__2 : rule__AVG__Group__2__Impl ;
    public final void rule__AVG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1698:1: ( rule__AVG__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1699:2: rule__AVG__Group__2__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1705:1: rule__AVG__Group__2__Impl : ( ')' ) ;
    public final void rule__AVG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1709:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1710:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1710:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1711:1: ')'
            {
             before(grammarAccess.getAVGAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AVG__Group__2__Impl3429); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1730:1: rule__AVG__Group_1__0 : rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1 ;
    public final void rule__AVG__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1734:1: ( rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1735:2: rule__AVG__Group_1__0__Impl rule__AVG__Group_1__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1742:1: rule__AVG__Group_1__0__Impl : ( ( rule__AVG__MeasurementAssignment_1_0 ) ) ;
    public final void rule__AVG__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1746:1: ( ( ( rule__AVG__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1747:1: ( ( rule__AVG__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1747:1: ( ( rule__AVG__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1748:1: ( rule__AVG__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getAVGAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1749:1: ( rule__AVG__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1749:2: rule__AVG__MeasurementAssignment_1_0
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1759:1: rule__AVG__Group_1__1 : rule__AVG__Group_1__1__Impl ;
    public final void rule__AVG__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1763:1: ( rule__AVG__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1764:2: rule__AVG__Group_1__1__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1770:1: rule__AVG__Group_1__1__Impl : ( ',' ) ;
    public final void rule__AVG__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1774:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1775:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1775:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1776:1: ','
            {
             before(grammarAccess.getAVGAccess().getCommaKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__AVG__Group_1__1__Impl3554); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1793:1: rule__MIN__Group__0 : rule__MIN__Group__0__Impl rule__MIN__Group__1 ;
    public final void rule__MIN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1797:1: ( rule__MIN__Group__0__Impl rule__MIN__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1798:2: rule__MIN__Group__0__Impl rule__MIN__Group__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1805:1: rule__MIN__Group__0__Impl : ( 'MIN (' ) ;
    public final void rule__MIN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1809:1: ( ( 'MIN (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1810:1: ( 'MIN (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1810:1: ( 'MIN (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1811:1: 'MIN ('
            {
             before(grammarAccess.getMINAccess().getMINKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__MIN__Group__0__Impl3620); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1824:1: rule__MIN__Group__1 : rule__MIN__Group__1__Impl rule__MIN__Group__2 ;
    public final void rule__MIN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1828:1: ( rule__MIN__Group__1__Impl rule__MIN__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1829:2: rule__MIN__Group__1__Impl rule__MIN__Group__2
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1836:1: rule__MIN__Group__1__Impl : ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) ) ;
    public final void rule__MIN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1840:1: ( ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1841:1: ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1841:1: ( ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1842:1: ( ( rule__MIN__Group_1__0 ) ) ( ( rule__MIN__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1842:1: ( ( rule__MIN__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1843:1: ( rule__MIN__Group_1__0 )
            {
             before(grammarAccess.getMINAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1844:1: ( rule__MIN__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1844:2: rule__MIN__Group_1__0
            {
            pushFollow(FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3683);
            rule__MIN__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMINAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1847:1: ( ( rule__MIN__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1848:1: ( rule__MIN__Group_1__0 )*
            {
             before(grammarAccess.getMINAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1849:1: ( rule__MIN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1849:2: rule__MIN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3695);
            	    rule__MIN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1860:1: rule__MIN__Group__2 : rule__MIN__Group__2__Impl ;
    public final void rule__MIN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1864:1: ( rule__MIN__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1865:2: rule__MIN__Group__2__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1871:1: rule__MIN__Group__2__Impl : ( ')' ) ;
    public final void rule__MIN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1875:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1876:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1876:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1877:1: ')'
            {
             before(grammarAccess.getMINAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__MIN__Group__2__Impl3756); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1896:1: rule__MIN__Group_1__0 : rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1 ;
    public final void rule__MIN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1900:1: ( rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1901:2: rule__MIN__Group_1__0__Impl rule__MIN__Group_1__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1908:1: rule__MIN__Group_1__0__Impl : ( ( rule__MIN__MeasurementAssignment_1_0 ) ) ;
    public final void rule__MIN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1912:1: ( ( ( rule__MIN__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1913:1: ( ( rule__MIN__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1913:1: ( ( rule__MIN__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1914:1: ( rule__MIN__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getMINAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1915:1: ( rule__MIN__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1915:2: rule__MIN__MeasurementAssignment_1_0
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1925:1: rule__MIN__Group_1__1 : rule__MIN__Group_1__1__Impl ;
    public final void rule__MIN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1929:1: ( rule__MIN__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1930:2: rule__MIN__Group_1__1__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1936:1: rule__MIN__Group_1__1__Impl : ( ',' ) ;
    public final void rule__MIN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1940:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1941:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1941:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1942:1: ','
            {
             before(grammarAccess.getMINAccess().getCommaKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__MIN__Group_1__1__Impl3881); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1959:1: rule__MAX__Group__0 : rule__MAX__Group__0__Impl rule__MAX__Group__1 ;
    public final void rule__MAX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1963:1: ( rule__MAX__Group__0__Impl rule__MAX__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1964:2: rule__MAX__Group__0__Impl rule__MAX__Group__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1971:1: rule__MAX__Group__0__Impl : ( 'MAX (' ) ;
    public final void rule__MAX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1975:1: ( ( 'MAX (' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1976:1: ( 'MAX (' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1976:1: ( 'MAX (' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1977:1: 'MAX ('
            {
             before(grammarAccess.getMAXAccess().getMAXKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__MAX__Group__0__Impl3947); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1990:1: rule__MAX__Group__1 : rule__MAX__Group__1__Impl rule__MAX__Group__2 ;
    public final void rule__MAX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1994:1: ( rule__MAX__Group__1__Impl rule__MAX__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:1995:2: rule__MAX__Group__1__Impl rule__MAX__Group__2
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2002:1: rule__MAX__Group__1__Impl : ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) ) ;
    public final void rule__MAX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2006:1: ( ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2007:1: ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2007:1: ( ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2008:1: ( ( rule__MAX__Group_1__0 ) ) ( ( rule__MAX__Group_1__0 )* )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2008:1: ( ( rule__MAX__Group_1__0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2009:1: ( rule__MAX__Group_1__0 )
            {
             before(grammarAccess.getMAXAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2010:1: ( rule__MAX__Group_1__0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2010:2: rule__MAX__Group_1__0
            {
            pushFollow(FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4010);
            rule__MAX__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMAXAccess().getGroup_1()); 

            }

            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2013:1: ( ( rule__MAX__Group_1__0 )* )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2014:1: ( rule__MAX__Group_1__0 )*
            {
             before(grammarAccess.getMAXAccess().getGroup_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2015:1: ( rule__MAX__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2015:2: rule__MAX__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4022);
            	    rule__MAX__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2026:1: rule__MAX__Group__2 : rule__MAX__Group__2__Impl ;
    public final void rule__MAX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2030:1: ( rule__MAX__Group__2__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2031:2: rule__MAX__Group__2__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2037:1: rule__MAX__Group__2__Impl : ( ')' ) ;
    public final void rule__MAX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2041:1: ( ( ')' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2042:1: ( ')' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2042:1: ( ')' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2043:1: ')'
            {
             before(grammarAccess.getMAXAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__MAX__Group__2__Impl4083); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2062:1: rule__MAX__Group_1__0 : rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1 ;
    public final void rule__MAX__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2066:1: ( rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2067:2: rule__MAX__Group_1__0__Impl rule__MAX__Group_1__1
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2074:1: rule__MAX__Group_1__0__Impl : ( ( rule__MAX__MeasurementAssignment_1_0 ) ) ;
    public final void rule__MAX__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2078:1: ( ( ( rule__MAX__MeasurementAssignment_1_0 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2079:1: ( ( rule__MAX__MeasurementAssignment_1_0 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2079:1: ( ( rule__MAX__MeasurementAssignment_1_0 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2080:1: ( rule__MAX__MeasurementAssignment_1_0 )
            {
             before(grammarAccess.getMAXAccess().getMeasurementAssignment_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2081:1: ( rule__MAX__MeasurementAssignment_1_0 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2081:2: rule__MAX__MeasurementAssignment_1_0
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2091:1: rule__MAX__Group_1__1 : rule__MAX__Group_1__1__Impl ;
    public final void rule__MAX__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2095:1: ( rule__MAX__Group_1__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2096:2: rule__MAX__Group_1__1__Impl
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2102:1: rule__MAX__Group_1__1__Impl : ( ',' ) ;
    public final void rule__MAX__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2106:1: ( ( ',' ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2107:1: ( ',' )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2107:1: ( ',' )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2108:1: ','
            {
             before(grammarAccess.getMAXAccess().getCommaKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__MAX__Group_1__1__Impl4208); 
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


    // $ANTLR start "rule__SelectAction__Group__0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2125:1: rule__SelectAction__Group__0 : rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 ;
    public final void rule__SelectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2129:1: ( rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2130:2: rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__04243);
            rule__SelectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__04246);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2137:1: rule__SelectAction__Group__0__Impl : ( RULE_SELECT ) ;
    public final void rule__SelectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2141:1: ( ( RULE_SELECT ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2142:1: ( RULE_SELECT )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2142:1: ( RULE_SELECT )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2143:1: RULE_SELECT
            {
             before(grammarAccess.getSelectActionAccess().getSELECTTerminalRuleCall_0()); 
            match(input,RULE_SELECT,FOLLOW_RULE_SELECT_in_rule__SelectAction__Group__0__Impl4273); 
             after(grammarAccess.getSelectActionAccess().getSELECTTerminalRuleCall_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2154:1: rule__SelectAction__Group__1 : rule__SelectAction__Group__1__Impl ;
    public final void rule__SelectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2158:1: ( rule__SelectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2159:2: rule__SelectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__14302);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2165:1: rule__SelectAction__Group__1__Impl : ( ( rule__SelectAction__FeatureAssignment_1 ) ) ;
    public final void rule__SelectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2169:1: ( ( ( rule__SelectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2170:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2170:1: ( ( rule__SelectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2171:1: ( rule__SelectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2172:1: ( rule__SelectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2172:2: rule__SelectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl4329);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2186:1: rule__DeselectAction__Group__0 : rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 ;
    public final void rule__DeselectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2190:1: ( rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2191:2: rule__DeselectAction__Group__0__Impl rule__DeselectAction__Group__1
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__04363);
            rule__DeselectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__04366);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2198:1: rule__DeselectAction__Group__0__Impl : ( RULE_DESELECT ) ;
    public final void rule__DeselectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2202:1: ( ( RULE_DESELECT ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2203:1: ( RULE_DESELECT )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2203:1: ( RULE_DESELECT )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2204:1: RULE_DESELECT
            {
             before(grammarAccess.getDeselectActionAccess().getDESELECTTerminalRuleCall_0()); 
            match(input,RULE_DESELECT,FOLLOW_RULE_DESELECT_in_rule__DeselectAction__Group__0__Impl4393); 
             after(grammarAccess.getDeselectActionAccess().getDESELECTTerminalRuleCall_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2215:1: rule__DeselectAction__Group__1 : rule__DeselectAction__Group__1__Impl ;
    public final void rule__DeselectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2219:1: ( rule__DeselectAction__Group__1__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2220:2: rule__DeselectAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__14422);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2226:1: rule__DeselectAction__Group__1__Impl : ( ( rule__DeselectAction__FeatureAssignment_1 ) ) ;
    public final void rule__DeselectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2230:1: ( ( ( rule__DeselectAction__FeatureAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2231:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2231:1: ( ( rule__DeselectAction__FeatureAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2232:1: ( rule__DeselectAction__FeatureAssignment_1 )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2233:1: ( rule__DeselectAction__FeatureAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2233:2: rule__DeselectAction__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl4449);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2247:1: rule__ModifyAttribute__Group__0 : rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 ;
    public final void rule__ModifyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2251:1: ( rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2252:2: rule__ModifyAttribute__Group__0__Impl rule__ModifyAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__04483);
            rule__ModifyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__04486);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2259:1: rule__ModifyAttribute__Group__0__Impl : ( RULE_CHANGE ) ;
    public final void rule__ModifyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2263:1: ( ( RULE_CHANGE ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2264:1: ( RULE_CHANGE )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2264:1: ( RULE_CHANGE )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2265:1: RULE_CHANGE
            {
             before(grammarAccess.getModifyAttributeAccess().getCHANGETerminalRuleCall_0()); 
            match(input,RULE_CHANGE,FOLLOW_RULE_CHANGE_in_rule__ModifyAttribute__Group__0__Impl4513); 
             after(grammarAccess.getModifyAttributeAccess().getCHANGETerminalRuleCall_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2276:1: rule__ModifyAttribute__Group__1 : rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 ;
    public final void rule__ModifyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2280:1: ( rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2281:2: rule__ModifyAttribute__Group__1__Impl rule__ModifyAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__14542);
            rule__ModifyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__14545);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2288:1: rule__ModifyAttribute__Group__1__Impl : ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) ;
    public final void rule__ModifyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2292:1: ( ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2293:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2293:1: ( ( rule__ModifyAttribute__FeatureAttributeAssignment_1 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2294:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeAssignment_1()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2295:1: ( rule__ModifyAttribute__FeatureAttributeAssignment_1 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2295:2: rule__ModifyAttribute__FeatureAttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl4572);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2305:1: rule__ModifyAttribute__Group__2 : rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 ;
    public final void rule__ModifyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2309:1: ( rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2310:2: rule__ModifyAttribute__Group__2__Impl rule__ModifyAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__24602);
            rule__ModifyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__24605);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2317:1: rule__ModifyAttribute__Group__2__Impl : ( RULE_WITH ) ;
    public final void rule__ModifyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2321:1: ( ( RULE_WITH ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2322:1: ( RULE_WITH )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2322:1: ( RULE_WITH )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2323:1: RULE_WITH
            {
             before(grammarAccess.getModifyAttributeAccess().getWITHTerminalRuleCall_2()); 
            match(input,RULE_WITH,FOLLOW_RULE_WITH_in_rule__ModifyAttribute__Group__2__Impl4632); 
             after(grammarAccess.getModifyAttributeAccess().getWITHTerminalRuleCall_2()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2334:1: rule__ModifyAttribute__Group__3 : rule__ModifyAttribute__Group__3__Impl ;
    public final void rule__ModifyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2338:1: ( rule__ModifyAttribute__Group__3__Impl )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2339:2: rule__ModifyAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__34661);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2345:1: rule__ModifyAttribute__Group__3__Impl : ( ( rule__ModifyAttribute__ValueAssignment_3 ) ) ;
    public final void rule__ModifyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2349:1: ( ( ( rule__ModifyAttribute__ValueAssignment_3 ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2350:1: ( ( rule__ModifyAttribute__ValueAssignment_3 ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2350:1: ( ( rule__ModifyAttribute__ValueAssignment_3 ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2351:1: ( rule__ModifyAttribute__ValueAssignment_3 )
            {
             before(grammarAccess.getModifyAttributeAccess().getValueAssignment_3()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2352:1: ( rule__ModifyAttribute__ValueAssignment_3 )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2352:2: rule__ModifyAttribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyAttribute__ValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl4688);
            rule__ModifyAttribute__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyAttributeAccess().getValueAssignment_3()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2371:1: rule__AdaptationModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AdaptationModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2375:1: ( ( ruleImport ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2376:1: ( ruleImport )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2376:1: ( ruleImport )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2377:1: ruleImport
            {
             before(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_04731);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2386:1: rule__AdaptationModel__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__AdaptationModel__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2390:1: ( ( ruleRule ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2391:1: ( ruleRule )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2391:1: ( ruleRule )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2392:1: ruleRule
            {
             before(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_14762);
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


    // $ANTLR start "rule__Import__NameAssignment_3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2401:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2405:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2406:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2406:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2407:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__NameAssignment_34793); 
             after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Import__NameAssignment_3"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2416:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2420:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2421:1: ( RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2421:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2422:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14824); 
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2431:1: rule__Rule__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2435:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2436:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2436:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2437:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_44855);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2446:1: rule__Rule__AtomicActionAssignment_6 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2450:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2451:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2451:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2452:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_64886);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2461:1: rule__Rule__ConditionAssignment_7_1_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2465:1: ( ( ruleCondition ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2466:1: ( ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2466:1: ( ruleCondition )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2467:1: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_14917);
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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2476:1: rule__Rule__AtomicActionAssignment_7_2 : ( ruleAtomicAction ) ;
    public final void rule__Rule__AtomicActionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2480:1: ( ( ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2481:1: ( ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2481:1: ( ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2482:1: ruleAtomicAction
            {
             before(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_24948);
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


    // $ANTLR start "rule__Condition__MeasurementAssignment_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2491:1: rule__Condition__MeasurementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__MeasurementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2495:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2496:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2496:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2497:1: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getMeasurementImportCrossReference_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2498:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2499:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getMeasurementImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__MeasurementAssignment_04983); 
             after(grammarAccess.getConditionAccess().getMeasurementImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getMeasurementImportCrossReference_0_0()); 

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
    // $ANTLR end "rule__Condition__MeasurementAssignment_0"


    // $ANTLR start "rule__Condition__MeasAssignment_3_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2510:1: rule__Condition__MeasAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__MeasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2514:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2515:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2515:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2516:1: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getMeasImportCrossReference_3_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2517:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2518:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getMeasImportIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__MeasAssignment_3_15022); 
             after(grammarAccess.getConditionAccess().getMeasImportIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getMeasImportCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Condition__MeasAssignment_3_1"


    // $ANTLR start "rule__AVG__MeasurementAssignment_1_0"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2529:1: rule__AVG__MeasurementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__AVG__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2533:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2534:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2534:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2535:1: ( RULE_ID )
            {
             before(grammarAccess.getAVGAccess().getMeasurementImportCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2536:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2537:1: RULE_ID
            {
             before(grammarAccess.getAVGAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AVG__MeasurementAssignment_1_05061); 
             after(grammarAccess.getAVGAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getAVGAccess().getMeasurementImportCrossReference_1_0_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2548:1: rule__MIN__MeasurementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MIN__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2552:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2553:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2553:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2554:1: ( RULE_ID )
            {
             before(grammarAccess.getMINAccess().getMeasurementImportCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2555:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2556:1: RULE_ID
            {
             before(grammarAccess.getMINAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MIN__MeasurementAssignment_1_05100); 
             after(grammarAccess.getMINAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMINAccess().getMeasurementImportCrossReference_1_0_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2567:1: rule__MAX__MeasurementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MAX__MeasurementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2571:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2572:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2572:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2573:1: ( RULE_ID )
            {
             before(grammarAccess.getMAXAccess().getMeasurementImportCrossReference_1_0_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2574:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2575:1: RULE_ID
            {
             before(grammarAccess.getMAXAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MAX__MeasurementAssignment_1_05139); 
             after(grammarAccess.getMAXAccess().getMeasurementImportIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMAXAccess().getMeasurementImportCrossReference_1_0_0()); 

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


    // $ANTLR start "rule__SelectAction__FeatureAssignment_1"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2586:1: rule__SelectAction__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2590:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2591:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2591:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2592:1: ( RULE_ID )
            {
             before(grammarAccess.getSelectActionAccess().getFeatureImportCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2593:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2594:1: RULE_ID
            {
             before(grammarAccess.getSelectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectAction__FeatureAssignment_15178); 
             after(grammarAccess.getSelectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectActionAccess().getFeatureImportCrossReference_1_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2605:1: rule__DeselectAction__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeselectAction__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2609:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2610:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2610:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2611:1: ( RULE_ID )
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureImportCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2612:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2613:1: RULE_ID
            {
             before(grammarAccess.getDeselectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeselectAction__FeatureAssignment_15217); 
             after(grammarAccess.getDeselectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeselectActionAccess().getFeatureImportCrossReference_1_0()); 

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
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2624:1: rule__ModifyAttribute__FeatureAttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyAttribute__FeatureAttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2628:1: ( ( ( RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2629:1: ( ( RULE_ID ) )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2629:1: ( ( RULE_ID ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2630:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportCrossReference_1_0()); 
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2631:1: ( RULE_ID )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2632:1: RULE_ID
            {
             before(grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyAttribute__FeatureAttributeAssignment_15256); 
             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportCrossReference_1_0()); 

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


    // $ANTLR start "rule__ModifyAttribute__ValueAssignment_3"
    // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2643:1: rule__ModifyAttribute__ValueAssignment_3 : ( RULE_VALUE ) ;
    public final void rule__ModifyAttribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2647:1: ( ( RULE_VALUE ) )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2648:1: ( RULE_VALUE )
            {
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2648:1: ( RULE_VALUE )
            // ../org.rra.adaptationModel.dsl.ui/src-gen/org/rra/adaptationModel/ui/contentassist/antlr/internal/InternalAdaptationModelDSL.g:2649:1: RULE_VALUE
            {
             before(grammarAccess.getModifyAttributeAccess().getValueVALUETerminalRuleCall_3_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__ModifyAttribute__ValueAssignment_35291); 
             after(grammarAccess.getModifyAttributeAccess().getValueVALUETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ModifyAttribute__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__0_in_ruleAdaptationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OPERATOR__Alternatives_in_ruleOPERATOR454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOGICAL_OPERATOR__Alternatives_in_ruleLOGICAL_OPERATOR514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVG_in_entryRuleAVG543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAVG550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__0_in_ruleAVG576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIN_in_entryRuleMIN603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMIN610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__0_in_ruleMIN636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAX_in_entryRuleMAX663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAX670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__0_in_ruleMAX696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicAction__Alternatives_in_ruleAtomicAction756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0_in_ruleSelectAction816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0_in_ruleDeselectAction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0_in_ruleModifyAttribute936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALLER_in_rule__OPERATOR__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIGGER_in_rule__OPERATOR__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__OPERATOR__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__LOGICAL_OPERATOR__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__LOGICAL_OPERATOR__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_rule__AtomicAction__Alternatives1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_rule__AtomicAction__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_rule__AtomicAction__Alternatives1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__0__Impl_in_rule__AdaptationModel__Group__01152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1_in_rule__AdaptationModel__Group__01155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__ImportsAssignment_0_in_rule__AdaptationModel__Group__0__Impl1182 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__AdaptationModel__Group__1__Impl_in_rule__AdaptationModel__Group__11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdaptationModel__RulesAssignment_1_in_rule__AdaptationModel__Group__1__Impl1240 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01275 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_TERMINAL_in_rule__Import__Group__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__Group__1__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__21396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_in_rule__Import__Group__2__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__31452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__NameAssignment_3_in_rule__Import__Group__3__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01517 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedNameWithWildcard__Group__1__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01642 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1728 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01763 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01885 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RULE_TERMINAL_in_rule__Rule__Group__0__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11944 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22004 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Rule__Group__2__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32066 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_rule__Rule__Group__3__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_4_in_rule__Rule__Group__4__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52185 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_in_rule__Rule__Group__5__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62244 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2276 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_6_in_rule__Rule__Group__6__Impl2288 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0_in_rule__Rule__Group__7__Impl2348 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__0__Impl_in_rule__Rule__Group_7__02395 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1_in_rule__Rule__Group_7__02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_rule__Rule__Group_7__0__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__1__Impl_in_rule__Rule__Group_7__12454 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2_in_rule__Rule__Group_7__12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0_in_rule__Rule__Group_7__1__Impl2484 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7__2__Impl_in_rule__Rule__Group_7__22515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2544 = new BitSet(new long[]{0x00000000000E2002L});
    public static final BitSet FOLLOW_rule__Rule__AtomicActionAssignment_7_2_in_rule__Rule__Group_7__2__Impl2556 = new BitSet(new long[]{0x00000000000E2002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__0__Impl_in_rule__Rule__Group_7_1__02595 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1_in_rule__Rule__Group_7_1__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_rule__Rule__Group_7_1__0__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__1__Impl_in_rule__Rule__Group_7_1__12654 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2_in_rule__Rule__Group_7_1__12657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionAssignment_7_1_1_in_rule__Rule__Group_7_1__1__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_7_1__2__Impl_in_rule__Rule__Group_7_1__22714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_in_rule__Rule__Group_7_1__2__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02776 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__MeasurementAssignment_0_in_rule__Condition__Group__0__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_rule__Condition__Group__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22895 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__22898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__Condition__Group__2__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__32954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl2981 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__03020 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__03023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_rule__Condition__Group_3__0__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__13079 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__2_in_rule__Condition__Group_3__13082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__MeasAssignment_3_1_in_rule__Condition__Group_3__1__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__2__Impl_in_rule__Condition__Group_3__23139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__3_in_rule__Condition__Group_3__23142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_rule__Condition__Group_3__2__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__3__Impl_in_rule__Condition__Group_3__33198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__Condition__Group_3__3__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__0__Impl_in_rule__AVG__Group__03262 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AVG__Group__1_in_rule__AVG__Group__03265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AVG__Group__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group__1__Impl_in_rule__AVG__Group__13324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AVG__Group__2_in_rule__AVG__Group__13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3356 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0_in_rule__AVG__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__AVG__Group__2__Impl_in_rule__AVG__Group__23401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AVG__Group__2__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__0__Impl_in_rule__AVG__Group_1__03466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__1_in_rule__AVG__Group_1__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__MeasurementAssignment_1_0_in_rule__AVG__Group_1__0__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVG__Group_1__1__Impl_in_rule__AVG__Group_1__13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AVG__Group_1__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__0__Impl_in_rule__MIN__Group__03589 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MIN__Group__1_in_rule__MIN__Group__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MIN__Group__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group__1__Impl_in_rule__MIN__Group__13651 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MIN__Group__2_in_rule__MIN__Group__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3683 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0_in_rule__MIN__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MIN__Group__2__Impl_in_rule__MIN__Group__23728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MIN__Group__2__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__0__Impl_in_rule__MIN__Group_1__03793 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__1_in_rule__MIN__Group_1__03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__MeasurementAssignment_1_0_in_rule__MIN__Group_1__0__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MIN__Group_1__1__Impl_in_rule__MIN__Group_1__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MIN__Group_1__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__0__Impl_in_rule__MAX__Group__03916 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MAX__Group__1_in_rule__MAX__Group__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MAX__Group__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group__1__Impl_in_rule__MAX__Group__13978 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MAX__Group__2_in_rule__MAX__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4010 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0_in_rule__MAX__Group__1__Impl4022 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MAX__Group__2__Impl_in_rule__MAX__Group__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MAX__Group__2__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__0__Impl_in_rule__MAX__Group_1__04120 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__1_in_rule__MAX__Group_1__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__MeasurementAssignment_1_0_in_rule__MAX__Group_1__0__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAX__Group_1__1__Impl_in_rule__MAX__Group_1__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MAX__Group_1__1__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__0__Impl_in_rule__SelectAction__Group__04243 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1_in_rule__SelectAction__Group__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECT_in_rule__SelectAction__Group__0__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__Group__1__Impl_in_rule__SelectAction__Group__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAction__FeatureAssignment_1_in_rule__SelectAction__Group__1__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__0__Impl_in_rule__DeselectAction__Group__04363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1_in_rule__DeselectAction__Group__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESELECT_in_rule__DeselectAction__Group__0__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__Group__1__Impl_in_rule__DeselectAction__Group__14422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeselectAction__FeatureAssignment_1_in_rule__DeselectAction__Group__1__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__0__Impl_in_rule__ModifyAttribute__Group__04483 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1_in_rule__ModifyAttribute__Group__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHANGE_in_rule__ModifyAttribute__Group__0__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__1__Impl_in_rule__ModifyAttribute__Group__14542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2_in_rule__ModifyAttribute__Group__14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__FeatureAttributeAssignment_1_in_rule__ModifyAttribute__Group__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__2__Impl_in_rule__ModifyAttribute__Group__24602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3_in_rule__ModifyAttribute__Group__24605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WITH_in_rule__ModifyAttribute__Group__2__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__Group__3__Impl_in_rule__ModifyAttribute__Group__34661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyAttribute__ValueAssignment_3_in_rule__ModifyAttribute__Group__3__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AdaptationModel__ImportsAssignment_04731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__AdaptationModel__RulesAssignment_14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__NameAssignment_34793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_44855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_64886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Rule__ConditionAssignment_7_1_14917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rule__Rule__AtomicActionAssignment_7_24948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__MeasurementAssignment_04983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__MeasAssignment_3_15022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AVG__MeasurementAssignment_1_05061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MIN__MeasurementAssignment_1_05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MAX__MeasurementAssignment_1_05139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectAction__FeatureAssignment_15178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeselectAction__FeatureAssignment_15217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyAttribute__FeatureAttributeAssignment_15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__ModifyAttribute__ValueAssignment_35291 = new BitSet(new long[]{0x0000000000000002L});

}