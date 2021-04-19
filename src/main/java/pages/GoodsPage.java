package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.ItemsQuantity;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class GoodsPage {

    // enter a number in any field
    public void enterValue(String marker, int count) {
        $(By.xpath(marker)).setValue(String.valueOf(count));
    }

    // click the "add" button in the product field
    public void clickButton(String marker) {
        $(By.xpath(marker)).click();
    }

    // send "up" button in the field for quantity
    public void keyUpToElement(String marker, int count) {
        for (int i = 0; i < count; i++) {
            $(By.xpath(marker)).sendKeys(Keys.ARROW_UP);
        }
    }

    // click the "Delete" button for the selected products
    public void deleteGoods(String marker) {
        SelenideElement se = $(By.xpath(marker));
        while (se.exists()) {
            se.click();
        }
    }

    // checking the quantity of goods
    public void checkTotalValue(String marker, String sum) {
        sum = sum.equals("sum") ? String.valueOf(ItemsQuantity.sumOfItem("")) : sum;
        $(By.xpath(marker)).shouldBe(Condition.text(sum));
    }
}
