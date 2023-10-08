package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormDelivery extends BasePage {
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By companyNameField = By.cssSelector("input[name='company']");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By postcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");

    public OrderFormDelivery() {
        super();
    }

    public WebElement getFirstNameField() {
        return getDriver().findElement(firstNameField);
    }

    public WebElement getLastnameField() {
        return getDriver().findElement(lastNameField);
    }

    public WebElement getCompanyField() {
        return getDriver().findElement(companyNameField);
    }

    public WebElement getAddressField() {
        return getDriver().findElement(addressField);
    }

    public WebElement getAddressCompField() {
        return getDriver().findElement(addressComplementField);
    }

    public WebElement getCityField() {
        return getDriver().findElement(cityField);
    }

    public WebElement getStateDropdown() {
        return getDriver().findElement(stateDropdown);
    }

    public WebElement getPostcodeField() {
        return getDriver().findElement(postcodeField);
    }

    public WebElement getCountryDropdown() {
        return getDriver().findElement(countryDropdown);
    }

    public WebElement getPhoneField() {
        return getDriver().findElement(phoneField);
    }

    public WebElement getInvoiceSameAddCheckbox() {
        return getDriver().findElement(invoiceSameAddCheckboc);
    }

    public WebElement getContinueBtn() {
        return getDriver().findElement(continueBtn);
    }

}
