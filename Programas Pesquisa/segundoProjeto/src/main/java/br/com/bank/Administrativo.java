package br.com.bank;

public class Administrativo {

	ContaCorrente criarCC = new ContaCorrente();

	public int abrirConta(int cc, String nome) {

		criarCC.setNome(nome);
		criarCC.setCc(cc);
		System.out.println("Obrigado " + nome + " a sua conta " + cc + ", foi aberta com sucesso.");

		return cc;

	}

	public void deposita(double valor) {

		criarCC.setSaldo(valor);
		
		System.out.println("Deposito realizado com sucesso, "+ criarCC.getSaldo());

	}

	public void saca(double valor) {

		if (criarCC.getSaldo() >= valor) {

			criarCC.setSaldo(-valor);
			
			System.out.println("Saque realizado com sucesso, saldo em conta "+ criarCC.getSaldo());

		} else {

			System.out.println("Saldo insuficiente");
		}

	}
	
	public void transferencia (double valor) {
		
	}
	

}
