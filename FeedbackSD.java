package StepDefinition.Hotels;

import Helper.Check;
import Pages.Hotels.FeedbackNewWindow;
import Pages.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

public class FeedbackSD extends WebCommands {

    Pages.Hotels.LaunchPageHotels lp = new Pages.Hotels.LaunchPageHotels();
    FeedbackNewWindow fb = new FeedbackNewWindow();

    @When("^I switch window handle to 'DirectWord' page$")
    public void switchWindowHandle_fromLP_toDirectWord() {
        String lpHandle = lp.getLPHandle();

        Set<String> allHandles = getAllHandles();

        for (String handle : allHandles) {
            if (!handle.equals(lpHandle)) {
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
    }

    @And("^I click on 'Submit' button$")
    public void clickSubmitButton (){fb.clickSubmitButton();}

    @Then("^I verify error is displayed when user submits the empty feedback form$")
    public void verifyErrorMsgIsDisplayed () {
        boolean isErrorMsgDisplayed = fb.isErrorMsgDisplayed();
        Check.checkTrue(isErrorMsgDisplayed, "'Error message' is NOT displayed");

        UseDriver.quitWebPages();
    }

    @Then("^I verify red dotted box$")
    public void verifyRedDottedBoxIsDisplayed () {
        boolean isRedBoxDisplayed = fb.isRedBoxDisplayed();
        Check.checkTrue(isRedBoxDisplayed, "'Red Box' is NOT displayed");

        UseDriver.quitWebPages();
    }

    @And("^I click on 'rating-five'$")
    public void clickRatingFive (){fb.clickRatingFive();}

    @And("^I enter 'Great Website!' as comments$")
    public void enterComments(){
        fb.enterComments("Great Website!");}

    @And("^I select 'Highly likely' from 'How likely are you to return'$")
    public void selectHighlyLikely(){
        fb.selectWillYouReturn("Highly likely");}

    @And("^I click on 'Yes' for 'Prior to this visit, have you ever booked'$")
    public void clickYes_for_HaveYouEverBooked(){
        fb.clickHaveYouEverBooked();}

    @And("^I click on 'Yes' for 'Did you accomplish what you wanted to do on this page'$")
    public void clickYes_for_DidYouAccomplish(){
        fb.clickDidYouAccomplish();}

    @Then("^I verify message 'THANK YOU FOR YOUR FEEDBACK.' is displayed$")
    public void verifyThankYouFeedbackMessage () {
        boolean isThankYouForFeedbackDisplayed = fb.isThankYouForYourFeedbackDisplayed();
        Check.checkTrue(isThankYouForFeedbackDisplayed, "'THANK YOU FOR YOUR FEEDBACK.' is NOT displayed");
        UseDriver.quitWebPages();
    }


}
