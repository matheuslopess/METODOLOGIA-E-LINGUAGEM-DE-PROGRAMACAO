package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		String nome;
		
		while(true)
		{
			System.out.println("Informe o nome do funcionário: [FIM para sair]");
			nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe o valor do salário:");
			salario = leitor.nextDouble();
			
			leitor.nextLine();
			
			if(salario < 500)
				System.out.println("Valor reajustado: " + (salario * 1.2));
			else
				System.out.println("Funcionário sem direito a aumento");
		}
		
		leitor.close();
	}
}
