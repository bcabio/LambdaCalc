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
public class LambdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LPAREN=2, RPAREN=3, SEMI=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, 
		VAR=9, DEF=10, LAMBDA=11, DOT=12, EQUALS=13, COMMA=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VALID_ID_START", "VALID_ID_CHAR", "D", "E", "F", "NUMBER", "LPAREN", 
		"RPAREN", "SEMI", "PLUS", "MINUS", "TIMES", "DIV", "VAR", "DEF", "LAMBDA", 
		"DOT", "EQUALS", "COMMA", "WS"
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


	public LambdaLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2-\n\2\3\3\3\3\5\3\61\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\6\7:\n\7\r\7\16\7;\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\\\n\25\r\25\16\25]\3\25"+
		"\3\25\2\2\26\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33"+
		"\n\35\13\37\f!\r#\16%\17\'\20)\21\3\2\4\5\2C\\aac|\5\2\13\f\17\17\"\""+
		"\2^\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3,\3\2\2\2\5\60\3\2"+
		"\2\2\7\62\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r9\3\2\2\2\17=\3\2\2\2\21"+
		"?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2"+
		"\35K\3\2\2\2\37N\3\2\2\2!R\3\2\2\2#T\3\2\2\2%V\3\2\2\2\'X\3\2\2\2)[\3"+
		"\2\2\2+-\t\2\2\2,+\3\2\2\2-\4\3\2\2\2.\61\5\3\2\2/\61\4\62;\2\60.\3\2"+
		"\2\2\60/\3\2\2\2\61\6\3\2\2\2\62\63\7f\2\2\63\b\3\2\2\2\64\65\7g\2\2\65"+
		"\n\3\2\2\2\66\67\7h\2\2\67\f\3\2\2\28:\4\62;\298\3\2\2\2:;\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<\16\3\2\2\2=>\7*\2\2>\20\3\2\2\2?@\7+\2\2@\22\3\2\2\2"+
		"AB\7=\2\2B\24\3\2\2\2CD\7-\2\2D\26\3\2\2\2EF\7/\2\2F\30\3\2\2\2GH\7,\2"+
		"\2H\32\3\2\2\2IJ\7\61\2\2J\34\3\2\2\2KL\5\3\2\2LM\5\5\3\2M\36\3\2\2\2"+
		"NO\7f\2\2OP\7g\2\2PQ\7h\2\2Q \3\2\2\2RS\7^\2\2S\"\3\2\2\2TU\7\60\2\2U"+
		"$\3\2\2\2VW\7?\2\2W&\3\2\2\2XY\7.\2\2Y(\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\"+
		"]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\25\2\2`*\3\2\2\2\7\2,\60;"+
		"]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}