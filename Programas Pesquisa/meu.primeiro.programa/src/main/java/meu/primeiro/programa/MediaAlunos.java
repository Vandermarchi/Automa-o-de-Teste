package meu.primeiro.programa;

public class MediaAlunos {

	public static void main(String[] args) {
		
		double limite = 7.0;
		double nota1 = 1.5;
		double nota2 = 8.0;
		double nota3 = 9.0;
		double media = (nota1+nota2+nota3)/3;
		
		
		if (media >= limite) {
			
			
			System.out.println(" Parab�ns voc� foi Aprovado !!! ");
			System.out.println("");
			
			System.out.println(" A sua m�dia foi de "+media+"."	);
		}else {
			System.out.println(" Infelizmente voc� foi Reprovado!!! ");
			System.out.println("");
			
			System.out.println(" Sua m�dia foi de "+media+" � menor que a m�dia limite de "+limite+" , para aprova��o!! " );
		}
		

	}

	}


