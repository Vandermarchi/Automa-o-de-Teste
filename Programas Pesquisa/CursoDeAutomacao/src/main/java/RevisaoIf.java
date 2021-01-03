
public class RevisaoIf {
	public static void main(String[] args) {

		// variavem é uma locação de memoria no computador

		int i = 10;
		double y = 2.1;
		String c = "Vanderlei";
		boolean d = true;
		char z = 61;

		// if é uma condição SE ou SE nao

		if (!d) {
			System.out.println(" boolean = a true ");

		} else if (i <= 10) {
			System.out.println(" i <= a 10 ");
		} else if (y == 2.0) {
			System.out.println(" y == a 2.0");

		} else if (c != "Vanderlei") {
			System.out.println(" a variavel c e diferente do meu nome");
		} else {
			System.out.println(" não executou o if de nenhuma condição.");
		}

		// if encadeado ou seja if dentro de outro if
		if (d) {
			if (i == 11) {
				if (y == 2.1) {
					if (c == "Vanderlei") {
						System.out.println(" Entrou em todos os ifs");

					}

				}

			} else {
				System.out.println(" Nao entrou no if do int");
			}

		} else {
			System.out.println(" nao entrou no if do boolean");
		}

	}

}
