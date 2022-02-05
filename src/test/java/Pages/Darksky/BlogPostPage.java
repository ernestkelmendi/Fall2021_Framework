package Pages.Darksky;

import Helper.Check;
import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class BlogPostPage extends WebCommands {

    public static By dateBlogPostLocator = By.xpath("//time[@itemprop='datePublished']");
    String date [];


    public String [] storeAllDates (){
        List<WebElement> dates = getElements(BlogPostPage.dateBlogPostLocator);

        String date [] = new String [dates.size()];
        for (int i=0; i<=dates.size()-1; i++){
            date[i]= dates.get(i).getText();
        }
        return date;
    }
    public void verifyBlogPostDateFormat() {

        SimpleDateFormat dF = new SimpleDateFormat("MMMM d, yyyy");
        String expectedDate = new String();

        date = storeAllDates();

        for (int i=0; i<=date.length-1; i++){

            try{
                expectedDate = dF.format(dF.parse(date[i]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Check.checkEquals(date[i], expectedDate,"different date format");

        }
        UseDriver.quitWebPages();


    }


}
