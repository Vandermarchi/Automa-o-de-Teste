package meu.primeiro.programa;

public class MediaAlunos {

	public static void main(String[] args) {
		
		double limite = 7.0;
		double nota1 = 1.5;
		double nota2 = 8.0;
		double nota3 = 9.0;
		double media = (nota1+nota2+nota3)/3;
		
		
		if (media >= limite) {
			
			
			System.out.println(" Parabêns você foi Aprovado !!! ");
			System.out.println("");
			
			System.out.println(" A sua média foi de "+media+"."	);
		}else {
			System.out.println(" Infelizmente você foi Reprovado!!! ");
			System.out.println("");
			
			System.out.println(" Sua média foi de "+media+" é menor que a média limite de "+limite+" , para aprovação!! " );
		}
		

	}

	}


