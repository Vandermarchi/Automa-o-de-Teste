package atividadesSalas;

class Sprint01QuatroRodasE2E {

	public static void main(String[] args) {

		String nome = " Vanderlei ";
		int score = 250;
		int scorePermitida = 270;
		boolean avalista = true;
		String tipo = "carro";
		double valorCarro = 25000;
		double meuSaldo = 60000;
		double carroDesconto = (valorCarro * 0.7);
		double cartaCredito = 50000;
		double financiamento12x = (valorCarro * 1.05);
		double financiamento24x = (valorCarro * 1.10);
		double financiamento36x = (valorCarro * 1.15);
		double financiamento48x = (valorCarro * 1.20);
		double financiamento60x = (valorCarro * 1.25);
		int opcao = 4;

		if (tipo == "carro") {
			if (score >= scorePermitida || avalista) {

				System.out.println(" Temos carros disponiveis!!!!\n ");

				System.out.println(
						" Por favor escolha a forma de pagamento:\n 1 Dinheiro . \n 2 Financimento em 12x . \n 3 Financimento em 24x . \n 4 Financimento em 36x . \n 5 Financimento em 48x . \n 6 Financimento em 60x . \n ");
				System.out.println(" Finaciamento liberado para " + nome + "\n");

				switch (opcao) {

				case 1:
					System.out.println(" Pagamento em dinheiro, desconto de 30% em cada veiculo. \n");
					if (meuSaldo >= carroDesconto) {

						System.out.println(" Saldo suficiente !!! \n");

						System.out.println(" Seu pagamento será de R$ " + carroDesconto + " e já foi efetuado !!! \n");

					} else {
						System.out.println(" Saldo insuficiente !!! \n");
					}
					break;

				case 2:
					System.out.println(" Financimento em 12x , com juros de 5%. \n");

					if (cartaCredito >= financiamento12x) {

						System.out.println(" Carta de credito Aprovada!!! \n");

						System.out.println(" Seu pagamento será de 12 x R$ " + financiamento12x / 12
								+ " e já foi Aprovada !!! \n");

					} else {
						System.out.println(" Saldo da carta de credito insuficiente !!! \n");
					}
					break;

				case 3:
					System.out.println(" Financimento em 24x , com juros de 10%.!\n");

					if (cartaCredito >= financiamento24x) {

						System.out.println(" Carta de credito Aprovada!!! \n");

						System.out.println(" Seu pagamento será de 24 x R$ " + financiamento24x / 24
								+ " e já foi Aprovada !!! \n");

					} else {
						System.out.println(" Saldo da carta de credito insuficiente !!! \n");
					}
					break;

				case 4:
					System.out.println(" Financimento em 36x , com juros de 15%.! \n");

					if (cartaCredito >= financiamento36x) {

						System.out.println(" Carta de credito Aprovada!!! \n");

						System.out.println(" Seu pagamento será de 36 x R$ " + financiamento36x / 36
								+ " e já foi Aprovada !!! \n");

					} else {
						System.out.println(" Saldo da carta de credito insuficiente !!! \n");
					}
					break;

				case 5:
					System.out.println(" Financimento em 48x , com juros de 20%.!\n");

					if (cartaCredito >= financiamento48x) {

						System.out.println(" Carta de credito Aprovada !!! \n");

						System.out.println(" Seu pagamento será de 48 x R$ " + financiamento48x / 48
								+ " e já foi Aprovada !!! \n");

					} else {
						System.out.println(" Saldo da carta de credito insuficiente !!! \n");
					}
					break;

				case 6:
					System.out.println(" Financimento em 60x , com juros de 25%.!\n");

					if (cartaCredito >= financiamento60x) {

						System.out.println(" Carta de credito Aprovada !!! \n");

						System.out.println(" Seu pagamento será de 60 x R$ " + financiamento60x / 60
								+ " e já foi Aprovada !!! \n");

					} else {
						System.out.println(" Saldo da carta de credito insuficiente !!! \n");
					}
					break;

				}
			} else {
				System.out.println(" Finaciamento não liberado para " + nome);
			}
		} else {
			System.out.println("Não temos motos disponiveis !!!");
		}
	}

}
