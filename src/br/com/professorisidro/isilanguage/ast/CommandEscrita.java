package br.com.professorisidro.isilanguage.ast;

public class CommandEscrita extends AbstractCommand{

	private String id;
	
	public CommandEscrita(String id) {
		this.id = id;
	}
	
	@Override
	public String generateJavaCode() {
		
		return "System.out.println(" + id + ");";
	}

	@Override
	public String generatePythonCode() {
		// TODO Auto-generated method stub
		return "		print("+id+")\n";
	}

	@Override
	public String toString() {
		return "CommandEscrita [id=" + id + "]";
	}	
	

}
