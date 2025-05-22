// Generated from d:/Users/Usuario/Desktop/Facultad/5to/1er Cuatrimestre/Tecnicas de Compilacion/TrabajoFinalTC/demo/src/main/antlr4/com/compilador/MiniLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\f\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t\u0004"+
		"\u0001\u0005\u0004\u0005c\b\u0005\u000b\u0005\f\u0005d\u0001\u0006\u0004"+
		"\u0006h\b\u0006\u000b\u0006\f\u0006i\u0001\u0006\u0001\u0006\u0004\u0006"+
		"n\b\u0006\u000b\u0006\f\u0006o\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007v\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b~\b\b\n\b\f\b\u0081\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0094\b\n\n\n\f\n\u0097\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u009f\b\u000b"+
		"\u000b\u000b\f\u000b\u00a0\u0001\u000b\u0001\u000b\u0001\u0095\u0000\f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\n\u0005"+
		"\u0000%%*+--//==\u0002\u0000<<>>\u0006\u0000(),,..;;{{}}\u0003\u0000A"+
		"Z__az\u0004\u000009AZ__az\u0001\u000009\u0004\u0000\n\n\r\r\'\'\\\\\u0004"+
		"\u0000\n\n\r\r\"\"\\\\\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00bc"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\"\u0001"+
		"\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005V\u0001\u0000\u0000"+
		"\u0000\u0007X\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b"+
		"b\u0001\u0000\u0000\u0000\rg\u0001\u0000\u0000\u0000\u000fq\u0001\u0000"+
		"\u0000\u0000\u0011y\u0001\u0000\u0000\u0000\u0013\u0084\u0001\u0000\u0000"+
		"\u0000\u0015\u008f\u0001\u0000\u0000\u0000\u0017\u009e\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005t\u0000\u0000\u001a\u001b\u0005r\u0000\u0000\u001b"+
		"\u001c\u0005u\u0000\u0000\u001c#\u0005e\u0000\u0000\u001d\u001e\u0005"+
		"f\u0000\u0000\u001e\u001f\u0005a\u0000\u0000\u001f \u0005l\u0000\u0000"+
		" !\u0005s\u0000\u0000!#\u0005e\u0000\u0000\"\u0019\u0001\u0000\u0000\u0000"+
		"\"\u001d\u0001\u0000\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005"+
		"v\u0000\u0000%&\u0005a\u0000\u0000&F\u0005r\u0000\u0000\'(\u0005i\u0000"+
		"\u0000(F\u0005f\u0000\u0000)*\u0005e\u0000\u0000*+\u0005l\u0000\u0000"+
		"+,\u0005s\u0000\u0000,F\u0005e\u0000\u0000-.\u0005p\u0000\u0000./\u0005"+
		"r\u0000\u0000/0\u0005i\u0000\u000001\u0005n\u0000\u00001F\u0005t\u0000"+
		"\u000023\u0005w\u0000\u000034\u0005h\u0000\u000045\u0005i\u0000\u0000"+
		"56\u0005l\u0000\u00006F\u0005e\u0000\u000078\u0005f\u0000\u000089\u0005"+
		"u\u0000\u00009:\u0005n\u0000\u0000:;\u0005c\u0000\u0000;<\u0005t\u0000"+
		"\u0000<=\u0005i\u0000\u0000=>\u0005o\u0000\u0000>F\u0005n\u0000\u0000"+
		"?@\u0005r\u0000\u0000@A\u0005e\u0000\u0000AB\u0005t\u0000\u0000BC\u0005"+
		"u\u0000\u0000CD\u0005r\u0000\u0000DF\u0005n\u0000\u0000E$\u0001\u0000"+
		"\u0000\u0000E\'\u0001\u0000\u0000\u0000E)\u0001\u0000\u0000\u0000E-\u0001"+
		"\u0000\u0000\u0000E2\u0001\u0000\u0000\u0000E7\u0001\u0000\u0000\u0000"+
		"E?\u0001\u0000\u0000\u0000F\u0004\u0001\u0000\u0000\u0000GW\u0007\u0000"+
		"\u0000\u0000HI\u0005=\u0000\u0000IW\u0005=\u0000\u0000JK\u0005!\u0000"+
		"\u0000KW\u0005=\u0000\u0000LW\u0007\u0001\u0000\u0000MN\u0005<\u0000\u0000"+
		"NW\u0005=\u0000\u0000OP\u0005>\u0000\u0000PW\u0005=\u0000\u0000QR\u0005"+
		"&\u0000\u0000RW\u0005&\u0000\u0000ST\u0005|\u0000\u0000TW\u0005|\u0000"+
		"\u0000UW\u0005!\u0000\u0000VG\u0001\u0000\u0000\u0000VH\u0001\u0000\u0000"+
		"\u0000VJ\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000\u0000VM\u0001\u0000"+
		"\u0000\u0000VO\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0006\u0001\u0000\u0000"+
		"\u0000XY\u0007\u0002\u0000\u0000Y\b\u0001\u0000\u0000\u0000Z^\u0007\u0003"+
		"\u0000\u0000[]\u0007\u0004\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\n\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0007\u0005\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\f\u0001\u0000\u0000\u0000fh\u0007"+
		"\u0005\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0005.\u0000\u0000ln\u0007\u0005\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000p\u000e\u0001\u0000\u0000\u0000qu\u0005\'\u0000\u0000rv\b"+
		"\u0006\u0000\u0000st\u0005\\\u0000\u0000tv\t\u0000\u0000\u0000ur\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0005\'\u0000\u0000x\u0010\u0001\u0000\u0000\u0000y\u007f\u0005\"\u0000"+
		"\u0000z~\b\u0007\u0000\u0000{|\u0005\\\u0000\u0000|~\t\u0000\u0000\u0000"+
		"}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\"\u0000\u0000\u0083\u0012\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005/\u0000\u0000\u0085\u0086\u0005/\u0000\u0000\u0086\u008a"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\b\b\u0000\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0006"+
		"\t\u0000\u0000\u008e\u0014\u0001\u0000\u0000\u0000\u008f\u0090\u0005/"+
		"\u0000\u0000\u0090\u0091\u0005*\u0000\u0000\u0091\u0095\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\t\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099"+
		"\u009a\u0005/\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0006\n\u0000\u0000\u009c\u0016\u0001\u0000\u0000\u0000\u009d\u009f\u0007"+
		"\t\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u000b"+
		"\u0000\u0000\u00a3\u0018\u0001\u0000\u0000\u0000\u000e\u0000\"EV^diou"+
		"}\u007f\u008a\u0095\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}