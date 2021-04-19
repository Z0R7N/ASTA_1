package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageDef {

    BasePage basePage = new BasePage();

    @Then("Click link {string}")
    public void clickLink(String arg0) {
        basePage.clicklinkOver(arg0);
    }
}
