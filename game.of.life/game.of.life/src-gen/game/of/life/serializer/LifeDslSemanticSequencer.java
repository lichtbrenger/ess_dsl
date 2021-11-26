/*
 * generated by Xtext 2.25.0
 */
package game.of.life.serializer;

import com.google.inject.Inject;
import game.of.life.lifeDsl.EvolutionRules;
import game.of.life.lifeDsl.InitialGrid;
import game.of.life.lifeDsl.LifeDslPackage;
import game.of.life.lifeDsl.Model;
import game.of.life.services.LifeDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LifeDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LifeDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LifeDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LifeDslPackage.EVOLUTION_RULES:
				sequence_EvolutionRules(context, (EvolutionRules) semanticObject); 
				return; 
			case LifeDslPackage.INITIAL_GRID:
				sequence_InitialGrid(context, (InitialGrid) semanticObject); 
				return; 
			case LifeDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EvolutionRules returns EvolutionRules
	 *
	 * Constraint:
	 *     (name=DieAliveUnit operator=Operator numberOfLiveNeighbors=INT)
	 */
	protected void sequence_EvolutionRules(ISerializationContext context, EvolutionRules semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__NAME));
			if (transientValues.isValueTransient(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__NUMBER_OF_LIVE_NEIGHBORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LifeDslPackage.Literals.EVOLUTION_RULES__NUMBER_OF_LIVE_NEIGHBORS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvolutionRulesAccess().getNameDieAliveUnitEnumRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvolutionRulesAccess().getOperatorOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsINTTerminalRuleCall_5_0(), semanticObject.getNumberOfLiveNeighbors());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InitialGrid returns InitialGrid
	 *
	 * Constraint:
	 *     (cellsX=STRING cellsY=STRING)
	 */
	protected void sequence_InitialGrid(ISerializationContext context, InitialGrid semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LifeDslPackage.Literals.INITIAL_GRID__CELLS_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LifeDslPackage.Literals.INITIAL_GRID__CELLS_X));
			if (transientValues.isValueTransient(semanticObject, LifeDslPackage.Literals.INITIAL_GRID__CELLS_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LifeDslPackage.Literals.INITIAL_GRID__CELLS_Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialGridAccess().getCellsXSTRINGTerminalRuleCall_1_0(), semanticObject.getCellsX());
		feeder.accept(grammarAccess.getInitialGridAccess().getCellsYSTRINGTerminalRuleCall_3_0(), semanticObject.getCellsY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (grid=InitialGrid rules+=EvolutionRules*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
