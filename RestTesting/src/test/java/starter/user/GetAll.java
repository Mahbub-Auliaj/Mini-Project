package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetAll {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set GET api endpoints")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 1")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for all post")
    public void validateDataAllPost() {
        restAssuredThat(response -> response.body("id",notNullValue()));
    }
}
