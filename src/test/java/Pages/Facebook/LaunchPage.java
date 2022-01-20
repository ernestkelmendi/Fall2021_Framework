package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaunchPage extends WebCommands {


    // Locators of elements on Launch Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//button[@name='login']");
    By messengerLocator = By.linkText("Messenger");
    By createNewAccLocator = By.linkText("Create new account");

    //*[@id="email"]
    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.linkText("Facebook Pay");

    By invalidLoginErrorLocator = By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']");



    // Methods to interact with elements of Launch Page

    // type in login emailBox
    public void enterLoginEmail(String loginEmail) {
        type(loginEmailLocator, loginEmail);
    }

    // if login emailBox is enabled
    public boolean isLoginEmailBoxEnabled() {
        return getElement(loginEmailLocator).isEnabled();
    }

    // type in login passwordBox
    public void enterLoginPassword(String loginPwd) {
        type(loginPasswordLocator, loginPwd);
    }
    // if login passwordBox is enabled

    // click login button
    public void clickLoginButton() {
        clickThis(loginButtonLocator);
    }

    // if login button is enabled

    // to click the Messenger link
    public void clickMessengerLink() {
        clickThis(messengerLocator);
    }

    // to get number of links
    public int getNumberOfLinks() {
        List<WebElement> allLinks = getElements(allLinksLocator);
        return allLinks.size();
    }

    public void clickFacebookPay() {
        clickThis(facebookPayLocator);
    }

    public boolean isInvalidLoginErrorDisplayed() {
        return isWebElementDisplayed(invalidLoginErrorLocator);
    }

    public void clickCreateNewAccountButton() {
        clickThis(createNewAccLocator);
    }


}
