import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Metodos {

	WebDriver driver;

	// Abrir browser

	public void openBrowser(String urlApp, String browser) {

		switch (browser) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
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

	public void abrirCorreios() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.correios.com.br");
		driver.manage().window().maximize();

	}

	public void abrirCep(String nome) throws InterruptedException {
		driver.findElement(By.cssSelector("#acesso-busca")).sendKeys("12301120");
		driver.findElement(By.cssSelector(
				"#conteudo-inicial > div > div.mais-acessados > div > form:nth-child(2) > div.campo > button")).click();
		Thread.sleep(3000);

	}

	public void validarCep(String text) throws InterruptedException {

		String txt = driver.findElement(By.cssSelector("#resultado-DNEC > tbody > tr > td:nth-child(4)")).getText();
		assertEquals(txt, "12301-120");

		System.out.println(" Finalisando caso de teste ");

	}

	public void screnShoot(String printName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(printName);
		FileUtils.copyFile(SrcFile, DestFile);

	}

}
