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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BOOLEAN=14, IF=15, ELSE=16, PRINT=17, 
		WHILE=18, RETURN=19, OPERATOR=20, ID=21, INTEGER=22, DECIMAL=23, CHARACTER=24, 
		STRING=25, COMMENT=26, BLOCK_COMMENT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "BOOLEAN", "IF", "ELSE", "PRINT", 
			"WHILE", "RETURN", "OPERATOR", "ID", "INTEGER", "DECIMAL", "CHARACTER", 
			"STRING", "COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'int'", "'float'", "'char'", 
			"'string'", "'bool'", "'void'", "'{'", "'}'", null, "'if'", "'else'", 
			"'print'", "'while'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOLEAN", "IF", "ELSE", "PRINT", "WHILE", "RETURN", "OPERATOR", 
			"ID", "INTEGER", "DECIMAL", "CHARACTER", "STRING", "COMMENT", "BLOCK_COMMENT", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17s\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u009e\n\25\3\26\3\26\7\26\u00a2\n\26\f\26\16\26\u00a5"+
		"\13\26\3\27\6\27\u00a8\n\27\r\27\16\27\u00a9\3\30\6\30\u00ad\n\30\r\30"+
		"\16\30\u00ae\3\30\3\30\6\30\u00b3\n\30\r\30\16\30\u00b4\3\31\3\31\3\31"+
		"\3\31\5\31\u00bb\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00c3\n\32\f"+
		"\32\16\32\u00c6\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00ce\n\33\f"+
		"\33\16\33\u00d1\13\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00d9\n\34\f"+
		"\34\16\34\u00dc\13\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00e4\n\35\r"+
		"\35\16\35\u00e5\3\35\3\35\3\u00da\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36\3\2\n\7\2\'\',-//\61\61>@\5\2C\\aac|"+
		"\6\2\62;C\\aac|\3\2\62;\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u00fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13"+
		"C\3\2\2\2\rE\3\2\2\2\17I\3\2\2\2\21O\3\2\2\2\23T\3\2\2\2\25[\3\2\2\2\27"+
		"`\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!w\3\2\2\2#|"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0088\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2"+
		"-\u00a7\3\2\2\2/\u00ac\3\2\2\2\61\u00b6\3\2\2\2\63\u00be\3\2\2\2\65\u00c9"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00e3\3\2\2\2;<\7?\2\2<\4\3\2\2\2=>\7=\2\2"+
		">\6\3\2\2\2?@\7*\2\2@\b\3\2\2\2AB\7+\2\2B\n\3\2\2\2CD\7.\2\2D\f\3\2\2"+
		"\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\16\3\2\2\2IJ\7h\2\2JK\7n\2\2KL\7q\2\2L"+
		"M\7c\2\2MN\7v\2\2N\20\3\2\2\2OP\7e\2\2PQ\7j\2\2QR\7c\2\2RS\7t\2\2S\22"+
		"\3\2\2\2TU\7u\2\2UV\7v\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7i\2\2Z\24\3\2"+
		"\2\2[\\\7d\2\2\\]\7q\2\2]^\7q\2\2^_\7n\2\2_\26\3\2\2\2`a\7x\2\2ab\7q\2"+
		"\2bc\7k\2\2cd\7f\2\2d\30\3\2\2\2ef\7}\2\2f\32\3\2\2\2gh\7\177\2\2h\34"+
		"\3\2\2\2ij\7v\2\2jk\7t\2\2kl\7w\2\2ls\7g\2\2mn\7h\2\2no\7c\2\2op\7n\2"+
		"\2pq\7u\2\2qs\7g\2\2ri\3\2\2\2rm\3\2\2\2s\36\3\2\2\2tu\7k\2\2uv\7h\2\2"+
		"v \3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{\"\3\2\2\2|}\7r\2\2}~\7"+
		"t\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081$\3\2\2\2\u0082"+
		"\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085\7k\2\2\u0085\u0086\7n\2\2"+
		"\u0086\u0087\7g\2\2\u0087&\3\2\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2"+
		"\2\u008a\u008b\7v\2\2\u008b\u008c\7w\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7p\2\2\u008e(\3\2\2\2\u008f\u0090\7?\2\2\u0090\u009e\7?\2\2\u0091\u0092"+
		"\7#\2\2\u0092\u009e\7?\2\2\u0093\u0094\7>\2\2\u0094\u009e\7?\2\2\u0095"+
		"\u0096\7@\2\2\u0096\u009e\7?\2\2\u0097\u009e\t\2\2\2\u0098\u0099\7(\2"+
		"\2\u0099\u009e\7(\2\2\u009a\u009b\7~\2\2\u009b\u009e\7~\2\2\u009c\u009e"+
		"\7#\2\2\u009d\u008f\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0093\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009a\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e*\3\2\2\2\u009f\u00a3\t\3\2\2\u00a0\u00a2"+
		"\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4,\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\t\5\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa.\3\2\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00b3\t\5\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\60\3\2\2"+
		"\2\u00b6\u00ba\7)\2\2\u00b7\u00bb\n\6\2\2\u00b8\u00b9\7^\2\2\u00b9\u00bb"+
		"\13\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\7)\2\2\u00bd\62\3\2\2\2\u00be\u00c4\7$\2\2\u00bf\u00c3\n"+
		"\7\2\2\u00c0\u00c1\7^\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8"+
		"\64\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cf\3\2"+
		"\2\2\u00cc\u00ce\n\b\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d3\b\33\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7,\2\2\u00de\u00df\7\61"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\34\2\2\u00e18\3\2\2\2\u00e2\u00e4"+
		"\t\t\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\35\2\2\u00e8:\3\2\2\2"+
		"\17\2r\u009d\u00a3\u00a9\u00ae\u00b4\u00ba\u00c2\u00c4\u00cf\u00da\u00e5"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}