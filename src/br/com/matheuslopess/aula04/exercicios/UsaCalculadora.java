package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class UsaCalculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a = 0, b = 0, resultado = 0;
		int opcao = 0, continuar = 0;
		
		System.out.println("Calculadora");
		while(true)
		{
			System.out.println("Digite o primeiro numero:");
			a = leitor.nextDouble();
			
			System.out.println("Digite o segundo numero:");
			b = leitor.nextDouble();
			
			System.out.println("Informe o numero da operação:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			
			opcao = leitor.nextInt();
			
			switch(opcao)
			{
				case 1:
					resultado = Calculadora.somar(a, b);
					break;
				case 2:
					resultado = Calculadora.subtrair(a, b);
					break;
				case 3:
					resultado = Calculadora.multiplicar(a, b);
					break;
				case 4:
					resultado = Calculadora.dividir(a, b);
					break;
				default:
					System.out.println("Opcao invalida");
			}
			
			System.out.println(resultado);
			
			while(true)
			{
				System.out.println("Continuar? 1 - Sim | 2 - Nao");
				continuar = leitor.nextInt();
				
				if(continuar == 1 || continuar == 2)
					break;
			}
			
			if(continuar == 2)
				break;
		}
		
		leitor.close();
	}
}
