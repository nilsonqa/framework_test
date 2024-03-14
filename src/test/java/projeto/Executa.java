package projeto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "projeto.ui.steps", 
		tags = "@login", // Incluir a @tag que deseja executar
		dryRun = true, // Planejamento = true | Execução = false
		snippets = SnippetType.CAMELCASE, 
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-reports.html" }

)

public class Executa {

}
