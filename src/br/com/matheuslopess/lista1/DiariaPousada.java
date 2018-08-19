package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class DiariaPousada {
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		String nome;
		int diarias = 0, conta = 0, arrecadado = 0;
		
		while(true)
		{
			System.out.println("Informe o nome (FIM para sair):");
			nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe a quantidade de diárias:");
			diarias = leitor.nextInt();
			
			leitor.nextLine();
			
			if(diarias < 10)
				conta = (diarias * 40) + (diarias * 15);
			else
				conta = (diarias * 40) + (diarias * 8);
			
			arrecadado += conta;
			
			System.out.printf("Valor da conta: %d reais\n\n", conta);
		}
		System.out.printf("Total arrecadado: %d reais\n", arrecadado);
	}
}
