package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopProductPage extends BasePage {
    By sizeOption = By.cssSelector("[data-product-attribute='1']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() {
        super();
    }

    public WebElement getSizeOption() {
        return getDriver().findElement(sizeOption);
    }

    public WebElement getQuantIncrease() {
        return getDriver().findElement(quantityIncrease);
    }

    public WebElement getQuantDecrease() {
        return getDriver().findElement(quantityDecrease);
    }

    public WebElement getAddToCartBtn() {
        return getDriver().findElement(addToCartBtn);
    }

    public WebElement getHomepageLink() {
        return getDriver().findElement(homepageLink);
    }

}
