package exemplo;



public class Transferencia {

	public static void main(String[] args) {

		double saldoOrigem;
		double saldoDestino = 1000;
		double valor = 50;

		saldoOrigem = 100;

		System.out.println("Obrigado por utilizar o nosso sistema.");
		System.out.println("");

		if (saldoOrigem >= valor) {

			saldoOrigem -= valor;
			saldoDestino += valor;

			System.out.println("Valor saldo origem atual é R$ " + saldoOrigem);
			System.out.println("Valor saldo destino atual é R$ " + saldoDestino);

		} else {

			System.out.println("Saldo origem R$ " + saldoOrigem + ", menor que o valor R$ " + valor + ", desjado.");
		}
	}

}


