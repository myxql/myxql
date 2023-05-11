// Generated from com\myxql\parser\job\antlr4\MyxqlJobLexer.g4 by ANTLR 4.7
package com.myxql.parser.job.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyxqlJobLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, SET=5, 
		UNSET=6, USE=7, STAR=8, DIVIDE=9, MODULE=10, PLUS=11, MINUS=12, EQUAL_SYMBOL=13, 
		GREATER_SYMBOL=14, LESS_SYMBOL=15, EXCLAMATION_SYMBOL=16, BIT_NOT_OP=17, 
		BIT_OR_OP=18, BIT_AND_OP=19, BIT_XOR_OP=20, DOT=21, LR_BRACKET=22, RR_BRACKET=23, 
		COMMA=24, SEMI=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, UNDERLINE=28, QUESTION_MARK=29, 
		SELECT=30, CREATE=31, ALTER=32, DROP=33, SHOW=34, ANALYZE=35, EXPLAIN=36, 
		DESC=37, REFRESH=38, COMMENT=39, CACHE=40, UNCACHE=41, LOAD=42, CLEAR=43, 
		TRUNCATE=44, RESET=45, DOT_ID=46, ID=47, REVERSE_QUOTE_ID=48, STRING_LITERAL=49, 
		ERROR_RECONGNIGION=50;
	public static final int
		DCSTREAMCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "DCSTREAMCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "SET", 
		"UNSET", "USE", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
		"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", 
		"BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
		"SEMI", "OPEN_BRACKET", "CLOSE_BRACKET", "UNDERLINE", "QUESTION_MARK", 
		"SELECT", "CREATE", "ALTER", "DROP", "SHOW", "ANALYZE", "EXPLAIN", "DESC", 
		"REFRESH", "COMMENT", "CACHE", "UNCACHE", "LOAD", "CLEAR", "TRUNCATE", 
		"RESET", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "ID_LITERAL", 
		"DQUOTA_STRING", "SQUOTA_STRING", "ERROR_RECONGNIGION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'SET'", "'UNSET'", "'USE'", "'*'", "'/'", 
		"'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", 
		"'^'", "'.'", "'('", "')'", "','", "';'", "'['", "']'", "'_'", "'?'", 
		"'SELECT'", "'CREATE'", "'ALTER'", "'DROP'", "'SHOW'", "'ANALYZE'", "'EXPLAIN'", 
		"'DESC'", "'REFRESH'", "'COMMENT'", "'CACHE'", "'UNCACHE'", "'LOAD'", 
		"'CLEAR'", "'TRUNCATE'", "'RESET'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
		"SET", "UNSET", "USE", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
		"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", 
		"BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
		"SEMI", "OPEN_BRACKET", "CLOSE_BRACKET", "UNDERLINE", "QUESTION_MARK", 
		"SELECT", "CREATE", "ALTER", "DROP", "SHOW", "ANALYZE", "EXPLAIN", "DESC", 
		"REFRESH", "COMMENT", "CACHE", "UNCACHE", "LOAD", "CLEAR", "TRUNCATE", 
		"RESET", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "ERROR_RECONGNIGION"
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


	public MyxqlJobLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyxqlJobLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u018b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\6\2o\n\2\r\2\16\2p\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\6\3z\n\3\r\3\16\3{\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0087"+
		"\n\4\f\4\16\4\u008a\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0095"+
		"\n\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\5\5\u009e\n\5\3\5\3\5\5"+
		"\5\u00a2\n\5\3\5\3\5\3\5\3\5\5\5\u00a8\n\5\3\5\3\5\5\5\u00ac\n\5\5\5\u00ae"+
		"\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\61\3\61\6\61\u015e\n\61\r\61\16\61\u015f\3\61\3"+
		"\61\3\62\3\62\5\62\u0166\n\62\3\63\7\63\u0169\n\63\f\63\16\63\u016c\13"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0174\n\64\f\64\16\64\u0177\13"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0181\n\65\f\65\16\65"+
		"\u0184\13\65\3\65\3\65\3\66\3\66\3\66\3\66\4{\u0088\2\67\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2k\64\3\2\b\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\3\2bb\7\2&&./\62<C\\aa\4\2$$^^\4\2))^^\2\u019a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2k\3\2\2\2\3n\3\2\2\2\5t\3\2\2\2\7\u0082\3\2\2\2\t\u00ad"+
		"\3\2\2\2\13\u00b1\3\2\2\2\r\u00b5\3\2\2\2\17\u00bb\3\2\2\2\21\u00bf\3"+
		"\2\2\2\23\u00c1\3\2\2\2\25\u00c3\3\2\2\2\27\u00c5\3\2\2\2\31\u00c7\3\2"+
		"\2\2\33\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37\u00cd\3\2\2\2!\u00cf\3\2\2\2"+
		"#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3"+
		"\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2"+
		"\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e7\3\2\2\2;\u00e9\3\2\2\2=\u00eb"+
		"\3\2\2\2?\u00f2\3\2\2\2A\u00f9\3\2\2\2C\u00ff\3\2\2\2E\u0104\3\2\2\2G"+
		"\u0109\3\2\2\2I\u0111\3\2\2\2K\u0119\3\2\2\2M\u011e\3\2\2\2O\u0126\3\2"+
		"\2\2Q\u012e\3\2\2\2S\u0134\3\2\2\2U\u013c\3\2\2\2W\u0141\3\2\2\2Y\u0147"+
		"\3\2\2\2[\u0150\3\2\2\2]\u0156\3\2\2\2_\u0159\3\2\2\2a\u015b\3\2\2\2c"+
		"\u0165\3\2\2\2e\u016a\3\2\2\2g\u016d\3\2\2\2i\u017a\3\2\2\2k\u0187\3\2"+
		"\2\2mo\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\2"+
		"\2\2s\4\3\2\2\2tu\7\61\2\2uv\7,\2\2vw\7#\2\2wy\3\2\2\2xz\13\2\2\2yx\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2{y\3\2\2\2|}\3\2\2\2}~\7,\2\2~\177\7\61\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\b\3\3\2\u0081\6\3\2\2\2\u0082\u0083\7\61"+
		"\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\4\2\2\u008f\b\3\2\2"+
		"\2\u0090\u0091\7/\2\2\u0091\u0092\7/\2\2\u0092\u0095\7\"\2\2\u0093\u0095"+
		"\7%\2\2\u0094\u0090\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0098\n\3\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u00a1\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009e\7\17\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a2\7\f\2\2\u00a0\u00a2\7\2\2\3\u00a1\u009d\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7/\2"+
		"\2\u00a5\u00ab\3\2\2\2\u00a6\u00a8\7\17\2\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\7\f\2\2\u00aa\u00ac\7\2"+
		"\2\3\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u0094\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\5"+
		"\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4"+
		"\7V\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8"+
		"\7U\2\2\u00b8\u00b9\7G\2\2\u00b9\u00ba\7V\2\2\u00ba\16\3\2\2\2\u00bb\u00bc"+
		"\7W\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be\7G\2\2\u00be\20\3\2\2\2\u00bf\u00c0"+
		"\7,\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\24\3\2\2\2\u00c3\u00c4"+
		"\7\'\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\30\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7@\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce \3\2\2\2\u00cf\u00d0"+
		"\7#\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7\u0080\2\2\u00d2$\3\2\2\2\u00d3\u00d4"+
		"\7~\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7"+
		"`\2\2\u00d8*\3\2\2\2\u00d9\u00da\7\60\2\2\u00da,\3\2\2\2\u00db\u00dc\7"+
		"*\2\2\u00dc.\3\2\2\2\u00dd\u00de\7+\2\2\u00de\60\3\2\2\2\u00df\u00e0\7"+
		".\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7=\2\2\u00e2\64\3\2\2\2\u00e3\u00e4"+
		"\7]\2\2\u00e4\66\3\2\2\2\u00e5\u00e6\7_\2\2\u00e68\3\2\2\2\u00e7\u00e8"+
		"\7a\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7A\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7"+
		"U\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7N\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f0"+
		"\7E\2\2\u00f0\u00f1\7V\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7E\2\2\u00f3\u00f4"+
		"\7T\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\7V\2\2\u00f7"+
		"\u00f8\7G\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7C\2\2\u00fa\u00fb\7N\2\2\u00fb"+
		"\u00fc\7V\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7T\2\2\u00feB\3\2\2\2\u00ff"+
		"\u0100\7F\2\2\u0100\u0101\7T\2\2\u0101\u0102\7Q\2\2\u0102\u0103\7R\2\2"+
		"\u0103D\3\2\2\2\u0104\u0105\7U\2\2\u0105\u0106\7J\2\2\u0106\u0107\7Q\2"+
		"\2\u0107\u0108\7Y\2\2\u0108F\3\2\2\2\u0109\u010a\7C\2\2\u010a\u010b\7"+
		"P\2\2\u010b\u010c\7C\2\2\u010c\u010d\7N\2\2\u010d\u010e\7[\2\2\u010e\u010f"+
		"\7\\\2\2\u010f\u0110\7G\2\2\u0110H\3\2\2\2\u0111\u0112\7G\2\2\u0112\u0113"+
		"\7Z\2\2\u0113\u0114\7R\2\2\u0114\u0115\7N\2\2\u0115\u0116\7C\2\2\u0116"+
		"\u0117\7K\2\2\u0117\u0118\7P\2\2\u0118J\3\2\2\2\u0119\u011a\7F\2\2\u011a"+
		"\u011b\7G\2\2\u011b\u011c\7U\2\2\u011c\u011d\7E\2\2\u011dL\3\2\2\2\u011e"+
		"\u011f\7T\2\2\u011f\u0120\7G\2\2\u0120\u0121\7H\2\2\u0121\u0122\7T\2\2"+
		"\u0122\u0123\7G\2\2\u0123\u0124\7U\2\2\u0124\u0125\7J\2\2\u0125N\3\2\2"+
		"\2\u0126\u0127\7E\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7O\2\2\u0129\u012a"+
		"\7O\2\2\u012a\u012b\7G\2\2\u012b\u012c\7P\2\2\u012c\u012d\7V\2\2\u012d"+
		"P\3\2\2\2\u012e\u012f\7E\2\2\u012f\u0130\7C\2\2\u0130\u0131\7E\2\2\u0131"+
		"\u0132\7J\2\2\u0132\u0133\7G\2\2\u0133R\3\2\2\2\u0134\u0135\7W\2\2\u0135"+
		"\u0136\7P\2\2\u0136\u0137\7E\2\2\u0137\u0138\7C\2\2\u0138\u0139\7E\2\2"+
		"\u0139\u013a\7J\2\2\u013a\u013b\7G\2\2\u013bT\3\2\2\2\u013c\u013d\7N\2"+
		"\2\u013d\u013e\7Q\2\2\u013e\u013f\7C\2\2\u013f\u0140\7F\2\2\u0140V\3\2"+
		"\2\2\u0141\u0142\7E\2\2\u0142\u0143\7N\2\2\u0143\u0144\7G\2\2\u0144\u0145"+
		"\7C\2\2\u0145\u0146\7T\2\2\u0146X\3\2\2\2\u0147\u0148\7V\2\2\u0148\u0149"+
		"\7T\2\2\u0149\u014a\7W\2\2\u014a\u014b\7P\2\2\u014b\u014c\7E\2\2\u014c"+
		"\u014d\7C\2\2\u014d\u014e\7V\2\2\u014e\u014f\7G\2\2\u014fZ\3\2\2\2\u0150"+
		"\u0151\7T\2\2\u0151\u0152\7G\2\2\u0152\u0153\7U\2\2\u0153\u0154\7G\2\2"+
		"\u0154\u0155\7V\2\2\u0155\\\3\2\2\2\u0156\u0157\7\60\2\2\u0157\u0158\5"+
		"e\63\2\u0158^\3\2\2\2\u0159\u015a\5e\63\2\u015a`\3\2\2\2\u015b\u015d\7"+
		"b\2\2\u015c\u015e\n\4\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7b"+
		"\2\2\u0162b\3\2\2\2\u0163\u0166\5g\64\2\u0164\u0166\5i\65\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166d\3\2\2\2\u0167\u0169\t\5\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016bf\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0175\7$\2\2\u016e\u016f"+
		"\7^\2\2\u016f\u0174\13\2\2\2\u0170\u0171\7$\2\2\u0171\u0174\7$\2\2\u0172"+
		"\u0174\n\6\2\2\u0173\u016e\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0172\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7$\2\2\u0179h\3\2\2\2\u017a"+
		"\u0182\7)\2\2\u017b\u017c\7^\2\2\u017c\u0181\13\2\2\2\u017d\u017e\7)\2"+
		"\2\u017e\u0181\7)\2\2\u017f\u0181\n\7\2\2\u0180\u017b\3\2\2\2\u0180\u017d"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7)"+
		"\2\2\u0186j\3\2\2\2\u0187\u0188\13\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\b\66\4\2\u018al\3\2\2\2\24\2p{\u0088\u0094\u0099\u009d\u00a1\u00a7\u00ab"+
		"\u00ad\u015f\u0165\u016a\u0173\u0175\u0180\u0182\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}