
public class DiegoFlix {

	public static void main(String[] args) {
		  
		
		int opcao = 2;
		int idade = 19;
		int idadePermitida = 18;
		 
			
			switch (opcao) {
			
			case 1:
			
			if (idade>=idadePermitida) {
				System.out.println( " Você tem idade permitida escolha o filme. ");

				System.out.println(" Filme de terror 1 ");
				System.out.println(" Filme de terror 2 ");
				System.out.println(" Filme de terror 3 ");
				System.out.println(" Filme de terror 4 ");
				System.out.println(" Filme de terror 5 ");
				
			}else {
				System.out.println(" Você não tem idade permitida.");
			}

				break;
			case 2:
				System.out.println( " Escolha o filme ! \n ");

				System.out.println(" Filme de Ação 1");
				System.out.println(" Filme de Ação 2");
				System.out.println(" Filme de Ação 3");
				System.out.println(" Filme de Ação 4");
				System.out.println(" Filme de Ação 5");

				break;
			case 3:
				System.out.println( " Escolha o filme ! \n ");

				System.out.println(" Filme de Drama 1");
				System.out.println(" Filme de Drama 2");
				System.out.println(" Filme de Drama 3");
				System.out.println(" Filme de Drama 4");
				System.out.println(" Filme de Drama 5");

				break;
			case 4:
				System.out.println( " Escolha o filme ! \n ");

				System.out.println("  Filme Infantil 1");
				System.out.println("  Filme Infantil 2");
				System.out.println("  Filme Infantil 3");
				System.out.println("  Filme Infantil 4");
				System.out.println("  Filme Infantil 5");

				break;
			case 5:
				System.out.println( " Escolha o filme ! \n ");

				System.out.println(" Documentarios 1");
				System.out.println(" Documentarios 2");
				System.out.println(" Documentarios 3");
				System.out.println(" Documentarios 4");
				System.out.println(" Documentarios 5");

				break;
		}
		

	}

}
