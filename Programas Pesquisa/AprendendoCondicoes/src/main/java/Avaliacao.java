import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String aluno;
		double nota1, nota2, nota3;
		double notaCorte = 9.0;
		double media;
		boolean aprovadoFalta = true;
		boolean recuperacao = true;

		System.out.println(" Por favor digite seu nome! ");
		aluno = scanner.next();

		System.out.println("");
		System.out.println(aluno + " digite sua 1ª nota: ");
		nota1 = scanner.nextInt();

		System.out.println("");
		System.out.println(aluno + " digite sua 2ª nota: ");
		nota2 = scanner.nextInt();

		System.out.println("");
		System.out.println(aluno + " digite sua 3ª nota: ");
		nota3 = scanner.nextInt();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("");
		System.out.println("A média do aluno " + aluno + " é " + media);

		if (!aprovadoFalta) {
			System.out.println("");
			System.out.println("Você foi reprovado direto por falta " + aluno);

		} else {

			if (media >= notaCorte || recuperacao) {
				System.out.println("");
				System.out.println("O aluno " + aluno + " ,foi aprovado com a nota " + media);

			} else {
				System.out.println("");
				System.out.println("O aluno " + aluno + ",foi reprovado \n com a nota " + media);
			}

		}

	}
}
