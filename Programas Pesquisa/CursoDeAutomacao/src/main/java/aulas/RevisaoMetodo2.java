package aulas;

public class RevisaoMetodo2 {
	
	public void numero(int numero, String nome) {
		
		if (numero > 10) {
			System.out.println(" Você escolheu um numero maior que 10");
			System.out.println(" Você "+ nome +" escolheu o numero "+numero);
			
		}else {
			System.out.println(" Você escolheu um numero menor que 10");
			System.out.println(" Você "+ nome +" escolheu o numero "+numero);
		}
		
	}
	
	public boolean autenticacao(int senha, String nome) {
		     
		boolean acesso = false;
		
		if (senha == 123) {
			acesso = true;
			
		}
		System.out.println(" ola "+ nome +" a senha é "+ acesso);
		return acesso;
	}

}
