
public class TransferenciaBancaria {

	public static void main(String[] args) {
	
		double saldoOrigem = 1000;
		double saldoDestino = 1000;
		double valor = 2000;
		
		System.out.println("Obrigado por utilizar o nosso sistema E2E Treinamentos!");
		System.out.println("#######################################################");
		
		if (saldoOrigem >= valor){
			
			saldoOrigem -= valor;
			saldoDestino +=valor;
			//saldoOrigem = saldoOrigem - valor;
			System.out.println("Saldo origem atualizado R$ "+saldoOrigem+"." );
			System.out.println("Saldo destino atualizado R$ "+ saldoDestino+".");
		
		}	else {
			
			System.out.println("Saldo origem R$ "+ saldoOrigem +", é menor que o valor R$ "+ valor+ ", desejado.");
		}

	}

}
