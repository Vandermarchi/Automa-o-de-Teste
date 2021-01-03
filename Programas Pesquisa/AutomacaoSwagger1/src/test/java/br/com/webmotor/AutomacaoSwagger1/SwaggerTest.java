package br.com.webmotor.AutomacaoSwagger1;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwaggerTest {
	WebDriver driver;
	
	MetodosWeb me = new MetodosWeb();
	Elemento el = new Elemento();
	
	@Given("^que eu acesse o site webmotors$")
	public void que_eu_acesse_o_site_webmotors() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://desafioonline.webmotors.com.br/swagger/ui/index#/");
		driver.manage().window().maximize();
	}
    
	@When("^entrar no campo Pesquisa$")
	public void entrar_no_campo_Pesquisa() throws Throwable {
		driver.findElement(By.cssSelector("#resource_OnlineChallenge > div > h2 > a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#OnlineChallenge_OnlineChallenge_Vehicle > div.heading > h3 > span.http_method > a")).click();
		Thread.sleep(3000);
		driver.findElement( By.name("Page")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#OnlineChallenge_OnlineChallenge_Vehicle_content > form > div.sandbox_header > input")).click();
		Thread.sleep(3000);
	}

	@Then("^validar as informacoes$")
	public void validar_as_informacoes() throws Throwable {
		String txt = driver.findElement(By.cssSelector("#OnlineChallenge_OnlineChallenge_Vehicle_content > div.response > div.block.response_body.hljs.json > pre > code > span:nth-child(2)")).getText();
		Thread.sleep(3000);
		assertEquals(txt,"1");

	}
}


