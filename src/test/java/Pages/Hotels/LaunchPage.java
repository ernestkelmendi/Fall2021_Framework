package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class LaunchPage extends WebCommands {
    By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By searchBoxLocator = By.id("location-field-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");

    public void clickSearchTab() {
        clickThis(searchTabLocator);
    }

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);
    }

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);
    }
}
