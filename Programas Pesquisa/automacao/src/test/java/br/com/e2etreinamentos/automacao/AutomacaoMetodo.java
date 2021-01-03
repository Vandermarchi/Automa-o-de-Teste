package br.com.e2etreinamentos.automacao;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomacaoMetodo {
	
	WebDriver driver;
	
	
	public void abrirBrowser(String navegador, String urlApp) {
		
		switch (navegador) {
		
		case "CHROME":
			
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(urlApp);

			driver.manage().window().maximize();
			break;
			
			case "FIREFOX":
				
				System.setProperty("webdriver.gecko.driver","C:\\driver\\Nova Pasta\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(urlApp);
				driver.manage().window().maximize();
				break;
			
			
			
			
		
		
		}
		
		
	}
	
	public void fecharBrowser() {
		driver.quit();
	}
	
	public void pesguisarGoogle(String texto) {
		driver.findElement(By.name("q")).sendKeys(texto);
		driver.findElement(By.name("q")).submit();
	}
	public void validarBusca(String texto) {
		String retorno = driver.findElement(By.cssSelector("#rhs > div > div.kp-blk.knowledge-panel.Wnoohf.OJXvsb > div > div.ifM9O > div > div.Hhmu2e.mod.NFQFxe.viOShc.LKPcQc > div > div.SPZz6b > h2 > span")).getText();
		
		assertEquals(texto, retorno);
	}

}
