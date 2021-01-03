import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class metodoEmpresa {

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

	public void acessarEmpresas()  {
		WebElement btnacessarEmpresas = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > a"));
		btnacessarEmpresas.click();

	}

	public void acessarContaDigital() throws InterruptedException {
		WebElement btnacessarContaDigital = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(1) > a"));
		btnacessarContaDigital.click();

		Thread.sleep(2000);
	}

	public void acessarEmprestimo() throws InterruptedException {
		WebElement btnacessarEmprestimo = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(2) > a"));
		btnacessarEmprestimo.click();

		Thread.sleep(2000);
	}

	public void acessarFinanciamentoImob() throws InterruptedException {
		WebElement btnacessarFinanciamentoImob = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(3) > a"));
		btnacessarFinanciamentoImob.click();

		Thread.sleep(2000);
	}

	public void acessarSeguros() throws InterruptedException {
		WebElement btnacessarSeguros = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(4) > a"));
		btnacessarSeguros.click();

		Thread.sleep(2000);
	}

	public void acessarCanbio() throws InterruptedException {
		WebElement btnacessarCanbio = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(5) > a"));
		btnacessarCanbio.click();

		Thread.sleep(2000);
	}

	public void acessarAntecipe() throws InterruptedException {
		WebElement btnacessarAntecipe = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(6) > a"));
		btnacessarAntecipe.click();

		Thread.sleep(2000);
	}

	public void acessarPsC() throws InterruptedException {
		WebElement btnacessarPsC = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(3) > div > div.container-menu-wrapper > ul > li:nth-child(7) > a"));
		btnacessarPsC.click();

		Thread.sleep(2000);
	}
}
