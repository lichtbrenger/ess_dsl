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
		private final Assignment cGridAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGridInitialGridParserRuleCall_1_0 = (RuleCall)cGridAssignment_1.eContents().get(0);
		private final Keyword cEvolutionRulesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRulesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRulesEvolutionRulesParserRuleCall_3_0 = (RuleCall)cRulesAssignment_3.eContents().get(0);
		
		//Model:
		//    'InitialGrid' grid = InitialGrid
		//    'EvolutionRules' (rules += EvolutionRules)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'InitialGrid' grid = InitialGrid
		//'EvolutionRules' (rules += EvolutionRules)*
		public Group getGroup() { return cGroup; }
		
		//'InitialGrid'
		public Keyword getInitialGridKeyword_0() { return cInitialGridKeyword_0; }
		
		//grid = InitialGrid
		public Assignment getGridAssignment_1() { return cGridAssignment_1; }
		
		//InitialGrid
		public RuleCall getGridInitialGridParserRuleCall_1_0() { return cGridInitialGridParserRuleCall_1_0; }
		
		//'EvolutionRules'
		public Keyword getEvolutionRulesKeyword_2() { return cEvolutionRulesKeyword_2; }
		
		//(rules += EvolutionRules)*
		public Assignment getRulesAssignment_3() { return cRulesAssignment_3; }
		
		//EvolutionRules
		public RuleCall getRulesEvolutionRulesParserRuleCall_3_0() { return cRulesEvolutionRulesParserRuleCall_3_0; }
	}
	public class InitialGridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.InitialGrid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRowsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRowsINTTerminalRuleCall_1_0 = (RuleCall)cRowsAssignment_1.eContents().get(0);
		private final Keyword cColumnsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnsINTTerminalRuleCall_3_0 = (RuleCall)cColumnsAssignment_3.eContents().get(0);
		private final Keyword cCellsAliveXKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCellsXAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCellsXSTRINGTerminalRuleCall_5_0 = (RuleCall)cCellsXAssignment_5.eContents().get(0);
		private final Keyword cCellsAliveYKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCellsYAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCellsYSTRINGTerminalRuleCall_7_0 = (RuleCall)cCellsYAssignment_7.eContents().get(0);
		
		//InitialGrid:
		//    'Rows:' rows = INT
		//    'Columns:' columns = INT
		//    'CellsAliveX:' cellsX = STRING
		//    'CellsAliveY:' cellsY = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Rows:' rows = INT
		//'Columns:' columns = INT
		//'CellsAliveX:' cellsX = STRING
		//'CellsAliveY:' cellsY = STRING
		public Group getGroup() { return cGroup; }
		
		//'Rows:'
		public Keyword getRowsKeyword_0() { return cRowsKeyword_0; }
		
		//rows = INT
		public Assignment getRowsAssignment_1() { return cRowsAssignment_1; }
		
		//INT
		public RuleCall getRowsINTTerminalRuleCall_1_0() { return cRowsINTTerminalRuleCall_1_0; }
		
		//'Columns:'
		public Keyword getColumnsKeyword_2() { return cColumnsKeyword_2; }
		
		//columns = INT
		public Assignment getColumnsAssignment_3() { return cColumnsAssignment_3; }
		
		//INT
		public RuleCall getColumnsINTTerminalRuleCall_3_0() { return cColumnsINTTerminalRuleCall_3_0; }
		
		//'CellsAliveX:'
		public Keyword getCellsAliveXKeyword_4() { return cCellsAliveXKeyword_4; }
		
		//cellsX = STRING
		public Assignment getCellsXAssignment_5() { return cCellsXAssignment_5; }
		
		//STRING
		public RuleCall getCellsXSTRINGTerminalRuleCall_5_0() { return cCellsXSTRINGTerminalRuleCall_5_0; }
		
		//'CellsAliveY:'
		public Keyword getCellsAliveYKeyword_6() { return cCellsAliveYKeyword_6; }
		
		//cellsY = STRING
		public Assignment getCellsYAssignment_7() { return cCellsYAssignment_7; }
		
		//STRING
		public RuleCall getCellsYSTRINGTerminalRuleCall_7_0() { return cCellsYSTRINGTerminalRuleCall_7_0; }
	}
	public class EvolutionRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.EvolutionRules");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameDieAliveUnitEnumRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cComparisonOperatorKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOperatorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOperatorOperatorEnumRuleCall_3_0 = (RuleCall)cOperatorAssignment_3.eContents().get(0);
		private final Keyword cNumberOfLiveNeighborsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNumberOfLiveNeighborsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNumberOfLiveNeighborsINTTerminalRuleCall_5_0 = (RuleCall)cNumberOfLiveNeighborsAssignment_5.eContents().get(0);
		
		//EvolutionRules:
		//    'Rule:' name = DieAliveUnit
		//    'ComparisonOperator:' operator = Operator
		//    'NumberOfLiveNeighbors:' numberOfLiveNeighbors = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Rule:' name = DieAliveUnit
		//'ComparisonOperator:' operator = Operator
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
		
		//operator = Operator
		public Assignment getOperatorAssignment_3() { return cOperatorAssignment_3; }
		
		//Operator
		public RuleCall getOperatorOperatorEnumRuleCall_3_0() { return cOperatorOperatorEnumRuleCall_3_0; }
		
		//'NumberOfLiveNeighbors:'
		public Keyword getNumberOfLiveNeighborsKeyword_4() { return cNumberOfLiveNeighborsKeyword_4; }
		
		//numberOfLiveNeighbors = INT
		public Assignment getNumberOfLiveNeighborsAssignment_5() { return cNumberOfLiveNeighborsAssignment_5; }
		
		//INT
		public RuleCall getNumberOfLiveNeighborsINTTerminalRuleCall_5_0() { return cNumberOfLiveNeighborsINTTerminalRuleCall_5_0; }
	}
	
	public class OperatorElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.LifeDsl.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLTLessThanSignKeyword_0_0 = (Keyword)cLTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEQEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEQEqualsSignKeyword_1_0 = (Keyword)cEQEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGTGreaterThanSignKeyword_2_0 = (Keyword)cGTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Operator:
		//    LT = '<' |
		//    EQ = '=' |
		//    GT = '>'
		//;
		public EnumRule getRule() { return rule; }
		
		//LT = '<' |
		//EQ = '=' |
		//GT = '>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LT = '<'
		public EnumLiteralDeclaration getLTEnumLiteralDeclaration_0() { return cLTEnumLiteralDeclaration_0; }
		
		//'<'
		public Keyword getLTLessThanSignKeyword_0_0() { return cLTLessThanSignKeyword_0_0; }
		
		//EQ = '='
		public EnumLiteralDeclaration getEQEnumLiteralDeclaration_1() { return cEQEnumLiteralDeclaration_1; }
		
		//'='
		public Keyword getEQEqualsSignKeyword_1_0() { return cEQEqualsSignKeyword_1_0; }
		
		//GT = '>'
		public EnumLiteralDeclaration getGTEnumLiteralDeclaration_2() { return cGTEnumLiteralDeclaration_2; }
		
		//'>'
		public Keyword getGTGreaterThanSignKeyword_2_0() { return cGTGreaterThanSignKeyword_2_0; }
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
	private final InitialGridElements pInitialGrid;
	private final EvolutionRulesElements pEvolutionRules;
	private final OperatorElements eOperator;
	private final DieAliveUnitElements eDieAliveUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LifeDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pInitialGrid = new InitialGridElements();
		this.pEvolutionRules = new EvolutionRulesElements();
		this.eOperator = new OperatorElements();
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
	//    'InitialGrid' grid = InitialGrid
	//    'EvolutionRules' (rules += EvolutionRules)*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//InitialGrid:
	//    'Rows:' rows = INT
	//    'Columns:' columns = INT
	//    'CellsAliveX:' cellsX = STRING
	//    'CellsAliveY:' cellsY = STRING
	//;
	public InitialGridElements getInitialGridAccess() {
		return pInitialGrid;
	}
	
	public ParserRule getInitialGridRule() {
		return getInitialGridAccess().getRule();
	}
	
	//EvolutionRules:
	//    'Rule:' name = DieAliveUnit
	//    'ComparisonOperator:' operator = Operator
	//    'NumberOfLiveNeighbors:' numberOfLiveNeighbors = INT
	//;
	public EvolutionRulesElements getEvolutionRulesAccess() {
		return pEvolutionRules;
	}
	
	public ParserRule getEvolutionRulesRule() {
		return getEvolutionRulesAccess().getRule();
	}
	
	//enum Operator:
	//    LT = '<' |
	//    EQ = '=' |
	//    GT = '>'
	//;
	public OperatorElements getOperatorAccess() {
		return eOperator;
	}
	
	public EnumRule getOperatorRule() {
		return getOperatorAccess().getRule();
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
