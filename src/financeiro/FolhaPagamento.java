package financeiro;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
	
	private String mes;
	
	private List<String> funcionarios;
	private List<String> salarios;
	
	public FolhaPagamento(String mes){
		funcionarios = new ArrayList<String>();
		salarios = new ArrayList<String>();
		setMes(mes);
	}
	
	public void inserirFuncionario(String nome, String salario){
		funcionarios.add(nome);
		salarios.add(salario);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		info.append("Folha de Pagamento - " + getMes() + ":\n");
		for(int i = 0; i < funcionarios.size(); i++){
			info.append(funcionarios.get(i) + " - " + salarios.get(i) + "\n");
		}
		return info.toString();
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
}
