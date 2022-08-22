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
	import java.util.ArrayList;
	import java.util.Stack;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link isiLangParser}.
 */
public interface isiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link isiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(isiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(isiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(isiLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(isiLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(isiLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(isiLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(isiLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(isiLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(isiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(isiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(isiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(isiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdenquanto(isiLangParser.CmdenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdenquanto(isiLangParser.CmdenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(isiLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(isiLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(isiLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(isiLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(isiLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(isiLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(isiLangParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(isiLangParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(isiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(isiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(isiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(isiLangParser.TermoContext ctx);
}