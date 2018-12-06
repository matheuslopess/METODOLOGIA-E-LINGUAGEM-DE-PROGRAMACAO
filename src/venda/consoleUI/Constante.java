package venda.consoleUI;

public class Constante {
	public static final String titulo = "SISTEMA DE VENDAS";
	public static final String textoMenu = "MENU" + '\n' + '\n'
											+ "1. CADASTRAR PRODUTO" 	+ '\n'
											+ "2. CADASTRAR VENDEDOR" 	+ '\n'
											+ "3. CADASTRAR VENDA" 		+ '\n'
											+ "4. LISTAR PRODUTOS" 		+ '\n'
											+ "5. LISTAR VENDEDORES"	+ '\n'
											+ "6. LISTAR VENDAS"		+ '\n'
											+ "7. ALTERAR COMISS�O"		+ '\n'
											+ "8. SAIR";
	
	public static final int TAM_MIN_MENU		= 0;
	public static final int TAM_MAX_MENU		= 8;
	
	public static final int CADASTRAR_PRODUTO 	= 1;
	public static final int CADASTRAR_VENDEDOR 	= 2;
	public static final int CADASTRAR_VENDA		= 3;
	public static final int LISTAR_PRODUTOS		= 4;
	public static final int LISTAR_VENDEDORES	= 5;
	public static final int LISTAR_VENDAS		= 6;
	public static final int ALTERAR_COMISSAO	= 7;
	public static final int SAIR 				= 8;
	
	public static final String erroIME = "N�o foi poss�vel ler sua op��o. Tente novamente.";
	public static final String erroIOOBE = "N�o foi poss�vel encontrar o c�digo. Tente novamente.";
	public static final String erroFNFE = "N�o foi poss�vel ter acesso ao arquivo.";
	public static final String erroIOE = "Houve um falha ou interrup��o em alguma opera��o de entrada/sa�da.";
	public static final String erroCNFE = "N�o foi poss�vel encontrar a classe buscada.";
	
	public static final int TAM_MAX_STRING = 100;
	
	public static final String nomeArquivo = "Dados.bin";
}
