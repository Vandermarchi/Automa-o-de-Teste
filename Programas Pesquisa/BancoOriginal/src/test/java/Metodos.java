import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Metodos {

	// declarando driver do tipo WebDriver

	WebDriver driver;

	// Abrir browser

	public void openBrowser(String urlApp, String browser) {

		switch (browser) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(urlApp);
			break;

		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(urlApp);
			break;

		}

		System.out.println(" Iniciando caso de teste ");

	}

	public void fecharBrowser() {
		driver.quit();
		System.out.println(" Finalisando caso de teste ");
	}

	public void abrirConta() {
		WebElement btnAbrirConta = driver.findElement(By.cssSelector(
				"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a"));
		btnAbrirConta.click();
	}
	public void peencherFormulario(String nome,String celular, String email, String cpf) throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement( By.id("nome")).sendKeys(nome);
		driver.findElement( By.id("telefone")).sendKeys(celular);
		driver.findElement( By.id("email")).sendKeys(email);
		driver.findElement( By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.id("btnEnviar")).click();
			
		
	
	}

}