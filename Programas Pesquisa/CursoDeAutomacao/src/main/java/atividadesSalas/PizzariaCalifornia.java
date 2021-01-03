package atividadesSalas;

import java.util.Scanner;

public class PizzariaCalifornia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String diaSemana = "QUARTA";
		String nome;

		int pizza;
		int pagamento = 0;
		int entrega = 2;
		int qtdComprada = 0;

		double inicioFuncionamento = 18;
		double fimFuncinamento = 24;
		double horaAtual = 21;
		double saldoDebito = 50;
		double saldoCredito = 1000;
		double saldoVr = 1000;
		double valorPizza = 0;
        boolean segunda = true;
		double comEntrega = 0;
		
		
        if (segunda) {
			
		
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "QUARTA") {
				System.out.println(
						" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando !!!  \n \n APROVEITE A PROMOÇÃO de QUARTA, na compra de 5 pizzas ganha 1 !!!\n ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "TERCA") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!!\n ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "QUINTA") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! \n");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "SEXTA") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!!\n ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "SABADO") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!!\n ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "DOMINDO") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!!\n ");
			}

			System.out.println(" Por favor digite seu nome! ");
			nome = scanner.next();

			System.out.println("");
			System.out.println("Informe a pizza do seu interesse " + nome
					+ " : \n| 1 - Calabresa R$ 35.00\n| 2 - Palmito R$ 45.00\n| 3 - Frango com Catupiri R$ 40.00 \n| 4 - Portuguesa R$ 50.00 \n OBS: Todos os pedidos acompanham um refrigerante DOLLY de 2 litros.");
			pizza = scanner.nextInt();

			switch (pizza) {

			case 1:
				System.out.println(" Pizza Calabresa ");
				valorPizza = 35;
				break;
			case 2:
				System.out.println("Pizza Palmito");
				valorPizza = 45;
				break;
			case 3:
				System.out.println(" Pizza Frango com Catupiri ");
				valorPizza = 40;
				break;
			case 4:
				System.out.println(" Pizza Portuguesa ");
				valorPizza = 50;
				break;
			}
			System.out.println(" ");
			System.out.println("Quantas Pizzas deseja comprar?");
			qtdComprada = scanner.nextInt();

			System.out.println("Escolha a melhor forma de pagamento:\n");
			System.out.println("1 - Debito | 2 - credito | 3 - VR \n");
			pagamento = scanner.nextInt();

			switch (pagamento) {

			case 1:

				if (pagamento == 1) {
					valorPizza = (valorPizza * qtdComprada);
					comEntrega = (valorPizza) + entrega;
					if (saldoDebito >= valorPizza) {
						System.out.println("Valor da Pizza para entrega a domicilio é R$ " + comEntrega + ".\n");
						System.out.println("Valor da Pizza para retirar no balcão é R$ " + valorPizza
								+ ".\n OBS: Serviço temporariamente suspenso devido a pandemia de COVID 19!!!\n");
						System.out.println("Obrigado " + nome + ", a sua compra de R$ " + comEntrega
								+ " foi aprovada com sucesso.\n");

					} else {
						System.out.println("Você não possui saldo suficiente !!!\n");
					}
				}
				break;

			case 2:

				if (pagamento == 2) {
					valorPizza = (valorPizza * qtdComprada);
					comEntrega = (valorPizza) + entrega;
					if (saldoCredito >= valorPizza) {
						System.out.println("Valor da Pizza para entrega a domicilio é R$ " + comEntrega + ".\n");
						System.out.println("Valor da Pizza para retirar no balcão é R$ " + valorPizza
								+ ".\n OBS: Serviço temporariamente suspenso devido a pandemia de COVID 19!!!\n");
						System.out.println("Obrigado " + nome + ", a sua compra de R$ " + comEntrega
								+ " foi aprovada com sucesso.\n");

					} else {
						System.out.println("Você não possui saldo suficiente !!!\n");
					}
				}
				break;
			case 3:

				if (pagamento == 3) {
					valorPizza = (valorPizza * qtdComprada);
					comEntrega = (valorPizza) + entrega;
					if (saldoVr >= valorPizza) {
						System.out.println("Valor da Pizza para entrega a domicilio é R$ " + comEntrega + ".\n");
						System.out.println("Valor da Pizza para retirar no balcão é R$ " + valorPizza
								+ ".\n OBS: Serviço temporariamente suspenso devido a pandemia de COVID 19!!!\n");
						System.out.println("Obrigado " + nome + ", a sua compra de R$ " + comEntrega
								+ " foi aprovada com sucesso.\n");

					} else {
						System.out.println("Você não possui saldo suficiente !!!");
						break;
					}

				}
			}

		} else {
			System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos fechados, abriremos as " + inicioFuncionamento
					+ " horas e fechamos as " + fimFuncinamento + " horas !!!");
		}
	}else {
		System.out.println(" Desculpe mas não abrimos na SEGUNDA FEIRA !!! ");
	}
}}
