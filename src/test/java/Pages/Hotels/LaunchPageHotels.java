package Pages.Hotels;

import Helper.DateUtil;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaunchPageHotels extends WebCommands {

    By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By searchBoxLocator = By.id("location-field-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");
    By signInLocator = By.xpath("//span[text()='Sign in']");
    public static String lpHandle;
    By guestsLocator = By.xpath("//span[contains(text(),'Guests')]");
    By checkInLocator = By.xpath("//span[contains(text(),'Check in')]");
    By currentMonthLocator =
            By.xpath("//h2[contains(text(),'"+ DateUtil.getCurrent_MMMM_()+" "+DateUtil.getCurrent_yyyy_()+"')]");
    By datesCurrentMonthLocator =
            By.xpath("//button[contains(@name,'"+DateUtil.currentDate_MMM_()+
                    "')and contains(@name,'"+DateUtil.getCurrent_yyyy_()+"')]");


    public static By goBackArrowLocator = By.xpath("//button[@aria-label='Previous']");
    public static By goForwardArrowLocator = By.xpath("//button[@aria-label='Next']");



    public void clickSearchTab() {
        clickThis(searchTabLocator);}

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);}

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);}

    public void clickSignIn(){
        clickThis(signInLocator);}

    public String getLPHandle(){
        lpHandle = getHandle();
        return lpHandle;}

    public void clickGuestsButton (){
        clickThis(guestsLocator);}

    public void clickCheckInButton (){
        clickThis(checkInLocator);}

    public void getCurrentMonth(){
        getElement(currentMonthLocator);}

    public boolean isCurrentMonthDisplayed (){
        return isWebElementDisplayed(currentMonthLocator);}



    public boolean isArrowGoBackButtonEnable (){
        return isWebElementEnabled(goBackArrowLocator);}

    public List<WebElement> getDatesCurrentMonth (){
        return getElements(datesCurrentMonthLocator);}

}
