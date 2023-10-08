package tests;

import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

@Listeners(base.Listeners.class)


public class OrderCompleteTest extends Hooks {

    public OrderCompleteTest() {
        super();
    }

    @Test
    public void OrderCompleteE2ETest() {
        ExtentManager.log("Starting OrderCompleteTest");

        ShopHomepage shopHome = new ShopHomepage();
        shopHome.getProdOne().click();

        ShopProductPage shopProd = new ShopProductPage();
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

        ShoppingCart sCart = new ShoppingCart();
        sCart.getHavePromo().click();
        sCart.getPromoTextbox().click();
        sCart.getPromoTextbox().sendKeys("20OFF");
        sCart.getPromoAddBtn().click();
        sCart.getProceedCheckoutBtn().click();

        OrderFormPersInfo pInfo = new OrderFormPersInfo();
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("John");
        pInfo.getLastnameField().sendKeys("Smith");
        pInfo.getEmailField().sendKeys("johnsmith@test.com");
        pInfo.getTermsConditionsCheckbox().click();
        pInfo.getContinueBtn().click();

        OrderFormDelivery orderDelivery = new OrderFormDelivery();
        orderDelivery.getAddressField().sendKeys("1020/1 CMT8");
        orderDelivery.getCityField().sendKeys("Binh Duong");
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        orderDelivery.getContinueBtn().click();
        ExtentManager.pass("Have Successfully Filled Order Form Delivery");

        OrderFormShippingMethod  shippingMethod = new OrderFormShippingMethod();
        shippingMethod.getDeliveryMsgTextbox().sendKeys("Please leave my shiet on my pouch");
        shippingMethod.getContinueBtn().click();

        OrderFormPayment orderPay = new OrderFormPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();
        ExtentManager.pass("Have Successfully Ordered");
    }

}
