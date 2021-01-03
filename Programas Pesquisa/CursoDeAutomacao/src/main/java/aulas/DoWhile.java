package aulas;

public class DoWhile {

	public static void main(String[] args) {
		
		
		int tentativas = 10; 
		boolean acessoLiberado = false;
		int senha = 123;
		
		do { 
			if (senha == 123)
			
			tentativas --;
			System.out.println(" Execute pelo menos uma vez "+ tentativas);
			
		}while(tentativas > 0);

	}

}
