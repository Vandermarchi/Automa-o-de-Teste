package aulas;

public class RevisaoSwitchCase {

	public static void main(String[] args) {
		
		int nota = 2;
		String nome = null;
		
		switch (nota) {
		
		case 1:
			System.out.println(" Nota 1 ");
			nome = " Brasil";
			
			break;
		case 2:
			System.out.println(" Nota 2 ");
			nome = " Argentina";

			break;
		}
		System.out.println(nome);
	
	}

}
