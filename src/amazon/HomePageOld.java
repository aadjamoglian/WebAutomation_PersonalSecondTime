package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageOld {

    public static void main(String[] args) throws InterruptedException {
        String amazonURL = "https://www.amazon.com/";
        String productName = "Mask";
        String searchBoxLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";

        // FireFoxBrowser
//        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        WebDriver driver2 = new FirefoxDriver();
//        driver2.get("https://www.amazon.com/");
//        Thread.sleep(5000);
//        driver2.close();


        // ChromeDriver
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchButtonLocator)).click();

        Thread.sleep(5000); // Used for waiting
        driver.close();

    }

}
