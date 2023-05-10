package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class DetailSteps {
    @Steps
    HomePage homePage;
    @Steps
    DetailPage detailPage;
    @Given("I am on the home page 2")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
    @When("I click detail")
    public void clickDetail(){
        homePage.clickDetail();
    }
    @Then("I can see product detail")
    public void seeProductDetail(){
        detailPage.validateOndetailPage();
        detailPage.clickHome();
    }
}
