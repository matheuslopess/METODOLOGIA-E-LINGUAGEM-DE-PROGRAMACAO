package br.com.matheuslopess.aula07;

/**
 * Classe que realiza operações matemáticas.
 * @author matheuslopess
 *
 */

public class Calculadora {
	/**
	 * Método que realiza a soma de dois valores.
	 * @param a contendo o valor inteiro a ser somado.
	 * @param b contendo o segundo valor a ser somado.
	 * @return int contendo a soma de a e b.
	 */
	public int somar(int a, int b)
	{
		return (a + b);
	}
	
	/**
	 * Método que realiza a subtração de dois valores.
	 * @param a contendo o valor inteiro a ser subtraido.
	 * @param b contendo o segundo valor a ser subtraido.
	 * @return int contendo a subtração de a e b.
	 */
	public int subtrair(int a, int b)
	{
		return (a - b);
	}
	
	/**
	 * Método que realiza a multiplicação de dois valores.
	 * @param a contendo o valor inteiro a ser multiplicado.
	 * @param b contendo o segundo valor a ser multiplicado.
	 * @return int contendo a multiplicação de a e b.
	 */
	public int multiplicar(int a, int b)
	{
		return (a * b);
	}
}
