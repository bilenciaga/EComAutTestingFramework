package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BasePage {

    public WebDriver getDriver() {
        return WebDriverInstance.getDriver();
    }

    /**
     * Explicitly waits for a WebElement to be clickable.
     *
     * @param element          The WebElement to wait for.
     * @param timeoutInSeconds The maximum time to wait for the element to be clickable.
     * @return The WebElement once it is clickable.
     */
    public WebElement waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Explicitly waits for a WebElement to be visible.
     *
     * @param element          The WebElement to wait for.
     * @param timeoutInSeconds The maximum time to wait for the element to be visible.
     * @return The WebElement once it is visible.
     */
    public WebElement waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
