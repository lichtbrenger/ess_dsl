package game.of.life.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import game.of.life.services.LifeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLifeDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InitialGrid'", "'EvolutionRules'", "'Rows:'", "'Columns:'", "'CellsAliveX:'", "'CellsAliveY:'", "'Rule:'", "'ComparisonOperator:'", "'NumberOfLiveNeighbors:'", "'<'", "'='", "'>'", "'die'", "'live'", "'become alive'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLifeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLifeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLifeDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLifeDsl.g"; }



     	private LifeDslGrammarAccess grammarAccess;

        public InternalLifeDslParser(TokenStream input, LifeDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LifeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLifeDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLifeDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalLifeDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalLifeDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'InitialGrid' ( (lv_grid_1_0= ruleInitialGrid ) ) otherlv_2= 'EvolutionRules' ( (lv_rules_3_0= ruleEvolutionRules ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_grid_1_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalLifeDsl.g:78:2: ( (otherlv_0= 'InitialGrid' ( (lv_grid_1_0= ruleInitialGrid ) ) otherlv_2= 'EvolutionRules' ( (lv_rules_3_0= ruleEvolutionRules ) )* ) )
            // InternalLifeDsl.g:79:2: (otherlv_0= 'InitialGrid' ( (lv_grid_1_0= ruleInitialGrid ) ) otherlv_2= 'EvolutionRules' ( (lv_rules_3_0= ruleEvolutionRules ) )* )
            {
            // InternalLifeDsl.g:79:2: (otherlv_0= 'InitialGrid' ( (lv_grid_1_0= ruleInitialGrid ) ) otherlv_2= 'EvolutionRules' ( (lv_rules_3_0= ruleEvolutionRules ) )* )
            // InternalLifeDsl.g:80:3: otherlv_0= 'InitialGrid' ( (lv_grid_1_0= ruleInitialGrid ) ) otherlv_2= 'EvolutionRules' ( (lv_rules_3_0= ruleEvolutionRules ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getInitialGridKeyword_0());
            		
            // InternalLifeDsl.g:84:3: ( (lv_grid_1_0= ruleInitialGrid ) )
            // InternalLifeDsl.g:85:4: (lv_grid_1_0= ruleInitialGrid )
            {
            // InternalLifeDsl.g:85:4: (lv_grid_1_0= ruleInitialGrid )
            // InternalLifeDsl.g:86:5: lv_grid_1_0= ruleInitialGrid
            {

            					newCompositeNode(grammarAccess.getModelAccess().getGridInitialGridParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_grid_1_0=ruleInitialGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"grid",
            						lv_grid_1_0,
            						"game.of.life.LifeDsl.InitialGrid");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getEvolutionRulesKeyword_2());
            		
            // InternalLifeDsl.g:107:3: ( (lv_rules_3_0= ruleEvolutionRules ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLifeDsl.g:108:4: (lv_rules_3_0= ruleEvolutionRules )
            	    {
            	    // InternalLifeDsl.g:108:4: (lv_rules_3_0= ruleEvolutionRules )
            	    // InternalLifeDsl.g:109:5: lv_rules_3_0= ruleEvolutionRules
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRulesEvolutionRulesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rules_3_0=ruleEvolutionRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"game.of.life.LifeDsl.EvolutionRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleInitialGrid"
    // InternalLifeDsl.g:130:1: entryRuleInitialGrid returns [EObject current=null] : iv_ruleInitialGrid= ruleInitialGrid EOF ;
    public final EObject entryRuleInitialGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialGrid = null;


        try {
            // InternalLifeDsl.g:130:52: (iv_ruleInitialGrid= ruleInitialGrid EOF )
            // InternalLifeDsl.g:131:2: iv_ruleInitialGrid= ruleInitialGrid EOF
            {
             newCompositeNode(grammarAccess.getInitialGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialGrid=ruleInitialGrid();

            state._fsp--;

             current =iv_ruleInitialGrid; 
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
    // $ANTLR end "entryRuleInitialGrid"


    // $ANTLR start "ruleInitialGrid"
    // InternalLifeDsl.g:137:1: ruleInitialGrid returns [EObject current=null] : (otherlv_0= 'Rows:' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'Columns:' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= 'CellsAliveX:' ( (lv_cellsX_5_0= RULE_STRING ) ) otherlv_6= 'CellsAliveY:' ( (lv_cellsY_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleInitialGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rows_1_0=null;
        Token otherlv_2=null;
        Token lv_columns_3_0=null;
        Token otherlv_4=null;
        Token lv_cellsX_5_0=null;
        Token otherlv_6=null;
        Token lv_cellsY_7_0=null;


        	enterRule();

        try {
            // InternalLifeDsl.g:143:2: ( (otherlv_0= 'Rows:' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'Columns:' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= 'CellsAliveX:' ( (lv_cellsX_5_0= RULE_STRING ) ) otherlv_6= 'CellsAliveY:' ( (lv_cellsY_7_0= RULE_STRING ) ) ) )
            // InternalLifeDsl.g:144:2: (otherlv_0= 'Rows:' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'Columns:' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= 'CellsAliveX:' ( (lv_cellsX_5_0= RULE_STRING ) ) otherlv_6= 'CellsAliveY:' ( (lv_cellsY_7_0= RULE_STRING ) ) )
            {
            // InternalLifeDsl.g:144:2: (otherlv_0= 'Rows:' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'Columns:' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= 'CellsAliveX:' ( (lv_cellsX_5_0= RULE_STRING ) ) otherlv_6= 'CellsAliveY:' ( (lv_cellsY_7_0= RULE_STRING ) ) )
            // InternalLifeDsl.g:145:3: otherlv_0= 'Rows:' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= 'Columns:' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= 'CellsAliveX:' ( (lv_cellsX_5_0= RULE_STRING ) ) otherlv_6= 'CellsAliveY:' ( (lv_cellsY_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialGridAccess().getRowsKeyword_0());
            		
            // InternalLifeDsl.g:149:3: ( (lv_rows_1_0= RULE_INT ) )
            // InternalLifeDsl.g:150:4: (lv_rows_1_0= RULE_INT )
            {
            // InternalLifeDsl.g:150:4: (lv_rows_1_0= RULE_INT )
            // InternalLifeDsl.g:151:5: lv_rows_1_0= RULE_INT
            {
            lv_rows_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_rows_1_0, grammarAccess.getInitialGridAccess().getRowsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rows",
            						lv_rows_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialGridAccess().getColumnsKeyword_2());
            		
            // InternalLifeDsl.g:171:3: ( (lv_columns_3_0= RULE_INT ) )
            // InternalLifeDsl.g:172:4: (lv_columns_3_0= RULE_INT )
            {
            // InternalLifeDsl.g:172:4: (lv_columns_3_0= RULE_INT )
            // InternalLifeDsl.g:173:5: lv_columns_3_0= RULE_INT
            {
            lv_columns_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_columns_3_0, grammarAccess.getInitialGridAccess().getColumnsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialGridAccess().getCellsAliveXKeyword_4());
            		
            // InternalLifeDsl.g:193:3: ( (lv_cellsX_5_0= RULE_STRING ) )
            // InternalLifeDsl.g:194:4: (lv_cellsX_5_0= RULE_STRING )
            {
            // InternalLifeDsl.g:194:4: (lv_cellsX_5_0= RULE_STRING )
            // InternalLifeDsl.g:195:5: lv_cellsX_5_0= RULE_STRING
            {
            lv_cellsX_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_cellsX_5_0, grammarAccess.getInitialGridAccess().getCellsXSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cellsX",
            						lv_cellsX_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getInitialGridAccess().getCellsAliveYKeyword_6());
            		
            // InternalLifeDsl.g:215:3: ( (lv_cellsY_7_0= RULE_STRING ) )
            // InternalLifeDsl.g:216:4: (lv_cellsY_7_0= RULE_STRING )
            {
            // InternalLifeDsl.g:216:4: (lv_cellsY_7_0= RULE_STRING )
            // InternalLifeDsl.g:217:5: lv_cellsY_7_0= RULE_STRING
            {
            lv_cellsY_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cellsY_7_0, grammarAccess.getInitialGridAccess().getCellsYSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cellsY",
            						lv_cellsY_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleInitialGrid"


    // $ANTLR start "entryRuleEvolutionRules"
    // InternalLifeDsl.g:237:1: entryRuleEvolutionRules returns [EObject current=null] : iv_ruleEvolutionRules= ruleEvolutionRules EOF ;
    public final EObject entryRuleEvolutionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolutionRules = null;


        try {
            // InternalLifeDsl.g:237:55: (iv_ruleEvolutionRules= ruleEvolutionRules EOF )
            // InternalLifeDsl.g:238:2: iv_ruleEvolutionRules= ruleEvolutionRules EOF
            {
             newCompositeNode(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolutionRules=ruleEvolutionRules();

            state._fsp--;

             current =iv_ruleEvolutionRules; 
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
    // $ANTLR end "entryRuleEvolutionRules"


    // $ANTLR start "ruleEvolutionRules"
    // InternalLifeDsl.g:244:1: ruleEvolutionRules returns [EObject current=null] : (otherlv_0= 'Rule:' ( (lv_name_1_0= ruleDieAliveUnit ) ) otherlv_2= 'ComparisonOperator:' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'NumberOfLiveNeighbors:' ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) ) ) ;
    public final EObject ruleEvolutionRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_numberOfLiveNeighbors_5_0=null;
        Enumerator lv_name_1_0 = null;

        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalLifeDsl.g:250:2: ( (otherlv_0= 'Rule:' ( (lv_name_1_0= ruleDieAliveUnit ) ) otherlv_2= 'ComparisonOperator:' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'NumberOfLiveNeighbors:' ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) ) ) )
            // InternalLifeDsl.g:251:2: (otherlv_0= 'Rule:' ( (lv_name_1_0= ruleDieAliveUnit ) ) otherlv_2= 'ComparisonOperator:' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'NumberOfLiveNeighbors:' ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) ) )
            {
            // InternalLifeDsl.g:251:2: (otherlv_0= 'Rule:' ( (lv_name_1_0= ruleDieAliveUnit ) ) otherlv_2= 'ComparisonOperator:' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'NumberOfLiveNeighbors:' ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) ) )
            // InternalLifeDsl.g:252:3: otherlv_0= 'Rule:' ( (lv_name_1_0= ruleDieAliveUnit ) ) otherlv_2= 'ComparisonOperator:' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'NumberOfLiveNeighbors:' ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEvolutionRulesAccess().getRuleKeyword_0());
            		
            // InternalLifeDsl.g:256:3: ( (lv_name_1_0= ruleDieAliveUnit ) )
            // InternalLifeDsl.g:257:4: (lv_name_1_0= ruleDieAliveUnit )
            {
            // InternalLifeDsl.g:257:4: (lv_name_1_0= ruleDieAliveUnit )
            // InternalLifeDsl.g:258:5: lv_name_1_0= ruleDieAliveUnit
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getNameDieAliveUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleDieAliveUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"game.of.life.LifeDsl.DieAliveUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEvolutionRulesAccess().getComparisonOperatorKeyword_2());
            		
            // InternalLifeDsl.g:279:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalLifeDsl.g:280:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalLifeDsl.g:280:4: (lv_operator_3_0= ruleOperator )
            // InternalLifeDsl.g:281:5: lv_operator_3_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getOperatorOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_operator_3_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"game.of.life.LifeDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsKeyword_4());
            		
            // InternalLifeDsl.g:302:3: ( (lv_numberOfLiveNeighbors_5_0= RULE_INT ) )
            // InternalLifeDsl.g:303:4: (lv_numberOfLiveNeighbors_5_0= RULE_INT )
            {
            // InternalLifeDsl.g:303:4: (lv_numberOfLiveNeighbors_5_0= RULE_INT )
            // InternalLifeDsl.g:304:5: lv_numberOfLiveNeighbors_5_0= RULE_INT
            {
            lv_numberOfLiveNeighbors_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_numberOfLiveNeighbors_5_0, grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberOfLiveNeighbors",
            						lv_numberOfLiveNeighbors_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleEvolutionRules"


    // $ANTLR start "ruleOperator"
    // InternalLifeDsl.g:324:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLifeDsl.g:330:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) ) )
            // InternalLifeDsl.g:331:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) )
            {
            // InternalLifeDsl.g:331:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLifeDsl.g:332:3: (enumLiteral_0= '<' )
                    {
                    // InternalLifeDsl.g:332:3: (enumLiteral_0= '<' )
                    // InternalLifeDsl.g:333:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLifeDsl.g:340:3: (enumLiteral_1= '=' )
                    {
                    // InternalLifeDsl.g:340:3: (enumLiteral_1= '=' )
                    // InternalLifeDsl.g:341:4: enumLiteral_1= '='
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLifeDsl.g:348:3: (enumLiteral_2= '>' )
                    {
                    // InternalLifeDsl.g:348:3: (enumLiteral_2= '>' )
                    // InternalLifeDsl.g:349:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleDieAliveUnit"
    // InternalLifeDsl.g:359:1: ruleDieAliveUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'become alive' ) ) ;
    public final Enumerator ruleDieAliveUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLifeDsl.g:365:2: ( ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'become alive' ) ) )
            // InternalLifeDsl.g:366:2: ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'become alive' ) )
            {
            // InternalLifeDsl.g:366:2: ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'become alive' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLifeDsl.g:367:3: (enumLiteral_0= 'die' )
                    {
                    // InternalLifeDsl.g:367:3: (enumLiteral_0= 'die' )
                    // InternalLifeDsl.g:368:4: enumLiteral_0= 'die'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDieAliveUnitAccess().getDIEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDieAliveUnitAccess().getDIEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLifeDsl.g:375:3: (enumLiteral_1= 'live' )
                    {
                    // InternalLifeDsl.g:375:3: (enumLiteral_1= 'live' )
                    // InternalLifeDsl.g:376:4: enumLiteral_1= 'live'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDieAliveUnitAccess().getLIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDieAliveUnitAccess().getLIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLifeDsl.g:383:3: (enumLiteral_2= 'become alive' )
                    {
                    // InternalLifeDsl.g:383:3: (enumLiteral_2= 'become alive' )
                    // InternalLifeDsl.g:384:4: enumLiteral_2= 'become alive'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDieAliveUnitAccess().getBECOME_ALIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDieAliveUnitAccess().getBECOME_ALIVEEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleDieAliveUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}