package amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import static amazon.HomePageWebElement.*;

public class HomePage extends WebAPI{

    @FindBy (how = How.ID, using = searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using = searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
    @FindBy (how = How.CSS, using = searchBoxResult) public WebElement searchBoxRes;
    @FindBy (how = How.XPATH, using = firstCarouselXPath) public WebElement firstCarouselXPathLocator;
    @FindBy (how = How.CSS, using = firstCarouselSelectorRight) public WebElement getFirstCarouselSelectorLocatorRight;
    @FindBy (how = How.XPATH, using = languageDropNavXPath) public WebElement languageDropNav;
    @FindBy (how = How.XPATH, using = spanishLanguageOptionXPath) public WebElement spanishLanguageOption;
    @FindBy (how = How.XPATH, using = accountAndListsDropDownListXPath) public WebElement accountAndListDropDown;
    @FindBy (how = How.LINK_TEXT, using =  accountLinkText) public WebElement accountPageLink;
    @FindBy (how = How.XPATH, using = firstScrollBarLocator) public WebElement firstScrollBar;
    @FindBy (how = How.LINK_TEXT, using = bestSellersButtonLocator) public WebElement bestSellersButton;
    @FindBy (how = How.XPATH, using = babyDiaperLocator) public WebElement babyDiaper;
    @FindBy (how = How.XPATH, using = oneTimePurchaseLocator) public WebElement oneTimePurchase;
    @FindBy (how = How.XPATH, using = buyNowButtonLocator) public WebElement buyNowButton;

    String productName = "Mask";
    String customXpathSearchBoxLocator = "//input[@id='twotabsearchtextbox']";
    String customXpathSearchButtonLocator = "//*[@id='nav-search-submit-button']";

//    @Test @Ignore
//    public void testCheckSearchBox () {
//        checkSearchBox();
//        String expectedText = "Mask";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }

    public void checkSearchBox () {
        // Enter product name
        searchBox.sendKeys(productName);

        // Click on search button
        searchButton.click();
    }

    public void clickFirstCarouselLeftArrow () throws InterruptedException {
        sleepFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,200);");
        sleepFor(1);
        js.executeScript("arguments[0].scrollIntoView();", firstCarouselXPathLocator);
        firstCarouselXPathLocator.click();
    }

    public void clickFirstCarouselRightArrow() throws InterruptedException {
        sleepFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,200);");
        sleepFor(1);
        js.executeScript("arguments[0].scrollIntoView();", getFirstCarouselSelectorLocatorRight);
        getFirstCarouselSelectorLocatorRight.click();
    }

    public void changeLanguage() throws InterruptedException {
        sleepFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,document.body.scrollHeight);");
        Actions action = new Actions(driver);
        action.moveToElement(languageDropNav).build().perform();
        sleepFor(3);
        spanishLanguageOption.click();
    }

    public void goToAccountPage() throws InterruptedException {
        sleepFor(1);
        Actions action = new Actions(driver);
        action.moveToElement(accountAndListDropDown).build().perform();
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Account")));
        accountPageLink.click();
    }

    public void slideScrollBar() throws InterruptedException {
        sleepFor(1);
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1000);");
        sleepFor(2);
        action.clickAndHold(firstScrollBar);
        action.moveByOffset(-200,0);
        action.release();
        sleepFor(3);
    }

    public void addToCart() throws InterruptedException {
        sleepFor(1);
        bestSellersButton.click();
        babyDiaper.click();
//        WebDriverWait wait = new WebDriverWait(driver,3);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(oneTimeRadioButtonLocator)));
        sleepFor(2);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        try {
            oneTimePurchase.click();
        } catch (NoSuchElementException e) {
            executor.executeScript("arguments[0].click();", oneTimePurchase);
        }
        buyNowButton.click();






    }

}
