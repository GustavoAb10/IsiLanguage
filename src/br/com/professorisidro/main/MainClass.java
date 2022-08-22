package br.com.professorisidro.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
import br.com.professorisidro.isilanguage.parser.isiLangLexer;
import br.com.professorisidro.isilanguage.parser.isiLangParser;

/*
 * esta é classe que é responsável por criar a interação com o usuário
 * instanciando nosso parser e aponando para o arquivo fonte
 * 
 * Arquivo fonte: extesao .isi*/


public class MainClass {

	public static void main(String[] args) {
		try {
			isiLangLexer lexer;
			isiLangParser parser;
			
			
			//leio o arquivo "input.isi" e isso é entrada para o analisador lexico
			lexer = new isiLangLexer(CharStreams.fromFileName("input.isi"));
			
			
			// crio um fluxo de tokens para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			//crio meu parser a partir desse tokenStream
			parser = new isiLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Succesfull :)");
			
			parser.exibeComandos();
			
			parser.generateCode();
			
			
		} 
		catch (IsiSemanticException ex) {
			System.err.println("Semantic error : " + ex.getMessage());
		}
		
		
		
		catch (Exception e) {
			System.err.println("ERRO" + e.getMessage());
		}

	}

}
