import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;

	public void abrirBrowser(String navegador, String site) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {

			if (navegador == "CHROME") {

				System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

			} else if (navegador == "FIREFOX") {

				System.setProperty("webdriver.gecko.driver", "C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(site);
				driver.manage().window().maximize();
			} 

			}else {

				System.out.println(" Navegador invalido, digite CHROME ou FIREFOX ");
		}
	}

	public void digitar(By element, String arg1) {
		driver.findElement(element).sendKeys(arg1);
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