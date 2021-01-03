import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodoOBanco {

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

	public void acessarOBanco() {
		WebElement btnacessarOBanco = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > a"));
		btnacessarOBanco.click();

	}

	public void acessarInstitucional() throws InterruptedException {
		WebElement btnacessarInstitucional = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(1) > a"));
		btnacessarInstitucional.click();

		Thread.sleep(2000);
	}

	public void acessarManifesto() throws InterruptedException {
		WebElement btnacessarManifesto = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(2) > a"));
		btnacessarManifesto.click();

		Thread.sleep(2000);
	}

	public void acessarResponsabilidade() throws InterruptedException {
		WebElement btnacessarResponsabilidade = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(3) > a"));
		btnacessarResponsabilidade.click();

		Thread.sleep(2000);
	}

	public void acessarPatrocinios() throws InterruptedException {
		WebElement btnacessarPatrocinios = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(4) > a"));
		btnacessarPatrocinios.click();

		Thread.sleep(2000);
	}

	public void acessarInterpag() throws InterruptedException {
		WebElement btnacessarInterpag = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(5) > a"));
		btnacessarInterpag.click();

		Thread.sleep(2000);
	}

	public void acessarCanaisAtendimento() throws InterruptedException {
		WebElement btnacessarCanaisAtendimento = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(6) > a"));
		btnacessarCanaisAtendimento.click();

		Thread.sleep(2000);
	}

	public void acessarInterResearch() throws InterruptedException {
		WebElement btnacessarResearch = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > header > div > div > div.menu-items.flex-grow-1 > nav > ul > li:nth-child(1) > div > div.container-menu-wrapper > ul > li:nth-child(7) > a"));
		btnacessarResearch.click();

		Thread.sleep(2000);
	}

}
