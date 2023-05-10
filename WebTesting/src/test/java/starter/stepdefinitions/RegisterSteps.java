package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    RegisterPage registerPage;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.validateOnLoginPage();
    }
    @When("I click register")
    public void clickRegister(){
        loginPage.clickRegister();
    }
    @And("I input fullname")
    public void inputFullname(){
        registerPage.validateOnRegisterPage();
        registerPage.inputUserName("Mahbub Auliaur Rahman");
    }
    @And("I input invalid email")
    public void inputInvalidEmail(){
        registerPage.inputEmail("mahbub123");
    }
    @And("I input register invalid password")
    public void inputInvalidPassword(){
        registerPage.inputPassword("322--");
    }
    @And("I click register button")
    public void clickRegisterButton(){
        registerPage.clickRegisterutton();
    }
    @Then("I success to register")
    public void successRegister(){
        registerPage.validateOnRegisterPage();
    }
    @Then("I failed to register")
    public void failedRegister(){
        registerPage.validateOnRegisterPage();
    }
    @And("I input valid email")
    public void inputValidEmail(){
        registerPage.inputEmail("someoneoi@mail.com");
    }
    @And("I input register valid password")
    public void inputValidPassword(){
        registerPage.inputPassword("123123");
    }

}
