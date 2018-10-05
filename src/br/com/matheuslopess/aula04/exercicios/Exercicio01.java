package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o salario:");
		double salario = leitor.nextDouble();
		
		System.out.println("Informe o percentual:");
		double percentual = leitor.nextDouble();
		
		double novoSalario = salario * (percentual / 100);
		
		System.out.println("Novo salario: " + novoSalario);
		
		leitor.close();
	}
}
