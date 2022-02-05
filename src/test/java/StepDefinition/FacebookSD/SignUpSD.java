package StepDefinition.FacebookSD;

import Helper.Check;
import Helper.DateUtil;
import Pages.Facebook.CreateNewAccountPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSD {

    LaunchPage lp = new LaunchPage();
    CreateNewAccountPage cNewAccount = new CreateNewAccountPage();

    @When("^I click on Create New Account button$")
    public void click_CreateNewAccountButton(){
        lp.click_createNewAccountButton();
    }

    @And("^I enter 'Aaa' as First name$")
    public void typeFirstName(){
        cNewAccount.enterFirstName("Aaa");
    }

    @And("^I enter 'Bbb' as Surname$")
    public void typeSurname(){
        cNewAccount.enterSurname("Bbb");
    }

    @And("^I enter '0123456789' as Mobile number or email address$")
    public void typeMobNum_or_Email(){
        cNewAccount.enterMobNum_or_EmailAddress("0123456789");
    }

    @And("^I enter 'aa1234bb' as New password$")
    public void typeNewPassword(){
        cNewAccount.enterNewPassword("aa1234bb");
    }

    @And("^I select '7' as DAY of Date of birth$")
    public void selectDay_of_Birthdate(){
        cNewAccount.selectDay("7");
    }

    @And("^I select 'Feb' as MONTH of Date of birth$")
    public void selectMonth_of_Birthdate(){
        cNewAccount.selectMonth("Feb");
    }
    @And("^I select '2001' as YEAR of Date of birth$")
    public void selectYEAR_of_Birthdate(){
        cNewAccount.selectYear("2001");
    }
    @And("^I click Sign Up button$")
    public void clickSignUpButton () {
        cNewAccount.clickSignUp();
    }

    @Then("^I verify message 'Please choose a gender. You can change who can see this later.' is displayed$")
    public void isGenderMsgDisplayed() {
        Check.checkTrue(cNewAccount.isGenderErrorMsgIsDisplayed(), "Expected message is NOT displayed ");
        UseDriver.quitWebPages();
    }
    @Then("^I verify current month is selected in Dropdown Month 'Date of birth'$")
    public void verifyCurrentMonthByDefault() {
        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");
        String monthExpected = dateExpected[0];
        String monthDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultMonthLocator).getText();
        Check.checkEquals(monthDefault, monthExpected, "default MONTH is NOT current month");
        UseDriver.quitWebPages();
    }
    @Then("^I verify current day is selected in Dropdown Day 'Date of birth'$")
    public void verifyCurrentDayByDefault() {
        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");
        String dayExpected = dateExpected[1];
        String dayDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultDayLocator).getText();
        Check.checkEquals(dayDefault, dayExpected, "default DAY is NOT current day");
        UseDriver.quitWebPages();
    }
    @Then("^I verify current year is selected in Dropdown Year 'Date of birth'$")
    public void verifyCurrentYearByDefault() {
        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");
        String yearExpected = dateExpected[2];
        String yearDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultYearLocator).getText();
        Check.checkEquals(yearDefault, yearExpected, "default YEAR is NOT current year");
        UseDriver.quitWebPages();
    }

}
