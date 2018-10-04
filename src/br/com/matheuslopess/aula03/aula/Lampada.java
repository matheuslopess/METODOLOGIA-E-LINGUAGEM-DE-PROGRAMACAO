package br.com.matheuslopess.aula03.aula;

public class Lampada {
	
	boolean estaAcesa = false;
	
	boolean getAcesa() {
		return estaAcesa;
	}
	
	void acender() {
		if(this.estaAcesa == true)
			System.out.println("Já está acesa!");
		else
			estaAcesa = true;
	}
	
	void apagar() {
		if(this.estaAcesa == false)
			System.out.println("Já está apagada!");
		else
			estaAcesa = false;
	}

}
