package meu.primeiro.programa;

import java.util.Scanner;

public class Pizzaria {

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
		double horaAtual = 17;
		double saldoDebito = 1000;
		double saldoCredito = 1000;
		double saldoVr = 1000;
		double valorPizza = 0;

		boolean comEntrega = true;

		if (diaSemana == "SEGUNDA") {
			System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos fechados, não abrimos na SEGUNDA FEIRA!!! ");
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "QUARTA") {
				System.out.println("  Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, APROVEITE A PROMOÇÃO na compra de 5 pizzas ganha 1 !!! ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "TERCA") {
				System.out.println("  Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "QUINTA") {
				System.out.println("  Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "SEXTA") {
				System.out.println("  Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "SABADO") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! ");
			}
		}
		if (inicioFuncionamento <= horaAtual && fimFuncinamento >= horaAtual) {
			if (diaSemana == "DOMINDO") {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos funcinando, faça seu pedido!!! ");
			}
			} else {
				System.out.println(" Bem vindo a PIZZARIA CALIFORNIA estamos fechados, abriremos as " + inicioFuncionamento + " e fechamos as "
						+ fimFuncinamento + " !!!");
			}
		}

	}


