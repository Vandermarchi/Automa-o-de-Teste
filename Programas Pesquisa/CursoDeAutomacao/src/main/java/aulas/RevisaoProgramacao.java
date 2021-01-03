package aulas;

public class RevisaoProgramacao {

	static int idade = 32;

	public static void main(String[] args) {

		// declarando variaveis
		int idade = 4;
		int idade1 = 10;
		double nota = 1.0;
		boolean aprovado = true;
		String palavra = "Texto";

		// Revisando if

		/*
		 * if (aprovado) { System.out.println("Aprovado");
		 * 
		 * }else { System.out.println("Reprovado"); }
		 */

		// Revisando if com mais de uma condiçao

		/*
		 * if (idade > 5) { idade1 = 10;
		 * 
		 * }else if (idade1 < 5) { System.out.println(" idade menor que 5");
		 * 
		 * }else if (nota != 1.0) { aprovado = true;
		 * 
		 * }else { System.out.println("Não entrou en nenhuma condição "); }
		 * System.out.println(aprovado);
		 */

		// Revisão if encadeado

		if (palavra == "Texto") {

			System.out.println(" Entrou no if 1 ");

			if (!aprovado) {

				System.out.println(" Entrou no if 2");

				if (idade != 4) {

					System.out.println(" Entrou no if 3");

				} else {
					System.out.println(" Não entrou no if 3 ");
				}
			} else {
				System.out.println(" Não entrou no if 2 ");
			}
		} else {
			System.out.println(" Não entrou em nenhum if");

			// Revisando switch case
			// Revisando while
			// Revisando do while

		}
	}
}
