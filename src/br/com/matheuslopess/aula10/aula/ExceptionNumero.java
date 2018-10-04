package br.com.matheuslopess.aula10.aula;

import java.util.Scanner;

public class ExceptionNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		try {
			int numero = leitor.nextInt();
			
			System.out.println("Numero -> " + numero);
		} catch(Exception e) {
			System.out.println("Seu burro, digite um numero direito");
		}
		
		leitor.close();

	}

}
