package aulas;

public class SwtichCase {

	public static void main(String[] args) {

		int opcao = 1;
		int opcao1 = 2;
		String nome = " Vanderlei";

		switch (opcao) {

		case 1:

			if (opcao == 1 && opcao1 != 1) {

				System.out.println(" Você escolheu a opção 1" + nome);
			}
			break;
		case 2:
			System.out.println(" você escolheu a opção 2" + nome);
			break;
		}
		String pais = "Argentina";

		switch (pais) {

		case "Brasil":
			System.out.println(" você escolheu o país " + pais);
			break;

		case "Argentina":
			System.out.println(" Você escolheu o pais " + pais);
			break;
		}

	}

}
