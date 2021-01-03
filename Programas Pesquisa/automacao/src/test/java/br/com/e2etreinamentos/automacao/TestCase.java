package br.com.e2etreinamentos.automacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	AutomacaoMetodo at = new AutomacaoMetodo();

	@Before
	public void setUp() throws Exception {
		at.abrirBrowser("CHROME", "https://www.google.com.br");
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	
	}

	@Test
	public void testE2Etreinamentos() {
		at.pesguisarGoogle("E2E Treinamentos");
		at.validarBusca("E2E Treinamentos");
		at.fecharBrowser();
		
	}
		@Test
		public void testyoutube() {
			at.pesguisarGoogle("YOU TUBE");
			at.fecharBrowser();

	}

}
