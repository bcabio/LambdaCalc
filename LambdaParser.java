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
		NUMBER=1, LBRACE=2, RBRACE=3, LPAREN=4, RPAREN=5, SEMI=6, PLUS=7, MINUS=8, 
		TIMES=9, DIV=10, IF=11, WS=12;
	public static final int
		RULE_lambdaStart = 0, RULE_atomicLambda = 1;
	public static final String[] ruleNames = {
		"lambdaStart", "atomicLambda"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "PLUS", 
		"MINUS", "TIMES", "DIV", "IF", "WS"
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
		public LambdaNode value;
		public AtomicLambdaContext l1;
		public TerminalNode SEMI() { return getToken(LambdaParser.SEMI, 0); }
		public AtomicLambdaContext atomicLambda() {
			return getRuleContext(AtomicLambdaContext.class,0);
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
			setState(4);
			((LambdaStartContext)_localctx).l1 = atomicLambda();
			setState(5);
			match(SEMI);
			 ((LambdaStartContext)_localctx).value =  ((LambdaStartContext)_localctx).l1.value; 
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
		public LambdaNode value;
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				((AtomicLambdaContext)_localctx).n = match(NUMBER);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("num");
				    n.setValue(Double.parseDouble((((AtomicLambdaContext)_localctx).n!=null?((AtomicLambdaContext)_localctx).n.getText():null)));
				    ((AtomicLambdaContext)_localctx).value =  n;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(LPAREN);
				setState(11);
				match(PLUS);
				setState(12);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(13);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(14);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("plus");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.value);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.value);
				    ((AtomicLambdaContext)_localctx).value =  n;
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(LPAREN);
				setState(18);
				match(MINUS);
				setState(19);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(20);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(21);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("minus");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.value);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.value);
				    ((AtomicLambdaContext)_localctx).value =  n;
				  
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(LPAREN);
				setState(25);
				match(TIMES);
				setState(26);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(27);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(28);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("multiply");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.value);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.value);
				    ((AtomicLambdaContext)_localctx).value =  n;
				  
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				match(LPAREN);
				setState(32);
				match(DIV);
				setState(33);
				((AtomicLambdaContext)_localctx).l1 = atomicLambda();
				setState(34);
				((AtomicLambdaContext)_localctx).l2 = atomicLambda();
				setState(35);
				match(RPAREN);
				 LambdaNode n = new LambdaNode();
				    n.setNodeType("divide");
				    n.setChild1(((AtomicLambdaContext)_localctx).l1.value);
				    n.setChild2(((AtomicLambdaContext)_localctx).l2.value);
				    ((AtomicLambdaContext)_localctx).value =  n;
				  
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16+\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3)\n\3\3\3\2\2\4\2\4\2\2\2,\2\6\3\2\2\2\4(\3\2\2\2\6\7\5\4\3\2\7\b\7"+
		"\b\2\2\b\t\b\2\1\2\t\3\3\2\2\2\n\13\7\3\2\2\13)\b\3\1\2\f\r\7\6\2\2\r"+
		"\16\7\t\2\2\16\17\5\4\3\2\17\20\5\4\3\2\20\21\7\7\2\2\21\22\b\3\1\2\22"+
		")\3\2\2\2\23\24\7\6\2\2\24\25\7\n\2\2\25\26\5\4\3\2\26\27\5\4\3\2\27\30"+
		"\7\7\2\2\30\31\b\3\1\2\31)\3\2\2\2\32\33\7\6\2\2\33\34\7\13\2\2\34\35"+
		"\5\4\3\2\35\36\5\4\3\2\36\37\7\7\2\2\37 \b\3\1\2 )\3\2\2\2!\"\7\6\2\2"+
		"\"#\7\f\2\2#$\5\4\3\2$%\5\4\3\2%&\7\7\2\2&\'\b\3\1\2\')\3\2\2\2(\n\3\2"+
		"\2\2(\f\3\2\2\2(\23\3\2\2\2(\32\3\2\2\2(!\3\2\2\2)\5\3\2\2\2\3(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}