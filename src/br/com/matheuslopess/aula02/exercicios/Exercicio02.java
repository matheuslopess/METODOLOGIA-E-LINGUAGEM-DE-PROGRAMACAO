package br.com.matheuslopess.aula02.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o seu nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Informe a sua idade:");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

	}

}
