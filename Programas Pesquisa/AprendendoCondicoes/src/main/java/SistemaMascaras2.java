
public class SistemaMascaras2 {

	public static void main(String[] args) {

		String nome = " Vanderlei ";
		String estabelecimento = " E2E ";
		boolean naoTemMascara = true;
		boolean seEntrarMulta = true;
		int multaCiente = 500;
		int multaComercio = 5000;

		if (naoTemMascara) {
			System.out.println(" O cliente" + nome + " n�o tem mascara e n�o pode entrar.");

			if (seEntrarMulta) {

				System.out.println(" O clinte ser� multado em R$ " + multaCiente + " e o estabelecimento"
						+ estabelecimento + " em R$ " + multaComercio + ".");

			} else {
				System.out.println(" O estabelecimento n�o sera multado pois todos est�o de mascara.");
			}
		} else {
			System.out.println(" O cliente est� de mascara pode entrar");
		}

	}
}
