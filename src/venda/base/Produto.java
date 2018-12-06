package venda.base;

import java.io.Serializable;

public class Produto implements Serializable{
	private static final long serialVersionUID = 6791019205592432004L;

	private static int quantidadeProduto = 0;
	
	private final int codigo;
	
	private String descricao;
	private double valorVenda;
	private double valorCusto;
	private boolean promocao;
	
	public Produto(String descricao, double valorVenda, double valorCusto, boolean promocao) {
		super();
		
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
		
		this.codigo = ++quantidadeProduto;
	}
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCusto="
				+ valorCusto + ", promocao=" + promocao + "]";
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public double getValorCusto() {
		return valorCusto;
	}
	
	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}
	
	public boolean isPromocao() {
		return promocao;
	}
	
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	public static int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	public static void setQuantidadeProduto(int quantidadeProduto) {
		Produto.quantidadeProduto = quantidadeProduto;
	}

	public int getCodigo() {
		return codigo;
	}
}
