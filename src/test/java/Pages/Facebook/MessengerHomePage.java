package Pages.Facebook;

import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;

public class MessengerHomePage {
    By loginButtonLocator = By.id("loginbutton");


    public void clickLoginButton() {
        UseDriver.getDriver().findElement(loginButtonLocator).click();
    }


    public void scroll_and_clickLoginButton() {
        for (int i=1; i<=15; i++){
            try {
                UseDriver.getDriver().findElement(loginButtonLocator).click();
                break;
            } catch (ElementClickInterceptedException e) {
                JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
                js.executeScript("scrollBy(0, 100)");
            }
        }

    }
}
