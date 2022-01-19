package Pages;

import Helper.Misc;
import Web.UseDriver;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebCommands {

    public WebElement getElement(By locator) {
        return UseDriver.getDriver().findElement(locator);
    }

    public WebElement getElementWithScroll(By locator) {
        WebElement element = null;
        for (int i=1 ; i <= 20 ; i++) {
            try {
                element = UseDriver.getDriver().findElement(locator);
                break;
            } catch (NoSuchElementException e) {
                scrollDown(100);
            }
        }
        return element;
    }

    public WebElement getElementWithWait(By locator) {
        Wait fWait = new FluentWait(UseDriver.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public List<WebElement> getElements(By locator) {
        return UseDriver.getDriver().findElements(locator);
    }

    public void type(By locator, String data) {
        getElementWithWait(locator).sendKeys(data);
        Misc.sleep(2);
    }

    public void type(WebElement element, String data) {
        element.sendKeys(data);
        Misc.sleep(2);
    }

    public void clickThis(By locator) {
        getElementWithWait(locator).click();
        Misc.sleep(2);
    }

    public void clickThis(WebElement element) {
        element.click();
        Misc.sleep(2);
    }

    public void selectFromDropdown(By locator, String dataToSelect) {
        WebElement dropdownElement = getElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(dataToSelect);
        Misc.sleep(2);
    }

    public String getHandle() {
        return UseDriver.getDriver().getWindowHandle();
    }

    public Set<String> getAllHandles() {
        return UseDriver.getDriver().getWindowHandles();
    }

    public void switchToHandle(String handle) {
        UseDriver.getDriver().switchTo().window(handle);
    }

    public void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();     // Casting
        js.executeScript("scrollBy(0,"+pixels+");");
        Misc.sleep(2);
    }

    public void scrollUp(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();     // Casting
        js.executeScript("scrollBy(0,-"+pixels+");");
        Misc.sleep(2);
    }

    public void moveMouseToElement(By locator) {
        WebElement element = getElement(locator);
        Actions act = new Actions(UseDriver.getDriver());
        act.moveToElement(element);
    }

    public void moveMouseToElement(WebElement element) {
        Actions act = new Actions(UseDriver.getDriver());
        act.moveToElement(element);
    }

    public void clickOneOfElementsUsingText(By locator, String text) {
        List<WebElement> allElements = getElements(locator);
        for (WebElement element : allElements) {
            String elementText = element.getText();
            if (elementText.equalsIgnoreCase(text)) {
                clickThis(element);
                Misc.sleep(2);
                break;
            }
        }
    }

    public void clickOneOfElementsUsingAttributeValue(By locator, String attributeName, String attributeValue) {
        List<WebElement> allElements = getElements(locator);
        for (WebElement element : allElements) {
            String attributeValueFromWeb = element.getAttribute(attributeName);
            if (attributeValueFromWeb.equalsIgnoreCase(attributeValue)) {
                clickThis(element);
                Misc.sleep(2);
                break;
            }
        }
    }

    public Alert waitForAlert() {
        WebDriverWait webDriverWait = new WebDriverWait(UseDriver.getDriver(), 20);
        webDriverWait.until(ExpectedConditions.alertIsPresent());
        return UseDriver.getDriver().switchTo().alert();
    }

    public void clickPositiveButtonOnAlert() {
        Alert alert = waitForAlert();
        alert.accept();
    }

    public void clickNegativeButtonOnAlert() {
        Alert alert = waitForAlert();
        alert.dismiss();
    }

    public String getTextFromAlert() {
        Alert alert = waitForAlert();
        return alert.getText();
    }

    public void switchToFrame(String idValue) {
        UseDriver.getDriver().switchTo().frame(idValue);
    }

    public void switchToFrame(By locator) {
        WebElement element = getElementWithScroll(locator);
        UseDriver.getDriver().switchTo().frame(element);
    }

    public boolean isWebElementDisplayed(By locator) {
        return getElementWithWait(locator).isDisplayed();
    }

    public boolean isWebElementEnabled(By locator) {
        return getElementWithWait(locator).isEnabled();
    }




}
