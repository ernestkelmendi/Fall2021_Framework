package StepDefinition;

import Helper.Misc;
import Web.UseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FacebookSignUp {
    @When("I click on create new account")
    public void iClickOnCreateNewAccount() {
        UseDriver.openUrl("https://www.facebook.com");

        UseDriver.getDriver().findElement(By.xpath("//a[text()='Create new account' or text()='Create New Account']")).click();
        Misc.sleep(1);

    }

    @When("I enter the first name")
    public void iEnterTheFirstName() {
        UseDriver.getDriver().findElement(By.name("firstname")).sendKeys("John");
    }

    @When("I enter the last name")
    public void iEnterTheLastName() {
        UseDriver.getDriver().findElement(By.name("lastname")).sendKeys("Oliver");
    }

    @When("I enter the mobile number")
    public void iEnterTheMobileNumber() {
        UseDriver.getDriver().findElement(By.name("reg_email__")).sendKeys("9846353738");
    }

    @When("I enter new password")
    public void iEnterNewPassword() {
        UseDriver.getDriver().findElement(By.name("reg_passwd__")).sendKeys("myPassw0rd");
    }

    @When("I enter date of birth")
    public void iEnterDateOfBirth() {
        WebElement monthElement = UseDriver.getDriver().findElement(By.id("month"));
        Select monthDropdown = new Select(monthElement);
        monthDropdown.selectByVisibleText("Jan");

        WebElement dateElement = UseDriver.getDriver().findElement(By.id("day"));
        Select dayDropdown = new Select(dateElement);
        dayDropdown.selectByVisibleText("1");

        WebElement yearElement = UseDriver.getDriver().findElement(By.id("year"));
        Select yearDropdown = new Select(yearElement);
        yearDropdown.selectByVisibleText("2000");
    }

    @When("I click on sign up button")
    public void iClickOnSignUpButton() {
        UseDriver.getDriver().findElement(By.name("websubmit")).click();
        Misc.sleep(2);
    }

    @Then("I verify please select gender error is displayed")
    public void iVerifyPleaseSelectGenderErrorIsDisplayed() {
        boolean isErrorDisplayed = UseDriver.getDriver().findElement(By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']")).isDisplayed();
        Assert.assertTrue(isErrorDisplayed, "Please select gender error is NOT displayed");

        UseDriver.quitWebPages();
    }

    @Then("I verify current date is selected in dropdown when user lands on Sign Up screen")
    public void iVerifyCurrentDateIsSelectedInDropdownWhenUserLandsOnSignUpScreen() {
        UseDriver.getDriver().findElement(By.xpath("//*[@id=\"u_0_2_k8\"]")).click();
        Misc.sleep(1);

    }
}
