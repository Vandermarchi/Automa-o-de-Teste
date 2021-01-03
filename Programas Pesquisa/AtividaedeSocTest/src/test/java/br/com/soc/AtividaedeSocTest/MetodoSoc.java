package br.com.soc.AtividaedeSocTest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;

public class MetodoSoc {

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
	public void cook() {
		WebElement cook = driver.findElement(By.cssSelector("#barra-cookie"));
		cook.click();
	}
	public void abrirPesquisa() {
	
		driver.findElement(By.name("s")).sendKeys("coronavirus");
		driver.findElement(By.name("s")).submit();

	}
		public void validarBusca(String nome) throws InterruptedException {
			String txt = driver.findElement(By.cssSelector("#blog > div > div.row.head-blog > div > h2 > span")).getText();
			assertEquals(txt, "CORONAVIRUS");
			
			System.out.println(" Finalisando caso de teste ");
		
		}
		public void clicar() {
			WebElement clicar = driver.findElement(By.cssSelector("#menu-item-14815 > a"));
			clicar.click();
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
		
		public void pausa(int tempo) throws InterruptedException {
			Thread.sleep(tempo);
		}
		
		
	
		}
	


