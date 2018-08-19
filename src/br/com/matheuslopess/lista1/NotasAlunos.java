package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class NotasAlunos {
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		double nota1 = 0.0, nota2 = 0.0, media = 0.0;
		int aprovados = 0, exame = 0, reprovados = 0;
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Aluno " + (i + 1));
			System.out.println("Informe a primeira nota:");
			nota1 = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota:");
			nota2 = leitor.nextDouble();
			
			media = (nota1 + nota2) / 2.0;
			
			System.out.printf("Média: %.2f\n\n", media);
			
			if(media > 7.0)
				aprovados++;
			else
				if(media >= 3.0)
					exame++;
				else
					reprovados++;
		}
		
		System.out.println("Aprovados: " + aprovados);
		System.out.println("Exame: " + exame);
		System.out.println("Reprovados: " + reprovados);
	}
}
