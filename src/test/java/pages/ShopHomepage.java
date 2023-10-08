package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopHomepage extends BasePage {

    By signInBtn = By.cssSelector("a[title='Log in to your customer account']");
    By productOne = By.linkText("Hummingbird Printed T-Shirt");
    By productTwo = By.linkText("Hummingbird Printed Sweater");
    By productThree = By.linkText("The Best Is Yet To Come'...");
    By productFour = By.linkText("The Adventure Begins Framed...");
    By productFive = By.linkText("Today Is A Good Day Framed...");
    By productSix = By.linkText("Mug The Best Is Yet To Come");
    By productSeven = By.linkText("Mug The Adventure Begins");
    By productEight = By.linkText("Mug Today Is A Good Day");

    public ShopHomepage() {
        super();
    }

    public WebElement getSignInBtn() {
        return getDriver().findElement(signInBtn);
    }
    public WebElement getProdOne() {
        return getDriver().findElement(productOne);
    }

    public WebElement getProdTwo() {
        return getDriver().findElement(productTwo);
    }

    public WebElement getProdThree() {
        return getDriver().findElement(productThree);
    }

    public WebElement getProdFour() {
        return getDriver().findElement(productFour);
    }

    public WebElement getProdFive() {
        return getDriver().findElement(productFive);
    }

    public WebElement getProdSix() {
        return getDriver().findElement(productSix);
    }

    public WebElement getProdSeven() {
        return getDriver().findElement(productSeven);
    }

    public WebElement getProdEight() {
        return getDriver().findElement(productEight);
    }

}
