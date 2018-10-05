package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int diarias = 0, valor = 0, total = 0;
		
		while(true)
		{
			System.out.println("Informe o nome do cliente: [FIM para sair]");
			nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe a quantidade de diárias:");
			diarias = Integer.parseInt(leitor.nextLine());
			
			valor = diarias * 40;
			
			if(diarias < 10)
				valor += (diarias * 15);
			else
				valor += (diarias * 8);
			
			total += valor;
			
			System.out.println("Valor da conta: R$ " + valor);
		}
		
		System.out.println("Total arrecadado pela pousada: R$ " + total);
		
		leitor.close();
	}
}
