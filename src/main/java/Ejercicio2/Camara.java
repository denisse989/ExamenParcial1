package Ejercicio2;

public class Camara {
	private String foco;
	private String lente;
	
	public Camara() {
		
	}
	public Camara (String foco, String lente) {
		this.foco=foco;
		this.lente=lente;
	}
	public String getFoco() {
		return foco;
	}
	public void setFoco(String foco) {
		this.foco = foco;
	}
	public String getLente() {
		return lente;
	}
	public void setLente(String lente) {
		this.lente = lente;
	}

}
