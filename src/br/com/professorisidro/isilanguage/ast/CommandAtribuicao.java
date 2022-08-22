package br.com.professorisidro.isilanguage.ast;

import br.com.professorisidro.isilanguage.datastructure.IsiVariable;

public class CommandAtribuicao extends AbstractCommand {
	
	private String id;
	private String expr;
	private IsiVariable variable;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}

	public CommandAtribuicao (String id, String expr, IsiVariable variable) {
		this.id = id;
		this.expr = expr;
		this.variable = variable;
		this.variable.setValue(expr);
	}

	@Override
	public String toString() {
		return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
	}

	@Override
	public String generateJavaCode() {
		
		return id + " = " + expr + ";";
		
	}

}
