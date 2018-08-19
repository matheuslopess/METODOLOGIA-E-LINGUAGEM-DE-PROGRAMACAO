package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class AumentoSalario1 {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		double salario = 0.0, aumento = 0.0, valorAumento, novoSalario = 0.0;
		
		System.out.println("Informe o valor do salário:");
		salario = leitor.nextDouble();
		
		System.out.println("Informe o percentual de aumento:");
		aumento = leitor.nextDouble();
		
		valorAumento = salario * (aumento / 100);
		novoSalario = salario + valorAumento;

		System.out.printf("Valor do aumento: %.2f reais\n", valorAumento);
		System.out.printf("Novo salário: %.2f reais\n", novoSalario);
	}

}
