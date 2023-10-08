package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Hooks extends BasePage {
    public Hooks() {
        super();
    }

    @BeforeTest
    @Parameters({"browser", "headless"})
    public void setUpDriver(String browser, String headless) {
        WebDriverInstance.initializeDriver(browser, headless);
    }

    @AfterTest
    public void tearDown() {
        WebDriverInstance.cleanupDriver();
    }
}
