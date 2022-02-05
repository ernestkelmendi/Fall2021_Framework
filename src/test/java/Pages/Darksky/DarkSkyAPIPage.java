package Pages.Darksky;

import Pages.WebCommands;
import org.openqa.selenium.By;


public class DarkSkyAPIPage extends WebCommands {

    By linkBlogPostLocator = By.partialLinkText("blog post");


    public void click_BlogPostLink (){
        clickThis(getElement(linkBlogPostLocator));
    }


}
