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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'rule'", "':'", "'if'", "'('", "')'", "'else'", "';'", "'priority'", "'rule_set'", "'{'", "'};'", "'<'", "'>'", "'=='", "'<>'", "'AND'", "'OR'", "'select_feature_*'", "'from_variants_of_feature'", "'where_attribue'", "'max'", "'min'", "'activate_feature'", "'deactivate_feature'", "'set_attribute'", "'with_value'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:76:1: ruleAdaptationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ( (lv_ruleSets_2_0= ruleRuleSet ) )* ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_rules_1_0 = null;

        EObject lv_ruleSets_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ( (lv_ruleSets_2_0= ruleRuleSet ) )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ( (lv_ruleSets_2_0= ruleRuleSet ) )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ( (lv_ruleSets_2_0= ruleRuleSet ) )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ( (lv_ruleSets_2_0= ruleRuleSet ) )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:98:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:99:1: (lv_rules_1_0= ruleRule )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:99:1: (lv_rules_1_0= ruleRule )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:100:3: lv_rules_1_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getRulesRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleAdaptationModel153);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_1_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:116:3: ( (lv_ruleSets_2_0= ruleRuleSet ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:117:1: (lv_ruleSets_2_0= ruleRuleSet )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:117:1: (lv_ruleSets_2_0= ruleRuleSet )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:118:3: lv_ruleSets_2_0= ruleRuleSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getRuleSetsRuleSetParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleSet_in_ruleAdaptationModel175);
            	    lv_ruleSets_2_0=ruleRuleSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ruleSets",
            	            		lv_ruleSets_2_0, 
            	            		"RuleSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleImport"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:144:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:154:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:155:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:155:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:155:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport259); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:159:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:160:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:160:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:161:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport276); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:187:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName320);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName331); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:196:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:199:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:200:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:200:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:200:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName371); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:207:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:208:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName390); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName405); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:228:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:2: (iv_ruleRule= ruleRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:230:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule452);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule462); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:237:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:240:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:241:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:241:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:241:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )? ( (lv_atomicAction_7_0= ruleAtomicAction ) )+ (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )* otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRule499); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:245:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:246:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:246:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:247:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule516); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRule533); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:267:1: (otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:267:3: otherlv_3= 'if' otherlv_4= '(' ( (lv_condition_5_0= ruleCondition ) )+ otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRule546); 

                        	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getIfKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRule558); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:275:1: ( (lv_condition_5_0= ruleCondition ) )+
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
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_condition_5_0= ruleCondition )
                    	    {
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_condition_5_0= ruleCondition )
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:277:3: lv_condition_5_0= ruleCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule579);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleRule592); 

                        	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:297:3: ( (lv_atomicAction_7_0= ruleAtomicAction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30||(LA7_0>=35 && LA7_0<=37)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:298:1: (lv_atomicAction_7_0= ruleAtomicAction )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:298:1: (lv_atomicAction_7_0= ruleAtomicAction )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:299:3: lv_atomicAction_7_0= ruleAtomicAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule615);
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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:315:3: (otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:315:5: otherlv_8= 'else' (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )* ( (lv_atomicAction_13_0= ruleAtomicAction ) )+
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleRule629); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getElseKeyword_5_0());
            	        
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:1: (otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')' )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==15) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:3: otherlv_9= 'if' otherlv_10= '(' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= ')'
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRule642); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getIfKeyword_5_1_0());
            	    	        
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleRule654); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_1_1());
            	    	        
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:327:1: ( (lv_condition_11_0= ruleCondition ) )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:328:1: (lv_condition_11_0= ruleCondition )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:328:1: (lv_condition_11_0= ruleCondition )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:329:3: lv_condition_11_0= ruleCondition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule675);
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

            	    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleRule687); 

            	    	        	newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_1_3());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:349:3: ( (lv_atomicAction_13_0= ruleAtomicAction ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==30||(LA9_0>=35 && LA9_0<=37)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:1: (lv_atomicAction_13_0= ruleAtomicAction )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:1: (lv_atomicAction_13_0= ruleAtomicAction )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:3: lv_atomicAction_13_0= ruleAtomicAction
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_5_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule710);
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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRule725); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:379:1: entryRuleRuleWithPriority returns [EObject current=null] : iv_ruleRuleWithPriority= ruleRuleWithPriority EOF ;
    public final EObject entryRuleRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleWithPriority = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:380:2: (iv_ruleRuleWithPriority= ruleRuleWithPriority EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:381:2: iv_ruleRuleWithPriority= ruleRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getRuleWithPriorityRule()); 
            pushFollow(FOLLOW_ruleRuleWithPriority_in_entryRuleRuleWithPriority761);
            iv_ruleRuleWithPriority=ruleRuleWithPriority();

            state._fsp--;

             current =iv_ruleRuleWithPriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleWithPriority771); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:388:1: ruleRuleWithPriority returns [EObject current=null] : (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) ) ;
    public final EObject ruleRuleWithPriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_priorityValue_1_0=null;
        EObject lv_rule_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:391:28: ( (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:1: (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:1: (otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:3: otherlv_0= 'priority' ( (lv_priorityValue_1_0= RULE_INT ) ) ( (lv_rule_2_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleWithPriority808); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleWithPriorityAccess().getPriorityKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:396:1: ( (lv_priorityValue_1_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: (lv_priorityValue_1_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: (lv_priorityValue_1_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:398:3: lv_priorityValue_1_0= RULE_INT
            {
            lv_priorityValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleWithPriority825); 

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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:414:2: ( (lv_rule_2_0= ruleRule ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:415:1: (lv_rule_2_0= ruleRule )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:415:1: (lv_rule_2_0= ruleRule )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:416:3: lv_rule_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getRuleWithPriorityAccess().getRuleRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleRuleWithPriority851);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleWithPriorityRule());
            	        }
                   		add(
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:440:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:441:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:442:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet887);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet897); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:449:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:452:28: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRuleWithPriority ) )* otherlv_4= '};'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRuleSet934); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:457:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:458:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:458:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleSet951); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleRuleSet968); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:479:1: ( (lv_rules_3_0= ruleRuleWithPriority ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:480:1: (lv_rules_3_0= ruleRuleWithPriority )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:480:1: (lv_rules_3_0= ruleRuleWithPriority )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:481:3: lv_rules_3_0= ruleRuleWithPriority
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleWithPriorityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleWithPriority_in_ruleRuleSet989);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRuleSet1002); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:509:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:510:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:511:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1038);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1048); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:518:1: ruleCondition returns [EObject current=null] : ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_measurementComparison_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:521:28: ( ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:522:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:522:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:523:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:523:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:524:3: lv_measurementComparison_0_0= ruleMeasurementComparison
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasurementComparison_in_ruleCondition1093);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:548:1: entryRuleMeasurementComparison returns [EObject current=null] : iv_ruleMeasurementComparison= ruleMeasurementComparison EOF ;
    public final EObject entryRuleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementComparison = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:549:2: (iv_ruleMeasurementComparison= ruleMeasurementComparison EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:550:2: iv_ruleMeasurementComparison= ruleMeasurementComparison EOF
            {
             newCompositeNode(grammarAccess.getMeasurementComparisonRule()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison1128);
            iv_ruleMeasurementComparison=ruleMeasurementComparison();

            state._fsp--;

             current =iv_ruleMeasurementComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementComparison1138); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:557:1: ruleMeasurementComparison returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? ) ;
    public final EObject ruleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:560:28: ( ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:561:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:561:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:561:2: ( ( ruleQualifiedName ) ) ruleOPERATOR ( (lv_value_2_0= RULE_STRING ) ) ( ruleLOGICAL_OPERATOR )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:561:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:562:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:562:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:563:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementComparisonRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison1186);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison1202);
            ruleOPERATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:584:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:585:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:585:1: (lv_value_2_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:586:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementComparison1218); 

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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:602:2: ( ruleLOGICAL_OPERATOR )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=28 && LA12_0<=29)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:603:5: ruleLOGICAL_OPERATOR
                    {
                     
                            newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison1240);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:618:1: entryRuleOPERATOR returns [String current=null] : iv_ruleOPERATOR= ruleOPERATOR EOF ;
    public final String entryRuleOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:619:2: (iv_ruleOPERATOR= ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:620:2: iv_ruleOPERATOR= ruleOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1278);
            iv_ruleOPERATOR=ruleOPERATOR();

            state._fsp--;

             current =iv_ruleOPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR1289); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:627:1: ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:630:28: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:631:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:631:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:632:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOPERATOR1327); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOPERATOR1346); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:646:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOPERATOR1365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:653:2: kw= '<>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOPERATOR1384); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:666:1: entryRuleLOGICAL_OPERATOR returns [String current=null] : iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF ;
    public final String entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:667:2: (iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:668:2: iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1425);
            iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR();

            state._fsp--;

             current =iv_ruleLOGICAL_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1436); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:675:1: ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:678:28: ( (kw= 'AND' | kw= 'OR' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:679:1: (kw= 'AND' | kw= 'OR' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:679:1: (kw= 'AND' | kw= 'OR' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:680:2: kw= 'AND'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleLOGICAL_OPERATOR1474); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:687:2: kw= 'OR'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleLOGICAL_OPERATOR1493); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:700:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:701:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:702:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1533);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1543); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:709:1: ruleAtomicAction returns [EObject current=null] : ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SelectAction_0 = null;

        EObject this_DeselectAction_1 = null;

        EObject this_ModifyAttribute_2 = null;

        EObject this_QueryAction_3 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:712:28: ( ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:713:1: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:713:1: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:713:2: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) (otherlv_4= 'AND' )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:713:2: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 30:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:714:5: this_SelectAction_0= ruleSelectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectAction_in_ruleAtomicAction1591);
                    this_SelectAction_0=ruleSelectAction();

                    state._fsp--;

                     
                            current = this_SelectAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:724:5: this_DeselectAction_1= ruleDeselectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDeselectAction_in_ruleAtomicAction1618);
                    this_DeselectAction_1=ruleDeselectAction();

                    state._fsp--;

                     
                            current = this_DeselectAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:734:5: this_ModifyAttribute_2= ruleModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1645);
                    this_ModifyAttribute_2=ruleModifyAttribute();

                    state._fsp--;

                     
                            current = this_ModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:5: this_QueryAction_3= ruleQueryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleQueryAction_in_ruleAtomicAction1672);
                    this_QueryAction_3=ruleQueryAction();

                    state._fsp--;

                     
                            current = this_QueryAction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:752:2: (otherlv_4= 'AND' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:752:4: otherlv_4= 'AND'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAtomicAction1685); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:764:1: entryRuleQueryAction returns [EObject current=null] : iv_ruleQueryAction= ruleQueryAction EOF ;
    public final EObject entryRuleQueryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:765:2: (iv_ruleQueryAction= ruleQueryAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:766:2: iv_ruleQueryAction= ruleQueryAction EOF
            {
             newCompositeNode(grammarAccess.getQueryActionRule()); 
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction1723);
            iv_ruleQueryAction=ruleQueryAction();

            state._fsp--;

             current =iv_ruleQueryAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction1733); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:773:1: ruleQueryAction returns [EObject current=null] : (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:776:28: ( (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:777:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:777:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:777:3: otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleQueryAction1770); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryActionAccess().getSelect_feature_Keyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleQueryAction1782); 

                	newLeafNode(otherlv_1, grammarAccess.getQueryActionAccess().getFrom_variants_of_featureKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleQueryAction1794); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryActionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:789:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:790:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:790:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQueryActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQueryAction1817);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQueryAction1829); 

                	newLeafNode(otherlv_4, grammarAccess.getQueryActionAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleQueryAction1841); 

                	newLeafNode(otherlv_5, grammarAccess.getQueryActionAccess().getWhere_attribueKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getQueryActionAccess().getQueryOperatorParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleQueryOperator_in_ruleQueryAction1857);
            ruleQueryOperator();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleQueryAction1868); 

                	newLeafNode(otherlv_7, grammarAccess.getQueryActionAccess().getLeftParenthesisKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:824:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:825:1: (lv_value_8_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:825:1: (lv_value_8_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:826:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQueryAction1885); 

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

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleQueryAction1902); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:854:1: entryRuleQueryOperator returns [String current=null] : iv_ruleQueryOperator= ruleQueryOperator EOF ;
    public final String entryRuleQueryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOperator = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:855:2: (iv_ruleQueryOperator= ruleQueryOperator EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:856:2: iv_ruleQueryOperator= ruleQueryOperator EOF
            {
             newCompositeNode(grammarAccess.getQueryOperatorRule()); 
            pushFollow(FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator1939);
            iv_ruleQueryOperator=ruleQueryOperator();

            state._fsp--;

             current =iv_ruleQueryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOperator1950); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:863:1: ruleQueryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'max' | kw= 'min' ) ;
    public final AntlrDatatypeRuleToken ruleQueryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:866:28: ( (kw= 'max' | kw= 'min' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:867:1: (kw= 'max' | kw= 'min' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:867:1: (kw= 'max' | kw= 'min' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:868:2: kw= 'max'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleQueryOperator1988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOperatorAccess().getMaxKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:875:2: kw= 'min'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleQueryOperator2007); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:888:1: entryRuleSelectAction returns [EObject current=null] : iv_ruleSelectAction= ruleSelectAction EOF ;
    public final EObject entryRuleSelectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:889:2: (iv_ruleSelectAction= ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:890:2: iv_ruleSelectAction= ruleSelectAction EOF
            {
             newCompositeNode(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction2047);
            iv_ruleSelectAction=ruleSelectAction();

            state._fsp--;

             current =iv_ruleSelectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction2057); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:897:1: ruleSelectAction returns [EObject current=null] : (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleSelectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:900:28: ( (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:3: otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSelectAction2094); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectActionAccess().getActivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSelectAction2106); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectActionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:909:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:910:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:910:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:911:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSelectAction2129);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSelectAction2141); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:936:1: entryRuleDeselectAction returns [EObject current=null] : iv_ruleDeselectAction= ruleDeselectAction EOF ;
    public final EObject entryRuleDeselectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeselectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:937:2: (iv_ruleDeselectAction= ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:938:2: iv_ruleDeselectAction= ruleDeselectAction EOF
            {
             newCompositeNode(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction2177);
            iv_ruleDeselectAction=ruleDeselectAction();

            state._fsp--;

             current =iv_ruleDeselectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction2187); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:945:1: ruleDeselectAction returns [EObject current=null] : (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleDeselectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:948:28: ( (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:949:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:949:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:949:3: otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDeselectAction2224); 

                	newLeafNode(otherlv_0, grammarAccess.getDeselectActionAccess().getDeactivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDeselectAction2236); 

                	newLeafNode(otherlv_1, grammarAccess.getDeselectActionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:957:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:958:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:958:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:959:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeselectActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDeselectAction2259);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDeselectAction2271); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:984:1: entryRuleModifyAttribute returns [EObject current=null] : iv_ruleModifyAttribute= ruleModifyAttribute EOF ;
    public final EObject entryRuleModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:985:2: (iv_ruleModifyAttribute= ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:986:2: iv_ruleModifyAttribute= ruleModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2307);
            iv_ruleModifyAttribute=ruleModifyAttribute();

            state._fsp--;

             current =iv_ruleModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute2317); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:993:1: ruleModifyAttribute returns [EObject current=null] : (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:996:28: ( (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:997:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:997:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:997:3: otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleModifyAttribute2354); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyAttributeAccess().getSet_attributeKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleModifyAttribute2366); 

                	newLeafNode(otherlv_1, grammarAccess.getModifyAttributeAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1005:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1006:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1006:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1007:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModifyAttribute2389);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleModifyAttribute2401); 

                	newLeafNode(otherlv_3, grammarAccess.getModifyAttributeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleModifyAttribute2413); 

                	newLeafNode(otherlv_4, grammarAccess.getModifyAttributeAccess().getWith_valueKeyword_4());
                
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleModifyAttribute2425); 

                	newLeafNode(otherlv_5, grammarAccess.getModifyAttributeAccess().getLeftParenthesisKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1032:1: ( (lv_attributeValue_6_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1033:1: (lv_attributeValue_6_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1033:1: (lv_attributeValue_6_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1034:3: lv_attributeValue_6_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleModifyAttribute2446);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleModifyAttribute2458); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1062:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1063:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1064:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2494);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2504); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1071:1: ruleAttributeValue returns [EObject current=null] : (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttributeValue_0 = null;

        EObject this_NFRAttributeValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1074:28: ( (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1076:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2551);
                    this_StringAttributeValue_0=ruleStringAttributeValue();

                    state._fsp--;

                     
                            current = this_StringAttributeValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1086:5: this_NFRAttributeValue_1= ruleNFRAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2578);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1102:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1103:2: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1104:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2613);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue2623); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1111:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1114:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1115:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1115:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1116:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1116:1: (lv_value_0_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1117:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue2664); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1141:1: entryRuleNFRAttributeValue returns [EObject current=null] : iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF ;
    public final EObject entryRuleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFRAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1142:2: (iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1143:2: iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2704);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue2714); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1150:1: ruleNFRAttributeValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1155:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1155:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1156:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRAttributeValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2761);
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
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000202802L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAdaptationModel153 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAdaptationModel175 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName371 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName405 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRule499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule533 = new BitSet(new long[]{0x0000003840008000L});
    public static final BitSet FOLLOW_15_in_ruleRule546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule579 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleRule592 = new BitSet(new long[]{0x0000003840008000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule615 = new BitSet(new long[]{0x00000038400C8000L});
    public static final BitSet FOLLOW_18_in_ruleRule629 = new BitSet(new long[]{0x0000003840008000L});
    public static final BitSet FOLLOW_15_in_ruleRule642 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule675 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRule687 = new BitSet(new long[]{0x0000003840008000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule710 = new BitSet(new long[]{0x00000038400C8000L});
    public static final BitSet FOLLOW_19_in_ruleRule725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleWithPriority_in_entryRuleRuleWithPriority761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleWithPriority771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleWithPriority808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleWithPriority825 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleWithPriority851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRuleSet934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleSet951 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleSet968 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_ruleRuleWithPriority_in_ruleRuleSet989 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleRuleSet1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_ruleCondition1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementComparison1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison1186 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementComparison1218 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOPERATOR1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOPERATOR1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOPERATOR1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOPERATOR1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLOGICAL_OPERATOR1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLOGICAL_OPERATOR1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_ruleAtomicAction1591 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_ruleAtomicAction1618 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1645 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_ruleAtomicAction1672 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicAction1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction1723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleQueryAction1770 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleQueryAction1782 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQueryAction1794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQueryAction1817 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQueryAction1829 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleQueryAction1841 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_ruleQueryAction1857 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQueryAction1868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQueryAction1885 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQueryAction1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOperator1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQueryOperator1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleQueryOperator2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSelectAction2094 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelectAction2106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelectAction2129 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSelectAction2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDeselectAction2224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeselectAction2236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeselectAction2259 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeselectAction2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleModifyAttribute2354 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModifyAttribute2366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModifyAttribute2389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModifyAttribute2401 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleModifyAttribute2413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModifyAttribute2425 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleModifyAttribute2446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModifyAttribute2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2761 = new BitSet(new long[]{0x0000000000000002L});

}