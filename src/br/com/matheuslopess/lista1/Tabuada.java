package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class Tabuada {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Informe o valor da tabuada:");
		num = leitor.nextInt();
		
		for(int i = 0; i <= 10; i++)
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
	}
}
