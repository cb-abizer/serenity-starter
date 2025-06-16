package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.pages.ExampleHomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationSteps {

    ExampleHomePage exampleHomePage;

    @Step("Open example.com")
    public void opensExampleDotCom() {
        exampleHomePage.openUrl("https://example.com");
    }

    @Step("The page title should contain 'Example Domain'")
    public void shouldSeeTitleContainingExampleDomain() {
        String title = exampleHomePage.getTitle();
        assertTrue(title.contains("Example Domain"), "Title should contain 'Example Domain'");
    }
}
