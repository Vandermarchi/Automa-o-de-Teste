package br.com.e2etreinamentos.rodizio;

public class RodizioAtividade {

	public static void main(String[] args) {

		double inicioRodizio = 7.0;
		double fimRodizio = 16.0;
		double horaAtual = 11.0;
		String diaSemana = "SEXTA";
		int placaCarro = 9;

		if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {

			if (diaSemana == "SEGUNDA") {
				int placa1 = 1;
				int placa2 = 2;
				if (placaCarro == placa1 || placaCarro == placa2) {
					System.out.println(" Placas finais " + placa1 + " e " + placa2 + " não são permitidos rodar na "
							+ diaSemana + " FEIRA.\n Deixe  seu carro em casa!!! ");

				} else {
					System.out.println(" Placa " + placaCarro + " liberada para rodar na " + diaSemana + " FEIRA.");

				}

			}
		}
		if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {

			if (diaSemana == "TERÇA") {
				int placa1 = 3;
				int placa2 = 4;
				if (placaCarro == placa1 || placaCarro == placa2) {
					System.out.println(" Placas finais " + placa1 + " e " + placa2 + " não são permitidos rodar na "
							+ diaSemana + " FEIRA.\n Deixe  seu carro em casa!!! ");

				} else {
					System.out.println(" Placa " + placaCarro + " liberada para rodar na " + diaSemana + " FEIRA.");

				}

			}
		}
		if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {

			if (diaSemana == "QUARTA") {
				int placa1 = 5;
				int placa2 = 6;
				if (placaCarro == placa1 || placaCarro == placa2) {
					System.out.println(" Placas finais " + placa1 + " e " + placa2 + " não são permitidos rodar na "
							+ diaSemana + " FEIRA.\n Deixe  seu carro em casa!!! ");

				} else {
					System.out.println(" Placa " + placaCarro + " liberada para rodar na " + diaSemana + " FEIRA.");

				}

			}
		}
		if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {

			if (diaSemana == "QUINTA") {
				int placa1 = 7;
				int placa2 = 8;
				if (placaCarro == placa1 || placaCarro == placa2) {
					System.out.println(" Placas finais " + placa1 + " e " + placa2 + " não são permitidos rodar na "
							+ diaSemana + " FEIRA.\n Deixe  seu carro em casa!!! ");

				} else {
					System.out.println(" Placa " + placaCarro + " liberada para rodar na " + diaSemana + " FEIRA.");

				}

			}
		}
		if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {

			if (diaSemana == "SEXTA") {
				int placa1 = 9;
				int placa2 = 0;
				if (placaCarro == placa1 || placaCarro == placa2) {
					System.out.println(" Placas finais " + placa1 + " e " + placa2 + " não são permitidos rodar na "
							+ diaSemana + " FEIRA.\n Deixe  seu carro em casa!!! ");

				} else {
					System.out.println(" Placa " + placaCarro + " liberada para rodar na " + diaSemana + " FEIRA.");

				}

			}
		} else {
			System.out.println(" Todos os carros estão liberados. ");
		}

	}

}
