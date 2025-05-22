// Generated from com\compilador\MiniLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, KEYWORD=2, OPERATOR=3, SEPARATOR=4, ID=5, INTEGER=6, DECIMAL=7, 
		CHARACTER=8, STRING=9, COMMENT=10, BLOCK_COMMENT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", "ID", "INTEGER", "DECIMAL", 
			"CHARACTER", "STRING", "COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", "ID", "INTEGER", 
			"DECIMAL", "CHARACTER", "STRING", "COMMENT", "BLOCK_COMMENT", "WS"
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


	public MiniLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLenguaje.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n"+
		"\4\3\5\3\5\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\7\6\7e\n\7\r\7\16\7f\3\b"+
		"\6\bj\n\b\r\b\16\bk\3\b\3\b\6\bp\n\b\r\b\16\bq\3\t\3\t\3\t\3\t\5\tx\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\6\r\u00a1\n\r\r\r\16\r\u00a2\3\r\3\r\3\u0097\2\16\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\f\7\2\'\',-//\61\61??\4\2>"+
		">@@\b\2*+..\60\60==}}\177\177\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\6\2\f"+
		"\f\17\17))^^\6\2\f\f\17\17$$^^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00be"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3$\3\2\2\2\5G\3\2\2\2\7X\3\2\2\2\tZ\3\2\2\2\13\\\3\2\2\2"+
		"\rd\3\2\2\2\17i\3\2\2\2\21s\3\2\2\2\23{\3\2\2\2\25\u0086\3\2\2\2\27\u0091"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\34\7v\2\2\34\35\7t\2\2\35\36\7w\2\2\36%\7"+
		"g\2\2\37 \7h\2\2 !\7c\2\2!\"\7n\2\2\"#\7u\2\2#%\7g\2\2$\33\3\2\2\2$\37"+
		"\3\2\2\2%\4\3\2\2\2&\'\7x\2\2\'(\7c\2\2(H\7t\2\2)*\7k\2\2*H\7h\2\2+,\7"+
		"g\2\2,-\7n\2\2-.\7u\2\2.H\7g\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7k\2\2"+
		"\62\63\7p\2\2\63H\7v\2\2\64\65\7y\2\2\65\66\7j\2\2\66\67\7k\2\2\678\7"+
		"n\2\28H\7g\2\29:\7h\2\2:;\7w\2\2;<\7p\2\2<=\7e\2\2=>\7v\2\2>?\7k\2\2?"+
		"@\7q\2\2@H\7p\2\2AB\7t\2\2BC\7g\2\2CD\7v\2\2DE\7w\2\2EF\7t\2\2FH\7p\2"+
		"\2G&\3\2\2\2G)\3\2\2\2G+\3\2\2\2G/\3\2\2\2G\64\3\2\2\2G9\3\2\2\2GA\3\2"+
		"\2\2H\6\3\2\2\2IY\t\2\2\2JK\7?\2\2KY\7?\2\2LM\7#\2\2MY\7?\2\2NY\t\3\2"+
		"\2OP\7>\2\2PY\7?\2\2QR\7@\2\2RY\7?\2\2ST\7(\2\2TY\7(\2\2UV\7~\2\2VY\7"+
		"~\2\2WY\7#\2\2XI\3\2\2\2XJ\3\2\2\2XL\3\2\2\2XN\3\2\2\2XO\3\2\2\2XQ\3\2"+
		"\2\2XS\3\2\2\2XU\3\2\2\2XW\3\2\2\2Y\b\3\2\2\2Z[\t\4\2\2[\n\3\2\2\2\\`"+
		"\t\5\2\2]_\t\6\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\f\3\2\2\2"+
		"b`\3\2\2\2ce\t\7\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\16\3\2\2"+
		"\2hj\t\7\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\60"+
		"\2\2np\t\7\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\20\3\2\2\2sw\7"+
		")\2\2tx\n\b\2\2uv\7^\2\2vx\13\2\2\2wt\3\2\2\2wu\3\2\2\2xy\3\2\2\2yz\7"+
		")\2\2z\22\3\2\2\2{\u0081\7$\2\2|\u0080\n\t\2\2}~\7^\2\2~\u0080\13\2\2"+
		"\2\177|\3\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7$"+
		"\2\2\u0085\24\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\u008c\3\2\2\2\u0089\u008b\n\n\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\b\13\2\2\u0090\26\3\2\2\2\u0091\u0092\7\61"+
		"\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\f\2\2\u009e\30\3\2\2"+
		"\2\u009f\u00a1\t\13\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\r"+
		"\2\2\u00a5\32\3\2\2\2\20\2$GX`fkqw\177\u0081\u008c\u0097\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}