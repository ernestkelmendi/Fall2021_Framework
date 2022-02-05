package StepDefinition.Hotels;

import Helper.Check;
import Pages.Hotels.SignInPageHotels;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSD {

    SignInPageHotels sIn = new SignInPageHotels();

    @When("^I click on SignUp link$")
    public void clickSignUpLink(){sIn.clickSignUpLink();}

    @And("^I enter '#!@###' as email using 'Sign in' page$")
    public void typeEmail(){
        sIn.enterEmail("#!@###");}

    @And("^I enter '12345' as password using 'Sign in' page$")
    public void typePassword(){
        sIn.enterPassword("12345");}

    @And("^I click 'Sign In' button$")
    public void clickSignInButton(){sIn.clickSignInButton();}

    @Then("^I verify 'Sign in' Error message 'We don’t recognize the email and password combination you’ve entered...' is displayed$")
    public void isSignInErrorMsgDisplayed (){
        Check.checkTrue(sIn.isSignInErrorMsgDisplayed(), "'Sign in' error message is NOT displayed ");
        UseDriver.quitWebPages();}
}
