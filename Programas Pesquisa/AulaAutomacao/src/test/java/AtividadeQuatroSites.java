import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtividadeQuatroSites {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("*******INICIANDO TESTE*******");
		System.out.println("*****************************");
		
		// configurar o browser que será utilizado, no caso o chrome.
		// no lugar do Key colocamos ("webdriver.chrome.driver"), no lugar de value colocamos o caminho do chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		
		// abrir o browser usando a variável driver
		driver = new ChromeDriver();
		
		// maximizar o browser usando a variável driver
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("*******FIM DE TESTE*******");
		System.out.println("**************************");
		// fechar o browser usando a variável driver, lembrando que para fechar pode usar quit ou closed
		driver.quit();
	}

	@Test
	public void testLeroyMerlin() {
		// entrar no google usando a variável driver com o comando get | driver.get("site que eu quero abrir");
		driver.get("https://www.leroymerlin.com.br");
	}
	
		@Test
	public void testCasasBahia() {
		// entrar no google usando a variável driver com o comando get | driver.get("site que eu quero abrir");
		driver.get("https://www.casasbahia.com.br/");
	}
		@Test
	public void testCaixa() {
		// entrar no google usando a variável driver com o comando get | driver.get("site que eu quero abrir");
		driver.get("https://www.caixa.gov.br/");
		}
		@Test
	public void testOlx() {
		// entrar no google usando a variável driver com o comando get | driver.get("site que eu quero abrir");
		driver.get("https://www.olx.com.br/");
		}}
