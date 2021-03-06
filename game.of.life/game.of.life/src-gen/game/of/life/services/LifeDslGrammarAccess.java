/*
 * generated by Xtext 2.25.0
 */
package game.of.life.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LifeDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitialGridKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cGridsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGridsGridParserRuleCall_1_0 = (RuleCall)cGridsAssignment_1.eContents().get(0);
		private final Keyword cEvolutionRulesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRulesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRulesEvolutionRulesParserRuleCall_3_0 = (RuleCall)cRulesAssignment_3.eContents().get(0);
		
		//Model:
		//    'InitialGrid' (grids += Grid)*
		//    'EvolutionRules' (rules += EvolutionRules)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'InitialGrid' (grids += Grid)*
		//'EvolutionRules' (rules += EvolutionRules)*
		public Group getGroup() { return cGroup; }
		
		//'InitialGrid'
		public Keyword getInitialGridKeyword_0() { return cInitialGridKeyword_0; }
		
		//(grids += Grid)*
		public Assignment getGridsAssignment_1() { return cGridsAssignment_1; }
		
		//Grid
		public RuleCall getGridsGridParserRuleCall_1_0() { return cGridsGridParserRuleCall_1_0; }
		
		//'EvolutionRules'
		public Keyword getEvolutionRulesKeyword_2() { return cEvolutionRulesKeyword_2; }
		
		//(rules += EvolutionRules)*
		public Assignment getRulesAssignment_3() { return cRulesAssignment_3; }
		
		//EvolutionRules
		public RuleCall getRulesEvolutionRulesParserRuleCall_3_0() { return cRulesEvolutionRulesParserRuleCall_3_0; }
	}
	public class GridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.Grid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRowAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRowINTTerminalRuleCall_1_0 = (RuleCall)cRowAssignment_1.eContents().get(0);
		private final Keyword cColumnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColumnAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnINTTerminalRuleCall_3_0 = (RuleCall)cColumnAssignment_3.eContents().get(0);
		
		//Grid:
		//    'Row:' row = INT
		//    'Column:' column = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Row:' row = INT
		//'Column:' column = INT
		public Group getGroup() { return cGroup; }
		
		//'Row:'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//row = INT
		public Assignment getRowAssignment_1() { return cRowAssignment_1; }
		
		//INT
		public RuleCall getRowINTTerminalRuleCall_1_0() { return cRowINTTerminalRuleCall_1_0; }
		
		//'Column:'
		public Keyword getColumnKeyword_2() { return cColumnKeyword_2; }
		
		//column = INT
		public Assignment getColumnAssignment_3() { return cColumnAssignment_3; }
		
		//INT
		public RuleCall getColumnINTTerminalRuleCall_3_0() { return cColumnINTTerminalRuleCall_3_0; }
	}
	public class EvolutionRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.EvolutionRules");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameDieAliveUnitEnumRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cComparisonOperatorKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOperatorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOperatorOperatorUnitEnumRuleCall_3_0 = (RuleCall)cOperatorAssignment_3.eContents().get(0);
		private final Keyword cNumberOfLiveNeighborsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNumberOfLiveNeighborsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNumberOfLiveNeighborsINTTerminalRuleCall_5_0 = (RuleCall)cNumberOfLiveNeighborsAssignment_5.eContents().get(0);
		
		//EvolutionRules:
		//    'Rule:' name = DieAliveUnit
		//    'ComparisonOperator:' operator = OperatorUnit
		//    'NumberOfLiveNeighbors:' numberOfLiveNeighbors = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Rule:' name = DieAliveUnit
		//'ComparisonOperator:' operator = OperatorUnit
		//'NumberOfLiveNeighbors:' numberOfLiveNeighbors = INT
		public Group getGroup() { return cGroup; }
		
		//'Rule:'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//name = DieAliveUnit
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//DieAliveUnit
		public RuleCall getNameDieAliveUnitEnumRuleCall_1_0() { return cNameDieAliveUnitEnumRuleCall_1_0; }
		
		//'ComparisonOperator:'
		public Keyword getComparisonOperatorKeyword_2() { return cComparisonOperatorKeyword_2; }
		
		//operator = OperatorUnit
		public Assignment getOperatorAssignment_3() { return cOperatorAssignment_3; }
		
		//OperatorUnit
		public RuleCall getOperatorOperatorUnitEnumRuleCall_3_0() { return cOperatorOperatorUnitEnumRuleCall_3_0; }
		
		//'NumberOfLiveNeighbors:'
		public Keyword getNumberOfLiveNeighborsKeyword_4() { return cNumberOfLiveNeighborsKeyword_4; }
		
		//numberOfLiveNeighbors = INT
		public Assignment getNumberOfLiveNeighborsAssignment_5() { return cNumberOfLiveNeighborsAssignment_5; }
		
		//INT
		public RuleCall getNumberOfLiveNeighborsINTTerminalRuleCall_5_0() { return cNumberOfLiveNeighborsINTTerminalRuleCall_5_0; }
	}
	
	public class OperatorUnitElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.OperatorUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQEqualsSignEqualsSignKeyword_0_0 = (Keyword)cEQEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLLessThanSignKeyword_1_0 = (Keyword)cLEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGGreaterThanSignKeyword_2_0 = (Keyword)cGEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum OperatorUnit:
		//    EQ = '==' |
		//    L = '<' |
		//    G = '>'
		//;
		public EnumRule getRule() { return rule; }
		
		//EQ = '==' |
		//L = '<' |
		//G = '>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQ = '=='
		public EnumLiteralDeclaration getEQEnumLiteralDeclaration_0() { return cEQEnumLiteralDeclaration_0; }
		
		//'=='
		public Keyword getEQEqualsSignEqualsSignKeyword_0_0() { return cEQEqualsSignEqualsSignKeyword_0_0; }
		
		//L = '<'
		public EnumLiteralDeclaration getLEnumLiteralDeclaration_1() { return cLEnumLiteralDeclaration_1; }
		
		//'<'
		public Keyword getLLessThanSignKeyword_1_0() { return cLLessThanSignKeyword_1_0; }
		
		//G = '>'
		public EnumLiteralDeclaration getGEnumLiteralDeclaration_2() { return cGEnumLiteralDeclaration_2; }
		
		//'>'
		public Keyword getGGreaterThanSignKeyword_2_0() { return cGGreaterThanSignKeyword_2_0; }
	}
	public class DieAliveUnitElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.DieAliveUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDIEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDIEDieKeyword_0_0 = (Keyword)cDIEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLIVEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLIVELiveKeyword_1_0 = (Keyword)cLIVEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBECOME_ALIVEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBECOME_ALIVEBecomeAliveKeyword_2_0 = (Keyword)cBECOME_ALIVEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum DieAliveUnit:
		// DIE = 'die' |
		// LIVE = 'live' |
		// BECOME_ALIVE = 'become alive'
		//;
		public EnumRule getRule() { return rule; }
		
		//DIE = 'die' |
		//LIVE = 'live' |
		//BECOME_ALIVE = 'become alive'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DIE = 'die'
		public EnumLiteralDeclaration getDIEEnumLiteralDeclaration_0() { return cDIEEnumLiteralDeclaration_0; }
		
		//'die'
		public Keyword getDIEDieKeyword_0_0() { return cDIEDieKeyword_0_0; }
		
		//LIVE = 'live'
		public EnumLiteralDeclaration getLIVEEnumLiteralDeclaration_1() { return cLIVEEnumLiteralDeclaration_1; }
		
		//'live'
		public Keyword getLIVELiveKeyword_1_0() { return cLIVELiveKeyword_1_0; }
		
		//BECOME_ALIVE = 'become alive'
		public EnumLiteralDeclaration getBECOME_ALIVEEnumLiteralDeclaration_2() { return cBECOME_ALIVEEnumLiteralDeclaration_2; }
		
		//'become alive'
		public Keyword getBECOME_ALIVEBecomeAliveKeyword_2_0() { return cBECOME_ALIVEBecomeAliveKeyword_2_0; }
	}
	
	private final ModelElements pModel;
	private final GridElements pGrid;
	private final EvolutionRulesElements pEvolutionRules;
	private final OperatorUnitElements eOperatorUnit;
	private final DieAliveUnitElements eDieAliveUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LifeDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGrid = new GridElements();
		this.pEvolutionRules = new EvolutionRulesElements();
		this.eOperatorUnit = new OperatorUnitElements();
		this.eDieAliveUnit = new DieAliveUnitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("game.of.life.LifeDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    'InitialGrid' (grids += Grid)*
	//    'EvolutionRules' (rules += EvolutionRules)*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Grid:
	//    'Row:' row = INT
	//    'Column:' column = INT
	//;
	public GridElements getGridAccess() {
		return pGrid;
	}
	
	public ParserRule getGridRule() {
		return getGridAccess().getRule();
	}
	
	//EvolutionRules:
	//    'Rule:' name = DieAliveUnit
	//    'ComparisonOperator:' operator = OperatorUnit
	//    'NumberOfLiveNeighbors:' numberOfLiveNeighbors = INT
	//;
	public EvolutionRulesElements getEvolutionRulesAccess() {
		return pEvolutionRules;
	}
	
	public ParserRule getEvolutionRulesRule() {
		return getEvolutionRulesAccess().getRule();
	}
	
	//enum OperatorUnit:
	//    EQ = '==' |
	//    L = '<' |
	//    G = '>'
	//;
	public OperatorUnitElements getOperatorUnitAccess() {
		return eOperatorUnit;
	}
	
	public EnumRule getOperatorUnitRule() {
		return getOperatorUnitAccess().getRule();
	}
	
	//enum DieAliveUnit:
	// DIE = 'die' |
	// LIVE = 'live' |
	// BECOME_ALIVE = 'become alive'
	//;
	public DieAliveUnitElements getDieAliveUnitAccess() {
		return eDieAliveUnit;
	}
	
	public EnumRule getDieAliveUnitRule() {
		return getDieAliveUnitAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
