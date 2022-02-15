package StepDefinition.Hotels;

import Helper.Check;
import Pages.Hotels.PrivacyStatementPage;
import Pages.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Set;

public class PrivacyStatementPageSD extends WebCommands {

    PrivacyStatementPage ps = new PrivacyStatementPage();
    LaunchPageHotelsSD lp = new LaunchPageHotelsSD();
    Set<String> allHandles;
    String psHandle;


    @And("^I store all handles after clicking 'Privacy Statement' link$")
    public Set<String> getAllHandles (){
        allHandles = ps.getAllHandles();
        return allHandles;}

    @And("^I store 'Privacy Statement' page handle$")
    public String getPSHandle (){
        for (String handle: allHandles){
            if (!handle.equals(LaunchPageHotelsSD.lpHandle)){
                UseDriver.getDriver().switchTo().window(handle);
            }
        }

        psHandle = getHandle();
        return psHandle;}

    @Then("^I verify new tab opens for 'Privacy Statement'$")
    public void verifyNewTabOpens () {
        boolean isNewPageOpens = psHandle.equals(LaunchPageHotelsSD.lpHandle);

        Check.checkFalse(isNewPageOpens, "New page does NOT open in new tab");
        UseDriver.quitWebPages();
    }
}
