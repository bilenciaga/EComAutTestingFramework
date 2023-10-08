package tests;

import base.ExcelUtils;
import base.ExtentManager;
import base.Hooks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ShopHomepage;
import pages.YourAccountPage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Listeners(base.Listeners.class)

public class LoginTest extends Hooks {

    @Test(dataProvider = "logInData")
    public void loginTestWithDD(String email, String password, String validOrNot) {

        ExtentManager.log("Starting LogIn Test");

        ShopHomepage shopHomepage = new ShopHomepage();
        shopHomepage.getSignInBtn().click();

        LoginPage loginPage = new LoginPage();
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
        loginPage.getSignInBtn().click();

        try{
            YourAccountPage yourAccountPage = new YourAccountPage();
            yourAccountPage.getSignOutBtn().click();
            ExtentManager.pass("user HAS signed in");
        } catch (Exception e) {
            ExtentManager.fail("user COULD NOT signed in");
            Assert.fail();
        }

    }

    @DataProvider(name = "logInData")
    public Iterator<Object[]> getTestData() throws IOException {
        String excelFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\excels\\credentials.xlsx";
        //C:\Users\w10-64\Dropbox\IdeaProjects\e-com-testing-framework\src\test\resources\excels\credentials.xlsx
        String sheetName = "Sheet1";
        ExcelUtils excelUtils = new ExcelUtils(excelFilePath);
        List<Object[]> testData = excelUtils.getDataFromSheet(sheetName);
        return testData.iterator();
    }

}
