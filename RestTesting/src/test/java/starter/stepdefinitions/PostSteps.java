package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class PostSteps {

    @Steps
    Post post;
    @Steps
    Get get;
    @Steps
    GetAll getAll;
    @Steps
    Put put;
    @Steps
    Delete delete;

    @Given("I set GET api endpoints")
    public void getApiEndpoints(){
        getAll.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendHttpRequest(){
        getAll.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 1")
    public void receiveValidHttpResponse1(){
        getAll.validateHttpResposeCode200();
    }
    @And("I receive valid get data for all post")
    public void receiveGetDataAllPost(){
        getAll.validateDataAllPost();
    }
    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoint();
    }
    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 201 1")
    public void receiveValidHttpResponse2(){
        post.receiveHttpResponseCode201();
    }
    @And("I receive valid post data for new post")
    public void receivePostDataNewPost(){
        post.validateDataNewPost();
    }
    @Given("I set GET single api endpoints")
    public void getSingleApiEnpoints(){
        get.setApiEndpoint();
    }
    @When("I send GET single HTTP request")
    public void sendGetSingleHttpRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 3")
    public void receiveValidHttpResponse3(){
        get.validateHttpResposeCode200();
    }
    @And("I receive valid get data for single post")
    public void receiveValidGetDataSinglePost(){
        get.validateDataSinglePost();
    }
    @Given("I set PUT api endpoint")
    public void setPutApiEndpoints(){
        put.setPostApiEndpoint();
    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 4")
    public void receiveValidHttpResponse4(){
        put.receiveHttpResponseCode200();
    }
    @And("I receive valid data for updated post")
    public void receiveValidDataUpdatedPost(){
        put.validateDataUpdatedPost();
    }
    @Given("I set DELETE api endpoint")
    public void setDeleteApiEndpoint(){
        delete.setApiEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpRequest200(){
        delete.validateHttpResposeCode200();
    }
}
