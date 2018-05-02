// Generated from Lambda.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LPAREN=2, RPAREN=3, SEMI=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, 
		VAR=9, DEF=10, LAMBDA=11, DOT=12, EQUALS=13, COMMA=14, WS=15;
	public static final int
		RULE_lambdaStart = 0, RULE_atomicLambda = 1, RULE_applicationLambdas = 2, 
		RULE_definition = 3, RULE_lambda = 4, RULE_binding = 5, RULE_bindings = 6;
	public static final String[] ruleNames = {
		"lambdaStart", "atomicLambda", "applicationLambdas", "definition", "lambda", 
		"binding", "bindings"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", null, "'def'", 
		"'\\'", "'.'", "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "LPAREN", "RPAREN", "SEMI", "PLUS", "MINUS", "TIMES", 
		"DIV", "VAR", "DEF", "LAMBDA", "DOT", "EQUALS", "COMMA", "WS"
	};
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
	public String getGrammarFileName() { return "Lambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LambdaStartContext extends ParserRuleContext {
		public LambdaNode val;
		public LambdaContext l1;
		public TerminalNode SEMI() { return getToken(LambdaParser.SEMI, 0); }
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public LambdaStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterLambdaStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitLambdaStart(this);
		}
	}

	public final LambdaStartContext lambdaStart() throws RecognitionException {
		LambdaStartContext _localctx = new LambdaStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lambdaStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((LambdaStartContext)_localctx).l1 = lambda();
			setState(15);
			match(SEMI);
			 
			    ((LambdaStartContext)_localctx).val =  ((LambdaStartContext)_localctx).l1.val; 
			  
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

	public static class AtomicLambdaContext extends ParserRuleContext {
		public LambdaNode val;
		public Token n;
		public AtomicLambdaContext l1;
		public AtomicLambdaContext l2;
		public TerminalNode NUMBER() { return getToken(LambdaParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(LambdaParser.LPAREN, 0); }
		public TerminalNode PLUS() { return getToken(LambdaParser.PLUS, 0); }
		public TerminalNode RPAREN() { return getToken(LambdaParser.RPAREN, 0); }
		public List<AtomicLambdaContext> atomicLambda() {
			return getRuleContexts(AtomicLambdaContext.class);
		}
		public AtomicLambdaContext atomicLambda(int i) {
			return getRuleContext(AtomicLambdaContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(LambdaParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(LambdaParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(LambdaParser.DIV, 0); }
		public AtomicLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterAtomicLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitAtomicLambda(this);
		}
	}

	public final AtomicLambdaContext atomicLambda() throws RecognitionException {
		AtomicLambdaContext _localctx = new AtomicLambdaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atomicLambda);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((AtomicLambdaContext)_localctx).n = match(NUMBER);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("num");
				    n.setValue(Double.parseDouble((((AtomicLambdaContext)_localctx).n!=null?((AtomicLambdaContext)_localctx).n.getText():null)));
				    ((AtomicLambdaContext)_localctx).val =  n;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(LPAREN);
				setState(21);
				match(PLUS);
				setState(22);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(23);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(24);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("plus");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.val);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.val);
				    ((AtomicLambdaContext)_localctx).val =  n;
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(LPAREN);
				setState(28);
				match(MINUS);
				setState(29);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(30);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(31);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("minus");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.val);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.val);
				    ((AtomicLambdaContext)_localctx).val =  n;
				  
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(LPAREN);
				setState(35);
				match(TIMES);
				setState(36);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(37);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(38);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("multiply");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.val);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.val);
				    ((AtomicLambdaContext)_localctx).val =  n;
				  
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(LPAREN);
				setState(42);
				match(DIV);
				setState(43);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(44);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(45);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("divide");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.val);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.val);
				    ((AtomicLambdaContext)_localctx).val =  n;
				  
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

	public static class ApplicationLambdasContext extends ParserRuleContext {
		public AtomicLambdaContext atomicLambda() {
			return getRuleContext(AtomicLambdaContext.class,0);
		}
		public ApplicationLambdasContext applicationLambdas() {
			return getRuleContext(ApplicationLambdasContext.class,0);
		}
		public ApplicationLambdasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applicationLambdas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterApplicationLambdas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitApplicationLambdas(this);
		}
	}

	public final ApplicationLambdasContext applicationLambdas() throws RecognitionException {
		return applicationLambdas(0);
	}

	private ApplicationLambdasContext applicationLambdas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ApplicationLambdasContext _localctx = new ApplicationLambdasContext(_ctx, _parentState);
		ApplicationLambdasContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_applicationLambdas, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			atomicLambda();
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ApplicationLambdasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_applicationLambdas);
					setState(53);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(54);
					atomicLambda();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class DefinitionContext extends ParserRuleContext {
		public LambdaNode val;
		public TerminalNode LAMBDA() { return getToken(LambdaParser.LAMBDA, 0); }
		public TerminalNode VAR() { return getToken(LambdaParser.VAR, 0); }
		public TerminalNode DOT() { return getToken(LambdaParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(LambdaParser.LPAREN, 0); }
		public ApplicationLambdasContext applicationLambdas() {
			return getRuleContext(ApplicationLambdasContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LambdaParser.RPAREN, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LAMBDA);
			setState(61);
			match(VAR);
			setState(62);
			match(DOT);
			setState(63);
			match(LPAREN);
			setState(64);
			applicationLambdas(0);
			setState(65);
			match(RPAREN);


			  
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

	public static class LambdaContext extends ParserRuleContext {
		public LambdaNode val;
		public LambdaContext l1;
		public TerminalNode LAMBDA() { return getToken(LambdaParser.LAMBDA, 0); }
		public TerminalNode VAR() { return getToken(LambdaParser.VAR, 0); }
		public TerminalNode DOT() { return getToken(LambdaParser.DOT, 0); }
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ApplicationLambdasContext applicationLambdas() {
			return getRuleContext(ApplicationLambdasContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitLambda(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lambda);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAMBDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(LAMBDA);
				setState(69);
				match(VAR);
				setState(70);
				match(DOT);
				setState(71);
				((LambdaContext)_localctx).l1 = lambda();

				    ((LambdaContext)_localctx).val =  ((LambdaContext)_localctx).l1.val;
				  
				}
				break;
			case NUMBER:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				applicationLambdas(0);
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

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LambdaParser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(LambdaParser.EQUALS, 0); }
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(VAR);
			setState(78);
			match(EQUALS);
			setState(79);
			lambda();
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

	public static class BindingsContext extends ParserRuleContext {
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LambdaParser.COMMA, 0); }
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitBindings(this);
		}
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bindings);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				binding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				binding();
				setState(83);
				match(COMMA);
				setState(84);
				bindings();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return applicationLambdas_sempred((ApplicationLambdasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean applicationLambdas_sempred(ApplicationLambdasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3"+
		"\b\2\3\6\t\2\4\6\b\n\f\16\2\2\2Z\2\20\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2"+
		"\2\b>\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16X\3\2\2\2\20\21\5\n\6\2\21\22\7"+
		"\6\2\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\7\3\2\2\25\63\b\3\1\2\26\27\7"+
		"\4\2\2\27\30\7\7\2\2\30\31\5\4\3\2\31\32\5\4\3\2\32\33\7\5\2\2\33\34\b"+
		"\3\1\2\34\63\3\2\2\2\35\36\7\4\2\2\36\37\7\b\2\2\37 \5\4\3\2 !\5\4\3\2"+
		"!\"\7\5\2\2\"#\b\3\1\2#\63\3\2\2\2$%\7\4\2\2%&\7\t\2\2&\'\5\4\3\2\'(\5"+
		"\4\3\2()\7\5\2\2)*\b\3\1\2*\63\3\2\2\2+,\7\4\2\2,-\7\n\2\2-.\5\4\3\2."+
		"/\5\4\3\2/\60\7\5\2\2\60\61\b\3\1\2\61\63\3\2\2\2\62\24\3\2\2\2\62\26"+
		"\3\2\2\2\62\35\3\2\2\2\62$\3\2\2\2\62+\3\2\2\2\63\5\3\2\2\2\64\65\b\4"+
		"\1\2\65\66\5\4\3\2\66;\3\2\2\2\678\f\3\2\28:\5\4\3\29\67\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>?\7\r\2\2?@\7\13\2\2@A\7"+
		"\16\2\2AB\7\4\2\2BC\5\6\4\2CD\7\5\2\2DE\b\5\1\2E\t\3\2\2\2FG\7\r\2\2G"+
		"H\7\13\2\2HI\7\16\2\2IJ\5\n\6\2JK\b\6\1\2KN\3\2\2\2LN\5\6\4\2MF\3\2\2"+
		"\2ML\3\2\2\2N\13\3\2\2\2OP\7\13\2\2PQ\7\17\2\2QR\5\n\6\2R\r\3\2\2\2SY"+
		"\5\f\7\2TU\5\f\7\2UV\7\20\2\2VW\5\16\b\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2\2"+
		"Y\17\3\2\2\2\6\62;MX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}