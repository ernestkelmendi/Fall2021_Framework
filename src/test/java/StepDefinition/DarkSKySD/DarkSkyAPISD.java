package StepDefinition.DarkSKySD;

import Pages.Darksky.DarkSkyAPIPage;
import io.cucumber.java.en.When;

public class DarkSkyAPISD {
    DarkSkyAPIPage api = new DarkSkyAPIPage();
    @When("^I click on link 'blog post'$")
    public void click_linkBlogPost (){
        api.click_BlogPostLink();
    }
}
