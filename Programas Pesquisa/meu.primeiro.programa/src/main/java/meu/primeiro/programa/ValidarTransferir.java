package meu.primeiro.programa;

public class ValidarTransferir {

	public static void main(String[] args) {

		double saldoConta = 200;
		double transferencia = 50;

		System.out.println(" Obrigado por utilizar o nosso sistema");
		System.out.println("");

		if (saldoConta >= transferencia) {

			saldoConta -= transferencia;

			System.out.println(" Sua transferência de R$ " + transferencia + " foi Aprovada !!!");
			System.out.println("");

			System.out.println(" Valor saldo origem atual é R$ " + saldoConta);

		} else {

			System.out.println(" Sua transferência de R$ " + transferencia + " foi Negada !!!");
			System.out.println("");
			System.out.println(
					" Saldo atual de R$ " + saldoConta + " é menor que o valor R$ " + transferencia + " , desejado ");
		}

	}

}
