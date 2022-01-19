package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class SignUpPage extends WebCommands {

    By selectedMonthLocator = By.xpath("//select[@id='month']//option[@selected='1']");

    public String getSelectedMonth() {
        return getElement(selectedMonthLocator).getText();
    }

}
