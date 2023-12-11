package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_login {
    public String valid_endpoint_login = "https://service.api-agriplant.xyz/auth/login";
    public String invalid_endpoint_login = "https://service.api-agriplant.xyz/auth/logins";
    protected static String email = "wildanrusli19@gmail.com";
    protected static String password = "12345678";
    protected static String id = "7";

    public String endpoint_auth = "https://service.api-agriplant.xyz/auth/login";
    public static String token = "";

    @Step("set POST valid endpoint for login")
    public String setPostValidEndpointForLogin(){
        return valid_endpoint_login;
    }

    @Step("send POST HTTP request for login")
    public void sendPOSTHTTPRequestForLogin(){
        String body = "{\"email\":\"wildanrusli19@gmail.com\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("received POST HTTP response code 200 for login")
    public void validateHTTPResponseCode200ForLogin(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST endpoint with invalid endpoint for login")
    public String setPostEndpointWithInvalidEndpointForLogin(){
        return invalid_endpoint_login;
    }

    @Step("user send POST HTTP request with invalid endpoint for login")
    public void sendPOSTHTTPRequestWithInvalidEndpointForLogin(){
        String body = "{\"email\":\"wildanrusli19@gmail.com\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForLogin());
    }

    @Step("user received POST HTTP responses code 404 for login")
    public void validateHTTPResponseCode404WithInvalidEndpointForLogin(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request for login with empty email and password")
    public void sendPOSTHTTPRequestForLoginWithEmptyEmailAndPassword(){
        String body = "{\"email\":\"\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("received POST HTTP response code 400 bad request for login")
    public void validateHTTPResponseCode400BadRequestForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with input invalid email and password")
    public void sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword(){
        String body = "{\"email\":\"asal@mail.com\", \"password\": \"123123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("received valid HTTP response code 500 internal server error for login")
    public void validateHTTPResponseCode500InternalServerErrorForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("user send POST HTTP request for login with input valid email and invalid password")
    public void sendPOSTHTTPRequestForLoginWithInputValidEmailAndInvalidPassword(){
        String body = "{\"email\":\"wildanrusli19@gmail.com\", \"password\": \"123123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 500 internal server error")
    public void validateHTTPResponseCode500WithInvalidPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("user send POST HTTP request for login with input invalid email and valid password")
    public void sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndValidPassword(){
        String body = "{\"email\":\"asal@mail.com\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 500 internal server error")
    public void validateHTTPResponseCode500WithInvalidEmailAndValidPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("user send POST HTTP request for login with empty email and valid password")
    public void sendPOSTHTTPRequestForLoginWithEmptyEmailAndValidPassword(){
        String body = "{\"email\":\"\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received POST HTTP response code 400 bad request for empty email")
    public void validateHTTPResponseCode400WithEmptyEmailAndValidPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with valid email and empty password")
    public void sendPOSTHTTPRequestForLoginWithValidEmailAndEmptyPassword(){
        String body = "{\"email\":\"wildanrusli19@gmail.com\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 500 internal server error for empty password")
    public void validateHTTPResponseCode500WithValidEmailAndEmptyPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("user send POST HTTP request for login with invalid email and empty password")
    public void sendPOSTHTTPRequestForLoginWithInvalidEmailAndEmptyPassword(){
        String body = "{\"email\":\"wildanrusli@gmail.com\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for invalid email empty password")
    public void validateHTTPResponseCode400WithInvalidEmailAndEmptyPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with empty email and invalid password")
    public void sendPOSTHTTPRequestForLoginWithEmptyEmailAndInvalidPassword(){
        String body = "{\"email\":\"\", \"password\": \"123123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for empty email invalid password")
    public void validateHTTPResponseCode400WithEmptyEmailAndInvalidPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with other invalid email and empty password")
    public void sendPOSTHTTPRequestForLoginWithOtherInvalidEmailAndEmptyPassword(){
        String body = "{\"email\":\"wildan@gmail.com\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for other invalid email empty password")
    public void validateHTTPResponseCode400WithOtherInvalidEmailAndEmptyPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with invalid email format")
    public void sendPOSTHTTPRequestForLoginWithInvalidEmailFormat(){
        String body = "{\"email\":\"wildanrusli19\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for invalid email format")
    public void validateHTTPResponseCode400WithInvalidEmailFormatForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with valid email format")
    public void sendPOSTHTTPRequestForLoginWithValidEmailFormat(){
        String body = "{\"email\":\"wildanrusli19@gmail.com\", \"password\": \"112233\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 500 internal server error for valid email format and invalid password")
    public void validateHTTPResponseCode500WithValidEmailFormatForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("user send POST HTTP request for login with invalid email format and incorrrect password")
    public void sendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndIncorrectPassword(){
        String body = "{\"email\":\"wildanrusli19\", \"password\": \"123123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for invalid email format and incorrect password")
    public void validateHTTPResponseCode400WithInvalidEmailFormatAndIncorrectPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with invalid email format and valid password")
    public void sendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndValidPassword(){
        String body = "{\"email\":\"wildanrusli19\", \"password\": \"12345678\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("user received valid HTTP response code 400 bad request for invalid email format and valid password")
    public void validateHTTPResponseCode400WithInvalidEmailFormatAndValidPasswordForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user set POST valid endpoint for login")
    public String setUserSetPOSTValidEndpointForLogin(){
        return endpoint_auth;
    }

    @Step("user send POST HTTP request for login with additional valid parameters")
    public void sendPOSTHTTPRequestForLoginWithAdditionalValidParameters(){
        String body = "{\n" +
                "    \"email\":\"" + email + "\",\n" +
                "    \"password\":\"" + password + "\",\n" +
                "    \"id\":\"" + id + "\",\n" +
                "}";


        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setUserSetPOSTValidEndpointForLogin());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("user received POST HTTP response code 200 for login with additional valid parameters")
    public void validateHTTPResponseCode200ForLoginWithAdditionalValidParameters(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
