package metodoVazio;

public class MetodoComMetodo {
	
	String emailCadastrado = "vander@vander.com";
	int senhaCadastrada = 123;
	
	
	public void login(String email, int senha) {
		
		validaSenhaEmanil(senha, email);
		}
	
	public void validaSenhaEmanil(int senha,String email) {
		
		if(email == emailCadastrado && senha == senhaCadastrada) {
			System.out.println(" Acesso Liberado ");
		} else {
			System.out.println(" Dados Inválidos ");
		}
		
	}

}
