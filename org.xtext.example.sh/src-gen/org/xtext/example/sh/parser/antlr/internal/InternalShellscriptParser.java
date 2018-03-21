package org.xtext.example.sh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sh.services.ShellscriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShellscriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
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

        public InternalShellscriptParser(TokenStream input, ShellscriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ShellscriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalShellscript.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalShellscript.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalShellscript.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalShellscript.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalShellscript.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalShellscript.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalShellscript.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShellscript.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalShellscript.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalShellscript.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.sh.Shellscript.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalShellscript.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalShellscript.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalShellscript.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalShellscript.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalShellscript.g:113:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalShellscript.g:114:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalShellscript.g:114:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalShellscript.g:115:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getDollarSignKeyword_0());
            		
            // InternalShellscript.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShellscript.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShellscript.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalShellscript.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getEqualsSignKeyword_2());
            		
            // InternalShellscript.g:141:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalShellscript.g:142:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalShellscript.g:142:4: (lv_expression_3_0= ruleExpression )
            // InternalShellscript.g:143:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreetingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.example.sh.Shellscript.Expression");
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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleExpression"
    // InternalShellscript.g:164:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalShellscript.g:164:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalShellscript.g:165:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalShellscript.g:171:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (kw= '$' this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalShellscript.g:177:2: ( (this_INT_0= RULE_INT | (kw= '$' this_ID_2= RULE_ID ) ) )
            // InternalShellscript.g:178:2: (this_INT_0= RULE_INT | (kw= '$' this_ID_2= RULE_ID ) )
            {
            // InternalShellscript.g:178:2: (this_INT_0= RULE_INT | (kw= '$' this_ID_2= RULE_ID ) )
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
                    // InternalShellscript.g:179:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShellscript.g:187:3: (kw= '$' this_ID_2= RULE_ID )
                    {
                    // InternalShellscript.g:187:3: (kw= '$' this_ID_2= RULE_ID )
                    // InternalShellscript.g:188:4: kw= '$' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,11,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getDollarSignKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000820L});

}