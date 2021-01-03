package br.com.e2etreinamentos.projeto_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest {
	
	WebDriver Driver;

		@Given("^que eu acesse o google$")
		public void que_eu_acesse_o_google() throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
			
			Driver = new ChromeDriver();
			Driver.get("https//www.google.com");
			
	
		}

		@When("^pesguisar o nome da escola$")
		public void pesguisar_o_nome_da_escola() throws Throwable {
			Driver.findElement(By.name("q")).sendKeys("E2E Treinamentos");
			Driver.findElement(By.name("q")).submit();
			throw new PendingException();
		}

		@Then("^as informacoes sao apresentadas$")
		public void as_informacoes_sao_apresentadas() throws Throwable {
		System.out.println("Finalizando testes");
		Driver.quit();
		}

}
