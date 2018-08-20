package br.com.matheuslopess.aula02;
import java.util.Scanner;

public class NomeIdade {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe o seu nome:");
		nome = leitor.next();
		
		System.out.println("Informe a sua idade:");
		idade = leitor.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

	}

}
