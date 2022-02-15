package Tests.Hotels;

import Helper.Check;
import Pages.Hotels.FeedbackNewWindow;
import Pages.Hotels.LaunchPageHotels;
import Pages.WebCommands;
import Web.UseDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class FeedbackPageTest extends WebCommands {

    LaunchPageHotels lp = new LaunchPageHotels();
    FeedbackNewWindow fb = new FeedbackNewWindow();

    @Test
    public void verifyRedDottedBox(){
        UseDriver.openUrl("https://www.hotels.com/");
        lp.clickHelpButton();
        lp.clickWebsiteFeedbackLocator();
        String lpHandle = lp.getLPHandle();

        Set<String> allHandles = getAllHandles();

        for (String handle: allHandles){
            if (!handle.equals(lpHandle)){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
        fb.clickSubmitButton();

        boolean isRedBoxDisplayed = fb.isRedBoxDisplayed();
        Check.checkTrue(isRedBoxDisplayed, "'Red Box' is NOT displayed");

        UseDriver.quitWebPages();

    }
    @Test
    public void verifyMsgIsDisplayed(){
        UseDriver.openUrl("https://www.hotels.com/");
        lp.clickHelpButton();
        lp.clickWebsiteFeedbackLocator();
        String lpHandle = lp.getLPHandle();

        Set<String> allHandles = getAllHandles();

        for (String handle: allHandles){
            if (!handle.equals(lpHandle)){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
        fb.clickSubmitButton();

        boolean isErrorMsgDisplayed = fb.isErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "'Error message' is NOT displayed");

        UseDriver.quitWebPages();

    }
    @Test
    public void thankYouFeedbackMsg(){
        UseDriver.openUrl("https://www.hotels.com/");
        lp.clickHelpButton();
        lp.clickWebsiteFeedbackLocator();
        String lpHandle = lp.getLPHandle();

        Set<String> allHandles = getAllHandles();

        for (String handle: allHandles){
            if (!handle.equals(lpHandle)){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
        fb.clickRatingFive();
        fb.enterComments("Great Website!");
        fb.selectWillYouReturn("Highly likely");
        fb.clickHaveYouEverBooked();
        fb.clickDidYouAccomplish();
        fb.clickSubmitButton();
        boolean isThankYouForFeedbackDisplayed = fb.isThankYouForYourFeedbackDisplayed();
        Check.checkTrue(isThankYouForFeedbackDisplayed, "'Thank you for your feedback' is NOT displayed");
        UseDriver.quitWebPages();

    }

}
