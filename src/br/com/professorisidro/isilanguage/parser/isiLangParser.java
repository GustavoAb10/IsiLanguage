// Generated from isiLang.g4 by ANTLR 4.7.1
package br.com.professorisidro.isilanguage.parser;

	import br.com.professorisidro.isilanguage.datastructure.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructure.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.datastructure.IsiVariable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandEnquanto;
	import br.com.professorisidro.isilanguage.ast.CommandEscolha;
	import java.util.ArrayList;
	import java.util.Stack;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class isiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, SC=15, OP=16, ATTR=17, VIR=18, 
		ACH=19, FCH=20, OPREL=21, ID=22, NUMBER=23, WS=24, NUMBERINT=25, PO=26;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdswitch = 6, RULE_cmdenquanto = 7, RULE_cmdleitura = 8, 
		RULE_cmdescrita = 9, RULE_cmdattrib = 10, RULE_cmdselecao = 11, RULE_expr = 12, 
		RULE_termo = 13;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdswitch", "cmdenquanto", 
		"cmdleitura", "cmdescrita", "cmdattrib", "cmdselecao", "expr", "termo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'inteiro'", 
		"'escolha'", "'caso'", "'enquanto'", "'leia'", "'escreva'", "'se'", "'senao'", 
		"'('", "')'", "';'", null, "'='", "','", "'{'", "'}'", null, null, null, 
		null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", 
		"NUMBER", "WS", "NUMBERINT", "PO"
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
	public String getGrammarFileName() { return "isiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		
		
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		
		private String _exprWhile;
		private ArrayList<AbstractCommand> listaCmdWhile;
		
		private String _switch;
		private String _switch2;
		private String _switch3;
		private ArrayList<AbstractCommand> listaSwitch1;
		private ArrayList<AbstractCommand> listaSwitch2;
		
		
		
		public void verificaID (String id) {
			if (!symbolTable.exists(id)) {
				throw new IsiSemanticException("Symbol" + id + " not declared");
			
			}
		
		}
		
		
		public void notUsedSymbol (IsiSymbol symbol) {
			IsiVariable variable = (IsiVariable) symbol;
			
			if (variable.getValue() == null) {
				System.out.println("Symbol " + symbol.getName() + " is not used");
			
			}
		}
		
		
		public void exibeComandos() {
			for(AbstractCommand c: program.getComandos()) {
				System.out.println(c);
				
			}
		
		
		}
		
		public void generateCode() {
			program.generateTarget();
		
		
		}


	public isiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			decl();
			setState(30);
			bloco();
			setState(31);
			match(T__1);
				program.setVarTable(symbolTable);
						program.setComandos(stack.pop());
						
						for(IsiSymbol symbol : symbolTable.getAll()) {
			           	  	 notUsedSymbol(symbol);
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				declaravar();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
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

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(isiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiLangParser.ID, i);
		}
		public TerminalNode SC() { return getToken(isiLangParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(isiLangParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(isiLangParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			tipo();
			setState(40);
			match(ID);

									_varName = _input.LT(-1).getText();
									_varValue = null;
									symbol = new IsiVariable(_varName, _tipo, _varValue);
									
									
									if (!symbolTable.exists(_varName)) {
										symbolTable.add(symbol);
									}else {
										throw new IsiSemanticException ("Symbol " + _varName + " alread declared");
									}
									

								
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(42);
				match(VIR);
				setState(43);
				match(ID);

										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new IsiVariable(_varName, _tipo, _varValue);
										
										if (!symbolTable.exists(_varName)) {
											symbolTable.add(symbol);
										}else {
											throw new IsiSemanticException ("Symbol " + _varName + " alread declared");
										}

									
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(SC);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__2);
				_tipo = IsiVariable.NUMBER;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__3);
				_tipo = IsiVariable.TEXT;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__4);
				 _tipo = IsiVariable.NUMBERINT;  
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 	curThread = new ArrayList<AbstractCommand>();
						stack.push(curThread);
					
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				cmd();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public CmdswitchContext cmdswitch() {
			return getRuleContext(CmdswitchContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				cmdleitura();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				cmdattrib();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				cmdselecao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				cmdenquanto();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				cmdswitch();
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

	public static class CmdswitchContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(isiLangParser.ACH, 0); }
		public List<TerminalNode> PO() { return getTokens(isiLangParser.PO); }
		public TerminalNode PO(int i) {
			return getToken(isiLangParser.PO, i);
		}
		public TerminalNode FCH() { return getToken(isiLangParser.FCH, 0); }
		public List<TerminalNode> ID() { return getTokens(isiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiLangParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(isiLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(isiLangParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBERINT() { return getTokens(isiLangParser.NUMBERINT); }
		public TerminalNode NUMBERINT(int i) {
			return getToken(isiLangParser.NUMBERINT, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdswitch(this);
		}
	}

	public final CmdswitchContext cmdswitch() throws RecognitionException {
		CmdswitchContext _localctx = new CmdswitchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdswitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);
			setState(75);
			match(AP);
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << NUMBERINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 verificaID(_input.LT(-1).getText());
												_switch = _input.LT(-1).getText();
											
			setState(78);
			match(FP);
			setState(79);
			match(ACH);
			setState(80);
			match(T__6);
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << NUMBERINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_switch2 = _input.LT(-1).getText(); 
			setState(83);
			match(PO);
			 curThread = new ArrayList<AbstractCommand>(); 
												stack.push(curThread);
												
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				cmd();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );

											listaSwitch1 = stack.pop();	
										
			setState(91);
			match(T__6);
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << NUMBERINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_switch3 = _input.LT(-1).getText(); 
			setState(94);
			match(PO);
			 curThread = new ArrayList<AbstractCommand>(); 
												stack.push(curThread);
												
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				cmd();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );

											listaSwitch2 = stack.pop();	
										
			setState(102);
			match(FCH);

											CommandEscolha cmd = new CommandEscolha(_switch, _switch2, _switch3, listaSwitch1, listaSwitch2);
											stack.peek().add(cmd);
										
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

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(isiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(isiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(isiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(isiLangParser.FCH, 0); }
		public TerminalNode NUMBER() { return getToken(isiLangParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdenquanto(this);
		}
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__7);
			setState(106);
			match(AP);
			setState(107);
			match(ID);
				verificaID( _input.LT(-1).getText() );
							 	 				_exprWhile = _input.LT(-1).getText();
							 	 			
			setState(109);
			match(OPREL);
			 _exprWhile += _input.LT(-1).getText(); 
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprWhile += _input.LT(-1).getText();
			setState(113);
			match(FP);
			setState(114);
			match(ACH);
			 	curThread = new ArrayList<AbstractCommand>();
											stack.push(curThread);
										
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				cmd();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
			setState(121);
			match(FCH);
				listaCmdWhile = stack.pop();
											CommandEnquanto cmd = new CommandEnquanto(_exprWhile, listaCmdWhile);
											stack.peek().add(cmd);
										
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(isiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(125);
			match(AP);
			setState(126);
			match(ID);
				verificaID( _input.LT(-1).getText() );
							 	 		_readID = _input.LT(-1).getText();
							 	 	
			setState(128);
			match(FP);
			setState(129);
			match(SC);

							 	 IsiVariable var = (IsiVariable) symbolTable.get(_readID);
							 	 CommandLeitura cmd = new CommandLeitura(_readID, var);
							 	 stack.peek().add(cmd);
							 	 
							 	 
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(isiLangParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__9);
			setState(133);
			match(AP);
			setState(134);
			match(ID);
				verificaID( _input.LT(-1).getText() );
											_writeID = _input.LT(-1).getText();
									
			setState(136);
			match(FP);
			setState(137);
			match(SC);

											CommandEscrita cmd = new CommandEscrita(_writeID);
											stack.peek().add(cmd);	
										
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

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(isiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(isiLangParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
				verificaID( _input.LT(-1).getText() );
								_exprID = _input.LT(-1).getText();
						
			setState(142);
			match(ATTR);
			 _exprContent = ""; 
			setState(144);
			expr();
			setState(145);
			match(SC);

						 	IsiVariable var = (IsiVariable) symbolTable.get(_exprID);
						 	CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent, var);
						 	stack.peek().add(cmd);
						 
						 	
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

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(isiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(isiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(isiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(isiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(isiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(isiLangParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(isiLangParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__10);
			setState(149);
			match(AP);
			setState(150);
			match(ID);
			 _exprDecision = _input.LT(-1).getText();
			setState(152);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText();
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _exprDecision += _input.LT(-1).getText();
			setState(156);
			match(FP);
			setState(157);
			match(ACH);
			 	curThread = new ArrayList<AbstractCommand>();
									stack.push(curThread);
								
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				cmd();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
			setState(164);
			match(FCH);

									listaTrue = stack.pop();
								
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(166);
				match(T__11);
				setState(167);
				match(ACH);
				 	curThread = new ArrayList<AbstractCommand>();
										stack.push(curThread);
									
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					cmd();
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				setState(174);
				match(FCH);

										listaFalse = stack.pop();
										CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
										stack.peek().add(cmd);
									
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(isiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(isiLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			termo();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(180);
				match(OP);
				_exprContent += _input.LT(-1).getText();
				setState(182);
				termo();
				}
				}
				setState(187);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(isiLangParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termo);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ID);
					verificaID( _input.LT(-1).getText() );
									_exprContent += _input.LT(-1).getText();
						
							
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(NUMBER);
					_exprContent += _input.LT(-1).getText();
							
							
							
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\6\6A\n\6\r\6\16\6"+
		"B\3\7\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\bY\n\b\r\b\16\bZ\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\bd\n\b\r"+
		"\b\16\be\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\6\tx\n\t\r\t\16\ty\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00a3\n\r\r\r\16\r"+
		"\u00a4\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00ad\n\r\r\r\16\r\u00ae\3\r\3\r\3"+
		"\r\5\r\u00b4\n\r\3\16\3\16\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd"+
		"\13\16\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\17\2\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\4\4\2\30\31\33\33\3\2\30\31\2\u00c8\2\36\3\2\2"+
		"\2\4%\3\2\2\2\6)\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2"+
		"\20k\3\2\2\2\22~\3\2\2\2\24\u0086\3\2\2\2\26\u008e\3\2\2\2\30\u0096\3"+
		"\2\2\2\32\u00b5\3\2\2\2\34\u00c2\3\2\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\5"+
		"\n\6\2!\"\7\4\2\2\"#\b\2\1\2#\3\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2"+
		"\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)*\5\b\5\2*+\7\30\2\2+\61\b\4\1\2,-\7"+
		"\24\2\2-.\7\30\2\2.\60\b\4\1\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\21\2\2\65\7\3\2\2\2\66"+
		"\67\7\5\2\2\67=\b\5\1\289\7\6\2\29=\b\5\1\2:;\7\7\2\2;=\b\5\1\2<\66\3"+
		"\2\2\2<8\3\2\2\2<:\3\2\2\2=\t\3\2\2\2>@\b\6\1\2?A\5\f\7\2@?\3\2\2\2AB"+
		"\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DK\5\22\n\2EK\5\24\13\2FK\5\26"+
		"\f\2GK\5\30\r\2HK\5\20\t\2IK\5\16\b\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG"+
		"\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\r\3\2\2\2LM\7\b\2\2MN\7\17\2\2NO\t\2\2\2"+
		"OP\b\b\1\2PQ\7\20\2\2QR\7\25\2\2RS\7\t\2\2ST\t\2\2\2TU\b\b\1\2UV\7\34"+
		"\2\2VX\b\b\1\2WY\5\f\7\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3"+
		"\2\2\2\\]\b\b\1\2]^\7\t\2\2^_\t\2\2\2_`\b\b\1\2`a\7\34\2\2ac\b\b\1\2b"+
		"d\5\f\7\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\b\1\2"+
		"hi\7\26\2\2ij\b\b\1\2j\17\3\2\2\2kl\7\n\2\2lm\7\17\2\2mn\7\30\2\2no\b"+
		"\t\1\2op\7\27\2\2pq\b\t\1\2qr\t\3\2\2rs\b\t\1\2st\7\20\2\2tu\7\25\2\2"+
		"uw\b\t\1\2vx\5\f\7\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\7\26\2\2|}\b\t\1\2}\21\3\2\2\2~\177\7\13\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0081\7\30\2\2\u0081\u0082\b\n\1\2\u0082\u0083\7\20\2\2\u0083\u0084\7"+
		"\21\2\2\u0084\u0085\b\n\1\2\u0085\23\3\2\2\2\u0086\u0087\7\f\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\7\30\2\2\u0089\u008a\b\13\1\2\u008a\u008b"+
		"\7\20\2\2\u008b\u008c\7\21\2\2\u008c\u008d\b\13\1\2\u008d\25\3\2\2\2\u008e"+
		"\u008f\7\30\2\2\u008f\u0090\b\f\1\2\u0090\u0091\7\23\2\2\u0091\u0092\b"+
		"\f\1\2\u0092\u0093\5\32\16\2\u0093\u0094\7\21\2\2\u0094\u0095\b\f\1\2"+
		"\u0095\27\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u0098\7\17\2\2\u0098\u0099"+
		"\7\30\2\2\u0099\u009a\b\r\1\2\u009a\u009b\7\27\2\2\u009b\u009c\b\r\1\2"+
		"\u009c\u009d\t\3\2\2\u009d\u009e\b\r\1\2\u009e\u009f\7\20\2\2\u009f\u00a0"+
		"\7\25\2\2\u00a0\u00a2\b\r\1\2\u00a1\u00a3\5\f\7\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00b3\b\r\1\2\u00a8\u00a9\7\16\2\2"+
		"\u00a9\u00aa\7\25\2\2\u00aa\u00ac\b\r\1\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\b\r\1\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\31\3\2\2\2\u00b5"+
		"\u00bb\5\34\17\2\u00b6\u00b7\7\22\2\2\u00b7\u00b8\b\16\1\2\u00b8\u00ba"+
		"\5\34\17\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf"+
		"\7\30\2\2\u00bf\u00c3\b\17\1\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3\b\17\1"+
		"\2\u00c2\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\35\3\2\2\2\17\'\61<B"+
		"JZey\u00a4\u00ae\u00b3\u00bb\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}