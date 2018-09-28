package br.com.matheuslopess.aula02.aula;

public class UsaCachorro {
	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.nome = "Ralf";
		meuCachorro.late();
		
		Cachorro outroCachorro = new Cachorro();
		outroCachorro.nome = "Vira Lata";
		outroCachorro.late();
	}
}
