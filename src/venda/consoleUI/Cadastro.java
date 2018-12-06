package venda.consoleUI;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import venda.base.Produto;
import venda.base.Venda;
import venda.base.Vendedor;

public class Cadastro {
	/**
	 * Cadastra um produto de forma que siga espeficicações para não haver futuros erros
	 * @param leitor Scanner para receber informação do usuário
	 * @return Objeto de classe Produto inicializado
	 */
	public static Produto produto(Scanner leitor) {
		String descricao = "";
		double valorVenda = -1;
		double valorCusto = -1;
		boolean promocao = false;
		
		int valorPromocao = -1;
		
		System.out.println("CADASTRO DE PRODUTO" + '\n');
		
		if(leitor.hasNextLine())
			leitor.nextLine();
		
		do {
			System.out.println("INFORME A DESCRIÇÃO:");
			descricao = leitor.nextLine();
		} while(descricao.length() == 0 || descricao.length() > 100);
		
		do {
			try {
				System.out.println("INFORME O VALOR DE VENDA:");
				valorVenda = leitor.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			}
		} while(valorVenda < 0 || valorVenda > Integer.MAX_VALUE);
		
		do {
			try {
				System.out.println("INFORME O VALOR DE CUSTO:");
				valorCusto = leitor.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			}
		} while(valorCusto < 0 || valorCusto > valorVenda);
		
		do {
			try {
				System.out.println("INFORME SE O PRODUTO ESTÁ EM PROMOÇÃO: (1- SIM / 2- NÃO)");
				valorPromocao = leitor.nextInt();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			}
		} while(valorPromocao != 1 && valorPromocao != 2);
		
		if(valorPromocao == 1)
			promocao = true;
		
		Produto produto = new Produto(descricao, valorVenda, valorCusto, promocao);
		
		System.out.println('\n' + "CODIGO: " + produto.getCodigo());
		
		return produto;
	}
	
	/**
	 * Cadastra um vendedor de forma que siga espeficicações para não haver futuros erros
	 * @param leitor Scanner para receber informação do usuário
	 * @return Objeto de classe Vendedor inicializado
	 */
	public static Vendedor vendedor(Scanner leitor) {
		String nome = "";
		String endereco = "";
		
		System.out.println("CADASTRO DE VENDEDOR" + '\n');
		
		if(leitor.hasNextLine())
			leitor.nextLine();
		
		do {
			System.out.println("INFORME O NOME:");
			nome = leitor.nextLine();
		} while(nome.length() == 0 || nome.length() > Constante.TAM_MAX_STRING);
	
		do {
			System.out.println("INFORME O ENDEREÇO:");
			endereco = leitor.nextLine();
		} while(endereco.length() == 0 || endereco.length() > Constante.TAM_MAX_STRING);
		
		Vendedor vendedor = new Vendedor(nome, endereco);
		
		System.out.println('\n' + "CÓDIGO: " + vendedor.getCodigo());
		
		return vendedor;
	}
	
	/**
	 * Cadastra uma venda de dorma que siga espeficicações para não haver futuros erros
	 * @param leitor Scanner para receber informação do usuário
	 * @param listaProdutos Lista contendo produtos
	 * @param listaVendedores Lista contendo vendedores
	 * @return Objeto da classe Venda inicializado
	 */
	public static Venda venda(Scanner leitor, List<Produto> listaProdutos, List<Vendedor> listaVendedores) {
		Venda venda = null;
		
		Produto produto = null;
		Vendedor vendedor = null;
		int quantidadeItem = 0;
		
		int codigoProduto = 0;
		int codigoVendedor = 0;
		double valorDesconto = 0;
		
		System.out.println("CADASTRO DE VENDA" + '\n');
		
		if(listaProdutos.isEmpty()) {
			System.out.println("NÃO HÁ PRODUTOS CADASTRADOS" + '\n');
			return null;
		}
		
		if(listaVendedores.isEmpty()) {
			System.out.println("NÃO HÁ VENDEDORES CADASTRADOS" + '\n');
			return null;
		}
		
		do {
			try {
				System.out.println("INFORME O CÓDIGO DO PRODUTO:");
				codigoProduto = leitor.nextInt();
				produto = listaProdutos.get(--codigoProduto);
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			} catch(IndexOutOfBoundsException e) {
				System.out.println(Constante.erroIOOBE);
			}
		} while(produto == null);
		
		do {
			try {
				System.out.println("INFORME O CÓDIGO DO VENDEDOR:");
				codigoVendedor = leitor.nextInt();
				vendedor = listaVendedores.get(--codigoVendedor);
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			} catch(IndexOutOfBoundsException e) {
				System.out.println(Constante.erroIOOBE);
			}
		} while(vendedor == null);
		
		do {
			try {
				System.out.println("INFORME A QUANTIDADE DE ITENS:");
				quantidadeItem = leitor.nextInt();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
			}
		} while(quantidadeItem < 0 || quantidadeItem > Integer.MAX_VALUE);
		
		venda = new Venda(vendedor, produto, quantidadeItem);
		
		do {
			try {
				System.out.println("INFORME O VALOR DO DESCONTO: (MAX: " + venda.getValor() + ")");
				valorDesconto = leitor.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			}
		} while(valorDesconto < 0 || valorDesconto > venda.getValor());
		
		if(valorDesconto > 0) {
			venda.setValorDesconto(valorDesconto);
			venda.calcularValor();
		}
		
		System.out.println('\n' + "CÓDIGO: " + venda.getCodigo());
		System.out.println("VALOR: " + venda.getValor());
		
		return venda;
	}
	
	/**
	 * Altera o valor da comissão dos vendedores
	 * @param leitor Scanner para receber informação do usuário
	 */
	public static void alterarComissao(Scanner leitor) {
		double novaPorcentagem = 0;
		
		System.out.println("ALTERAR COMISSÃO" + '\n');
		
		System.out.println("PORCENTAGEM DA COMISSÃO ATUAL: " + Vendedor.getComissao() * 100 + "%" + '\n');
		
		do {
			try {
				System.out.println("INFORME A NOVA PORCENTAGEM DE COMISSÃO:");
				novaPorcentagem = leitor.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println(Constante.erroIME);
				leitor.nextLine();
			}
		} while(novaPorcentagem < 0 && novaPorcentagem > 100);
		
		Vendedor.setComissao(novaPorcentagem / 100);
	}
}
