package Step;

import org.openqa.selenium.WebDriver;

import Elementos.Elementos;

import Pages.MetodosTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestFinal {
	
	
WebDriver driver;
	
	MetodosTest metodos = new MetodosTest();
    Elementos element = new Elementos();

	
	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String arg1) throws Throwable {
		metodos.abrirSite(arg1,"CHROME");
	}

	@When("^perquisar \"([^\"]*)\"$")
	public void perquisar(String arg1) throws Throwable {
		metodos.preencher(element.getPesquisar(), arg1);
	       metodos.submit(element.getPesquisar(), arg1);
 
	}

	@Then("^sistema axibe informacoes da escola$")
	public void sistema_axibe_informacoes_da_escola() throws Throwable {
		metodos.screnShoot("./evidencias/escola.png");    
	}

	@Then("^sistema axibe informacoes do Bradesco$")
	public void sistema_axibe_informacoes_do_Bradesco() throws Throwable {
		metodos.screnShoot("./evidencias/bradesco.png");
	}

	@Then("^sistema axibe informacoes do itau$")
	public void sistema_axibe_informacoes_do_itau() throws Throwable {
		metodos.screnShoot("./evidencias/itau.png");
	}

}


