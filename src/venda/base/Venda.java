package venda.base;

import java.io.Serializable;

public class Venda implements Serializable{
	private static final long serialVersionUID = -6394760453329654894L;

	private static int quantidadeVenda = 0;
	
	private final int codigo;
	
	private Vendedor vendedor;
	private Produto produto;
	private int quantidadeItem;
	private double valor;
	private double valorDesconto;
	
	public Venda(Vendedor vendedor, Produto produto, int quantidadeItem) {
		super();
		
		this.vendedor = vendedor;
		this.produto = produto;
		this.quantidadeItem = quantidadeItem;
		
		this.codigo = ++quantidadeVenda;
		
		this.valorDesconto = 0;
		
		this.valor = quantidadeItem * produto.getValorVenda();
	}
	
	@Override
	public String toString() {
		return "Venda [codigo=" + codigo + ", vendedor=" + vendedor.getNome() + ", produto=" + produto.getDescricao() + ", quantidadeItem="
				+ quantidadeItem + ", valor=" + valor + ", valorDesconto=" + valorDesconto + "]";
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getquantidadeItem() {
		return quantidadeItem;
	}
	
	public void setquantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public static int getQuantidadeVenda() {
		return quantidadeVenda;
	}
	
	public static void setQuantidadeVenda(int quantidadeVenda) {
		Venda.quantidadeVenda = quantidadeVenda;
	}

	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Calcula o valor da venda observando a quantidade de itens, o valor de venda do produto e o desconto aplicado.
	 */
	public void calcularValor() {
		this.valor = (this.quantidadeItem * this.produto.getValorVenda()) - this.valorDesconto;
	}
}
