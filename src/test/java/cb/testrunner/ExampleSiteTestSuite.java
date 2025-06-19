package cb.testrunner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    plugin = {"json:target/cucumber-parallel/1.json"},
    glue = {"cb.stepdefinitions"}
)
public class ExampleSiteTestSuite {
}