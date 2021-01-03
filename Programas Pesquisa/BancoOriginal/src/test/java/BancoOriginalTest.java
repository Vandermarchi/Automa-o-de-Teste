import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoOriginalTest {
	
	Metodos me = new Metodos();

	@Before
	public void setUp() throws Exception {
		
		me.openBrowser("https://www.original.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		me.abrirConta();
		me.peencherFormulario("Teste teste", "(11)992133650" , "teste@teste.com", "631.571.530-30");
	}

}
