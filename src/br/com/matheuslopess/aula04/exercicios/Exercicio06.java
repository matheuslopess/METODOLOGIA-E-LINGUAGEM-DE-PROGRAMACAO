package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor de seu salário bruto:");
		double salario = leitor.nextDouble();
		
		System.out.println("Informe o valor da prestação:");
		double prestacao = leitor.nextDouble();
		
		if(prestacao <= (salario * 0.3))
			System.out.println("Empréstimo concedido");
		else
			System.out.println("Empréstimo não concedido");
		
		leitor.close();
	}
}
