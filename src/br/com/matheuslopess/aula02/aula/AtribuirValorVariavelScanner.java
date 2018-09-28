package br.com.matheuslopess.aula02.aula;

import java.util.Scanner;

public class AtribuirValorVariavelScanner {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva seu nome:");
		String nome = leitor.nextLine();
		System.out.println("A string lida foi -> " + nome);
		
		System.out.println("Escreva o ano de seu nascimento:");
		// int anoNascimento = leitor.nextInt();
		int anoNascimento = Integer.parseInt(leitor.nextLine());
		System.out.println("O inteiro lido foi -> " + anoNascimento);
		
		System.out.println("Escreva sua idade, incluindo os meses passados:");
		double idade = leitor.nextDouble();
		System.out.println("O inteiro lido foi -> " + idade);
	}
}
