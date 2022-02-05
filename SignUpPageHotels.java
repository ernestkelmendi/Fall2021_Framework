package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;


public class SignUpPageHotels extends WebCommands {
    By emailLocator = By.xpath("//input[@id='sign-up-email']");
    By passwordLocator = By.xpath("//input[@id='sign-up-password']");
    By firstNameLocator = By.xpath("//input[@name='firstName']");
    By lastNameLocator = By.xpath("//input[@name='lastName']");
    By emailErrorMsgLocator = By.xpath("//small[@id='email-error']");
    By passwordLessThenSixErrorMsgLocator = By.xpath("//small[@id='password-error']");
    By passwordMoreThen20ErrorMsgLocator = By.xpath("//small[starts-with(text(),'Your password cannot be more than ')]");
    By firstNameErrorMsgLocator = By.xpath("//small[starts-with(text(),'Please check your first ')]");
    By lastNameErrorMsgLocator = By.xpath("//small[starts-with(text(),'Please check your last ')]");
    By createAccountButtonLocator = By.xpath("//button[@id='signup-button']");
    By termsAndConditionsLocator = By.xpath("//a[@id='sign-up-tc']");
    By privacyStatementLocator = By.xpath("//a[@id='sign-up-privacy']");


    public void enterEmail (String email) {
        type(emailLocator, email);}

    public void enterPassword (String password) {
        type(passwordLocator, password);}

    public void enterFirstName (String firstName) {
        type(firstNameLocator, firstName);}

    public void enterLastName (String lastName) {
        type(lastNameLocator, lastName);}

    public boolean isEmailErrorMsgDisplayed (){
        return isWebElementDisplayed(emailErrorMsgLocator);}

    public boolean isPasswordLessThenSixErrorMsgDisplayed (){
        return isWebElementDisplayed(passwordLessThenSixErrorMsgLocator);}

    public boolean isPasswordMoreThenTwentyErrorMsgDisplayed (){
        return isWebElementDisplayed(passwordMoreThen20ErrorMsgLocator);}

    public boolean isFirstNameErrorMsgDisplayed (){
        return isWebElementDisplayed(firstNameErrorMsgLocator);}

    public boolean isLastNameErrorMsgDisplayed (){
        return isWebElementDisplayed(lastNameErrorMsgLocator);}

    public void clickCreateAccountButton (){
        clickThis(createAccountButtonLocator);}

    public void clickTermsAndConditionsLink (){
        clickThis(termsAndConditionsLocator);}

    public void clickPrivacyStatementLink (){
        clickThis(privacyStatementLocator);}

}
