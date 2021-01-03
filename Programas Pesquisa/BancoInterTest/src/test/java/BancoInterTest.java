import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BancoInterTest {
	
	WebDriver driver;
	
	Metodos me = new Metodos();
	elementos2 ele = new elementos2();

	@Given("^que eu acesse o banco Inter$")
	public void que_eu_acesse_o_banco_Inter() throws Throwable {		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.Google.com.br");
			driver.manage().window().maximize();
	   
	}

	@When("^realizo o cadastro$")
	public void realizo_o_cadastro(String text) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(text);
		driver.findElement(By.name("q")).submit();
		driver.findElement( By.id("nome")).sendKeys(text);
		driver.findElement( By.id("email")).sendKeys(text);
		driver.findElement( By.id("phone")).sendKeys(text);
		driver.findElement( By.id("cpf")).sendKeys(text);
		driver.findElement(By.cssSelector("#open_account > div.row.align-items-center > div.col-12.inter-forms--send-button-container > button")).click();
			
		

	  
	}


	@Then("^mostra \"([^\"]*)\"$")
	public void mostra(String text) throws Throwable {
		me.fechar(); 
	}



}