package starter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class Login {
    protected static String email = "wildanrusli19@gmail.com";
    protected static String password = "12345678";

    public String endpoint_auth = "https://service.api-agriplant.xyz/auth/login";
    public static String token = "";

    @Step("set authentication endpoint")
    public String setAuthenticationEndpoint(){
        return endpoint_auth;
    }

    @Step("send authentication endpoint")
    public void sendAuthenticationEndpoint(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("data");
    }
}
