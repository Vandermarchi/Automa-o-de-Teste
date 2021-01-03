import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoInterPraVocetest {
	MetodoPraVoce me = new MetodoPraVoce();

	@Before
	public void setUp() throws Exception {
		
		me.openBrowser("https://www.bancointer.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		me.acessarPraVoce();
		me.acessarContaDigital();
		me.acessarIntercel();
		me.acessarShopping();
		me.acessarCartaoDebito();
		me.acessarEmprestimos();
		me.acessarFinanciamentoImobiliario();
		me.acessarInvestimentos();
		me.acessarSeguros();
		me.acessarCambio();
		me.acessarConsorcio();
	
	}

}
	
