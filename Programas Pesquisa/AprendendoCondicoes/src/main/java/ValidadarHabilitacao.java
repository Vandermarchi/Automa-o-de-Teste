import java.util.Scanner;

public class ValidadarHabilitacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String motorista;
		double idade;
		double idadeMinima = 18;
		double idadeEmancipado = 16;
		boolean emancipado = false;

		System.out.println(" Por favor digite seu nome! ");
		motorista = scanner.next();

		System.out.println("");
		System.out.println(motorista + " digite sua idade: ");
		idade = scanner.nextInt();

		if (idade >= idadeMinima) {
			System.out.println("");
			System.out.println("Voc� pode ser habilitado  " + motorista);

		} else {
	if (idade >= idadeMinima || emancipado) {
				System.out.println("");
				System.out.println(" Voc� " + motorista + " ,pode ser habilitado por ter o minimo de " + idadeEmancipado
						+ " anos \n e ser emancipado");

		
			} else {
				System.out.println("");
				System.out.println(" Voc� " + motorista + ",n�o pode ser Habilitado pois nao �  maior de " + idadeMinima
						+ " \n , ou n�o tem " + idadeEmancipado + " anos ou mais e j� esta emancipado. ");
			}

		}

	}

}
