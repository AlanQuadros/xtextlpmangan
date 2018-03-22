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
    // InternalTypeScript.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalTypeScript.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalTypeScript.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalTypeScript.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalTypeScript.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTypeScript.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleGreeting"
    // InternalTypeScript.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalTypeScript.g:79:1: ( ruleGreeting EOF )
            // InternalTypeScript.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalTypeScript.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalTypeScript.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalTypeScript.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalTypeScript.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalTypeScript.g:94:3: ( rule__Greeting__Group__0 )
            // InternalTypeScript.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleExpression"
    // InternalTypeScript.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTypeScript.g:104:1: ( ruleExpression EOF )
            // InternalTypeScript.g:105:1: ruleExpression EOF
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
    // InternalTypeScript.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalTypeScript.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalTypeScript.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalTypeScript.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalTypeScript.g:119:3: ( rule__Expression__Alternatives )
            // InternalTypeScript.g:119:4: rule__Expression__Alternatives
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


    // $ANTLR start "rule__Greeting__Alternatives_1"
    // InternalTypeScript.g:127:1: rule__Greeting__Alternatives_1 : ( ( ( rule__Greeting__Group_1_0__0 ) ) | ( ( rule__Greeting__NameAssignment_1_1 ) ) );
    public final void rule__Greeting__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:131:1: ( ( ( rule__Greeting__Group_1_0__0 ) ) | ( ( rule__Greeting__NameAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||(LA2_0>=12 && LA2_0<=14)||(LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TEXTOS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTypeScript.g:132:2: ( ( rule__Greeting__Group_1_0__0 ) )
                    {
                    // InternalTypeScript.g:132:2: ( ( rule__Greeting__Group_1_0__0 ) )
                    // InternalTypeScript.g:133:3: ( rule__Greeting__Group_1_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_1_0()); 
                    // InternalTypeScript.g:134:3: ( rule__Greeting__Group_1_0__0 )
                    // InternalTypeScript.g:134:4: rule__Greeting__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:138:2: ( ( rule__Greeting__NameAssignment_1_1 ) )
                    {
                    // InternalTypeScript.g:138:2: ( ( rule__Greeting__NameAssignment_1_1 ) )
                    // InternalTypeScript.g:139:3: ( rule__Greeting__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getGreetingAccess().getNameAssignment_1_1()); 
                    // InternalTypeScript.g:140:3: ( rule__Greeting__NameAssignment_1_1 )
                    // InternalTypeScript.g:140:4: rule__Greeting__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Greeting__Alternatives_1"


    // $ANTLR start "rule__Greeting__Alternatives_1_0_0"
    // InternalTypeScript.g:148:1: rule__Greeting__Alternatives_1_0_0 : ( ( ( rule__Greeting__Group_1_0_0_0__0 ) ) | ( ( rule__Greeting__Group_1_0_0_1__0 )* ) );
    public final void rule__Greeting__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:152:1: ( ( ( rule__Greeting__Group_1_0_0_0__0 ) ) | ( ( rule__Greeting__Group_1_0_0_1__0 )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=12 && LA4_0<=14)||LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTypeScript.g:153:2: ( ( rule__Greeting__Group_1_0_0_0__0 ) )
                    {
                    // InternalTypeScript.g:153:2: ( ( rule__Greeting__Group_1_0_0_0__0 ) )
                    // InternalTypeScript.g:154:3: ( rule__Greeting__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_1_0_0_0()); 
                    // InternalTypeScript.g:155:3: ( rule__Greeting__Group_1_0_0_0__0 )
                    // InternalTypeScript.g:155:4: rule__Greeting__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__Group_1_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:159:2: ( ( rule__Greeting__Group_1_0_0_1__0 )* )
                    {
                    // InternalTypeScript.g:159:2: ( ( rule__Greeting__Group_1_0_0_1__0 )* )
                    // InternalTypeScript.g:160:3: ( rule__Greeting__Group_1_0_0_1__0 )*
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_1_0_0_1()); 
                    // InternalTypeScript.g:161:3: ( rule__Greeting__Group_1_0_0_1__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||(LA3_0>=12 && LA3_0<=14)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTypeScript.g:161:4: rule__Greeting__Group_1_0_0_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Greeting__Group_1_0_0_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getGreetingAccess().getGroup_1_0_0_1()); 

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
    // $ANTLR end "rule__Greeting__Alternatives_1_0_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTypeScript.g:169:1: rule__Expression__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) | ( 'as' ) | ( '*' ) | ( '$' ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:173:1: ( ( RULE_INT ) | ( RULE_ID ) | ( 'as' ) | ( '*' ) | ( '$' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 12:
                {
                alt5=3;
                }
                break;
            case 13:
                {
                alt5=4;
                }
                break;
            case 14:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTypeScript.g:174:2: ( RULE_INT )
                    {
                    // InternalTypeScript.g:174:2: ( RULE_INT )
                    // InternalTypeScript.g:175:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:180:2: ( RULE_ID )
                    {
                    // InternalTypeScript.g:180:2: ( RULE_ID )
                    // InternalTypeScript.g:181:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypeScript.g:186:2: ( 'as' )
                    {
                    // InternalTypeScript.g:186:2: ( 'as' )
                    // InternalTypeScript.g:187:3: 'as'
                    {
                     before(grammarAccess.getExpressionAccess().getAsKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getAsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTypeScript.g:192:2: ( '*' )
                    {
                    // InternalTypeScript.g:192:2: ( '*' )
                    // InternalTypeScript.g:193:3: '*'
                    {
                     before(grammarAccess.getExpressionAccess().getAsteriskKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTypeScript.g:198:2: ( '$' )
                    {
                    // InternalTypeScript.g:198:2: ( '$' )
                    // InternalTypeScript.g:199:3: '$'
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


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalTypeScript.g:208:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:212:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalTypeScript.g:213:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalTypeScript.g:220:1: rule__Greeting__Group__0__Impl : ( 'import' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:224:1: ( ( 'import' ) )
            // InternalTypeScript.g:225:1: ( 'import' )
            {
            // InternalTypeScript.g:225:1: ( 'import' )
            // InternalTypeScript.g:226:2: 'import'
            {
             before(grammarAccess.getGreetingAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalTypeScript.g:235:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:239:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalTypeScript.g:240:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalTypeScript.g:247:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__Alternatives_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:251:1: ( ( ( rule__Greeting__Alternatives_1 ) ) )
            // InternalTypeScript.g:252:1: ( ( rule__Greeting__Alternatives_1 ) )
            {
            // InternalTypeScript.g:252:1: ( ( rule__Greeting__Alternatives_1 ) )
            // InternalTypeScript.g:253:2: ( rule__Greeting__Alternatives_1 )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives_1()); 
            // InternalTypeScript.g:254:2: ( rule__Greeting__Alternatives_1 )
            // InternalTypeScript.g:254:3: rule__Greeting__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalTypeScript.g:262:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:266:1: ( rule__Greeting__Group__2__Impl )
            // InternalTypeScript.g:267:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalTypeScript.g:273:1: rule__Greeting__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:277:1: ( ( ( ';' )? ) )
            // InternalTypeScript.g:278:1: ( ( ';' )? )
            {
            // InternalTypeScript.g:278:1: ( ( ';' )? )
            // InternalTypeScript.g:279:2: ( ';' )?
            {
             before(grammarAccess.getGreetingAccess().getSemicolonKeyword_2()); 
            // InternalTypeScript.g:280:2: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTypeScript.g:280:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGreetingAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0__0"
    // InternalTypeScript.g:289:1: rule__Greeting__Group_1_0__0 : rule__Greeting__Group_1_0__0__Impl rule__Greeting__Group_1_0__1 ;
    public final void rule__Greeting__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:293:1: ( rule__Greeting__Group_1_0__0__Impl rule__Greeting__Group_1_0__1 )
            // InternalTypeScript.g:294:2: rule__Greeting__Group_1_0__0__Impl rule__Greeting__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Greeting__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0__1();

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
    // $ANTLR end "rule__Greeting__Group_1_0__0"


    // $ANTLR start "rule__Greeting__Group_1_0__0__Impl"
    // InternalTypeScript.g:301:1: rule__Greeting__Group_1_0__0__Impl : ( ( rule__Greeting__Alternatives_1_0_0 ) ) ;
    public final void rule__Greeting__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:305:1: ( ( ( rule__Greeting__Alternatives_1_0_0 ) ) )
            // InternalTypeScript.g:306:1: ( ( rule__Greeting__Alternatives_1_0_0 ) )
            {
            // InternalTypeScript.g:306:1: ( ( rule__Greeting__Alternatives_1_0_0 ) )
            // InternalTypeScript.g:307:2: ( rule__Greeting__Alternatives_1_0_0 )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives_1_0_0()); 
            // InternalTypeScript.g:308:2: ( rule__Greeting__Alternatives_1_0_0 )
            // InternalTypeScript.g:308:3: rule__Greeting__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0__0__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0__1"
    // InternalTypeScript.g:316:1: rule__Greeting__Group_1_0__1 : rule__Greeting__Group_1_0__1__Impl rule__Greeting__Group_1_0__2 ;
    public final void rule__Greeting__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:320:1: ( rule__Greeting__Group_1_0__1__Impl rule__Greeting__Group_1_0__2 )
            // InternalTypeScript.g:321:2: rule__Greeting__Group_1_0__1__Impl rule__Greeting__Group_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Greeting__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0__2();

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
    // $ANTLR end "rule__Greeting__Group_1_0__1"


    // $ANTLR start "rule__Greeting__Group_1_0__1__Impl"
    // InternalTypeScript.g:328:1: rule__Greeting__Group_1_0__1__Impl : ( 'from' ) ;
    public final void rule__Greeting__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:332:1: ( ( 'from' ) )
            // InternalTypeScript.g:333:1: ( 'from' )
            {
            // InternalTypeScript.g:333:1: ( 'from' )
            // InternalTypeScript.g:334:2: 'from'
            {
             before(grammarAccess.getGreetingAccess().getFromKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getFromKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0__1__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0__2"
    // InternalTypeScript.g:343:1: rule__Greeting__Group_1_0__2 : rule__Greeting__Group_1_0__2__Impl ;
    public final void rule__Greeting__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:347:1: ( rule__Greeting__Group_1_0__2__Impl )
            // InternalTypeScript.g:348:2: rule__Greeting__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group_1_0__2"


    // $ANTLR start "rule__Greeting__Group_1_0__2__Impl"
    // InternalTypeScript.g:354:1: rule__Greeting__Group_1_0__2__Impl : ( ( rule__Greeting__NameAssignment_1_0_2 ) ) ;
    public final void rule__Greeting__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:358:1: ( ( ( rule__Greeting__NameAssignment_1_0_2 ) ) )
            // InternalTypeScript.g:359:1: ( ( rule__Greeting__NameAssignment_1_0_2 ) )
            {
            // InternalTypeScript.g:359:1: ( ( rule__Greeting__NameAssignment_1_0_2 ) )
            // InternalTypeScript.g:360:2: ( rule__Greeting__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1_0_2()); 
            // InternalTypeScript.g:361:2: ( rule__Greeting__NameAssignment_1_0_2 )
            // InternalTypeScript.g:361:3: rule__Greeting__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0__2__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__0"
    // InternalTypeScript.g:370:1: rule__Greeting__Group_1_0_0_0__0 : rule__Greeting__Group_1_0_0_0__0__Impl rule__Greeting__Group_1_0_0_0__1 ;
    public final void rule__Greeting__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:374:1: ( rule__Greeting__Group_1_0_0_0__0__Impl rule__Greeting__Group_1_0_0_0__1 )
            // InternalTypeScript.g:375:2: rule__Greeting__Group_1_0_0_0__0__Impl rule__Greeting__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Greeting__Group_1_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__0"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__0__Impl"
    // InternalTypeScript.g:382:1: rule__Greeting__Group_1_0_0_0__0__Impl : ( '{' ) ;
    public final void rule__Greeting__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:386:1: ( ( '{' ) )
            // InternalTypeScript.g:387:1: ( '{' )
            {
            // InternalTypeScript.g:387:1: ( '{' )
            // InternalTypeScript.g:388:2: '{'
            {
             before(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_1_0_0_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_1_0_0_0_0()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__1"
    // InternalTypeScript.g:397:1: rule__Greeting__Group_1_0_0_0__1 : rule__Greeting__Group_1_0_0_0__1__Impl rule__Greeting__Group_1_0_0_0__2 ;
    public final void rule__Greeting__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:401:1: ( rule__Greeting__Group_1_0_0_0__1__Impl rule__Greeting__Group_1_0_0_0__2 )
            // InternalTypeScript.g:402:2: rule__Greeting__Group_1_0_0_0__1__Impl rule__Greeting__Group_1_0_0_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Greeting__Group_1_0_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_0__2();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__1"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__1__Impl"
    // InternalTypeScript.g:409:1: rule__Greeting__Group_1_0_0_0__1__Impl : ( ( rule__Greeting__Group_1_0_0_0_1__0 )* ) ;
    public final void rule__Greeting__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:413:1: ( ( ( rule__Greeting__Group_1_0_0_0_1__0 )* ) )
            // InternalTypeScript.g:414:1: ( ( rule__Greeting__Group_1_0_0_0_1__0 )* )
            {
            // InternalTypeScript.g:414:1: ( ( rule__Greeting__Group_1_0_0_0_1__0 )* )
            // InternalTypeScript.g:415:2: ( rule__Greeting__Group_1_0_0_0_1__0 )*
            {
             before(grammarAccess.getGreetingAccess().getGroup_1_0_0_0_1()); 
            // InternalTypeScript.g:416:2: ( rule__Greeting__Group_1_0_0_0_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||(LA7_0>=12 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTypeScript.g:416:3: rule__Greeting__Group_1_0_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Greeting__Group_1_0_0_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGreetingAccess().getGroup_1_0_0_0_1()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__2"
    // InternalTypeScript.g:424:1: rule__Greeting__Group_1_0_0_0__2 : rule__Greeting__Group_1_0_0_0__2__Impl ;
    public final void rule__Greeting__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:428:1: ( rule__Greeting__Group_1_0_0_0__2__Impl )
            // InternalTypeScript.g:429:2: rule__Greeting__Group_1_0_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_0__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__2"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0__2__Impl"
    // InternalTypeScript.g:435:1: rule__Greeting__Group_1_0_0_0__2__Impl : ( '}' ) ;
    public final void rule__Greeting__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:439:1: ( ( '}' ) )
            // InternalTypeScript.g:440:1: ( '}' )
            {
            // InternalTypeScript.g:440:1: ( '}' )
            // InternalTypeScript.g:441:2: '}'
            {
             before(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_1_0_0_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_1_0_0_0_2()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0__2__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0_1__0"
    // InternalTypeScript.g:451:1: rule__Greeting__Group_1_0_0_0_1__0 : rule__Greeting__Group_1_0_0_0_1__0__Impl rule__Greeting__Group_1_0_0_0_1__1 ;
    public final void rule__Greeting__Group_1_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:455:1: ( rule__Greeting__Group_1_0_0_0_1__0__Impl rule__Greeting__Group_1_0_0_0_1__1 )
            // InternalTypeScript.g:456:2: rule__Greeting__Group_1_0_0_0_1__0__Impl rule__Greeting__Group_1_0_0_0_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Greeting__Group_1_0_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_0_1__1();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0_1__0"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0_1__0__Impl"
    // InternalTypeScript.g:463:1: rule__Greeting__Group_1_0_0_0_1__0__Impl : ( ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 ) ) ;
    public final void rule__Greeting__Group_1_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:467:1: ( ( ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 ) ) )
            // InternalTypeScript.g:468:1: ( ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 ) )
            {
            // InternalTypeScript.g:468:1: ( ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 ) )
            // InternalTypeScript.g:469:2: ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 )
            {
             before(grammarAccess.getGreetingAccess().getExpressionAssignment_1_0_0_0_1_0()); 
            // InternalTypeScript.g:470:2: ( rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 )
            // InternalTypeScript.g:470:3: rule__Greeting__ExpressionAssignment_1_0_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ExpressionAssignment_1_0_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getExpressionAssignment_1_0_0_0_1_0()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0_1__0__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0_1__1"
    // InternalTypeScript.g:478:1: rule__Greeting__Group_1_0_0_0_1__1 : rule__Greeting__Group_1_0_0_0_1__1__Impl ;
    public final void rule__Greeting__Group_1_0_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:482:1: ( rule__Greeting__Group_1_0_0_0_1__1__Impl )
            // InternalTypeScript.g:483:2: rule__Greeting__Group_1_0_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_0_1__1__Impl();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0_1__1"


    // $ANTLR start "rule__Greeting__Group_1_0_0_0_1__1__Impl"
    // InternalTypeScript.g:489:1: rule__Greeting__Group_1_0_0_0_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Greeting__Group_1_0_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:493:1: ( ( ( ',' )? ) )
            // InternalTypeScript.g:494:1: ( ( ',' )? )
            {
            // InternalTypeScript.g:494:1: ( ( ',' )? )
            // InternalTypeScript.g:495:2: ( ',' )?
            {
             before(grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_0_1_1()); 
            // InternalTypeScript.g:496:2: ( ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTypeScript.g:496:3: ','
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_0_1_1()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_0_1__1__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_1__0"
    // InternalTypeScript.g:505:1: rule__Greeting__Group_1_0_0_1__0 : rule__Greeting__Group_1_0_0_1__0__Impl rule__Greeting__Group_1_0_0_1__1 ;
    public final void rule__Greeting__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:509:1: ( rule__Greeting__Group_1_0_0_1__0__Impl rule__Greeting__Group_1_0_0_1__1 )
            // InternalTypeScript.g:510:2: rule__Greeting__Group_1_0_0_1__0__Impl rule__Greeting__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Greeting__Group_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_1__0"


    // $ANTLR start "rule__Greeting__Group_1_0_0_1__0__Impl"
    // InternalTypeScript.g:517:1: rule__Greeting__Group_1_0_0_1__0__Impl : ( ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 ) ) ;
    public final void rule__Greeting__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:521:1: ( ( ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 ) ) )
            // InternalTypeScript.g:522:1: ( ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 ) )
            {
            // InternalTypeScript.g:522:1: ( ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 ) )
            // InternalTypeScript.g:523:2: ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 )
            {
             before(grammarAccess.getGreetingAccess().getExpressionAssignment_1_0_0_1_0()); 
            // InternalTypeScript.g:524:2: ( rule__Greeting__ExpressionAssignment_1_0_0_1_0 )
            // InternalTypeScript.g:524:3: rule__Greeting__ExpressionAssignment_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ExpressionAssignment_1_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getExpressionAssignment_1_0_0_1_0()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__Greeting__Group_1_0_0_1__1"
    // InternalTypeScript.g:532:1: rule__Greeting__Group_1_0_0_1__1 : rule__Greeting__Group_1_0_0_1__1__Impl ;
    public final void rule__Greeting__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:536:1: ( rule__Greeting__Group_1_0_0_1__1__Impl )
            // InternalTypeScript.g:537:2: rule__Greeting__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group_1_0_0_1__1__Impl();

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_1__1"


    // $ANTLR start "rule__Greeting__Group_1_0_0_1__1__Impl"
    // InternalTypeScript.g:543:1: rule__Greeting__Group_1_0_0_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Greeting__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:547:1: ( ( ( ',' )? ) )
            // InternalTypeScript.g:548:1: ( ( ',' )? )
            {
            // InternalTypeScript.g:548:1: ( ( ',' )? )
            // InternalTypeScript.g:549:2: ( ',' )?
            {
             before(grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_1_1()); 
            // InternalTypeScript.g:550:2: ( ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTypeScript.g:550:3: ','
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_1_1()); 

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
    // $ANTLR end "rule__Greeting__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalTypeScript.g:559:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:563:1: ( ( ruleGreeting ) )
            // InternalTypeScript.g:564:2: ( ruleGreeting )
            {
            // InternalTypeScript.g:564:2: ( ruleGreeting )
            // InternalTypeScript.g:565:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__ExpressionAssignment_1_0_0_0_1_0"
    // InternalTypeScript.g:574:1: rule__Greeting__ExpressionAssignment_1_0_0_0_1_0 : ( ruleExpression ) ;
    public final void rule__Greeting__ExpressionAssignment_1_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:578:1: ( ( ruleExpression ) )
            // InternalTypeScript.g:579:2: ( ruleExpression )
            {
            // InternalTypeScript.g:579:2: ( ruleExpression )
            // InternalTypeScript.g:580:3: ruleExpression
            {
             before(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_0_1_0_0()); 

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
    // $ANTLR end "rule__Greeting__ExpressionAssignment_1_0_0_0_1_0"


    // $ANTLR start "rule__Greeting__ExpressionAssignment_1_0_0_1_0"
    // InternalTypeScript.g:589:1: rule__Greeting__ExpressionAssignment_1_0_0_1_0 : ( ruleExpression ) ;
    public final void rule__Greeting__ExpressionAssignment_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:593:1: ( ( ruleExpression ) )
            // InternalTypeScript.g:594:2: ( ruleExpression )
            {
            // InternalTypeScript.g:594:2: ( ruleExpression )
            // InternalTypeScript.g:595:3: ruleExpression
            {
             before(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_1_0_0()); 

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
    // $ANTLR end "rule__Greeting__ExpressionAssignment_1_0_0_1_0"


    // $ANTLR start "rule__Greeting__NameAssignment_1_0_2"
    // InternalTypeScript.g:604:1: rule__Greeting__NameAssignment_1_0_2 : ( RULE_TEXTOS ) ;
    public final void rule__Greeting__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:608:1: ( ( RULE_TEXTOS ) )
            // InternalTypeScript.g:609:2: ( RULE_TEXTOS )
            {
            // InternalTypeScript.g:609:2: ( RULE_TEXTOS )
            // InternalTypeScript.g:610:3: RULE_TEXTOS
            {
             before(grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_TEXTOS,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1_0_2"


    // $ANTLR start "rule__Greeting__NameAssignment_1_1"
    // InternalTypeScript.g:619:1: rule__Greeting__NameAssignment_1_1 : ( RULE_TEXTOS ) ;
    public final void rule__Greeting__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:623:1: ( ( RULE_TEXTOS ) )
            // InternalTypeScript.g:624:2: ( RULE_TEXTOS )
            {
            // InternalTypeScript.g:624:2: ( RULE_TEXTOS )
            // InternalTypeScript.g:625:3: RULE_TEXTOS
            {
             before(grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_1_0()); 
            match(input,RULE_TEXTOS,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000047070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000087030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}