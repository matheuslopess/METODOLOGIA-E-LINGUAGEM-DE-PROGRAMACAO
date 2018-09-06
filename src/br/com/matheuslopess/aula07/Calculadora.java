package br.com.matheuslopess.aula07;

/**
 * Classe que realiza opera��es matem�ticas.
 * @author matheuslopess
 *
 */

public class Calculadora {
	/**
	 * M�todo que realiza a soma de dois valores.
	 * @param a contendo o valor inteiro a ser somado.
	 * @param b contendo o segundo valor a ser somado.
	 * @return int contendo a soma de a e b.
	 */
	public int somar(int a, int b)
	{
		return (a + b);
	}
	
	/**
	 * M�todo que realiza a subtra��o de dois valores.
	 * @param a contendo o valor inteiro a ser subtraido.
	 * @param b contendo o segundo valor a ser subtraido.
	 * @return int contendo a subtra��o de a e b.
	 */
	public int subtrair(int a, int b)
	{
		return (a - b);
	}
	
	/**
	 * M�todo que realiza a multiplica��o de dois valores.
	 * @param a contendo o valor inteiro a ser multiplicado.
	 * @param b contendo o segundo valor a ser multiplicado.
	 * @return int contendo a multiplica��o de a e b.
	 */
	public int multiplicar(int a, int b)
	{
		return (a * b);
	}
}
