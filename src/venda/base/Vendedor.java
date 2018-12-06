package venda.base;

import java.io.Serializable;

public class Vendedor implements Serializable{
	private static final long serialVersionUID = 7777926224250259230L;

	private static int quantidadeVendedor = 0;
	private static double comissao;
	
	private final int codigo;
	
	private String nome;
	private String endereco;
	
	public Vendedor(String nome, String endereco) {
		super();
		
		this.nome = nome;
		this.endereco = endereco;
		
		this.codigo = ++quantidadeVendedor;
	}
	
	@Override
	public String toString() {
		return "Vendedor [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	public static double getComissao() {
		return comissao;
	}
	
	public static void setComissao(double comissao) {
		Vendedor.comissao = comissao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public static int getQuantidadeVendedor() {
		return quantidadeVendedor;
	}
	
	public static void setQuantidadeVendedor(int quantidadeVendedor) {
		Vendedor.quantidadeVendedor = quantidadeVendedor;
	}

	public int getCodigo() {
		return codigo;
	}
}
