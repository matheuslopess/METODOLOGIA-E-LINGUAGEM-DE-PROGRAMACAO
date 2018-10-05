package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota1 = 0, nota2 = 0, media = 0, mediaClasse = 0;
		int aprovados = 0, exame = 0, reprovados = 0;
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println((i + 1) + "o aluno");
			
			System.out.println("Informe a primeira nota:");
			nota1 = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota:");
			nota2 = leitor.nextDouble();
			
			media = (nota1 + nota2) / 2;
			mediaClasse += media;
			
			if(media > 7)
			{
				System.out.println("Aprovado");
				aprovados++;
			}
			else
				if(media > 3)
				{
					System.out.println("Exame");
					exame++;
				}
				else
				{
					System.out.println("Reprovado");
					reprovados++;
				}
		}
		
		mediaClasse /= 6;
		
		System.out.println("Aprovados: " + aprovados);
		System.out.println("Exame: " + exame);
		System.out.println("Reprovados: " + reprovados);
		System.out.println("Média da classe: " + mediaClasse);
		
		leitor.close();
	}
}
