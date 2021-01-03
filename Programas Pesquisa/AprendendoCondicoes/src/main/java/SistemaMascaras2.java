
public class SistemaMascaras2 {

	public static void main(String[] args) {

		String nome = " Vanderlei ";
		String estabelecimento = " E2E ";
		boolean naoTemMascara = true;
		boolean seEntrarMulta = true;
		int multaCiente = 500;
		int multaComercio = 5000;

		if (naoTemMascara) {
			System.out.println(" O cliente" + nome + " não tem mascara e não pode entrar.");

			if (seEntrarMulta) {

				System.out.println(" O clinte será multado em R$ " + multaCiente + " e o estabelecimento"
						+ estabelecimento + " em R$ " + multaComercio + ".");

			} else {
				System.out.println(" O estabelecimento não sera multado pois todos estão de mascara.");
			}
		} else {
			System.out.println(" O cliente está de mascara pode entrar");
		}

	}
}
