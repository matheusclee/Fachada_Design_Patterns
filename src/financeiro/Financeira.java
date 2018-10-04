package financeiro;

import java.util.ArrayList;
import java.util.List;

public class Financeira {
	
	private List<FolhaPagamento> folhas;
	private List<BalancoContas> balancos;
	
	public Financeira(){
		folhas = new ArrayList<FolhaPagamento>();
		balancos = new ArrayList<BalancoContas>();
	}
	
	public void addFolha(String mes){
		folhas.add(new FolhaPagamento(mes));
	}
	
	public void inserirFuncionario(String mes, String nome, String salario){
		for(int i = 0; i < folhas.size(); i++){
			if(mes == folhas.get(i).getMes()){
				folhas.get(i).inserirFuncionario(nome, salario);
			}
		}
	}
	
	public void addBalanco(String mes){
		balancos.add(new BalancoContas(mes));
	}
	
	public void inserirConta(String mes, String conta, String valor){
		for(int i = 0; i < balancos.size(); i++){
			if(mes == balancos.get(i).getMes()){
				balancos.get(i).inserirConta(conta, valor);
			}
		}
	}
	
	public String emitirFolha(String mes){
		for(int i = 0; i < folhas.size(); i++){
			if(folhas.get(i).getMes() == mes){
				return folhas.get(i).toString();
			}
		}
		return "Não há folhas inseridas.";
	}

	public String emitirBalanco(String mes){
		for(int i = 0; i < balancos.size(); i++){
			if(balancos.get(i).getMes() == mes){
				return balancos.get(i).toString();
			}
		}
		return "Não há balanços de contas inseridos.";
	}
}
