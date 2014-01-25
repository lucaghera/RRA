package org.rra.adaptationModel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptationModelDSLLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SMALLER=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BIGGER=13;
    public static final int RULE_STRING=22;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_INT=21;
    public static final int RULE_WITH=20;
    public static final int RULE_WS=25;
    public static final int RULE_IF=8;
    public static final int RULE_RULE_TERMINAL=7;
    public static final int RULE_IMPORT_TERMINAL=4;
    public static final int RULE_ELSE=10;
    public static final int RULE_AS=5;
    public static final int RULE_CHANGE=19;

    // delegates
    // delegators

    public InternalAdaptationModelDSLLexer() {;} 
    public InternalAdaptationModelDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAdaptationModelDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:11:7: ( '.*' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:11:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:12:7: ( '.' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:13:7: ( ':' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:14:7: ( 'AVG (' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:14:9: 'AVG ('
            {
            match("AVG ("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:15:7: ( ',' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:16:7: ( ')' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:17:7: ( 'MIN (' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:17:9: 'MIN ('
            {
            match("MIN ("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:18:7: ( 'MAX (' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:18:9: 'MAX ('
            {
            match("MAX ("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_VALUE"
    public final void mRULE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:12: ( '\"' ( '0' .. '9' | 'a' .. 'z' | '0' .. '9' '.' '0' .. '9' )+ '\"' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:14: '\"' ( '0' .. '9' | 'a' .. 'z' | '0' .. '9' '.' '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:18: ( '0' .. '9' | 'a' .. 'z' | '0' .. '9' '.' '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='.') ) {
                        alt1=3;
                    }
                    else if ( (LA1_2=='\"'||(LA1_2>='0' && LA1_2<='9')||(LA1_2>='a' && LA1_2<='z')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:28: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:881:37: '0' .. '9' '.' '0' .. '9'
            	    {
            	    matchRange('0','9'); 
            	    match('.'); 
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:883:10: ( 'AND' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:883:12: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:885:9: ( 'OR' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:885:11: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:887:9: ( 'if' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:887:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:889:11: ( 'else' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:889:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_THEN"
    public final void mRULE_THEN() throws RecognitionException {
        try {
            int _type = RULE_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:891:11: ( 'then' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:891:13: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN"

    // $ANTLR start "RULE_RULE_TERMINAL"
    public final void mRULE_RULE_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_RULE_TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:893:20: ( 'rule' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:893:22: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RULE_TERMINAL"

    // $ANTLR start "RULE_SELECT"
    public final void mRULE_SELECT() throws RecognitionException {
        try {
            int _type = RULE_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:895:13: ( 'select feature' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:895:15: 'select feature'
            {
            match("select feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECT"

    // $ANTLR start "RULE_DESELECT"
    public final void mRULE_DESELECT() throws RecognitionException {
        try {
            int _type = RULE_DESELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:897:15: ( 'deselect feature' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:897:17: 'deselect feature'
            {
            match("deselect feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESELECT"

    // $ANTLR start "RULE_CHANGE"
    public final void mRULE_CHANGE() throws RecognitionException {
        try {
            int _type = RULE_CHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:899:13: ( 'change feature attribute' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:899:15: 'change feature attribute'
            {
            match("change feature attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHANGE"

    // $ANTLR start "RULE_WITH"
    public final void mRULE_WITH() throws RecognitionException {
        try {
            int _type = RULE_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:11: ( 'with' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:901:13: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WITH"

    // $ANTLR start "RULE_IMPORT_TERMINAL"
    public final void mRULE_IMPORT_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IMPORT_TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:22: ( 'import' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:903:24: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORT_TERMINAL"

    // $ANTLR start "RULE_AS"
    public final void mRULE_AS() throws RecognitionException {
        try {
            int _type = RULE_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:905:9: ( 'as' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:905:11: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AS"

    // $ANTLR start "RULE_SMALLER"
    public final void mRULE_SMALLER() throws RecognitionException {
        try {
            int _type = RULE_SMALLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:907:14: ( '<' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:907:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SMALLER"

    // $ANTLR start "RULE_BIGGER"
    public final void mRULE_BIGGER() throws RecognitionException {
        try {
            int _type = RULE_BIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:909:13: ( '>' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:909:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIGGER"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:911:12: ( '==' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:911:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:913:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:10: ( ( '0' .. '9' )+ )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:12: ( '0' .. '9' )+
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:915:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:917:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:919:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:919:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:919:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:919:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:41: ( '\\r' )? '\\n'
                    {
                    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:921:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:923:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:923:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:923:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:925:16: ( . )
            // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:925:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_VALUE | RULE_AND | RULE_OR | RULE_IF | RULE_ELSE | RULE_THEN | RULE_RULE_TERMINAL | RULE_SELECT | RULE_DESELECT | RULE_CHANGE | RULE_WITH | RULE_IMPORT_TERMINAL | RULE_AS | RULE_SMALLER | RULE_BIGGER | RULE_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=31;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:58: RULE_VALUE
                {
                mRULE_VALUE(); 

                }
                break;
            case 10 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:69: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 11 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:78: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 12 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:86: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 13 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:94: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 14 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:104: RULE_THEN
                {
                mRULE_THEN(); 

                }
                break;
            case 15 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:114: RULE_RULE_TERMINAL
                {
                mRULE_RULE_TERMINAL(); 

                }
                break;
            case 16 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:133: RULE_SELECT
                {
                mRULE_SELECT(); 

                }
                break;
            case 17 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:145: RULE_DESELECT
                {
                mRULE_DESELECT(); 

                }
                break;
            case 18 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:159: RULE_CHANGE
                {
                mRULE_CHANGE(); 

                }
                break;
            case 19 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:171: RULE_WITH
                {
                mRULE_WITH(); 

                }
                break;
            case 20 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:181: RULE_IMPORT_TERMINAL
                {
                mRULE_IMPORT_TERMINAL(); 

                }
                break;
            case 21 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:202: RULE_AS
                {
                mRULE_AS(); 

                }
                break;
            case 22 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:210: RULE_SMALLER
                {
                mRULE_SMALLER(); 

                }
                break;
            case 23 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:223: RULE_BIGGER
                {
                mRULE_BIGGER(); 

                }
                break;
            case 24 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:235: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 25 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:246: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:254: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:275: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:291: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:307: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../org.rra.adaptationModel.dsl/src-gen/org/rra/adaptationModel/parser/antlr/internal/InternalAdaptationModelDSL.g:1:315: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\35\1\uffff\1\41\2\uffff\1\41\1\33\12\41\2\uffff\2\33"+
        "\2\uffff\2\33\5\uffff\2\41\3\uffff\2\41\3\uffff\1\101\1\102\10\41"+
        "\1\113\7\uffff\1\41\1\115\2\41\4\uffff\10\41\7\uffff\1\41\1\133"+
        "\1\134\1\135\3\41\1\141\1\41\3\uffff\3\41\1\uffff\1\146\3\41\2\uffff"+
        "\1\41\1\uffff\1\41\1\uffff";
    static final String DFA13_eofS =
        "\154\uffff";
    static final String DFA13_minS =
        "\1\0\1\52\1\uffff\1\116\2\uffff\1\101\1\0\1\122\1\146\1\154\1\150"+
        "\1\165\2\145\1\150\1\151\1\163\2\uffff\1\75\1\101\2\uffff\1\0\1"+
        "\52\5\uffff\1\107\1\104\3\uffff\1\116\1\130\2\0\1\uffff\2\60\1\160"+
        "\1\163\1\145\2\154\1\163\1\141\1\164\1\60\7\uffff\1\40\1\60\2\40"+
        "\1\0\3\uffff\1\157\1\145\1\156\3\145\1\156\1\150\5\uffff\1\0\1\uffff"+
        "\1\162\3\60\1\143\1\154\1\147\1\60\1\164\3\uffff\1\164\2\145\1\uffff"+
        "\1\60\1\40\1\143\1\40\2\uffff\1\164\1\uffff\1\40\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\52\1\uffff\1\126\2\uffff\1\111\1\uffff\1\122\1\155\1"+
        "\154\1\150\1\165\2\145\1\150\1\151\1\163\2\uffff\1\75\1\172\2\uffff"+
        "\1\uffff\1\57\5\uffff\1\107\1\104\3\uffff\1\116\1\130\2\uffff\1"+
        "\uffff\2\172\1\160\1\163\1\145\2\154\1\163\1\141\1\164\1\172\7\uffff"+
        "\1\40\1\172\2\40\1\uffff\3\uffff\1\157\1\145\1\156\3\145\1\156\1"+
        "\150\5\uffff\1\uffff\1\uffff\1\162\3\172\1\143\1\154\1\147\1\172"+
        "\1\164\3\uffff\1\164\2\145\1\uffff\1\172\1\40\1\143\1\40\2\uffff"+
        "\1\164\1\uffff\1\40\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\1\uffff\1\5\1\6\14\uffff\1\26\1\27\2\uffff\1\31\1\32"+
        "\2\uffff\1\36\1\37\1\1\1\2\1\3\2\uffff\1\31\1\5\1\6\4\uffff\1\33"+
        "\13\uffff\1\26\1\27\1\30\1\32\1\34\1\35\1\36\5\uffff\1\11\1\13\1"+
        "\14\10\uffff\1\25\1\4\1\12\1\7\1\10\1\uffff\1\11\11\uffff\1\15\1"+
        "\16\1\17\3\uffff\1\23\4\uffff\1\24\1\20\1\uffff\1\22\1\uffff\1\21";
    static final String DFA13_specialS =
        "\1\6\6\uffff\1\1\20\uffff\1\3\15\uffff\1\0\1\5\27\uffff\1\2\20\uffff"+
        "\1\4\33\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\7\4\33\1\30\1\33\1\5"+
            "\2\33\1\4\1\33\1\1\1\31\12\27\1\2\1\33\1\22\1\24\1\23\2\33\1"+
            "\3\13\26\1\6\1\26\1\10\13\26\3\33\1\25\1\26\1\33\1\21\1\26\1"+
            "\17\1\16\1\12\3\26\1\11\10\26\1\14\1\15\1\13\2\26\1\20\3\26"+
            "\uff85\33",
            "\1\34",
            "",
            "\1\40\7\uffff\1\37",
            "",
            "",
            "\1\45\7\uffff\1\44",
            "\60\50\12\46\47\50\32\47\uff85\50",
            "\1\51",
            "\1\52\6\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "\1\66",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\50",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\42\50\1\100\13\50\1\77\1\50\12\46\47\50\32\47\uff85\50",
            "\42\50\1\100\15\50\12\46\47\50\32\47\uff85\50",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\116",
            "\1\117",
            "\60\50\12\120\uffc6\50",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "\42\50\1\100\15\50\12\46\47\50\32\47\uff85\50",
            "",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\142",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\152",
            "",
            "\1\153",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_VALUE | RULE_AND | RULE_OR | RULE_IF | RULE_ELSE | RULE_THEN | RULE_RULE_TERMINAL | RULE_SELECT | RULE_DESELECT | RULE_CHANGE | RULE_WITH | RULE_IMPORT_TERMINAL | RULE_AS | RULE_SMALLER | RULE_BIGGER | RULE_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( (LA13_38=='.') ) {s = 63;}

                        else if ( (LA13_38=='\"') ) {s = 64;}

                        else if ( ((LA13_38>='\u0000' && LA13_38<='!')||(LA13_38>='#' && LA13_38<='-')||LA13_38=='/'||(LA13_38>=':' && LA13_38<='`')||(LA13_38>='{' && LA13_38<='\uFFFF')) ) {s = 40;}

                        else if ( ((LA13_38>='0' && LA13_38<='9')) ) {s = 38;}

                        else if ( ((LA13_38>='a' && LA13_38<='z')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_7 = input.LA(1);

                        s = -1;
                        if ( ((LA13_7>='0' && LA13_7<='9')) ) {s = 38;}

                        else if ( ((LA13_7>='a' && LA13_7<='z')) ) {s = 39;}

                        else if ( ((LA13_7>='\u0000' && LA13_7<='/')||(LA13_7>=':' && LA13_7<='`')||(LA13_7>='{' && LA13_7<='\uFFFF')) ) {s = 40;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_63 = input.LA(1);

                        s = -1;
                        if ( ((LA13_63>='0' && LA13_63<='9')) ) {s = 80;}

                        else if ( ((LA13_63>='\u0000' && LA13_63<='/')||(LA13_63>=':' && LA13_63<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 40;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( (LA13_80=='\"') ) {s = 64;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='!')||(LA13_80>='#' && LA13_80<='/')||(LA13_80>=':' && LA13_80<='`')||(LA13_80>='{' && LA13_80<='\uFFFF')) ) {s = 40;}

                        else if ( ((LA13_80>='0' && LA13_80<='9')) ) {s = 38;}

                        else if ( ((LA13_80>='a' && LA13_80<='z')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( (LA13_39=='\"') ) {s = 64;}

                        else if ( ((LA13_39>='\u0000' && LA13_39<='!')||(LA13_39>='#' && LA13_39<='/')||(LA13_39>=':' && LA13_39<='`')||(LA13_39>='{' && LA13_39<='\uFFFF')) ) {s = 40;}

                        else if ( ((LA13_39>='0' && LA13_39<='9')) ) {s = 38;}

                        else if ( ((LA13_39>='a' && LA13_39<='z')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='.') ) {s = 1;}

                        else if ( (LA13_0==':') ) {s = 2;}

                        else if ( (LA13_0=='A') ) {s = 3;}

                        else if ( (LA13_0==',') ) {s = 4;}

                        else if ( (LA13_0==')') ) {s = 5;}

                        else if ( (LA13_0=='M') ) {s = 6;}

                        else if ( (LA13_0=='\"') ) {s = 7;}

                        else if ( (LA13_0=='O') ) {s = 8;}

                        else if ( (LA13_0=='i') ) {s = 9;}

                        else if ( (LA13_0=='e') ) {s = 10;}

                        else if ( (LA13_0=='t') ) {s = 11;}

                        else if ( (LA13_0=='r') ) {s = 12;}

                        else if ( (LA13_0=='s') ) {s = 13;}

                        else if ( (LA13_0=='d') ) {s = 14;}

                        else if ( (LA13_0=='c') ) {s = 15;}

                        else if ( (LA13_0=='w') ) {s = 16;}

                        else if ( (LA13_0=='a') ) {s = 17;}

                        else if ( (LA13_0=='<') ) {s = 18;}

                        else if ( (LA13_0=='>') ) {s = 19;}

                        else if ( (LA13_0=='=') ) {s = 20;}

                        else if ( (LA13_0=='^') ) {s = 21;}

                        else if ( ((LA13_0>='B' && LA13_0<='L')||LA13_0=='N'||(LA13_0>='P' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 22;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 23;}

                        else if ( (LA13_0=='\'') ) {s = 24;}

                        else if ( (LA13_0=='/') ) {s = 25;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 26;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='('||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}