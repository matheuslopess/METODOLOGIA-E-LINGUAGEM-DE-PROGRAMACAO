package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class ParOuImpar {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		int num = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println((i+1) + ". Informe um numero inteiro:");
			num = leitor.nextInt();
			
			if(num % 2 == 0)
				System.out.println("Par");
			else
				System.out.println("Impar");
		}
	}

}
