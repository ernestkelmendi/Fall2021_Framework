package StepDefinition.DarkSKySD;

import Pages.Darksky.LaunchPageDS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchPageDSSD {

    LaunchPageDS lp = new LaunchPageDS();

    @Given("^I launch darksky.net website$")
    public void launchDarkSky() {
        lp.launchDarksky();
    }

    @Then("^I click on link 'Dark Sky API'$")
    public void click_APILink() {
        lp.click_APILink();
    }

    @When("^I store feelsLike_tempValue$")
    public void feelsLike_tempValue (){
        lp.getFeelsLikeTemp();}

    @And("^I store low_tempValue$")
    public void low_tempValue (){
        lp.getLowTemp();
    }

    @And("^I store high_tempValue$")
    public void high_tempValue (){
        lp.getHighTemp();
    }

    @And("^I quit pages$")
    public void quitDarkSky(){
        lp.quitDarkSky();
    }
    @Then("^Verify feelsLike_tempValue is in between low_tempValue and high_tempValue$")
    public void verify_feelsLikeTempValue (){
        lp.verifyFeelsLikeTemp_inBetween();
    }


}
