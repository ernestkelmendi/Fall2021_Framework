package StepDefinition;

import Helper.Misc;
import Web.UseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Messenger {
    @When("I click on Messenger link")
    public void emptyMessengerLoginFlow() {
        UseDriver.openUrl("https://www.facebook.com");

        UseDriver.getDriver().findElement(By.linkText("Messenger")).click();
        Misc.sleep(5);

        UseDriver.getDriver().findElement(By.id("loginbutton")).click();
        Misc.sleep(5);

        WebElement continueButton = UseDriver.getDriver().findElement(By.id("loginbutton"));
        boolean isContinueDisplayed = continueButton.isDisplayed();
        boolean isContinueEnabled = continueButton.isEnabled();

        WebElement keepSignedInBox = UseDriver.getDriver().findElement(By.xpath("//input[@name='persistent']/following-sibling::span"));
        boolean isKeepSignedBoxChecked = keepSignedInBox.isSelected();


    }

    @When("I click on login button on Messenger link")
    public void iClickOnLoginButtonOnMessengerLink() {
        UseDriver.getDriver().findElement(By.id("loginbutton")).click();
        Misc.sleep(5);
    }

    @Then("I verify continue button is displayed and enabled")
    public void iVerifyContinueButtonIsDisplayedAndEnabled() {
        WebElement continueButton = UseDriver.getDriver().findElement(By.id("loginbutton"));
        boolean isContinueDisplayed = continueButton.isDisplayed();
        boolean isContinueEnabled = continueButton.isEnabled();
    }

    @Then("I verify {string} checkbox is not selected")
    public void iVerifyCheckboxIsNotSelected(String arg0, boolean isContinueEnabled, boolean isContinueDisplayed, boolean isKeepSignedBoxChecked) {
        Assert.assertTrue(isContinueDisplayed, "Continue button is NOT displayed");
        Assert.assertTrue(isContinueEnabled, "Continue button is NOT enabled");
        Assert.assertFalse(isKeepSignedBoxChecked, "Keep me Sign in checkBox is selected");
    }
}
