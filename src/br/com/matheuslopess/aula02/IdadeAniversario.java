package br.com.matheuslopess.aula02;
import java.util.Scanner;

public class IdadeAniversario {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		int idade = 0, anoNasc = 0, anoAtual = 0;
		
		System.out.println("Informe o seu ano de nascimento:");
		anoNasc = leitor.nextInt();
		
		System.out.println("Informe o ano atual:");
		anoAtual = leitor.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Você deverá ter " + idade + " anos neste ano");
	}

}
