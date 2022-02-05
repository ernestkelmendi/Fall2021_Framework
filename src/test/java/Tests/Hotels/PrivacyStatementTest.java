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

public class PrivacyStatementTest extends WebCommands {

    LaunchPageHotels lp = new LaunchPageHotels();
    SignInPageHotels sIn = new SignInPageHotels();
    SignUpPageHotels sUp = new SignUpPageHotels();
    TermsAndConditionsPage tc = new TermsAndConditionsPage();

    @Test
    public void verifyPrivacyStatementPage() {
        /*Verify "Privacy Statement" page opens in new tab
         */

        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickSignIn();
        String lpHandle = lp.getLPHandle();

        sIn.clickSignUpLink();
        sUp.scrollDown(200);
        sUp.clickPrivacyStatementLink();
        Set<String> allHandles = getAllHandles();

        for (String handle : allHandles) {
            if (!handle.equals(lpHandle)) {
                UseDriver.getDriver().switchTo().window(handle);
            }
        }

        String psHandle = getHandle();

        boolean isNewPageOpens = psHandle.equals(lpHandle);

        Check.checkFalse(isNewPageOpens, "New page does NOT open in new tab");
        UseDriver.quitWebPages();
    }

}
