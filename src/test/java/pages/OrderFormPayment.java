package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderFormPayment extends BasePage {
    By payByCheck = By.xpath("//span[.='Pay by Check']");
    By payByWire = By.xpath("//span[.='Pay by bank wire']");
    By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public OrderFormPayment() {
        super();
    }

    public WebElement getPayByCheckRadioBtn() {
        return getDriver().findElement(payByCheck);
    }

    public WebElement getPayByWireRadioBtn()  {
        return getDriver().findElement(payByWire);
    }

    public WebElement getTermsConditionsCheckbox()  {
        return getDriver().findElement(termsAndConditions);
    }

    public WebElement getOrderBtn()  {
        return getDriver().findElement(orderBtn);
    }

}
