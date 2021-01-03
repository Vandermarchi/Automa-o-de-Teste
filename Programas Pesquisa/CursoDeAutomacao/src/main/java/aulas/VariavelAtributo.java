package aulas;

public class VariavelAtributo {
	 int idade = 10;
	 // variavel global
	 
	 public void metodo1() {
		// varivel dentro do metodo 
		 int idade = 11;
		 
		 System.out.println(idade);
	 }
	
	// variave como atributo do metodo
	public void metodo2(int idade) {
		
		
		System.out.println(idade);
	}
	

}
