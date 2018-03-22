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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'{'", "'}'", "'from'", "';'", "','"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTypeScript.g:127:1: rule__Expression__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:131:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTypeScript.g:132:2: ( RULE_INT )
                    {
                    // InternalTypeScript.g:132:2: ( RULE_INT )
                    // InternalTypeScript.g:133:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:138:2: ( RULE_ID )
                    {
                    // InternalTypeScript.g:138:2: ( RULE_ID )
                    // InternalTypeScript.g:139:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 

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
    // InternalTypeScript.g:148:1: rule__Compute__Group__0 : rule__Compute__Group__0__Impl rule__Compute__Group__1 ;
    public final void rule__Compute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:152:1: ( rule__Compute__Group__0__Impl rule__Compute__Group__1 )
            // InternalTypeScript.g:153:2: rule__Compute__Group__0__Impl rule__Compute__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTypeScript.g:160:1: rule__Compute__Group__0__Impl : ( 'import' ) ;
    public final void rule__Compute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:164:1: ( ( 'import' ) )
            // InternalTypeScript.g:165:1: ( 'import' )
            {
            // InternalTypeScript.g:165:1: ( 'import' )
            // InternalTypeScript.g:166:2: 'import'
            {
             before(grammarAccess.getComputeAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalTypeScript.g:175:1: rule__Compute__Group__1 : rule__Compute__Group__1__Impl rule__Compute__Group__2 ;
    public final void rule__Compute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:179:1: ( rule__Compute__Group__1__Impl rule__Compute__Group__2 )
            // InternalTypeScript.g:180:2: rule__Compute__Group__1__Impl rule__Compute__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalTypeScript.g:187:1: rule__Compute__Group__1__Impl : ( '{' ) ;
    public final void rule__Compute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:191:1: ( ( '{' ) )
            // InternalTypeScript.g:192:1: ( '{' )
            {
            // InternalTypeScript.g:192:1: ( '{' )
            // InternalTypeScript.g:193:2: '{'
            {
             before(grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTypeScript.g:202:1: rule__Compute__Group__2 : rule__Compute__Group__2__Impl rule__Compute__Group__3 ;
    public final void rule__Compute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:206:1: ( rule__Compute__Group__2__Impl rule__Compute__Group__3 )
            // InternalTypeScript.g:207:2: rule__Compute__Group__2__Impl rule__Compute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Compute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__3();

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
    // InternalTypeScript.g:214:1: rule__Compute__Group__2__Impl : ( ( rule__Compute__Group_2__0 )* ) ;
    public final void rule__Compute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:218:1: ( ( ( rule__Compute__Group_2__0 )* ) )
            // InternalTypeScript.g:219:1: ( ( rule__Compute__Group_2__0 )* )
            {
            // InternalTypeScript.g:219:1: ( ( rule__Compute__Group_2__0 )* )
            // InternalTypeScript.g:220:2: ( rule__Compute__Group_2__0 )*
            {
             before(grammarAccess.getComputeAccess().getGroup_2()); 
            // InternalTypeScript.g:221:2: ( rule__Compute__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTypeScript.g:221:3: rule__Compute__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Compute__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getComputeAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Compute__Group__3"
    // InternalTypeScript.g:229:1: rule__Compute__Group__3 : rule__Compute__Group__3__Impl rule__Compute__Group__4 ;
    public final void rule__Compute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:233:1: ( rule__Compute__Group__3__Impl rule__Compute__Group__4 )
            // InternalTypeScript.g:234:2: rule__Compute__Group__3__Impl rule__Compute__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Compute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__4();

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
    // $ANTLR end "rule__Compute__Group__3"


    // $ANTLR start "rule__Compute__Group__3__Impl"
    // InternalTypeScript.g:241:1: rule__Compute__Group__3__Impl : ( '}' ) ;
    public final void rule__Compute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:245:1: ( ( '}' ) )
            // InternalTypeScript.g:246:1: ( '}' )
            {
            // InternalTypeScript.g:246:1: ( '}' )
            // InternalTypeScript.g:247:2: '}'
            {
             before(grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Compute__Group__3__Impl"


    // $ANTLR start "rule__Compute__Group__4"
    // InternalTypeScript.g:256:1: rule__Compute__Group__4 : rule__Compute__Group__4__Impl rule__Compute__Group__5 ;
    public final void rule__Compute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:260:1: ( rule__Compute__Group__4__Impl rule__Compute__Group__5 )
            // InternalTypeScript.g:261:2: rule__Compute__Group__4__Impl rule__Compute__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Compute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__5();

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
    // $ANTLR end "rule__Compute__Group__4"


    // $ANTLR start "rule__Compute__Group__4__Impl"
    // InternalTypeScript.g:268:1: rule__Compute__Group__4__Impl : ( 'from' ) ;
    public final void rule__Compute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:272:1: ( ( 'from' ) )
            // InternalTypeScript.g:273:1: ( 'from' )
            {
            // InternalTypeScript.g:273:1: ( 'from' )
            // InternalTypeScript.g:274:2: 'from'
            {
             before(grammarAccess.getComputeAccess().getFromKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getFromKeyword_4()); 

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
    // $ANTLR end "rule__Compute__Group__4__Impl"


    // $ANTLR start "rule__Compute__Group__5"
    // InternalTypeScript.g:283:1: rule__Compute__Group__5 : rule__Compute__Group__5__Impl rule__Compute__Group__6 ;
    public final void rule__Compute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:287:1: ( rule__Compute__Group__5__Impl rule__Compute__Group__6 )
            // InternalTypeScript.g:288:2: rule__Compute__Group__5__Impl rule__Compute__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Compute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__6();

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
    // $ANTLR end "rule__Compute__Group__5"


    // $ANTLR start "rule__Compute__Group__5__Impl"
    // InternalTypeScript.g:295:1: rule__Compute__Group__5__Impl : ( ( rule__Compute__NameAssignment_5 ) ) ;
    public final void rule__Compute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:299:1: ( ( ( rule__Compute__NameAssignment_5 ) ) )
            // InternalTypeScript.g:300:1: ( ( rule__Compute__NameAssignment_5 ) )
            {
            // InternalTypeScript.g:300:1: ( ( rule__Compute__NameAssignment_5 ) )
            // InternalTypeScript.g:301:2: ( rule__Compute__NameAssignment_5 )
            {
             before(grammarAccess.getComputeAccess().getNameAssignment_5()); 
            // InternalTypeScript.g:302:2: ( rule__Compute__NameAssignment_5 )
            // InternalTypeScript.g:302:3: rule__Compute__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Compute__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__Compute__Group__5__Impl"


    // $ANTLR start "rule__Compute__Group__6"
    // InternalTypeScript.g:310:1: rule__Compute__Group__6 : rule__Compute__Group__6__Impl ;
    public final void rule__Compute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:314:1: ( rule__Compute__Group__6__Impl )
            // InternalTypeScript.g:315:2: rule__Compute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group__6__Impl();

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
    // $ANTLR end "rule__Compute__Group__6"


    // $ANTLR start "rule__Compute__Group__6__Impl"
    // InternalTypeScript.g:321:1: rule__Compute__Group__6__Impl : ( ';' ) ;
    public final void rule__Compute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:325:1: ( ( ';' ) )
            // InternalTypeScript.g:326:1: ( ';' )
            {
            // InternalTypeScript.g:326:1: ( ';' )
            // InternalTypeScript.g:327:2: ';'
            {
             before(grammarAccess.getComputeAccess().getSemicolonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Compute__Group__6__Impl"


    // $ANTLR start "rule__Compute__Group_2__0"
    // InternalTypeScript.g:337:1: rule__Compute__Group_2__0 : rule__Compute__Group_2__0__Impl rule__Compute__Group_2__1 ;
    public final void rule__Compute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:341:1: ( rule__Compute__Group_2__0__Impl rule__Compute__Group_2__1 )
            // InternalTypeScript.g:342:2: rule__Compute__Group_2__0__Impl rule__Compute__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Compute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group_2__1();

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
    // $ANTLR end "rule__Compute__Group_2__0"


    // $ANTLR start "rule__Compute__Group_2__0__Impl"
    // InternalTypeScript.g:349:1: rule__Compute__Group_2__0__Impl : ( ( rule__Compute__ExpressionAssignment_2_0 ) ) ;
    public final void rule__Compute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:353:1: ( ( ( rule__Compute__ExpressionAssignment_2_0 ) ) )
            // InternalTypeScript.g:354:1: ( ( rule__Compute__ExpressionAssignment_2_0 ) )
            {
            // InternalTypeScript.g:354:1: ( ( rule__Compute__ExpressionAssignment_2_0 ) )
            // InternalTypeScript.g:355:2: ( rule__Compute__ExpressionAssignment_2_0 )
            {
             before(grammarAccess.getComputeAccess().getExpressionAssignment_2_0()); 
            // InternalTypeScript.g:356:2: ( rule__Compute__ExpressionAssignment_2_0 )
            // InternalTypeScript.g:356:3: rule__Compute__ExpressionAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Compute__ExpressionAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getExpressionAssignment_2_0()); 

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
    // $ANTLR end "rule__Compute__Group_2__0__Impl"


    // $ANTLR start "rule__Compute__Group_2__1"
    // InternalTypeScript.g:364:1: rule__Compute__Group_2__1 : rule__Compute__Group_2__1__Impl ;
    public final void rule__Compute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:368:1: ( rule__Compute__Group_2__1__Impl )
            // InternalTypeScript.g:369:2: rule__Compute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group_2__1__Impl();

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
    // $ANTLR end "rule__Compute__Group_2__1"


    // $ANTLR start "rule__Compute__Group_2__1__Impl"
    // InternalTypeScript.g:375:1: rule__Compute__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__Compute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:379:1: ( ( ( ',' )? ) )
            // InternalTypeScript.g:380:1: ( ( ',' )? )
            {
            // InternalTypeScript.g:380:1: ( ( ',' )? )
            // InternalTypeScript.g:381:2: ( ',' )?
            {
             before(grammarAccess.getComputeAccess().getCommaKeyword_2_1()); 
            // InternalTypeScript.g:382:2: ( ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTypeScript.g:382:3: ','
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComputeAccess().getCommaKeyword_2_1()); 

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
    // $ANTLR end "rule__Compute__Group_2__1__Impl"


    // $ANTLR start "rule__Model__ComputeAssignment"
    // InternalTypeScript.g:391:1: rule__Model__ComputeAssignment : ( ruleCompute ) ;
    public final void rule__Model__ComputeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:395:1: ( ( ruleCompute ) )
            // InternalTypeScript.g:396:2: ( ruleCompute )
            {
            // InternalTypeScript.g:396:2: ( ruleCompute )
            // InternalTypeScript.g:397:3: ruleCompute
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


    // $ANTLR start "rule__Compute__ExpressionAssignment_2_0"
    // InternalTypeScript.g:406:1: rule__Compute__ExpressionAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Compute__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:410:1: ( ( ruleExpression ) )
            // InternalTypeScript.g:411:2: ( ruleExpression )
            {
            // InternalTypeScript.g:411:2: ( ruleExpression )
            // InternalTypeScript.g:412:3: ruleExpression
            {
             before(grammarAccess.getComputeAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getComputeAccess().getExpressionExpressionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Compute__ExpressionAssignment_2_0"


    // $ANTLR start "rule__Compute__NameAssignment_5"
    // InternalTypeScript.g:421:1: rule__Compute__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Compute__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypeScript.g:425:1: ( ( RULE_STRING ) )
            // InternalTypeScript.g:426:2: ( RULE_STRING )
            {
            // InternalTypeScript.g:426:2: ( RULE_STRING )
            // InternalTypeScript.g:427:3: RULE_STRING
            {
             before(grammarAccess.getComputeAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Compute__NameAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}