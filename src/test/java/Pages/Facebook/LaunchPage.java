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
    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.linkText("Facebook Pay");
    By link_findYourAccount_Locator = By.partialLinkText("Find your account and log i");
    By invalidLoginErrorLocator = By.xpath("//div[starts-with(text(), 'The email address or mobile')]");
    By createNewAccountLocator = By.linkText("Create New Account");


    // Methods to interact with elements of Launch Page




    // type in login emailBox
    public void enterLoginEmail(String loginEmail) {
        type(loginEmailLocator, loginEmail);
    }

    // click "Create New Account Button"
    public void click_createNewAccountButton(){
        clickThis(createNewAccountLocator);
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

    public boolean isLink_FindYourAccount_displayed (){
        return isWebElementDisplayed(link_findYourAccount_Locator);
    }


}
