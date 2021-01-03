package metodoVazio;

public class ExecutaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MetodoVazio metodo = new MetodoVazio();
		MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo();
		MetodoComMetodo senha = new MetodoComMetodo();
		//metodo.mensagem(); 
		
		//System.out.println(" O nome cadrastrado é" + retorno.nome());
		
         //  atributo.digiteSeuNome("Vanderlei");
          // atributo.digiteSuaIdade(41);
		  // atributo.informeDados(41, " Vanderlei");
		  // atributo.consultaDados();
           senha.login("vander@vander.com", 123);		  
	}

}
