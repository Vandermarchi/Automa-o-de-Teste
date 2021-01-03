package Page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodoTest {

	WebDriver driver;

	/**
	 * @author Vanderlei
	 * @param abrir navegador
	 */
	public void abrirNavegador(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {

			if (navegador == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
			} else if (navegador == "FIREFOX") {
				System.setProperty("webdriver.gecko.driver","C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(site);
				driver.manage().window().maximize();

			} else {
				System.out.println("Navegador invalidado.");
			}

			System.out.println("Iniciando o teste.");

		}

	}

	/**
	 * @author Vanderlei
	 * @param clicar
	 */
	public void clicar(By element) {
		driver.findElement(element).click();
	}

	/**
	 * @author Vanderlei
	 * @param preencher
	 * @throws IOException
	 */
	public void preencher(By element, String text, String descricaoTeste) throws IOException {

		try {
			driver.findElement(element).sendKeys(text);
		} catch (Exception e) {
			System.out.println("Erro ao tentar preencher no elemento " + element + ", no teste " + descricaoTeste);
			screnShoot("./Evidencias/erros/consultaGoogle.png");
		}
	}

	/**
	 * @author Vanderlei
	 * @param Tirar print
	 */
	public void screnShoot(String printName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(printName);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	/**
	 * @author Vanderlei
	 * @param submit
	 */
	public void submit(By element) {
		driver.findElement(element).submit();
	}

	/**
	 * @author Vanderlei
	 * @param fechar
	 */
	public void fechar() {
		driver.quit();

	}


}


