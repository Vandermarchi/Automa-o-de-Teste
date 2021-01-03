package Pages;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class MetodosTest {

	WebDriver Driver;

	public void abrirSite(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {
			switch (navegador) {

			case "CHROME":

				System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
				Driver = new ChromeDriver();
				Driver.get(site);
				Driver.manage().window().maximize();
				break;

			case "FIREFOX":
				System.setProperty("webdriver.gecko.driver", "C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
				Driver = new FirefoxDriver();
				Driver.get(site);
				Driver.manage().window().maximize();
				break;

			}
		} else {
			System.out.println("Navegador invalidado.");
		}
		System.out.println(" Iniciando caso de teste ");

	}

	public void clicar(By elemento) {

		Driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) {

		Driver.findElement(elemento).sendKeys(texto);

	}

	public void fechar() {

		Driver.quit();
	}

	public void screnShoot(String printName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) Driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(printName);
		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void submit(By element, String descricaoPasso) throws IOException {
		try {
			Driver.findElement(element).submit();

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot("erros/" + descricaoPasso);
		}
	}
}
