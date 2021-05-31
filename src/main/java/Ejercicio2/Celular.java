package Ejercicio2;

public class Celular  implements ICelular{
	private String modelo;
	private String tamano;
	private String peso;
	private Camara camara;
	private String imei;
	private String origen;
	
	public Celular() {}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Camara getCamara() {
		return camara;
	}
	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	@Override
	public Object clone() {
		Celular objClone= new Celular();
		objClone.setModelo(this.modelo);
		objClone.setTamano(this.tamano);
		objClone.setPeso(this.peso);
		objClone.setCamara(this.camara);
		objClone.setImei(this.imei);
		objClone.setOrigen(this.origen);
		
		return objClone;
	}
	
	public void showInformation() {
		System.out.println("*****************");
		System.out.println("Modelo: "+ modelo);
		System.out.println("Tamano: "+tamano);
		System.out.println("Peso: "+peso);
		System.out.println("Camara foco: "+camara.getFoco());
		System.out.println("Camara lente: "+camara.getLente());
		System.out.println("Imei: "+imei);
		System.out.println("Origen: "+origen);
		System.out.println(" ");
	}

}
