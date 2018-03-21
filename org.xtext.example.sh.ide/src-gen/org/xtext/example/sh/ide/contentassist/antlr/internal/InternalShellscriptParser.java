package org.xtext.example.sh.ide.contentassist.antlr.internal;

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
import org.xtext.example.sh.services.ShellscriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShellscriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$'", "'='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalShellscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShellscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShellscriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShellscript.g"; }


    	private ShellscriptGrammarAccess grammarAccess;

    	public void setGrammarAccess(ShellscriptGrammarAccess grammarAccess) {
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
    // InternalShellscript.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShellscript.g:54:1: ( ruleModel EOF )
            // InternalShellscript.g:55:1: ruleModel EOF
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
    // InternalShellscript.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalShellscript.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalShellscript.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalShellscript.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalShellscript.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShellscript.g:69:4: rule__Model__GreetingsAssignment
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
    // InternalShellscript.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalShellscript.g:79:1: ( ruleGreeting EOF )
            // InternalShellscript.g:80:1: ruleGreeting EOF
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
    // InternalShellscript.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalShellscript.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalShellscript.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalShellscript.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalShellscript.g:94:3: ( rule__Greeting__Group__0 )
            // InternalShellscript.g:94:4: rule__Greeting__Group__0
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
    // InternalShellscript.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalShellscript.g:104:1: ( ruleExpression EOF )
            // InternalShellscript.g:105:1: ruleExpression EOF
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
    // InternalShellscript.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalShellscript.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalShellscript.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalShellscript.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalShellscript.g:119:3: ( rule__Expression__Alternatives )
            // InternalShellscript.g:119:4: rule__Expression__Alternatives
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalShellscript.g:127:1: rule__Expression__Alternatives : ( ( RULE_INT ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:131:1: ( ( RULE_INT ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalShellscript.g:132:2: ( RULE_INT )
                    {
                    // InternalShellscript.g:132:2: ( RULE_INT )
                    // InternalShellscript.g:133:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShellscript.g:138:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalShellscript.g:138:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalShellscript.g:139:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalShellscript.g:140:3: ( rule__Expression__Group_1__0 )
                    // InternalShellscript.g:140:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // InternalShellscript.g:148:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:152:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalShellscript.g:153:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalShellscript.g:160:1: rule__Greeting__Group__0__Impl : ( '$' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:164:1: ( ( '$' ) )
            // InternalShellscript.g:165:1: ( '$' )
            {
            // InternalShellscript.g:165:1: ( '$' )
            // InternalShellscript.g:166:2: '$'
            {
             before(grammarAccess.getGreetingAccess().getDollarSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getDollarSignKeyword_0()); 

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
    // InternalShellscript.g:175:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:179:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalShellscript.g:180:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalShellscript.g:187:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:191:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalShellscript.g:192:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalShellscript.g:192:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalShellscript.g:193:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalShellscript.g:194:2: ( rule__Greeting__NameAssignment_1 )
            // InternalShellscript.g:194:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // InternalShellscript.g:202:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:206:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // InternalShellscript.g:207:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__3();

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
    // InternalShellscript.g:214:1: rule__Greeting__Group__2__Impl : ( '=' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:218:1: ( ( '=' ) )
            // InternalShellscript.g:219:1: ( '=' )
            {
            // InternalShellscript.g:219:1: ( '=' )
            // InternalShellscript.g:220:2: '='
            {
             before(grammarAccess.getGreetingAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getEqualsSignKeyword_2()); 

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


    // $ANTLR start "rule__Greeting__Group__3"
    // InternalShellscript.g:229:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:233:1: ( rule__Greeting__Group__3__Impl )
            // InternalShellscript.g:234:2: rule__Greeting__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__3__Impl();

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
    // $ANTLR end "rule__Greeting__Group__3"


    // $ANTLR start "rule__Greeting__Group__3__Impl"
    // InternalShellscript.g:240:1: rule__Greeting__Group__3__Impl : ( ( rule__Greeting__ExpressionAssignment_3 ) ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:244:1: ( ( ( rule__Greeting__ExpressionAssignment_3 ) ) )
            // InternalShellscript.g:245:1: ( ( rule__Greeting__ExpressionAssignment_3 ) )
            {
            // InternalShellscript.g:245:1: ( ( rule__Greeting__ExpressionAssignment_3 ) )
            // InternalShellscript.g:246:2: ( rule__Greeting__ExpressionAssignment_3 )
            {
             before(grammarAccess.getGreetingAccess().getExpressionAssignment_3()); 
            // InternalShellscript.g:247:2: ( rule__Greeting__ExpressionAssignment_3 )
            // InternalShellscript.g:247:3: rule__Greeting__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getExpressionAssignment_3()); 

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
    // $ANTLR end "rule__Greeting__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalShellscript.g:256:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:260:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalShellscript.g:261:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalShellscript.g:268:1: rule__Expression__Group_1__0__Impl : ( '$' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:272:1: ( ( '$' ) )
            // InternalShellscript.g:273:1: ( '$' )
            {
            // InternalShellscript.g:273:1: ( '$' )
            // InternalShellscript.g:274:2: '$'
            {
             before(grammarAccess.getExpressionAccess().getDollarSignKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getDollarSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalShellscript.g:283:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:287:1: ( rule__Expression__Group_1__1__Impl )
            // InternalShellscript.g:288:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalShellscript.g:294:1: rule__Expression__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:298:1: ( ( RULE_ID ) )
            // InternalShellscript.g:299:1: ( RULE_ID )
            {
            // InternalShellscript.g:299:1: ( RULE_ID )
            // InternalShellscript.g:300:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalShellscript.g:310:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:314:1: ( ( ruleGreeting ) )
            // InternalShellscript.g:315:2: ( ruleGreeting )
            {
            // InternalShellscript.g:315:2: ( ruleGreeting )
            // InternalShellscript.g:316:3: ruleGreeting
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


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalShellscript.g:325:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:329:1: ( ( RULE_ID ) )
            // InternalShellscript.g:330:2: ( RULE_ID )
            {
            // InternalShellscript.g:330:2: ( RULE_ID )
            // InternalShellscript.g:331:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Greeting__ExpressionAssignment_3"
    // InternalShellscript.g:340:1: rule__Greeting__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Greeting__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellscript.g:344:1: ( ( ruleExpression ) )
            // InternalShellscript.g:345:2: ( ruleExpression )
            {
            // InternalShellscript.g:345:2: ( ruleExpression )
            // InternalShellscript.g:346:3: ruleExpression
            {
             before(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Greeting__ExpressionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000810L});

}