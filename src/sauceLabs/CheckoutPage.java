package sauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static sauceLabs.CheckoutPageWebElement.*;

public class CheckoutPage extends ProductPage {

    @FindBy (how = How.ID, using = checkoutButtonLocator) public WebElement checkoutButton;
    @FindBy (how = How.ID, using = firstNameLocator) public WebElement firstName;
    @FindBy (how = How.ID, using = lastNameLocator) public WebElement lastName;
    @FindBy (how = How.ID, using = postalLocator) public WebElement postal;
    @FindBy (how = How.ID, using = continueLocator) public WebElement continueWebEl;
    @FindBy (how = How.ID, using = finishButtonLocator) public WebElement finishButton;
    @FindBy (how = How.XPATH, using = orderCompleteLocator) public WebElement orderComplete;


    public void clickCheckoutButton() throws InterruptedException {
        checkoutButton.click();
        sleepFor(2);
    }

    public void completeCheckout() throws InterruptedException {
        checkoutButton.click();
        sleepFor(1);
        firstName.sendKeys("Eddie");
        lastName.sendKeys("Bravo");
        postal.sendKeys("876543");
        continueWebEl.click();
        sleepFor(1);
        finishButton.click();
        sleepFor(2);

    }

}
