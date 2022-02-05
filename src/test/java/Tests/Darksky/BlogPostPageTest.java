package Tests.Darksky;

import Helper.Check;
import Pages.Darksky.BlogPostPage;
import Pages.Darksky.DarkSkyAPIPage;
import Pages.Darksky.LaunchPageDS;
import Web.UseDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class BlogPostPageTest {

    LaunchPageDS lp = new LaunchPageDS();
    DarkSkyAPIPage api = new DarkSkyAPIPage();
    BlogPostPage bp = new BlogPostPage();

    @Test
    public void verifyBlogPostDateFormat() {

        lp.launchDarksky();
        lp.click_APILink();
        api.click_BlogPostLink();
        List<WebElement> dates = bp.getElements(BlogPostPage.dateBlogPostLocator);

        String date [] = new String [dates.size()];
        for (int i=0; i<=dates.size()-1; i++){
            date[i]= dates.get(i).getText();
        }

        SimpleDateFormat dF = new SimpleDateFormat("MMMM d, yyyy");
        String expectedDate = new String();


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
