package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class AumentoSalario2 {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		String nome;
		double salario = 0.0, novoSalario = 0.0;
		
		while(true)
		{
			System.out.println("Informe o nome do funcion�rio (FIM para sair):");
			nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe o valor do sal�rio:");
			salario = leitor.nextDouble();
			
			leitor.nextLine();
			
			if(salario < 500.0)
			{
				novoSalario = salario * 1.2;
				System.out.printf("Sal�rio reajustado: %.2f\n\n", novoSalario);
			}
			else
				System.out.printf("Funcion�rio sem direito a aumento\n\n");
		}
			
	}

}
