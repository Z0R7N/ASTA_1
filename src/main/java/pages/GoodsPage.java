package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoodsPage {

    public void enterValue(String marker) {
        $(By.xpath(marker)).setValue(String.valueOf(count));
    }
}