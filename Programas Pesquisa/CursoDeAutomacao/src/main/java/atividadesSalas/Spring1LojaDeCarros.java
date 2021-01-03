package atividadesSalas;

import java.util.Scanner;

public class Spring1LojaDeCarros {

	public static void main(String[] args) {

		String nome = " Vanderlei ";
		int score = 280;
		int scorePermitida = 270;
		boolean avalista = true;
		String tipo = "carro";
		double valorVeiculo = 0;
		double meuSaldo = 10000;
		double cartaCredito = 100000;
		int opcaoPagamento;
		int marca; // 1 - Honda | 2 - Hiunday
		int modelo; // Escolha o modelo
		int estoque = 2; // quantidade no estoque
		int qtdComprada = 0; // quantidade comprada pela cliente
		valorVeiculo = (qtdComprada * valorVeiculo);

		Scanner scanner = new Scanner(System.in);

		if (tipo == "carro") {

			System.out.println(" Bem vindo" + nome + "a Quatro Rodas E2E !!! \n");

			System.out.println("Informe a marca do seu interesse: \n1 - Honda | 2 - Hiunday \n");
			marca = scanner.nextInt();

			System.out.println("");

			if (marca == 1) {

				System.out.println("Aproveite as promoções Honda !!!\n");

				System.out.println("Escolha o modelo com as opções 1 - HRV | 2 - WR-V | 3 - Civic ");
				modelo = scanner.nextInt();

				switch (modelo) {

				case 1:
					System.out.println("HONDA HR-V 1.8 16V FLEX EX 4P AUTOMÁTICO - R$ 76.000 \n");
					valorVeiculo = 76.000;
					break;
				case 2:
					System.out.println("HONDA WR-V 1.5 16V FLEXONE EX CVT  - R$ 65.000 \n");
					valorVeiculo = 65.000;
					break;
				case 3:
					System.out.println("HONDA Civic 2.0 16V FLEXONE LX CVT  - R$ 90.000 \n");
					valorVeiculo = 90.000;
					break;
				}
			} else if (marca == 2) {
				System.out.println("Aproveite as promoções Hiunday !!! \n");

				System.out.println("Escolha o modelo com as opções 1 - Creta | 2 - IX35 | 3 - I30 \n ");
				modelo = scanner.nextInt();

				switch (modelo) {

				case 1:
					System.out.println("Hiunday Creta 1.8 16V FLEX EX 4P AUTOMÁTICO - R$ 86.000 \n");
					valorVeiculo = 86.000;
					break;
				case 2:
					System.out.println("Hiunday IX35 1.5 16V FLEXONE EX CVT  - R$ 105.000 \n");
					valorVeiculo = 105.000;
					break;
				case 3:
					System.out.println("Hiunday I30 2.0 16V FLEXONE LX CVT  - R$ 68.000 \n");
					valorVeiculo = 68.000;
					break;
				}
			}

			System.out.println("Quantos carros deseja comprar?");
			qtdComprada = scanner.nextInt();

			System.out.println("Parabéns o seu carro foi adicionado ao carrinho de compra.\n");

			if (score >= scorePermitida || avalista) {

				if (estoque >= qtdComprada) {

					System.out.println(" Temos carros disponiveis!!!!\n ");

					System.out.println(
							" Por favor escolha a forma de pagamento: \n 1 Dinheiro . \n 2 Financimento em 12x . \n 3 Financimento em 24x . \n 4 Financimento em 36x . \n 5 Financimento em 48x . \n 6 Financimento em 60x . ");
					opcaoPagamento = scanner.nextInt();

					switch (opcaoPagamento) {

					case 1:
						System.out.println(" Pagamento em dinheiro, desconto de 30% em cada veiculo. \n");

						if (meuSaldo >= (valorVeiculo * 0.7)) {

							System.out.println(" Saldo suficiente !!! \n");

							System.out.println(
									" Seu pagamento será de R$ " + (valorVeiculo * 0.7) + " e já foi aprovado !!! \n");

						} else {

							System.out.println(" Saldo insuficiente !!! \n");
						}
						break;

					case 2:
						System.out.println(" Financimento em 12x , com juros de 5%. \n");

						if (cartaCredito >= (valorVeiculo * 1.05)) {

							System.out.println(" Carta de credito Aprovada!!! \n");

							System.out.println(" Seu pagamento será de 12 x R$ " + (valorVeiculo * 1.05) / 12
									+ " e já foi Aprovada !!! \n");

						} else {
							System.out.println(" Saldo da carta de credito insuficiente !!! \n");
						}
						break;

					case 3:
						System.out.println(" Financimento em 24x , com juros de 10%.!\n");

						if (cartaCredito >= (valorVeiculo * 1.10)) {

							System.out.println(" Carta de credito Aprovada!!! \n");

							System.out.println(" Seu pagamento será de 24 x R$ " + (valorVeiculo * 1.10) / 24
									+ " e já foi Aprovada !!! \n");

						} else {
							System.out.println(" Saldo da carta de credito insuficiente !!! \n");
						}
						break;

					case 4:
						System.out.println(" Financimento em 36x , com juros de 15%.! \n");

						if (cartaCredito >= (valorVeiculo * 1.15)) {

							System.out.println(" Carta de credito Aprovada!!! \n");

							System.out.println(" Seu pagamento será de 36 x R$ " + (valorVeiculo * 1.15) / 36
									+ " e já foi Aprovada !!! \n");

						} else {
							System.out.println(" Saldo da carta de credito insuficiente !!! \n");
						}
						break;

					case 5:
						System.out.println(" Financimento em 48x , com juros de 20%.!\n");

						if (cartaCredito >= (valorVeiculo * 1.20)) {

							System.out.println(" Carta de credito Aprovada !!! \n");

							System.out.println(" Seu pagamento será de 48 x R$ " + (valorVeiculo * 1.20) / 48
									+ " e já foi Aprovada !!! \n");

						} else {
							System.out.println(" Saldo da carta de credito insuficiente !!! \n");
						}
						break;

					case 6:
						System.out.println(" Financimento em 60x , com juros de 25%.!\n");

						if (cartaCredito >= (valorVeiculo * 1.25)) {

							System.out.println(" Carta de credito Aprovada !!! \n");

							System.out.println(" Seu pagamento será de 60 x R$ " + (valorVeiculo * 1.25) / 60
									+ " e já foi Aprovada !!! \n");

						} else {
							System.out.println(" Saldo da carta de credito insuficiente !!! \n");
						}
						break;

					}
				}
			} else {
				System.out.println(" Não temos motos disponiveis !!!");
			}
		} else {
			System.out.println("Finaciamento não liberado para " + nome);
		}
	}
}
