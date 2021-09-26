package sauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class LoginPageTest extends LoginPage{

    LoginPage loginPage;

    @BeforeMethod
    public void getInit(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test @Ignore
    public void testLogin() throws InterruptedException {
        loginPage.login();
        String expectedResult = "PRODUCTS";
        String actualResult = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actualResult, expectedResult, "Expected result does not match actual.");
    }

}
