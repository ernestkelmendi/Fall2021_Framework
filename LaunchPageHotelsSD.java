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

    @When("^I click on 'Help' button$")
    public void clickHelpButton(){
        lp.clickHelpButton();}

    @When("^I click on 'Website feedback' link$")
    public void clickWebsiteFeedbackLink(){
        lp.clickWebsiteFeedbackLocator();}

    @And("^I scroll down$")
    public void scrollDown (){
        scrollDown(500);}

    @Then("^I verify icon 'Free cancellation' is displayed$")
    public void isFreeCancellationIconDisplayed (){
        Check.checkTrue(lp.isFreeCancellationIconDisplayed(), "Icon 'Free cancellation' is NOT displayed ");}

    @And("^I verify icon 'Our price guarantee' is displayed$")
    public void isOurPriceGuaranteeIconDisplayed (){
        Check.checkTrue(lp.isOurPriceGuaranteeIconDisplayed(), "Icon 'Our price guarantee' is NOT displayed ");}

    @And("^I verify icon 'Get a reward night' is displayed$")
    public void isGetRewardNightIconDisplayed (){
        Check.checkTrue(lp.isGetRewardNightIconDisplayed(), "Icon 'Get a reward night' is NOT displayed ");
        UseDriver.quitWebPages();}

    @And("^I click on 'Our price guarantee' link$")
    public void clickOurPriceGuaranteeLink(){
        lp.clickOurPriceGuarantee();}

    @And("^I click on 'Get a reward night' link$")
    public void clickGetRewardNightLink(){
        lp.clickGetRewardNight();}

    @And("^I move back in a webpage$")
    public void moveBackOnce (){
        lp.toGoBackOnce();
        Misc.sleep(3);}

    @Then("^I verify 'Instant savings.' heading is displayed$")
    public void isInstantSavingsHeadingDisplayed (){
        Check.checkTrue(lp.isInstantSavingDisplayed(), "Heading 'Instant savings.' is NOT displayed ");}

    @Then("^I verify 'Price Guarantee' heading is displayed$")
    public void isPriceGuaranteeHeadingDisplayed (){
        Check.checkTrue(lp.isPriceGuaranteeHeadingDisplayed(), "Heading 'Price Guarantee' is NOT displayed ");}

    @And("^I get text from 'Price Guarantee' heading$")
    public String getText_from_PriceGuaranteeHeading (){
        return lp.getText_from_PriceGuaranteeHeading();}

    @And("^I get text from 'Instant savings.' heading$")
    public String getText_from_InstantSavingsHeading (){
        return lp.getText_from_InstantSavingsHeading();}

    @And("^I verify text from 'Instant savings.' heading is expected$")
    public void verifyTextInstantSavingsHeading () {
        Check.checkEquals(lp.getText_from_InstantSavingsHeading(), "Instant savings. Reward* nights. And more ...", "Error text heading");
        UseDriver.quitWebPages();}

    @And("^I verify text from 'Price Guarantee' heading is expected$")
    public void verifyTextPriceGuaranteeHeading () {
        Check.checkEquals(lp.getText_from_PriceGuaranteeHeading(), "Price Guarantee", "Error text heading");
        UseDriver.quitWebPages();}


}
