package br.com.professorisidro.isilanguage.ast;

import br.com.professorisidro.isilanguage.datastructure.IsiVariable;

public class CommandLeitura extends AbstractCommand{
	
	private String id;
	private IsiVariable var;
	private String typesReturn;
	
	public CommandLeitura (String id, IsiVariable var) {
		this.id = id;
		this.var = var;
	}
	
	@Override
	public String generateJavaCode() {
		if (var.getType()==IsiVariable.NUMBER) {
			typesReturn =  "nextDouble();";
		} else if (var.getType()==IsiVariable.NUMBERINT) {
			typesReturn =  "nextInt();";
		} else {
			typesReturn = "nextLine();";
		}
		return id +"= _key." + typesReturn;	
	}

	@Override
	public String toString() {
		return "CommandLeitura [id=" + id + "]";
	}
	
	

}
