package segundoProjeto;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class If {

	private static double saldo = 1.000;

	public static double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem banco E2E Treinamentos");

		int opc = 0;

		System.out.println("");
		System.out.printf("Digite a opção desejada: \n1 - Consultar Saldo \n2 - Enviar mensagem");
		opc = scanner.nextInt();
		String msg;

		switch (opc) {

		case 1:
			System.out.println("O saldo atualizado é: " + getSaldo());
			break;
		case 2:
			System.out.println("Escreva como podemos ajudar? ");
			msg = scanner.next();
			System.out.println("Registramos a sua mensagem, em breve entraremos em contato");
			break;
		case 0:
			scanner.radix();
			break;
		}
	}

}
