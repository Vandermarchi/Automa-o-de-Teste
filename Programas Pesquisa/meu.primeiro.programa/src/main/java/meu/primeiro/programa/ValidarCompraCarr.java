package meu.primeiro.programa;

public class ValidarCompraCarr {

	public static void main(String[] args) {
		
		double saldoOrigem = 8000;
		double saldoDestino = 0;
		double valorcarro = 16000;
		
		
		if (saldoOrigem >= valorcarro) {
			
			saldoOrigem -= valorcarro;
			saldoDestino+= valorcarro;
			
			System.out.println(" Parabêns a compra do seu veículo foi aprovada!!!!  ");
			System.out.println("");
			
			System.out.println(" Valor saldo atual é R$ "+saldoOrigem);
			System.out.println(" Valor da conta paga é R$ "+valorcarro);
		}else {
			System.out.println(" Desculpa a compra do seu veículo não foi Reprovada!!!!  ");
			System.out.println("");
			System.out.println(" Saldo atual R$ "+saldoOrigem+" é menor que o valor do veículo R$ "+valorcarro+" ,para compra. " );
		}
		

	}

	}


