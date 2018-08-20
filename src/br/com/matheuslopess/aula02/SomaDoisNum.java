package br.com.matheuslopess.aula02;
import java.util.Scanner;

public class SomaDoisNum {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, soma = 0;
		
		System.out.println("Informe o primeiro número:");
		num1 = leitor.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = leitor.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Resultado da soma: " + soma);
	}

}
