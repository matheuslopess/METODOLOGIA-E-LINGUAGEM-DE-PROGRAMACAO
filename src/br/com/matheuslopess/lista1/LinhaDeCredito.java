package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class LinhaDeCredito {
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		double salarioBruto = 0.0, valorPrestacao = 0.0, maxPrestacao = 0.0;
		
		System.out.println("Informe o salário bruto:");
		salarioBruto = leitor.nextDouble();
		
		System.out.println("Informe o valor da prestação:");
		valorPrestacao = leitor.nextDouble();
		
		maxPrestacao = salarioBruto * 0.3;
		
		if(valorPrestacao <= maxPrestacao)
			System.out.println("Empréstimo concedido");
		else
			System.out.println("Empréstimo não concedido");
	}
}
