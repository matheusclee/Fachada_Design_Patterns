package financeiro;

import java.util.ArrayList;
import java.util.List;

public class BalancoContas {
	
	private String mes;
	private List<String> contas;
	private List<String> valores;
	
	public BalancoContas(String mes){
		contas = new ArrayList<String>();
		valores = new ArrayList<String>();
		
		setMes(mes);
	}
	
	public void inserirConta(String conta, String valor){
		contas.add(conta);
		valores.add(valor);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		info.append("Balanço de contas de " + getMes() + ":\n"
				+ "CONTA - VALOR EM R$\n");
		for(int i = 0; i < contas.size(); i++){
			info.append(contas.get(i) + " - " + valores.get(i) + "\n");
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
