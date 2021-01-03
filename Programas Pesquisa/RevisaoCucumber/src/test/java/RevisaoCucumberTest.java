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
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@Given("^que eu acesse o google$")
	public void que_eu_acesse_o_google() throws Throwable {
		me.abrirBrowser("CHROME", "https://www.Google.com.br");
			
	}

	@When("^pesquisar \"([^\"]*)\"$")
	public void pesquisar(String arg1) throws Throwable  {
		me.digitar(el.getPesquisar(), arg1);
		me.submit(el.getPesquisar());
	}

	@Then("^google mostra \"([^\"]*)\"$")
	public void google_mostra(String texto) throws Throwable {
		
		me.pausa(3000);
		me.fechar();
	
	 
	}

}
