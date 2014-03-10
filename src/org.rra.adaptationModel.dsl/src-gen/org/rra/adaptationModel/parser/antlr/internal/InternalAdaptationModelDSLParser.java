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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'frequency'", "'import'", "'.'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'AND'", "'if'", "'('", "')'", "'else'", "'<'", "'>'", "'=='", "'<>'", "'OR'", "'activate_feature'", "'deactivate_feature'", "'set_attribute'", "'with_value'", "'select_feature_*'", "'from_variants_of_feature'", "'where_attribue'", "'max'", "'min'"
    };
    public static final int RULE_ID=6;
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

                if ( (LA2_0==16||LA2_0==19) ) {
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


    // $ANTLR start "entryRuleImport"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:176:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:177:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:178:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport281);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport291); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:185:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport328); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:193:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:194:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:194:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:195:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport345); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport362); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:225:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:226:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:227:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName401);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName412); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:234:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:237:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:238:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:238:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:238:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName452); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:245:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:246:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName471); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName486); 

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


    // $ANTLR start "entryRuleAdaptationRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:266:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:267:2: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:268:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule533);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationRule543); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:275:1: ruleAdaptationRule returns [EObject current=null] : (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRule_0 = null;

        EObject this_RuleSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:278:28: ( (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:279:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:279:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:280:5: this_AtomicRule_0= ruleAtomicRule
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getAtomicRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRule_in_ruleAdaptationRule590);
                    this_AtomicRule_0=ruleAtomicRule();

                    state._fsp--;

                     
                            current = this_AtomicRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:290:5: this_RuleSet_1= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleAdaptationRule617);
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


    // $ANTLR start "entryRuleAtomicRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:306:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:307:2: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:308:2: iv_ruleAtomicRule= ruleAtomicRule EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleRule()); 
            pushFollow(FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule652);
            iv_ruleAtomicRule=ruleAtomicRule();

            state._fsp--;

             current =iv_ruleAtomicRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRule662); 

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
    // $ANTLR end "entryRuleAtomicRule"


    // $ANTLR start "ruleAtomicRule"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:315:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleAtomicRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_ruleBody_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:318:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:319:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAtomicRule699); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:323:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:325:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRule716); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAtomicRule733); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:1: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:346:1: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:346:1: (lv_ruleBody_3_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:347:3: lv_ruleBody_3_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRule754);
            lv_ruleBody_3_0=ruleRuleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRuleRule());
            	        }
                   		set(
                   			current, 
                   			"ruleBody",
                    		lv_ruleBody_3_0, 
                    		"RuleBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAtomicRule766); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleAtomicRule778); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicRuleAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleAtomicRule"


    // $ANTLR start "entryRuleRuleSet"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:379:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:380:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:381:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet814);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet824); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:388:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_atomicRules_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:391:28: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:392:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRuleSet861); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:396:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:398:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleSet878); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRuleSet895); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:418:1: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:419:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:419:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:420:3: lv_atomicRules_3_0= ruleAtomicRuleWithPriority
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getAtomicRulesAtomicRuleWithPriorityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet916);
            	    lv_atomicRules_3_0=ruleAtomicRuleWithPriority();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atomicRules",
            	            		lv_atomicRules_3_0, 
            	            		"AtomicRuleWithPriority");
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRuleSet929); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRuleSet941); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_5());
                

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


    // $ANTLR start "entryRuleAtomicRuleWithPriority"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:452:1: entryRuleAtomicRuleWithPriority returns [EObject current=null] : iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF ;
    public final EObject entryRuleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRuleWithPriority = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:2: (iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:454:2: iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleWithPriorityRule()); 
            pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority977);
            iv_ruleAtomicRuleWithPriority=ruleAtomicRuleWithPriority();

            state._fsp--;

             current =iv_ruleAtomicRuleWithPriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority987); 

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
    // $ANTLR end "entryRuleAtomicRuleWithPriority"


    // $ANTLR start "ruleAtomicRuleWithPriority"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:461:1: ruleAtomicRuleWithPriority returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) ;
    public final EObject ruleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_priorityValue_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ruleBody_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:464:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:465:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:465:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:465:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAtomicRuleWithPriority1024); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:469:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:470:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:470:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:471:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1041); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleWithPriorityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAtomicRuleWithPriority1058); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:491:1: ( (lv_priorityValue_3_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:1: (lv_priorityValue_3_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:1: (lv_priorityValue_3_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:493:3: lv_priorityValue_3_0= RULE_INT
            {
            lv_priorityValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1075); 

            			newLeafNode(lv_priorityValue_3_0, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityValueINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priorityValue",
                    		lv_priorityValue_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAtomicRuleWithPriority1092); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:513:1: ( (lv_ruleBody_5_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:514:1: (lv_ruleBody_5_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:514:1: (lv_ruleBody_5_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:515:3: lv_ruleBody_5_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1113);
            lv_ruleBody_5_0=ruleRuleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRuleWithPriorityRule());
            	        }
                   		set(
                   			current, 
                   			"ruleBody",
                    		lv_ruleBody_5_0, 
                    		"RuleBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAtomicRuleWithPriority1125); 

                	newLeafNode(otherlv_6, grammarAccess.getAtomicRuleWithPriorityAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAtomicRuleWithPriority"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:543:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:544:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:545:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1161);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1171); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:552:1: ruleAtomicAction returns [EObject current=null] : ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AtomicActionSelectFeature_0 = null;

        EObject this_AtomicActionDeselectFeature_1 = null;

        EObject this_AtomicActionModifyAttribute_2 = null;

        EObject this_AtomicActionQuery_3 = null;

        EObject lv_secondAction_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:555:28: ( ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:556:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:556:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:556:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:556:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 35:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:557:5: this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionSelectFeatureParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1219);
                    this_AtomicActionSelectFeature_0=ruleAtomicActionSelectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionSelectFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:567:5: this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionDeselectFeatureParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1246);
                    this_AtomicActionDeselectFeature_1=ruleAtomicActionDeselectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionDeselectFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:577:5: this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionModifyAttributeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1273);
                    this_AtomicActionModifyAttribute_2=ruleAtomicActionModifyAttribute();

                    state._fsp--;

                     
                            current = this_AtomicActionModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:587:5: this_AtomicActionQuery_3= ruleAtomicActionQuery
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionQueryParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1300);
                    this_AtomicActionQuery_3=ruleAtomicActionQuery();

                    state._fsp--;

                     
                            current = this_AtomicActionQuery_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:595:2: (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:595:4: otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAtomicAction1313); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomicActionAccess().getANDKeyword_1_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:599:1: ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:600:1: (lv_secondAction_5_0= ruleAtomicAction )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:600:1: (lv_secondAction_5_0= ruleAtomicAction )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:601:3: lv_secondAction_5_0= ruleAtomicAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicActionAccess().getSecondActionAtomicActionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicAction_in_ruleAtomicAction1334);
                    lv_secondAction_5_0=ruleAtomicAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicActionRule());
                    	        }
                           		set(
                           			current, 
                           			"secondAction",
                            		lv_secondAction_5_0, 
                            		"AtomicAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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


    // $ANTLR start "entryRuleRuleBody"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:625:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:626:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:627:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody1372);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody1382); 

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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:634:1: ruleRuleBody returns [EObject current=null] : (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:637:28: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:638:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:638:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=31 && LA8_0<=33)||LA8_0==35) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:639:5: this_PureAction_0= rulePureAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getPureActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePureAction_in_ruleRuleBody1429);
                    this_PureAction_0=rulePureAction();

                    state._fsp--;

                     
                            current = this_PureAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:649:5: this_ConditionAction_1= ruleConditionAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getConditionActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConditionAction_in_ruleRuleBody1456);
                    this_ConditionAction_1=ruleConditionAction();

                    state._fsp--;

                     
                            current = this_ConditionAction_1; 
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRulePureAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:665:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:666:2: (iv_rulePureAction= rulePureAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:667:2: iv_rulePureAction= rulePureAction EOF
            {
             newCompositeNode(grammarAccess.getPureActionRule()); 
            pushFollow(FOLLOW_rulePureAction_in_entryRulePureAction1491);
            iv_rulePureAction=rulePureAction();

            state._fsp--;

             current =iv_rulePureAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePureAction1501); 

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
    // $ANTLR end "entryRulePureAction"


    // $ANTLR start "rulePureAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:674:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:677:28: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:678:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:678:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:679:1: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:679:1: (lv_atomicAction_0_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:680:3: lv_atomicAction_0_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_rulePureAction1546);
            lv_atomicAction_0_0=ruleAtomicAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPureActionRule());
            	        }
                   		set(
                   			current, 
                   			"atomicAction",
                    		lv_atomicAction_0_0, 
                    		"AtomicAction");
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
    // $ANTLR end "rulePureAction"


    // $ANTLR start "entryRuleConditionAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:704:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:2: (iv_ruleConditionAction= ruleConditionAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:706:2: iv_ruleConditionAction= ruleConditionAction EOF
            {
             newCompositeNode(grammarAccess.getConditionActionRule()); 
            pushFollow(FOLLOW_ruleConditionAction_in_entryRuleConditionAction1581);
            iv_ruleConditionAction=ruleConditionAction();

            state._fsp--;

             current =iv_ruleConditionAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionAction1591); 

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
    // $ANTLR end "entryRuleConditionAction"


    // $ANTLR start "ruleConditionAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:713:1: ruleConditionAction returns [EObject current=null] : ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) ;
    public final EObject ruleConditionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_atomicAction_4_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:716:28: ( ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:717:4: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleConditionAction1629); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getIfKeyword_0_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleConditionAction1641); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_0_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:725:1: ( (lv_condition_2_0= ruleCondition ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:726:1: (lv_condition_2_0= ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:726:1: (lv_condition_2_0= ruleCondition )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:727:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getConditionConditionParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleConditionAction1662);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleConditionAction1674); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_0_3());
                

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:747:2: ( (lv_atomicAction_4_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:748:1: (lv_atomicAction_4_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:748:1: (lv_atomicAction_4_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:749:3: lv_atomicAction_4_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_ruleConditionAction1696);
            lv_atomicAction_4_0=ruleAtomicAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionActionRule());
            	        }
                   		set(
                   			current, 
                   			"atomicAction",
                    		lv_atomicAction_4_0, 
                    		"AtomicAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:765:2: (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:765:4: otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleConditionAction1709); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getElseKeyword_2_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:769:1: ( (lv_else_6_0= ruleRuleBody ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:770:1: (lv_else_6_0= ruleRuleBody )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:770:1: (lv_else_6_0= ruleRuleBody )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:771:3: lv_else_6_0= ruleRuleBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionActionAccess().getElseRuleBodyParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleBody_in_ruleConditionAction1730);
                    lv_else_6_0=ruleRuleBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionActionRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_6_0, 
                            		"RuleBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConditionAction"


    // $ANTLR start "entryRuleCondition"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:795:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:796:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1768);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1778); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:804:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOPERATOR ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:807:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOPERATOR ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:808:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOPERATOR ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:808:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOPERATOR ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:808:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOPERATOR ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:808:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:809:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:809:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:810:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition1826);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:2: ( (lv_operator_1_0= ruleOPERATOR ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:824:1: (lv_operator_1_0= ruleOPERATOR )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:824:1: (lv_operator_1_0= ruleOPERATOR )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:825:3: lv_operator_1_0= ruleOPERATOR
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOPERATORParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOPERATOR_in_ruleCondition1847);
            lv_operator_1_0=ruleOPERATOR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"OPERATOR");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:841:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:842:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:842:1: (lv_value_2_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:843:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition1864); 

            			newLeafNode(lv_value_2_0, grammarAccess.getConditionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:859:2: ( ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21||LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:859:3: ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:859:3: ( (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:860:1: (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:860:1: (lv_logicalOp_3_0= ruleLOGICAL_OPERATOR )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:861:3: lv_logicalOp_3_0= ruleLOGICAL_OPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLOGICAL_OPERATORParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_ruleCondition1891);
                    lv_logicalOp_3_0=ruleLOGICAL_OPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"logicalOp",
                            		lv_logicalOp_3_0, 
                            		"LOGICAL_OPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:877:2: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:878:1: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:878:1: (lv_secondTerm_4_0= ruleCondition )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:879:3: lv_secondTerm_4_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSecondTermConditionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition1912);
                    lv_secondTerm_4_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"secondTerm",
                            		lv_secondTerm_4_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:1: entryRuleOPERATOR returns [String current=null] : iv_ruleOPERATOR= ruleOPERATOR EOF ;
    public final String entryRuleOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:904:2: (iv_ruleOPERATOR= ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:905:2: iv_ruleOPERATOR= ruleOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1951);
            iv_ruleOPERATOR=ruleOPERATOR();

            state._fsp--;

             current =iv_ruleOPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR1962); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:912:1: ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:28: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<>' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:916:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:916:1: (kw= '<' | kw= '>' | kw= '==' | kw= '<>' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOPERATOR2000); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:924:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOPERATOR2019); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:931:2: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOPERATOR2038); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOPERATORAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:938:2: kw= '<>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOPERATOR2057); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:951:1: entryRuleLOGICAL_OPERATOR returns [String current=null] : iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF ;
    public final String entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:952:2: (iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:953:2: iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR2098);
            iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR();

            state._fsp--;

             current =iv_ruleLOGICAL_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR2109); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:960:1: ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:963:28: ( (kw= 'AND' | kw= 'OR' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:964:1: (kw= 'AND' | kw= 'OR' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:964:1: (kw= 'AND' | kw= 'OR' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:965:2: kw= 'AND'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleLOGICAL_OPERATOR2147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOGICAL_OPERATORAccess().getANDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:972:2: kw= 'OR'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLOGICAL_OPERATOR2166); 

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


    // $ANTLR start "entryRuleAtomicActionSelectFeature"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:985:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:986:2: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:987:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionSelectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature2206);
            iv_ruleAtomicActionSelectFeature=ruleAtomicActionSelectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionSelectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2216); 

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
    // $ANTLR end "entryRuleAtomicActionSelectFeature"


    // $ANTLR start "ruleAtomicActionSelectFeature"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:994:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:997:28: ( (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:998:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:998:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:998:3: otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAtomicActionSelectFeature2253); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getActivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionSelectFeature2265); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1006:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1007:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1007:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1008:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionSelectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2288);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionSelectFeature2300); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicActionSelectFeatureAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleAtomicActionSelectFeature"


    // $ANTLR start "entryRuleAtomicActionDeselectFeature"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1033:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1034:2: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1035:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2336);
            iv_ruleAtomicActionDeselectFeature=ruleAtomicActionDeselectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionDeselectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2346); 

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
    // $ANTLR end "entryRuleAtomicActionDeselectFeature"


    // $ANTLR start "ruleAtomicActionDeselectFeature"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1042:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1045:28: ( (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1046:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1046:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1046:3: otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAtomicActionDeselectFeature2383); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getDeactivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionDeselectFeature2395); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1054:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1055:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1055:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1056:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionDeselectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2418);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionDeselectFeature2430); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicActionDeselectFeatureAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleAtomicActionDeselectFeature"


    // $ANTLR start "entryRuleAtomicActionModifyAttribute"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1081:1: entryRuleAtomicActionModifyAttribute returns [EObject current=null] : iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF ;
    public final EObject entryRuleAtomicActionModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1082:2: (iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1083:2: iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2466);
            iv_ruleAtomicActionModifyAttribute=ruleAtomicActionModifyAttribute();

            state._fsp--;

             current =iv_ruleAtomicActionModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2476); 

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
    // $ANTLR end "entryRuleAtomicActionModifyAttribute"


    // $ANTLR start "ruleAtomicActionModifyAttribute"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1090:1: ruleAtomicActionModifyAttribute returns [EObject current=null] : (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) ;
    public final EObject ruleAtomicActionModifyAttribute() throws RecognitionException {
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1093:28: ( (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1094:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1094:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1094:3: otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAtomicActionModifyAttribute2513); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionModifyAttributeAccess().getSet_attributeKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionModifyAttribute2525); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1102:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1103:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1103:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1104:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionModifyAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2548);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionModifyAttribute2560); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleAtomicActionModifyAttribute2572); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionModifyAttributeAccess().getWith_valueKeyword_4());
                
            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionModifyAttribute2584); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1129:1: ( (lv_attributeValue_6_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1130:1: (lv_attributeValue_6_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1130:1: (lv_attributeValue_6_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1131:3: lv_attributeValue_6_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2605);
            lv_attributeValue_6_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicActionModifyAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"attributeValue",
                    		lv_attributeValue_6_0, 
                    		"AttributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionModifyAttribute2617); 

                	newLeafNode(otherlv_7, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleAtomicActionModifyAttribute"


    // $ANTLR start "entryRuleAtomicActionQuery"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1159:1: entryRuleAtomicActionQuery returns [EObject current=null] : iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF ;
    public final EObject entryRuleAtomicActionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionQuery = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1160:2: (iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1161:2: iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionQueryRule()); 
            pushFollow(FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2653);
            iv_ruleAtomicActionQuery=ruleAtomicActionQuery();

            state._fsp--;

             current =iv_ruleAtomicActionQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionQuery2663); 

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
    // $ANTLR end "entryRuleAtomicActionQuery"


    // $ANTLR start "ruleAtomicActionQuery"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1168:1: ruleAtomicActionQuery returns [EObject current=null] : (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleAtomicActionQuery() throws RecognitionException {
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1171:28: ( (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1172:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1172:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1172:3: otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ruleQueryOperator otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAtomicActionQuery2700); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionQueryAccess().getSelect_feature_Keyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomicActionQuery2712); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionQueryAccess().getFrom_variants_of_featureKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionQuery2724); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1184:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1185:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1185:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1186:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionQueryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getFeatureFeatureCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2747);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionQuery2759); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAtomicActionQuery2771); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionQueryAccess().getWhere_attribueKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getQueryOperatorParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2787);
            ruleQueryOperator();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleAtomicActionQuery2798); 

                	newLeafNode(otherlv_7, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1219:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1220:1: (lv_value_8_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1220:1: (lv_value_8_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1221:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2815); 

            			newLeafNode(lv_value_8_0, grammarAccess.getAtomicActionQueryAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionQueryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionQuery2832); 

                	newLeafNode(otherlv_9, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_9());
                

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
    // $ANTLR end "ruleAtomicActionQuery"


    // $ANTLR start "entryRuleQueryOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1249:1: entryRuleQueryOperator returns [String current=null] : iv_ruleQueryOperator= ruleQueryOperator EOF ;
    public final String entryRuleQueryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOperator = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1250:2: (iv_ruleQueryOperator= ruleQueryOperator EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1251:2: iv_ruleQueryOperator= ruleQueryOperator EOF
            {
             newCompositeNode(grammarAccess.getQueryOperatorRule()); 
            pushFollow(FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator2869);
            iv_ruleQueryOperator=ruleQueryOperator();

            state._fsp--;

             current =iv_ruleQueryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOperator2880); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1258:1: ruleQueryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'max' | kw= 'min' ) ;
    public final AntlrDatatypeRuleToken ruleQueryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1261:28: ( (kw= 'max' | kw= 'min' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1262:1: (kw= 'max' | kw= 'min' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1262:1: (kw= 'max' | kw= 'min' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            else if ( (LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1263:2: kw= 'max'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleQueryOperator2918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOperatorAccess().getMaxKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1270:2: kw= 'min'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleQueryOperator2937); 

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


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1283:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1284:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1285:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2977);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2987); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1292:1: ruleAttributeValue returns [EObject current=null] : (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttributeValue_0 = null;

        EObject this_NFRAttributeValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1295:28: ( (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1296:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1296:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1297:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue3034);
                    this_StringAttributeValue_0=ruleStringAttributeValue();

                    state._fsp--;

                     
                            current = this_StringAttributeValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1307:5: this_NFRAttributeValue_1= ruleNFRAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue3061);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1323:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1324:2: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1325:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue3096);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue3106); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1332:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1335:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1336:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1336:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1337:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1337:1: (lv_value_0_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1338:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue3147); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1362:1: entryRuleNFRAttributeValue returns [EObject current=null] : iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF ;
    public final EObject entryRuleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFRAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1363:2: (iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1364:2: iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue3187);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue3197); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1371:1: ruleNFRAttributeValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1374:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1375:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1375:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1376:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1376:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1377:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRAttributeValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue3244);
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
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel223 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel244 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport345 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName452 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName471 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName486 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationRule543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_ruleAdaptationRule590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAdaptationRule617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRule662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAtomicRule699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRule716 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicRule733 = new BitSet(new long[]{0x0000000B80400000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRule754 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicRule766 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicRule778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRuleSet861 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleSet878 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRuleSet895 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet916 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleRuleSet929 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRuleSet941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAtomicRuleWithPriority1024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1041 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtomicRuleWithPriority1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1075 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicRuleWithPriority1092 = new BitSet(new long[]{0x0000000B80400000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1113 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicRuleWithPriority1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1219 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1246 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1273 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1300 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAtomicAction1313 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleAtomicAction1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody1372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_ruleRuleBody1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_ruleRuleBody1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_entryRulePureAction1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePureAction1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rulePureAction1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_entryRuleConditionAction1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionAction1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConditionAction1629 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConditionAction1641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConditionAction1662 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConditionAction1674 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleConditionAction1696 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleConditionAction1709 = new BitSet(new long[]{0x0000000B80400000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleConditionAction1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition1826 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleCondition1847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition1864 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_ruleCondition1891 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOPERATOR2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOPERATOR2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOPERATOR2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOPERATOR2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLOGICAL_OPERATOR2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLOGICAL_OPERATOR2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtomicActionSelectFeature2253 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionSelectFeature2265 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2288 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionSelectFeature2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomicActionDeselectFeature2383 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionDeselectFeature2395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2418 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionDeselectFeature2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomicActionModifyAttribute2513 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionModifyAttribute2525 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2548 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionModifyAttribute2560 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAtomicActionModifyAttribute2572 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionModifyAttribute2584 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2605 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionModifyAttribute2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionQuery2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAtomicActionQuery2700 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAtomicActionQuery2712 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionQuery2724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2747 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionQuery2759 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAtomicActionQuery2771 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2787 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicActionQuery2798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2815 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionQuery2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_entryRuleQueryOperator2869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOperator2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleQueryOperator2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleQueryOperator2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue3187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue3244 = new BitSet(new long[]{0x0000000000000002L});

}