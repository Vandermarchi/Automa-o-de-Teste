package meu.primeiro.programa;

import java.util.Scanner;

public class MeuPrimeiroDesafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int contaOrigem = 123;
		String nome;
		double saldoDestino = 1000;
		double saldoOrigem = 1000;
		double valor = 0;
		int contaDigitada = 0;
		int senhaOrigem = 0000;
		int senhaDigitada = 0;

		System.out.println(" Obrigado por utilizar o nosso sistema");
		System.out.println("***************************************");
		System.out.println(" Por favor digite seu nome! ");
		nome = scanner.next();
		
		System.out.println("**************************************");
		System.out.println(" Por favor digite a sua conta " + nome + ".");
		contaDigitada = scanner.nextInt();
		
		System.out.println("**************************************");
		System.out.println(" Por favor digite sua senha ! " + nome + ".");
		senhaOrigem = scanner.nextInt();
		
		System.out.println("**************************************");

		if (contaOrigem == contaDigitada) {

		

			System.out.println(" Seja bem Vindo!!!! ");
			System.out.println("");

		} else {

			System.out.println(" Sua conta está errada !!!");
			System.out.println("");
		}

			if (senhaOrigem == senhaDigitada) {

				

				System.out.println(" Sua senha foi Aprovada !!!");
				System.out.println("");

				System.out.println(" Valor saldo origem atual é R$ " + saldoOrigem);

			} else {

				System.out.println(" Sua senha foi Negada !!!");
				System.out.println("");
			}

				if (saldoOrigem >= saldoDestino) {

					saldoOrigem -= saldoDestino;

					System.out.println(" Sua transferência de R$ " + valor + " foi Aprovada !!!");
					System.out.println("");

					System.out.println(" Valor saldo origem atual é R$ " + saldoOrigem);

				} else {

					System.out.println(" Sua transferência de R$ " + valor + " foi Negada !!!");
					System.out.println("");
					System.out.println(
							" Saldo atual de R$ " + saldoOrigem + " é menor que o valor R$ " + valor + " , desejado ");
				}
			}
		}
	
