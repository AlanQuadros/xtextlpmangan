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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXTOS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'{'", "'}'", "'from'", "';'", "','", "'as'", "'*'", "'$'"
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
    // InternalTypeScript.g:107:1: ruleCompute returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:113:2: ( (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) ) (otherlv_8= ';' )? ) )
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) ) (otherlv_8= ';' )? )
            {
            // InternalTypeScript.g:114:2: (otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) ) (otherlv_8= ';' )? )
            // InternalTypeScript.g:115:3: otherlv_0= 'import' ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getImportKeyword_0());
            		
            // InternalTypeScript.g:119:3: ( ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) ) | ( (lv_name_7_0= RULE_TEXTOS ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||LA4_0==13||LA4_0==15||(LA4_0>=18 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_TEXTOS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTypeScript.g:120:4: ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) )
                    {
                    // InternalTypeScript.g:120:4: ( ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) ) )
                    // InternalTypeScript.g:121:5: ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* ) otherlv_5= 'from' ( (lv_name_6_0= RULE_TEXTOS ) )
                    {
                    // InternalTypeScript.g:121:5: ( (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' ) | ( (lv_expression_4_0= ruleClasses ) )* )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==13) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||LA3_0==15||(LA3_0>=18 && LA3_0<=20)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTypeScript.g:122:6: (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' )
                            {
                            // InternalTypeScript.g:122:6: (otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}' )
                            // InternalTypeScript.g:123:7: otherlv_1= '{' ( (lv_expression_2_0= ruleClasses ) )* otherlv_3= '}'
                            {
                            otherlv_1=(Token)match(input,13,FOLLOW_4); 

                            							newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1_0_0_0_0());
                            						
                            // InternalTypeScript.g:127:7: ( (lv_expression_2_0= ruleClasses ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||(LA1_0>=18 && LA1_0<=20)) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalTypeScript.g:128:8: (lv_expression_2_0= ruleClasses )
                            	    {
                            	    // InternalTypeScript.g:128:8: (lv_expression_2_0= ruleClasses )
                            	    // InternalTypeScript.g:129:9: lv_expression_2_0= ruleClasses
                            	    {

                            	    									newCompositeNode(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_0_1_0());
                            	    								
                            	    pushFollow(FOLLOW_4);
                            	    lv_expression_2_0=ruleClasses();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getComputeRule());
                            	    									}
                            	    									set(
                            	    										current,
                            	    										"expression",
                            	    										lv_expression_2_0,
                            	    										"org.xtext.example.tsc.TypeScript.Classes");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);

                            otherlv_3=(Token)match(input,14,FOLLOW_5); 

                            							newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_1_0_0_0_2());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalTypeScript.g:152:6: ( (lv_expression_4_0= ruleClasses ) )*
                            {
                            // InternalTypeScript.g:152:6: ( (lv_expression_4_0= ruleClasses ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||(LA2_0>=18 && LA2_0<=20)) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalTypeScript.g:153:7: (lv_expression_4_0= ruleClasses )
                            	    {
                            	    // InternalTypeScript.g:153:7: (lv_expression_4_0= ruleClasses )
                            	    // InternalTypeScript.g:154:8: lv_expression_4_0= ruleClasses
                            	    {

                            	    								newCompositeNode(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_expression_4_0=ruleClasses();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getComputeRule());
                            	    								}
                            	    								set(
                            	    									current,
                            	    									"expression",
                            	    									lv_expression_4_0,
                            	    									"org.xtext.example.tsc.TypeScript.Classes");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getFromKeyword_1_0_1());
                    				
                    // InternalTypeScript.g:176:5: ( (lv_name_6_0= RULE_TEXTOS ) )
                    // InternalTypeScript.g:177:6: (lv_name_6_0= RULE_TEXTOS )
                    {
                    // InternalTypeScript.g:177:6: (lv_name_6_0= RULE_TEXTOS )
                    // InternalTypeScript.g:178:7: lv_name_6_0= RULE_TEXTOS
                    {
                    lv_name_6_0=(Token)match(input,RULE_TEXTOS,FOLLOW_8); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComputeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"org.xtext.example.tsc.TypeScript.TEXTOS");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:196:4: ( (lv_name_7_0= RULE_TEXTOS ) )
                    {
                    // InternalTypeScript.g:196:4: ( (lv_name_7_0= RULE_TEXTOS ) )
                    // InternalTypeScript.g:197:5: (lv_name_7_0= RULE_TEXTOS )
                    {
                    // InternalTypeScript.g:197:5: (lv_name_7_0= RULE_TEXTOS )
                    // InternalTypeScript.g:198:6: lv_name_7_0= RULE_TEXTOS
                    {
                    lv_name_7_0=(Token)match(input,RULE_TEXTOS,FOLLOW_8); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComputeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.xtext.example.tsc.TypeScript.TEXTOS");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTypeScript.g:215:3: (otherlv_8= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTypeScript.g:216:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getComputeAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleClasses"
    // InternalTypeScript.g:225:1: entryRuleClasses returns [String current=null] : iv_ruleClasses= ruleClasses EOF ;
    public final String entryRuleClasses() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClasses = null;


        try {
            // InternalTypeScript.g:225:47: (iv_ruleClasses= ruleClasses EOF )
            // InternalTypeScript.g:226:2: iv_ruleClasses= ruleClasses EOF
            {
             newCompositeNode(grammarAccess.getClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasses=ruleClasses();

            state._fsp--;

             current =iv_ruleClasses.getText(); 
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
    // $ANTLR end "entryRuleClasses"


    // $ANTLR start "ruleClasses"
    // InternalTypeScript.g:232:1: ruleClasses returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleClasses() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalTypeScript.g:238:2: ( (this_Expression_0= ruleExpression (kw= ',' )? ) )
            // InternalTypeScript.g:239:2: (this_Expression_0= ruleExpression (kw= ',' )? )
            {
            // InternalTypeScript.g:239:2: (this_Expression_0= ruleExpression (kw= ',' )? )
            // InternalTypeScript.g:240:3: this_Expression_0= ruleExpression (kw= ',' )?
            {

            			newCompositeNode(grammarAccess.getClassesAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression_0=ruleExpression();

            state._fsp--;


            			current.merge(this_Expression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalTypeScript.g:250:3: (kw= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTypeScript.g:251:4: kw= ','
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassesAccess().getCommaKeyword_1());
                    			

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
    // $ANTLR end "ruleClasses"


    // $ANTLR start "entryRuleExpression"
    // InternalTypeScript.g:261:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalTypeScript.g:261:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalTypeScript.g:262:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTypeScript.g:268:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTypeScript.g:274:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' ) )
            // InternalTypeScript.g:275:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' )
            {
            // InternalTypeScript.g:275:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | kw= 'as' | kw= '*' | kw= '$' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTypeScript.g:276:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTypeScript.g:284:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTypeScript.g:292:3: kw= 'as'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTypeScript.g:298:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTypeScript.g:304:3: kw= '$'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001CA070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001C4060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C8060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});

}