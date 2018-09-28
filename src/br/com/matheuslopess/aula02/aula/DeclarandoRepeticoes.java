package br.com.matheuslopess.aula02.aula;

public class DeclarandoRepeticoes {

	public static void main(String[] args) {
		int x = 7;
		
		while(x > 3) {
			System.out.println(x--);
			// x = x - 1;
		}
		
		while(x < 7) {
			System.out.println(x++);
			// x = x + 1;
		}
	}

}
