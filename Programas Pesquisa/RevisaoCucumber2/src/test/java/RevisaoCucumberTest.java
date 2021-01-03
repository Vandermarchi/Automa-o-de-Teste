import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RevisaoCucumberTest {
	WebDriver driver;
	
	
	
	@Given("^que eu acesse o google$")
	public void que_eu_acesse_o_google() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.Google.com.br");
			driver.manage().window().maximize();

	
			
	}

	@When("^pesquisar\"([^\"]*)\"$")
	public void pesquisar(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
		driver.findElement(By.name("q")).submit();

	}

	@Then("^google mostra \"([^\"]*)\"$")
	public void google_mostra(String arg1) throws Throwable {
		
		
	
	
	 
	}

}
