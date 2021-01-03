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
			System.out.println("Você pode ser habilitado  " + motorista);

		} else {
	if (idade >= idadeMinima || emancipado) {
				System.out.println("");
				System.out.println(" Você " + motorista + " ,pode ser habilitado por ter o minimo de " + idadeEmancipado
						+ " anos \n e ser emancipado");

		
			} else {
				System.out.println("");
				System.out.println(" Você " + motorista + ",não pode ser Habilitado pois nao é  maior de " + idadeMinima
						+ " \n , ou não tem " + idadeEmancipado + " anos ou mais e já esta emancipado. ");
			}

		}

	}

}
