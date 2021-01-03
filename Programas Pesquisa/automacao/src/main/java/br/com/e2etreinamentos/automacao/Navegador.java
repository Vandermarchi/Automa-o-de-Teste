package br.com.e2etreinamentos.automacao;

public class Navegador {

	public void browser(String navegador, String urlApp) {

		switch (navegador) {

		case "CHROME":

			System.out.println(" Você escolheu o navegador " + navegador);
			System.out.println(" Você acessou o site " + urlApp);
			break;

		case "FIREFOX":

			System.out.println(" Você escolheu o navegador " + navegador);
			System.out.println(" Você acessou o site " + urlApp);
			break;
		}

	}

}
