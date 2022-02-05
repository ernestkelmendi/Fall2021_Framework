package StepDefinition.Hotels;

import Helper.Check;
import Helper.Misc;
import Pages.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchPageHotelsSD extends WebCommands {

    Pages.Hotels.LaunchPageHotels lp = new Pages.Hotels.LaunchPageHotels();
    public static String lpHandle;

    @Given("^I launch hotels website$")
    public void launchHotels() {
        UseDriver.openUrl("https://www.hotels.com/");}

    @When ("^I click on SignIn link$")
    public void clickSignInLink(){lp.clickSignIn();}

    @And("^I store launch page handle$")
    public String getLPHandle (){
        lpHandle = lp.getLPHandle();
        return lpHandle;}

    @When("^I click on 'Search' tab$")
    public void clickSearchTab() {lp.clickSearchTab();}

    @And("^I type 'bora'$")
    public void type_bora_(){lp.enterSearchText("bora");}

    @And("^I click from suggestion on 'Bora Bora'$")
    public void selectFromSuggestion () {
        lp.selectFromSearchSuggestions("Bora Bora");}

    @When("^I click on 'Check-In' button$")
    public void clickCheckInButton (){lp.clickCheckInButton();}

    @And("^I click on 'Go Forward Arrow' button$")
    public void clickForwardArrowButton (){lp.clickGoForwardArrow();}

    @And("^I click on 'April 1 2022' button$")
    public void selectAprilFirst () {lp.clickAprilFirstCheckInDate();}

    @And("^I click on 'April 10 2022' button$")
    public void selectAprilTenth () {lp.clickAprilTenth_sa_CheckOutDate();}

    @And("^I click on 'Apply' button$")
    public void clickApplyButton () {lp.clickApplyButton();}

    @And("^I click on 'Search' button$")
    public void clickSearchButton () {lp.clickSearchButton();}

    @And("^I scroll down to end of page$")
    public void scrollDown_to_EndOfPade () {
        for (int i=1; i<9; i++){
            scrollDown(1000);
            Misc.sleep(2);
        }
    }

    @Then("^I verify 'Change Dates' button is displayed and enabled$")
    public void verifyChangeDatesButton () {
        boolean isChangeDatesButtonEnable = lp.isChangeDatesButtonEnabled();
        boolean isChangeDatesButtonDisplayed = lp.isChangeDatesButtonDisplayed();
        Check.checkTrue(isChangeDatesButtonDisplayed & isChangeDatesButtonEnable,
                "'Change Dates' button is either NOT displayed or NOT enabled");

        UseDriver.quitWebPages();}

    @When("^I click on 'Travelers' button$")
    public void clickTravelersButton () {lp.clickTravelers();}

    @And("^I click 'plus' button to increase by 1 traveler$")
    public void increaseTravelers () {lp.increaseTravelers();}

    @And("^I click 'Add another room' button$")
    public void addAnotherRoom (){lp.addOtherRoom();}

    @And("^I click 'Done' button$")
    public void clickDoneButton (){lp.clickDoneButton();}

    @And("^I get text from 'Travelers' button$")
    public String getText_from_TravelersButton (){
        return lp.getConformationTravelers();}

    @Then("^I verify number of travelers as selected$")
    public void verifyNumberOfTravelers () {
        Check.checkEquals(lp.getConformationTravelers(),"3 rooms, 6 travelers", "Confirmation message error");
        UseDriver.quitWebPages();}

}
