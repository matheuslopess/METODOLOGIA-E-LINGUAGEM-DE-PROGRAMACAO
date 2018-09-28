package br.com.matheuslopess.aula02.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n = 3;
		double notas[] = new double[n];
		double media = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Informe a " + (i + 1) + "a nota:");
			notas[i] = leitor.nextDouble();
			
			media += notas[i];
		}
		
		media = media / n;
		
		if(media >= 7)
			System.out.println("Aprovado");
		else
			if(media >= 5)
				System.out.println("Recuperação");
			else
				System.out.println("Reprovado");
		
	}

}
