package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCart extends BasePage {
    By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    By promoTextbox = By.cssSelector("input[name='discount_name']");
    By promoAddBtn = By.cssSelector("form[method='post']  span");
    By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart() {
        super();
    }

    public WebElement getHavePromo() {
        return getDriver().findElement(havePromo);
    }

    public WebElement getPromoTextbox() {
        return getDriver().findElement(promoTextbox);
    }

    public WebElement getPromoAddBtn() {
        return getDriver().findElement(promoAddBtn);
    }

    public WebElement getProceedCheckoutBtn() {
        return getDriver().findElement(proceedToCheckoutBtn);
    }

    public WebElement getDeleteItemOne() {
        return getDriver().findElement(deleteItemOne);
    }

    public WebElement getDeleteItemTwo() {
        return getDriver().findElement(deleteItemTwo);
    }

    public WebElement getTotalAmount() {
        return getDriver().findElement(totalValue);
    }

}
