package br.com.matheuslopess.aula03;

public class Conta {
	private String nome;
	private double saldo;
	private long numeroConta;
	
	public boolean setNome(String texto)
	{
		this.nome = texto;
		return true;
	}
	
	public boolean setNumeroConta(long numero)
	{
		if(numero <= 0)
			return false;
		
		this.numeroConta = numero;
		return true;
	}
	
	public double getSaldo(long numeroConta) {
		if(this.numeroConta == numeroConta)
			return this.saldo;
		
		return 0.0;
	}
	
	public String getDados() {
		String dados = "Nome: " + this.nome;
		dados += "Numero: " + this.numeroConta;
		dados += "Saldo: " + this.saldo;
		
		return dados;
	}
	
	public boolean depositar(double valor) {
		if(valor < 0)
			return false;
		else
			this.saldo += valor;
		
		return true;
	}
	
	public boolean sacar(double valor) {
		if(valor < 0 || valor > this.saldo)
			return false;
		else
			this.saldo -= valor;
		
		return true;	
	}
}
