package aulas;

import atividadesSalas.Calculadora;

public class ExecutaMetodo {

	public static void main(String[] args) {

		MeuPrimeiroMetodo metodo = new MeuPrimeiroMetodo();
		MetodoVariaveis mv = new MetodoVariaveis();
		VariavelAtributo va = new VariavelAtributo();
		MetodoRetorno retorno = new MetodoRetorno();
		Calculadora calc = new Calculadora();

		metodo.exibirMeuNome();
		mv.impressaoVariaveis();
		va.metodo1();
		va.metodo2(41);

		System.out.println(" O resultado da soma �: " + calc.soma(10, 10));
		System.out.println(" O resultado da subtra��o �: " + calc.subtracao(10, 10));
		System.out.println(" O resultado da divis�o �: " + calc.divisao(10, 10));
		System.out.println(" O resultado da multiplica��o �: " + calc.multiplicacao(10, 10));

		System.out.println(retorno.imprimirIdade(41));

	}

}
