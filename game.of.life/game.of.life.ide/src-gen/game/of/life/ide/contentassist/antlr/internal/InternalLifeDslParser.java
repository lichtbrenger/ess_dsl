package game.of.life.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import game.of.life.services.LifeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLifeDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'=='", "'>'", "'die'", "'live'", "'become alive'", "'InitialGrid'", "'EvolutionRules'", "'CellsAliveX:'", "'CellsAliveY:'", "'Rule:'", "'ComparisonOperator:'", "'NumberOfLiveNeighbors:'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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

    	public void setGrammarAccess(LifeDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalLifeDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalLifeDsl.g:54:1: ( ruleModel EOF )
            // InternalLifeDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLifeDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalLifeDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalLifeDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalLifeDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalLifeDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalLifeDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInitialGrid"
    // InternalLifeDsl.g:78:1: entryRuleInitialGrid : ruleInitialGrid EOF ;
    public final void entryRuleInitialGrid() throws RecognitionException {
        try {
            // InternalLifeDsl.g:79:1: ( ruleInitialGrid EOF )
            // InternalLifeDsl.g:80:1: ruleInitialGrid EOF
            {
             before(grammarAccess.getInitialGridRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialGrid();

            state._fsp--;

             after(grammarAccess.getInitialGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialGrid"


    // $ANTLR start "ruleInitialGrid"
    // InternalLifeDsl.g:87:1: ruleInitialGrid : ( ( rule__InitialGrid__Group__0 ) ) ;
    public final void ruleInitialGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:91:2: ( ( ( rule__InitialGrid__Group__0 ) ) )
            // InternalLifeDsl.g:92:2: ( ( rule__InitialGrid__Group__0 ) )
            {
            // InternalLifeDsl.g:92:2: ( ( rule__InitialGrid__Group__0 ) )
            // InternalLifeDsl.g:93:3: ( rule__InitialGrid__Group__0 )
            {
             before(grammarAccess.getInitialGridAccess().getGroup()); 
            // InternalLifeDsl.g:94:3: ( rule__InitialGrid__Group__0 )
            // InternalLifeDsl.g:94:4: rule__InitialGrid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialGrid"


    // $ANTLR start "entryRuleEvolutionRules"
    // InternalLifeDsl.g:103:1: entryRuleEvolutionRules : ruleEvolutionRules EOF ;
    public final void entryRuleEvolutionRules() throws RecognitionException {
        try {
            // InternalLifeDsl.g:104:1: ( ruleEvolutionRules EOF )
            // InternalLifeDsl.g:105:1: ruleEvolutionRules EOF
            {
             before(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleEvolutionRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvolutionRules"


    // $ANTLR start "ruleEvolutionRules"
    // InternalLifeDsl.g:112:1: ruleEvolutionRules : ( ( rule__EvolutionRules__Group__0 ) ) ;
    public final void ruleEvolutionRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:116:2: ( ( ( rule__EvolutionRules__Group__0 ) ) )
            // InternalLifeDsl.g:117:2: ( ( rule__EvolutionRules__Group__0 ) )
            {
            // InternalLifeDsl.g:117:2: ( ( rule__EvolutionRules__Group__0 ) )
            // InternalLifeDsl.g:118:3: ( rule__EvolutionRules__Group__0 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getGroup()); 
            // InternalLifeDsl.g:119:3: ( rule__EvolutionRules__Group__0 )
            // InternalLifeDsl.g:119:4: rule__EvolutionRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvolutionRules"


    // $ANTLR start "ruleOperator"
    // InternalLifeDsl.g:128:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:132:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalLifeDsl.g:133:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalLifeDsl.g:133:2: ( ( rule__Operator__Alternatives ) )
            // InternalLifeDsl.g:134:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalLifeDsl.g:135:3: ( rule__Operator__Alternatives )
            // InternalLifeDsl.g:135:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleDieAliveUnit"
    // InternalLifeDsl.g:144:1: ruleDieAliveUnit : ( ( rule__DieAliveUnit__Alternatives ) ) ;
    public final void ruleDieAliveUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:148:1: ( ( ( rule__DieAliveUnit__Alternatives ) ) )
            // InternalLifeDsl.g:149:2: ( ( rule__DieAliveUnit__Alternatives ) )
            {
            // InternalLifeDsl.g:149:2: ( ( rule__DieAliveUnit__Alternatives ) )
            // InternalLifeDsl.g:150:3: ( rule__DieAliveUnit__Alternatives )
            {
             before(grammarAccess.getDieAliveUnitAccess().getAlternatives()); 
            // InternalLifeDsl.g:151:3: ( rule__DieAliveUnit__Alternatives )
            // InternalLifeDsl.g:151:4: rule__DieAliveUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DieAliveUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDieAliveUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDieAliveUnit"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalLifeDsl.g:159:1: rule__Operator__Alternatives : ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:163:1: ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLifeDsl.g:164:2: ( ( '<' ) )
                    {
                    // InternalLifeDsl.g:164:2: ( ( '<' ) )
                    // InternalLifeDsl.g:165:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_0()); 
                    // InternalLifeDsl.g:166:3: ( '<' )
                    // InternalLifeDsl.g:166:4: '<'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLifeDsl.g:170:2: ( ( '==' ) )
                    {
                    // InternalLifeDsl.g:170:2: ( ( '==' ) )
                    // InternalLifeDsl.g:171:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_1()); 
                    // InternalLifeDsl.g:172:3: ( '==' )
                    // InternalLifeDsl.g:172:4: '=='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLifeDsl.g:176:2: ( ( '>' ) )
                    {
                    // InternalLifeDsl.g:176:2: ( ( '>' ) )
                    // InternalLifeDsl.g:177:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 
                    // InternalLifeDsl.g:178:3: ( '>' )
                    // InternalLifeDsl.g:178:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__DieAliveUnit__Alternatives"
    // InternalLifeDsl.g:186:1: rule__DieAliveUnit__Alternatives : ( ( ( 'die' ) ) | ( ( 'live' ) ) | ( ( 'become alive' ) ) );
    public final void rule__DieAliveUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:190:1: ( ( ( 'die' ) ) | ( ( 'live' ) ) | ( ( 'become alive' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // InternalLifeDsl.g:191:2: ( ( 'die' ) )
                    {
                    // InternalLifeDsl.g:191:2: ( ( 'die' ) )
                    // InternalLifeDsl.g:192:3: ( 'die' )
                    {
                     before(grammarAccess.getDieAliveUnitAccess().getDIEEnumLiteralDeclaration_0()); 
                    // InternalLifeDsl.g:193:3: ( 'die' )
                    // InternalLifeDsl.g:193:4: 'die'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDieAliveUnitAccess().getDIEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLifeDsl.g:197:2: ( ( 'live' ) )
                    {
                    // InternalLifeDsl.g:197:2: ( ( 'live' ) )
                    // InternalLifeDsl.g:198:3: ( 'live' )
                    {
                     before(grammarAccess.getDieAliveUnitAccess().getLIVEEnumLiteralDeclaration_1()); 
                    // InternalLifeDsl.g:199:3: ( 'live' )
                    // InternalLifeDsl.g:199:4: 'live'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDieAliveUnitAccess().getLIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLifeDsl.g:203:2: ( ( 'become alive' ) )
                    {
                    // InternalLifeDsl.g:203:2: ( ( 'become alive' ) )
                    // InternalLifeDsl.g:204:3: ( 'become alive' )
                    {
                     before(grammarAccess.getDieAliveUnitAccess().getBECOME_ALIVEEnumLiteralDeclaration_2()); 
                    // InternalLifeDsl.g:205:3: ( 'become alive' )
                    // InternalLifeDsl.g:205:4: 'become alive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDieAliveUnitAccess().getBECOME_ALIVEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DieAliveUnit__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalLifeDsl.g:213:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:217:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalLifeDsl.g:218:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalLifeDsl.g:225:1: rule__Model__Group__0__Impl : ( 'InitialGrid' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:229:1: ( ( 'InitialGrid' ) )
            // InternalLifeDsl.g:230:1: ( 'InitialGrid' )
            {
            // InternalLifeDsl.g:230:1: ( 'InitialGrid' )
            // InternalLifeDsl.g:231:2: 'InitialGrid'
            {
             before(grammarAccess.getModelAccess().getInitialGridKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getInitialGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalLifeDsl.g:240:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:244:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalLifeDsl.g:245:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalLifeDsl.g:252:1: rule__Model__Group__1__Impl : ( ( rule__Model__GridAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:256:1: ( ( ( rule__Model__GridAssignment_1 ) ) )
            // InternalLifeDsl.g:257:1: ( ( rule__Model__GridAssignment_1 ) )
            {
            // InternalLifeDsl.g:257:1: ( ( rule__Model__GridAssignment_1 ) )
            // InternalLifeDsl.g:258:2: ( rule__Model__GridAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getGridAssignment_1()); 
            // InternalLifeDsl.g:259:2: ( rule__Model__GridAssignment_1 )
            // InternalLifeDsl.g:259:3: rule__Model__GridAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__GridAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGridAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalLifeDsl.g:267:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:271:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalLifeDsl.g:272:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalLifeDsl.g:279:1: rule__Model__Group__2__Impl : ( 'EvolutionRules' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:283:1: ( ( 'EvolutionRules' ) )
            // InternalLifeDsl.g:284:1: ( 'EvolutionRules' )
            {
            // InternalLifeDsl.g:284:1: ( 'EvolutionRules' )
            // InternalLifeDsl.g:285:2: 'EvolutionRules'
            {
             before(grammarAccess.getModelAccess().getEvolutionRulesKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEvolutionRulesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalLifeDsl.g:294:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:298:1: ( rule__Model__Group__3__Impl )
            // InternalLifeDsl.g:299:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalLifeDsl.g:305:1: rule__Model__Group__3__Impl : ( ( rule__Model__RulesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:309:1: ( ( ( rule__Model__RulesAssignment_3 )* ) )
            // InternalLifeDsl.g:310:1: ( ( rule__Model__RulesAssignment_3 )* )
            {
            // InternalLifeDsl.g:310:1: ( ( rule__Model__RulesAssignment_3 )* )
            // InternalLifeDsl.g:311:2: ( rule__Model__RulesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_3()); 
            // InternalLifeDsl.g:312:2: ( rule__Model__RulesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLifeDsl.g:312:3: rule__Model__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__InitialGrid__Group__0"
    // InternalLifeDsl.g:321:1: rule__InitialGrid__Group__0 : rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1 ;
    public final void rule__InitialGrid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:325:1: ( rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1 )
            // InternalLifeDsl.g:326:2: rule__InitialGrid__Group__0__Impl rule__InitialGrid__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InitialGrid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__0"


    // $ANTLR start "rule__InitialGrid__Group__0__Impl"
    // InternalLifeDsl.g:333:1: rule__InitialGrid__Group__0__Impl : ( 'CellsAliveX:' ) ;
    public final void rule__InitialGrid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:337:1: ( ( 'CellsAliveX:' ) )
            // InternalLifeDsl.g:338:1: ( 'CellsAliveX:' )
            {
            // InternalLifeDsl.g:338:1: ( 'CellsAliveX:' )
            // InternalLifeDsl.g:339:2: 'CellsAliveX:'
            {
             before(grammarAccess.getInitialGridAccess().getCellsAliveXKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getCellsAliveXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__0__Impl"


    // $ANTLR start "rule__InitialGrid__Group__1"
    // InternalLifeDsl.g:348:1: rule__InitialGrid__Group__1 : rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2 ;
    public final void rule__InitialGrid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:352:1: ( rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2 )
            // InternalLifeDsl.g:353:2: rule__InitialGrid__Group__1__Impl rule__InitialGrid__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__InitialGrid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__1"


    // $ANTLR start "rule__InitialGrid__Group__1__Impl"
    // InternalLifeDsl.g:360:1: rule__InitialGrid__Group__1__Impl : ( ( rule__InitialGrid__CellsXAssignment_1 ) ) ;
    public final void rule__InitialGrid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:364:1: ( ( ( rule__InitialGrid__CellsXAssignment_1 ) ) )
            // InternalLifeDsl.g:365:1: ( ( rule__InitialGrid__CellsXAssignment_1 ) )
            {
            // InternalLifeDsl.g:365:1: ( ( rule__InitialGrid__CellsXAssignment_1 ) )
            // InternalLifeDsl.g:366:2: ( rule__InitialGrid__CellsXAssignment_1 )
            {
             before(grammarAccess.getInitialGridAccess().getCellsXAssignment_1()); 
            // InternalLifeDsl.g:367:2: ( rule__InitialGrid__CellsXAssignment_1 )
            // InternalLifeDsl.g:367:3: rule__InitialGrid__CellsXAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__CellsXAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getCellsXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__1__Impl"


    // $ANTLR start "rule__InitialGrid__Group__2"
    // InternalLifeDsl.g:375:1: rule__InitialGrid__Group__2 : rule__InitialGrid__Group__2__Impl rule__InitialGrid__Group__3 ;
    public final void rule__InitialGrid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:379:1: ( rule__InitialGrid__Group__2__Impl rule__InitialGrid__Group__3 )
            // InternalLifeDsl.g:380:2: rule__InitialGrid__Group__2__Impl rule__InitialGrid__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InitialGrid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__2"


    // $ANTLR start "rule__InitialGrid__Group__2__Impl"
    // InternalLifeDsl.g:387:1: rule__InitialGrid__Group__2__Impl : ( 'CellsAliveY:' ) ;
    public final void rule__InitialGrid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:391:1: ( ( 'CellsAliveY:' ) )
            // InternalLifeDsl.g:392:1: ( 'CellsAliveY:' )
            {
            // InternalLifeDsl.g:392:1: ( 'CellsAliveY:' )
            // InternalLifeDsl.g:393:2: 'CellsAliveY:'
            {
             before(grammarAccess.getInitialGridAccess().getCellsAliveYKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getCellsAliveYKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__2__Impl"


    // $ANTLR start "rule__InitialGrid__Group__3"
    // InternalLifeDsl.g:402:1: rule__InitialGrid__Group__3 : rule__InitialGrid__Group__3__Impl ;
    public final void rule__InitialGrid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:406:1: ( rule__InitialGrid__Group__3__Impl )
            // InternalLifeDsl.g:407:2: rule__InitialGrid__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__3"


    // $ANTLR start "rule__InitialGrid__Group__3__Impl"
    // InternalLifeDsl.g:413:1: rule__InitialGrid__Group__3__Impl : ( ( rule__InitialGrid__CellsYAssignment_3 ) ) ;
    public final void rule__InitialGrid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:417:1: ( ( ( rule__InitialGrid__CellsYAssignment_3 ) ) )
            // InternalLifeDsl.g:418:1: ( ( rule__InitialGrid__CellsYAssignment_3 ) )
            {
            // InternalLifeDsl.g:418:1: ( ( rule__InitialGrid__CellsYAssignment_3 ) )
            // InternalLifeDsl.g:419:2: ( rule__InitialGrid__CellsYAssignment_3 )
            {
             before(grammarAccess.getInitialGridAccess().getCellsYAssignment_3()); 
            // InternalLifeDsl.g:420:2: ( rule__InitialGrid__CellsYAssignment_3 )
            // InternalLifeDsl.g:420:3: rule__InitialGrid__CellsYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialGrid__CellsYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialGridAccess().getCellsYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__Group__3__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__0"
    // InternalLifeDsl.g:429:1: rule__EvolutionRules__Group__0 : rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 ;
    public final void rule__EvolutionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:433:1: ( rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 )
            // InternalLifeDsl.g:434:2: rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EvolutionRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0"


    // $ANTLR start "rule__EvolutionRules__Group__0__Impl"
    // InternalLifeDsl.g:441:1: rule__EvolutionRules__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__EvolutionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:445:1: ( ( 'Rule:' ) )
            // InternalLifeDsl.g:446:1: ( 'Rule:' )
            {
            // InternalLifeDsl.g:446:1: ( 'Rule:' )
            // InternalLifeDsl.g:447:2: 'Rule:'
            {
             before(grammarAccess.getEvolutionRulesAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__1"
    // InternalLifeDsl.g:456:1: rule__EvolutionRules__Group__1 : rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 ;
    public final void rule__EvolutionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:460:1: ( rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 )
            // InternalLifeDsl.g:461:2: rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EvolutionRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1"


    // $ANTLR start "rule__EvolutionRules__Group__1__Impl"
    // InternalLifeDsl.g:468:1: rule__EvolutionRules__Group__1__Impl : ( ( rule__EvolutionRules__NameAssignment_1 ) ) ;
    public final void rule__EvolutionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:472:1: ( ( ( rule__EvolutionRules__NameAssignment_1 ) ) )
            // InternalLifeDsl.g:473:1: ( ( rule__EvolutionRules__NameAssignment_1 ) )
            {
            // InternalLifeDsl.g:473:1: ( ( rule__EvolutionRules__NameAssignment_1 ) )
            // InternalLifeDsl.g:474:2: ( rule__EvolutionRules__NameAssignment_1 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getNameAssignment_1()); 
            // InternalLifeDsl.g:475:2: ( rule__EvolutionRules__NameAssignment_1 )
            // InternalLifeDsl.g:475:3: rule__EvolutionRules__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__2"
    // InternalLifeDsl.g:483:1: rule__EvolutionRules__Group__2 : rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 ;
    public final void rule__EvolutionRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:487:1: ( rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 )
            // InternalLifeDsl.g:488:2: rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EvolutionRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2"


    // $ANTLR start "rule__EvolutionRules__Group__2__Impl"
    // InternalLifeDsl.g:495:1: rule__EvolutionRules__Group__2__Impl : ( 'ComparisonOperator:' ) ;
    public final void rule__EvolutionRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:499:1: ( ( 'ComparisonOperator:' ) )
            // InternalLifeDsl.g:500:1: ( 'ComparisonOperator:' )
            {
            // InternalLifeDsl.g:500:1: ( 'ComparisonOperator:' )
            // InternalLifeDsl.g:501:2: 'ComparisonOperator:'
            {
             before(grammarAccess.getEvolutionRulesAccess().getComparisonOperatorKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getComparisonOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__3"
    // InternalLifeDsl.g:510:1: rule__EvolutionRules__Group__3 : rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4 ;
    public final void rule__EvolutionRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:514:1: ( rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4 )
            // InternalLifeDsl.g:515:2: rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EvolutionRules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3"


    // $ANTLR start "rule__EvolutionRules__Group__3__Impl"
    // InternalLifeDsl.g:522:1: rule__EvolutionRules__Group__3__Impl : ( ( rule__EvolutionRules__OperatorAssignment_3 ) ) ;
    public final void rule__EvolutionRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:526:1: ( ( ( rule__EvolutionRules__OperatorAssignment_3 ) ) )
            // InternalLifeDsl.g:527:1: ( ( rule__EvolutionRules__OperatorAssignment_3 ) )
            {
            // InternalLifeDsl.g:527:1: ( ( rule__EvolutionRules__OperatorAssignment_3 ) )
            // InternalLifeDsl.g:528:2: ( rule__EvolutionRules__OperatorAssignment_3 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getOperatorAssignment_3()); 
            // InternalLifeDsl.g:529:2: ( rule__EvolutionRules__OperatorAssignment_3 )
            // InternalLifeDsl.g:529:3: rule__EvolutionRules__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__4"
    // InternalLifeDsl.g:537:1: rule__EvolutionRules__Group__4 : rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5 ;
    public final void rule__EvolutionRules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:541:1: ( rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5 )
            // InternalLifeDsl.g:542:2: rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__EvolutionRules__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__4"


    // $ANTLR start "rule__EvolutionRules__Group__4__Impl"
    // InternalLifeDsl.g:549:1: rule__EvolutionRules__Group__4__Impl : ( 'NumberOfLiveNeighbors:' ) ;
    public final void rule__EvolutionRules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:553:1: ( ( 'NumberOfLiveNeighbors:' ) )
            // InternalLifeDsl.g:554:1: ( 'NumberOfLiveNeighbors:' )
            {
            // InternalLifeDsl.g:554:1: ( 'NumberOfLiveNeighbors:' )
            // InternalLifeDsl.g:555:2: 'NumberOfLiveNeighbors:'
            {
             before(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__4__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__5"
    // InternalLifeDsl.g:564:1: rule__EvolutionRules__Group__5 : rule__EvolutionRules__Group__5__Impl ;
    public final void rule__EvolutionRules__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:568:1: ( rule__EvolutionRules__Group__5__Impl )
            // InternalLifeDsl.g:569:2: rule__EvolutionRules__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__5"


    // $ANTLR start "rule__EvolutionRules__Group__5__Impl"
    // InternalLifeDsl.g:575:1: rule__EvolutionRules__Group__5__Impl : ( ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 ) ) ;
    public final void rule__EvolutionRules__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:579:1: ( ( ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 ) ) )
            // InternalLifeDsl.g:580:1: ( ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 ) )
            {
            // InternalLifeDsl.g:580:1: ( ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 ) )
            // InternalLifeDsl.g:581:2: ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsAssignment_5()); 
            // InternalLifeDsl.g:582:2: ( rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 )
            // InternalLifeDsl.g:582:3: rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__5__Impl"


    // $ANTLR start "rule__Model__GridAssignment_1"
    // InternalLifeDsl.g:591:1: rule__Model__GridAssignment_1 : ( ruleInitialGrid ) ;
    public final void rule__Model__GridAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:595:1: ( ( ruleInitialGrid ) )
            // InternalLifeDsl.g:596:2: ( ruleInitialGrid )
            {
            // InternalLifeDsl.g:596:2: ( ruleInitialGrid )
            // InternalLifeDsl.g:597:3: ruleInitialGrid
            {
             before(grammarAccess.getModelAccess().getGridInitialGridParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialGrid();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGridInitialGridParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GridAssignment_1"


    // $ANTLR start "rule__Model__RulesAssignment_3"
    // InternalLifeDsl.g:606:1: rule__Model__RulesAssignment_3 : ( ruleEvolutionRules ) ;
    public final void rule__Model__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:610:1: ( ( ruleEvolutionRules ) )
            // InternalLifeDsl.g:611:2: ( ruleEvolutionRules )
            {
            // InternalLifeDsl.g:611:2: ( ruleEvolutionRules )
            // InternalLifeDsl.g:612:3: ruleEvolutionRules
            {
             before(grammarAccess.getModelAccess().getRulesEvolutionRulesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvolutionRules();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesEvolutionRulesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_3"


    // $ANTLR start "rule__InitialGrid__CellsXAssignment_1"
    // InternalLifeDsl.g:621:1: rule__InitialGrid__CellsXAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InitialGrid__CellsXAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:625:1: ( ( RULE_STRING ) )
            // InternalLifeDsl.g:626:2: ( RULE_STRING )
            {
            // InternalLifeDsl.g:626:2: ( RULE_STRING )
            // InternalLifeDsl.g:627:3: RULE_STRING
            {
             before(grammarAccess.getInitialGridAccess().getCellsXSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getCellsXSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__CellsXAssignment_1"


    // $ANTLR start "rule__InitialGrid__CellsYAssignment_3"
    // InternalLifeDsl.g:636:1: rule__InitialGrid__CellsYAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InitialGrid__CellsYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:640:1: ( ( RULE_STRING ) )
            // InternalLifeDsl.g:641:2: ( RULE_STRING )
            {
            // InternalLifeDsl.g:641:2: ( RULE_STRING )
            // InternalLifeDsl.g:642:3: RULE_STRING
            {
             before(grammarAccess.getInitialGridAccess().getCellsYSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInitialGridAccess().getCellsYSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialGrid__CellsYAssignment_3"


    // $ANTLR start "rule__EvolutionRules__NameAssignment_1"
    // InternalLifeDsl.g:651:1: rule__EvolutionRules__NameAssignment_1 : ( ruleDieAliveUnit ) ;
    public final void rule__EvolutionRules__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:655:1: ( ( ruleDieAliveUnit ) )
            // InternalLifeDsl.g:656:2: ( ruleDieAliveUnit )
            {
            // InternalLifeDsl.g:656:2: ( ruleDieAliveUnit )
            // InternalLifeDsl.g:657:3: ruleDieAliveUnit
            {
             before(grammarAccess.getEvolutionRulesAccess().getNameDieAliveUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDieAliveUnit();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getNameDieAliveUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__NameAssignment_1"


    // $ANTLR start "rule__EvolutionRules__OperatorAssignment_3"
    // InternalLifeDsl.g:666:1: rule__EvolutionRules__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__EvolutionRules__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:670:1: ( ( ruleOperator ) )
            // InternalLifeDsl.g:671:2: ( ruleOperator )
            {
            // InternalLifeDsl.g:671:2: ( ruleOperator )
            // InternalLifeDsl.g:672:3: ruleOperator
            {
             before(grammarAccess.getEvolutionRulesAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getOperatorOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__OperatorAssignment_3"


    // $ANTLR start "rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5"
    // InternalLifeDsl.g:681:1: rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5 : ( RULE_INT ) ;
    public final void rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLifeDsl.g:685:1: ( ( RULE_INT ) )
            // InternalLifeDsl.g:686:2: ( RULE_INT )
            {
            // InternalLifeDsl.g:686:2: ( RULE_INT )
            // InternalLifeDsl.g:687:3: RULE_INT
            {
             before(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getNumberOfLiveNeighborsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__NumberOfLiveNeighborsAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}