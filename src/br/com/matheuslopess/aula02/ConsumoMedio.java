package br.com.matheuslopess.aula02;
import java.util.Scanner;

public class ConsumoMedio {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		double consumoMedio = 0.0, distTotal = 0.0, combTotal = 0.0;
		
		System.out.println("Informe a distância total percorrida em km:");
		distTotal = leitor.nextDouble();
		
		System.out.println("Informe o total de combustível gasto em L:");
		combTotal = leitor.nextDouble();
		
		consumoMedio = distTotal / combTotal;
		
		System.out.printf("Consumo médio: %.2f km/l\n", consumoMedio);
	}

}
