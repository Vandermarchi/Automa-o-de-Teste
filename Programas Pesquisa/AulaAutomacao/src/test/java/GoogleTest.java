import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	/* criar uma variavel do tipo webDriver chamada driver , apos criar a variavel eu preciso importar o WebDriver
	Existem duas formas de importar com tecla ctr +shift + o , ou ou clicar na lampada vermelha na opcao importar*/
	
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		// maximinizar o broser usando a variavel driver
		driver.manage().window().maximize();
		
		
}

	@After
	public void tearDown() throws Exception {
		
		// fechar o browser e o site aberto.
		
		driver.quit();
	}

	@Test
	public void testGoogle() {
	// entrar no google usando a variavel driver com comando get, driver.get(" site que eu quero abrir")
		
		driver.get("https://www.google.com.br");
		
	
		
	}

}
