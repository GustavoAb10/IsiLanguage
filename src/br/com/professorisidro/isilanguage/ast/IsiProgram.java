package br.com.professorisidro.isilanguage.ast;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import br.com.professorisidro.isilanguage.datastructure.IsiSymbol;
import br.com.professorisidro.isilanguage.datastructure.IsiSymbolTable;

public class IsiProgram {
	
	private IsiSymbolTable varTable;
	private ArrayList<AbstractCommand> comandos;
	private String programName;
	
	
	public void generateTarget() {
		// java code
		StringBuilder str = new StringBuilder();
		str.append("import java.util.Scanner;\n");
		str.append("public class MainClass { \n");
		str.append("	public static void main(String[] args){ \n");
		str.append("		Scanner _key = new Scanner(System.in);\n");
		
		for (IsiSymbol symbol: varTable.getAll()) {
			str.append(symbol.generateJavaCode() + "\n");
		}
		
		for (AbstractCommand command: comandos) {
			str.append(command.generateJavaCode() + "\n");
		}
		
		str.append("	}");
		str.append("}");
		
		// python code
		StringBuilder py = new StringBuilder();
		py.append("class MainClass :\n");
		py.append("	@staticmethod\n");
		py.append("	def main(args) :\n");
		py.append("		_key = 'Python-inputs'\n");
		for (IsiSymbol symbol: varTable.getAll()) {
			py.append(symbol.generatePythonCode());
		}
		for (AbstractCommand command: comandos) {
			py.append(command.generatePythonCode());
		}		
		py.append("\n"+"if __name__=='__main__':\n");
		py.append("	MainClass.main([])");		
		
		try {
			// java file
			FileWriter fr = new FileWriter(new File("MainClass.java"));
			fr.write(str.toString());
			fr.close();
			
			// py file
			FileWriter frpy = new FileWriter(new File("MainClass.py"));
			frpy.write(py.toString());
			frpy.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	public String getProgramName() {
		return programName;
	}


	public void setProgramName(String programName) {
		this.programName = programName;
	}


	public ArrayList<AbstractCommand> getComandos() {
		return comandos;
	}


	public void setComandos(ArrayList<AbstractCommand> comandos) {
		this.comandos = comandos;
	}


	public IsiSymbolTable getVarTable() {
		return varTable;
	}


	public void setVarTable(IsiSymbolTable varTable) {
		this.varTable = varTable;
	}
	
	

}
