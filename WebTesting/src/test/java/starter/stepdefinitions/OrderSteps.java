package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.HomePage;
import starter.pages.TransactionPage;

public class OrderSteps {
    @Steps
    HomePage homePage;
    @Steps
    CartPage cartPage;
    @Steps
    TransactionPage transactionPage;
    @Given("I am on the home page 3")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
    @When("I click buy button")
    public void clickBuyButton(){
        homePage.clickBuy();
    }
    @And("I click cart button")
    public void clickCartButton(){
        homePage.clickCart();
    }
    @And("I go to payment page")
    public void goToPaymentPage(){
        cartPage.validateOnCartPage();
    }
    @And("I click pay button")
    public void clickPayButton(){
        cartPage.clickBayar();
    }
    @Then("I can see transaction detail")
    public void canSeeTransaction(){
        transactionPage.validateOnHomePage();
        transactionPage.clickHome();
    }
}
