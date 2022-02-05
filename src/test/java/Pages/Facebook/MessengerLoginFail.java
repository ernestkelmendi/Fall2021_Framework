package Pages.Facebook;

import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;

public class MessengerLoginFail extends WebCommands{
    By incorrectEmailErrorLocator = By.xpath("//div[text()='Incorrect email or phone number' or text()='Incorrect email address or phone number']");
    By linkFindYourAccountLocator = By.linkText("Find your account and log in.");
    By continueButtonLocator = By.id("loginbutton");
    By keep_me_singed_inLocator = By.xpath("//label[contains(text(),'Keep me signed ')]");




    public boolean isIncorrectEmailErrorDisplayed() {
        return isWebElementDisplayed(incorrectEmailErrorLocator);
    }

    public boolean isLink_FindYourAccount_Displayed(){
        return isWebElementDisplayed(linkFindYourAccountLocator);
    }

    public boolean isContinueButtonDisplayed() {
        return isWebElementDisplayed(continueButtonLocator);
    }

    public boolean isContinueButtonEnabled() {
        return isWebElementEnabled(continueButtonLocator);
    }

    public boolean isKeep_me_signed_inIsSelected() {
        return UseDriver.getDriver().findElement(keep_me_singed_inLocator).isSelected();
    }

}
