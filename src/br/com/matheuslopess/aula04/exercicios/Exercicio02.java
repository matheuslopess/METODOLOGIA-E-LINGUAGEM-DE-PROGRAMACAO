package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println((i + 1) + ". Informe o número:");
			n = leitor.nextInt();
			
			if(n % 2 == 0)
				System.out.println(n + " é Par");
			else
				System.out.println(n + " é Ímpar");
		}
		
		leitor.close();
	}
}
