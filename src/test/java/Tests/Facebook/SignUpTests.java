package Tests.Facebook;

import Helper.Check;
import Helper.DateUtil;
import Pages.Facebook.CreateNewAccountPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SignUpTests {

    // This file will contain all testcases related to Sign Up (facebook)
    LaunchPage lp = new LaunchPage();
    CreateNewAccountPage cNewAccount = new CreateNewAccountPage();


    @Test
    public void errorMsgIsDisplayed() {
        /*Verify error Msg "Please choose a gender. You can change who can see this later"
         */

        UseDriver.openUrl("https://www.facebook.com/");

        lp.click_createNewAccountButton();

        cNewAccount.enterFirstName("Aaa");

        cNewAccount.enterSurname("Bbb");

        cNewAccount.enterMobNum_or_EmailAddress("0123456789");

        cNewAccount.enterNewPassword("aa1234bb");

        cNewAccount.selectDay("7");

        cNewAccount.selectMonth("Feb");

        cNewAccount.selectYear("2001");

        cNewAccount.clickSignUp();

        boolean isErrorMsgDisplayed = cNewAccount.isGenderErrorMsgIsDisplayed();

        Check.checkTrue(isErrorMsgDisplayed, "Expected message is NOT displayed ");

        UseDriver.quitWebPages();

    }

    @Test
    public void verifyCurrentDayByDefault() {

        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");

        String dayExpected = dateExpected[1];

        UseDriver.openUrl("https://www.facebook.com/");

        lp.click_createNewAccountButton();

        String dayDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultDayLocator).getText();

        Check.checkEquals(dayDefault, dayExpected, "default DAY is NOT current day");

        UseDriver.quitWebPages();

    }

    @Test
    public void verifyCurrentMonthByDefault() {

        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");

        String monthExpected = dateExpected[0];

        UseDriver.openUrl("https://www.facebook.com/");

        lp.click_createNewAccountButton();

        String monthDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultMonthLocator).getText();

        Check.checkEquals(monthDefault, monthExpected, "default MONTH is NOT current month");

        UseDriver.quitWebPages();

    }
    @Test
    public void verifyCurrentYearByDefault() {

        String[] dateExpected = DateUtil.currentDate_MMM_d_yyyy().split(" ");

        String yearExpected = dateExpected[2];

        UseDriver.openUrl("https://www.facebook.com/");

        lp.click_createNewAccountButton();

        String yearDefault = cNewAccount.getElementWithWait(CreateNewAccountPage.defaultYearLocator).getText();

        Check.checkEquals(yearDefault, yearExpected, "default YEAR is NOT current year");

        UseDriver.quitWebPages();

    }

}
