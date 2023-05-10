package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the home page 1")
    public void onTheHomePageFirst() {
        homePage.openPage();
        homePage.validateOnHomePage();
    }
    @When("I click login button")
    public void clickLoginButton() {
       homePage.clickLogin();
       loginPage.validateOnLoginPage();
    }
    @And("I input valid username")
    public void inputValidUsername() {
        loginPage.inputUserName("someone@mail.com");
    }
    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("123123");
    }
    @And("I input invalid username")
    public void inputInvalidUsername() {
        loginPage.inputUserName("Adamsurya");
    }
    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("XsFXekWKs7XA");
    }
    @And("I click signin button")
    public void clickSigninButton() {
        loginPage.clickSigninButton();
    }
    @Then("I still on login Page")
    public void onTheLoginPage() {
        homePage.validateOnHomePage();
    }
    @Then("I am success to log in")
    public void onTheHomePageLogin() {
        homePage.validateOnHomePage();
    }
}