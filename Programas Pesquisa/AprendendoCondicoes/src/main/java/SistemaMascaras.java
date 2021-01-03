
public class SistemaMascaras {

	public static void main(String[] args) {

		String cliente = " Vanderlei ";
		boolean permicaoComMascara = true;
		boolean comMascara = true;
		double multaComercio = 5000;
		double multaCliente = 500;
		boolean comMascaraDentroComercio = false;

		if (comMascara == permicaoComMascara) {

			System.out.println(cliente + " Acesso liberado para entrar no comercio. ");

		} else {
			System.out.println(cliente + " Acesso não liberado para entrar no comercio ");

		}
		if (comMascaraDentroComercio == permicaoComMascara) {

			System.out.println(" ");
			System.out.println(" Estabelecimento funcionando regular.");

		} else {
			System.out.println(" ");
			System.out.println(" Infelizmente o comercio vai ser multado em R$ " + multaComercio + "\n e o cliente"
					+ cliente + " vai ser multado em R$ " + multaCliente + ".");
		}

	}
}
