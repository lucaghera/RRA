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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature model'", "';'", "'template system model'", "'resolution model'", "'cdm model'", "'data types model'", "'name'", "'period[ms]'", "'import'", "'.'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'AND'", "'if'", "'('", "')'", "'else'", "'activate_feature'", "'deactivate_feature'", "'set_attribute'", "'with_value'", "'select_feature_*'", "'from_variants_of_feature'", "'where_attribue'", "'<'", "'>'", "'=='", "'<>'", "'OR'", "'max'", "'min'", "'is'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:77:1: ruleAdaptationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'feature model' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'template system model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'resolution model' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'cdm model' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'data types model' ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' otherlv_16= 'name' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ';' otherlv_19= 'period[ms]' ( (lv_period_20_0= RULE_INT ) ) otherlv_21= ';' ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )* ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_period_20_0=null;
        Token otherlv_21=null;
        EObject lv_imports_0_0 = null;

        EObject lv_adaptationRules_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'feature model' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'template system model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'resolution model' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'cdm model' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'data types model' ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' otherlv_16= 'name' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ';' otherlv_19= 'period[ms]' ( (lv_period_20_0= RULE_INT ) ) otherlv_21= ';' ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'feature model' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'template system model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'resolution model' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'cdm model' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'data types model' ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' otherlv_16= 'name' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ';' otherlv_19= 'period[ms]' ( (lv_period_20_0= RULE_INT ) ) otherlv_21= ';' ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'feature model' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'template system model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'resolution model' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'cdm model' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'data types model' ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' otherlv_16= 'name' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ';' otherlv_19= 'period[ms]' ( (lv_period_20_0= RULE_INT ) ) otherlv_21= ';' ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'feature model' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'template system model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'resolution model' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'cdm model' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'data types model' ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' otherlv_16= 'name' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ';' otherlv_19= 'period[ms]' ( (lv_period_20_0= RULE_INT ) ) otherlv_21= ';' ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
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

                	newLeafNode(otherlv_1, grammarAccess.getAdaptationModelAccess().getFeatureModelKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:103:1: ( (otherlv_2= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:104:1: (otherlv_2= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:104:1: (otherlv_2= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:105:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel164); 

            		newLeafNode(otherlv_2, grammarAccess.getAdaptationModelAccess().getFeatureModelFeatureModelCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel176); 

                	newLeafNode(otherlv_3, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAdaptationModel188); 

                	newLeafNode(otherlv_4, grammarAccess.getAdaptationModelAccess().getTemplateSystemModelKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:124:1: ( (otherlv_5= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:125:1: (otherlv_5= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:125:1: (otherlv_5= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:126:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel208); 

            		newLeafNode(otherlv_5, grammarAccess.getAdaptationModelAccess().getTempalteSystemModelSystemCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel220); 

                	newLeafNode(otherlv_6, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAdaptationModel232); 

                	newLeafNode(otherlv_7, grammarAccess.getAdaptationModelAccess().getResolutionModelKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:145:1: ( (otherlv_8= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:146:1: (otherlv_8= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:146:1: (otherlv_8= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:147:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel252); 

            		newLeafNode(otherlv_8, grammarAccess.getAdaptationModelAccess().getResolutionModelResolutionModelCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel264); 

                	newLeafNode(otherlv_9, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_9());
                
            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAdaptationModel276); 

                	newLeafNode(otherlv_10, grammarAccess.getAdaptationModelAccess().getCdmModelKeyword_10());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:166:1: ( (otherlv_11= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:167:1: (otherlv_11= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:167:1: (otherlv_11= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:168:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel296); 

            		newLeafNode(otherlv_11, grammarAccess.getAdaptationModelAccess().getCdmModelContextDependentMeasurementsModelCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel308); 

                	newLeafNode(otherlv_12, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_12());
                
            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleAdaptationModel320); 

                	newLeafNode(otherlv_13, grammarAccess.getAdaptationModelAccess().getDataTypesModelKeyword_13());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:187:1: ( (otherlv_14= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:1: (otherlv_14= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:1: (otherlv_14= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:189:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel340); 

            		newLeafNode(otherlv_14, grammarAccess.getAdaptationModelAccess().getDataTypesModelDataTypesModelCrossReference_14_0()); 
            	

            }


            }

            otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel352); 

                	newLeafNode(otherlv_15, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_15());
                
            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleAdaptationModel364); 

                	newLeafNode(otherlv_16, grammarAccess.getAdaptationModelAccess().getNameKeyword_16());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:208:1: ( (lv_name_17_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:209:1: (lv_name_17_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:209:1: (lv_name_17_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:210:3: lv_name_17_0= RULE_ID
            {
            lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdaptationModel381); 

            			newLeafNode(lv_name_17_0, grammarAccess.getAdaptationModelAccess().getNameIDTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_17_0, 
                    		"ID");
            	    

            }


            }

            otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel398); 

                	newLeafNode(otherlv_18, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_18());
                
            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleAdaptationModel410); 

                	newLeafNode(otherlv_19, grammarAccess.getAdaptationModelAccess().getPeriodMsKeyword_19());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:234:1: ( (lv_period_20_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:235:1: (lv_period_20_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:235:1: (lv_period_20_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:236:3: lv_period_20_0= RULE_INT
            {
            lv_period_20_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAdaptationModel427); 

            			newLeafNode(lv_period_20_0, grammarAccess.getAdaptationModelAccess().getPeriodINTTerminalRuleCall_20_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdaptationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_20_0, 
                    		"INT");
            	    

            }


            }

            otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleAdaptationModel444); 

                	newLeafNode(otherlv_21, grammarAccess.getAdaptationModelAccess().getSemicolonKeyword_21());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:256:1: ( (lv_adaptationRules_22_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:257:1: (lv_adaptationRules_22_0= ruleAdaptationRule )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:257:1: (lv_adaptationRules_22_0= ruleAdaptationRule )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:258:3: lv_adaptationRules_22_0= ruleAdaptationRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_22_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel465);
            	    lv_adaptationRules_22_0=ruleAdaptationRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"adaptationRules",
            	            		lv_adaptationRules_22_0, 
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:282:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:283:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:284:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport502);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport512); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:291:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:294:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:295:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:295:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:295:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleImport549); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:299:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:300:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:300:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:301:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport566); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport583); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:331:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:332:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName622);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName633); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:340:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:343:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:344:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:344:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:344:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName673); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:352:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName692); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName707); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:372:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:373:2: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:374:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule754);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdaptationRule764); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:381:1: ruleAdaptationRule returns [EObject current=null] : (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRule_0 = null;

        EObject this_RuleSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:384:28: ( (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:385:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:385:1: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:386:5: this_AtomicRule_0= ruleAtomicRule
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getAtomicRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRule_in_ruleAdaptationRule811);
                    this_AtomicRule_0=ruleAtomicRule();

                    state._fsp--;

                     
                            current = this_AtomicRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:396:5: this_RuleSet_1= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleAdaptationRule838);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:412:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:413:2: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:414:2: iv_ruleAtomicRule= ruleAtomicRule EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleRule()); 
            pushFollow(FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule873);
            iv_ruleAtomicRule=ruleAtomicRule();

            state._fsp--;

             current =iv_ruleAtomicRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRule883); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:421:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:424:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:425:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:425:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:425:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAtomicRule920); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:429:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:430:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:430:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:431:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRule937); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAtomicRule954); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:451:1: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:452:1: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:452:1: (lv_ruleBody_3_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:453:3: lv_ruleBody_3_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRule975);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAtomicRule987); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleAtomicRule999); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:485:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:486:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:487:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet1035);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet1045); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:494:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:497:28: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:498:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:498:1: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:498:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRuleSet1082); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:502:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:503:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:503:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:504:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleSet1099); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleRuleSet1116); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:524:1: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:525:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:525:1: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:526:3: lv_atomicRules_3_0= ruleAtomicRuleWithPriority
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getAtomicRulesAtomicRuleWithPriorityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet1137);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRuleSet1150); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRuleSet1162); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:558:1: entryRuleAtomicRuleWithPriority returns [EObject current=null] : iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF ;
    public final EObject entryRuleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRuleWithPriority = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:559:2: (iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:560:2: iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleWithPriorityRule()); 
            pushFollow(FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority1198);
            iv_ruleAtomicRuleWithPriority=ruleAtomicRuleWithPriority();

            state._fsp--;

             current =iv_ruleAtomicRuleWithPriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority1208); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:567:1: ruleAtomicRuleWithPriority returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:570:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAtomicRuleWithPriority1245); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:575:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:576:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:576:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1262); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAtomicRuleWithPriority1279); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:597:1: ( (lv_priorityValue_3_0= RULE_INT ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:598:1: (lv_priorityValue_3_0= RULE_INT )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:598:1: (lv_priorityValue_3_0= RULE_INT )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:599:3: lv_priorityValue_3_0= RULE_INT
            {
            lv_priorityValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1296); 

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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAtomicRuleWithPriority1313); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:619:1: ( (lv_ruleBody_5_0= ruleRuleBody ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:620:1: (lv_ruleBody_5_0= ruleRuleBody )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:620:1: (lv_ruleBody_5_0= ruleRuleBody )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:621:3: lv_ruleBody_5_0= ruleRuleBody
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1334);
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleAtomicRuleWithPriority1346); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:649:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:650:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:651:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1382);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1392); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:658:1: ruleAtomicAction returns [EObject current=null] : ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:661:28: ( ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:1: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery ) (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature | this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute | this_AtomicActionQuery_3= ruleAtomicActionQuery )
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:5: this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionSelectFeatureParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1440);
                    this_AtomicActionSelectFeature_0=ruleAtomicActionSelectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionSelectFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:673:5: this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionDeselectFeatureParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1467);
                    this_AtomicActionDeselectFeature_1=ruleAtomicActionDeselectFeature();

                    state._fsp--;

                     
                            current = this_AtomicActionDeselectFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:683:5: this_AtomicActionModifyAttribute_2= ruleAtomicActionModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionModifyAttributeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1494);
                    this_AtomicActionModifyAttribute_2=ruleAtomicActionModifyAttribute();

                    state._fsp--;

                     
                            current = this_AtomicActionModifyAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:693:5: this_AtomicActionQuery_3= ruleAtomicActionQuery
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getAtomicActionQueryParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1521);
                    this_AtomicActionQuery_3=ruleAtomicActionQuery();

                    state._fsp--;

                     
                            current = this_AtomicActionQuery_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:701:2: (otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:701:4: otherlv_4= 'AND' ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAtomicAction1534); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomicActionAccess().getANDKeyword_1_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:1: ( (lv_secondAction_5_0= ruleAtomicAction ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:706:1: (lv_secondAction_5_0= ruleAtomicAction )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:706:1: (lv_secondAction_5_0= ruleAtomicAction )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:707:3: lv_secondAction_5_0= ruleAtomicAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicActionAccess().getSecondActionAtomicActionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicAction_in_ruleAtomicAction1555);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:731:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:732:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:733:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody1593);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody1603); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:740:1: ruleRuleBody returns [EObject current=null] : (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:743:28: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:744:1: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=31 && LA8_0<=33)||LA8_0==35) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:745:5: this_PureAction_0= rulePureAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getPureActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePureAction_in_ruleRuleBody1650);
                    this_PureAction_0=rulePureAction();

                    state._fsp--;

                     
                            current = this_PureAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:755:5: this_ConditionAction_1= ruleConditionAction
                    {
                     
                            newCompositeNode(grammarAccess.getRuleBodyAccess().getConditionActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConditionAction_in_ruleRuleBody1677);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:771:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:772:2: (iv_rulePureAction= rulePureAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:773:2: iv_rulePureAction= rulePureAction EOF
            {
             newCompositeNode(grammarAccess.getPureActionRule()); 
            pushFollow(FOLLOW_rulePureAction_in_entryRulePureAction1712);
            iv_rulePureAction=rulePureAction();

            state._fsp--;

             current =iv_rulePureAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePureAction1722); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:780:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:783:28: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:784:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:784:1: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:785:1: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:785:1: (lv_atomicAction_0_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:786:3: lv_atomicAction_0_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_rulePureAction1767);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:810:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:811:2: (iv_ruleConditionAction= ruleConditionAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:812:2: iv_ruleConditionAction= ruleConditionAction EOF
            {
             newCompositeNode(grammarAccess.getConditionActionRule()); 
            pushFollow(FOLLOW_ruleConditionAction_in_entryRuleConditionAction1802);
            iv_ruleConditionAction=ruleConditionAction();

            state._fsp--;

             current =iv_ruleConditionAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionAction1812); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:819:1: ruleConditionAction returns [EObject current=null] : ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:822:28: ( ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( (lv_atomicAction_4_0= ruleAtomicAction ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:4: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConditionAction1850); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getIfKeyword_0_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleConditionAction1862); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_0_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:831:1: ( (lv_condition_2_0= ruleCondition ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:832:1: (lv_condition_2_0= ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:832:1: (lv_condition_2_0= ruleCondition )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:833:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getConditionConditionParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleConditionAction1883);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleConditionAction1895); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_0_3());
                

            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:853:2: ( (lv_atomicAction_4_0= ruleAtomicAction ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:854:1: (lv_atomicAction_4_0= ruleAtomicAction )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:854:1: (lv_atomicAction_4_0= ruleAtomicAction )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:855:3: lv_atomicAction_4_0= ruleAtomicAction
            {
             
            	        newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicAction_in_ruleConditionAction1917);
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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:871:2: (otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:871:4: otherlv_5= 'else' ( (lv_else_6_0= ruleRuleBody ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleConditionAction1930); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getElseKeyword_2_0());
                        
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:875:1: ( (lv_else_6_0= ruleRuleBody ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:876:1: (lv_else_6_0= ruleRuleBody )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:876:1: (lv_else_6_0= ruleRuleBody )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:877:3: lv_else_6_0= ruleRuleBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionActionAccess().getElseRuleBodyParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleBody_in_ruleConditionAction1951);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:902:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1989);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1999); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:910:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Enumerator lv_operator_1_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:914:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:914:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:914:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:914:2: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:916:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getMeasurementContextDependentMeasurementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition2047);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:929:2: ( (lv_operator_1_0= ruleMathOperator ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:930:1: (lv_operator_1_0= ruleMathOperator )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:930:1: (lv_operator_1_0= ruleMathOperator )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:931:3: lv_operator_1_0= ruleMathOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathOperator_in_ruleCondition2068);
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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:947:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:948:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:948:1: (lv_value_2_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:949:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition2085); 

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

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:965:2: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26||LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:965:3: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:965:3: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:966:1: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:966:1: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:967:3: lv_logicalOp_3_0= ruleLogicalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCondition2112);
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

                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:983:2: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:984:1: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:984:1: (lv_secondTerm_4_0= ruleCondition )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:985:3: lv_secondTerm_4_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSecondTermConditionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition2133);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1009:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1010:2: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1011:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionSelectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature2171);
            iv_ruleAtomicActionSelectFeature=ruleAtomicActionSelectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionSelectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2181); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1018:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1021:28: ( (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1022:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1022:1: (otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1022:3: otherlv_0= 'activate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAtomicActionSelectFeature2218); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getActivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionSelectFeature2230); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1030:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1031:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1031:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1032:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionSelectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2253);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionSelectFeature2265); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1057:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1058:2: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1059:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureRule()); 
            pushFollow(FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2301);
            iv_ruleAtomicActionDeselectFeature=ruleAtomicActionDeselectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionDeselectFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2311); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1066:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1069:28: ( (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1070:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1070:1: (otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1070:3: otherlv_0= 'deactivate_feature' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAtomicActionDeselectFeature2348); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getDeactivate_featureKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionDeselectFeature2360); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1078:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1079:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1079:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1080:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionDeselectFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getFeatureFeatureCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2383);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionDeselectFeature2395); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1105:1: entryRuleAtomicActionModifyAttribute returns [EObject current=null] : iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF ;
    public final EObject entryRuleAtomicActionModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1106:2: (iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1107:2: iv_ruleAtomicActionModifyAttribute= ruleAtomicActionModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2431);
            iv_ruleAtomicActionModifyAttribute=ruleAtomicActionModifyAttribute();

            state._fsp--;

             current =iv_ruleAtomicActionModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2441); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1114:1: ruleAtomicActionModifyAttribute returns [EObject current=null] : (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1117:28: ( (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1118:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1118:1: (otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1118:3: otherlv_0= 'set_attribute' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' otherlv_4= 'with_value' otherlv_5= '(' ( (lv_attributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAtomicActionModifyAttribute2478); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionModifyAttributeAccess().getSet_attributeKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionModifyAttribute2490); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_1());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1126:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1127:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1127:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1128:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionModifyAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getFeatureAttributeCVAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2513);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionModifyAttribute2525); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicActionModifyAttributeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleAtomicActionModifyAttribute2537); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionModifyAttributeAccess().getWith_valueKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionModifyAttribute2549); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionModifyAttributeAccess().getLeftParenthesisKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1153:1: ( (lv_attributeValue_6_0= ruleAttributeValue ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:1: (lv_attributeValue_6_0= ruleAttributeValue )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1154:1: (lv_attributeValue_6_0= ruleAttributeValue )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1155:3: lv_attributeValue_6_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicActionModifyAttributeAccess().getAttributeValueAttributeValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2570);
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

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionModifyAttribute2582); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1183:1: entryRuleAtomicActionQuery returns [EObject current=null] : iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF ;
    public final EObject entryRuleAtomicActionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionQuery = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1184:2: (iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1185:2: iv_ruleAtomicActionQuery= ruleAtomicActionQuery EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionQueryRule()); 
            pushFollow(FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2618);
            iv_ruleAtomicActionQuery=ruleAtomicActionQuery();

            state._fsp--;

             current =iv_ruleAtomicActionQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicActionQuery2628); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1192:1: ruleAtomicActionQuery returns [EObject current=null] : (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
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
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1195:28: ( (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1196:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1196:1: (otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1196:3: otherlv_0= 'select_feature_*' otherlv_1= 'from_variants_of_feature' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' otherlv_5= 'where_attribue' ( (lv_queryOperator_6_0= ruleQueryOperator ) ) otherlv_7= '(' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAtomicActionQuery2665); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicActionQueryAccess().getSelect_feature_Keyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomicActionQuery2677); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicActionQueryAccess().getFrom_variants_of_featureKeyword_1());
                
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionQuery2689); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_2());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1208:1: ( ( ruleQualifiedName ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1209:1: ( ruleQualifiedName )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1209:1: ( ruleQualifiedName )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1210:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicActionQueryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getFeatureFeatureCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2712);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionQuery2724); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicActionQueryAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAtomicActionQuery2736); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicActionQueryAccess().getWhere_attribueKeyword_5());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1231:1: ( (lv_queryOperator_6_0= ruleQueryOperator ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1232:1: (lv_queryOperator_6_0= ruleQueryOperator )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1232:1: (lv_queryOperator_6_0= ruleQueryOperator )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1233:3: lv_queryOperator_6_0= ruleQueryOperator
            {
             
            	        newCompositeNode(grammarAccess.getAtomicActionQueryAccess().getQueryOperatorQueryOperatorEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2757);
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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleAtomicActionQuery2769); 

                	newLeafNode(otherlv_7, grammarAccess.getAtomicActionQueryAccess().getLeftParenthesisKeyword_7());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1253:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1254:1: (lv_value_8_0= RULE_STRING )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1254:1: (lv_value_8_0= RULE_STRING )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1255:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2786); 

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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleAtomicActionQuery2803); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1283:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1284:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1285:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2839);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2849); 

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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1297:5: this_StringAttributeValue_0= ruleStringAttributeValue
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2896);
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
                        
                    pushFollow(FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2923);
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
            pushFollow(FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2958);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttributeValue2968); 

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
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttributeValue3009); 

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
            pushFollow(FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue3049);
            iv_ruleNFRAttributeValue=ruleNFRAttributeValue();

            state._fsp--;

             current =iv_ruleNFRAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFRAttributeValue3059); 

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
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue3106);
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1398:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1400:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1401:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1401:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            case 41:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1401:2: (enumLiteral_0= '<' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1401:2: (enumLiteral_0= '<' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1401:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleMathOperator3155); 

                            current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1407:6: (enumLiteral_1= '>' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1407:6: (enumLiteral_1= '>' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1407:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleMathOperator3172); 

                            current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1413:6: (enumLiteral_2= '==' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1413:6: (enumLiteral_2= '==' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1413:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleMathOperator3189); 

                            current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1419:6: (enumLiteral_3= '<>' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1419:6: (enumLiteral_3= '<>' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1419:8: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleMathOperator3206); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1429:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1431:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1432:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1432:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1432:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1432:2: (enumLiteral_0= 'AND' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1432:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleLogicalOperator3251); 

                            current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1438:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1438:6: (enumLiteral_1= 'OR' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1438:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleLogicalOperator3268); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1448:1: ruleQueryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) ) ;
    public final Enumerator ruleQueryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1450:28: ( ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1451:1: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1451:1: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) | (enumLiteral_2= 'is' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
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
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1451:2: (enumLiteral_0= 'max' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1451:2: (enumLiteral_0= 'max' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1451:4: enumLiteral_0= 'max'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleQueryOperator3313); 

                            current = grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQueryOperatorAccess().getMAXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1457:6: (enumLiteral_1= 'min' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1457:6: (enumLiteral_1= 'min' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1457:8: enumLiteral_1= 'min'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleQueryOperator3330); 

                            current = grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQueryOperatorAccess().getMINEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1463:6: (enumLiteral_2= 'is' )
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1463:6: (enumLiteral_2= 'is' )
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1463:8: enumLiteral_2= 'is'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleQueryOperator3347); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_11_in_ruleAdaptationModel144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel164 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAdaptationModel188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel208 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAdaptationModel232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel264 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAdaptationModel276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel308 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAdaptationModel320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel340 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAdaptationModel364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdaptationModel381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAdaptationModel410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAdaptationModel427 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdaptationModel444 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_ruleAdaptationModel465 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleImport549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport566 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName673 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName707 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAdaptationRule_in_entryRuleAdaptationRule754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationRule764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_ruleAdaptationRule811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleAdaptationRule838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRule_in_entryRuleAtomicRule873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRule883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAtomicRule920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRule937 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicRule954 = new BitSet(new long[]{0x0000000B88000000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRule975 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicRule987 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicRule999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRuleSet1082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleSet1099 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleSet1116 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_ruleRuleSet1137 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleRuleSet1150 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRuleSet1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRuleWithPriority_in_entryRuleAtomicRuleWithPriority1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRuleWithPriority1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAtomicRuleWithPriority1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicRuleWithPriority1262 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicRuleWithPriority1279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicRuleWithPriority1296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicRuleWithPriority1313 = new BitSet(new long[]{0x0000000B88000000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleAtomicRuleWithPriority1334 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicRuleWithPriority1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_ruleAtomicAction1440 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_ruleAtomicAction1467 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_ruleAtomicAction1494 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_ruleAtomicAction1521 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAtomicAction1534 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleAtomicAction1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_ruleRuleBody1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_ruleRuleBody1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureAction_in_entryRulePureAction1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePureAction1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_rulePureAction1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionAction_in_entryRuleConditionAction1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionAction1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConditionAction1850 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConditionAction1862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConditionAction1883 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConditionAction1895 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleConditionAction1917 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleConditionAction1930 = new BitSet(new long[]{0x0000000B88000000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleConditionAction1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition2047 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleCondition2068 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition2085 = new BitSet(new long[]{0x0000040004000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCondition2112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionSelectFeature_in_entryRuleAtomicActionSelectFeature2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionSelectFeature2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtomicActionSelectFeature2218 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionSelectFeature2230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionSelectFeature2253 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionSelectFeature2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionDeselectFeature_in_entryRuleAtomicActionDeselectFeature2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionDeselectFeature2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomicActionDeselectFeature2348 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionDeselectFeature2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionDeselectFeature2383 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionDeselectFeature2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionModifyAttribute_in_entryRuleAtomicActionModifyAttribute2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionModifyAttribute2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomicActionModifyAttribute2478 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionModifyAttribute2490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionModifyAttribute2513 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionModifyAttribute2525 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAtomicActionModifyAttribute2537 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionModifyAttribute2549 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAtomicActionModifyAttribute2570 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionModifyAttribute2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicActionQuery_in_entryRuleAtomicActionQuery2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicActionQuery2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAtomicActionQuery2665 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAtomicActionQuery2677 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionQuery2689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicActionQuery2712 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionQuery2724 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAtomicActionQuery2736 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleQueryOperator_in_ruleAtomicActionQuery2757 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicActionQuery2769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicActionQuery2786 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicActionQuery2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_ruleAttributeValue2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_ruleAttributeValue2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttributeValue_in_entryRuleStringAttributeValue2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttributeValue2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttributeValue3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFRAttributeValue_in_entryRuleNFRAttributeValue3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFRAttributeValue3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNFRAttributeValue3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMathOperator3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMathOperator3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMathOperator3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMathOperator3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLogicalOperator3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLogicalOperator3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleQueryOperator3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleQueryOperator3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleQueryOperator3347 = new BitSet(new long[]{0x0000000000000002L});

}