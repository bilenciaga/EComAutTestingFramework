package pages;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Hooks {
    By email = By.cssSelector("input[class='form-control']");
    By password = By.cssSelector("input[name='password']");
    By submitBtn = By.cssSelector("#submit-login");
    public LoginPage() {
        super();
    }

    public WebElement getEmail() {
        return getDriver().findElement(email);
    }
    public WebElement getPassword() {
        return getDriver().findElement(password);
    }
    public  WebElement getSignInBtn() {
        return getDriver().findElement(submitBtn);
    }
}
