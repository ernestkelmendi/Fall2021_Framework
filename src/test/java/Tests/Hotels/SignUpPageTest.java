package Tests.Hotels;

import Helper.Check;
import Pages.Hotels.LaunchPageHotels;
import Pages.Hotels.SignInPageHotels;
import Pages.Hotels.SignUpPageHotels;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SignUpPageTest {

    LaunchPageHotels lp = new LaunchPageHotels();
    SignUpPageHotels sUp = new SignUpPageHotels();
    SignInPageHotels sIn = new SignInPageHotels();

    @Test
    public void emailErrorMsgIsDisplayed() {
        /*Verify email error Msg "Please check your email address"
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.clickSignUpLink();
        sUp.enterEmail("#!@###");
        sUp.enterPassword("12345");
        boolean isErrorMsgDisplayed = sUp.isEmailErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }

    @Test
    public void password_lessThenSix_ErrorMsgIsDisplayed() {
        /*Verify password error Msg "Please enter a password containing at least six characters"
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.clickSignUpLink();
        sUp.enterEmail("#!@###");
        sUp.enterPassword("12345");
        sUp.enterFirstName("12345");
        boolean isErrorMsgDisplayed = sUp.isPasswordLessThenSixErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }

    @Test
    public void password_moreThenTwenty_ErrorMsgIsDisplayed() {
        /*Verify password error Msg "Your password cannot be more than 20 characters long."
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.clickSignUpLink();
        sUp.enterEmail("#!@###");
        sUp.enterPassword("123456789aaaaaaaaaaaaa");
        sUp.enterFirstName("12345");
        boolean isErrorMsgDisplayed = sUp.isPasswordMoreThenTwentyErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }

    @Test
    public void firstNameErrorMsgIsDisplayed() {
        /*Verify first name error Msg "Please check your first name"
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.clickSignUpLink();
        sUp.enterEmail("#!@###");
        sUp.enterPassword("123456789aaaaaaaaaaaaa");
        sUp.enterFirstName("12345");
        sUp.enterLastName("12345");
        boolean isErrorMsgDisplayed = sUp.isFirstNameErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }

    @Test
    public void lastNameErrorMsgIsDisplayed() {
        /*Verify last name error Msg "Please check your last name"
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        sIn.clickSignUpLink();
        sUp.enterEmail("#!@###");
        sUp.enterPassword("123456789aaaaaaaaaaaaa");
        sUp.enterFirstName("12345");
        sUp.enterLastName("12345");
        sUp.clickCreateAccountButton();
        boolean isErrorMsgDisplayed = sUp.isLastNameErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }
}
