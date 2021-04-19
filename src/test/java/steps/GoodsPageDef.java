package steps;

import io.cucumber.java.en.Then;
import pages.GoodsPage;

public class GoodsPageDef {

    GoodsPage goodsPage = new GoodsPage();

    @Then("Change value for {string}")
    public void changeValueFor(String arg0) {
        goodsPage.enterValue("//h4[text()='" + arg0 + "']/following-sibling::div/input");
    }
}
