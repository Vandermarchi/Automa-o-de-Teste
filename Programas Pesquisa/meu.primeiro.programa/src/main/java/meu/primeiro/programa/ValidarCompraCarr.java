package meu.primeiro.programa;

public class ValidarCompraCarr {

	public static void main(String[] args) {
		
		double saldoOrigem = 8000;
		double saldoDestino = 0;
		double valorcarro = 16000;
		
		
		if (saldoOrigem >= valorcarro) {
			
			saldoOrigem -= valorcarro;
			saldoDestino+= valorcarro;
			
			System.out.println(" Parab�ns a compra do seu ve�culo foi aprovada!!!!  ");
			System.out.println("");
			
			System.out.println(" Valor saldo atual � R$ "+saldoOrigem);
			System.out.println(" Valor da conta paga � R$ "+valorcarro);
		}else {
			System.out.println(" Desculpa a compra do seu ve�culo n�o foi Reprovada!!!!  ");
			System.out.println("");
			System.out.println(" Saldo atual R$ "+saldoOrigem+" � menor que o valor do ve�culo R$ "+valorcarro+" ,para compra. " );
		}
		

	}

	}


