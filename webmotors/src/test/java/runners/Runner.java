package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Pesquisa.feature",
		glue = "steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true
		)
public class Runner {

}