package StepDefinition.Hotels;

import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LaunchPageHotelsSD {

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
}
