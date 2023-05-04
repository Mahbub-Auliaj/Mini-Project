package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url ;
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Mahbub personal data");
        requestBody.put("body", "Hi i am mahbub auliaur rahman from pasuruan jawa timur");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 201 1")
    public void receiveHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid post data for new post")
    public void validateDataNewPost() {
        restAssuredThat(response -> response.body("title", equalTo("Mahbub personal data")));
        restAssuredThat(response -> response.body("body", equalTo("Hi i am mahbub auliaur rahman from pasuruan jawa timur")));
    }
}
