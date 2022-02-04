// Generated from /home/Adiren/uni/LP/llull/antlrTesting/Llull/Llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LlullParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NUM=24, ID=25, 
		ANYTEXT=26, ELEV=27, PER=28, ENTRE=29, MENYS=30, MES=31, MOD=32, LINE_COMMENT=33, 
		WS=34, ANY=35;
	public static final int
		RULE_root = 0, RULE_stat = 1, RULE_expr = 2, RULE_condicional = 3, RULE_statblock = 4, 
		RULE_relational = 5, RULE_functioncall = 6, RULE_functiondef = 7, RULE_argumentsdef = 8, 
		RULE_wargs = 9, RULE_arguments = 10, RULE_loop = 11, RULE_anytext = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "stat", "expr", "condicional", "statblock", "relational", "functioncall", 
			"functiondef", "argumentsdef", "wargs", "arguments", "loop", "anytext"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'write'", "'('", "')'", "'read'", "'array'", "','", "'set'", 
			"'get'", "'if'", "'{'", "'}'", "'else'", "'<'", "'>'", "'<>'", "'=='", 
			"'<='", "'>='", "'void'", "'while'", "'for'", "';'", null, null, null, 
			"'^'", "'*'", "'/'", "'-'", "'+'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUM", "ID", "ANYTEXT", "ELEV", "PER", "ENTRE", "MENYS", "MES", "MOD", 
			"LINE_COMMENT", "WS", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LlullParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	 
		public RootContext() { }
		public void copyFrom(RootContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TreerootContext extends RootContext {
		public List<FunctiondefContext> functiondef() {
			return getRuleContexts(FunctiondefContext.class);
		}
		public FunctiondefContext functiondef(int i) {
			return getRuleContext(FunctiondefContext.class,i);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TreerootContext(RootContext ctx) { copyFrom(ctx); }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			_localctx = new TreerootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				functiondef();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(31);
				functioncall();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FdefContext extends StatContext {
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public FdefContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class BucleContext extends StatContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public BucleContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends StatContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class SetarrayvalueContext extends StatContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SetarrayvalueContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class NewarrayContext extends StatContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewarrayContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class RelatContext extends StatContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public RelatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatexprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatexprContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class CondContext extends StatContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CondContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class WriteContext extends StatContext {
		public WargsContext wargs() {
			return getRuleContext(WargsContext.class,0);
		}
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StatexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ID);
				setState(36);
				match(T__0);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(37);
					expr(0);
					}
					break;
				case 2:
					{
					setState(38);
					relational();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(T__1);
				setState(42);
				match(T__2);
				setState(43);
				wargs();
				setState(44);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__4);
				setState(47);
				match(T__2);
				setState(48);
				match(ID);
				setState(49);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new NewarrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__5);
				setState(51);
				match(T__2);
				setState(52);
				match(ID);
				setState(53);
				match(T__6);
				setState(54);
				expr(0);
				setState(55);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new SetarrayvalueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(T__2);
				setState(59);
				match(ID);
				setState(60);
				match(T__6);
				setState(61);
				expr(0);
				setState(62);
				match(T__6);
				setState(63);
				expr(0);
				setState(64);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new RelatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				relational();
				}
				break;
			case 8:
				_localctx = new BucleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				loop();
				}
				break;
			case 9:
				_localctx = new CondContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				condicional();
				}
				break;
			case 10:
				_localctx = new FdefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				functiondef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProducteContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PER() { return getToken(LlullParser.PER, 0); }
		public ProducteContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MES() { return getToken(LlullParser.MES, 0); }
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(LlullParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENTRE() { return getToken(LlullParser.ENTRE, 0); }
		public DivisioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncioContext extends ExprContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public FuncioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GetarrayvalueContext extends ExprContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetarrayvalueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PotenciaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELEV() { return getToken(LlullParser.ELEV, 0); }
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ValorContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LlullParser.NUM, 0); }
		public ValorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENYS() { return getToken(LlullParser.MENYS, 0); }
		public RestaContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ValorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new GetarrayvalueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__8);
				setState(75);
				match(T__2);
				setState(76);
				match(ID);
				setState(77);
				match(T__6);
				setState(78);
				expr(0);
				setState(79);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new FuncioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				functioncall();
				}
				break;
			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(86);
						match(ELEV);
						setState(87);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ProducteContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(89);
						match(PER);
						setState(90);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new DivisioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(92);
						match(ENTRE);
						setState(93);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new RestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						match(MENYS);
						setState(96);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new SumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						match(MES);
						setState(99);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						match(MOD);
						setState(102);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	 
		public CondicionalContext() { }
		public void copyFrom(CondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends CondicionalContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public List<StatblockContext> statblock() {
			return getRuleContexts(StatblockContext.class);
		}
		public StatblockContext statblock(int i) {
			return getRuleContext(StatblockContext.class,i);
		}
		public IfContext(CondicionalContext ctx) { copyFrom(ctx); }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__9);
			setState(109);
			match(T__2);
			setState(110);
			relational();
			setState(111);
			match(T__3);
			setState(112);
			match(T__10);
			setState(113);
			statblock();
			setState(114);
			match(T__11);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(115);
				match(T__12);
				setState(116);
				match(T__10);
				setState(117);
				statblock();
				setState(118);
				match(T__11);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatblockContext extends ParserRuleContext {
		public StatblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statblock; }
	 
		public StatblockContext() { }
		public void copyFrom(StatblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StblockContext extends StatblockContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StblockContext(StatblockContext ctx) { copyFrom(ctx); }
	}

	public final StatblockContext statblock() throws RecognitionException {
		StatblockContext _localctx = new StatblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statblock);
		int _la;
		try {
			_localctx = new StblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(122);
				stat();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalContext extends ParserRuleContext {
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	 
		public RelationalContext() { }
		public void copyFrom(RelationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LowerThanContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LowerThanContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class EqualContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class BiggerThanContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerThanContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class BiggerEqContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerEqContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class LowerEqContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LowerEqContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class DifferentContext extends RelationalContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DifferentContext(RelationalContext ctx) { copyFrom(ctx); }
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relational);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new LowerThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				expr(0);
				setState(129);
				match(T__13);
				setState(130);
				expr(0);
				}
				break;
			case 2:
				_localctx = new BiggerThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				expr(0);
				setState(133);
				match(T__14);
				setState(134);
				expr(0);
				}
				break;
			case 3:
				_localctx = new DifferentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				expr(0);
				setState(137);
				match(T__15);
				setState(138);
				expr(0);
				}
				break;
			case 4:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				expr(0);
				setState(141);
				match(T__16);
				setState(142);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LowerEqContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				expr(0);
				setState(145);
				match(T__17);
				setState(146);
				expr(0);
				}
				break;
			case 6:
				_localctx = new BiggerEqContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				expr(0);
				setState(149);
				match(T__18);
				setState(150);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	 
		public FunctioncallContext() { }
		public void copyFrom(FunctioncallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncallContext extends FunctioncallContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncallContext(FunctioncallContext ctx) { copyFrom(ctx); }
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functioncall);
		int _la;
		try {
			_localctx = new FuncallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(155);
			match(T__2);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(156);
				arguments();
				}
			}

			setState(159);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefContext extends ParserRuleContext {
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
	 
		public FunctiondefContext() { }
		public void copyFrom(FunctiondefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncdefContext extends FunctiondefContext {
		public TerminalNode ID() { return getToken(LlullParser.ID, 0); }
		public StatblockContext statblock() {
			return getRuleContext(StatblockContext.class,0);
		}
		public ArgumentsdefContext argumentsdef() {
			return getRuleContext(ArgumentsdefContext.class,0);
		}
		public FuncdefContext(FunctiondefContext ctx) { copyFrom(ctx); }
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functiondef);
		int _la;
		try {
			_localctx = new FuncdefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__19);
			setState(162);
			match(ID);
			setState(163);
			match(T__2);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(164);
				argumentsdef();
				}
			}

			setState(167);
			match(T__3);
			setState(168);
			match(T__10);
			setState(169);
			statblock();
			setState(170);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsdefContext extends ParserRuleContext {
		public ArgumentsdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsdef; }
	 
		public ArgumentsdefContext() { }
		public void copyFrom(ArgumentsdefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgdefContext extends ArgumentsdefContext {
		public List<TerminalNode> ID() { return getTokens(LlullParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LlullParser.ID, i);
		}
		public ArgdefContext(ArgumentsdefContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentsdefContext argumentsdef() throws RecognitionException {
		ArgumentsdefContext _localctx = new ArgumentsdefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentsdef);
		int _la;
		try {
			_localctx = new ArgdefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(173);
				match(T__6);
				setState(174);
				match(ID);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WargsContext extends ParserRuleContext {
		public WargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wargs; }
	 
		public WargsContext() { }
		public void copyFrom(WargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteargsContext extends WargsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public List<AnytextContext> anytext() {
			return getRuleContexts(AnytextContext.class);
		}
		public AnytextContext anytext(int i) {
			return getRuleContext(AnytextContext.class,i);
		}
		public WriteargsContext(WargsContext ctx) { copyFrom(ctx); }
	}

	public final WargsContext wargs() throws RecognitionException {
		WargsContext _localctx = new WargsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wargs);
		int _la;
		try {
			_localctx = new WriteargsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(180);
				expr(0);
				}
				break;
			case 2:
				{
				setState(181);
				relational();
				}
				break;
			case 3:
				{
				setState(182);
				anytext();
				}
				break;
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(185);
				match(T__6);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(186);
					expr(0);
					}
					break;
				case 2:
					{
					setState(187);
					relational();
					}
					break;
				case 3:
					{
					setState(188);
					anytext();
					}
					break;
				}
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgcallContext extends ArgumentsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgcallContext(ArgumentsContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			_localctx = new ArgcallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expr(0);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(197);
				match(T__6);
				setState(198);
				expr(0);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends LoopContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public StatblockContext statblock() {
			return getRuleContext(StatblockContext.class,0);
		}
		public ForContext(LoopContext ctx) { copyFrom(ctx); }
	}
	public static class WhileContext extends LoopContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public StatblockContext statblock() {
			return getRuleContext(StatblockContext.class,0);
		}
		public WhileContext(LoopContext ctx) { copyFrom(ctx); }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__20);
				setState(205);
				match(T__2);
				setState(206);
				relational();
				setState(207);
				match(T__3);
				setState(208);
				match(T__10);
				setState(209);
				statblock();
				setState(210);
				match(T__11);
				}
				break;
			case T__21:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__21);
				setState(213);
				match(T__2);
				setState(214);
				stat();
				setState(215);
				match(T__22);
				setState(216);
				relational();
				setState(217);
				match(T__22);
				setState(218);
				stat();
				setState(219);
				match(T__3);
				setState(220);
				match(T__10);
				setState(221);
				statblock();
				setState(222);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnytextContext extends ParserRuleContext {
		public AnytextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anytext; }
	 
		public AnytextContext() { }
		public void copyFrom(AnytextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextContext extends AnytextContext {
		public TerminalNode ANYTEXT() { return getToken(LlullParser.ANYTEXT, 0); }
		public TextContext(AnytextContext ctx) { copyFrom(ctx); }
	}

	public final AnytextContext anytext() throws RecognitionException {
		AnytextContext _localctx = new AnytextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_anytext);
		try {
			_localctx = new TextContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ANYTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\5\2#\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5{\n\5\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u009b\n\7\3\b\3\b\3\b\5\b\u00a0\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00a8"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n"+
		"\3\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\3\13\3\13\5\13\u00c0\n\13\7"+
		"\13\u00c2\n\13\f\13\16\13\u00c5\13\13\3\f\3\f\3\f\7\f\u00ca\n\f\f\f\16"+
		"\f\u00cd\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\3\16\2\3\6\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\2\2\u00ff\2\35\3\2\2\2\4H\3\2\2\2\6U\3\2\2"+
		"\2\bn\3\2\2\2\n\177\3\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u00a3"+
		"\3\2\2\2\22\u00ae\3\2\2\2\24\u00b9\3\2\2\2\26\u00c6\3\2\2\2\30\u00e2\3"+
		"\2\2\2\32\u00e4\3\2\2\2\34\36\5\20\t\2\35\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#\5\16\b\2\"!\3\2\2\2\"#\3\2\2\2#\3"+
		"\3\2\2\2$I\5\6\4\2%&\7\33\2\2&)\7\3\2\2\'*\5\6\4\2(*\5\f\7\2)\'\3\2\2"+
		"\2)(\3\2\2\2*I\3\2\2\2+,\7\4\2\2,-\7\5\2\2-.\5\24\13\2./\7\6\2\2/I\3\2"+
		"\2\2\60\61\7\7\2\2\61\62\7\5\2\2\62\63\7\33\2\2\63I\7\6\2\2\64\65\7\b"+
		"\2\2\65\66\7\5\2\2\66\67\7\33\2\2\678\7\t\2\289\5\6\4\29:\7\6\2\2:I\3"+
		"\2\2\2;<\7\n\2\2<=\7\5\2\2=>\7\33\2\2>?\7\t\2\2?@\5\6\4\2@A\7\t\2\2AB"+
		"\5\6\4\2BC\7\6\2\2CI\3\2\2\2DI\5\f\7\2EI\5\30\r\2FI\5\b\5\2GI\5\20\t\2"+
		"H$\3\2\2\2H%\3\2\2\2H+\3\2\2\2H\60\3\2\2\2H\64\3\2\2\2H;\3\2\2\2HD\3\2"+
		"\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JK\b\4\1\2KV\7\32\2\2LM\7"+
		"\13\2\2MN\7\5\2\2NO\7\33\2\2OP\7\t\2\2PQ\5\6\4\2QR\7\6\2\2RV\3\2\2\2S"+
		"V\5\16\b\2TV\7\33\2\2UJ\3\2\2\2UL\3\2\2\2US\3\2\2\2UT\3\2\2\2Vk\3\2\2"+
		"\2WX\f\f\2\2XY\7\35\2\2Yj\5\6\4\fZ[\f\13\2\2[\\\7\36\2\2\\j\5\6\4\f]^"+
		"\f\n\2\2^_\7\37\2\2_j\5\6\4\13`a\f\t\2\2ab\7 \2\2bj\5\6\4\ncd\f\b\2\2"+
		"de\7!\2\2ej\5\6\4\tfg\f\7\2\2gh\7\"\2\2hj\5\6\4\biW\3\2\2\2iZ\3\2\2\2"+
		"i]\3\2\2\2i`\3\2\2\2ic\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"l\7\3\2\2\2mk\3\2\2\2no\7\f\2\2op\7\5\2\2pq\5\f\7\2qr\7\6\2\2rs\7\r\2"+
		"\2st\5\n\6\2tz\7\16\2\2uv\7\17\2\2vw\7\r\2\2wx\5\n\6\2xy\7\16\2\2y{\3"+
		"\2\2\2zu\3\2\2\2z{\3\2\2\2{\t\3\2\2\2|~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\13\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\5\6\4\2\u0083\u0084\7\20\2\2\u0084\u0085\5\6\4\2\u0085\u009b\3"+
		"\2\2\2\u0086\u0087\5\6\4\2\u0087\u0088\7\21\2\2\u0088\u0089\5\6\4\2\u0089"+
		"\u009b\3\2\2\2\u008a\u008b\5\6\4\2\u008b\u008c\7\22\2\2\u008c\u008d\5"+
		"\6\4\2\u008d\u009b\3\2\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7\23\2\2\u0090"+
		"\u0091\5\6\4\2\u0091\u009b\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7\24"+
		"\2\2\u0094\u0095\5\6\4\2\u0095\u009b\3\2\2\2\u0096\u0097\5\6\4\2\u0097"+
		"\u0098\7\25\2\2\u0098\u0099\5\6\4\2\u0099\u009b\3\2\2\2\u009a\u0082\3"+
		"\2\2\2\u009a\u0086\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\7\33\2"+
		"\2\u009d\u009f\7\5\2\2\u009e\u00a0\5\26\f\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\17\3\2\2"+
		"\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a7\7\5\2\2\u00a6"+
		"\u00a8\5\22\n\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\5\n\6\2\u00ac"+
		"\u00ad\7\16\2\2\u00ad\21\3\2\2\2\u00ae\u00b3\7\33\2\2\u00af\u00b0\7\t"+
		"\2\2\u00b0\u00b2\7\33\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00ba\5\6\4\2\u00b7\u00ba\5\f\7\2\u00b8\u00ba\5\32\16\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00c3\3\2"+
		"\2\2\u00bb\u00bf\7\t\2\2\u00bc\u00c0\5\6\4\2\u00bd\u00c0\5\f\7\2\u00be"+
		"\u00c0\5\32\16\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3"+
		"\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c3\3\2\2"+
		"\2\u00c6\u00cb\5\6\4\2\u00c7\u00c8\7\t\2\2\u00c8\u00ca\5\6\4\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\27\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\7\5\2"+
		"\2\u00d0\u00d1\5\f\7\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4"+
		"\5\n\6\2\u00d4\u00d5\7\16\2\2\u00d5\u00e3\3\2\2\2\u00d6\u00d7\7\30\2\2"+
		"\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\31\2\2\u00da\u00db"+
		"\5\f\7\2\u00db\u00dc\7\31\2\2\u00dc\u00dd\5\4\3\2\u00dd\u00de\7\6\2\2"+
		"\u00de\u00df\7\r\2\2\u00df\u00e0\5\n\6\2\u00e0\u00e1\7\16\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00ce\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e3\31\3\2\2\2\u00e4"+
		"\u00e5\7\34\2\2\u00e5\33\3\2\2\2\24\37\")HUikz\177\u009a\u009f\u00a7\u00b3"+
		"\u00b9\u00bf\u00c3\u00cb\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}