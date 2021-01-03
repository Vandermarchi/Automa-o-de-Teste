package Runner;

import org.junit.Before;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//mostrar o caminho das features
		features = "src/test/resources/features/",
		//mostrar pacote estao os steps para execucao
		glue = "Step",
		//tags para direcionar a execucao
		tags = "@tag3",
		//formatacao do console cucumber | report html
		plugin = {"pretty", "html:target/report.html"},
		//monchrome deixa mail limpo o console, semtrazer caracteres especiais
		monochrome = true,
		//Deixa os metodos com padrao de linguagem Java ao inves de underline
		snippets = SnippetType.CAMELCASE,
		//não executa o teste ele so valida o mapeamento se falta terminar alguma coisa,
		dryRun = false
		
	)
public class Executa {

}
