package Tests.Hotels;

import Pages.Hotels.LaunchPageHotels;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SearchTests {
    @Test
    public void userCanSelectFromSuggestions() {
        UseDriver.openUrl("https://www.hotels.com/");
        LaunchPageHotels lp = new LaunchPageHotels();
        lp.clickSearchTab();
        lp.enterSearchText("New");
        lp.selectFromSearchSuggestions("New Orleans");
    }
}
