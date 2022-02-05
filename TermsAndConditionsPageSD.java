package StepDefinition.Hotels;

import Helper.Check;
import Pages.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Set;

public class TermsAndConditionsPageSD extends WebCommands {

    Pages.Hotels.TermsAndConditionsPage tc = new Pages.Hotels.TermsAndConditionsPage();
    LaunchPageHotelsSD lp = new LaunchPageHotelsSD();
    Set<String> allHandles;
    String tcHandle;


    @And("^I store all handles after clicking 'Term and Conditions' link$")
    public Set<String> getAllHandles (){
        allHandles = tc.getAllHandles();
        return allHandles;}

    @And("^I store 'Terms and Conditions' page handle$")
    public String getTCHandle (){
        for (String handle: allHandles){
            if (!handle.equals(lp.getLPHandle())){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }

        tcHandle = getHandle();
        return tcHandle;}

    @Then("^I verify new tab opens for 'Terms and Conditions'$")
    public void verifyNewTabOpens () {
        boolean isNewPageOpens = tcHandle.equals(LaunchPageHotelsSD.lpHandle);

        Check.checkFalse(isNewPageOpens, "New page does NOT open in new tab");
        UseDriver.quitWebPages();
    }
}
