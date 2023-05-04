package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Put {
    protected String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set PUT api endpoint")
    public String setPostApiEndpoint() {
        return url + "/1" ;
    }
    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Mahbub personal data");
        requestBody.put("body", "Hi i am mahbub auliaur rahman from pasuruan jawa timur");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200 4")
    public void receiveHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for updated post")
    public void validateDataUpdatedPost() {
        restAssuredThat(response -> response.body("title", equalTo("Mahbub personal data")));
        restAssuredThat(response -> response.body("body", equalTo("Hi i am mahbub auliaur rahman from pasuruan jawa timur")));
    }
}
