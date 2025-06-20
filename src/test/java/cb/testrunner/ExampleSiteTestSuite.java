package cb.testrunner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    plugin = {"json:target/cucumber-parallel/1.json"},
    tags = "@P1",
    glue = {"cb.stepdefinitions"}
)
public class ExampleSiteTestSuite {
}