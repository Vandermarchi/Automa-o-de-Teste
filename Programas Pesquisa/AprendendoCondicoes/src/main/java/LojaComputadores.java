import java.util.Scanner;

public class LojaComputadores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidadeEstoque = 10;
		double valorComputador = 2500;
		double meuSaldo = 6000;
		int quantidadeDigitada = 0;
		double saldoCartaoCredito = 10000;
		double dinheiro = valorComputador - 100;
		double cartaoDebito = valorComputador - 50;
		double cartaoSemJuros = valorComputador / 3;
		double cartaoComJuros = (valorComputador * 1.1) / 10;
		int opcao;

		System.out.println(" Obrigado por utilizar o nosso sistema \n");

		System.out.println(" Por favor digite quantos computadores!\n ");
		quantidadeDigitada = scanner.nextInt();

		if (quantidadeEstoque >= quantidadeDigitada) {
			System.out.println(" Temos item(s) disponivel!!!!\n ");
		
		
		System.out.println(
				" Por favor digite a forma de pagamento:\n 1 Dinheiro \n 2 Cartão de Debito \n 3 Credito Sem Juros \n 4 Credito com Juros de 1% ");
		opcao = scanner.nextInt();

		switch (opcao) {

		case 1:
			System.out.println(" Pagamento em dinheiro, desconto de R$ 100.0 em cada unidade. \n");
			if (meuSaldo >= valorComputador * quantidadeDigitada) {
				meuSaldo -= dinheiro * quantidadeDigitada;

				System.out.println(" Saldo suficiente !!! \n");

				System.out.println(
						" Seu pagamento será de R$ " + dinheiro * quantidadeDigitada + " e já foi Aprovada !!! \n");

			} else {
				System.out.println(" Saldo insuficiente !!! \n");
			}
			break;

		case 2:
			System.out.println(" Pagamento com cartão de debito, desconto de R$ 50,0 em cada unidade. \n");

			if (meuSaldo >= cartaoDebito * quantidadeDigitada) {
				meuSaldo -= cartaoDebito * quantidadeDigitada;

				System.out.println(" Saldo suficiente !!! \n");

				System.out.println(
						" Seu pagamento será de R$ " + cartaoDebito * quantidadeDigitada + " e já foi Aprovada !!! \n");

			} else {
				System.out.println(" Saldo insuficiente !!! \n");
			}
			break;

		case 3:
			System.out.println(" Pagamento com cartão de credito sem juros!\n");

			if (saldoCartaoCredito >= valorComputador * quantidadeDigitada) {
				saldoCartaoCredito -= cartaoSemJuros * quantidadeDigitada;

				System.out.println(" Saldo suficiente !!! \n");

				System.out.println(" Seu pagamento será de 3 x R$ " + cartaoSemJuros * quantidadeDigitada
						+ " e já foi Aprovada !!! \n");

			} else {
				System.out.println(" Saldo insuficiente !!! \n");
			}
			break;

		case 4:
			System.out.println(" Pagamento com cartão de credito com juros de 1%! \n");

			if (saldoCartaoCredito >= valorComputador * quantidadeDigitada) {
				saldoCartaoCredito -= cartaoComJuros * quantidadeDigitada;

				System.out.println(" Saldo suficiente !!! \n");

				System.out.println(" Seu pagamento será de 10 x R$ " + cartaoComJuros * quantidadeDigitada
						+ " e já foi Aprovada !!! \n");

			} else {
				System.out.println(" Saldo insuficiente !!! \n");
			}
			break;

		}
	}else {
		System.out.println(" Quantidade não disponivel !!!\n");
	}

	}}
