package venda.consoleUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import venda.base.Lista;
import venda.base.Produto;
import venda.base.Venda;
import venda.base.Vendedor;

public class UsaVenda {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		/* Listas dos produtos, vendedores e vendas */
		List<Produto> 	listaProdutos 	= null;
		List<Vendedor> 	listaVendedores = null;
		List<Venda> 	listaVendas 	= null;
		
		/* Atributo de controle do menu, que irá conter o valor correspondente a opção
		 * escolhida pelo usuário */
		int escolha = 0;
		
		/* Objetos para utilizar os recursos de leitura e escrita de arquivos */
		FileInputStream 	fis;
		ObjectInputStream 	ois;
		
		FileOutputStream 	fos;
		ObjectOutputStream 	oos;
		
		/* Tentativa de leitura do arquivo que contém a persistência das listas e outros
		 * atributos. Caso falhe (arquivo não existe), será instanciado uma lista vazia
		 * para cada uma */
		try {
			fis = new FileInputStream(Constante.nomeArquivo);
			ois = new ObjectInputStream(fis);
			
			Vendedor.setComissao(ois.readDouble());
			
			Produto.setQuantidadeProduto(ois.readInt());
			Vendedor.setQuantidadeVendedor(ois.readInt());
			Venda.setQuantidadeVenda(ois.readInt());
			
			listaProdutos 	= (List<Produto>) 	ois.readObject();
			listaVendedores = (List<Vendedor>) 	ois.readObject();
			listaVendas 	= (List<Venda>) 	ois.readObject();
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			listaProdutos 	= new ArrayList<>();
			listaVendedores = new ArrayList<>();
			listaVendas 	= new ArrayList<>();
		} catch (IOException e) {
			System.out.println(Constante.erroIOE);
		} catch(ClassNotFoundException e) {
			System.out.println(Constante.erroCNFE);
		}
		
		System.out.println(Constante.titulo + '\n');
		
		/* Loop de funcionamento do programa, onde só irá finalizar se o usuário escolha a
		 * opção sair, onde será salvo as listas e outros atributos em um arquivo e a condição
		 * de saída será verdadeira */
		do {
			System.out.println(Constante.textoMenu);
			
			do {
				try {
					System.out.println('\n' + "INFORME O VALOR DA OPÇÃO:");
					escolha = leitor.nextInt();
				} catch(InputMismatchException e) {
					System.out.println(Constante.erroIME);
					leitor.nextLine();
				}
			} while(escolha < Constante.TAM_MIN_MENU || escolha > Constante.TAM_MAX_MENU);
			
			System.out.printf("\n");
			
			switch(escolha) {
				case Constante.CADASTRAR_PRODUTO:
					listaProdutos.add(Cadastro.produto(leitor));
					break;
				case Constante.CADASTRAR_VENDEDOR:
					listaVendedores.add(Cadastro.vendedor(leitor));
					break;
				case Constante.CADASTRAR_VENDA:
					listaVendas.add(Cadastro.venda(leitor, listaProdutos, listaVendedores));
					break;
				case Constante.LISTAR_PRODUTOS:
					Lista.listarProdutos(listaProdutos);
					break;
				case Constante.LISTAR_VENDEDORES:
					Lista.listarVendedores(listaVendedores);
					break;
				case Constante.LISTAR_VENDAS:
					Lista.listarVendas(listaVendas);
					break;
				case Constante.ALTERAR_COMISSAO:
					Cadastro.alterarComissao(leitor);
					break;
				case Constante.SAIR:
					try {
						fos = new FileOutputStream(Constante.nomeArquivo);
						oos = new ObjectOutputStream(fos);
						
						oos.writeDouble(Vendedor.getComissao());
						
						oos.writeInt(Produto.getQuantidadeProduto());
						oos.writeInt(Vendedor.getQuantidadeVendedor());
						oos.writeInt(Venda.getQuantidadeVenda());
						
						oos.writeObject(listaProdutos);
						oos.writeObject(listaVendedores);
						oos.writeObject(listaVendas);
						
						oos.close();
						fos.close();
					} catch (FileNotFoundException e) {
						System.out.println(Constante.erroFNFE);
					} catch (IOException e) {
						System.out.println(Constante.erroIOE);
					}
					break;
			}
			
			System.out.printf("\n");
		} while(escolha != Constante.SAIR);
		
		leitor.close();
	}
}
