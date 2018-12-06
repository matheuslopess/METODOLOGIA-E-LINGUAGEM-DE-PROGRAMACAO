package venda.base;

import java.util.List;

public class Lista {
	/**
	 * Lista os produtos usando toString para exibir
	 * @param listaProdutos Lista contendo produtos
	 */
	public static void listarProdutos(List<Produto> listaProdutos) {
		int max = listaProdutos.size();
		
		if(listaProdutos.isEmpty()) {
			System.out.println("NÃO HÁ PRODUTOS PARA EXIBIR");
			return;
		}
		
		System.out.println("LISTA DOS PRODUTOS" + '\n');
		for(int i = 0; i < max; i++)
			System.out.println(listaProdutos.get(i).toString());
	}
	
	/**
	 * Lista os vendedores usando toString para exibir
	 * @param listaVendedores Lista contendo vendedores
	 */
	public static void listarVendedores(List<Vendedor> listaVendedores) {
		int max = listaVendedores.size();
		
		if(listaVendedores.isEmpty()) {
			System.out.println("NÃO HÁ VENDEDORES PARA EXIBIR");
			return;
		}
		
		System.out.println("LISTA DOS VENDEDORES" + '\n');
		for(int i = 0; i < max; i++)
			System.out.println(listaVendedores.get(i).toString());
	}
	
	/**
	 * Lista as vendas usando toString para exibir
	 * @param listaVendas Lista contendo vendas
	 */
	public static void listarVendas(List<Venda> listaVendas) {
		int max = listaVendas.size();
		
		if(listaVendas.isEmpty()) {
			System.out.println("NÃO HÁ VENDAS PARA EXIBIR");
			return;
		}
		
		System.out.println("LISTA DAS VENDAS" + '\n');
		for(int i = 0; i < max; i++)
			System.out.println(listaVendas.get(i).toString());
	}
}
