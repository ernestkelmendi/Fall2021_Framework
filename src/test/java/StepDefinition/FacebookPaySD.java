package StepDefinition;

import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


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

    @When("I click on facebook Pay")
    public void iClickOnFacebookPay() {
    }

    @Then("I verify a open window opens")
    public void iVerifyAOpenWindowOpens() {
        
    }

    @And("I verify title of facebook Pay is {string}")
    public void iVerifyTitleOfFacebookPayIsFacebookPaySimpleSecureFreePayments() {
        
    }

    @And("I make payment using Facebook Pay")
    public void iMakePaymentUsingFacebookPay() {
        
    }

    @And("I verify Payment successful message is displayed")
    public void iVerifyPaymentSuccessfulMessageIsDisplayed() {

    }
}
