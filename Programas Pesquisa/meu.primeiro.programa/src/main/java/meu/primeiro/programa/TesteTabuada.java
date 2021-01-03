package meu.primeiro.programa;

import java.util.Scanner;

public class TesteTabuada {

	public static void main(String[] args) {

		 int valor;
		 Scanner teclado = new Scanner(System.in);
		 System.out.println(" Digite o valor da tabuada: ");
		 valor = teclado.nextInt();
		 for (int i = 1; i <= 10; i++) {
		
			 System.out.println(valor+" x "+ i +" = "+ (valor*i+(i*0.01)));
			
		}
	
		

	}

}
