package cb.stepdefinitions;

import cb.pages.ExampleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleSiteStepDefinitions {

    ExampleHomePage exampleHomePage;

    @Given("I am on the Example.com homepage")
    public void i_am_on_the_example_com_homepage() {
        exampleHomePage.openExampleDotCom();
    }

    @Then("I should see {string} in the page title")
    public void i_should_see_in_the_page_title(String expectedTitle) {
        String actualTitle = exampleHomePage.getTitle();
        assertThat(actualTitle).contains(expectedTitle);
    }
}