/*
 * generated by Xtext 2.25.0
 */
package game.of.life.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import game.of.life.ide.contentassist.antlr.internal.InternalLifeDslParser;
import game.of.life.services.LifeDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LifeDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LifeDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LifeDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperatorUnitAccess().getAlternatives(), "rule__OperatorUnit__Alternatives");
			builder.put(grammarAccess.getDieAliveUnitAccess().getAlternatives(), "rule__DieAliveUnit__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getGridAccess().getGroup(), "rule__Grid__Group__0");
			builder.put(grammarAccess.getEvolutionRulesAccess().getGroup(), "rule__EvolutionRules__Group__0");
			builder.put(grammarAccess.getModelAccess().getGridsAssignment_1(), "rule__Model__GridsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getRulesAssignment_3(), "rule__Model__RulesAssignment_3");
			builder.put(grammarAccess.getGridAccess().getRowAssignment_1(), "rule__Grid__RowAssignment_1");
			builder.put(grammarAccess.getGridAccess().getColumnAssignment_3(), "rule__Grid__ColumnAssignment_3");
			builder.put(grammarAccess.getEvolutionRulesAccess().getNameAssignment_1(), "rule__EvolutionRules__NameAssignment_1");
			builder.put(grammarAccess.getEvolutionRulesAccess().getOperatorAssignment_3(), "rule__EvolutionRules__OperatorAssignment_3");
			builder.put(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsAssignment_5(), "rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LifeDslGrammarAccess grammarAccess;

	@Override
	protected InternalLifeDslParser createParser() {
		InternalLifeDslParser result = new InternalLifeDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LifeDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LifeDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
