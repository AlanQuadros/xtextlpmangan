/*
 * generated by Xtext 2.13.0
 */
grammar InternalTypeScript;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.tsc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getComputeComputeParserRuleCall_0());
			}
			lv_compute_0_0=ruleCompute
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"compute",
					lv_compute_0_0,
					"org.xtext.example.tsc.TypeScript.Compute");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCompute
entryRuleCompute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComputeRule()); }
	iv_ruleCompute=ruleCompute
	{ $current=$iv_ruleCompute.current; }
	EOF;

// Rule Compute
ruleCompute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getImportKeyword_0());
		}
		(
			(
				(
					(
						otherlv_1='{'
						{
							newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1_0_0_0_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_0_1_0());
								}
								lv_expression_2_0=ruleClasses
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getComputeRule());
									}
									set(
										$current,
										"expression",
										lv_expression_2_0,
										"org.xtext.example.tsc.TypeScript.Classes");
									afterParserOrEnumRuleCall();
								}
							)
						)+
						otherlv_3='}'
						{
							newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_1_0_0_0_2());
						}
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getComputeAccess().getExpressionClassesParserRuleCall_1_0_0_1_0());
							}
							lv_expression_4_0=ruleClasses
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getComputeRule());
								}
								set(
									$current,
									"expression",
									lv_expression_4_0,
									"org.xtext.example.tsc.TypeScript.Classes");
								afterParserOrEnumRuleCall();
							}
						)
					)+
				)
				otherlv_5='from'
				{
					newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getFromKeyword_1_0_1());
				}
				(
					(
						lv_name_6_0=RULE_TEXTOS
						{
							newLeafNode(lv_name_6_0, grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_0_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComputeRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_6_0,
								"org.xtext.example.tsc.TypeScript.TEXTOS");
						}
					)
				)
			)
			    |
			(
				(
					lv_name_7_0=RULE_TEXTOS
					{
						newLeafNode(lv_name_7_0, grammarAccess.getComputeAccess().getNameTEXTOSTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComputeRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_7_0,
							"org.xtext.example.tsc.TypeScript.TEXTOS");
					}
				)
			)
		)
		(
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getComputeAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleClasses
entryRuleClasses returns [String current=null]:
	{ newCompositeNode(grammarAccess.getClassesRule()); }
	iv_ruleClasses=ruleClasses
	{ $current=$iv_ruleClasses.current.getText(); }
	EOF;

// Rule Classes
ruleClasses returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getClassesAccess().getExpressionParserRuleCall_0());
		}
		this_Expression_0=ruleExpression
		{
			$current.merge(this_Expression_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getClassesAccess().getCommaKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current.getText(); }
	EOF;

// Rule Expression
ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
		}
		    |
		kw='as'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsKeyword_2());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpressionAccess().getAsteriskKeyword_3());
		}
		    |
		kw='$'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpressionAccess().getDollarSignKeyword_4());
		}
	)
;

RULE_TEXTOS : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
