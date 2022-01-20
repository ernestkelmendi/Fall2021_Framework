import Helper.DateUtil;
import Helper.Misc;
import Web.UseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DarkskyDate {
    @When("I click on darksky API")
    public void iClickOnDarkskyAPI() {
        UseDriver.getDriver().findElement(By.partialLinkText("Dark Sky API")).click();
        Misc.sleep(2);
    }

    @When("I click on blog post")
    public void iClickOnBlogPost() {
        UseDriver.getDriver().findElement(By.partialLinkText("blog post")).click();
        Misc.sleep(2);
    }

    @Then("I Verify dates are displayed in {string} format")
    public void verifyDatesAreDisplayedInFormat(String arg0) {
        String date1Text = UseDriver.getDriver().findElement(By.xpath("(//time[@itemprop='datePublished'])[1]")).getText();
        String date2Text = UseDriver.getDriver().findElement(By.xpath("(//time[@itemprop='datePublished'])[2]")).getText();
        String date3Text = UseDriver.getDriver().findElement(By.xpath("(//time[@itemprop='datePublished'])[3]")).getText();
        String date4Text = UseDriver.getDriver().findElement(By.xpath("(//time[@itemprop='datePublished'])[4]")).getText();
        String[] allDatesText = {date1Text, date2Text, date3Text, date4Text};

        boolean isAllDatesCorrect = false;

        for (String dateText : allDatesText) {
            isAllDatesCorrect = DateUtil.isDateInCorrectFormat(dateText, "MMMM d, yyyy");
            if (!isAllDatesCorrect) {
                break;
            }
        }
    }

    @When("I click Time Machine button")
    public void iClickTimeMachineButton() {
        UseDriver.openUrl("https://www.darksky.net");



    }


    @Then("I Verify current date is selected or highlighted in TimeMachine calendar")
    public void iVerifyCurrentDateIsSelectedOrHighlightedInTimeMachineCalendar() {
        UseDriver.getDriver().findElement(By.xpath("//*[@id=\"timeMachine\"]/div[2]/a")).click();
        Misc.sleep(1);
    }
}
