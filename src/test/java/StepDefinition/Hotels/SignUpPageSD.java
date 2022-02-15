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

    @And("^I enter 'test@test.com' as email$")
    public void typeValidEmail(){
        sUp.enterEmail("test@test.com");}

    @And("^I enter 'abc1234' as password$")
    public void typeValidPassword(){
        sUp.enterPassword("abc1234");}

    @And("^I enter 'Ernest' as first name$")
    public void typeValidFirstName(){
        sUp.enterFirstName("Anastasia");}

    @And("^I enter 'Kelmendi' as last name$")
    public void typeValidLastName(){
        sUp.enterLastName("Kelmendi");}

    @And("^I click 'Keep me signed in'$")
    public void clickKeepMeSignedIn () {
        sUp.clickKeepMeSignedIn();}

    @Then("^I verify tick-mark is displayed for valid email address$")
    public void isTickMarkDisplayed_for_validEmailAddress (){
        Check.checkTrue(sUp.isEmailDisplayed(), "Thick-mark is NOT displayed for valid email address");}

    @Then("^I verify tick-mark is displayed for valid password$")
    public void isTickMarkDisplayed_for_validPassword (){
        Check.checkTrue(sUp.isPasswordDisplayed(), "Thick-mark is NOT displayed for valid password");}

    @Then("^I verify tick-mark is displayed for valid first name$")
    public void isTickMarkDisplayed_for_validFirstName (){
        Check.checkTrue(sUp.isFirstNameDisplayed(), "Thick-mark is NOT displayed for valid first name");}

    @Then("^I verify tick-mark is displayed for valid last name$")
    public void isTickMarkDisplayed_for_validLastName (){
        Check.checkTrue(sUp.isLastNameDisplayed(), "Thick-mark is NOT displayed for valid last name");
        UseDriver.quitWebPages();}



}
