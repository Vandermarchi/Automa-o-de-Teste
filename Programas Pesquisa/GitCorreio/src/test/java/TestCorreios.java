import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCorreios {
	WebDriver driver;

	Metodos me = new Metodos();
	Elemento el = new Elemento();
	
	@Given("^que eu acesse o Correio$")
	public void que_eu_acesse_o_Correio() throws Throwable {
		me.openBrowser("CHROME", "http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm");
		me.abrirCorreios();
		
		
	}

	@When("^pesguisar o cep$")
	public void pesguisar_o_cep() throws Throwable {
		me.abrirCep("12301120");
	
	}

	@Then("^o endereco e apresentado$")
	public void o_endereco_e_apresentado(String text) throws Throwable {
	   me.validarCep("12301-120");
	}


}
