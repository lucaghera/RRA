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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptationModelDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'frequency'", "'import'", "'.'", "'rule'", "':'", "'if'", "'('", "')'", "'else'", "'priority'", "'rule_set'", "'{'", "'};'", "'<'", "'>'", "'=='", "'<>'", "'AND'", "'OR'", "'select_feature_*'", "'from_variants_of_feature'", "'where_attribue'", "'max'", "'min'", "'activate_feature'", "'deactivate_feature'", "'set_attribute'", "'with_value'"
    };
    public static final int RULE_ID=6;
    public static final int T__40=40;
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g"; }



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



    // $ANTLR start "entryRuleAdaptationModel"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:67:1: entryRuleAdaptationModel returns [EObject current=null] : iv_ruleAdaptationModel= ruleAdaptationModel EOF ;
    public final EObject entryRuleAdaptationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationModel = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:68:2: (iv_ruleAdaptationModel= ruleAdaptationModel EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:69:2: iv_ruleAdaptationModel= ruleAdaptationModel EOF
            {
             newCompositeNode(grammarAccess.getAdaptationModelRule()); 
            pushFollow(FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel75);
            iv_ruleAdaptationModel=ruleAdaptationModel();

            state._fsp--;

             current =iv_ruleAdaptationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdaptationModel"


    // $ANTLR start "ruleAdaptationModel"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:76:1: ruleAdaptationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' otherlv_4= 'frequency' ( (lv_frequency_5_0= RULE_INT ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_frequency_5_0=null;
        Token otherlv_6=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_adaptationRules_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' otherlv_4= 'frequency' ( (lv_frequency_5_0= RULE_INT ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' otherlv_4= 'frequency' ( (lv_frequency_5_0= RULE_INT ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' otherlv_4= 'frequency' ( (lv_frequency_5_0= RULE_INT ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' otherlv_4= 'frequency' ( (lv_frequency_5_0= RULE_INT ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleAdaptationModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAdaptationModel144); 

                	newLeafNode(otherlv_1, grammarAccess.getAdaptationModelAccess().getNameKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:102:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:103:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:103:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:104:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAdaptationModel165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel177); 

                	newLeafNode(otherlv_3, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAdaptationModel189); 

                	newLeafNode(otherlv_4, grammarAccess.getAdaptationModelAccess().getFrequencyKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:128:1: ( (lv_frequency_5_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:129:1: (lv_frequency_5_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:129:1: (lv_frequency_5_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:130:3: lv_frequency_5_0= RULE_INT
            {
            lv_frequency_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAdaptationModel206); 

            			newLeafNode(lv_frequency_5_0, grammarAccess.getAdaptationModelAccess().getFrequencyINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"frequency",
                    		lv_frequency_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel223); 

                	newLeafNode(otherlv_6, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_6());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:150:1: ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:151:1: (lv_adaptationRules_7_0= ruleAdaptationRule )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:151:1: (lv_adaptationRules_7_0= ruleAdaptationRule )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:152:3: lv_adaptationRules_7_0= ruleAdaptationRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel244);
            	    lv_adaptationRules_7_0=ruleAdaptationRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"adaptationRules",
            	            		lv_adaptationRules_7_0, 
            	            		"AdaptationRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdaptationModel"


    // $ANTLR start "entryRuleAdaptationRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:176:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:177:2: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:178:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule281);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationRule291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdaptationRule"


    // $ANTLR start "ruleAdaptationRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:185:1: ruleAdaptationRule returns [EObject current=null] : (this_Rule_0= ruleRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;

        EObject this_RuleSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:28: ( (this_Rule_0= ruleRule | this_RuleSet_1= ruleRuleSet ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:1: (this_Rule_0= ruleRule | this_RuleSet_1= ruleRuleSet )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:1: (this_Rule_0= ruleRule | this_RuleSet_1= ruleRuleSet )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:190:5: this_Rule_0= ruleRule
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleAdaptationRule338);
                    this_Rule_0=ruleRule();

                    state._fsp--;

                     
                            current = this_Rule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:200:5: this_RuleSet_1= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleAdaptationRule365);
                    this_RuleSet_1=ruleRuleSet();

                    state._fsp--;

                     
                            current = this_RuleSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdaptationRule"


    // $ANTLR start "entryRuleImport"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:216:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:217:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:218:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport400);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:225:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:228:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport447); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:233:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:234:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:234:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:235:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport464); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport481); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:265:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:266:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:267:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName520);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName531); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:274:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:277:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:278:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName571); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:285:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:286:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName590); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName605); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:306:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:307:2: (iv_ruleRule= ruleRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:308:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule652);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule662); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:315:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_condition_5_0 = null;

        EObject lv_atomicAction_7_0 = null;

        EObject lv_condition_11_0 = null;

        EObject lv_atomicAction_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:318:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRule699); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:323:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:325:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule716); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRule733); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:1: (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:3: otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRule746); 

                        	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getIfKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRule758); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:353:1: ( (lv_condition_5_0= ruleCondition ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:354:1: (lv_condition_5_0= ruleCondition )
                    	    {
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:354:1: (lv_condition_5_0= ruleCondition )
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:355:3: lv_condition_5_0= ruleCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule779);
                    	    lv_condition_5_0=ruleCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"condition",
                    	            		lv_condition_5_0, 
                    	            		"Condition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRule792); 

                        	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:375:3: ( (lv_atomicAction_7_0= ruleAtomicAction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32||(LA7_0>=37 && LA7_0<=39)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:376:1: (lv_atomicAction_7_0= ruleAtomicAction )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:376:1: (lv_atomicAction_7_0= ruleAtomicAction )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:377:3: lv_atomicAction_7_0= ruleAtomicAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule815);
            	    lv_atomicAction_7_0=ruleAtomicAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atomicAction",
            	            		lv_atomicAction_7_0, 
            	            		"AtomicAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:393:3: (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:393:5: otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRule829); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getElseKeyword_5_0());
            	        
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==18) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:3: otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')'
            	    	    {
            	    	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleRule842); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getIfKeyword_5_1_0());
            	    	        
            	    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleRule854); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_1_1());
            	    	        
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:405:1: ( (lv_condition_11_0= ruleCondition ) )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:406:1: (lv_condition_11_0= ruleCondition )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:406:1: (lv_condition_11_0= ruleCondition )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:407:3: lv_condition_11_0= ruleCondition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule875);
            	    	    lv_condition_11_0=ruleCondition();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"condition",
            	    	            		lv_condition_11_0, 
            	    	            		"Condition");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }

            	    	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleRule887); 

            	    	        	newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_1_3());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:427:3: ( (lv_atomicAction_13_0= ruleAtomicAction ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==32||(LA9_0>=37 && LA9_0<=39)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:428:1: (lv_atomicAction_13_0= ruleAtomicAction )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:428:1: (lv_atomicAction_13_0= ruleAtomicAction )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:429:3: lv_atomicAction_13_0= ruleAtomicAction
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_5_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule910);
            	    	    lv_atomicAction_13_0=ruleAtomicAction();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"atomicAction",
            	    	            		lv_atomicAction_13_0, 
            	    	            		"AtomicAction");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleRule925); 

                	newLeafNode(otherlv_14, grammarAccess.getRuleAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleWithPriority"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:457:1: entryRuleRuleWithPriority returns [EObject current=null] : iv_ruleRuleWithPriority= ruleRuleWithPriority EOF ;
    public final EObject entryRuleRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleWithPriority = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:458:2: (iv_ruleRuleWithPriority= ruleRuleWithPriority EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:459:2: iv_ruleRuleWithPriority= ruleRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getRuleWithPriorityRule()); 
            pushFollow(FOLLOW_ruleRuleWithPriority_in_entryRuleRuleWithPriority961);
            iv_ruleRuleWithPriority=ruleRuleWithPriority();

            state._fsp--;

             current =iv_ruleRuleWithPriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleWithPriority971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleWithPriority"


    // $ANTLR start "ruleRuleWithPriority"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:466:1: ruleRuleWithPriority returns [EObject current=null] : (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) ) ;
    public final EObject ruleRuleWithPriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_priorityValue_1_0=null;
        EObject lv_rule_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:469:28: ( (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:470:1: (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:470:1: (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:470:3: otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRuleWithPriority1008); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleWithPriorityAccess().getPriorityKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:474:1: ( (lv_priorityValue_1_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:475:1: (lv_priorityValue_1_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:475:1: (lv_priorityValue_1_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:476:3: lv_priorityValue_1_0= RULE_INT
            {
            lv_priorityValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleWithPriority1025); 

            			newLeafNode(lv_priorityValue_1_0, grammarAccess.getRuleWithPriorityAccess().getPriorityValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleWithPriorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priorityValue",
                    		lv_priorityValue_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:2: ( (lv_rule_2_0= ruleRule ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:493:1: (lv_rule_2_0= ruleRule )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:493:1: (lv_rule_2_0= ruleRule )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:494:3: lv_rule_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getRuleWithPriorityAccess().getRuleRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleRuleWithPriority1051);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleWithPriorityRule());
            	        }
                   		set(
                   			current, 
                   			"rule",
                    		lv_rule_2_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleWithPriority"


    // $ANTLR start "entryRuleRuleSet"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:518:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:519:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:520:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet1087);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet1097); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:527:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:530:28: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:531:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:531:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:531:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRuleSet1134); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:535:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:536:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:536:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:537:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleSet1151); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleRuleSet1168); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:557:1: ( (lv_rules_3_0= ruleRuleWithPriority ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:558:1: (lv_rules_3_0= ruleRuleWithPriority )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:558:1: (lv_rules_3_0= ruleRuleWithPriority )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:559:3: lv_rules_3_0= ruleRuleWithPriority
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleWithPriorityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleWithPriority_in_ruleRuleSet1189);
            	    lv_rules_3_0=ruleRuleWithPriority();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_3_0, 
            	            		"RuleWithPriority");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleRuleSet1202); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleCondition"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:587:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:588:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:589:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1238);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:596:1: ruleCondition returns [EObject current=null] : ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_measurementComparison_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:599:28: ( ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:600:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:600:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:601:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:601:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:602:3: lv_measurementComparison_0_0= ruleMeasurementComparison
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasurementComparison_in_ruleCondition1293);
            lv_measurementComparison_0_0=ruleMeasurementComparison();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		add(
                   			current, 
                   			"measurementComparison",
                    		lv_measurementComparison_0_0, 
                    		"MeasurementComparison");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleMeasurementComparison"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:626:1: entryRuleMeasurementComparison returns [EObject current=null] : iv_ruleMeasurementComparison= ruleMeasurementComparison EOF ;
    public final EObject entryRuleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementComparison = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:627:2: (iv_ruleMeasurementComparison= ruleMeasurementComparison EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:628:2: iv_ruleMeasurementComparison= ruleMeasurementComparison EOF
            {
             newCompositeNode(grammarAccess.getMeasurementComparisonRule()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison1328);
            iv_ruleMeasurementComparison=ruleMeasurementComparison();

            state._fsp--;

             current =iv_ruleMeasurementComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementComparison1338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementComparison"


    // $ANTLR start "ruleMeasurementComparison"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:635:1: ruleMeasurementComparison returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? ) ;
    public final EObject ruleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:638:28: ( ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:2: ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:640:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:640:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:641:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementComparisonRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison1386);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison1402);
            ruleOPERATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:1: (lv_value_2_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:664:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementComparison1418); 

            			newLeafNode(lv_value_2_0, grammarAccess.getMeasurementComparisonAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementComparisonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:680:2: ( ruleLOGICAL_OPERATOR )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=30 && LA12_0<=31)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:681:5: ruleLOGICAL_OPERATOR
                    {
                     
                            newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison1440);
                    ruleLOGICAL_OPERATOR();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurementComparison"


    // $ANTLR start "entryRuleOPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:696:1: entryRuleOPERATOR returns [String current=null] : iv_ruleOPERATOR= ruleOPERATOR EOF ;
    public final String entryRuleOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:697:2: (iv_ruleOPERATOR= ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:698:2: iv_ruleOPERATOR= ruleOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1478);
            iv_ruleOPERATOR=ruleOPERATOR();

            state._fsp--;

             current =iv_ruleOPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOPERATOR"


    // $ANTLR start "ruleOPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:1: ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:708:28: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:709:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:709:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:710:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOPERATOR1527); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOPERATOR1546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:724:2: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOPERATOR1565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:731:2: kw= '<>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOPERATOR1584); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPERATOR"


    // $ANTLR start "entryRuleLOGICAL_OPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:1: entryRuleLOGICAL_OPERATOR returns [String current=null] : iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF ;
    public final String entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:745:2: (iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:746:2: iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1625);
            iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR();

            state._fsp--;

             current =iv_ruleLOGICAL_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOGICAL_OPERATOR"


    // $ANTLR start "ruleLOGICAL_OPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:1: ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:756:28: ( (kw= 'AND' | kw= 'OR' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:757:1: (kw= 'AND' | kw= 'OR' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:757:1: (kw= 'AND' | kw= 'OR' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:758:2: kw= 'AND'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLOGICAL_OPERATOR1674); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:765:2: kw= 'OR'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLOGICAL_OPERATOR1693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOGICAL_OPERATORAccess().getORKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOGICAL_OPERATOR"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:778:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:779:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:780:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1733);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicAction"


    // $ANTLR start "ruleAtomicAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:787:1: ruleAtomicAction returns [EObject current=null] : ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SelectAction_0 = null;

        EObject this_DeselectAction_1 = null;

        EObject this_ModifyAttribute_2 = null;

        EObject this_QueryAction_3 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:790:28: ( ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:1: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:1: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:2: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:2: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:792:5: this_SelectAction_0= ruleSelectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectAction_in_ruleAtomicAction1791);
                    this_SelectAction_0=ruleSelectAction();

                    state._fsp--;

                     
                            current = this_SelectAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:802:5: this_DeselectAction_1= ruleDeselectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDeselectAction_in_ruleAtomicAction1818);
                    this_DeselectAction_1=ruleDeselectAction();

                    state._fsp--;

                     
                            current = this_DeselectAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:812:5: this_ModifyAttribute_2= ruleModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1845);
                    this_ModifyAttribute_2=ruleModifyAttribute();

                    state._fsp--;

                     
                            current = this_ModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:822:5: this_QueryAction_3= ruleQueryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleQueryAction_in_ruleAtomicAction1872);
                    this_QueryAction_3=ruleQueryAction();

                    state._fsp--;

                     
                            current = this_QueryAction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:830:2: (otherlv_4= 'AND' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:830:4: otherlv_4= 'AND'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleAtomicAction1885); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomicActionAccess().getANDKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicAction"


    // $ANTLR start "entryRuleQueryAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:842:1: entryRuleQueryAction returns [EObject current=null] : iv_ruleQueryAction= ruleQueryAction EOF ;
    public final EObject entryRuleQueryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:843:2: (iv_ruleQueryAction= ruleQueryAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:844:2: iv_ruleQueryAction= ruleQueryAction EOF
            {
             newCompositeNode(grammarAccess.getQueryActionRule()); 
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction1923);
            iv_ruleQueryAction=ruleQueryAction();

            state._fsp--;

             current =iv_ruleQueryAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction1933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryAction"


    // $ANTLR start "ruleQueryAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:851:1: ruleQueryAction returns [EObject current=null] : (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleQueryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:854:28: ( (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:855:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:855:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:855:3: otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleQueryAction1970); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryActionAccess().getSelect_feature_Keyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleQueryAction1982); 

                	newLeafNode(otherlv_1, grammarAccess.getQueryActionAccess().getFrom_variants_of_featureKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQueryAction1994); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryActionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:867:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:868:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:868:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:869:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQueryActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQueryAction2017);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleQueryAction2029); 

                	newLeafNode(otherlv_4, grammarAccess.getQueryActionAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleQueryAction2041); 

                	newLeafNode(otherlv_5, grammarAccess.getQueryActionAccess().getWhere_attribueKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getQueryActionAccess().getQueryOperatorParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleQueryOperator_in_ruleQueryAction2057);
            ruleQueryOperator();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleQueryAction2068); 

                	newLeafNode(otherlv_7, grammarAccess.getQueryActionAccess().getLeftParenthesisKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:902:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:1: (lv_value_8_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:1: (lv_value_8_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:904:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQueryAction2085); 

            			newLeafNode(lv_value_8_0, grammarAccess.getQueryActionAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQueryActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleQueryAction2102); 

                	newLeafNode(otherlv_9, grammarAccess.getQueryActionAccess().getRightParenthesisKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryAction"


    // $ANTLR start "entryRuleQueryOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:932:1: entryRuleQueryOperator returns [String current=null] : iv_ruleQueryOperator= ruleQueryOperator EOF ;
    public final String entryRuleQueryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOperator = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:933:2: (iv_ruleQueryOperator= ruleQueryOperator EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:934:2: iv_ruleQueryOperator= ruleQueryOperator EOF
            {
             newCompositeNode(grammarAccess.getQueryOperatorRule()); 
            pushFollow(FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator2139);
            iv_ruleQueryOperator=ruleQueryOperator();

            state._fsp--;

             current =iv_ruleQueryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOperator2150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryOperator"


    // $ANTLR start "ruleQueryOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:941:1: ruleQueryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'max' | kw= 'min' ) ;
    public final AntlrDatatypeRuleToken ruleQueryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:944:28: ( (kw= 'max' | kw= 'min' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:945:1: (kw= 'max' | kw= 'min' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:945:1: (kw= 'max' | kw= 'min' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:946:2: kw= 'max'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleQueryOperator2188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOperatorAccess().getMaxKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:953:2: kw= 'min'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleQueryOperator2207); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOperatorAccess().getMinKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryOperator"


    // $ANTLR start "entryRuleSelectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:966:1: entryRuleSelectAction returns [EObject current=null] : iv_ruleSelectAction= ruleSelectAction EOF ;
    public final EObject entryRuleSelectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:967:2: (iv_ruleSelectAction= ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:968:2: iv_ruleSelectAction= ruleSelectAction EOF
            {
             newCompositeNode(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction2247);
            iv_ruleSelectAction=ruleSelectAction();

            state._fsp--;

             current =iv_ruleSelectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction2257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectAction"


    // $ANTLR start "ruleSelectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:975:1: ruleSelectAction returns [EObject current=null] : (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleSelectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:978:28: ( (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:979:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:979:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:979:3: otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSelectAction2294); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectActionAccess().getActivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSelectAction2306); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectActionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:987:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:988:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:988:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:989:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSelectAction2329);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSelectAction2341); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectActionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectAction"


    // $ANTLR start "entryRuleDeselectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1014:1: entryRuleDeselectAction returns [EObject current=null] : iv_ruleDeselectAction= ruleDeselectAction EOF ;
    public final EObject entryRuleDeselectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeselectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1015:2: (iv_ruleDeselectAction= ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1016:2: iv_ruleDeselectAction= ruleDeselectAction EOF
            {
             newCompositeNode(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction2377);
            iv_ruleDeselectAction=ruleDeselectAction();

            state._fsp--;

             current =iv_ruleDeselectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction2387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeselectAction"


    // $ANTLR start "ruleDeselectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1023:1: ruleDeselectAction returns [EObject current=null] : (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleDeselectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1026:28: ( (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1027:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1027:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1027:3: otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDeselectAction2424); 

                	newLeafNode(otherlv_0, grammarAccess.getDeselectActionAccess().getDeactivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDeselectAction2436); 

                	newLeafNode(otherlv_1, grammarAccess.getDeselectActionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1035:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1036:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1036:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1037:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeselectActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDeselectAction2459);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDeselectAction2471); 

                	newLeafNode(otherlv_3, grammarAccess.getDeselectActionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeselectAction"


    // $ANTLR start "entryRuleModifyAttribute"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1062:1: entryRuleModifyAttribute returns [EObject current=null] : iv_ruleModifyAttribute= ruleModifyAttribute EOF ;
    public final EObject entryRuleModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1063:2: (iv_ruleModifyAttribute= ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1064:2: iv_ruleModifyAttribute= ruleModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2507);
            iv_ruleModifyAttribute=ruleModifyAttribute();

            state._fsp--;

             current =iv_ruleModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute2517); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifyAttribute"


    // $ANTLR start "ruleModifyAttribute"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1071:1: ruleModifyAttribute returns [EObject current=null] : (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) ;
    public final EObject ruleModifyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributeValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1074:28: ( (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:3: otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleModifyAttribute2554); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyAttributeAccess().getSet_attributeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleModifyAttribute2566); 

                	newLeafNode(otherlv_1, grammarAccess.getModifyAttributeAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1083:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1084:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1084:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1085:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModifyAttribute2589);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleModifyAttribute2601); 

                	newLeafNode(otherlv_3, grammarAccess.getModifyAttributeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleModifyAttribute2613); 

                	newLeafNode(otherlv_4, grammarAccess.getModifyAttributeAccess().getWith_valueKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleModifyAttribute2625); 

                	newLeafNode(otherlv_5, grammarAccess.getModifyAttributeAccess().getLeftParenthesisKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1110:1: ( (lv_attributeValue_6_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1111:1: (lv_attributeValue_6_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1111:1: (lv_attributeValue_6_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1112:3: lv_attributeValue_6_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleModifyAttribute2646);
            lv_attributeValue_6_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModifyAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"attributeValue",
                    		lv_attributeValue_6_0, 
                    		"AttributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleModifyAttribute2658); 

                	newLeafNode(otherlv_7, grammarAccess.getModifyAttributeAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifyAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1140:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1141:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1142:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2694);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1149:1: ruleAttributeValue returns [EObject current=null] : (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttributeValue_0 = null;

        EObject this_NFRAttributeValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1152:28: ( (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2751);
                    this_StringAttributeValue_0=ruleStringAttributeValue();

                    state._fsp--;

                     
                            current = this_StringAttributeValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1164:5: this_NFRAttributeValue_1= ruleNFRAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2778);
                    this_NFRAttributeValue_1=ruleNFRAttributeValue();

                    state._fsp--;

                     
                            current = this_NFRAttributeValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleStringAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1180:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1181:2: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1182:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2813);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue2823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringAttributeValue"


    // $ANTLR start "ruleStringAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1189:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1192:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1193:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1193:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1194:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1194:1: (lv_value_0_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1195:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue2864); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringAttributeValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAttributeValue"


    // $ANTLR start "entryRuleNFRAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1219:1: entryRuleNFRAttributeValue returns [EObject current=null] : iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF ;
    public final EObject entryRuleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFRAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1220:2: (iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1221:2: iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2904);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue2914); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNFRAttributeValue"


    // $ANTLR start "ruleNFRAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1228:1: ruleNFRAttributeValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1231:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1232:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1232:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1233:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1233:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1234:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRAttributeValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2961);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNFRAttributeValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleAdaptationModel144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAdaptationModel165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAdaptationModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAdaptationModel206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel223 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel244 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationRule291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAdaptationRule338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAdaptationRule365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport464 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName571 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName605 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRule699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule716 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRule733 = new BitSet(new long[]{0x000000E100040000L});
    public static final BitSet FOLLOW_18_in_ruleRule746 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRule758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule779 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_20_in_ruleRule792 = new BitSet(new long[]{0x000000E100040000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule815 = new BitSet(new long[]{0x000000E100241000L});
    public static final BitSet FOLLOW_21_in_ruleRule829 = new BitSet(new long[]{0x000000E100040000L});
    public static final BitSet FOLLOW_18_in_ruleRule842 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRule854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule875 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRule887 = new BitSet(new long[]{0x000000E100040000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule910 = new BitSet(new long[]{0x000000E100241000L});
    public static final BitSet FOLLOW_12_in_ruleRule925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleWithPriority_in_entryRuleRuleWithPriority961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleWithPriority971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRuleWithPriority1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleWithPriority1025 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleWithPriority1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRuleSet1134 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleSet1151 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRuleSet1168 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleRuleWithPriority_in_ruleRuleSet1189 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleRuleSet1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_ruleCondition1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementComparison1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison1386 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison1402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementComparison1418 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOPERATOR1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOPERATOR1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOPERATOR1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOPERATOR1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLOGICAL_OPERATOR1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLOGICAL_OPERATOR1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_ruleAtomicAction1791 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_ruleAtomicAction1818 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1845 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_ruleAtomicAction1872 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAtomicAction1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQueryAction1970 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleQueryAction1982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQueryAction1994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQueryAction2017 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQueryAction2029 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleQueryAction2041 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_ruleQueryAction2057 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQueryAction2068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQueryAction2085 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQueryAction2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOperator2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleQueryOperator2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleQueryOperator2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSelectAction2294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSelectAction2306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelectAction2329 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSelectAction2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDeselectAction2424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeselectAction2436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeselectAction2459 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeselectAction2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleModifyAttribute2554 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModifyAttribute2566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModifyAttribute2589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModifyAttribute2601 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleModifyAttribute2613 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModifyAttribute2625 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleModifyAttribute2646 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModifyAttribute2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2961 = new BitSet(new long[]{0x0000000000000002L});

}