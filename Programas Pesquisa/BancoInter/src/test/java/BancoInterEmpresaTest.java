import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoInterEmpresaTest {

	metodoEmpresa me = new metodoEmpresa();

	@Before
	public void setUp() throws Exception {

		me.openBrowser("https://www.bancointer.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		me.acessarEmpresas();
		me.acessarContaDigital();
		me.acessarEmprestimo();
		me.acessarFinanciamentoImob();
		me.acessarSeguros();
		me.acessarCanbio();
		me.acessarAntecipe();
		me.acessarPsC();

	}

}
