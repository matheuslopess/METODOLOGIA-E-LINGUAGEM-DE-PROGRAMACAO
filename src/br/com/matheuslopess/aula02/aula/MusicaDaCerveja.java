package br.com.matheuslopess.aula02.aula;

public class MusicaDaCerveja {

	public static void main(String[] args) {
		int cervejas = 99;
		
		while(cervejas > 0)
		{
			System.out.println(cervejas + " cervejas na freezer.");
			
			System.out.println("Pego uma garrafa, passo pra frente");
			cervejas--;
			
			System.out.println("Agora são " + cervejas + " cervejas na freezer");
		}

	}

}
