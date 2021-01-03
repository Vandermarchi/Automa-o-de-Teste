import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoInterOBancotest {

	MetodoOBanco me = new MetodoOBanco();

	@Before
	public void setUp() throws Exception {
		
		me.openBrowser("https://www.bancointer.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		me.acessarOBanco();
		me.acessarInstitucional();
		me.acessarManifesto();
		me.acessarResponsabilidade();
		me.acessarPatrocinios();
		me.acessarInterpag();
		me.acessarCanaisAtendimento();
		me.acessarInterResearch();
	
	}



}
