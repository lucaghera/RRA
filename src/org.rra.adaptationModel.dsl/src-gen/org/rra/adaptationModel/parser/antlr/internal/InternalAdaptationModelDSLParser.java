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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'rule'", "':'", "'if'", "'then'", "'else'", "'<'", "'>'", "'=='", "'<>'", "'AND'", "'OR'", "'max'", "'min'", "'avg'", "'count'", "'select feature'", "'with'", "'attribute'", "'from feature'", "'deselect feature'", "'set attribute'", "'with value'"
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:76:1: ruleAdaptationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_rules_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_rules_1_0= ruleRule ) )*
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:126:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:136:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:141:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:142:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:142:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:143:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport254); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:169:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:170:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:171:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName298);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName309); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:178:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:181:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:182:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:182:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:182:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName349); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:190:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName368); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName383); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:210:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:211:2: (iv_ruleRule= ruleRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:212:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule430);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule440); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:219:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'if' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= 'then' ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_4_0 = null;

        EObject lv_atomicAction_6_0 = null;

        EObject lv_condition_9_0 = null;

        EObject lv_atomicAction_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:222:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'if' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= 'then' ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:223:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'if' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= 'then' ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:223:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'if' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= 'then' ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:223:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'if' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= 'then' ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRule477); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:227:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:228:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:228:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule494); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRule511); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRule523); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getIfKeyword_3());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:253:1: ( (lv_condition_4_0= ruleCondition ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:254:1: (lv_condition_4_0= ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:254:1: (lv_condition_4_0= ruleCondition )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:255:3: lv_condition_4_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleRule544);
            lv_condition_4_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		add(
                   			current, 
                   			"condition",
                    		lv_condition_4_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleRule556); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getThenKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:275:1: ( (lv_atomicAction_6_0= ruleAtomicAction ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28||(LA4_0>=32 && LA4_0<=33)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_atomicAction_6_0= ruleAtomicAction )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_atomicAction_6_0= ruleAtomicAction )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:277:3: lv_atomicAction_6_0= ruleAtomicAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule577);
            	    lv_atomicAction_6_0=ruleAtomicAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atomicAction",
            	            		lv_atomicAction_6_0, 
            	            		"AtomicAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:293:3: (otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:293:5: otherlv_7= 'else' (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRule591); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getElseKeyword_7_0());
            	        
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:297:1: (otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then' )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==15) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:297:3: otherlv_8= 'if' ( (lv_condition_9_0= ruleCondition ) ) otherlv_10= 'then'
            	    	    {
            	    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleRule604); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getIfKeyword_7_1_0());
            	    	        
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:301:1: ( (lv_condition_9_0= ruleCondition ) )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:302:1: (lv_condition_9_0= ruleCondition )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:302:1: (lv_condition_9_0= ruleCondition )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:303:3: lv_condition_9_0= ruleCondition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule625);
            	    	    lv_condition_9_0=ruleCondition();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"condition",
            	    	            		lv_condition_9_0, 
            	    	            		"Condition");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }

            	    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleRule637); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getThenKeyword_7_1_2());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:323:3: ( (lv_atomicAction_11_0= ruleAtomicAction ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==28||(LA6_0>=32 && LA6_0<=33)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_atomicAction_11_0= ruleAtomicAction )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_atomicAction_11_0= ruleAtomicAction )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:325:3: lv_atomicAction_11_0= ruleAtomicAction
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule660);
            	    	    lv_atomicAction_11_0=ruleAtomicAction();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"atomicAction",
            	    	            		lv_atomicAction_11_0, 
            	    	            		"AtomicAction");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:349:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition699);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition709); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:358:1: ruleCondition returns [EObject current=null] : ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_measurementComparison_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:361:28: ( ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:362:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:362:1: ( (lv_measurementComparison_0_0= ruleMeasurementComparison ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:363:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:363:1: (lv_measurementComparison_0_0= ruleMeasurementComparison )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:364:3: lv_measurementComparison_0_0= ruleMeasurementComparison
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasurementComparison_in_ruleCondition754);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:388:1: entryRuleMeasurementComparison returns [EObject current=null] : iv_ruleMeasurementComparison= ruleMeasurementComparison EOF ;
    public final EObject entryRuleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementComparison = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:389:2: (iv_ruleMeasurementComparison= ruleMeasurementComparison EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:390:2: iv_ruleMeasurementComparison= ruleMeasurementComparison EOF
            {
             newCompositeNode(grammarAccess.getMeasurementComparisonRule()); 
            pushFollow(FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison789);
            iv_ruleMeasurementComparison=ruleMeasurementComparison();

            state._fsp--;

             current =iv_ruleMeasurementComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementComparison799); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: ruleMeasurementComparison returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ruleOPERATOR this_STRING_2= RULE_STRING ( ruleLOGICAL_OPERATOR )? ) ;
    public final EObject ruleMeasurementComparison() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:400:28: ( ( ( ( ruleQualifiedName ) ) ruleOPERATOR this_STRING_2= RULE_STRING ( ruleLOGICAL_OPERATOR )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:401:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR this_STRING_2= RULE_STRING ( ruleLOGICAL_OPERATOR )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:401:1: ( ( ( ruleQualifiedName ) ) ruleOPERATOR this_STRING_2= RULE_STRING ( ruleLOGICAL_OPERATOR )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:401:2: ( ( ruleQualifiedName ) ) ruleOPERATOR this_STRING_2= RULE_STRING ( ruleLOGICAL_OPERATOR )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:401:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:402:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:402:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:403:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementComparisonRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison847);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getOPERATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison863);
            ruleOPERATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementComparison873); 
             
                newLeafNode(this_STRING_2, grammarAccess.getMeasurementComparisonAccess().getSTRINGTerminalRuleCall_2()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:428:1: ( ruleLOGICAL_OPERATOR )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:429:5: ruleLOGICAL_OPERATOR
                    {
                     
                            newCompositeNode(grammarAccess.getMeasurementComparisonAccess().getLOGICAL_OPERATORParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison889);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:444:1: entryRuleOPERATOR returns [String current=null] : iv_ruleOPERATOR= ruleOPERATOR EOF ;
    public final String entryRuleOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:445:2: (iv_ruleOPERATOR= ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:446:2: iv_ruleOPERATOR= ruleOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR927);
            iv_ruleOPERATOR=ruleOPERATOR();

            state._fsp--;

             current =iv_ruleOPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR938); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:1: ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:456:28: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:457:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:457:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:458:2: kw= '<'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOPERATOR976); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:465:2: kw= '>'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOPERATOR995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:472:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOPERATOR1014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:479:2: kw= '<>'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOPERATOR1033); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:1: entryRuleLOGICAL_OPERATOR returns [String current=null] : iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF ;
    public final String entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:493:2: (iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:494:2: iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1074);
            iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR();

            state._fsp--;

             current =iv_ruleLOGICAL_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1085); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:501:1: ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:504:28: ( (kw= 'AND' | kw= 'OR' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:505:1: (kw= 'AND' | kw= 'OR' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:505:1: (kw= 'AND' | kw= 'OR' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:506:2: kw= 'AND'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleLOGICAL_OPERATOR1123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:513:2: kw= 'OR'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleLOGICAL_OPERATOR1142); 

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


    // $ANTLR start "entryRuleMATH_OPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:526:1: entryRuleMATH_OPERATOR returns [String current=null] : iv_ruleMATH_OPERATOR= ruleMATH_OPERATOR EOF ;
    public final String entryRuleMATH_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMATH_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:527:2: (iv_ruleMATH_OPERATOR= ruleMATH_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:528:2: iv_ruleMATH_OPERATOR= ruleMATH_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getMATH_OPERATORRule()); 
            pushFollow(FOLLOW_ruleMATH_OPERATOR_in_entryRuleMATH_OPERATOR1183);
            iv_ruleMATH_OPERATOR=ruleMATH_OPERATOR();

            state._fsp--;

             current =iv_ruleMATH_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_OPERATOR1194); 

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
    // $ANTLR end "entryRuleMATH_OPERATOR"


    // $ANTLR start "ruleMATH_OPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:535:1: ruleMATH_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'max' | kw= 'min' | kw= 'avg' | kw= 'count' ) ;
    public final AntlrDatatypeRuleToken ruleMATH_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:538:28: ( (kw= 'max' | kw= 'min' | kw= 'avg' | kw= 'count' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:539:1: (kw= 'max' | kw= 'min' | kw= 'avg' | kw= 'count' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:539:1: (kw= 'max' | kw= 'min' | kw= 'avg' | kw= 'count' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:540:2: kw= 'max'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleMATH_OPERATOR1232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPERATORAccess().getMaxKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:547:2: kw= 'min'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleMATH_OPERATOR1251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPERATORAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:554:2: kw= 'avg'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMATH_OPERATOR1270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPERATORAccess().getAvgKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:561:2: kw= 'count'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleMATH_OPERATOR1289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPERATORAccess().getCountKeyword_3()); 
                        

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
    // $ANTLR end "ruleMATH_OPERATOR"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:580:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:581:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:582:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1335);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1345); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:589:1: ruleAtomicAction returns [EObject current=null] : (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject this_SelectAction_0 = null;

        EObject this_DeselectAction_1 = null;

        EObject this_ModifyAttribute_2 = null;

        EObject this_QueryAction_3 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:592:28: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:593:1: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:593:1: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute | this_QueryAction_3= ruleQueryAction )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
                else if ( (LA12_1==29) ) {
                    alt12=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:594:5: this_SelectAction_0= ruleSelectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectAction_in_ruleAtomicAction1392);
                    this_SelectAction_0=ruleSelectAction();

                    state._fsp--;

                     
                            current = this_SelectAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:604:5: this_DeselectAction_1= ruleDeselectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeselectAction_in_ruleAtomicAction1419);
                    this_DeselectAction_1=ruleDeselectAction();

                    state._fsp--;

                     
                            current = this_DeselectAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:614:5: this_ModifyAttribute_2= ruleModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1446);
                    this_ModifyAttribute_2=ruleModifyAttribute();

                    state._fsp--;

                     
                            current = this_ModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:624:5: this_QueryAction_3= ruleQueryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getQueryActionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleQueryAction_in_ruleAtomicAction1473);
                    this_QueryAction_3=ruleQueryAction();

                    state._fsp--;

                     
                            current = this_QueryAction_3; 
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
    // $ANTLR end "ruleAtomicAction"


    // $ANTLR start "entryRuleQueryAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:640:1: entryRuleQueryAction returns [EObject current=null] : iv_ruleQueryAction= ruleQueryAction EOF ;
    public final EObject entryRuleQueryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:641:2: (iv_ruleQueryAction= ruleQueryAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:642:2: iv_ruleQueryAction= ruleQueryAction EOF
            {
             newCompositeNode(grammarAccess.getQueryActionRule()); 
            pushFollow(FOLLOW_ruleQueryAction_in_entryRuleQueryAction1508);
            iv_ruleQueryAction=ruleQueryAction();

            state._fsp--;

             current =iv_ruleQueryAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryAction1518); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:649:1: ruleQueryAction returns [EObject current=null] : (otherlv_0= 'select feature' otherlv_1= 'with' ruleMATH_OPERATOR otherlv_3= 'attribute' this_STRING_4= RULE_STRING otherlv_5= 'from feature' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleQueryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:652:28: ( (otherlv_0= 'select feature' otherlv_1= 'with' ruleMATH_OPERATOR otherlv_3= 'attribute' this_STRING_4= RULE_STRING otherlv_5= 'from feature' ( (otherlv_6= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:653:1: (otherlv_0= 'select feature' otherlv_1= 'with' ruleMATH_OPERATOR otherlv_3= 'attribute' this_STRING_4= RULE_STRING otherlv_5= 'from feature' ( (otherlv_6= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:653:1: (otherlv_0= 'select feature' otherlv_1= 'with' ruleMATH_OPERATOR otherlv_3= 'attribute' this_STRING_4= RULE_STRING otherlv_5= 'from feature' ( (otherlv_6= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:653:3: otherlv_0= 'select feature' otherlv_1= 'with' ruleMATH_OPERATOR otherlv_3= 'attribute' this_STRING_4= RULE_STRING otherlv_5= 'from feature' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleQueryAction1555); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryActionAccess().getSelectFeatureKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleQueryAction1567); 

                	newLeafNode(otherlv_1, grammarAccess.getQueryActionAccess().getWithKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getQueryActionAccess().getMATH_OPERATORParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleMATH_OPERATOR_in_ruleQueryAction1583);
            ruleMATH_OPERATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleQueryAction1594); 

                	newLeafNode(otherlv_3, grammarAccess.getQueryActionAccess().getAttributeKeyword_3());
                
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQueryAction1605); 
             
                newLeafNode(this_STRING_4, grammarAccess.getQueryActionAccess().getSTRINGTerminalRuleCall_4()); 
                
            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleQueryAction1616); 

                	newLeafNode(otherlv_5, grammarAccess.getQueryActionAccess().getFromFeatureKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:681:1: ( (otherlv_6= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:682:1: (otherlv_6= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:682:1: (otherlv_6= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:683:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQueryActionRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryAction1636); 

            		newLeafNode(otherlv_6, grammarAccess.getQueryActionAccess().getFeatureFeatureCrossReference_6_0()); 
            	

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
    // $ANTLR end "ruleQueryAction"


    // $ANTLR start "entryRuleSelectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:702:1: entryRuleSelectAction returns [EObject current=null] : iv_ruleSelectAction= ruleSelectAction EOF ;
    public final EObject entryRuleSelectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:703:2: (iv_ruleSelectAction= ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:704:2: iv_ruleSelectAction= ruleSelectAction EOF
            {
             newCompositeNode(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction1672);
            iv_ruleSelectAction=ruleSelectAction();

            state._fsp--;

             current =iv_ruleSelectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction1682); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:711:1: ruleSelectAction returns [EObject current=null] : (otherlv_0= 'select feature' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSelectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:714:28: ( (otherlv_0= 'select feature' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:715:1: (otherlv_0= 'select feature' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:715:1: (otherlv_0= 'select feature' ( (otherlv_1= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:715:3: otherlv_0= 'select feature' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSelectAction1719); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectActionAccess().getSelectFeatureKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:719:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:720:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:720:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:721:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectAction1739); 

            		newLeafNode(otherlv_1, grammarAccess.getSelectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleSelectAction"


    // $ANTLR start "entryRuleDeselectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:740:1: entryRuleDeselectAction returns [EObject current=null] : iv_ruleDeselectAction= ruleDeselectAction EOF ;
    public final EObject entryRuleDeselectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeselectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:741:2: (iv_ruleDeselectAction= ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:742:2: iv_ruleDeselectAction= ruleDeselectAction EOF
            {
             newCompositeNode(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction1775);
            iv_ruleDeselectAction=ruleDeselectAction();

            state._fsp--;

             current =iv_ruleDeselectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction1785); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:749:1: ruleDeselectAction returns [EObject current=null] : (otherlv_0= 'deselect feature' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDeselectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:752:28: ( (otherlv_0= 'deselect feature' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:1: (otherlv_0= 'deselect feature' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:1: (otherlv_0= 'deselect feature' ( (otherlv_1= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:3: otherlv_0= 'deselect feature' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDeselectAction1822); 

                	newLeafNode(otherlv_0, grammarAccess.getDeselectActionAccess().getDeselectFeatureKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:757:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:758:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:758:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:759:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeselectActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeselectAction1842); 

            		newLeafNode(otherlv_1, grammarAccess.getDeselectActionAccess().getFeatureFeatureCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleDeselectAction"


    // $ANTLR start "entryRuleModifyAttribute"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:778:1: entryRuleModifyAttribute returns [EObject current=null] : iv_ruleModifyAttribute= ruleModifyAttribute EOF ;
    public final EObject entryRuleModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:779:2: (iv_ruleModifyAttribute= ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:780:2: iv_ruleModifyAttribute= ruleModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute1878);
            iv_ruleModifyAttribute=ruleModifyAttribute();

            state._fsp--;

             current =iv_ruleModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute1888); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:787:1: ruleModifyAttribute returns [EObject current=null] : (otherlv_0= 'set attribute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with value' ( (lv_attributeValue_3_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleModifyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_attributeValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:790:28: ( (otherlv_0= 'set attribute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with value' ( (lv_attributeValue_3_0= ruleAttributeValue ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:1: (otherlv_0= 'set attribute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with value' ( (lv_attributeValue_3_0= ruleAttributeValue ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:1: (otherlv_0= 'set attribute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with value' ( (lv_attributeValue_3_0= ruleAttributeValue ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:791:3: otherlv_0= 'set attribute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with value' ( (lv_attributeValue_3_0= ruleAttributeValue ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleModifyAttribute1925); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyAttributeAccess().getSetAttributeKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:795:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:796:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:796:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyAttribute1945); 

            		newLeafNode(otherlv_1, grammarAccess.getModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleModifyAttribute1957); 

                	newLeafNode(otherlv_2, grammarAccess.getModifyAttributeAccess().getWithValueKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:812:1: ( (lv_attributeValue_3_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:813:1: (lv_attributeValue_3_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:813:1: (lv_attributeValue_3_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:814:3: lv_attributeValue_3_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleModifyAttribute1978);
            lv_attributeValue_3_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModifyAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"attributeValue",
                    		lv_attributeValue_3_0, 
                    		"AttributeValue");
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
    // $ANTLR end "ruleModifyAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:838:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:839:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:840:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2014);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2024); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:847:1: ruleAttributeValue returns [EObject current=null] : (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttributeValue_0 = null;

        EObject this_NFRAttributeValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:850:28: ( (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:851:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:851:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:852:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2071);
                    this_StringAttributeValue_0=ruleStringAttributeValue();

                    state._fsp--;

                     
                            current = this_StringAttributeValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:862:5: this_NFRAttributeValue_1= ruleNFRAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2098);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:878:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:879:2: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:880:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2133);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue2143); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:887:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:890:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:891:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:891:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:892:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:892:1: (lv_value_0_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:893:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue2184); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:1: entryRuleNFRAttributeValue returns [EObject current=null] : iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF ;
    public final EObject entryRuleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFRAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:918:2: (iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:919:2: iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2224);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue2234); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:926:1: ruleNFRAttributeValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:929:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:930:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:930:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:931:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:931:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:932:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRAttributeValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2281);
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
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAdaptationModel153 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName349 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName383 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRule477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRule523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule544 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule556 = new BitSet(new long[]{0x0000000310000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule577 = new BitSet(new long[]{0x0000000310020002L});
    public static final BitSet FOLLOW_17_in_ruleRule591 = new BitSet(new long[]{0x0000000310008000L});
    public static final BitSet FOLLOW_15_in_ruleRule604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule637 = new BitSet(new long[]{0x0000000310008000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule660 = new BitSet(new long[]{0x0000000310020002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_ruleCondition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementComparison_in_entryRuleMeasurementComparison789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementComparison799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMeasurementComparison847 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleMeasurementComparison863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementComparison873 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_ruleMeasurementComparison889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOPERATOR976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOPERATOR995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOPERATOR1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOPERATOR1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLOGICAL_OPERATOR1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLOGICAL_OPERATOR1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OPERATOR_in_entryRuleMATH_OPERATOR1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_OPERATOR1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMATH_OPERATOR1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMATH_OPERATOR1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMATH_OPERATOR1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMATH_OPERATOR1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_ruleAtomicAction1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_ruleAtomicAction1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_ruleAtomicAction1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryAction_in_entryRuleQueryAction1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryAction1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQueryAction1555 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQueryAction1567 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_ruleMATH_OPERATOR_in_ruleQueryAction1583 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQueryAction1594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQueryAction1605 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleQueryAction1616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryAction1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction1672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSelectAction1719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectAction1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction1775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDeselectAction1822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeselectAction1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleModifyAttribute1925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyAttribute1945 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleModifyAttribute1957 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleModifyAttribute1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2281 = new BitSet(new long[]{0x0000000000000002L});

}