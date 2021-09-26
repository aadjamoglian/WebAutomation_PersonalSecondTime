package sauceLabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sauceLabs.data.LoginInfo;

import static sauceLabs.LoginPageWebElement.*;
import static sauceLabs.data.LoginInfo.*;


public class LoginPage extends WebAPI {
        LoginInfo user = new LoginInfo();

        @FindBy (how = How.ID, using = usernameLocator) public WebElement username;
        @FindBy (how = How.XPATH, using = passwordLocator) public WebElement password;
        @FindBy (how = How.XPATH, using = loginButtonLocator) public WebElement loginButton;

        public void login() throws InterruptedException {
                username.click();
                username.sendKeys(user.username);
                password.click();
                password.sendKeys(user.password);
                loginButton.click();
                sleepFor(1);
        }

}
