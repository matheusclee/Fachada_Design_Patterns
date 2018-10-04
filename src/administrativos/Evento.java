package administrativos;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	private String tipo;
	private String data;
	private String hora;
	private List<String> participantes;
	
	public Evento(String tipo, String data, String hora, String part1, String part2){
		this.setTipo(tipo);
		this.setData(data);
		this.setHora(hora);
		
		participantes = new ArrayList<String>();
		participantes.add(part1);
		participantes.add(part2);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void addParticipante(String nome){
		participantes.add(nome);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		if(tipo == "reuniao"){
			info.append("Reuniao marcada para " + getData() + " às " + getHora() + "\nParticipantes: ");
		}else{
			info.append("Entrevista marcada para " + getData() + " às " + getHora() + "\nParticipantes: ");
		}
		
		
		for(int i = 0; i < participantes.size(); i++){
			info.append(participantes.get(i) + "; ");
		}
		
		info.append("\n");
		return info.toString();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
