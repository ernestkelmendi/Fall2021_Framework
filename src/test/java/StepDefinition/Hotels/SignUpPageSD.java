package StepDefinition.Hotels;

import Helper.Check;
import Pages.Hotels.SignUpPageHotels;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageSD {

    SignUpPageHotels sUp = new SignUpPageHotels();

    @And("^I enter '#!@###' as email$")
    public void typeEmail(){
        sUp.enterEmail("#!@###");}

    @And("^I enter '12345' as password$")
    public void typePassword_lessThenSix(){
        sUp.enterPassword("12345");}

    @And("^I enter '12345' as first name$")
    public void typeFirstName(){
        sUp.enterFirstName("12345");}

    @And("^I enter '123456789aaaaaaaaaaaaa' as password$")
    public void typePassword_moreThenTwenty(){
        sUp.enterPassword("123456789aaaaaaaaaaaaa");}

    @And("^I enter '12345' as last name$")
    public void typeLastName(){
        sUp.enterLastName("12345");}

    @And("^I click 'Create Account' button$")
    public void clickCreateAccount () {
        sUp.clickCreateAccountButton();}

    @Then("^I verify message 'Please check your email address' is displayed$")
    public void isEmailErrorMsgDisplayed (){
        Check.checkTrue(sUp.isEmailErrorMsgDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();}

    @Then("^I verify message 'Please enter a password containing at least six characters' is displayed$")
    public void isPassword_lessThenSix_ErrorMsgDisplayed (){
        Check.checkTrue(sUp.isPasswordLessThenSixErrorMsgDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();}

    @Then("^I verify message 'Your password cannot be more than 20 characters long.' is displayed$")
    public void isPassword_moreThenTwenty_ErrorMsgDisplayed (){
        Check.checkTrue(sUp.isPasswordMoreThenTwentyErrorMsgDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();}

    @Then("^I verify message 'Please check your first name' is displayed$")
    public void isFirstNameErrorMsgDisplayed (){
        Check.checkTrue(sUp.isFirstNameErrorMsgDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();}

    @Then("^I verify message 'Please check your last name' is displayed$")
    public void isLastNameErrorMsgDisplayed (){
        Check.checkTrue(sUp.isLastNameErrorMsgDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();}

    @When("^I click on 'Terms and Conditions' link$")
    public void clickTermsAndConditionsLink(){sUp.clickTermsAndConditionsLink();}

    @When("^I click on 'Privacy Statement' link$")
    public void clickPrivacyStatementLink(){sUp.clickPrivacyStatementLink();}


}
