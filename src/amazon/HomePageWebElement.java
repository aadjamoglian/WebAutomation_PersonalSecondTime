package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties


    public static final String productName="Mask";
    public static final String productNameExpected = "\"Mask\"";
    public static final String searchBoxLocator="twotabsearchtextbox";
    public static final String searchButtonLocator="nav-search-submit-button";
    public static final String searchTextLocator="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";
    public static final String searchBoxResult = "\"span[class='a-color-state a-text-bold'][dir='auto']\"";
    public static final String firstCarouselXPath = "//div[@class='a-section a-spacing-none feed-carousel first-carousel']//a[@aria-label='Carousel previous slide']";
    public static final String firstCarouselSelectorRight = "#\\36 PiuEqAZ3fRpMGnEUH6Lqw > div.a-section.a-spacing-none.feed-carousel.first-carousel > a.a-link-normal.feed-carousel-control.feed-right";
    public static final String languageDropNavXPath = "//a[@id='icp-touch-link-language'][1]";
    public static final String spanishLanguageOptionXPath = "//*[@id=\"nav-flyout-icp-footer-flyout\"]/div[2]/a[1]";
    public static final String accountAndListsDropDownListXPath = "//a[@id='nav-link-accountList'][1]";
    public static final String accountLinkText = "Account";
    public static final String firstScrollBarLocator = "(//span[@class='feed-scrollbar-thumb'])[1]";
    public static final String bestSellersButtonLocator = "Best Sellers";
    public static final String babyDiaperLocator = "//div[text()='Baby Wipes, Pampers Sensitive Water Based Baby Diaper Wipes, Hypoallergenic and Unscented, 7 Pop-Top Packs, 504 Count Total…']";
    public static final String oneTimePurchaseLocator = "//*[@id=\"newAccordionRow\"]/div/div[1]";
    public static final String buyNowButtonLocator = "#newAccordionRow > div > div.a-accordion-row-a11y > a > i";




}
