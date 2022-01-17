package StepDefinition;

import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FacebookPaySD {
    @Given("^I lau.ch facebook website$")
    public void launchFacebook() {
        UseDriver.openUrl("https://www.facebook.com/");
    }


    @Then("^I click on Facebook Pay$")
    public void clickFbPay() {
        LaunchPage lp = new LaunchPage();
        lp.clickFacebookPay();
    }
}
