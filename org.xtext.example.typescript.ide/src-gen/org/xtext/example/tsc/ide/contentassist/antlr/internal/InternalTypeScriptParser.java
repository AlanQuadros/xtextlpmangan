package org.xtext.example.tsc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.tsc.services.TypeScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypeScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_TEXTOS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'as'", "'*'", "'$'", "'import'", "';'", "'from'", "'{'", "'}'", "','"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_TEXTOS=6;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalTypeScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypeScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypeScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTypeScript.g"; }


    	private TypeScriptGrammarAccess grammarAccess;

    	public void setGrammarAccess(TypeScriptGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalTypeScript.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTypeScript.g:54:1: ( ruleModel EOF )
            // InternalTypeScript.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTypeScript.g:62:1: ruleModel : ( ( rule__Model__ComputeAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:66:2: ( ( ( rule__Model__ComputeAssignment ) ) )
            // InternalTypeScript.g:67:2: ( ( rule__Model__ComputeAssignment ) )
            {
            // InternalTypeScript.g:67:2: ( ( rule__Model__ComputeAssignment ) )
            // InternalTypeScript.g:68:3: ( rule__Model__ComputeAssignment )
            {
             before(grammarAccess.getModelAccess().getComputeAssignment()); 
            // InternalTypeScript.g:69:3: ( rule__Model__ComputeAssignment )
            // InternalTypeScript.g:69:4: rule__Model__ComputeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ComputeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getComputeAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompute"
    // InternalTypeScript.g:78:1: entryRuleCompute : ruleCompute EOF ;
    public final void entryRuleCompute() throws RecognitionException {
        try {
            // InternalTypeScript.g:79:1: ( ruleCompute EOF )
            // InternalTypeScript.g:80:1: ruleCompute EOF
            {
             before(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompute();

            state._fsp--;

             after(grammarAccess.getComputeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalTypeScript.g:87:1: ruleCompute : ( ( rule__Compute__Group__0 ) ) ;
    public final void ruleCompute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:91:2: ( ( ( rule__Compute__Group__0 ) ) )
            // InternalTypeScript.g:92:2: ( ( rule__Compute__Group__0 ) )
            {
            // InternalTypeScript.g:92:2: ( ( rule__Compute__Group__0 ) )
            // InternalTypeScript.g:93:3: ( rule__Compute__Group__0 )
            {
             before(grammarAccess.getComputeAccess().getGroup()); 
            // InternalTypeScript.g:94:3: ( rule__Compute__Group__0 )
            // InternalTypeScript.g:94:4: rule__Compute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getGroup()); 

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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleClasses"
    // InternalTypeScript.g:103:1: entryRuleClasses : ruleClasses EOF ;
    public final void entryRuleClasses() throws RecognitionException {
        try {
            // InternalTypeScript.g:104:1: ( ruleClasses EOF )
            // InternalTypeScript.g:105:1: ruleClasses EOF
            {
             before(grammarAccess.getClassesRule()); 
            pushFollow(FOLLOW_1);
            ruleClasses();

            state._fsp--;

             after(grammarAccess.getClassesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClasses"


    // $ANTLR start "ruleClasses"
    // InternalTypeScript.g:112:1: ruleClasses : ( ( rule__Classes__Group__0 ) ) ;
    public final void ruleClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:116:2: ( ( ( rule__Classes__Group__0 ) ) )
            // InternalTypeScript.g:117:2: ( ( rule__Classes__Group__0 ) )
            {
            // InternalTypeScript.g:117:2: ( ( rule__Classes__Group__0 ) )
            // InternalTypeScript.g:118:3: ( rule__Classes__Group__0 )
            {
             before(grammarAccess.getClassesAccess().getGroup()); 
            // InternalTypeScript.g:119:3: ( rule__Classes__Group__0 )
            // InternalTypeScript.g:119:4: rule__Classes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Classes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassesAccess().getGroup()); 

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
    // $ANTLR end "ruleClasses"


    // $ANTLR start "entryRuleExpression"
    // InternalTypeScript.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTypeScript.g:129:1: ( ruleExpression EOF )
            // InternalTypeScript.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTypeScript.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalTypeScript.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalTypeScript.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalTypeScript.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalTypeScript.g:144:3: ( rule__Expression__Alternatives )
            // InternalTypeScript.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rule__Compute__Alternatives_1"
    // InternalTypeScript.g:152:1: rule__Compute__Alternatives_1 : ( ( ( rule__Compute__Group_1_0__0 ) ) | ( ( rule__Compute__NameAssignment_1_1 ) ) );
    public final void rule__Compute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:156:1: ( ( ( rule__Compute__Group_1_0__0 ) ) | ( ( rule__Compute__NameAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||(LA1_0>=12 && LA1_0<=14)||LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_TEXTOS) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTypeScript.g:157:2: ( ( rule__Compute__Group_1_0__0 ) )
                    {
                    // InternalTypeScript.g:157:2: ( ( rule__Compute__Group_1_0__0 ) )
                    // InternalTypeScript.g:158:3: ( rule__Compute__Group_1_0__0 )
                    {
                     before(grammarAccess.getComputeAccess().getGroup_1_0()); 
                    // InternalTypeScript.g:159:3: ( rule__Compute__Group_1_0__0 )
                    // InternalTypeScript.g:159:4: rule__Compute__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compute__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComputeAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:163:2: ( ( rule__Compute__NameAssignment_1_1 ) )
                    {
                    // InternalTypeScript.g:163:2: ( ( rule__Compute__NameAssignment_1_1 ) )
                    // InternalTypeScript.g:164:3: ( rule__Compute__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getComputeAccess().getNameAssignment_1_1()); 
                    // InternalTypeScript.g:165:3: ( rule__Compute__NameAssignment_1_1 )
                    // InternalTypeScript.g:165:4: rule__Compute__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compute__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComputeAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Compute__Alternatives_1"


    // $ANTLR start "rule__Compute__Alternatives_1_0_0"
    // InternalTypeScript.g:173:1: rule__Compute__Alternatives_1_0_0 : ( ( ( rule__Compute__Group_1_0_0_0__0 ) ) | ( ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* ) ) );
    public final void rule__Compute__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:177:1: ( ( ( rule__Compute__Group_1_0_0_0__0 ) ) | ( ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||(LA3_0>=12 && LA3_0<=14)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTypeScript.g:178:2: ( ( rule__Compute__Group_1_0_0_0__0 ) )
                    {
                    // InternalTypeScript.g:178:2: ( ( rule__Compute__Group_1_0_0_0__0 ) )
                    // InternalTypeScript.g:179:3: ( rule__Compute__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getComputeAccess().getGroup_1_0_0_0()); 
                    // InternalTypeScript.g:180:3: ( rule__Compute__Group_1_0_0_0__0 )
                    // InternalTypeScript.g:180:4: rule__Compute__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compute__Group_1_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComputeAccess().getGroup_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:184:2: ( ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* ) )
                    {
                    // InternalTypeScript.g:184:2: ( ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* ) )
                    // InternalTypeScript.g:185:3: ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* )
                    {
                    // InternalTypeScript.g:185:3: ( ( rule__Compute__ExpressionAssignment_1_0_0_1 ) )
                    // InternalTypeScript.g:186:4: ( rule__Compute__ExpressionAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_1()); 
                    // InternalTypeScript.g:187:4: ( rule__Compute__ExpressionAssignment_1_0_0_1 )
                    // InternalTypeScript.g:187:5: rule__Compute__ExpressionAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__Compute__ExpressionAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_1()); 

                    }

                    // InternalTypeScript.g:190:3: ( ( rule__Compute__ExpressionAssignment_1_0_0_1 )* )
                    // InternalTypeScript.g:191:4: ( rule__Compute__ExpressionAssignment_1_0_0_1 )*
                    {
                     before(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_1()); 
                    // InternalTypeScript.g:192:4: ( rule__Compute__ExpressionAssignment_1_0_0_1 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||(LA2_0>=12 && LA2_0<=14)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTypeScript.g:192:5: rule__Compute__ExpressionAssignment_1_0_0_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Compute__ExpressionAssignment_1_0_0_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_1()); 

                    }


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
    // $ANTLR end "rule__Compute__Alternatives_1_0_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTypeScript.g:201:1: rule__Expression__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) | ( 'as' ) | ( '*' ) | ( '$' ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:205:1: ( ( RULE_INT ) | ( RULE_ID ) | ( 'as' ) | ( '*' ) | ( '$' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 14:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTypeScript.g:206:2: ( RULE_INT )
                    {
                    // InternalTypeScript.g:206:2: ( RULE_INT )
                    // InternalTypeScript.g:207:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:212:2: ( RULE_ID )
                    {
                    // InternalTypeScript.g:212:2: ( RULE_ID )
                    // InternalTypeScript.g:213:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypeScript.g:218:2: ( 'as' )
                    {
                    // InternalTypeScript.g:218:2: ( 'as' )
                    // InternalTypeScript.g:219:3: 'as'
                    {
                     before(grammarAccess.getExpressionAccess().getAsKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getAsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTypeScript.g:224:2: ( '*' )
                    {
                    // InternalTypeScript.g:224:2: ( '*' )
                    // InternalTypeScript.g:225:3: '*'
                    {
                     before(grammarAccess.getExpressionAccess().getAsteriskKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTypeScript.g:230:2: ( '$' )
                    {
                    // InternalTypeScript.g:230:2: ( '$' )
                    // InternalTypeScript.g:231:3: '$'
                    {
                     before(grammarAccess.getExpressionAccess().getDollarSignKeyword_4()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getDollarSignKeyword_4()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Compute__Group__0"
    // InternalTypeScript.g:240:1: rule__Compute__Group__0 : rule__Compute__Group__0__Impl rule__Compute__Group__1 ;
    public final void rule__Compute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:244:1: ( rule__Compute__Group__0__Impl rule__Compute__Group__1 )
            // InternalTypeScript.g:245:2: rule__Compute__Group__0__Impl rule__Compute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Compute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__1();

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
    // $ANTLR end "rule__Compute__Group__0"


    // $ANTLR start "rule__Compute__Group__0__Impl"
    // InternalTypeScript.g:252:1: rule__Compute__Group__0__Impl : ( 'import' ) ;
    public final void rule__Compute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:256:1: ( ( 'import' ) )
            // InternalTypeScript.g:257:1: ( 'import' )
            {
            // InternalTypeScript.g:257:1: ( 'import' )
            // InternalTypeScript.g:258:2: 'import'
            {
             before(grammarAccess.getComputeAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Compute__Group__0__Impl"


    // $ANTLR start "rule__Compute__Group__1"
    // InternalTypeScript.g:267:1: rule__Compute__Group__1 : rule__Compute__Group__1__Impl rule__Compute__Group__2 ;
    public final void rule__Compute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:271:1: ( rule__Compute__Group__1__Impl rule__Compute__Group__2 )
            // InternalTypeScript.g:272:2: rule__Compute__Group__1__Impl rule__Compute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Compute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__2();

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
    // $ANTLR end "rule__Compute__Group__1"


    // $ANTLR start "rule__Compute__Group__1__Impl"
    // InternalTypeScript.g:279:1: rule__Compute__Group__1__Impl : ( ( rule__Compute__Alternatives_1 ) ) ;
    public final void rule__Compute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:283:1: ( ( ( rule__Compute__Alternatives_1 ) ) )
            // InternalTypeScript.g:284:1: ( ( rule__Compute__Alternatives_1 ) )
            {
            // InternalTypeScript.g:284:1: ( ( rule__Compute__Alternatives_1 ) )
            // InternalTypeScript.g:285:2: ( rule__Compute__Alternatives_1 )
            {
             before(grammarAccess.getComputeAccess().getAlternatives_1()); 
            // InternalTypeScript.g:286:2: ( rule__Compute__Alternatives_1 )
            // InternalTypeScript.g:286:3: rule__Compute__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Compute__Group__1__Impl"


    // $ANTLR start "rule__Compute__Group__2"
    // InternalTypeScript.g:294:1: rule__Compute__Group__2 : rule__Compute__Group__2__Impl ;
    public final void rule__Compute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:298:1: ( rule__Compute__Group__2__Impl )
            // InternalTypeScript.g:299:2: rule__Compute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group__2__Impl();

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
    // $ANTLR end "rule__Compute__Group__2"


    // $ANTLR start "rule__Compute__Group__2__Impl"
    // InternalTypeScript.g:305:1: rule__Compute__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Compute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:309:1: ( ( ( ';' )? ) )
            // InternalTypeScript.g:310:1: ( ( ';' )? )
            {
            // InternalTypeScript.g:310:1: ( ( ';' )? )
            // InternalTypeScript.g:311:2: ( ';' )?
            {
             before(grammarAccess.getComputeAccess().getSemicolonKeyword_2()); 
            // InternalTypeScript.g:312:2: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTypeScript.g:312:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComputeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Compute__Group__2__Impl"


    // $ANTLR start "rule__Compute__Group_1_0__0"
    // InternalTypeScript.g:321:1: rule__Compute__Group_1_0__0 : rule__Compute__Group_1_0__0__Impl rule__Compute__Group_1_0__1 ;
    public final void rule__Compute__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:325:1: ( rule__Compute__Group_1_0__0__Impl rule__Compute__Group_1_0__1 )
            // InternalTypeScript.g:326:2: rule__Compute__Group_1_0__0__Impl rule__Compute__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Compute__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0__1();

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
    // $ANTLR end "rule__Compute__Group_1_0__0"


    // $ANTLR start "rule__Compute__Group_1_0__0__Impl"
    // InternalTypeScript.g:333:1: rule__Compute__Group_1_0__0__Impl : ( ( rule__Compute__Alternatives_1_0_0 ) ) ;
    public final void rule__Compute__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:337:1: ( ( ( rule__Compute__Alternatives_1_0_0 ) ) )
            // InternalTypeScript.g:338:1: ( ( rule__Compute__Alternatives_1_0_0 ) )
            {
            // InternalTypeScript.g:338:1: ( ( rule__Compute__Alternatives_1_0_0 ) )
            // InternalTypeScript.g:339:2: ( rule__Compute__Alternatives_1_0_0 )
            {
             before(grammarAccess.getComputeAccess().getAlternatives_1_0_0()); 
            // InternalTypeScript.g:340:2: ( rule__Compute__Alternatives_1_0_0 )
            // InternalTypeScript.g:340:3: rule__Compute__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__Compute__Group_1_0__0__Impl"


    // $ANTLR start "rule__Compute__Group_1_0__1"
    // InternalTypeScript.g:348:1: rule__Compute__Group_1_0__1 : rule__Compute__Group_1_0__1__Impl rule__Compute__Group_1_0__2 ;
    public final void rule__Compute__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:352:1: ( rule__Compute__Group_1_0__1__Impl rule__Compute__Group_1_0__2 )
            // InternalTypeScript.g:353:2: rule__Compute__Group_1_0__1__Impl rule__Compute__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Compute__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0__2();

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
    // $ANTLR end "rule__Compute__Group_1_0__1"


    // $ANTLR start "rule__Compute__Group_1_0__1__Impl"
    // InternalTypeScript.g:360:1: rule__Compute__Group_1_0__1__Impl : ( 'from' ) ;
    public final void rule__Compute__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:364:1: ( ( 'from' ) )
            // InternalTypeScript.g:365:1: ( 'from' )
            {
            // InternalTypeScript.g:365:1: ( 'from' )
            // InternalTypeScript.g:366:2: 'from'
            {
             before(grammarAccess.getComputeAccess().getFromKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getFromKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Compute__Group_1_0__1__Impl"


    // $ANTLR start "rule__Compute__Group_1_0__2"
    // InternalTypeScript.g:375:1: rule__Compute__Group_1_0__2 : rule__Compute__Group_1_0__2__Impl ;
    public final void rule__Compute__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:379:1: ( rule__Compute__Group_1_0__2__Impl )
            // InternalTypeScript.g:380:2: rule__Compute__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Compute__Group_1_0__2"


    // $ANTLR start "rule__Compute__Group_1_0__2__Impl"
    // InternalTypeScript.g:386:1: rule__Compute__Group_1_0__2__Impl : ( ( rule__Compute__NameAssignment_1_0_2 ) ) ;
    public final void rule__Compute__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:390:1: ( ( ( rule__Compute__NameAssignment_1_0_2 ) ) )
            // InternalTypeScript.g:391:1: ( ( rule__Compute__NameAssignment_1_0_2 ) )
            {
            // InternalTypeScript.g:391:1: ( ( rule__Compute__NameAssignment_1_0_2 ) )
            // InternalTypeScript.g:392:2: ( rule__Compute__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getComputeAccess().getNameAssignment_1_0_2()); 
            // InternalTypeScript.g:393:2: ( rule__Compute__NameAssignment_1_0_2 )
            // InternalTypeScript.g:393:3: rule__Compute__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Compute__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getNameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Compute__Group_1_0__2__Impl"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__0"
    // InternalTypeScript.g:402:1: rule__Compute__Group_1_0_0_0__0 : rule__Compute__Group_1_0_0_0__0__Impl rule__Compute__Group_1_0_0_0__1 ;
    public final void rule__Compute__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:406:1: ( rule__Compute__Group_1_0_0_0__0__Impl rule__Compute__Group_1_0_0_0__1 )
            // InternalTypeScript.g:407:2: rule__Compute__Group_1_0_0_0__0__Impl rule__Compute__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Compute__Group_1_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__0"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__0__Impl"
    // InternalTypeScript.g:414:1: rule__Compute__Group_1_0_0_0__0__Impl : ( '{' ) ;
    public final void rule__Compute__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:418:1: ( ( '{' ) )
            // InternalTypeScript.g:419:1: ( '{' )
            {
            // InternalTypeScript.g:419:1: ( '{' )
            // InternalTypeScript.g:420:2: '{'
            {
             before(grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1_0_0_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1_0_0_0_0()); 

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__1"
    // InternalTypeScript.g:429:1: rule__Compute__Group_1_0_0_0__1 : rule__Compute__Group_1_0_0_0__1__Impl rule__Compute__Group_1_0_0_0__2 ;
    public final void rule__Compute__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:433:1: ( rule__Compute__Group_1_0_0_0__1__Impl rule__Compute__Group_1_0_0_0__2 )
            // InternalTypeScript.g:434:2: rule__Compute__Group_1_0_0_0__1__Impl rule__Compute__Group_1_0_0_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Compute__Group_1_0_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0_0_0__2();

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__1"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__1__Impl"
    // InternalTypeScript.g:441:1: rule__Compute__Group_1_0_0_0__1__Impl : ( ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* ) ) ;
    public final void rule__Compute__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:445:1: ( ( ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* ) ) )
            // InternalTypeScript.g:446:1: ( ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* ) )
            {
            // InternalTypeScript.g:446:1: ( ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* ) )
            // InternalTypeScript.g:447:2: ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) ) ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* )
            {
            // InternalTypeScript.g:447:2: ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 ) )
            // InternalTypeScript.g:448:3: ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )
            {
             before(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_0_1()); 
            // InternalTypeScript.g:449:3: ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )
            // InternalTypeScript.g:449:4: rule__Compute__ExpressionAssignment_1_0_0_0_1
            {
            pushFollow(FOLLOW_3);
            rule__Compute__ExpressionAssignment_1_0_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_0_1()); 

            }

            // InternalTypeScript.g:452:2: ( ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )* )
            // InternalTypeScript.g:453:3: ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )*
            {
             before(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_0_1()); 
            // InternalTypeScript.g:454:3: ( rule__Compute__ExpressionAssignment_1_0_0_0_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||(LA6_0>=12 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTypeScript.g:454:4: rule__Compute__ExpressionAssignment_1_0_0_0_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Compute__ExpressionAssignment_1_0_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComputeAccess().getExpressionAssignment_1_0_0_0_1()); 

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__2"
    // InternalTypeScript.g:463:1: rule__Compute__Group_1_0_0_0__2 : rule__Compute__Group_1_0_0_0__2__Impl ;
    public final void rule__Compute__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:467:1: ( rule__Compute__Group_1_0_0_0__2__Impl )
            // InternalTypeScript.g:468:2: rule__Compute__Group_1_0_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group_1_0_0_0__2__Impl();

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__2"


    // $ANTLR start "rule__Compute__Group_1_0_0_0__2__Impl"
    // InternalTypeScript.g:474:1: rule__Compute__Group_1_0_0_0__2__Impl : ( '}' ) ;
    public final void rule__Compute__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:478:1: ( ( '}' ) )
            // InternalTypeScript.g:479:1: ( '}' )
            {
            // InternalTypeScript.g:479:1: ( '}' )
            // InternalTypeScript.g:480:2: '}'
            {
             before(grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_1_0_0_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_1_0_0_0_2()); 

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
    // $ANTLR end "rule__Compute__Group_1_0_0_0__2__Impl"


    // $ANTLR start "rule__Classes__Group__0"
    // InternalTypeScript.g:490:1: rule__Classes__Group__0 : rule__Classes__Group__0__Impl rule__Classes__Group__1 ;
    public final void rule__Classes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:494:1: ( rule__Classes__Group__0__Impl rule__Classes__Group__1 )
            // InternalTypeScript.g:495:2: rule__Classes__Group__0__Impl rule__Classes__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Classes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classes__Group__1();

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
    // $ANTLR end "rule__Classes__Group__0"


    // $ANTLR start "rule__Classes__Group__0__Impl"
    // InternalTypeScript.g:502:1: rule__Classes__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__Classes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:506:1: ( ( ruleExpression ) )
            // InternalTypeScript.g:507:1: ( ruleExpression )
            {
            // InternalTypeScript.g:507:1: ( ruleExpression )
            // InternalTypeScript.g:508:2: ruleExpression
            {
             before(grammarAccess.getClassesAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getClassesAccess().getExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Classes__Group__0__Impl"


    // $ANTLR start "rule__Classes__Group__1"
    // InternalTypeScript.g:517:1: rule__Classes__Group__1 : rule__Classes__Group__1__Impl ;
    public final void rule__Classes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:521:1: ( rule__Classes__Group__1__Impl )
            // InternalTypeScript.g:522:2: rule__Classes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classes__Group__1__Impl();

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
    // $ANTLR end "rule__Classes__Group__1"


    // $ANTLR start "rule__Classes__Group__1__Impl"
    // InternalTypeScript.g:528:1: rule__Classes__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Classes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:532:1: ( ( ( ',' )? ) )
            // InternalTypeScript.g:533:1: ( ( ',' )? )
            {
            // InternalTypeScript.g:533:1: ( ( ',' )? )
            // InternalTypeScript.g:534:2: ( ',' )?
            {
             before(grammarAccess.getClassesAccess().getCommaKeyword_1()); 
            // InternalTypeScript.g:535:2: ( ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTypeScript.g:535:3: ','
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassesAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__Classes__Group__1__Impl"


    // $ANTLR start "rule__Model__ComputeAssignment"
    // InternalTypeScript.g:544:1: rule__Model__ComputeAssignment : ( ruleCompute ) ;
    public final void rule__Model__ComputeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:548:1: ( ( ruleCompute ) )
            // InternalTypeScript.g:549:2: ( ruleCompute )
            {
            // InternalTypeScript.g:549:2: ( ruleCompute )
            // InternalTypeScript.g:550:3: ruleCompute
            {
             before(grammarAccess.getModelAccess().getComputeComputeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompute();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComputeComputeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ComputeAssignment"


    // $ANTLR start "rule__Compute__ExpressionAssignment_1_0_0_0_1"
    // InternalTypeScript.g:559:1: rule__Compute__ExpressionAssignment_1_0_0_0_1 : ( ruleClasses ) ;
    public final void rule__Compute__ExpressionAssignment_1_0_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:563:1: ( ( ruleClasses ) )
            // InternalTypeScript.g:564:2: ( ruleClasses )
            {
            // InternalTypeScript.g:564:2: ( ruleClasses )
            // InternalTypeScript.g:565:3: ruleClasses
            {
             before(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClasses();

            state._fsp--;

             after(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_0_1_0()); 

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
    // $ANTLR end "rule__Compute__ExpressionAssignment_1_0_0_0_1"


    // $ANTLR start "rule__Compute__ExpressionAssignment_1_0_0_1"
    // InternalTypeScript.g:574:1: rule__Compute__ExpressionAssignment_1_0_0_1 : ( ruleClasses ) ;
    public final void rule__Compute__ExpressionAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:578:1: ( ( ruleClasses ) )
            // InternalTypeScript.g:579:2: ( ruleClasses )
            {
            // InternalTypeScript.g:579:2: ( ruleClasses )
            // InternalTypeScript.g:580:3: ruleClasses
            {
             before(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClasses();

            state._fsp--;

             after(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_1_0()); 

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
    // $ANTLR end "rule__Compute__ExpressionAssignment_1_0_0_1"


    // $ANTLR start "rule__Compute__NameAssignment_1_0_2"
    // InternalTypeScript.g:589:1: rule__Compute__NameAssignment_1_0_2 : ( RULE_TEXTOS ) ;
    public final void rule__Compute__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:593:1: ( ( RULE_TEXTOS ) )
            // InternalTypeScript.g:594:2: ( RULE_TEXTOS )
            {
            // InternalTypeScript.g:594:2: ( RULE_TEXTOS )
            // InternalTypeScript.g:595:3: RULE_TEXTOS
            {
             before(grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_TEXTOS,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Compute__NameAssignment_1_0_2"


    // $ANTLR start "rule__Compute__NameAssignment_1_1"
    // InternalTypeScript.g:604:1: rule__Compute__NameAssignment_1_1 : ( RULE_TEXTOS ) ;
    public final void rule__Compute__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:608:1: ( ( RULE_TEXTOS ) )
            // InternalTypeScript.g:609:2: ( RULE_TEXTOS )
            {
            // InternalTypeScript.g:609:2: ( RULE_TEXTOS )
            // InternalTypeScript.g:610:3: RULE_TEXTOS
            {
             before(grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_1_0()); 
            match(input,RULE_TEXTOS,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Compute__NameAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000047070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}