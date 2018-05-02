// Generated from Lambda.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lambdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LBRACE=2, RBRACE=3, SEMI=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, 
		IF=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"I", "F", "NUMBER", "LBRACE", "RBRACE", "SEMI", "PLUS", "MINUS", "TIMES", 
		"DIV", "IF", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "LBRACE", "RBRACE", "SEMI", "PLUS", "MINUS", "TIMES", 
		"DIV", "IF", "WS"
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


	public lambdaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f<\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\6\4!\n\4\r\4\16\4\"\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\6\r\67"+
		"\n\r\r\r\16\r8\3\r\3\r\2\2\16\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t"+
		"\25\n\27\13\31\f\3\2\5\4\2KKkk\4\2HHhh\5\2\13\f\17\17\"\"\2;\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2"+
		"\2\2\7 \3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r(\3\2\2\2\17*\3\2\2\2\21,\3\2"+
		"\2\2\23.\3\2\2\2\25\60\3\2\2\2\27\62\3\2\2\2\31\66\3\2\2\2\33\34\t\2\2"+
		"\2\34\4\3\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37!\4\62;\2 \37\3\2\2\2!\""+
		"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\b\3\2\2\2$%\7}\2\2%\n\3\2\2\2&\'\7\177"+
		"\2\2\'\f\3\2\2\2()\7=\2\2)\16\3\2\2\2*+\7-\2\2+\20\3\2\2\2,-\7/\2\2-\22"+
		"\3\2\2\2./\7,\2\2/\24\3\2\2\2\60\61\7\61\2\2\61\26\3\2\2\2\62\63\5\3\2"+
		"\2\63\64\5\5\3\2\64\30\3\2\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\r\2\2;\32\3\2\2\2\5\2\"8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}