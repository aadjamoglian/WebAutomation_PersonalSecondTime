package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static amazon.HomePageWebElement.*;

public class HomePageTest extends HomePage{

    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test @Ignore
    public void testCheckSearchBox () {
        String customXpathMaskLocator = "//span[@class=\"a-color-state a-text-bold\"][@dir=\"auto\"]";
        String customCssMaskLocator = "span[class='a-color-state a-text-bold'][dir='auto']";
        homePage.checkSearchBox();
        String expectedText = productNameExpected;
        String actualText = driver.findElement(By.cssSelector(customCssMaskLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test @Ignore
    public void testPageTitle () {
        String expectedText = "Amazon.com. Spend less. Smile more.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page title does not match");
    }

    @Test @Ignore
    public void testClickFirstCarouselLeftArrow () throws InterruptedException {
        homePage.clickFirstCarouselLeftArrow();
    }

    @Test @Ignore
    public void testClickFirstCarouselRightArrow() throws InterruptedException {
        homePage.clickFirstCarouselRightArrow();
    }

    @Test @Ignore
    public void testChangeLanguage () throws InterruptedException {
        homePage.changeLanguage();
        String expectedText = "Amazon.com. Gasta menos. Sonríe más.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test @Ignore
    public void testGoToAccountPage() throws InterruptedException {
        homePage.goToAccountPage();
        String expectedText = "Your Account";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test @Ignore
    // Not working
    public void testSlideScrollBar() throws InterruptedException {
        homePage.slideScrollBar();
    }

    @Test
    public void testAddToCart() throws InterruptedException {
        homePage.addToCart();
    }



}
