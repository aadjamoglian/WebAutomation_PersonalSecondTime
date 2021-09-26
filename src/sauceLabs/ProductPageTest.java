package sauceLabs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ProductPageTest extends ProductPage {

    ProductPage productPage;

    @BeforeMethod
    public void getInit() throws InterruptedException {
        productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.login();
    }

    @Test @Ignore
    public void addItemTest() throws InterruptedException {
        productPage.addItem();
        sleepFor(2);
        productPage.goToShoppingCart();
        sleepFor(1);
    }

    @Test @Ignore
    public void testPriceLowToHigh() throws InterruptedException {
        productPage.priceLowToHigh();
    }

}
