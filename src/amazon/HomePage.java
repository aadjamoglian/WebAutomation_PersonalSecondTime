package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    public static void main(String[] args) throws InterruptedException {

        // ChromeDriver
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.close();

        // FireFoxBrowser
        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver2.close();

    }

}
