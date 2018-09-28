package br.com.matheuslopess.aula02.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o seu ano de nascimento:");
		int anoNascimento = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Informe o ano atual:");
		int anoAtual = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Usuário faz " + (anoAtual - anoNascimento) + " anos neste ano.");
	}
}
