package br.com.matheuslopess.aula02.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double consumoMedio = 0, distanciaTotal = 0, combustivelGasto = 0;
		
		System.out.println("Informe a distância total percorrida:");
		distanciaTotal = leitor.nextDouble();
		
		System.out.println("Informe o total de combustível gasto:");
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = distanciaTotal / combustivelGasto;
		
		System.out.println("Consumo médio: " + consumoMedio);
	}

}
