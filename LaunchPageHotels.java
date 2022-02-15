package Pages.Hotels;

import Helper.DateUtil;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaunchPageHotels extends WebCommands {

    //By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By searchTabLocator = By.xpath("//input[contains(@data-stid, 'sqm-destination')]");
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
    By aprilFirstCheckInDateLocator = By.xpath("//button[contains(@name,'Apr 01 2022 ')]");
    By aprilTenth_as_CheckOutDateLocator = By.xpath("//button[contains(@name,'Apr 10 2022 ')]");
    By applyButtonLocator = By.xpath("//button[contains(text(),'Apply')]");
    By searchButtonLocator = By.xpath("//button[contains(text(),'Search')]");
    By changeDatesLocator = By.xpath("//button[@aria-label='Change dates']");
    By travelersLocator = By.xpath("//button[contains(text(),'1 room, 2 travelers')]");
    By increaseTravelersLocator = By.xpath("//*[starts-with(@aria-labelledby,'uitk-step-increase-adults-')]");
    By addOtherRoomLocator = By.xpath("//button[text()='Add another room']");
    By doneButtonLocator = By.xpath("//button[text()='Done']");
    By confirmTravelersLocator = By.xpath("//*[@data-testid='travelers-field-trigger']");
    By helpButtonLocator = By.xpath("//span[contains(text(),'Help')]");
    By websiteFeedbackLocator = By.xpath("(//a[contains(text(),'Website feedback')])[1]");
    By ourPriceGuaranteeLocator = By.xpath("//h3[contains(text(),'Our price guarantee')]");
    By priceGuaranteeHeadingLocator = By.xpath("//h1[contains(text(),'Price Guarantee')]");
    By getRewardNightLocator = By.xpath("//h3[contains(text(),'Get a reward night')]");
    By instantSavingsHeadingLocator = By.xpath("//h1[contains(text(),'Instant savings.')]");
    By freeCancellationIconLocator = By.xpath("//li[@class='_2lKfOI _2Y71AG _3LHmkp']");
    By ourPriceGuaranteeIconLocator = By.xpath("//li[@class='bPi4hj _2Y71AG _1geHg4']");
    By getRewardNightIconLocator = By.xpath("//li[@class='_3QWktI _2Y71AG _3SZFs0']");


    public void clickSearchTab() {
        clickThis(searchTabLocator);}

    public void enterSearchText(String searchText) {
        type(searchTabLocator, searchText);}

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

    public boolean isArrowGoBackButtonEnabled (){
        return isWebElementEnabled(goBackArrowLocator);}

    public List<WebElement> getDatesCurrentMonth (){
        return getElements(datesCurrentMonthLocator);}

    public void clickGoForwardArrow() {
        clickThis(goForwardArrowLocator);}

    public void clickAprilFirstCheckInDate() {
        clickThis(aprilFirstCheckInDateLocator);}

    public void clickAprilTenth_sa_CheckOutDate() {
        clickThis(aprilTenth_as_CheckOutDateLocator);}

    public void clickApplyButton() {
        clickThis(applyButtonLocator);}

    public void clickSearchButton() {
        clickThis(searchButtonLocator);}

    public boolean isChangeDatesButtonEnabled (){
        return isWebElementEnabled(changeDatesLocator);}

    public boolean isChangeDatesButtonDisplayed (){
        return isWebElementDisplayed(changeDatesLocator);}

    public void clickTravelers (){
        clickThis(travelersLocator);}

    public void increaseTravelers (){
        clickThis(increaseTravelersLocator);}

    public void addOtherRoom(){
        clickThis(addOtherRoomLocator);}

    public void clickDoneButton(){
        clickThis(doneButtonLocator);}

    public String getConformationTravelers (){
        return getText(confirmTravelersLocator);}

    public void clickHelpButton (){
        clickThis(helpButtonLocator);}

    public void clickWebsiteFeedbackLocator () {
        clickThis(websiteFeedbackLocator);}

    public void clickOurPriceGuarantee (){
        clickThis(ourPriceGuaranteeLocator);}

    public String getText_from_PriceGuaranteeHeading (){
        return getText(priceGuaranteeHeadingLocator);}

    public boolean isPriceGuaranteeHeadingDisplayed (){
        return isWebElementDisplayed(priceGuaranteeHeadingLocator);}

    public void clickGetRewardNight (){
        clickThis(getRewardNightLocator);}

    public String getText_from_InstantSavingsHeading (){
        return getText(instantSavingsHeadingLocator);}

    public boolean isInstantSavingDisplayed (){
        return isWebElementDisplayed(instantSavingsHeadingLocator);}

    public boolean isFreeCancellationIconDisplayed (){
        return isWebElementDisplayed(freeCancellationIconLocator);}

    public boolean isOurPriceGuaranteeIconDisplayed (){
        return isWebElementDisplayed(ourPriceGuaranteeIconLocator);}

    public boolean isGetRewardNightIconDisplayed (){
        return isWebElementDisplayed(getRewardNightIconLocator);}


}
