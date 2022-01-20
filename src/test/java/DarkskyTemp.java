import Helper.Misc;
import Web.UseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DarkskyTemp {
    @Given("I launch darksky website")
    public void iLaunchDarkskyWebsite() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.darksky.net/";
        driver.get(url);

        WebElement feelsLikeElement = driver.findElement(By.xpath("//span[@class=\"feels-like-text\"]"));


        int feelsLike = Integer.parseInt(feelsLikeElement.getText().substring(0, feelsLikeElement.getText().length() - 1));

        WebElement lowTempElement = driver.findElement(By.xpath("//span[@class=\"low-temp-text\"]"));

        int lowTemp = Integer.parseInt(feelsLikeElement.getText().substring(0, lowTempElement.getText().length() - 1));

        WebElement highTempElement = driver.findElement(By.xpath("//span[@class=\"high-temp-text\"]"));

        int highTemp = Integer.parseInt(highTempElement.getText().substring(0, highTempElement.getText().length() - 1));

        boolean isTmpBet = (feelsLike > lowTemp && feelsLike < highTemp);

        Assert.assertTrue(isTmpBet, "Temperature - is not in between Low and High Temperatures");



    }

    @Then("I verify feelsLike-tempValue is in between low and high tempValue")
    public void iVerifyFeelsLikeTempValueIsInBetweenLowAndHighTempValue() {

    }

    @When("I change Temp unit from ˚F to ˚C")
    public void iChangeTempUnitFromFToC() {
        String fTempText = UseDriver.getDriver().findElement(By.xpath("//span[@class='summary swap']")).getText();
        int fTemp = Misc.removeDegreeAndGetTempAsInt(fTempText);

        By tempUnitButton = By.xpath("(//div[contains(@class, 'selectric-units')]//div[@class='selectric'])[1]//span");
        UseDriver.getDriver().findElement(tempUnitButton).click();
        Misc.sleep(1);

        By firstDegCelsiusButton = By.xpath("(//div[contains(@class, 'selectric-open')]//div[@class='selectric-scroll']//li[contains(text(), '˚C')])[1]");
        UseDriver.getDriver().findElement(firstDegCelsiusButton).click();
        Misc.sleep(1);
    }

    @Then("I Verify temp value is displayed correctly when user changes the temp unit from ˚F to ˚C")
    public void iVerifyTempValueIsDisplayedCorrectlyWhenUserChangesTheTempUnitFromFToC() {
        String cTempText = UseDriver.getDriver().findElement(By.xpath("//span[@class='summary swap']")).getText();
        int cTemp = Misc.removeDegreeAndGetTempAsInt(cTempText);

        UseDriver.quitWebPages();
    }
}
