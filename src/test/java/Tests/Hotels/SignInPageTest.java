package Tests.Hotels;

import Helper.Check;
import Pages.Hotels.LaunchPageHotels;
import Pages.Hotels.SignInPageHotels;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SignInPageTest {

    LaunchPageHotels lp = new LaunchPageHotels();
    SignInPageHotels sIn = new SignInPageHotels();


    @Test
    public void verifySignInErrorMsg (){
        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.enterEmail("#!@###");
        sIn.enterPassword("12345");
        sIn.clickSignInButton();
        boolean isSignInErrorMsgDisplayed = sIn.isSignInErrorMsgDisplayed();
        Check.checkTrue(isSignInErrorMsgDisplayed, "Error message is NOT displayed ");

        UseDriver.quitWebPages();

    }
}
