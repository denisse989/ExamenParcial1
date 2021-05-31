package Ejercicio2;

public class Cliente {

	public static void main(String[] args) {

		Celular celular = new Celular();
		celular.setModelo("A1");
		celular.setTamano("9.1 pulg");
		celular.setPeso("60");
		celular.setCamara(new Camara( "10",  "5 mp"));
		celular.setImei("");
		celular.setOrigen("Bolivia");
		
		Celular celular1=(Celular) celular.clone();
		celular1.setImei("10001");

		
		Celular celular2=(Celular) celular.clone();
		celular2.setImei("10002");

		
		Celular celular3=(Celular) celular.clone();
		celular3.setImei("10003");

		
		Celular celular4=(Celular) celular.clone();
		celular4.setImei("10004");
		
		Celular celular5=(Celular) celular.clone();
		celular5.setImei("10005");

		
		celular1.showInformation();
		celular2.showInformation();
		celular3.showInformation();
		celular4.showInformation();
		celular5.showInformation();
	}
	
	
}