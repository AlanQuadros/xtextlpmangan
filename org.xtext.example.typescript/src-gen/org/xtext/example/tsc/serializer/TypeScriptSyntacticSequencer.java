/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.tsc.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.tsc.services.TypeScriptGrammarAccess;

@SuppressWarnings("all")
public class TypeScriptSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TypeScriptGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Compute_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_Compute___LeftCurlyBracketKeyword_1_0_0_0_0_RightCurlyBracketKeyword_1_0_0_0_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TypeScriptGrammarAccess) access;
		match_Compute_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getComputeAccess().getSemicolonKeyword_2());
		match_Compute___LeftCurlyBracketKeyword_1_0_0_0_0_RightCurlyBracketKeyword_1_0_0_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComputeAccess().getLeftCurlyBracketKeyword_1_0_0_0_0()), new TokenAlias(false, false, grammarAccess.getComputeAccess().getRightCurlyBracketKeyword_1_0_0_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Compute_SemicolonKeyword_2_q.equals(syntax))
				emit_Compute_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Compute___LeftCurlyBracketKeyword_1_0_0_0_0_RightCurlyBracketKeyword_1_0_0_0_2__q.equals(syntax))
				emit_Compute___LeftCurlyBracketKeyword_1_0_0_0_0_RightCurlyBracketKeyword_1_0_0_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=TEXTOS (ambiguity) (rule end)
	 */
	protected void emit_Compute_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'import' (ambiguity) 'from' name=TEXTOS
	 */
	protected void emit_Compute___LeftCurlyBracketKeyword_1_0_0_0_0_RightCurlyBracketKeyword_1_0_0_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
