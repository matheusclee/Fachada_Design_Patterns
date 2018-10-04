package estrutura;

public class Sala {
	
	private String localizacao;
	
	public Sala(String local){
		setLocalizacao(local);
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
