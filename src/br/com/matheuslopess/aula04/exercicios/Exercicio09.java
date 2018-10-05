package br.com.matheuslopess.aula04.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int sexo = 0;
		double peso = 0;
		int idade = 0;
		double altura = 0;
		
		int quantidadePacientes = 0;
		
		double mediaIdadeHomens = 0;
		double somaIdadeHomens = 0;
		double quantidadeIdadeHomens = 0;
		
		int quantidadeMulheresMedianasGordinhas = 0;
		
		int quantidadePacientesJovensAdultos = 0;
		
		String nomeMaisVelho = "Nenhum";
		int idadeMaisVelho = 0;
		
		String nomeMulherMaisBaixa = "Nenhum";
		double alturaMulherMaisBaixa = 0;
		
		
		while(true)
		{
			System.out.println("Informe o nome: [FIM para sair]");
			nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe número que corresponde ao sexo: [1- Masculino ou 2- Feminino]");
			sexo = leitor.nextInt();
			
			System.out.println("Informe o valor do peso: [KG]");
			peso = leitor.nextDouble();
			
			System.out.println("Informe a idade: [ANOS]");
			idade = leitor.nextInt();
			
			System.out.println("Informe a altura: [METROS]");
			altura = leitor.nextDouble();
			
			System.out.println();
			leitor.nextLine();
			
			quantidadePacientes++;
			
			if(sexo == 1)
			{
				somaIdadeHomens += idade;
				quantidadeIdadeHomens++;
			}
			else
			{
				if((altura >= 1.6 && altura <= 1.7) && peso > 70)
					quantidadeMulheresMedianasGordinhas++;
				
				if(altura > alturaMulherMaisBaixa)
				{
					nomeMulherMaisBaixa = nome;
					alturaMulherMaisBaixa = altura;
				}
			}
			
			if(idade >= 18 && idade <= 25)
				quantidadePacientesJovensAdultos++;
			
			if(idade > idadeMaisVelho)
			{
				nomeMaisVelho = nome;
				idadeMaisVelho = idade;
			}
		}
		
		mediaIdadeHomens = somaIdadeHomens / quantidadeIdadeHomens;
		
		System.out.println("Quantidade de pacientes: " + quantidadePacientes);
		System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresMedianasGordinhas);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePacientesJovensAdultos);
		System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
		System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
		
		leitor.close();
	}
}
