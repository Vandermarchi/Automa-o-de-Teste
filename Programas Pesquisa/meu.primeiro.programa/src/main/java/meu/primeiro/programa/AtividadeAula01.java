package meu.primeiro.programa;

public class AtividadeAula01 {

	public static void main(String[] args) {
		String nome = " Vanderlei ";
		String sobrenome = " Marchi ";
		String cor = " Branco ";
		String natural = " S�o Jos� dos Campos "; 
		String moro = " Jacarei S.P.";
		int peso = 75;
		int idade = 41;
		double altura = 1.85;
		boolean habilitado = true;
		
		System.out.println(" O meu nome �"+ nome+ sobrenome+" e tenho "+idade+".");
		
		int x = 0; 
		while (x < 2) {
		System.out.println(" Aminha cor �: "+ cor+ " e eu tenho "+altura+" mt.");
		x++;
		}
		int y = 0;
		while (y < 3) {
			
			System.out.println(" Sou natural de "+natural+"e o meu peso � "+ peso+ " kg."); 
			y++;
		}
		int j = 0;
		while (j < 4) {     
			System.out.println(" Eu tenho habilita��o?: "+ habilitado+" e moro atualmente em "+moro+".");
			j++;
		}
		}

}
 