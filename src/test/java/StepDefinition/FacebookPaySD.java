package StepDefinition;

import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class FacebookPaySD {
    @Given("^I launch facebook website$")
    public void launchFacebook() {
        UseDriver.openUrl("https://www.facebook.com/");
    }


    @Then("^I click on Facebook Pay$")
    public void clickFbPay() {
        LaunchPage lp = new LaunchPage();
        lp.clickFacebookPay();
    }
}
