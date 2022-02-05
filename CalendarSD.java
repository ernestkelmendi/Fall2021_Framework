package StepDefinition.Hotels;

import Helper.Check;
import Helper.DateUtil;
import Pages.Hotels.LaunchPageHotels;
import Pages.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CalendarSD extends WebCommands {

    Pages.Hotels.LaunchPageHotels lp = new Pages.Hotels.LaunchPageHotels();
    List<WebElement> dates = new ArrayList<>();

    @And("^I verify current month is displayed$")
    public void verifyCurrentMonthDisplayed (){
        boolean isCurrentMonthDisplayed = lp.isCurrentMonthDisplayed();
        Check.checkTrue(isCurrentMonthDisplayed,"Current month is NOT displayed");}

    @Then("^I verify 'Go Back Arrow' button is enabled for current month$")
    public void verifyGoBackArrowButtonIsEnabled (){
        boolean isGoBackArrowEnabled = lp.isArrowGoBackButtonEnabled();
        Check.checkTrue(isGoBackArrowEnabled, "'Go Back Arrow' are disable");
        lp.clickThis(LaunchPageHotels.goBackArrowLocator);
        UseDriver.quitWebPages();}

    @And("^I get all previous days of current month$")
    public List<WebElement> getAllPrevious_dd () {
        int currentDate = Integer.valueOf(DateUtil.currentDate_d_());
        int [] disabledDates = new int [currentDate-1];
        int n = 0;
        for (int i = 0; i<disabledDates.length; i++ ){

            disabledDates[i] = currentDate - 1 - n;
            By enabledDateLocator = By.xpath("//button[@disabled and text()='"+disabledDates[i]+"']");
            WebElement date = getElement(enabledDateLocator);
            dates.add(date);
            n++;
        }
        return dates;}

    @Then("^I verify previous days of current month are not enabled$")
    public void verifyPreviousDaysAreEnabled (){
        for (WebElement date : dates){
            boolean isDateEnable = date.isEnabled();
            Check.checkFalse(isDateEnable,"date is enable");
        }
        UseDriver.quitWebPages();}

}
