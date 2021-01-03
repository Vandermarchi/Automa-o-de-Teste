package br.com.soc.AtividaedeSocTest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSoc {
	WebDriver driver;

	MetodoSoc me = new MetodoSoc();
	Element el = new Element();

	@Given("^que eu acesse o site Soc$")
	public void que_eu_acesse_o_site_Soc() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ww2.soc.com.br./blog");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#barra-cookie")).click();
	}

	@When("^entrar no campo Pesquisa$")
	public void entrar_no_campo_Pesquisa() throws Throwable {
		driver.findElement(By.name("s")).sendKeys("coronavirus");
		driver.findElement(By.name("s")).submit();

	}

	@Then("^validar as informacoes$")
	public void validar_as_informacoes() throws Throwable {
		String txt = driver.findElement(By.cssSelector("#blog > div > div.row.head-blog > div > h2 > span")).getText();
		assertEquals(txt, "CORONAVIRUS");

	}

	@Given("^escolher a opcao Fap$")
	public void escolher_a_opcao_Fap() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ww2.soc.com.br./blog");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#barra-cookie")).click();
		driver.findElement(By.cssSelector("#menu-item-14815 > a")).click();
	}

	@When("^preencher as informacoes$")
	public void preencher_as_informacoes() throws Throwable {
		driver.findElement(By.cssSelector("#nomeEmpresa")).sendKeys("Test test");
		driver.findElement(By.cssSelector("#fap")).sendKeys("2");
		driver.findElement(By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric > span")).click();
		driver.findElement(By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric-items > div > ul > li:nth-child(3)")).click();
		driver.findElement(By.cssSelector("#projecao")).sendKeys("5000000");
		driver.findElement(By.cssSelector("#estimar")).click();

	}

	@Then("^validar as informacoes de estimativa da fap\\.$")
	public void validar_as_informacoes_de_estimativa_da_fap() throws Throwable {
		String txt = driver.findElement(By.cssSelector("#page > section > div > header > h1")).getText();
		assertEquals(txt, "ESTIMATIVA FAP DA EMPRESA");

	}
}
