package pages;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YourAccountPage extends Hooks {

    By signOutBtn = By.cssSelector(".logout.hidden-sm-down");
    public YourAccountPage() {
        super();
    }

    public WebElement getSignOutBtn() {
       return getDriver().findElement(signOutBtn);
    }
}
