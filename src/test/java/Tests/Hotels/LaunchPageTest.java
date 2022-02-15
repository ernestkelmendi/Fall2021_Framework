package Tests.Hotels;

import Helper.Check;
import Helper.DateUtil;
import Helper.Misc;
import Pages.Hotels.LaunchPageHotels;
import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LaunchPageTest extends WebCommands {

    LaunchPageHotels lp = new LaunchPageHotels();


    @Test
    public void verifyBackArrowButtonIsEnabled_ForCurrentMonth(){
        //for guests hotels.com
        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickCheckInButton();
        boolean isCurrentMonthDisplayed = lp.isCurrentMonthDisplayed();
        Check.checkTrue(isCurrentMonthDisplayed,"Current month is NOT displayed");

        boolean isGoBackArrowEnabled = lp.isArrowGoBackButtonEnabled();
        Check.checkTrue(isGoBackArrowEnabled, "'Go Back Arrow' are disable");
        lp.clickThis(LaunchPageHotels.goBackArrowLocator);

        UseDriver.quitWebPages();

    }
    @Test
    public void verifyDatesAreEnabled_ForCurrentMonth(){
        //for guests hotel.com
        UseDriver.openUrl("https://www.hotels.com/");

        lp.clickCheckInButton();

        boolean isCurrentMonthDisplayed = lp.isCurrentMonthDisplayed();
        Check.checkTrue(isCurrentMonthDisplayed,"Current month is NOT displayed");

        int currentDate = Integer.valueOf(DateUtil.currentDate_d_());
        int [] disabledDates = new int [currentDate-1];

        int n = 0;

        for (int i = 0; i<disabledDates.length; i++ ){
            disabledDates[i] = currentDate - 1 - n;
            By enabledDateLocator = By.xpath("//button[@disabled and text()='"+disabledDates[i]+"']");
            WebElement date = getElement(enabledDateLocator);
            boolean isDateEnable = date.isEnabled();
            Check.checkFalse(isDateEnable,"date is enable");
            n++;
        }

        UseDriver.quitWebPages();

    }
    @Test
    public void verifyChangeDatesButton(){

        UseDriver.openUrl("https://www.hotels.com/");
        lp.clickSearchTab();
        lp.enterSearchText("bora");
        lp.selectFromSearchSuggestions("Bora Bora");
        lp.clickCheckInButton();
        lp.clickGoForwardArrow();
        lp.clickAprilFirstCheckInDate();
        lp.clickAprilTenth_sa_CheckOutDate();
        lp.clickApplyButton();
        lp.clickSearchButton();
        for (int i=1; i<9; i++){
            scrollDown(1000);
            Misc.sleep(2);
        }

        boolean isChangeDatesButtonEnable = lp.isChangeDatesButtonEnabled();
        boolean isChangeDatesButtonDisplayed = lp.isChangeDatesButtonDisplayed();
        Check.checkTrue(isChangeDatesButtonDisplayed & isChangeDatesButtonEnable,
                "'Change Dates' button is either NOT displayed or NOT enabled");

        UseDriver.quitWebPages();

    }

    @Test
    public void verifyNumberOfGuests (){
        //for travelers website
        UseDriver.openUrl("https://www.hotels.com/");
        lp.clickTravelers();
        lp.increaseTravelers();
        // 1 room, 3 travelers
        lp.increaseTravelers();
        // 1 room, 4 travelers

        lp.addOtherRoom();
        // 2 rooms, 5 travelers
        lp.addOtherRoom();
        // 3 rooms, 6 travelers

        lp.clickDoneButton();

        String confirmMsg = lp.getConformationTravelers();

        Check.checkEquals(confirmMsg,"3 rooms, 6 travelers", "Confirmation message error");

        UseDriver.quitWebPages();

    }
    @Test
    public void verifyOurPriceGuaranteeHeading () {
        UseDriver.openUrl("https://www.hotels.com/");
        scrollDown(500);
        lp.clickOurPriceGuarantee();
        String headingText = lp.getText_from_PriceGuaranteeHeading();
        boolean isPriceGuaranteeHeadingDisplayed = lp.isPriceGuaranteeHeadingDisplayed();
        Check.checkTrue(isPriceGuaranteeHeadingDisplayed,"Heading is NOT displayed");
        Check.checkEquals(headingText, "Price Guarantee", "Error text heading");
        UseDriver.quitWebPages();
    }

    @Test
    public void verifyInstantSavingsHeading () {
        UseDriver.openUrl("https://www.hotels.com/");
        scrollDown(500);
        lp.clickOurPriceGuarantee();
        lp.toGoBackOnce();
        Misc.sleep(3);
        scrollDown(500);
        lp.clickGetRewardNight();
        String headingText = lp.getText_from_InstantSavingsHeading();
        boolean isInstantSavingHeadingDisplayed = lp.isInstantSavingDisplayed();
        Check.checkTrue(isInstantSavingHeadingDisplayed,"Heading is NOT displayed");
        Check.checkEquals(headingText, "Instant savings. Reward* nights. And more ...", "Error text heading");
        UseDriver.quitWebPages();

    }
    @Test
    public void verifyIconIsDisplayed () {
        UseDriver.openUrl("https://www.hotels.com/");
        scrollDown(500);
        Misc.sleep(2);
        boolean isFreeCancellationIconDisplayed = lp.isFreeCancellationIconDisplayed();
        Check.checkTrue(isFreeCancellationIconDisplayed,"Icon 'Free cancellation' is NOT displayed");

        boolean isOurPriceGuaranteeIconDisplayed = lp.isOurPriceGuaranteeIconDisplayed();
        Check.checkTrue(isOurPriceGuaranteeIconDisplayed,"Icon 'Our price guarantee' is NOT displayed");

        boolean isGetRewardNightIconDisplayed = lp.isGetRewardNightIconDisplayed();
        Check.checkTrue(isGetRewardNightIconDisplayed,"Icon 'Get a reward night' is NOT displayed");
        UseDriver.quitWebPages();

    }

}
