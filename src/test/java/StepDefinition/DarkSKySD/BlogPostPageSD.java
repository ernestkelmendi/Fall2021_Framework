package StepDefinition.DarkSKySD;

import Pages.Darksky.BlogPostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BlogPostPageSD {
    BlogPostPage bp = new BlogPostPage();


    @And("^I store blog post page dates$")
    public void storeAllDates (){
        bp.storeAllDates();
    }
    @Then("^I verify blog post date is showing in correct format 'MMMM d, yyyy'$")
    public void verifyBlogPostDateFormat() {

        bp.verifyBlogPostDateFormat();
    }
}
