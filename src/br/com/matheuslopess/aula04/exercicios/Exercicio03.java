package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número para exibir sua tabuada:");
		int n = leitor.nextInt();
		
		for(int i = 0; i <= 10; i++)
			System.out.println(n + " x " + i + " = " + (n * i));
		
		leitor.close();
	}
}
