import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;



	// Abrir browser

	public void openBrowser(String urlApp, String browser) {

		switch (browser) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(browser);
			driver.manage().window().maximize();
			break;

		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(urlApp);
			driver.manage().window().maximize();
			break;

		}

		System.out.println(" Iniciando caso de teste ");

	}

	public void fecharBrowser() {
		driver.quit();
		System.out.println(" Finalisando caso de teste ");
	}

	public void abrirConta() {
		WebElement AbrirConta = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > span > button"));
		AbrirConta.click();
	}
	public void peencherFormulario(String nome, String email,String celular, String cpf) throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement( By.id("nome")).sendKeys(nome);
		driver.findElement( By.id("email")).sendKeys(email);
		driver.findElement( By.id("phone")).sendKeys(celular);
		driver.findElement( By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.cssSelector("#open_account > div.row.align-items-center > div.col-12.inter-forms--send-button-container > button")).click();
			
		
	
	}



	public void digitar(By element, String text) {
		driver.findElement(element).sendKeys(text);
		System.out.println(" Finalisando caso de teste ");
	}

	public void clicar(By element) {
		driver.findElement(element).click();
	}

	public void validar(By element, String text) {
		text = driver.findElement(element).getText();
		assertEquals(element, text);

	}
	public void submit(By element) {
		driver.findElement(element).submit();
			
		
	} 
	public void fechar() {
		driver.quit();
		
		
		
		
		
	}
}


