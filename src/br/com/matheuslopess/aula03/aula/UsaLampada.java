package br.com.matheuslopess.aula03.aula;

public class UsaLampada {
	
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		
		l1.acender();
		l2.apagar();
		
		if(l1.getAcesa())
			System.out.println("Lampada l1 esta acesa.");
		else
			System.out.println("Lampada l1 esta apagada");
		
		l1 = null;
		l2 = null;
	}
	
}
