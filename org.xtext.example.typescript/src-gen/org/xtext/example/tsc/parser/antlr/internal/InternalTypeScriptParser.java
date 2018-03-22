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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXTOS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'{'", "','", "'}'", "'from'", "';'", "'as'", "'*'", "'$'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_TEXTOS=4;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
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
    // InternalTypeScript.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalTypeScript.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalTypeScript.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTypeScript.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalTypeScript.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalTypeScript.g:80:4: lv_greetings_0_0= ruleGreeting
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
            	    					"org.xtext.example.tsc.TypeScript.Greeting");
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
    // InternalTypeScript.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalTypeScript.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalTypeScript.g:101:2: iv_ruleGreeting= ruleGreeting EOF
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
    // InternalTypeScript.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) ) (otherlv_10= ';' )? ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:113:2: ( (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) ) (otherlv_10= ';' )? ) )
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) ) (otherlv_10= ';' )? )
            {
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) ) (otherlv_10= ';' )? )
            // InternalTypeScript.g:115:3: otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) ) (otherlv_10= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getImportKeyword_0());
            		
            // InternalTypeScript.g:119:3: ( ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) ) | ( (lv_name_9_0= RULE_TEXTOS ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||LA7_0==13||LA7_0==16||(LA7_0>=18 && LA7_0<=20)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_TEXTOS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTypeScript.g:120:4: ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) )
                    {
                    // InternalTypeScript.g:120:4: ( ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) ) )
                    // InternalTypeScript.g:121:5: ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* ) otherlv_7= 'from' ( (lv_name_8_0= RULE_TEXTOS ) )
                    {
                    // InternalTypeScript.g:121:5: ( (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) | ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )* )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||LA6_0==16||(LA6_0>=18 && LA6_0<=20)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTypeScript.g:122:6: (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' )
                            {
                            // InternalTypeScript.g:122:6: (otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}' )
                            // InternalTypeScript.g:123:7: otherlv_1= '{' ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )* otherlv_4= '}'
                            {
                            otherlv_1=(Token)match(input,13,FOLLOW_5); 

                            							newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_1_0_0_0_0());
                            						
                            // InternalTypeScript.g:127:7: ( ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||(LA3_0>=18 && LA3_0<=20)) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalTypeScript.g:128:8: ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' )?
                            	    {
                            	    // InternalTypeScript.g:128:8: ( (lv_expression_2_0= ruleExpression ) )
                            	    // InternalTypeScript.g:129:9: (lv_expression_2_0= ruleExpression )
                            	    {
                            	    // InternalTypeScript.g:129:9: (lv_expression_2_0= ruleExpression )
                            	    // InternalTypeScript.g:130:10: lv_expression_2_0= ruleExpression
                            	    {

                            	    										newCompositeNode(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_0_1_0_0());
                            	    									
                            	    pushFollow(FOLLOW_6);
                            	    lv_expression_2_0=ruleExpression();

                            	    state._fsp--;


                            	    										if (current==null) {
                            	    											current = createModelElementForParent(grammarAccess.getGreetingRule());
                            	    										}
                            	    										set(
                            	    											current,
                            	    											"expression",
                            	    											lv_expression_2_0,
                            	    											"org.xtext.example.tsc.TypeScript.Expression");
                            	    										afterParserOrEnumRuleCall();
                            	    									

                            	    }


                            	    }

                            	    // InternalTypeScript.g:147:8: (otherlv_3= ',' )?
                            	    int alt2=2;
                            	    int LA2_0 = input.LA(1);

                            	    if ( (LA2_0==14) ) {
                            	        alt2=1;
                            	    }
                            	    switch (alt2) {
                            	        case 1 :
                            	            // InternalTypeScript.g:148:9: otherlv_3= ','
                            	            {
                            	            otherlv_3=(Token)match(input,14,FOLLOW_5); 

                            	            									newLeafNode(otherlv_3, grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_0_1_1());
                            	            								

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);

                            otherlv_4=(Token)match(input,15,FOLLOW_7); 

                            							newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_1_0_0_0_2());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalTypeScript.g:160:6: ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )*
                            {
                            // InternalTypeScript.g:160:6: ( ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )? )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_ID)||(LA5_0>=18 && LA5_0<=20)) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalTypeScript.g:161:7: ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= ',' )?
                            	    {
                            	    // InternalTypeScript.g:161:7: ( (lv_expression_5_0= ruleExpression ) )
                            	    // InternalTypeScript.g:162:8: (lv_expression_5_0= ruleExpression )
                            	    {
                            	    // InternalTypeScript.g:162:8: (lv_expression_5_0= ruleExpression )
                            	    // InternalTypeScript.g:163:9: lv_expression_5_0= ruleExpression
                            	    {

                            	    									newCompositeNode(grammarAccess.getGreetingAccess().getExpressionExpressionParserRuleCall_1_0_0_1_0_0());
                            	    								
                            	    pushFollow(FOLLOW_8);
                            	    lv_expression_5_0=ruleExpression();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getGreetingRule());
                            	    									}
                            	    									set(
                            	    										current,
                            	    										"expression",
                            	    										lv_expression_5_0,
                            	    										"org.xtext.example.tsc.TypeScript.Expression");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }

                            	    // InternalTypeScript.g:180:7: (otherlv_6= ',' )?
                            	    int alt4=2;
                            	    int LA4_0 = input.LA(1);

                            	    if ( (LA4_0==14) ) {
                            	        alt4=1;
                            	    }
                            	    switch (alt4) {
                            	        case 1 :
                            	            // InternalTypeScript.g:181:8: otherlv_6= ','
                            	            {
                            	            otherlv_6=(Token)match(input,14,FOLLOW_9); 

                            	            								newLeafNode(otherlv_6, grammarAccess.getGreetingAccess().getCommaKeyword_1_0_0_1_1());
                            	            							

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getGreetingAccess().getFromKeyword_1_0_1());
                    				
                    // InternalTypeScript.g:192:5: ( (lv_name_8_0= RULE_TEXTOS ) )
                    // InternalTypeScript.g:193:6: (lv_name_8_0= RULE_TEXTOS )
                    {
                    // InternalTypeScript.g:193:6: (lv_name_8_0= RULE_TEXTOS )
                    // InternalTypeScript.g:194:7: lv_name_8_0= RULE_TEXTOS
                    {
                    lv_name_8_0=(Token)match(input,RULE_TEXTOS,FOLLOW_11); 

                    							newLeafNode(lv_name_8_0, grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGreetingRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_8_0,
                    								"org.xtext.example.tsc.TypeScript.TEXTOS");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:212:4: ( (lv_name_9_0= RULE_TEXTOS ) )
                    {
                    // InternalTypeScript.g:212:4: ( (lv_name_9_0= RULE_TEXTOS ) )
                    // InternalTypeScript.g:213:5: (lv_name_9_0= RULE_TEXTOS )
                    {
                    // InternalTypeScript.g:213:5: (lv_name_9_0= RULE_TEXTOS )
                    // InternalTypeScript.g:214:6: lv_name_9_0= RULE_TEXTOS
                    {
                    lv_name_9_0=(Token)match(input,RULE_TEXTOS,FOLLOW_11); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getGreetingAccess().getNameTEXTOSTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGreetingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.xtext.example.tsc.TypeScript.TEXTOS");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTypeScript.g:231:3: (otherlv_10= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTypeScript.g:232:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getGreetingAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleExpression"
    // InternalTypeScript.g:241:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalTypeScript.g:241:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalTypeScript.g:242:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTypeScript.g:248:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTypeScript.g:254:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' ) )
            // InternalTypeScript.g:255:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' )
            {
            // InternalTypeScript.g:255:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTypeScript.g:256:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:264:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTypeScript.g:272:3: kw= 'as'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTypeScript.g:278:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTypeScript.g:284:3: kw= '$'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getDollarSignKeyword_4());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001D2070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001C8060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001CC060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001D4060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001D0060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}