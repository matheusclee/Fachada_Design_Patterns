package administrativos;

import java.util.ArrayList;
import java.util.List;

import administrativos.*;

public class Administrativa {
	
	private List<Evento> eventos;
	
	private static final int NEGATIVO = -1;
	
	public Administrativa(){
		eventos = new ArrayList<Evento>();
	}
	
	public void setReuniao(String data, String hora, String participante1, String participante2) throws Exception{
		this.setEvento("reuniao", data, hora, participante1, participante2);
		
	}
	
	public void setEntrevista(String data, String hora, String participante1, String participante2) throws Exception{
		this.setEvento("entrevista", data, hora, participante1, participante2);
		
	}
	
	private void setEvento(String tipo, String data, String hora, String participante1, String participante2) throws Exception{
		Evento aux = new Evento(tipo, data, hora, participante1, participante2);
		int verificador = verificaEventoExiste(data, hora);
		if(verificador == NEGATIVO){
			throw new Exception("Já existe uma "+ eventos.get(verificador).getTipo() +" marcada na data e hora informada.");
		}else{
			eventos.add(aux);
		}
	}
	
	private int verificaEventoExiste(String data, String hora){
		for(int i = 0; i < eventos.size(); i++){
			if((eventos.get(i).getData() == data) && (eventos.get(i).getHora() == hora)){
				return NEGATIVO;
			}else{
				return i;
			}
		}
		if(eventos.size() >= 0){
			return 0;
		}else{
			return NEGATIVO;
		}
	}
	
	public String relatorioEventoEspecifico(String tipo){
		StringBuilder info = new StringBuilder();
		for(int i = 0; i < eventos.size(); i++){
			if(eventos.get(i).getTipo() == tipo){
				info.append(eventos.get(i).toString());
			}
		}
		return info.toString();
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		for(int i = 0; i < eventos.size(); i++){
			info.append(eventos.toString());
		}
		return info.toString();
	}
}
