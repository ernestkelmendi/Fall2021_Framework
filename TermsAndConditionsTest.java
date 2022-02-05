package Tests.Hotels;

import Helper.Check;
import Pages.Hotels.LaunchPageHotels;
import Pages.Hotels.SignInPageHotels;
import Pages.Hotels.SignUpPageHotels;
import Pages.Hotels.TermsAndConditionsPage;
import Pages.WebCommands;
import Web.UseDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class TermsAndConditionsTest extends WebCommands {

    LaunchPageHotels lp = new LaunchPageHotels();
    SignInPageHotels sIn = new SignInPageHotels();
    SignUpPageHotels sUp = new SignUpPageHotels();
    TermsAndConditionsPage tc = new TermsAndConditionsPage();

    @Test
    public void verifyTermsAndConditionsPage() {
        /*Verify "Terms and Conditions" page opens in new tab
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();


        sIn.clickSignUpLink();
        sUp.scrollDown(200);
        sUp.clickTermsAndConditionsLink();

        String lpHandle = lp.getLPHandle();

        Set<String> allHandles = getAllHandles();

        for (String handle: allHandles){
            if (!handle.equals(lpHandle)){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }

        String tcHandle = getHandle();

        boolean isNewPageOpens = tcHandle.equals(lpHandle);

        Check.checkFalse(isNewPageOpens, "New page does NOT open in new tab");
        UseDriver.quitWebPages();


    }
}
