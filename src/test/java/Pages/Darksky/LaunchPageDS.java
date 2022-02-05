package Pages.Darksky;

import Pages.WebCommands;
import Helper.Check;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class LaunchPageDS extends WebCommands {

    By timeMachineButton_locator = By.linkText("//a[text()='Time Machine']");
    // By timeMachineButton_locator = By.className("(//*[@class='button'])[3]");
    By currentDayLocator = By.className("is-today");
    By linkAPILocator = By.partialLinkText("Dark Sky API");
    By feelsLikeTempLocator = By.className("feels-like-text");
    By lowTempLocator = By.className("low-temp-text");
    By highTempLocator = By.className("high-temp-text");
    By currentTempFLocator = By.xpath("//span[@class='summary swap']");
    //By fLocator = By.xpath("//span[contains(text(),'˚F')])[1]");
    By fLocator = By.xpath("(//span[@class='label'])[1]");
    By cLocator = By.xpath("//div[@id='header']//li[starts-with(text(),'˚C')][1]");
    By currentTempCLocator = By.xpath("//span[@class='summary swap']");


    public Integer getCurrent_tempCValue (){
        String currentTemp = getElement(currentTempCLocator).getText();
        String[] temp = currentTemp.split("˚");
        int tempCNum = Integer.parseInt(temp[0]);
        return tempCNum;
    }

    public void toChange_from_F_to_C (){
        getElementWithWait(fLocator).click();
        getElementWithWait(cLocator).click();
    }

    public Integer getCurrent_tempFValue (){
        String currentTemp = getElement(currentTempFLocator).getText();
        String[] temp = currentTemp.split("˚");
        int tempTNum = Integer.parseInt(temp[0]);
        return tempTNum;
    }

    public Integer getFeelsLikeTemp () {
        String highTemp = getElement(feelsLikeTempLocator).getText();
        String[] temp = highTemp.split("˚");
        int tempNumFL = Integer.parseInt(temp[0]);
        return tempNumFL;
    }

    public Integer getLowTemp () {
        String highTemp = getElement(lowTempLocator).getText();
        String[] temp = highTemp.split("˚");
        int tempNumL = Integer.parseInt(temp[0]);
        return tempNumL;
    }

    public Integer getHighTemp () {
        String highTemp = getElement(highTempLocator).getText();
        String[] temp = highTemp.split("˚");
        int tempNumH = Integer.parseInt(temp[0]);
        return tempNumH;
    }

    public void verifyFeelsLikeTemp_inBetween (){
        int num ;
        boolean isFeelsLikeTemp_inBetween = ((getFeelsLikeTemp() < getHighTemp()) && (getFeelsLikeTemp() > getLowTemp()));
        Check.checkTrue(isFeelsLikeTemp_inBetween, "feelsLike-tempValue is in NOT between low-tempValue and high-tempValue");
    }


    public void launchDarksky () {
        UseDriver.openUrl("https://www.darksky.net/");
    }

    public void quitDarkSky (){
        UseDriver.quitWebPages();
    }

    public void scroll_and_clickTimeMachineButton() {
        for (int i=1; i<=5; i++){
            try {
                UseDriver.getDriver().findElement(timeMachineButton_locator).click();
                break;
            } catch (ElementClickInterceptedException e) {
                JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
                js.executeScript("scrollBy(0, 500)");
            }
        }

    }

    public boolean currentDate_isSelected (){
        return isWebElementSelected(currentDayLocator);
    }

    public void click_APILink (){
        clickThis(getElement(linkAPILocator));
    }

}
