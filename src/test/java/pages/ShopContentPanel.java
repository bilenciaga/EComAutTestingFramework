package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel extends BasePage {
    By continueShoppingBtn = By.xpath("//button[contains(text(), 'Continue')]");
    By checkoutBtn = By.xpath("//a[@class='btn btn-primary']");

    public ShopContentPanel() {
        super();
    }

    public WebElement getContinueShopBtn() {
        return getDriver().findElement(continueShoppingBtn);
    }

    public WebElement getCheckoutBtn() {
        return getDriver().findElement(checkoutBtn);
    }

}
