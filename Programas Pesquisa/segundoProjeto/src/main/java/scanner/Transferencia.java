package scanner;

import java.io.IOException;
import java.util.Scanner;

public class Transferencia {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int contaOrigem = 123;
		String nome;
		double saldoDestino = 1000;
		double saldoOrigem = 1000;
		double valor = 0;
		int contaDigitada = 0;

		System.out.println("Bem vindo ao nosso sistema E2E Treinamentos.");
		System.out.println("############################################");
		System.out.println("Digite o seu nome");
		nome = scanner.next();
		System.out.println("Digite a sua conta " + nome + ".");
		contaDigitada = scanner.nextInt();

		if (contaOrigem == contaDigitada) {

			System.out.println(
					"#####################################\nAcesso liberado \nDigite o valor que deseja transferir.");
			valor = scanner.nextDouble();
			if (saldoOrigem >= valor) {
				saldoOrigem -= valor;
				saldoDestino += valor;
				System.out.println(
						"#####################################and\nTransferência realizada com sucesso.\nSaldo conta origem R$ "
								+ saldoOrigem + "\nSaldo conta destino R$ " + saldoDestino + ".");
				System.out.println("################ FIM ################");
				scanner.close();
			} else {
				System.out.println("#####################################\nValor indisponível");
				System.out.println("################ FIM ################");
				scanner.close();
			}

		} else {

			System.out.println("#####################################\nConta inválida.");
			System.out.println("################ FIM ################");
			scanner.close();

		}

	}

}
