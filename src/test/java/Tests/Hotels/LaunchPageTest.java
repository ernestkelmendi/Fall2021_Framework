package Tests.Hotels;

import Helper.Check;
import Pages.Hotels.LaunchPageHotels;
import Web.UseDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LaunchPageTest {

    LaunchPageHotels lp = new LaunchPageHotels();


    @Test
    public void verifyBackArrowButtonAreDisable_ForCurrentMonth(){
        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickCheckInButton();
        boolean isCurrentMonthDisplayed = lp.isCurrentMonthDisplayed();
        Check.checkTrue(isCurrentMonthDisplayed,"Current month is NOT displayed");
        boolean isGoBackArrowEnable = lp.isArrowGoBackButtonEnable();
        Check.checkTrue(isGoBackArrowEnable, "'Go Back Arrow' are disable");
        lp.clickThis(LaunchPageHotels.goBackArrowLocator);
        lp.clickThis(LaunchPageHotels.goForwardArrowLocator);

        UseDriver.quitWebPages();

    }
    @Test
    public void verifySomeDatesAreDisable_ForCurrentMonth(){
        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickCheckInButton();
        //lp.getCurrentMonth();
        boolean isCurrentMonthDisplayed = lp.isCurrentMonthDisplayed();
        Check.checkTrue(isCurrentMonthDisplayed,"Current month is NOT displayed");

        List <WebElement> dates = lp.getDatesCurrentMonth();
        for (WebElement date: dates){
            boolean isDateEnable = date.isEnabled();
            Check.checkTrue(isDateEnable,"some dates are NOT enable");
        }

        UseDriver.quitWebPages();

    }
}
