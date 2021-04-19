package steps;

import config.ItemsQuantity;
import io.cucumber.java.en.Then;
import pages.GoodsPage;

public class GoodsPageDef {

    GoodsPage goodsPage = new GoodsPage();

    @Then("Enter value for {string}")
    public void enterValueFor(String arg0) {
        goodsPage.enterValue("//h4[text()='" + arg0 + "']/following-sibling::div/input", ItemsQuantity.sumOfItem(arg0));
    }

    @Then("Click button Dodaj in field {string}")
    public void clickButtonDodajInField(String arg0) {
        goodsPage.clickButton("//h4[text()='" + arg0 + "']/following-sibling::div/span/button");
    }

    @Then("Change value for {string}")
    public void changeValueFor(String arg0) {
        goodsPage.keyUpToElement("//h4[text()='" + arg0 + "']/following-sibling::div/input", ItemsQuantity.sumOfItem(arg0));
    }

    @Then("Total value is {string}")
    public void totalValueIs(String arg0) {
        goodsPage.checkTotalValue("//span[@class='summary-quantity']", arg0);
    }

    @Then("Click button Delete")
    public void clickButtonDelete() {
        goodsPage.deleteGoods("//button[@data-remove-from-basket]");
    }
}
