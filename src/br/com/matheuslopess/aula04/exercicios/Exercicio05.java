package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros de gasolina que foram necessários para abastecer o veículo:");
		double litrosGas = leitor.nextDouble();
		
		double valorTotal = (2 * 3) + (litrosGas * 2.5);
		System.out.println("Valor total: R$" + valorTotal);
		
		leitor.close();
	}
}
