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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptationModelDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'period[ms]'", "'java output package'", "'import'", "'.'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'AND'", "'if'", "'('", "')'", "'else'", "'activate_feature'", "'deactivate_feature'", "'set_attribute'", "'with_value'", "'select_feature_*'", "'from_variants_of_feature'", "'where_attribue'", "'<'", "'>'", "'=='", "'<>'", "'OR'", "'max'", "'min'", "'is'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:68:1: entryRuleAdaptationModel returns [EObject current=null] : iv_ruleAdaptationModel= ruleAdaptationModel EOF ;
    public final EObject entryRuleAdaptationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationModel = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:69:2: (iv_ruleAdaptationModel= ruleAdaptationModel EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:70:2: iv_ruleAdaptationModel= ruleAdaptationModel EOF
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:77:1: ruleAdaptationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'period[ms]' ( (lv_period_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'java output package' ( (lv_outputPackage_8_0= ruleQualifiedName ) ) otherlv_9= ';' ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )* ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_period_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_outputPackage_8_0 = null;

        EObject lv_adaptationRules_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'period[ms]' ( (lv_period_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'java output package' ( (lv_outputPackage_8_0= ruleQualifiedName ) ) otherlv_9= ';' ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'period[ms]' ( (lv_period_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'java output package' ( (lv_outputPackage_8_0= ruleQualifiedName ) ) otherlv_9= ';' ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'period[ms]' ( (lv_period_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'java output package' ( (lv_outputPackage_8_0= ruleQualifiedName ) ) otherlv_9= ';' ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'period[ms]' ( (lv_period_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'java output package' ( (lv_outputPackage_8_0= ruleQualifiedName ) ) otherlv_9= ';' ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:83:3: lv_imports_0_0= ruleImport
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
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:103:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:104:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:104:1: (lv_name_2_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:105:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel161); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAdaptationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel178); 

                	newLeafNode(otherlv_3, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAdaptationModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getAdaptationModelAccess().getPeriodMsKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:129:1: ( (lv_period_5_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:130:1: (lv_period_5_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:130:1: (lv_period_5_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:131:3: lv_period_5_0= RULE_INT
            {
            lv_period_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAdaptationModel207); 

            			newLeafNode(lv_period_5_0, grammarAccess.getAdaptationModelAccess().getPeriodINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel224); 

                	newLeafNode(otherlv_6, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAdaptationModel236); 

                	newLeafNode(otherlv_7, grammarAccess.getAdaptationModelAccess().getJavaOutputPackageKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:155:1: ( (lv_outputPackage_8_0= ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:156:1: (lv_outputPackage_8_0= ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:156:1: (lv_outputPackage_8_0= ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:157:3: lv_outputPackage_8_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getOutputPackageQualifiedNameParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAdaptationModel257);
            lv_outputPackage_8_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	        }
                   		set(
                   			current, 
                   			"outputPackage",
                    		lv_outputPackage_8_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel269); 

                	newLeafNode(otherlv_9, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_9());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:177:1: ( (lv_adaptationRules_10_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:178:1: (lv_adaptationRules_10_0= ruleAdaptationRule )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:178:1: (lv_adaptationRules_10_0= ruleAdaptationRule )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:179:3: lv_adaptationRules_10_0= ruleAdaptationRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel290);
            	    lv_adaptationRules_10_0=ruleAdaptationRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"adaptationRules",
            	            		lv_adaptationRules_10_0, 
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:203:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:204:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:205:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport327);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport337); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:212:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:215:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:216:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:216:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:216:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport374); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:220:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:221:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:221:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:222:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport391); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport408); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:252:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:253:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:254:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName447);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName458); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:261:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:264:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:265:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:265:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:265:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName498); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:272:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:273:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName517); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName532); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:293:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:294:2: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:295:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule579);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationRule589); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:302:1: ruleAdaptationRule returns [EObject current=null] : (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRule_0 = null;

        EObject this_RuleSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:305:28: ( (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:306:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:306:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:307:5: this_AtomicRule_0= ruleAtomicRule
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getAtomicRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRule_in_ruleAdaptationRule636);
                    this_AtomicRule_0=ruleAtomicRule();

                    state._fsp--;

                     
                            current = this_AtomicRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:317:5: this_RuleSet_1= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleAdaptationRule663);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:333:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:334:2: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:335:2: iv_ruleAtomicRule= ruleAtomicRule EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleRule()); 
            pushFollow(FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule698);
            iv_ruleAtomicRule=ruleAtomicRule();

            state._fsp--;

             current =iv_ruleAtomicRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRule708); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:342:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:346:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:346:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:346:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAtomicRule745); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRule762); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtomicRule779); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:372:1: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:373:1: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:373:1: (lv_ruleBody_3_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:374:3: lv_ruleBody_3_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRule800);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAtomicRule812); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleAtomicRule824); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:406:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:407:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:408:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet860);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet870); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:415:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:418:28: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:419:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:419:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:419:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleSet907); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:424:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:424:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleSet924); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRuleSet941); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:445:1: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:446:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:446:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:447:3: lv_atomicRules_3_0= ruleAtomicRuleWithPriority
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getAtomicRulesAtomicRuleWithPriorityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet962);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRuleSet975); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRuleSet987); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:479:1: entryRuleAtomicRuleWithPriority returns [EObject current=null] : iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF ;
    public final EObject entryRuleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRuleWithPriority = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:480:2: (iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:481:2: iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleWithPriorityRule()); 
            pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority1023);
            iv_ruleAtomicRuleWithPriority=ruleAtomicRuleWithPriority();

            state._fsp--;

             current =iv_ruleAtomicRuleWithPriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority1033); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:488:1: ruleAtomicRuleWithPriority returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:491:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:492:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAtomicRuleWithPriority1070); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:496:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:497:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:497:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:498:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1087); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAtomicRuleWithPriority1104); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:518:1: ( (lv_priorityValue_3_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:519:1: (lv_priorityValue_3_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:519:1: (lv_priorityValue_3_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:520:3: lv_priorityValue_3_0= RULE_INT
            {
            lv_priorityValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1121); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAtomicRuleWithPriority1138); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:540:1: ( (lv_ruleBody_5_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:541:1: (lv_ruleBody_5_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:541:1: (lv_ruleBody_5_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:542:3: lv_ruleBody_5_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1159);
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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAtomicRuleWithPriority1171); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:570:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:572:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1207);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1217); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:579:1: ruleAtomicAction returns [EObject current=null] : ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:582:28: ( ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:583:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:583:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:583:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:583:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 31:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:584:5: this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionSelectFeatureParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1265);
                    this_AtomicActionSelectFeature_0=ruleAtomicActionSelectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionSelectFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:594:5: this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionDeselectFeatureParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1292);
                    this_AtomicActionDeselectFeature_1=ruleAtomicActionDeselectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionDeselectFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:604:5: this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionModifyAttributeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1319);
                    this_AtomicActionModifyAttribute_2=ruleAtomicActionModifyAttribute();

                    state._fsp--;

                     
                            current = this_AtomicActionModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:614:5: this_AtomicActionQuery_3= ruleAtomicActionQuery
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionQueryParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1346);
                    this_AtomicActionQuery_3=ruleAtomicActionQuery();

                    state._fsp--;

                     
                            current = this_AtomicActionQuery_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:622:2: (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:622:4: otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAtomicAction1359); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomicActionAccess().getANDKeyword_1_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:626:1: ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:627:1: (lv_secondAction_5_0= ruleAtomicAction )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:627:1: (lv_secondAction_5_0= ruleAtomicAction )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:628:3: lv_secondAction_5_0= ruleAtomicAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicActionAccess().getSecondActionAtomicActionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicAction_in_ruleAtomicAction1380);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:652:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:653:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:654:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody1418);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody1428); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:661:1: ruleRuleBody returns [EObject current=null] : (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:664:28: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:665:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:665:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=29)||LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:666:5: this_PureAction_0= rulePureAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getPureActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePureAction_in_ruleRuleBody1475);
                    this_PureAction_0=rulePureAction();

                    state._fsp--;

                     
                            current = this_PureAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:676:5: this_ConditionAction_1= ruleConditionAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getConditionActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConditionAction_in_ruleRuleBody1502);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:692:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:693:2: (iv_rulePureAction= rulePureAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:694:2: iv_rulePureAction= rulePureAction EOF
            {
             newCompositeNode(grammarAccess.getPureActionRule()); 
            pushFollow(FOLLOW_rulePureAction_in_entryRulePureAction1537);
            iv_rulePureAction=rulePureAction();

            state._fsp--;

             current =iv_rulePureAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePureAction1547); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:701:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:704:28: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:706:1: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:706:1: (lv_atomicAction_0_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:707:3: lv_atomicAction_0_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_rulePureAction1592);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:731:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:732:2: (iv_ruleConditionAction= ruleConditionAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:733:2: iv_ruleConditionAction= ruleConditionAction EOF
            {
             newCompositeNode(grammarAccess.getConditionActionRule()); 
            pushFollow(FOLLOW_ruleConditionAction_in_entryRuleConditionAction1627);
            iv_ruleConditionAction=ruleConditionAction();

            state._fsp--;

             current =iv_ruleConditionAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionAction1637); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:740:1: ruleConditionAction returns [EObject current=null] : ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:743:28: ( ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:4: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleConditionAction1675); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getIfKeyword_0_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleConditionAction1687); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_0_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:752:1: ( (lv_condition_2_0= ruleCondition ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:1: (lv_condition_2_0= ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:753:1: (lv_condition_2_0= ruleCondition )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:754:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getConditionConditionParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleConditionAction1708);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleConditionAction1720); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_0_3());
                

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:774:2: ( (lv_atomicAction_4_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:775:1: (lv_atomicAction_4_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:775:1: (lv_atomicAction_4_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:776:3: lv_atomicAction_4_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_ruleConditionAction1742);
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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:792:2: (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:792:4: otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleConditionAction1755); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getElseKeyword_2_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:796:1: ( (lv_else_6_0= ruleRuleBody ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:1: (lv_else_6_0= ruleRuleBody )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:1: (lv_else_6_0= ruleRuleBody )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:798:3: lv_else_6_0= ruleRuleBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionActionAccess().getElseRuleBodyParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleBody_in_ruleConditionAction1776);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:822:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:824:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1814);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1824); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:831:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Enumerator lv_operator_1_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:834:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:836:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:836:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:837:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition1872);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:850:2: ( (lv_operator_1_0= ruleMathOperator ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:851:1: (lv_operator_1_0= ruleMathOperator )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:851:1: (lv_operator_1_0= ruleMathOperator )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:852:3: lv_operator_1_0= ruleMathOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathOperator_in_ruleCondition1893);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"MathOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:868:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:869:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:869:1: (lv_value_2_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:870:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition1910); 

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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:886:2: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22||LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:886:3: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:886:3: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:887:1: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:887:1: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:888:3: lv_logicalOp_3_0= ruleLogicalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCondition1937);
                    lv_logicalOp_3_0=ruleLogicalOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"logicalOp",
                            		lv_logicalOp_3_0, 
                            		"LogicalOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:904:2: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:905:1: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:905:1: (lv_secondTerm_4_0= ruleCondition )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:906:3: lv_secondTerm_4_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSecondTermConditionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition1958);
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


    // $ANTLR start "entryRuleAtomicActionSelectFeature"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:930:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:931:2: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:932:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionSelectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature1996);
            iv_ruleAtomicActionSelectFeature=ruleAtomicActionSelectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionSelectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2006); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:939:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:942:28: ( (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:943:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:943:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:943:3: otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAtomicActionSelectFeature2043); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getActivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionSelectFeature2055); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:951:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:952:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:952:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:953:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionSelectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2078);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionSelectFeature2090); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:978:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:979:2: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:980:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2126);
            iv_ruleAtomicActionDeselectFeature=ruleAtomicActionDeselectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionDeselectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2136); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:987:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:990:28: ( (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:991:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:991:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:991:3: otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionDeselectFeature2173); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getDeactivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionDeselectFeature2185); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:999:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1000:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1000:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1001:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionDeselectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2208);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionDeselectFeature2220); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1026:1: entryRuleAtomicActionModifyAttribute returns [EObject current=null] : iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF ;
    public final EObject entryRuleAtomicActionModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1027:2: (iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1028:2: iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2256);
            iv_ruleAtomicActionModifyAttribute=ruleAtomicActionModifyAttribute();

            state._fsp--;

             current =iv_ruleAtomicActionModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2266); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1035:1: ruleAtomicActionModifyAttribute returns [EObject current=null] : (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1038:28: ( (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1039:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1039:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1039:3: otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionModifyAttribute2303); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionModifyAttributeAccess().getSet_attributeKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionModifyAttribute2315); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1047:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1048:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1048:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1049:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionModifyAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2338);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionModifyAttribute2350); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleAtomicActionModifyAttribute2362); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionModifyAttributeAccess().getWith_valueKeyword_4());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionModifyAttribute2374); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1074:1: ( (lv_attributeValue_6_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (lv_attributeValue_6_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1075:1: (lv_attributeValue_6_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1076:3: lv_attributeValue_6_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2395);
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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionModifyAttribute2407); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1104:1: entryRuleAtomicActionQuery returns [EObject current=null] : iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF ;
    public final EObject entryRuleAtomicActionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionQuery = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1105:2: (iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1106:2: iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionQueryRule()); 
            pushFollow(FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2443);
            iv_ruleAtomicActionQuery=ruleAtomicActionQuery();

            state._fsp--;

             current =iv_ruleAtomicActionQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionQuery2453); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1113:1: ruleAtomicActionQuery returns [EObject current=null] : (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
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
        Enumerator lv_queryOperator_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1116:28: ( (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1117:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1117:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1117:3: otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAtomicActionQuery2490); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionQueryAccess().getSelect_feature_Keyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleAtomicActionQuery2502); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionQueryAccess().getFrom_variants_of_featureKeyword_1());
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionQuery2514); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1129:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1130:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1130:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1131:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionQueryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getFeatureFeatureCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2537);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionQuery2549); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleAtomicActionQuery2561); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionQueryAccess().getWhere_attribueKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1152:1: ( (lv_queryOperator_6_0= ruleQueryOperator ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:1: (lv_queryOperator_6_0= ruleQueryOperator )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:1: (lv_queryOperator_6_0= ruleQueryOperator )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:3: lv_queryOperator_6_0= ruleQueryOperator
            {
             
            	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getQueryOperatorQueryOperatorEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2582);
            lv_queryOperator_6_0=ruleQueryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicActionQueryRule());
            	        }
                   		set(
                   			current, 
                   			"queryOperator",
                    		lv_queryOperator_6_0, 
                    		"QueryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleAtomicActionQuery2594); 

                	newLeafNode(otherlv_7, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1174:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1175:1: (lv_value_8_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1175:1: (lv_value_8_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1176:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2611); 

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

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleAtomicActionQuery2628); 

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


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1204:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1205:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1206:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2664);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2674); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1213:1: ruleAttributeValue returns [EObject current=null] : (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttributeValue_0 = null;

        EObject this_NFRAttributeValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1216:28: ( (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1217:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1217:1: (this_StringAttributeValue_0= ruleStringAttributeValue | this_NFRAttributeValue_1= ruleNFRAttributeValue )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1218:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2721);
                    this_StringAttributeValue_0=ruleStringAttributeValue();

                    state._fsp--;

                     
                            current = this_StringAttributeValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1228:5: this_NFRAttributeValue_1= ruleNFRAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getNFRAttributeValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2748);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1244:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1245:2: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1246:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2783);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue2793); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1253:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1256:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1257:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1257:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1258:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1258:1: (lv_value_0_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1259:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue2834); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1283:1: entryRuleNFRAttributeValue returns [EObject current=null] : iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF ;
    public final EObject entryRuleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFRAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1284:2: (iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1285:2: iv_ruleNFRAttributeValue= ruleNFRAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNFRAttributeValueRule()); 
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2874);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue2884); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1292:1: ruleNFRAttributeValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNFRAttributeValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1295:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1296:1: ( ( ruleQualifiedName ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1296:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1297:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1297:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1298:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRAttributeValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2931);
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


    // $ANTLR start "ruleMathOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1319:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1321:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1322:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1322:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 37:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1322:2: (enumLiteral_0= '<' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1322:2: (enumLiteral_0= '<' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1322:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleMathOperator2980); 

                            current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1328:6: (enumLiteral_1= '>' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1328:6: (enumLiteral_1= '>' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1328:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleMathOperator2997); 

                            current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1334:6: (enumLiteral_2= '==' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1334:6: (enumLiteral_2= '==' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1334:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleMathOperator3014); 

                            current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1340:6: (enumLiteral_3= '<>' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1340:6: (enumLiteral_3= '<>' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1340:8: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleMathOperator3031); 

                            current = grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1350:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1352:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1353:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1353:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1353:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1353:2: (enumLiteral_0= 'AND' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1353:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleLogicalOperator3076); 

                            current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1359:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1359:6: (enumLiteral_1= 'OR' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1359:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleLogicalOperator3093); 

                            current = grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleQueryOperator"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1369:1: ruleQueryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) ) ;
    public final Enumerator ruleQueryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1371:28: ( ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1372:1: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1372:1: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1372:2: (enumLiteral_0= 'max' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1372:2: (enumLiteral_0= 'max' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1372:4: enumLiteral_0= 'max'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleQueryOperator3138); 

                            current = grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1378:6: (enumLiteral_1= 'min' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1378:6: (enumLiteral_1= 'min' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1378:8: enumLiteral_1= 'min'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleQueryOperator3155); 

                            current = grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1384:6: (enumLiteral_2= 'is' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1384:6: (enumLiteral_2= 'is' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1384:8: enumLiteral_2= 'is'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleQueryOperator3172); 

                            current = grammarAccess.getQueryOperatorAccess().getISEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQueryOperatorAccess().getISEnumLiteralDeclaration_2()); 
                        

                    }


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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleAdaptationModel144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAdaptationModel190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAdaptationModel207 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel224 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAdaptationModel236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAdaptationModel257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel269 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel290 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName498 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName532 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationRule589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_ruleAdaptationRule636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAdaptationRule663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRule708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAtomicRule745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRule762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicRule779 = new BitSet(new long[]{0x00000000B8800000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRule800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicRule812 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicRule824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleSet907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleSet924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRuleSet941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet962 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_19_in_ruleRuleSet975 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRuleSet987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAtomicRuleWithPriority1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1087 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAtomicRuleWithPriority1104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1121 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicRuleWithPriority1138 = new BitSet(new long[]{0x00000000B8800000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicRuleWithPriority1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1265 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1292 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1319 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1346 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAtomicAction1359 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleAtomicAction1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_ruleRuleBody1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_ruleRuleBody1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_entryRulePureAction1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePureAction1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rulePureAction1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_entryRuleConditionAction1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionAction1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConditionAction1675 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConditionAction1687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConditionAction1708 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConditionAction1720 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleConditionAction1742 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleConditionAction1755 = new BitSet(new long[]{0x00000000B8800000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleConditionAction1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition1872 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleCondition1893 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition1910 = new BitSet(new long[]{0x0000004000400002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCondition1937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAtomicActionSelectFeature2043 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionSelectFeature2055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2078 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionSelectFeature2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionDeselectFeature2173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionDeselectFeature2185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionDeselectFeature2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionModifyAttribute2303 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionModifyAttribute2315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2338 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionModifyAttribute2350 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAtomicActionModifyAttribute2362 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionModifyAttribute2374 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2395 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionModifyAttribute2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionQuery2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtomicActionQuery2490 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAtomicActionQuery2502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionQuery2514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2537 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionQuery2549 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAtomicActionQuery2561 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicActionQuery2594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2611 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicActionQuery2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMathOperator2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMathOperator2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMathOperator3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMathOperator3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLogicalOperator3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLogicalOperator3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleQueryOperator3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleQueryOperator3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleQueryOperator3172 = new BitSet(new long[]{0x0000000000000002L});

}