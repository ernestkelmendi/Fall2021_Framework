package StepDefinition;

import Helper.Check;
import Pages.Facebook.LaunchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
    LaunchPage launchPage = new LaunchPage();

//    @When("^I enter '(.+)' as login email$")
//    public void enterEmail(String inputEmail) {
//        launchPage.enterLoginEmail(inputEmail);
//    }
//
//    @When("^I enter '(.+)' as login password$")
//    public void enterPassword(String inputPwd) {
//        launchPage.enterLoginPassword(inputPwd);
//    }

    @When("^I enter '(.+)' as login (email|password|phone)$")
    public void enterLoginData(String data, String field) {
        switch (field) {
            case "email":
                launchPage.enterLoginEmail(data);
                break;
            case "password":
                launchPage.enterLoginPassword(data);
                break;
            case "phone":
                // code to enter phone
                break;
        }
    }

    @When("^I login in app$")
    public void login() {
        launchPage.enterLoginEmail("validEmail");
        launchPage.enterLoginPassword("validPassword");
        launchPage.clickLoginButton();
    }

    @When("^I click on login button$")
    public void clickLogin() {
        launchPage.clickLoginButton();
    }

    @And("^I verify login error is displayed$")
    public void verifyInvalidLoginError() {
        Check.checkTrue(launchPage.isInvalidLoginErrorDisplayed(), "Invalid Login error is NOT displayed");
    }

//    @When("^I verify user lands on home page$")
//    public void verifyUserLoggedIn() {
//        // code to add later
//    }

    @Then("^I verify login error '(.+)' is displayed$")
    public void verifyLoginError(String errorMsg) {
        switch (errorMsg) {
            case "incorrect email or password":
                // verify incorrect email or password msg is displayed
                break;
            case "enter credentials again":
                // verify enter credentials again msg is displayed
                break;
            default:
                System.out.println("Not implemented for " + errorMsg + " msg");
        }
    }


    /**
     Scenario: Verify user gets error for invalid credential
     Given I launch facebook website
     When I enter '%^&&*()' as login email
     When I enter 'abcd@1234' as login password
     When I click on login button
     Then I verify login error 'incorrect email or password' is displayed
     And I verify login error 'Enter credentials again' is displayed
     */

}
