package segundoProjeto;

public class ValidarIdade {
	
	public static void main(String[] args) {
		
		int idade = 20;
		int idadePermitida= 21;
		String nome = "Anderson";
		
		if (idade >= idadePermitida){
			
			System.out.println(nome + " a sua idade é permitida.");
			
		}  else if (idade >= idadePermitida || idade <= 21){
			
			System.out.println(nome +" menor que 21.");
			
		}else {
			System.out.println(nome +" a sua idade não é permitida.");
		}
		
		
	}

}
