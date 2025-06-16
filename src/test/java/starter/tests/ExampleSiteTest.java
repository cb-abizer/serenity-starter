package starter.tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.steps.NavigationSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class ExampleSiteTest {

    @Managed
    WebDriver driver;

    @Steps
    NavigationSteps steps;

    @Test
    public void shouldOpenExampleDotComAndSeeCorrectTitle() {
        steps.opensExampleDotCom();
        steps.shouldSeeTitleContainingExampleDomain();
    }
}
