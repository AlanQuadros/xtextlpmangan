package org.xtext.example.tsc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.tsc.services.TypeScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypeScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'{'", "','", "'}'", "'from'", "';'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
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

        public InternalTypeScriptParser(TokenStream input, TypeScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TypeScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTypeScript.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTypeScript.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTypeScript.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalTypeScript.g:71:1: ruleModel returns [EObject current=null] : ( (lv_compute_0_0= ruleCompute ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_compute_0_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:77:2: ( ( (lv_compute_0_0= ruleCompute ) ) )
            // InternalTypeScript.g:78:2: ( (lv_compute_0_0= ruleCompute ) )
            {
            // InternalTypeScript.g:78:2: ( (lv_compute_0_0= ruleCompute ) )
            // InternalTypeScript.g:79:3: (lv_compute_0_0= ruleCompute )
            {
            // InternalTypeScript.g:79:3: (lv_compute_0_0= ruleCompute )
            // InternalTypeScript.g:80:4: lv_compute_0_0= ruleCompute
            {

            				newCompositeNode(grammarAccess.getModelAccess().getComputeComputeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_compute_0_0=ruleCompute();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"compute",
            					lv_compute_0_0,
            					"org.xtext.example.tsc.TypeScript.Compute");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompute"
    // InternalTypeScript.g:100:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalTypeScript.g:100:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalTypeScript.g:101:2: iv_ruleCompute= ruleCompute EOF
            {
             newCompositeNode(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompute=ruleCompute();

            state._fsp--;

             current =iv_ruleCompute; 
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
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalTypeScript.g:107:1: ruleCompute returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' otherlv_5= 'from' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ';' ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:113:2: ( (otherlv_0= 'import' otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' otherlv_5= 'from' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' otherlv_5= 'from' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ';' )
            {
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' otherlv_5= 'from' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ';' )
            // InternalTypeScript.g:115:3: otherlv_0= 'import' otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' otherlv_5= 'from' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTypeScript.g:123:3: ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTypeScript.g:124:4: ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )?
            	    {
            	    // InternalTypeScript.g:124:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalTypeScript.g:125:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalTypeScript.g:125:5: (lv_expression_2_0= ruleExpression )
            	    // InternalTypeScript.g:126:6: lv_expression_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComputeAccess().getExpressionExpressionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComputeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression",
            	    							lv_expression_2_0,
            	    							"org.xtext.example.tsc.TypeScript.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTypeScript.g:143:4: (otherlv_3= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalTypeScript.g:144:5: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getCommaKeyword_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getFromKeyword_4());
            		
            // InternalTypeScript.g:158:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalTypeScript.g:159:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalTypeScript.g:159:4: (lv_name_6_0= RULE_STRING )
            // InternalTypeScript.g:160:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_6_0, grammarAccess.getComputeAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.tsc.TypeScript.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComputeAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleExpression"
    // InternalTypeScript.g:184:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalTypeScript.g:184:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalTypeScript.g:185:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTypeScript.g:191:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTypeScript.g:197:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalTypeScript.g:198:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalTypeScript.g:198:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTypeScript.g:199:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:207:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}