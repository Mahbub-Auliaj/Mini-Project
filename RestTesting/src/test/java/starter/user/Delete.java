package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set DELETE api endpoint")
    public String setApiEndpoint() {
        return url + "/1" ;
    }
    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
