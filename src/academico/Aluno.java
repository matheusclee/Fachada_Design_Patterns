package academico;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private double mensalidade;
	private List<String> historico;
	private static final int ZERO = 0;
	
	public Aluno(String nome, double mensalidade){
		historico = new ArrayList<String>();
		
		setNome(nome);
		setMensalidade(mensalidade);
	}
	
	public void addDisciplina(String disciplina){
		historico.add(disciplina);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		info.append(getNome() + " - " + getMensalidade() + "\n"
				+ "Histórico: ");
		if(historico.size() == ZERO){
			info.append("Vazio");
		}else{
			for(int i = 0; i < historico.size(); i++){
				info.append(historico.get(i) + "; ");
			}
		}
		
		info.append("\n");
		
		return info.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
