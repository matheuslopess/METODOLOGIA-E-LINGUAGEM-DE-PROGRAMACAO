package venda.consoleUI;
/*
package interfaceTextual;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import backend.*;

public class UsaVenda {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		List<Produto> listaProdutos = new ArrayList<>();
		List<Vendedor> listaVendedores = new ArrayList<>();
		List<Venda> listaVendas = new ArrayList<>();
		
		
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(Constante.nomeArquivoListaProdutos)));

			listaProdutos.add((Produto)ois.readObject());

			ois.close();
		} catch (IOException e1) {
			System.out.println("Erro IOException");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ClassNotFoundException");
		}
		
		int escolha = 0;
		
		System.out.println(Constante.titulo + '\n');
		
		do {
			System.out.println(Constante.textoMenu + '\n');
			
			do {
				try {
					System.out.println("Informe o valor da opção:");
					escolha = leitor.nextInt();
				} catch(InputMismatchException e) {
					System.out.println(Constante.erroIME + '\n');
					leitor.nextLine();
				}
			} while(escolha < Constante.TAM_MIN_MENU && escolha > Constante.TAM_MAX_MENU);
			
			switch(escolha) {
				case Constante.CADASTRAR_PRODUTO:
					listaProdutos.add(Cadastro.produto(leitor));
					break;
				case Constante.CADASTRAR_VENDEDOR:
					break;
				case Constante.CADASTRAR_VENDA:
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
					break;
				case Constante.SAIR:
					try {
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Produtos.dat")));
						System.out.println("OOS OK");
						
						for(int i = 0; i < listaProdutos.size(); i++) {
							oos.writeObject(listaProdutos.get(i));
						}
						System.out.println("WRITE OK");
						
						oos.flush();
						oos.close();
						System.out.println("FLUSH CLOSE OK");
					} catch(IOException e) {
						System.out.println("Ocorreu algum erro relacionado a IOException");
					}
					break;
			}
		} while(escolha != Constante.SAIR);
		
		leitor.close();
	}

}
*/
