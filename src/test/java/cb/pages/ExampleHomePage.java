package cb.pages;

import net.serenitybdd.core.pages.PageObject;

public class ExampleHomePage extends PageObject {
    public void openExampleDotCom() {
        openUrl("https://example.com");
    }
}