package StepDefinition.FacebookSD;

import Helper.Check;
import Pages.Facebook.LaunchPage;
import Pages.Facebook.MessengerHomePage;
import Pages.Facebook.MessengerLoginFail;
import Web.UseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessengerLoginFailSD {

    MessengerLoginFail mFail = new MessengerLoginFail();

    @When("^I click on Messenger Link$")
    public void clickMessengerLink(){
        LaunchPage lp = new LaunchPage();
        lp.clickMessengerLink();
    }

    @When("^I click on Messenger login button$")
    public void click_MessengerLoginButton(){
        MessengerHomePage mp = new MessengerHomePage();
        mp.scroll_and_clickLoginButton();
    }
    @Then("^I verify Messenger login fail link is displayed$")
    public void verifyLinkError_isDisplayed(){
        Check.checkTrue(mFail.isLink_FindYourAccount_Displayed(), "Link --> \"Find your account and log in.\" is not displayed");
        UseDriver.quitWebPages();
    }
    @Then("^I verify button \"Continue\" is enable$")
    public void verifyButtonContinue_isEnabled () {
        Check.checkTrue(mFail.isContinueButtonEnabled(), "button \"Continue\" is NOT enable");
        UseDriver.quitWebPages();
    }

    @Then("^I verify button \"Continue\" is displayed$")
    public void verifyButtonContinue_isDisplayed () {
        Check.checkTrue(mFail.isContinueButtonDisplayed(), "button \"Continue\" is NOT displayed");
        UseDriver.quitWebPages();
    }
    @Then("^I verify \"Keep me signed in\" check-box is not selected by default$")
    public void keep_me_signed_inCheckBoxIsNotSelected() {
        Check.checkFalse(mFail.isKeep_me_signed_inIsSelected(), "Check-Box --> \"Keep me signed in\" is NOT selected");
        UseDriver.quitWebPages();
    }

}
