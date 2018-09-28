package br.com.matheuslopess.aula02.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int x = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Informe o segundo número:");
		int y = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Resultado da soma: " + (x + y));

	}

}
