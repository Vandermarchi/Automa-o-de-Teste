package meu.primeiro.programa;

public class validarIdade {

	public static void main(String[] args) {
		
		int idade = 41;
		int idadePermitida = 18;
		String nome = " Vanderlei de Marchi ";
		if (idade>= idadePermitida) {
			System.out.println(nome+" a sua idade � permitida. ");
		}else {
			System.out.println(nome+" a sua idade n�o � permitida. ");
		}
		

	}

}
