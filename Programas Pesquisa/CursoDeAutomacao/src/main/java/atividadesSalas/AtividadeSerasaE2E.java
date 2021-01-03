package atividadesSalas;

import java.util.Scanner;

public class AtividadeSerasaE2E {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int score = 100;
		int scorePermitido = 275;
		long cpf ; cpf = 11122233344l;
		double cpfDigitado = 0;
		String nome;
		int idadeDigitada = 0;
		double idadeMinima = 18;
		

		System.out.println(" Bem vindo, obrigado por utilizar o nosso sistema SERASA E2E \n ");
		
		System.out.println(" Por favor digite o nome! ");
		nome = scanner.next();

		System.out.println("");
		System.out.println(" Por favor digite a idade " + nome + ".");
		idadeDigitada = scanner.nextInt();

		if (idadeDigitada >= idadeMinima) {
			
			System.out.println("");
			System.out.println(" Você pode acessar o sitema SERASA E2E !!! \n ");

			
			System.out.println(" Por favor "+ nome +" digite o CPF !!! \n Obs. Apenas Numeros.");
			cpfDigitado = scanner.nextLong();
			System.out.println("");
			

			if (cpf == cpfDigitado) {

				System.out.println(" Seja bem Vindo " + nome + " !!! ");
				System.out.println("");
				

				if (score >= scorePermitido) {

					System.out.println(" Seu score esta positivo !!! Parabêns !!!");
					System.out.println("");
					

					System.out.println(" o valor do seu score atual é " + score + " pontos !!! \n ");
					System.out.println(" Obrigado por usar o nosso sistema !!! ");

				} else {

					System.out.println(" Seu score esta Negativado !!!");
					System.out.println("");
					
					System.out.println(" o valor do seu score atual é " + score + " pontos !!! \n");
					System.out.println(" Obrigado por usar o nosso sistema !!! ");


				}
			} else {

				System.out.println(" Numero de CPF inválido ou não cadastrado " + nome + " !!!");
				System.out.println("");
				;
			}
			}else {
				System.out.println(" Você não possui idade suficiente  de 18 anos para acessar o SERASA E2E !!!");
		} 

		}
	}

