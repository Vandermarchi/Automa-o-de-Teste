import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodoPraVoce {

	WebDriver driver;

	// Abrir browser

	public void openBrowser(String urlApp, String browser) {

		switch (browser) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(urlApp);
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

	public void acessarPraVoce() {
		WebElement btnacessarPraVoce = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > a"));
		btnacessarPraVoce.click();

	}

	public void acessarContaDigital() throws InterruptedException {
		WebElement btnacessarContaDigital = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(1) > a"));
		btnacessarContaDigital.click();

		Thread.sleep(2000);
	}

	public void acessarIntercel() throws InterruptedException {
		WebElement btnacessarIntercel = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(2) > a"));
		btnacessarIntercel.click();

		Thread.sleep(2000);
	}

	public void acessarShopping() throws InterruptedException {
		WebElement btnacessarShopping = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(3) > a"));
		btnacessarShopping.click();

		Thread.sleep(2000);
	}

	public void acessarCartaoDebito() throws InterruptedException {
		WebElement btnacessarCartaoDebito = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(4) > a"));
		btnacessarCartaoDebito.click();

		Thread.sleep(2000);
	}

	public void acessarEmprestimos() throws InterruptedException {
		WebElement btnacessarEmprestimos = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(5) > a"));
		btnacessarEmprestimos.click();

		Thread.sleep(2000);
	}

	public void acessarFinanciamentoImobiliario() throws InterruptedException {
		WebElement btnacessarFinanciamentoImobiliario = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(6) > a"));
		btnacessarFinanciamentoImobiliario.click();

		Thread.sleep(2000);
	}

	public void acessarInvestimentos() throws InterruptedException {
		WebElement btnacessarInvestimentos = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header.navigation.py-3.py-lg-4.landscape > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(7) > a"));
		btnacessarInvestimentos.click();

		Thread.sleep(2000);
	}

	public void acessarSeguros() throws InterruptedException {
		WebElement btnacessarSeguros = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(8) > a"));
		btnacessarSeguros.click();

		Thread.sleep(2000);
	}

	public void acessarCambio() throws InterruptedException {
		WebElement btnacessarCambio = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(9) > a"));
		btnacessarCambio.click();

		Thread.sleep(2000);
	}

	public void acessarConsorcio() throws InterruptedException {
		WebElement btnacessarConsorcio = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(2) > div > div.container-menu-wrapper > ul > li:nth-child(10) > a"));
		btnacessarConsorcio.click();

		Thread.sleep(2000);
	}
}
