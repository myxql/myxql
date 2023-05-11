// Generated from com\myxql\parser\job\antlr4\MyxqlJobParser.g4 by ANTLR 4.7
package com.myxql.parser.job.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyxqlJobParser extends Parser {
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
		RULE_root = 0, RULE_jobCommonds = 1, RULE_jobCommond = 2, RULE_execCommond = 3, 
		RULE_resourceNameExpr = 4, RULE_classNameExpr = 5, RULE_paramsExpr = 6, 
		RULE_paramExpr = 7, RULE_filePath = 8, RULE_setCommond = 9, RULE_unsetCommond = 10, 
		RULE_useCommond = 11, RULE_sqlCommond = 12, RULE_keyExpr = 13, RULE_valueExpr = 14, 
		RULE_word = 15, RULE_emptyCommond = 16;
	public static final String[] ruleNames = {
		"root", "jobCommonds", "jobCommond", "execCommond", "resourceNameExpr", 
		"classNameExpr", "paramsExpr", "paramExpr", "filePath", "setCommond", 
		"unsetCommond", "useCommond", "sqlCommond", "keyExpr", "valueExpr", "word", 
		"emptyCommond"
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

	@Override
	public String getGrammarFileName() { return "MyxqlJobParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyxqlJobParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyxqlJobParser.EOF, 0); }
		public JobCommondsContext jobCommonds() {
			return getRuleContext(JobCommondsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << USE) | (1L << DIVIDE) | (1L << SEMI) | (1L << SELECT) | (1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << ANALYZE) | (1L << EXPLAIN) | (1L << DESC) | (1L << REFRESH) | (1L << COMMENT) | (1L << CACHE) | (1L << UNCACHE) | (1L << LOAD) | (1L << CLEAR) | (1L << TRUNCATE) | (1L << RESET) | (1L << ID))) != 0)) {
				{
				setState(34);
				jobCommonds();
				}
			}

			setState(37);
			match(EOF);
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

	public static class JobCommondsContext extends ParserRuleContext {
		public List<JobCommondContext> jobCommond() {
			return getRuleContexts(JobCommondContext.class);
		}
		public JobCommondContext jobCommond(int i) {
			return getRuleContext(JobCommondContext.class,i);
		}
		public List<EmptyCommondContext> emptyCommond() {
			return getRuleContexts(EmptyCommondContext.class);
		}
		public EmptyCommondContext emptyCommond(int i) {
			return getRuleContext(EmptyCommondContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MyxqlJobParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MyxqlJobParser.SEMI, i);
		}
		public JobCommondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobCommonds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterJobCommonds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitJobCommonds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitJobCommonds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobCommondsContext jobCommonds() throws RecognitionException {
		JobCommondsContext _localctx = new JobCommondsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jobCommonds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET:
					case UNSET:
					case USE:
					case DIVIDE:
					case SELECT:
					case CREATE:
					case ALTER:
					case DROP:
					case SHOW:
					case ANALYZE:
					case EXPLAIN:
					case DESC:
					case REFRESH:
					case COMMENT:
					case CACHE:
					case UNCACHE:
					case LOAD:
					case CLEAR:
					case TRUNCATE:
					case RESET:
					case ID:
						{
						setState(39);
						jobCommond();
						setState(40);
						match(SEMI);
						}
						break;
					case SEMI:
						{
						setState(42);
						emptyCommond();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case UNSET:
			case USE:
			case DIVIDE:
			case SELECT:
			case CREATE:
			case ALTER:
			case DROP:
			case SHOW:
			case ANALYZE:
			case EXPLAIN:
			case DESC:
			case REFRESH:
			case COMMENT:
			case CACHE:
			case UNCACHE:
			case LOAD:
			case CLEAR:
			case TRUNCATE:
			case RESET:
			case ID:
				{
				setState(48);
				jobCommond();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(49);
					match(SEMI);
					}
				}

				}
				break;
			case SEMI:
				{
				setState(52);
				emptyCommond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class JobCommondContext extends ParserRuleContext {
		public SetCommondContext setCommond() {
			return getRuleContext(SetCommondContext.class,0);
		}
		public UnsetCommondContext unsetCommond() {
			return getRuleContext(UnsetCommondContext.class,0);
		}
		public UseCommondContext useCommond() {
			return getRuleContext(UseCommondContext.class,0);
		}
		public SqlCommondContext sqlCommond() {
			return getRuleContext(SqlCommondContext.class,0);
		}
		public ExecCommondContext execCommond() {
			return getRuleContext(ExecCommondContext.class,0);
		}
		public JobCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterJobCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitJobCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitJobCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobCommondContext jobCommond() throws RecognitionException {
		JobCommondContext _localctx = new JobCommondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jobCommond);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				setCommond();
				}
				break;
			case UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				unsetCommond();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				useCommond();
				}
				break;
			case SELECT:
			case CREATE:
			case ALTER:
			case DROP:
			case SHOW:
			case ANALYZE:
			case EXPLAIN:
			case DESC:
			case REFRESH:
			case COMMENT:
			case CACHE:
			case UNCACHE:
			case LOAD:
			case CLEAR:
			case TRUNCATE:
			case RESET:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				sqlCommond();
				}
				break;
			case DIVIDE:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				execCommond();
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

	public static class ExecCommondContext extends ParserRuleContext {
		public ResourceNameExprContext resourceNameExpr() {
			return getRuleContext(ResourceNameExprContext.class,0);
		}
		public ClassNameExprContext classNameExpr() {
			return getRuleContext(ClassNameExprContext.class,0);
		}
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public ExecCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterExecCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitExecCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitExecCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecCommondContext execCommond() throws RecognitionException {
		ExecCommondContext _localctx = new ExecCommondContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execCommond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			resourceNameExpr();
			setState(63);
			classNameExpr();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(64);
				paramsExpr();
				}
			}

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

	public static class ResourceNameExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ResourceNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterResourceNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitResourceNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitResourceNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceNameExprContext resourceNameExpr() throws RecognitionException {
		ResourceNameExprContext _localctx = new ResourceNameExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resourceNameExpr);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(68);
					match(DOT_ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				filePath();
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

	public static class ClassNameExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public ClassNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterClassNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitClassNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitClassNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameExprContext classNameExpr() throws RecognitionException {
		ClassNameExprContext _localctx = new ClassNameExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classNameExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(78);
				match(DOT_ID);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParamsExprContext extends ParserRuleContext {
		public List<ParamExprContext> paramExpr() {
			return getRuleContexts(ParamExprContext.class);
		}
		public ParamExprContext paramExpr(int i) {
			return getRuleContext(ParamExprContext.class,i);
		}
		public ParamsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterParamsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitParamsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitParamsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsExprContext paramsExpr() throws RecognitionException {
		ParamsExprContext _localctx = new ParamsExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			paramExpr();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(85);
				paramExpr();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParamExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyxqlJobParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyxqlJobParser.ID, i);
		}
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MyxqlJobParser.STRING_LITERAL, 0); }
		public ParamExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterParamExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitParamExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitParamExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamExprContext paramExpr() throws RecognitionException {
		ParamExprContext _localctx = new ParamExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramExpr);
		int _la;
		try {
			int _alt;
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(92);
					match(DOT_ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				filePath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(ID);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(100);
					match(DOT_ID);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						match(DIVIDE);
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DIVIDE) {
							{
							setState(107);
							match(DIVIDE);
							}
						}

						setState(110);
						match(ID);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT_ID) {
							{
							{
							setState(111);
							match(DOT_ID);
							}
							}
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(STRING_LITERAL);
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

	public static class FilePathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyxqlJobParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyxqlJobParser.ID, i);
		}
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DIVIDE);
			setState(126);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(127);
				match(DOT_ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(DIVIDE);
					setState(142);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(134);
						match(ID);
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT_ID) {
							{
							{
							setState(135);
							match(DOT_ID);
							}
							}
							setState(140);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case STAR:
						{
						setState(141);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(149);
				match(DIVIDE);
				}
				break;
			}
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

	public static class SetCommondContext extends ParserRuleContext {
		public ValueExprContext value;
		public TerminalNode SET() { return getToken(MyxqlJobParser.SET, 0); }
		public KeyExprContext keyExpr() {
			return getRuleContext(KeyExprContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(MyxqlJobParser.EQUAL_SYMBOL, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public SetCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterSetCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitSetCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitSetCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetCommondContext setCommond() throws RecognitionException {
		SetCommondContext _localctx = new SetCommondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SET);
			setState(153);
			keyExpr();
			setState(154);
			match(EQUAL_SYMBOL);
			setState(155);
			((SetCommondContext)_localctx).value = valueExpr();
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

	public static class UnsetCommondContext extends ParserRuleContext {
		public TerminalNode UNSET() { return getToken(MyxqlJobParser.UNSET, 0); }
		public KeyExprContext keyExpr() {
			return getRuleContext(KeyExprContext.class,0);
		}
		public UnsetCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterUnsetCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitUnsetCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitUnsetCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetCommondContext unsetCommond() throws RecognitionException {
		UnsetCommondContext _localctx = new UnsetCommondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsetCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(UNSET);
			setState(158);
			keyExpr();
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

	public static class UseCommondContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MyxqlJobParser.USE, 0); }
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public UseCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterUseCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitUseCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitUseCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseCommondContext useCommond() throws RecognitionException {
		UseCommondContext _localctx = new UseCommondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_useCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(USE);
			setState(161);
			match(ID);
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

	public static class SqlCommondContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MyxqlJobParser.CREATE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(MyxqlJobParser.SELECT, 0); }
		public TerminalNode ALTER() { return getToken(MyxqlJobParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(MyxqlJobParser.DROP, 0); }
		public TerminalNode SHOW() { return getToken(MyxqlJobParser.SHOW, 0); }
		public TerminalNode ANALYZE() { return getToken(MyxqlJobParser.ANALYZE, 0); }
		public TerminalNode EXPLAIN() { return getToken(MyxqlJobParser.EXPLAIN, 0); }
		public TerminalNode DESC() { return getToken(MyxqlJobParser.DESC, 0); }
		public TerminalNode REFRESH() { return getToken(MyxqlJobParser.REFRESH, 0); }
		public TerminalNode COMMENT() { return getToken(MyxqlJobParser.COMMENT, 0); }
		public TerminalNode CACHE() { return getToken(MyxqlJobParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(MyxqlJobParser.UNCACHE, 0); }
		public TerminalNode LOAD() { return getToken(MyxqlJobParser.LOAD, 0); }
		public TerminalNode CLEAR() { return getToken(MyxqlJobParser.CLEAR, 0); }
		public TerminalNode TRUNCATE() { return getToken(MyxqlJobParser.TRUNCATE, 0); }
		public TerminalNode RESET() { return getToken(MyxqlJobParser.RESET, 0); }
		public SqlCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterSqlCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitSqlCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitSqlCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCommondContext sqlCommond() throws RecognitionException {
		SqlCommondContext _localctx = new SqlCommondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sqlCommond);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(CREATE);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					word();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(SELECT);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					word();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(ALTER);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					word();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(DROP);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					word();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(SHOW);
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					word();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(ANALYZE);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					word();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(EXPLAIN);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					word();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(DESC);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					word();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case REFRESH:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(REFRESH);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					word();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				match(COMMENT);
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					word();
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 11);
				{
				setState(223);
				match(CACHE);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					word();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case UNCACHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(229);
				match(UNCACHE);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					word();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 13);
				{
				setState(235);
				match(LOAD);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					word();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(241);
				match(CLEAR);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					word();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 15);
				{
				setState(247);
				match(TRUNCATE);
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					word();
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				match(RESET);
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					word();
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
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

	public static class KeyExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public KeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyExprContext keyExpr() throws RecognitionException {
		KeyExprContext _localctx = new KeyExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(262);
				match(DOT_ID);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ValueExprContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			word();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(269);
				word();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public TerminalNode DOT_ID() { return getToken(MyxqlJobParser.DOT_ID, 0); }
		public TerminalNode SET() { return getToken(MyxqlJobParser.SET, 0); }
		public TerminalNode UNSET() { return getToken(MyxqlJobParser.UNSET, 0); }
		public TerminalNode STAR() { return getToken(MyxqlJobParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(MyxqlJobParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(MyxqlJobParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(MyxqlJobParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyxqlJobParser.MINUS, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(MyxqlJobParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(MyxqlJobParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(MyxqlJobParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(MyxqlJobParser.EXCLAMATION_SYMBOL, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(MyxqlJobParser.BIT_NOT_OP, 0); }
		public TerminalNode BIT_OR_OP() { return getToken(MyxqlJobParser.BIT_OR_OP, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(MyxqlJobParser.BIT_AND_OP, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(MyxqlJobParser.BIT_XOR_OP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(MyxqlJobParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(MyxqlJobParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MyxqlJobParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MyxqlJobParser.STRING_LITERAL, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EmptyCommondContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MyxqlJobParser.SEMI, 0); }
		public EmptyCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterEmptyCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitEmptyCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitEmptyCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyCommondContext emptyCommond() throws RecognitionException {
		EmptyCommondContext _localctx = new EmptyCommondContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_emptyCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SEMI);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u011a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\5\3\65\n\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\5"+
		"\5D\n\5\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\5\6N\n\6\3\7\3\7\7\7R\n\7"+
		"\f\7\16\7U\13\7\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\7\t`\n\t\f\t"+
		"\16\tc\13\t\3\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\5\to\n\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\7\tx\n\t\f\t\16\t{\13\t\3\t\5\t~\n\t\3\n\3"+
		"\n\3\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n"+
		"\16\n\u008e\13\n\3\n\5\n\u0091\n\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3"+
		"\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\16\3\16\6\16\u00ae\n\16\r\16"+
		"\16\16\u00af\3\16\3\16\6\16\u00b4\n\16\r\16\16\16\u00b5\3\16\3\16\6\16"+
		"\u00ba\n\16\r\16\16\16\u00bb\3\16\3\16\6\16\u00c0\n\16\r\16\16\16\u00c1"+
		"\3\16\3\16\6\16\u00c6\n\16\r\16\16\16\u00c7\3\16\3\16\6\16\u00cc\n\16"+
		"\r\16\16\16\u00cd\3\16\3\16\6\16\u00d2\n\16\r\16\16\16\u00d3\3\16\3\16"+
		"\6\16\u00d8\n\16\r\16\16\16\u00d9\3\16\3\16\6\16\u00de\n\16\r\16\16\16"+
		"\u00df\3\16\3\16\6\16\u00e4\n\16\r\16\16\16\u00e5\3\16\3\16\6\16\u00ea"+
		"\n\16\r\16\16\16\u00eb\3\16\3\16\6\16\u00f0\n\16\r\16\16\16\u00f1\3\16"+
		"\3\16\6\16\u00f6\n\16\r\16\16\16\u00f7\3\16\3\16\6\16\u00fc\n\16\r\16"+
		"\16\16\u00fd\3\16\3\16\6\16\u0102\n\16\r\16\16\16\u0103\5\16\u0106\n\16"+
		"\3\17\3\17\7\17\u010a\n\17\f\17\16\17\u010d\13\17\3\20\3\20\7\20\u0111"+
		"\n\20\f\20\16\20\u0114\13\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\3\7\2\7\b\n\26\30\32\60\61\63\63\2"+
		"\u0144\2%\3\2\2\2\4/\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nM\3\2\2\2\fO\3\2\2"+
		"\2\16V\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u009a\3\2\2\2\26\u009f\3"+
		"\2\2\2\30\u00a2\3\2\2\2\32\u0105\3\2\2\2\34\u0107\3\2\2\2\36\u010e\3\2"+
		"\2\2 \u0115\3\2\2\2\"\u0117\3\2\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&\'\3"+
		"\2\2\2\'(\7\2\2\3(\3\3\2\2\2)*\5\6\4\2*+\7\33\2\2+.\3\2\2\2,.\5\"\22\2"+
		"-)\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61"+
		"/\3\2\2\2\62\64\5\6\4\2\63\65\7\33\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"8\3\2\2\2\668\5\"\22\2\67\62\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29?\5\24\13"+
		"\2:?\5\26\f\2;?\5\30\r\2<?\5\32\16\2=?\5\b\5\2>9\3\2\2\2>:\3\2\2\2>;\3"+
		"\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\5\n\6\2AC\5\f\7\2BD\5\16\b\2C"+
		"B\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EI\7\61\2\2FH\7\60\2\2GF\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KI\3\2\2\2LN\5\22\n\2ME\3\2\2\2ML\3\2"+
		"\2\2N\13\3\2\2\2OS\7\61\2\2PR\7\60\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2T\r\3\2\2\2US\3\2\2\2VZ\5\20\t\2WY\5\20\t\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2\\Z\3\2\2\2]a\7\61\2\2^`\7\60\2\2"+
		"_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b~\3\2\2\2ca\3\2\2\2d~\5\22\n"+
		"\2ei\7\61\2\2fh\7\60\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jy\3\2"+
		"\2\2ki\3\2\2\2ln\7\13\2\2mo\7\13\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\7"+
		"\61\2\2qs\7\60\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2wl\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z~\3\2\2\2{y\3\2\2\2"+
		"|~\7\63\2\2}]\3\2\2\2}d\3\2\2\2}e\3\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0080"+
		"\7\13\2\2\u0080\u0084\7\61\2\2\u0081\u0083\7\60\2\2\u0082\u0081\3\2\2"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0094"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0090\7\13\2\2\u0088\u008c\7\61\2\2"+
		"\u0089\u008b\7\60\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7\n\2\2\u0090\u0088\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0087\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7\13"+
		"\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b"+
		"\7\7\2\2\u009b\u009c\5\34\17\2\u009c\u009d\7\17\2\2\u009d\u009e\5\36\20"+
		"\2\u009e\25\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\34\17\2\u00a1\27"+
		"\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\61\2\2\u00a4\31\3\2\2\2\u00a5"+
		"\u00a7\7!\2\2\u00a6\u00a8\5 \21\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u0106\3\2\2\2\u00ab"+
		"\u00ad\7 \2\2\u00ac\u00ae\5 \21\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u0106\3\2\2\2\u00b1"+
		"\u00b3\7\"\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u0106\3\2\2\2\u00b7"+
		"\u00b9\7#\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u0106\3\2\2\2\u00bd"+
		"\u00bf\7$\2\2\u00be\u00c0\5 \21\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u0106\3\2\2\2\u00c3"+
		"\u00c5\7%\2\2\u00c4\u00c6\5 \21\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u0106\3\2\2\2\u00c9"+
		"\u00cb\7&\2\2\u00ca\u00cc\5 \21\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u0106\3\2\2\2\u00cf"+
		"\u00d1\7\'\2\2\u00d0\u00d2\5 \21\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u0106\3\2\2\2\u00d5"+
		"\u00d7\7(\2\2\u00d6\u00d8\5 \21\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u0106\3\2\2\2\u00db"+
		"\u00dd\7)\2\2\u00dc\u00de\5 \21\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u0106\3\2\2\2\u00e1"+
		"\u00e3\7*\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u0106\3\2\2\2\u00e7"+
		"\u00e9\7+\2\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u0106\3\2\2\2\u00ed"+
		"\u00ef\7,\2\2\u00ee\u00f0\5 \21\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0106\3\2\2\2\u00f3"+
		"\u00f5\7-\2\2\u00f4\u00f6\5 \21\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0106\3\2\2\2\u00f9"+
		"\u00fb\7.\2\2\u00fa\u00fc\5 \21\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0106\3\2\2\2\u00ff"+
		"\u0101\7/\2\2\u0100\u0102\5 \21\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00a5\3\2\2\2\u0105\u00ab\3\2\2\2\u0105\u00b1\3\2\2\2\u0105\u00b7\3\2"+
		"\2\2\u0105\u00bd\3\2\2\2\u0105\u00c3\3\2\2\2\u0105\u00c9\3\2\2\2\u0105"+
		"\u00cf\3\2\2\2\u0105\u00d5\3\2\2\2\u0105\u00db\3\2\2\2\u0105\u00e1\3\2"+
		"\2\2\u0105\u00e7\3\2\2\2\u0105\u00ed\3\2\2\2\u0105\u00f3\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u00ff\3\2\2\2\u0106\33\3\2\2\2\u0107\u010b\7\61\2"+
		"\2\u0108\u010a\7\60\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\35\3\2\2\2\u010d\u010b\3\2\2"+
		"\2\u010e\u0112\5 \21\2\u010f\u0111\5 \21\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\t\2\2\2\u0116!\3\2\2\2\u0117\u0118\7\33\2\2"+
		"\u0118#\3\2\2\2+%-/\64\67>CIMSZainty}\u0084\u008c\u0090\u0094\u0098\u00a9"+
		"\u00af\u00b5\u00bb\u00c1\u00c7\u00cd\u00d3\u00d9\u00df\u00e5\u00eb\u00f1"+
		"\u00f7\u00fd\u0103\u0105\u010b\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}