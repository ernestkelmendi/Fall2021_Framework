package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FeedbackNewWindow extends WebCommands {

    By submitButtonLocator = By.xpath("//button[@id='submit-button']");
    By redBoxLocator = By.xpath("//fieldset[@id='required_box_page_rating']");
    By errorMsgLocator = By.xpath("//p[contains(text(),'Please fill in the required information highlighte')]");
    By ratingFiveLocator = By.xpath("//label[@for='page-rating-5']");
    By pageCommentsLocator = By.xpath("//textarea[@id='verbatim']");
    By willYourReturnLocator = By.xpath("//select[@id='will-you-return']");
    By haveYouEverBookedLocator = By.xpath("(//span[contains(text(),'Yes')])[1]");
    By didYouAccomplishLocator = By.xpath("(//span[contains(text(),'Yes')])[2]");
    By thankYouForFeedbackLocator = By.xpath("//h5[contains(text(),'THANK YOU FOR YOUR FEEDBACK.')]");


    public void clickSubmitButton() {
        clickThis(submitButtonLocator);}

    public boolean isRedBoxDisplayed (){
        return isWebElementDisplayed(redBoxLocator);}

    public boolean isErrorMsgDisplayed (){
        return isWebElementDisplayed(errorMsgLocator);}

    public void clickRatingFive() {
        clickThis(ratingFiveLocator);}

    public void enterComments (String comments) {
        type(pageCommentsLocator, comments);}

    public void selectWillYouReturn (String howLikelyAreYouToReturnText){
        Select howLikelyAreYouToReturnSelect = new Select(getElement(willYourReturnLocator));
        howLikelyAreYouToReturnSelect.selectByVisibleText(howLikelyAreYouToReturnText);
    }

    public void clickHaveYouEverBooked() {
        clickThis(haveYouEverBookedLocator);}

    public void clickDidYouAccomplish () {
        clickThis(didYouAccomplishLocator);}

    public boolean isThankYouForYourFeedbackDisplayed (){
        return isWebElementDisplayed(thankYouForFeedbackLocator);}






}
