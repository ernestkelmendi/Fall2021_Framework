package Tests.Hotels;

import Helper.Misc;
import Pages.Hotels.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SearchTests {
    @Test
    public void userCanSelectFromSuggestions() {
        UseDriver.openUrl("https://www.hotels.com/");
        LaunchPage lp = new LaunchPage();
        lp.clickSearchTab();
        lp.enterSearchText("New");
        lp.selectFromSearchSuggestions("New Orleans");
    }
}
