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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IMPORT_TERMINAL", "RULE_AS", "RULE_ID", "RULE_RULE_TERMINAL", "RULE_IF", "RULE_THEN", "RULE_ELSE", "RULE_VALUE", "RULE_SMALLER", "RULE_BIGGER", "RULE_EQUAL", "RULE_AND", "RULE_OR", "RULE_SELECT", "RULE_DESELECT", "RULE_CHANGE", "RULE_WITH", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'.'", "':'", "'AVG ('", "','", "')'", "'MIN ('", "'MAX ('"
    };
    public static final int RULE_VALUE=11;
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int RULE_THEN=9;
    public static final int T__27=27;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_DESELECT=18;
    public static final int RULE_OR=16;
    public static final int RULE_SELECT=17;
    public static final int RULE_AND=15;
    public static final int RULE_EQUAL=14;
    public static final int RULE_SL_COMMENT=24;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SMALLER=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=22;
    public static final int RULE_BIGGER=13;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_INT=21;
    public static final int RULE_WITH=20;
    public static final int RULE_WS=25;
    public static final int RULE_IMPORT_TERMINAL=4;
    public static final int RULE_RULE_TERMINAL=7;
    public static final int RULE_IF=8;
    public static final int RULE_ELSE=10;
    public static final int RULE_AS=5;
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

                if ( (LA1_0==RULE_IMPORT_TERMINAL) ) {
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

                if ( (LA2_0==RULE_RULE_TERMINAL) ) {
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:133:1: ruleImport returns [EObject current=null] : (this_IMPORT_TERMINAL_0= RULE_IMPORT_TERMINAL ruleQualifiedNameWithWildcard this_AS_2= RULE_AS ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token this_IMPORT_TERMINAL_0=null;
        Token this_AS_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:136:28: ( (this_IMPORT_TERMINAL_0= RULE_IMPORT_TERMINAL ruleQualifiedNameWithWildcard this_AS_2= RULE_AS ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:1: (this_IMPORT_TERMINAL_0= RULE_IMPORT_TERMINAL ruleQualifiedNameWithWildcard this_AS_2= RULE_AS ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:1: (this_IMPORT_TERMINAL_0= RULE_IMPORT_TERMINAL ruleQualifiedNameWithWildcard this_AS_2= RULE_AS ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:137:2: this_IMPORT_TERMINAL_0= RULE_IMPORT_TERMINAL ruleQualifiedNameWithWildcard this_AS_2= RULE_AS ( (lv_name_3_0= RULE_ID ) )
            {
            this_IMPORT_TERMINAL_0=(Token)match(input,RULE_IMPORT_TERMINAL,FOLLOW_RULE_IMPORT_TERMINAL_in_ruleImport236); 
             
                newLeafNode(this_IMPORT_TERMINAL_0, grammarAccess.getImportAccess().getIMPORT_TERMINALTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getImportAccess().getQualifiedNameWithWildcardParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport251);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            this_AS_2=(Token)match(input,RULE_AS,FOLLOW_RULE_AS_in_ruleImport261); 
             
                newLeafNode(this_AS_2, grammarAccess.getImportAccess().getASTerminalRuleCall_2()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:153:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:154:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:154:1: (lv_name_3_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:155:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport277); 

            			newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:179:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:180:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:181:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard319);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard330); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:188:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:191:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:192:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:192:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:193:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard377);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:203:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:204:2: kw= '.*'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedNameWithWildcard396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:217:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:218:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:219:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName439);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName450); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:226:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:229:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:230:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:230:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:230:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName490); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:237:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:238:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName509); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName524); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:258:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:259:2: (iv_ruleRule= ruleRule EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:260:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule571);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule581); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:267:1: ruleRule returns [EObject current=null] : (this_RULE_TERMINAL_0= RULE_RULE_TERMINAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' this_IF_3= RULE_IF ( (lv_condition_4_0= ruleCondition ) ) this_THEN_5= RULE_THEN ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token this_RULE_TERMINAL_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_IF_3=null;
        Token this_THEN_5=null;
        Token this_ELSE_7=null;
        Token this_IF_8=null;
        Token this_THEN_10=null;
        EObject lv_condition_4_0 = null;

        EObject lv_atomicAction_6_0 = null;

        EObject lv_condition_9_0 = null;

        EObject lv_atomicAction_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:270:28: ( (this_RULE_TERMINAL_0= RULE_RULE_TERMINAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' this_IF_3= RULE_IF ( (lv_condition_4_0= ruleCondition ) ) this_THEN_5= RULE_THEN ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:271:1: (this_RULE_TERMINAL_0= RULE_RULE_TERMINAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' this_IF_3= RULE_IF ( (lv_condition_4_0= ruleCondition ) ) this_THEN_5= RULE_THEN ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:271:1: (this_RULE_TERMINAL_0= RULE_RULE_TERMINAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' this_IF_3= RULE_IF ( (lv_condition_4_0= ruleCondition ) ) this_THEN_5= RULE_THEN ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:271:2: this_RULE_TERMINAL_0= RULE_RULE_TERMINAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' this_IF_3= RULE_IF ( (lv_condition_4_0= ruleCondition ) ) this_THEN_5= RULE_THEN ( (lv_atomicAction_6_0= ruleAtomicAction ) )+ (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )*
            {
            this_RULE_TERMINAL_0=(Token)match(input,RULE_RULE_TERMINAL,FOLLOW_RULE_RULE_TERMINAL_in_ruleRule617); 
             
                newLeafNode(this_RULE_TERMINAL_0, grammarAccess.getRuleAccess().getRULE_TERMINALTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:276:1: (lv_name_1_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule633); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleRule650); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
                
            this_IF_3=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleRule661); 
             
                newLeafNode(this_IF_3, grammarAccess.getRuleAccess().getIFTerminalRuleCall_3()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:301:1: ( (lv_condition_4_0= ruleCondition ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:302:1: (lv_condition_4_0= ruleCondition )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:302:1: (lv_condition_4_0= ruleCondition )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:303:3: lv_condition_4_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleRule681);
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

            this_THEN_5=(Token)match(input,RULE_THEN,FOLLOW_RULE_THEN_in_ruleRule692); 
             
                newLeafNode(this_THEN_5, grammarAccess.getRuleAccess().getTHENTerminalRuleCall_5()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:323:1: ( (lv_atomicAction_6_0= ruleAtomicAction ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_SELECT && LA5_0<=RULE_CHANGE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_atomicAction_6_0= ruleAtomicAction )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:324:1: (lv_atomicAction_6_0= ruleAtomicAction )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:325:3: lv_atomicAction_6_0= ruleAtomicAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule712);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:341:3: (this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+ )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ELSE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:341:4: this_ELSE_7= RULE_ELSE (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )* ( (lv_atomicAction_11_0= ruleAtomicAction ) )+
            	    {
            	    this_ELSE_7=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleRule725); 
            	     
            	        newLeafNode(this_ELSE_7, grammarAccess.getRuleAccess().getELSETerminalRuleCall_7_0()); 
            	        
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:1: (this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_IF) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:345:2: this_IF_8= RULE_IF ( (lv_condition_9_0= ruleCondition ) ) this_THEN_10= RULE_THEN
            	    	    {
            	    	    this_IF_8=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleRule736); 
            	    	     
            	    	        newLeafNode(this_IF_8, grammarAccess.getRuleAccess().getIFTerminalRuleCall_7_1_0()); 
            	    	        
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:349:1: ( (lv_condition_9_0= ruleCondition ) )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:1: (lv_condition_9_0= ruleCondition )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:350:1: (lv_condition_9_0= ruleCondition )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:351:3: lv_condition_9_0= ruleCondition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_7_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCondition_in_ruleRule756);
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

            	    	    this_THEN_10=(Token)match(input,RULE_THEN,FOLLOW_RULE_THEN_in_ruleRule767); 
            	    	     
            	    	        newLeafNode(this_THEN_10, grammarAccess.getRuleAccess().getTHENTerminalRuleCall_7_1_2()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:371:3: ( (lv_atomicAction_11_0= ruleAtomicAction ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=RULE_SELECT && LA7_0<=RULE_CHANGE)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:372:1: (lv_atomicAction_11_0= ruleAtomicAction )
            	    	    {
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:372:1: (lv_atomicAction_11_0= ruleAtomicAction )
            	    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:373:3: lv_atomicAction_11_0= ruleAtomicAction
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRuleAccess().getAtomicActionAtomicActionParserRuleCall_7_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAtomicAction_in_ruleRule789);
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
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:397:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:398:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:399:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition828);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition838); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:406:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ruleOPERATOR this_VALUE_2= RULE_VALUE ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_VALUE_2=null;
        Token otherlv_4=null;
        Token this_VALUE_6=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:409:28: ( ( ( (otherlv_0= RULE_ID ) ) ruleOPERATOR this_VALUE_2= RULE_VALUE ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )* ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:410:1: ( ( (otherlv_0= RULE_ID ) ) ruleOPERATOR this_VALUE_2= RULE_VALUE ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )* )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:410:1: ( ( (otherlv_0= RULE_ID ) ) ruleOPERATOR this_VALUE_2= RULE_VALUE ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:410:2: ( (otherlv_0= RULE_ID ) ) ruleOPERATOR this_VALUE_2= RULE_VALUE ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:410:2: ( (otherlv_0= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:411:1: (otherlv_0= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:411:1: (otherlv_0= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:412:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition883); 

            		newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementImportCrossReference_0_0()); 
            	

            }


            }

             
                    newCompositeNode(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOPERATOR_in_ruleCondition899);
            ruleOPERATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            this_VALUE_2=(Token)match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleCondition909); 
             
                newLeafNode(this_VALUE_2, grammarAccess.getConditionAccess().getVALUETerminalRuleCall_2()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:435:1: ( ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_AND && LA9_0<=RULE_OR)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:436:5: ruleLOGICAL_OPERATOR ( (otherlv_4= RULE_ID ) ) ruleOPERATOR this_VALUE_6= RULE_VALUE
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConditionAccess().getLOGICAL_OPERATORParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_ruleCondition925);
            	    ruleLOGICAL_OPERATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:443:1: ( (otherlv_4= RULE_ID ) )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:444:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:444:1: (otherlv_4= RULE_ID )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:445:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConditionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition944); 

            	    		newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getMeasImportCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getConditionAccess().getOPERATORParserRuleCall_3_2()); 
            	        
            	    pushFollow(FOLLOW_ruleOPERATOR_in_ruleCondition960);
            	    ruleOPERATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_VALUE_6=(Token)match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleCondition970); 
            	     
            	        newLeafNode(this_VALUE_6, grammarAccess.getConditionAccess().getVALUETerminalRuleCall_3_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOPERATOR"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:476:1: entryRuleOPERATOR returns [String current=null] : iv_ruleOPERATOR= ruleOPERATOR EOF ;
    public final String entryRuleOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:477:2: (iv_ruleOPERATOR= ruleOPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:478:2: iv_ruleOPERATOR= ruleOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getOPERATORRule()); 
            pushFollow(FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1008);
            iv_ruleOPERATOR=ruleOPERATOR();

            state._fsp--;

             current =iv_ruleOPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATOR1019); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:485:1: ruleOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SMALLER_0= RULE_SMALLER | this_BIGGER_1= RULE_BIGGER | this_EQUAL_2= RULE_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SMALLER_0=null;
        Token this_BIGGER_1=null;
        Token this_EQUAL_2=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:488:28: ( (this_SMALLER_0= RULE_SMALLER | this_BIGGER_1= RULE_BIGGER | this_EQUAL_2= RULE_EQUAL ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:489:1: (this_SMALLER_0= RULE_SMALLER | this_BIGGER_1= RULE_BIGGER | this_EQUAL_2= RULE_EQUAL )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:489:1: (this_SMALLER_0= RULE_SMALLER | this_BIGGER_1= RULE_BIGGER | this_EQUAL_2= RULE_EQUAL )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_SMALLER:
                {
                alt10=1;
                }
                break;
            case RULE_BIGGER:
                {
                alt10=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:489:6: this_SMALLER_0= RULE_SMALLER
                    {
                    this_SMALLER_0=(Token)match(input,RULE_SMALLER,FOLLOW_RULE_SMALLER_in_ruleOPERATOR1059); 

                    		current.merge(this_SMALLER_0);
                        
                     
                        newLeafNode(this_SMALLER_0, grammarAccess.getOPERATORAccess().getSMALLERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:497:10: this_BIGGER_1= RULE_BIGGER
                    {
                    this_BIGGER_1=(Token)match(input,RULE_BIGGER,FOLLOW_RULE_BIGGER_in_ruleOPERATOR1085); 

                    		current.merge(this_BIGGER_1);
                        
                     
                        newLeafNode(this_BIGGER_1, grammarAccess.getOPERATORAccess().getBIGGERTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:505:10: this_EQUAL_2= RULE_EQUAL
                    {
                    this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleOPERATOR1111); 

                    		current.merge(this_EQUAL_2);
                        
                     
                        newLeafNode(this_EQUAL_2, grammarAccess.getOPERATORAccess().getEQUALTerminalRuleCall_2()); 
                        

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:520:1: entryRuleLOGICAL_OPERATOR returns [String current=null] : iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF ;
    public final String entryRuleLOGICAL_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_OPERATOR = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:521:2: (iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:522:2: iv_ruleLOGICAL_OPERATOR= ruleLOGICAL_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPERATORRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1157);
            iv_ruleLOGICAL_OPERATOR=ruleLOGICAL_OPERATOR();

            state._fsp--;

             current =iv_ruleLOGICAL_OPERATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1168); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:529:1: ruleLOGICAL_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AND_0= RULE_AND | this_OR_1= RULE_OR ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AND_0=null;
        Token this_OR_1=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:532:28: ( (this_AND_0= RULE_AND | this_OR_1= RULE_OR ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:533:1: (this_AND_0= RULE_AND | this_OR_1= RULE_OR )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:533:1: (this_AND_0= RULE_AND | this_OR_1= RULE_OR )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_AND) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_OR) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:533:6: this_AND_0= RULE_AND
                    {
                    this_AND_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleLOGICAL_OPERATOR1208); 

                    		current.merge(this_AND_0);
                        
                     
                        newLeafNode(this_AND_0, grammarAccess.getLOGICAL_OPERATORAccess().getANDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:541:10: this_OR_1= RULE_OR
                    {
                    this_OR_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleLOGICAL_OPERATOR1234); 

                    		current.merge(this_OR_1);
                        
                     
                        newLeafNode(this_OR_1, grammarAccess.getLOGICAL_OPERATORAccess().getORTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleAVG"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:558:1: entryRuleAVG returns [EObject current=null] : iv_ruleAVG= ruleAVG EOF ;
    public final EObject entryRuleAVG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVG = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:559:2: (iv_ruleAVG= ruleAVG EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:560:2: iv_ruleAVG= ruleAVG EOF
            {
             newCompositeNode(grammarAccess.getAVGRule()); 
            pushFollow(FOLLOW_ruleAVG_in_entryRuleAVG1281);
            iv_ruleAVG=ruleAVG();

            state._fsp--;

             current =iv_ruleAVG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAVG1291); 

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
    // $ANTLR end "entryRuleAVG"


    // $ANTLR start "ruleAVG"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:567:1: ruleAVG returns [EObject current=null] : (otherlv_0= 'AVG (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) ;
    public final EObject ruleAVG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:570:28: ( (otherlv_0= 'AVG (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:1: (otherlv_0= 'AVG (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:1: (otherlv_0= 'AVG (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:571:3: otherlv_0= 'AVG (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleAVG1328); 

                	newLeafNode(otherlv_0, grammarAccess.getAVGAccess().getAVGKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:575:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:575:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= ','
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:575:2: ( (otherlv_1= RULE_ID ) )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:576:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:576:1: (otherlv_1= RULE_ID )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:577:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAVGRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAVG1349); 

            	    		newLeafNode(otherlv_1, grammarAccess.getAVGAccess().getMeasurementImportCrossReference_1_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleAVG1361); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAVGAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleAVG1375); 

                	newLeafNode(otherlv_3, grammarAccess.getAVGAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleAVG"


    // $ANTLR start "entryRuleMIN"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:604:1: entryRuleMIN returns [EObject current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final EObject entryRuleMIN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIN = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:605:2: (iv_ruleMIN= ruleMIN EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:606:2: iv_ruleMIN= ruleMIN EOF
            {
             newCompositeNode(grammarAccess.getMINRule()); 
            pushFollow(FOLLOW_ruleMIN_in_entryRuleMIN1411);
            iv_ruleMIN=ruleMIN();

            state._fsp--;

             current =iv_ruleMIN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMIN1421); 

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
    // $ANTLR end "entryRuleMIN"


    // $ANTLR start "ruleMIN"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:613:1: ruleMIN returns [EObject current=null] : (otherlv_0= 'MIN (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) ;
    public final EObject ruleMIN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:616:28: ( (otherlv_0= 'MIN (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:617:1: (otherlv_0= 'MIN (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:617:1: (otherlv_0= 'MIN (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:617:3: otherlv_0= 'MIN (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleMIN1458); 

                	newLeafNode(otherlv_0, grammarAccess.getMINAccess().getMINKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:621:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:621:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= ','
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:621:2: ( (otherlv_1= RULE_ID ) )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:622:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:622:1: (otherlv_1= RULE_ID )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:623:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMINRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMIN1479); 

            	    		newLeafNode(otherlv_1, grammarAccess.getMINAccess().getMeasurementImportCrossReference_1_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleMIN1491); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMINAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleMIN1505); 

                	newLeafNode(otherlv_3, grammarAccess.getMINAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleMIN"


    // $ANTLR start "entryRuleMAX"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:650:1: entryRuleMAX returns [EObject current=null] : iv_ruleMAX= ruleMAX EOF ;
    public final EObject entryRuleMAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAX = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:651:2: (iv_ruleMAX= ruleMAX EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:652:2: iv_ruleMAX= ruleMAX EOF
            {
             newCompositeNode(grammarAccess.getMAXRule()); 
            pushFollow(FOLLOW_ruleMAX_in_entryRuleMAX1541);
            iv_ruleMAX=ruleMAX();

            state._fsp--;

             current =iv_ruleMAX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAX1551); 

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
    // $ANTLR end "entryRuleMAX"


    // $ANTLR start "ruleMAX"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:659:1: ruleMAX returns [EObject current=null] : (otherlv_0= 'MAX (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) ;
    public final EObject ruleMAX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:662:28: ( (otherlv_0= 'MAX (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:1: (otherlv_0= 'MAX (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:1: (otherlv_0= 'MAX (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:663:3: otherlv_0= 'MAX (' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleMAX1588); 

                	newLeafNode(otherlv_0, grammarAccess.getMAXAccess().getMAXKeyword_0());
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:667:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:667:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= ','
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:667:2: ( (otherlv_1= RULE_ID ) )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:668:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:668:1: (otherlv_1= RULE_ID )
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:669:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMAXRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMAX1609); 

            	    		newLeafNode(otherlv_1, grammarAccess.getMAXAccess().getMeasurementImportCrossReference_1_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleMAX1621); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMAXAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleMAX1635); 

                	newLeafNode(otherlv_3, grammarAccess.getMAXAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleMAX"


    // $ANTLR start "entryRuleAtomicAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:696:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:697:2: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:698:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1671);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicAction1681); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:705:1: ruleAtomicAction returns [EObject current=null] : (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject this_SelectAction_0 = null;

        EObject this_DeselectAction_1 = null;

        EObject this_ModifyAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:708:28: ( (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:709:1: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:709:1: (this_SelectAction_0= ruleSelectAction | this_DeselectAction_1= ruleDeselectAction | this_ModifyAttribute_2= ruleModifyAttribute )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_SELECT:
                {
                alt15=1;
                }
                break;
            case RULE_DESELECT:
                {
                alt15=2;
                }
                break;
            case RULE_CHANGE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:710:5: this_SelectAction_0= ruleSelectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getSelectActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectAction_in_ruleAtomicAction1728);
                    this_SelectAction_0=ruleSelectAction();

                    state._fsp--;

                     
                            current = this_SelectAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:720:5: this_DeselectAction_1= ruleDeselectAction
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getDeselectActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeselectAction_in_ruleAtomicAction1755);
                    this_DeselectAction_1=ruleDeselectAction();

                    state._fsp--;

                     
                            current = this_DeselectAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:730:5: this_ModifyAttribute_2= ruleModifyAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicActionAccess().getModifyAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1782);
                    this_ModifyAttribute_2=ruleModifyAttribute();

                    state._fsp--;

                     
                            current = this_ModifyAttribute_2; 
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


    // $ANTLR start "entryRuleSelectAction"
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:746:1: entryRuleSelectAction returns [EObject current=null] : iv_ruleSelectAction= ruleSelectAction EOF ;
    public final EObject entryRuleSelectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:747:2: (iv_ruleSelectAction= ruleSelectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:748:2: iv_ruleSelectAction= ruleSelectAction EOF
            {
             newCompositeNode(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_ruleSelectAction_in_entryRuleSelectAction1817);
            iv_ruleSelectAction=ruleSelectAction();

            state._fsp--;

             current =iv_ruleSelectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAction1827); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:755:1: ruleSelectAction returns [EObject current=null] : (this_SELECT_0= RULE_SELECT ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSelectAction() throws RecognitionException {
        EObject current = null;

        Token this_SELECT_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:758:28: ( (this_SELECT_0= RULE_SELECT ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:759:1: (this_SELECT_0= RULE_SELECT ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:759:1: (this_SELECT_0= RULE_SELECT ( (otherlv_1= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:759:2: this_SELECT_0= RULE_SELECT ( (otherlv_1= RULE_ID ) )
            {
            this_SELECT_0=(Token)match(input,RULE_SELECT,FOLLOW_RULE_SELECT_in_ruleSelectAction1863); 
             
                newLeafNode(this_SELECT_0, grammarAccess.getSelectActionAccess().getSELECTTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:763:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:764:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:764:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:765:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectAction1882); 

            		newLeafNode(otherlv_1, grammarAccess.getSelectActionAccess().getFeatureImportCrossReference_1_0()); 
            	

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:784:1: entryRuleDeselectAction returns [EObject current=null] : iv_ruleDeselectAction= ruleDeselectAction EOF ;
    public final EObject entryRuleDeselectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeselectAction = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:785:2: (iv_ruleDeselectAction= ruleDeselectAction EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:786:2: iv_ruleDeselectAction= ruleDeselectAction EOF
            {
             newCompositeNode(grammarAccess.getDeselectActionRule()); 
            pushFollow(FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction1918);
            iv_ruleDeselectAction=ruleDeselectAction();

            state._fsp--;

             current =iv_ruleDeselectAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeselectAction1928); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:793:1: ruleDeselectAction returns [EObject current=null] : (this_DESELECT_0= RULE_DESELECT ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDeselectAction() throws RecognitionException {
        EObject current = null;

        Token this_DESELECT_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:796:28: ( (this_DESELECT_0= RULE_DESELECT ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:1: (this_DESELECT_0= RULE_DESELECT ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:1: (this_DESELECT_0= RULE_DESELECT ( (otherlv_1= RULE_ID ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:797:2: this_DESELECT_0= RULE_DESELECT ( (otherlv_1= RULE_ID ) )
            {
            this_DESELECT_0=(Token)match(input,RULE_DESELECT,FOLLOW_RULE_DESELECT_in_ruleDeselectAction1964); 
             
                newLeafNode(this_DESELECT_0, grammarAccess.getDeselectActionAccess().getDESELECTTerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:801:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:802:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:802:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:803:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeselectActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeselectAction1983); 

            		newLeafNode(otherlv_1, grammarAccess.getDeselectActionAccess().getFeatureImportCrossReference_1_0()); 
            	

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:822:1: entryRuleModifyAttribute returns [EObject current=null] : iv_ruleModifyAttribute= ruleModifyAttribute EOF ;
    public final EObject entryRuleModifyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyAttribute = null;


        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:823:2: (iv_ruleModifyAttribute= ruleModifyAttribute EOF )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:824:2: iv_ruleModifyAttribute= ruleModifyAttribute EOF
            {
             newCompositeNode(grammarAccess.getModifyAttributeRule()); 
            pushFollow(FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2019);
            iv_ruleModifyAttribute=ruleModifyAttribute();

            state._fsp--;

             current =iv_ruleModifyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyAttribute2029); 

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
    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:831:1: ruleModifyAttribute returns [EObject current=null] : (this_CHANGE_0= RULE_CHANGE ( (otherlv_1= RULE_ID ) ) this_WITH_2= RULE_WITH ( (lv_value_3_0= RULE_VALUE ) ) ) ;
    public final EObject ruleModifyAttribute() throws RecognitionException {
        EObject current = null;

        Token this_CHANGE_0=null;
        Token otherlv_1=null;
        Token this_WITH_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:834:28: ( (this_CHANGE_0= RULE_CHANGE ( (otherlv_1= RULE_ID ) ) this_WITH_2= RULE_WITH ( (lv_value_3_0= RULE_VALUE ) ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:1: (this_CHANGE_0= RULE_CHANGE ( (otherlv_1= RULE_ID ) ) this_WITH_2= RULE_WITH ( (lv_value_3_0= RULE_VALUE ) ) )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:1: (this_CHANGE_0= RULE_CHANGE ( (otherlv_1= RULE_ID ) ) this_WITH_2= RULE_WITH ( (lv_value_3_0= RULE_VALUE ) ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:835:2: this_CHANGE_0= RULE_CHANGE ( (otherlv_1= RULE_ID ) ) this_WITH_2= RULE_WITH ( (lv_value_3_0= RULE_VALUE ) )
            {
            this_CHANGE_0=(Token)match(input,RULE_CHANGE,FOLLOW_RULE_CHANGE_in_ruleModifyAttribute2065); 
             
                newLeafNode(this_CHANGE_0, grammarAccess.getModifyAttributeAccess().getCHANGETerminalRuleCall_0()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:839:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:840:1: (otherlv_1= RULE_ID )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:840:1: (otherlv_1= RULE_ID )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:841:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyAttribute2084); 

            		newLeafNode(otherlv_1, grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportCrossReference_1_0()); 
            	

            }


            }

            this_WITH_2=(Token)match(input,RULE_WITH,FOLLOW_RULE_WITH_in_ruleModifyAttribute2095); 
             
                newLeafNode(this_WITH_2, grammarAccess.getModifyAttributeAccess().getWITHTerminalRuleCall_2()); 
                
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:856:1: ( (lv_value_3_0= RULE_VALUE ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:857:1: (lv_value_3_0= RULE_VALUE )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:857:1: (lv_value_3_0= RULE_VALUE )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:858:3: lv_value_3_0= RULE_VALUE
            {
            lv_value_3_0=(Token)match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleModifyAttribute2111); 

            			newLeafNode(lv_value_3_0, grammarAccess.getModifyAttributeAccess().getValueVALUETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"VALUE");
            	    

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdaptationModel_in_entryRuleAdaptationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdaptationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAdaptationModel131 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAdaptationModel153 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_TERMINAL_in_ruleImport236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_AS_in_ruleImport261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard377 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedNameWithWildcard396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName490 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName524 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RULE_TERMINAL_in_ruleRule617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule633 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRule650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleRule661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule681 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_THEN_in_ruleRule692 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule712 = new BitSet(new long[]{0x00000000000E0402L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleRule725 = new BitSet(new long[]{0x00000000000E0100L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleRule736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleRule756 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_THEN_in_ruleRule767 = new BitSet(new long[]{0x00000000000E0100L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_ruleRule789 = new BitSet(new long[]{0x00000000000E0402L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition883 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleCondition899 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleCondition909 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_ruleCondition925 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition944 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_ruleCondition960 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleCondition970 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleOPERATOR_in_entryRuleOPERATOR1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATOR1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALLER_in_ruleOPERATOR1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIGGER_in_ruleOPERATOR1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleOPERATOR1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OPERATOR_in_entryRuleLOGICAL_OPERATOR1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OPERATOR1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleLOGICAL_OPERATOR1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleLOGICAL_OPERATOR1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVG_in_entryRuleAVG1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAVG1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAVG1328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAVG1349 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAVG1361 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_32_in_ruleAVG1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIN_in_entryRuleMIN1411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMIN1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMIN1458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMIN1479 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMIN1491 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_32_in_ruleMIN1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAX_in_entryRuleMAX1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAX1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMAX1588 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMAX1609 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMAX1621 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_32_in_ruleMAX1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicAction_in_entryRuleAtomicAction1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicAction1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_ruleAtomicAction1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_ruleAtomicAction1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_ruleAtomicAction1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAction_in_entryRuleSelectAction1817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAction1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECT_in_ruleSelectAction1863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectAction1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeselectAction_in_entryRuleDeselectAction1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeselectAction1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESELECT_in_ruleDeselectAction1964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeselectAction1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyAttribute_in_entryRuleModifyAttribute2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyAttribute2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHANGE_in_ruleModifyAttribute2065 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyAttribute2084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_WITH_in_ruleModifyAttribute2095 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleModifyAttribute2111 = new BitSet(new long[]{0x0000000000000002L});

}