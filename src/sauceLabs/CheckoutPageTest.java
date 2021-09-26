package sauceLabs;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CheckoutPageTest extends CheckoutPage{

    CheckoutPage checkoutPage;

    @BeforeMethod
    public void getInit() throws InterruptedException {
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        checkoutPage.login();
        checkoutPage.addItem();
        sleepFor(1);
        checkoutPage.goToShoppingCart();
        sleepFor(2);
    }

    @Test @Ignore
    public void checkout() throws InterruptedException {
        checkoutPage.clickCheckoutButton();
    }

    @Test
    public void testCompleteCheckout() throws InterruptedException {
        checkoutPage.completeCheckout();
        String expectedResult = "Checkout: Complete!";
        String actualResult = orderComplete.getText();
        Assert.assertEquals(actualResult, expectedResult, "Actual result does not match.");
    }


}
