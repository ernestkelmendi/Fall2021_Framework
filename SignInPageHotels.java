package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class SignInPageHotels extends WebCommands {

    By signUpLocator = By.xpath("//a[contains(text(),'Sign up')]");
    By emailLocator = By.xpath("//input[@id='sign-in-email']");
    By passwordLocator = By.xpath("//input[@id='sign-in-password']");
    By signInButtonLocator = By.xpath("//button[@id='sign-in-button']");
    //By signInErrorMsgLocator = By.xpath("//small[starts-with(text(),'Please check your first ')]");
    By signInErrorMsgLocator = By.xpath("//div[starts-with(text(),'We don')]");

    public void clickSignUpLink (){
        clickThis(signUpLocator);}

    public void enterEmail (String email) {
        type(emailLocator, email);}

    public void enterPassword (String password) {
        type(passwordLocator, password);}

    public void clickSignInButton (){
        clickThis(signInButtonLocator);
    }

    public boolean isSignInErrorMsgDisplayed (){
        return isWebElementDisplayed(signInButtonLocator);}

}
