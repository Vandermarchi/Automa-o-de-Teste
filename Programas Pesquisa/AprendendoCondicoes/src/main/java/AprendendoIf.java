
public class AprendendoIf {

	public static void main(String[] args) {
		
		 String pais = "Argentina";
		 String paisNascimento = "Brasil";

		if ( pais == paisNascimento) {
			
			System.out.println("Você nasceu no "+pais+" melhor pais do Mundo !!!");
			
		}else {
			System.out.println(" Então voce não nasceu no "+paisNascimento+" ,porque voce nasceu no pais "+pais);
		}
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		if (num1 < 1) {
			System.out.println(" N1 é igual ou menor que o numero 1."); 
			
			
		}else if( num2 > 1 || num2 < 2) {
			System.out.println( " N2  maior do que o N1 e menor do que o N3 ");
			
		}else {
			System.out.println(" Nao entrei em nenhuma das opicoes");
				
		}
		
		double valor = 10.0;
		double outroValor = 20.0;
		boolean condicao = false;
		
		if (valor>= outroValor) {
			if (condicao) {
				System.out.println(" Entrou no primeiro e segundo if");
			}else {
				System.out.println(" Ele entrou somente na primeira condicao.");
			}
			
		}else {
			System.out.println(" Nao passou em nenhuma if");
		}
	}
}
			
			
			
			
			
			
			
		
