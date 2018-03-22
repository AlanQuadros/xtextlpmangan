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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.tsc.services.TypeScriptGrammarAccess;

@SuppressWarnings("all")
public class TypeScriptSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TypeScriptGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Compute_CommaKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TypeScriptGrammarAccess) access;
		match_Compute_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getComputeAccess().getCommaKeyword_2_1());
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
			if (match_Compute_CommaKeyword_2_1_q.equals(syntax))
				emit_Compute_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression (ambiguity) '}' 'from' name=STRING
	 *     expression=Expression (ambiguity) expression=Expression
	 */
	protected void emit_Compute_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}