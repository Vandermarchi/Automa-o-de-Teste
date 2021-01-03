package metodoVazio;

public class MetodoAtributo {
	 int idade;
	 String nome;
	
	public void digiteSuaIdade(int idade) { 
		 
		System.out.println(" A idade digitada é "+ idade);
		
		
	}
	
	public String digiteSeuNome(String nome) {
		
		System.out.println(" O nome digitado é "+ nome);
		return nome;
	}
	
	public void informeDados(int idade, String nome) {
		this.nome= nome;
		this.idade = idade;
	System.out.println(" O nome cadastrado é "+ this.nome +" e a idade "+ this.idade);	
	}
     public void consultaDados() {
    	 
    	 System.out.println(" Nome cadastrado foi "+ this.nome +" idade cadastrada foi "+ this.idade);
    	 
     }
}
