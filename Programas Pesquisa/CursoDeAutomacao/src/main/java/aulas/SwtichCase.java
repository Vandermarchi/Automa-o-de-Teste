package aulas;

public class SwtichCase {

	public static void main(String[] args) {

		int opcao = 1;
		int opcao1 = 2;
		String nome = " Vanderlei";

		switch (opcao) {

		case 1:

			if (opcao == 1 && opcao1 != 1) {

				System.out.println(" Voc� escolheu a op��o 1" + nome);
			}
			break;
		case 2:
			System.out.println(" voc� escolheu a op��o 2" + nome);
			break;
		}
		String pais = "Argentina";

		switch (pais) {

		case "Brasil":
			System.out.println(" voc� escolheu o pa�s " + pais);
			break;

		case "Argentina":
			System.out.println(" Voc� escolheu o pais " + pais);
			break;
		}

	}

}
