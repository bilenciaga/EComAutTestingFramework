package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormShippingMethod extends BasePage {
    By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

    public OrderFormShippingMethod() {
        super();
    }

    public WebElement getDeliveryMsgTextbox(){
        return getDriver().findElement(deliveryMsgTextbox);
    }

    public WebElement getContinueBtn() {
        return getDriver().findElement(continueBtn);
    }
}
