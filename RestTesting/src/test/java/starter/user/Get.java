package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set GET single api endpoints")
    public String setApiEndpoint() {
        return url + "/1" ;
    }
    @Step("I send GET single HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 3")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for single post")
    public void validateDataSinglePost() {
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}
