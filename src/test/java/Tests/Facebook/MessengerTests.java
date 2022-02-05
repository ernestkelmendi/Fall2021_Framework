package Tests.Facebook;

import Helper.Check;
import Pages.Facebook.LaunchPage;
import Pages.Facebook.MessengerHomePage;
import Pages.Facebook.MessengerLoginFail;
import Web.UseDriver;
import org.testng.annotations.Test;

public class MessengerTests {

    LaunchPage lp = new LaunchPage();
    MessengerHomePage mp = new MessengerHomePage();
    MessengerLoginFail mFail = new MessengerLoginFail();

    @Test
    public void verifyLinkForEmptyCredentialMessenger () {

        UseDriver.openUrl("https://www.facebook.com/");

        lp.clickMessengerLink();

        mp.scroll_and_clickLoginButton();

        boolean isLink_displayed = mFail.isLink_FindYourAccount_Displayed();

        Check.checkTrue(isLink_displayed, "Link --> \"Find your account and log in.\" is not displayed");

        UseDriver.quitWebPages();
    }
    @Test
    public void buttonContinue_isDisplayed () {

        UseDriver.openUrl("https://www.facebook.com/");

        lp.clickMessengerLink();

        mp.scroll_and_clickLoginButton();

        boolean isButton_displayed = mFail.isContinueButtonDisplayed();

        Check.checkTrue(isButton_displayed, "Button 'Continue' is NOT displayed");

        UseDriver.quitWebPages();
    }

    @Test
    public void buttonContinue_isEnabled () {

        UseDriver.openUrl("https://www.facebook.com/");

        lp.clickMessengerLink();

        mp.scroll_and_clickLoginButton();

        boolean isButton_enabled = mFail.isContinueButtonEnabled();

        Check.checkTrue(isButton_enabled, "Button 'Continue' is NOT enabled");

        UseDriver.quitWebPages();
    }
    @Test
    public void keep_me_signed_inCheckBoxIsNotSelected() {

        UseDriver.openUrl("https://www.facebook.com/");

        lp.clickMessengerLink();

        mp.scroll_and_clickLoginButton();

        boolean isKeep_me_signed_in = mFail.isKeep_me_signed_inIsSelected();

        Check.checkFalse(isKeep_me_signed_in, "Check-Box --> \"Keep me signed in\" is NOT selected");

        UseDriver.quitWebPages();
    }
}
