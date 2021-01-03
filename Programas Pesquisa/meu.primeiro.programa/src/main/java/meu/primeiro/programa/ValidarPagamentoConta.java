package meu.primeiro.programa;

public class ValidarPagamentoConta {

	public static void main(String[] args) {
		
		double saldoOrigem = 1500;
		double saldoDestino = 0;
		double valorconta = 1600;
		
		
		if (saldoOrigem >= valorconta) {
			
			saldoOrigem -= valorconta;
			saldoDestino+= valorconta;
			
			System.out.println(" Sua conta foi paga aqui no nosso sistema !!! ");
			System.out.println("");
			
			System.out.println(" Saldo atual de R$ "+saldoOrigem);
			System.out.println(" Valor pago de R$ "+valorconta);
		}else {
			System.out.println(" Sua conta não foi paga, saldo insuficiente!!! ");
			System.out.println("");
			
			System.out.println(" Saldo em conta R$ "+saldoOrigem+" é menor que o valor R$ "+valorconta+" ,para pagamento! " );
		}
		

	}

	}


