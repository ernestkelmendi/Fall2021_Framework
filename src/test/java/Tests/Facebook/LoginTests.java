package Tests.Facebook;

import Helper.Check;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

public class LoginTests {
    // This file will contain all testcases related to login (facebook)
    LaunchPage lp = new LaunchPage();


    // Verify user can login using valid credentials
    @Test
    public void verifyValidFlow() {
        // code
    }


    // Verify user cannot login using invalid credentials
    @Test
    public void verifyInvalidFlow() {
        // code
    }

    @Test
    public void verifyLinkForIncorrectCredential (){
        UseDriver.openUrl("https://www.facebook.com/");

        lp.enterLoginEmail("%^&&*()");
        lp.enterLoginPassword("abcd@1234");
        lp.clickLoginButton();

        Check.checkTrue(lp.isLink_FindYourAccount_displayed(), "Link --> \"Find your account and log in\" is not displayed");
        UseDriver.quitWebPages();

    }

}
