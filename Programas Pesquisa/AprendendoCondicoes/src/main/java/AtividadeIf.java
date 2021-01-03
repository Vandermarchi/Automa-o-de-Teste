
public class AtividadeIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stubida

		String nome = " Vanderlei ";
		int idade = 17;
		int idadePermitida = 18;
		double AlturaMinima = 1.75;
		double altura = 1.74;
		boolean acompanhado = true;
		

		if (altura >= AlturaMinima) {
			
			if (idade >= idadePermitida || acompanhado) {

				System.out.println(" Liberado para " + nome);

			} else {
				System.out.println(" Não liberado para " + nome);
			}
		} else {

			System.out.println(nome + ",nao pode entrar por ter menos de 1.75m");

		}

	}
}
