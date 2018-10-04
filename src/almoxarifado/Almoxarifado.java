package almoxarifado;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado {
	
	
	private List<String> estoque;
	
	private List<String> pedidos;
	private static final int ZERO = 0;
	
	public Almoxarifado(){
		estoque = new ArrayList<String>();
		pedidos = new ArrayList<String>();
	}
	
	public void inserirNoEstoque(String produto, String quantidade){
		estoque.add(produto);
		estoque.add(quantidade);
	}
	
	public String emitirEstoque(){
		StringBuilder info = new StringBuilder();
		if(estoque.size() == ZERO){
			info.append("Estoque vazio.\n");
		}else{
			for(int i = 0; i < estoque.size(); i = i + 2){
				info.append(estoque.get(i) + " - " + estoque.get(i+1) + "\n");
			}
		}
		
		return info.toString();
	}
	
	public void inserirPedido(String pedido, String valor){
		pedidos.add(pedido);
		pedidos.add(valor);
	}
	
	public String emitirPedidos(){
		StringBuilder info = new StringBuilder();
		if(pedidos.size() == ZERO){
			info.append("Não há pedidos.\n");
		}else{
			for(int i = 0; i < pedidos.size(); i = i + 2){
				info.append(pedidos.get(i) + " - " + pedidos.get(i+1) + "\n");
			}
		}
		return info.toString();
	}
}
