package br.com.matheuslopess.aula07;

public class UsaCalculadora {
	public static void main(String[] args) {
		Calculadora minhaCalc = new Calculadora();
		
		System.out.println(minhaCalc.somar(3, 2));
		System.out.println(minhaCalc.subtrair(7, 3));
	}
}
