package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage extends WebCommands {

    By firstNameLocator = By.name("firstname");
    By surnameLocator = By.name("lastname");
    By mobileNum_or_EmailAddressLocator = By.xpath("//input[@aria-label='Mobile number or email address']");
    By newPasswordLocator = By.xpath("//input[@data-type='password']");
    By monthLocator = By.id("month");
    By dayLocator = By.name("birthday_day");
    public static By defaultDayLocator = By.xpath("(//option[@selected='1'])[1]");
    public static By defaultMonthLocator = By.xpath("(//option[@selected='1'])[2]");
    public static By defaultYearLocator = By.xpath("(//option[@selected='1'])[3]");
    By yearLocator = By.xpath("//select[@aria-label='Year']");
    By signUpButtonLocator = By.name("websubmit");
    By errorMsgLocator = By.xpath("//div[starts-with(text(),'Please choose a gender')]");



    public void enterFirstName(String firstName) {
        type(firstNameLocator, firstName);
    }

    public void enterSurname(String surname) {
        type(surnameLocator, surname);
    }

    public void enterMobNum_or_EmailAddress
            (String mobileNum_or_EmailAddress){type(mobileNum_or_EmailAddressLocator, mobileNum_or_EmailAddress);}

    public void enterNewPassword (String newPassword){type(newPasswordLocator, newPassword);}

    public void selectMonth (String month_MMM){
        WebElement monthDdElement = getElement(monthLocator);
        Select monthDd = new Select(monthDdElement);
        monthDd.selectByVisibleText(month_MMM);
    }

    public void selectDay (String day_D){
        WebElement dayDdElement = getElement(dayLocator);
        Select dayDd = new Select(dayDdElement);
        dayDd.selectByValue(day_D);
    }

    public void selectYear (String year_YYYY){
        WebElement yearDdElement = getElement(yearLocator);
        Select yearDd = new Select(yearDdElement);
        yearDd.selectByValue(year_YYYY);
    }

    public void clickSignUp (){clickThis(signUpButtonLocator);}

    public boolean isGenderErrorMsgIsDisplayed (){
        return isWebElementDisplayed(errorMsgLocator);
    }

}
