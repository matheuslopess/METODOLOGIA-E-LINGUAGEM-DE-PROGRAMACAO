package br.com.matheuslopess.teatro;

import java.util.Scanner;

public class Teatro {
	private Scanner leitor = new Scanner(System.in);
	private Cadeira[] cadeirasFileiraUm;
	private Cadeira[] cadeirasFileiraDois;
	private Usuario[] listaUsuarios;
	private boolean configurado = false;
	
	public void setup() {
		if(!configurado) {
			System.out.println("Informe a quantidade de cadeiras para fileira 1");
			int quantidade = Integer.parseInt(leitor.nextLine());
			cadeirasFileiraUm = new Cadeira[quantidade];
			
			System.out.println("Informe a quantidade de cadeiras para fileira 2");
			quantidade = Integer.parseInt(leitor.nextLine());
			cadeirasFileiraDois = new Cadeira[quantidade];
			
			System.out.println("Informe a quantidade de usuarios");
			quantidade = Integer.parseInt(leitor.nextLine());
			listaUsuarios = new Usuario[quantidade];
		} else {
			System.out.println("Setup já configurado");
		}
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		int posicao = obterPosicaoLivre();
		
		System.out.println("lista de usuários cheia");
	}
	
	public int obterPosicaoLivre() {
		for(int cont = 0; cont < listaUsuarios.length; cont++) {
			if(listaUsuarios[cont] == null)
				return cont;
		}
		
		return -1;
	}
	
	public boolean comprarIngresso() {
		System.out.println("Informe o CPF do usuário");
		String cpf = leitor.nextLine();
		
		return false;
	}
	
	public Usuario buscarUsuario(String cpf) {
		for(int cont = 0; cont < listaUsuarios.length; cont++)
	}
}
