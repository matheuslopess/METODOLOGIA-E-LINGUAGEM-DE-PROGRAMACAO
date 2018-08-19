package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class TotalContaPosto {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		double qntdLitros = 0.0, totalConta = 0.0;
		
		System.out.println("Informe a quantidade de litros de gasolina necessários para abastecer o veículo:");
		qntdLitros = leitor.nextDouble();
		
		totalConta = (qntdLitros * 2.5) + (2 + 2.5);
		
		System.out.printf("Valor total da conta: %.2f reais\n", totalConta);
	}

}
