package br.com.matheuslopess.aula02;
import java.util.Scanner;

public class BoletimAluno {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, media = 0.0;
		
		System.out.println("Informe a primeira nota:");
		nota1 = leitor.nextDouble();

		System.out.println("Informe a segunda nota:");
		nota2 = leitor.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		nota3 = leitor.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Média: %.2f\n", media);
		
		if(media >= 7.0)
			System.out.println("Aprovado");
		else
			if(media >= 5.0)
				System.out.println("Recuperação");
			else
				System.out.println("Reprovado");
	}

}
