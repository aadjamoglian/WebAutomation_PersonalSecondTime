package sauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static sauceLabs.ProductPageWebElement.*;

public class ProductPage extends LoginPage{

    @FindBy (how = How.ID, using = addBackpackLocator) public WebElement addBackpack;
    @FindBy (how = How.XPATH, using = shoppingCartLocator) public WebElement shoppingCart;
    @FindBy (how = How.XPATH, using = dropDownLocator) public WebElement dropDown;

    public void addItem() {
        addBackpack.click();
    }

    public void goToShoppingCart() {
        shoppingCart.click();
    }

    public void priceLowToHigh() throws InterruptedException {
        dropDown.click();
        Select dropDownList = new Select(dropDown);
        dropDownList.selectByVisibleText("Price (low to high)");
        sleepFor(2);
    }

}
