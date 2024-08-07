// Generated from e:/Users/juani/Desktop/tp2/src/main/java/tp2/compilador.g4 by ANTLR 4.13.1

package tp2;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LLA=4, LLC=5, PYC=6, IGUAL=7, COMA=8, PUNTO=9, EQUAL=10, 
		MAY=11, MAYEQUAL=12, MEN=13, MENEQUAL=14, NOTEQUAL=15, Y=16, O=17, SUMA=18, 
		RESTA=19, MULT=20, DIV=21, MOD=22, INT=23, DOUBLE=24, BOOLE=25, VOID=26, 
		TRUE=27, FALSE=28, IWHILE=29, IIF=30, IELSE=31, IFOR=32, IRETURN=33, NUMERO=34, 
		ID=35, FLOTANTE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "COMA", 
			"PUNTO", "EQUAL", "MAY", "MAYEQUAL", "MEN", "MENEQUAL", "NOTEQUAL", "Y", 
			"O", "SUMA", "RESTA", "MULT", "DIV", "MOD", "INT", "DOUBLE", "BOOLE", 
			"VOID", "TRUE", "FALSE", "IWHILE", "IIF", "IELSE", "IFOR", "IRETURN", 
			"NUMERO", "ID", "FLOTANTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'.'", "'=='", 
			"'>'", "'>='", "'<'", "'<='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'double'", "'bool'", "'void'", "'true'", "'false'", 
			"'while'", "'if'", "'else'", "'for'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "COMA", "PUNTO", 
			"EQUAL", "MAY", "MAYEQUAL", "MEN", "MENEQUAL", "NOTEQUAL", "Y", "O", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "INT", "DOUBLE", "BOOLE", "VOID", 
			"TRUE", "FALSE", "IWHILE", "IIF", "IELSE", "IFOR", "IRETURN", "NUMERO", 
			"ID", "FLOTANTE"
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


	public compiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

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
		"\u0004\u0000$\u00e2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0004#\u00c1\b#\u000b#\f#\u00c2\u0001#\u0004#\u00c6"+
		"\b#\u000b#\f#\u00c7\u0003#\u00ca\b#\u0001$\u0001$\u0003$\u00ce\b$\u0001"+
		"$\u0001$\u0001$\u0005$\u00d3\b$\n$\f$\u00d6\t$\u0001%\u0004%\u00d9\b%"+
		"\u000b%\f%\u00da\u0001%\u0001%\u0004%\u00df\b%\u000b%\f%\u00e0\u0000\u0000"+
		"&\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004"+
		"\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015"+
		"/\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001f"+
		"C E!G\"I#K$\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00e8\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0001M\u0001\u0000\u0000\u0000\u0003"+
		"O\u0001\u0000\u0000\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007U\u0001"+
		"\u0000\u0000\u0000\tW\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000"+
		"\u0000\r[\u0001\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000\u0011"+
		"_\u0001\u0000\u0000\u0000\u0013a\u0001\u0000\u0000\u0000\u0015c\u0001"+
		"\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000"+
		"\u0000\u001bj\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001f"+
		"o\u0001\u0000\u0000\u0000!r\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000"+
		"\u0000%x\u0001\u0000\u0000\u0000\'{\u0001\u0000\u0000\u0000)}\u0001\u0000"+
		"\u0000\u0000+\u007f\u0001\u0000\u0000\u0000-\u0081\u0001\u0000\u0000\u0000"+
		"/\u0083\u0001\u0000\u0000\u00001\u0085\u0001\u0000\u0000\u00003\u0089"+
		"\u0001\u0000\u0000\u00005\u0090\u0001\u0000\u0000\u00007\u0095\u0001\u0000"+
		"\u0000\u00009\u009a\u0001\u0000\u0000\u0000;\u009f\u0001\u0000\u0000\u0000"+
		"=\u00a5\u0001\u0000\u0000\u0000?\u00ab\u0001\u0000\u0000\u0000A\u00ae"+
		"\u0001\u0000\u0000\u0000C\u00b3\u0001\u0000\u0000\u0000E\u00b7\u0001\u0000"+
		"\u0000\u0000G\u00c9\u0001\u0000\u0000\u0000I\u00cd\u0001\u0000\u0000\u0000"+
		"K\u00d8\u0001\u0000\u0000\u0000MN\u0007\u0000\u0000\u0000N\u0002\u0001"+
		"\u0000\u0000\u0000OP\u0007\u0001\u0000\u0000P\u0004\u0001\u0000\u0000"+
		"\u0000QR\u0007\u0002\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006\u0002"+
		"\u0000\u0000T\u0006\u0001\u0000\u0000\u0000UV\u0005(\u0000\u0000V\b\u0001"+
		"\u0000\u0000\u0000WX\u0005)\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005"+
		"{\u0000\u0000Z\f\u0001\u0000\u0000\u0000[\\\u0005}\u0000\u0000\\\u000e"+
		"\u0001\u0000\u0000\u0000]^\u0005;\u0000\u0000^\u0010\u0001\u0000\u0000"+
		"\u0000_`\u0005=\u0000\u0000`\u0012\u0001\u0000\u0000\u0000ab\u0005,\u0000"+
		"\u0000b\u0014\u0001\u0000\u0000\u0000cd\u0005.\u0000\u0000d\u0016\u0001"+
		"\u0000\u0000\u0000ef\u0005=\u0000\u0000fg\u0005=\u0000\u0000g\u0018\u0001"+
		"\u0000\u0000\u0000hi\u0005>\u0000\u0000i\u001a\u0001\u0000\u0000\u0000"+
		"jk\u0005>\u0000\u0000kl\u0005=\u0000\u0000l\u001c\u0001\u0000\u0000\u0000"+
		"mn\u0005<\u0000\u0000n\u001e\u0001\u0000\u0000\u0000op\u0005<\u0000\u0000"+
		"pq\u0005=\u0000\u0000q \u0001\u0000\u0000\u0000rs\u0005!\u0000\u0000s"+
		"t\u0005=\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005&\u0000\u0000v"+
		"w\u0005&\u0000\u0000w$\u0001\u0000\u0000\u0000xy\u0005|\u0000\u0000yz"+
		"\u0005|\u0000\u0000z&\u0001\u0000\u0000\u0000{|\u0005+\u0000\u0000|(\u0001"+
		"\u0000\u0000\u0000}~\u0005-\u0000\u0000~*\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005*\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"/\u0000\u0000\u0082.\u0001\u0000\u0000\u0000\u0083\u0084\u0005%\u0000"+
		"\u0000\u00840\u0001\u0000\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086"+
		"\u0087\u0005n\u0000\u0000\u0087\u0088\u0005t\u0000\u0000\u00882\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a\u008b\u0005o\u0000"+
		"\u0000\u008b\u008c\u0005u\u0000\u0000\u008c\u008d\u0005b\u0000\u0000\u008d"+
		"\u008e\u0005l\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f4\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005b\u0000\u0000\u0091\u0092\u0005o\u0000"+
		"\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u0094\u0005l\u0000\u0000\u0094"+
		"6\u0001\u0000\u0000\u0000\u0095\u0096\u0005v\u0000\u0000\u0096\u0097\u0005"+
		"o\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098\u0099\u0005d\u0000"+
		"\u0000\u00998\u0001\u0000\u0000\u0000\u009a\u009b\u0005t\u0000\u0000\u009b"+
		"\u009c\u0005r\u0000\u0000\u009c\u009d\u0005u\u0000\u0000\u009d\u009e\u0005"+
		"e\u0000\u0000\u009e:\u0001\u0000\u0000\u0000\u009f\u00a0\u0005f\u0000"+
		"\u0000\u00a0\u00a1\u0005a\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2"+
		"\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4<\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005w\u0000\u0000\u00a6\u00a7\u0005h\u0000"+
		"\u0000\u00a7\u00a8\u0005i\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9"+
		"\u00aa\u0005e\u0000\u0000\u00aa>\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"i\u0000\u0000\u00ac\u00ad\u0005f\u0000\u0000\u00ad@\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af\u00b0\u0005l\u0000\u0000\u00b0"+
		"\u00b1\u0005s\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2B\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005f\u0000\u0000\u00b4\u00b5\u0005o\u0000"+
		"\u0000\u00b5\u00b6\u0005r\u0000\u0000\u00b6D\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005r\u0000\u0000\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u00ba\u0005"+
		"t\u0000\u0000\u00ba\u00bb\u0005u\u0000\u0000\u00bb\u00bc\u0005r\u0000"+
		"\u0000\u00bc\u00bd\u0005n\u0000\u0000\u00bdF\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003)\u0014\u0000\u00bf\u00c1\u0003\u0003\u0001\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003\u0003\u0001\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c9\u00be\u0001\u0000\u0000\u0000\u00c9\u00c5"+
		"\u0001\u0000\u0000\u0000\u00caH\u0001\u0000\u0000\u0000\u00cb\u00ce\u0003"+
		"\u0001\u0000\u0000\u00cc\u00ce\u0005_\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d4\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d3\u0003\u0001\u0000\u0000\u00d0\u00d3\u0003\u0003"+
		"\u0001\u0000\u00d1\u00d3\u0005_\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5J\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003\u0003\u0001\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0015\n\u0000\u00dd"+
		"\u00df\u0003\u0003\u0001\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1L\u0001\u0000\u0000\u0000\t\u0000"+
		"\u00c2\u00c7\u00c9\u00cd\u00d2\u00d4\u00da\u00e0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}