package br.com.matheuslopess.lista1;
import java.util.Scanner;

public class PacientesClinica {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		// Atributos locais
		String nome = null, sexo = null, nomeMaisVelho = "Não há", nomeMaisBaixa = "Não há";
		double peso = 0.0, altura = 0.0, mediaIdadeHomens = 0.0, somaIdadeHomens = 0.0, qntdIdadeHomens = 0.0, alturaMaisBaixa = 0.0;
		int idade = 0, qntdPacientes = 0, qntdMulheresGordinhas = 0, qntdPacientesAdultos = 0, idadeMaisVelho = 0;
		
		while(true)
		{
			// Entrada de informações do paciente
			System.out.println("Informe o nome (FIM para sair):");
			nome = leitor.nextLine();
			
			// Condição de finalização do loop
			if(nome.equalsIgnoreCase("FIM"))
				break;
			
			System.out.println("Informe o sexo (M para masculino e F para feminino):");
			sexo = leitor.next();
			
			System.out.println("Informe o peso (em kg):");
			peso = leitor.nextDouble();
			
			System.out.println("Informe a altura (em metros):");
			altura = leitor.nextDouble();
			
			System.out.println("Informe a idade (em anos):");
			idade = leitor.nextInt();
			
			
			
			// Condições para inserir no relatório
			qntdPacientes++;
			
			if(sexo.equalsIgnoreCase("M"))
			{
				somaIdadeHomens += idade;
				qntdIdadeHomens++;
			}
			else
				if(sexo.equalsIgnoreCase("F"))
				{
					if(altura >= 1.6 && altura <= 1.7 && peso > 70.0)
						qntdMulheresGordinhas++;
					
					if(altura > alturaMaisBaixa)
					{
						nomeMaisBaixa = nome;
						alturaMaisBaixa = altura;
					}
				}
				else
					System.out.println("Erro: sexo informado não compreendido");
			
			if(idade >= 18 && idade <= 25)
				qntdPacientesAdultos++;
			
			if(idade > idadeMaisVelho)
			{
				nomeMaisVelho = nome;
				idadeMaisVelho = idade;
			}
			
			leitor.nextLine();
			System.out.println();
		}
		
		// Impede de retornar NaN quando o denominador for zero
		if(qntdIdadeHomens > 0)
			mediaIdadeHomens = somaIdadeHomens / qntdIdadeHomens;
		
		// Exibe o relatório
		System.out.printf("Relatório\n");
		System.out.printf("Quantidade de pacientes: %d\n", qntdPacientes);
		System.out.printf("Média de idade dos homens: %.2f\n", mediaIdadeHomens);
		System.out.printf("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: %d\n", qntdMulheresGordinhas);
		System.out.printf("Quantidade de pacientes com idade entre 18 e 25: %d\n", qntdPacientesAdultos);
		System.out.printf("Nome do paciente mais velho: %s\n", nomeMaisVelho);
		System.out.printf("Nome da mulher mais baixa: %s\n", nomeMaisBaixa);
	}

}
