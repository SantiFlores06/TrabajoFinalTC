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
		ID=1, INTEGER=2, STRING=3, BOOLEAN=4, KEYWORD=5, OPERATOR=6, SEPARATOR=7, 
		WS=8, COMMENT=9, BLOCK_COMMENT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", 
			"WS", "COMMENT", "BLOCK_COMMENT"
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
			null, "ID", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", 
			"WS", "COMMENT", "BLOCK_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u008e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3"+
		"\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0085\n"+
		"\13\f\13\16\13\u0088\13\13\3\13\3\13\3\13\3\13\3\13\3\u0086\2\f\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\13\4\2C\\c|\6\2\62;C\\aa"+
		"c|\3\2\62;\5\2\f\f\17\17$$\7\2\'\',-//\61\61??\4\2>>@@\b\2*+..\60\60="+
		"=}}\177\177\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\37\3\2\2\2\7#\3\2"+
		"\2\2\t\66\3\2\2\2\13Y\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21o\3\2\2\2\23u\3"+
		"\2\2\2\25\u0080\3\2\2\2\27\33\t\2\2\2\30\32\t\3\2\2\31\30\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\4\3\2\2\2\35\33\3\2\2\2\36 \t"+
		"\4\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\6\3\2\2\2#(\7"+
		"$\2\2$\'\n\5\2\2%\'\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7$\2\2,\b\3\2\2\2-.\7v\2\2./\7t\2\2/\60"+
		"\7w\2\2\60\67\7g\2\2\61\62\7h\2\2\62\63\7c\2\2\63\64\7n\2\2\64\65\7u\2"+
		"\2\65\67\7g\2\2\66-\3\2\2\2\66\61\3\2\2\2\67\n\3\2\2\289\7x\2\29:\7c\2"+
		"\2:Z\7t\2\2;<\7k\2\2<Z\7h\2\2=>\7g\2\2>?\7n\2\2?@\7u\2\2@Z\7g\2\2AB\7"+
		"r\2\2BC\7t\2\2CD\7k\2\2DE\7p\2\2EZ\7v\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2I"+
		"J\7n\2\2JZ\7g\2\2KL\7h\2\2LM\7w\2\2MN\7p\2\2NO\7e\2\2OP\7v\2\2PQ\7k\2"+
		"\2QR\7q\2\2RZ\7p\2\2ST\7t\2\2TU\7g\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XZ\7"+
		"p\2\2Y8\3\2\2\2Y;\3\2\2\2Y=\3\2\2\2YA\3\2\2\2YF\3\2\2\2YK\3\2\2\2YS\3"+
		"\2\2\2Z\f\3\2\2\2[k\t\6\2\2\\]\7?\2\2]k\7?\2\2^_\7#\2\2_k\7?\2\2`k\t\7"+
		"\2\2ab\7>\2\2bk\7?\2\2cd\7@\2\2dk\7?\2\2ef\7(\2\2fk\7(\2\2gh\7~\2\2hk"+
		"\7~\2\2ik\7#\2\2j[\3\2\2\2j\\\3\2\2\2j^\3\2\2\2j`\3\2\2\2ja\3\2\2\2jc"+
		"\3\2\2\2je\3\2\2\2jg\3\2\2\2ji\3\2\2\2k\16\3\2\2\2lm\t\b\2\2m\20\3\2\2"+
		"\2np\t\t\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\t\2"+
		"\2t\22\3\2\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\n\n\2\2yx\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\n\2\2\177\24\3\2"+
		"\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\13"+
		"\2\2\u008d\26\3\2\2\2\r\2\33!&(\66Yjq{\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}