import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoInterTest {

	Metodos me = new Metodos();

	@Before
	public void setUp() throws Exception {
		
		me.openBrowser("https://www.bancointer.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		me.abrirConta();
		me.peencherFormulario("Test Test", "test@teste.com","(12)991331545", "294.017.260-94");
	
	}

}
