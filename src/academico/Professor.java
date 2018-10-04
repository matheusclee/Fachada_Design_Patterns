package academico;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	private int tempoCasa;
	private List<String> disciplinas;
	private static final int ZERO = 0;
	
	public Professor(String nome, int tempoCasa){
		disciplinas = new ArrayList<String>();
		
		setNome(nome);
		setTempoCasa(tempoCasa);
	}
	
	public void addDisciplina(String disciplina){
		disciplinas.add(disciplina);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		
		info.append(getNome() + " - " + getTempoCasa() + " anos de casa \n"
				+ "Disciplinas: ");
		if(disciplinas.size() == ZERO){
			info.append("Não há disciplinas alocadas.");
		}else{
			for(int i = 0; i < disciplinas.size(); i++){
				info.append(disciplinas.get(i) + "; ");
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

	public int getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
}
