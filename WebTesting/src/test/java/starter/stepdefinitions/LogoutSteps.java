package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LogoutSteps {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;
    @Given("I am on the home page 4")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
    @When("I click account button")
    public void clickAccountButton(){
        homePage.clickAccount();
    }
    @And("I click logout")
    public void clickLogOut(){
        homePage.clickLogout();
    }
    @Then("I success to log out")
    public void successLogOut(){
        loginPage.validateOnLoginPage();
    }
}
