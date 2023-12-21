package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.POST_login;

public class POST_loginSteps {
    @Steps
    POST_login post_login;
    @Given("user set POST valid endpoint for login")
    public void userSetPOSTValidEndpointForLogin() {
        post_login.setPostValidEndpointForLogin();
    }

    @When("user send POST HTTP request for login")
    public void userSendPOSTHTTPRequestForLogin() {
        post_login.sendPOSTHTTPRequestForLogin();
    }

    @Then("user received POST HTTP response code {int} for login")
    public void userReceivedPOSTHTTPResponseCodeForLogin(int arg0) {

        post_login.validateHTTPResponseCode200ForLogin();
    }

    @Given("user set POST endpoint with invalid endpoint for login")
    public void userSetPOSTEndpointWithInvalidEndpointForLogin() {
        post_login.setPostEndpointWithInvalidEndpointForLogin();
    }

    @When("user send POST HTTP request with invalid endpoint for login")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForLogin() {
        post_login.sendPOSTHTTPRequestWithInvalidEndpointForLogin();
    }

    @Then("user received POST HTTP responses code {int} for login")
    public void userReceivedPOSTHTTPResponsesCodeForLogin(int arg0) {
        post_login.validateHTTPResponseCode404WithInvalidEndpointForLogin();
    }

    @When("user send POST HTTP request for login with empty email and password")
    public void userSendPOSTHTTPRequestForLoginWithEmailAndPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithEmptyEmailAndPassword();
    }

    @Then("user received POST HTTP response code {int} bad request for login")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLogin(int arg0) {
        post_login.validateHTTPResponseCode400BadRequestForLogin();
    }

    @When("user send POST HTTP request for login with input invalid email and password")
    public void userSendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword();
    }

    @Then("user received valid HTTP response code 500 internal server error for login")
    public void userReceivedPOSTHTTPResponseCode500InternalServerErrorForLogin() {
        post_login.validateHTTPResponseCode500InternalServerErrorForLogin();
    }

    @When("user send POST HTTP request for login with input valid email and invalid password")
    public void userSendPOSTHTTPRequestForLoginWithInputValidEmailAndInvalidPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithInputValidEmailAndInvalidPassword();
    }

    @Then("user received valid HTTP response code 500 internal server error for invalid password")
    public void userReceivedPOSTHTTPResponseCode500InternalServerErrorForLoginWithInvalidPassword() {
        post_login.validateHTTPResponseCode500WithInvalidPasswordForLogin();
    }

    @When("user send POST HTTP request for login with input invalid email and valid password")
    public void userSendPOSTHTTPRequestForLoginWithInputInvalidEmailAndValidPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndValidPassword();
    }

    @Then("user received valid HTTP response code 500 internal server error for invalid email")
    public void userReceivedPOSTHTTPResponseCode500InternalServerErrorForLoginWithInvalidEmail() {
        post_login.validateHTTPResponseCode500WithInvalidEmailAndValidPasswordForLogin();
    }

    @When("user send POST HTTP request for login with empty email and valid password")
    public void userSendPOSTHTTPRequestForLoginWithEmptyEmailAndValidPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithEmptyEmailAndValidPassword();
    }

    @Then("user received POST HTTP response code 400 bad request for empty email")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithEmptyEmail() {
        post_login.validateHTTPResponseCode400WithEmptyEmailAndValidPasswordForLogin();
    }

    @When("user send POST HTTP request for login with valid email and empty password")
    public void userSendPOSTHTTPRequestForLoginWithValidEmailAndEmptyPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithValidEmailAndEmptyPassword();
    }

    @Then("user received valid HTTP response code 500 internal server error for empty password")
    public void userReceivedPOSTHTTPResponseCode500InternalServerErrorForLoginWithEmptyPassword() {
        post_login.validateHTTPResponseCode500WithValidEmailAndEmptyPasswordForLogin();
    }

    @When("user send POST HTTP request for login with invalid email and empty password")
    public void userSendPOSTHTTPRequestForLoginWithInvalidEmailAndEmptyPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithInvalidEmailAndEmptyPassword();
    }

    @Then("user received valid HTTP response code 400 bad request for invalid email empty password")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithInvalidEmailAndEmptyPassword() {
        post_login.validateHTTPResponseCode400WithInvalidEmailAndEmptyPasswordForLogin();
    }

    @When("user send POST HTTP request for login with empty email and invalid password")
    public void userSendPOSTHTTPRequestForLoginWithEmptyEmailAndInvalidPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithEmptyEmailAndInvalidPassword();
    }

    @Then("user received valid HTTP response code 400 bad request for empty email invalid password")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithEmptyEmailAndInvalidPassword() {
        post_login.validateHTTPResponseCode400WithEmptyEmailAndInvalidPasswordForLogin();
    }

    @When("user send POST HTTP request for login with other invalid email and empty password")
    public void userSendPOSTHTTPRequestForLoginWithOtherInvalidEmailAndEmptyPassword() {
        post_login.sendPOSTHTTPRequestForLoginWithOtherInvalidEmailAndEmptyPassword();
    }

    @Then("user received valid HTTP response code 400 bad request for other invalid email empty password")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForOtherLoginWithInvalidEmailAndEmptyPassword() {
        post_login.validateHTTPResponseCode400WithOtherInvalidEmailAndEmptyPasswordForLogin();
    }

    @When("user send POST HTTP request for login with invalid email format")
    public void userSendPOSTHTTPRequestForLoginWithInvalidEmailFormat() {
        post_login.sendPOSTHTTPRequestForLoginWithInvalidEmailFormat();
    }

    @Then("user received valid HTTP response code 400 bad request for invalid email format")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithInvalidEmailFormat() {
        post_login.validateHTTPResponseCode400WithInvalidEmailFormatForLogin();
    }

    @When("user send POST HTTP request for login with valid email format")
    public void userSendPOSTHTTPRequestForLoginWithValidEmailFormat() {
        post_login.sendPOSTHTTPRequestForLoginWithValidEmailFormat();
    }

    @Then("user received valid HTTP response code 500 internal server error for valid email format and invalid password")
    public void userReceivedPOSTHTTPResponseCode500InternalServerErrorForLoginWithValidEmailFormatAndInvalidPassword() {
        post_login.validateHTTPResponseCode500WithValidEmailFormatForLogin();
    }

    @When("user send POST HTTP request for login with invalid email format and incorrrect password")
    public void userSendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndIncorrectPAssword() {
        post_login.sendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndIncorrectPassword();
    }

    @Then("user received valid HTTP response code 400 bad request for invalid email format and incorrect password")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithInvalidEmailFormatAndIncorrectPassword() {
        post_login.validateHTTPResponseCode400WithInvalidEmailFormatAndIncorrectPasswordForLogin();
    }

    @When("user send POST HTTP request for login with invalid email format and valid password")
    public void userSendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndValidPAssword() {
        post_login.sendPOSTHTTPRequestForLoginWithInvalidEmailFormatAndValidPassword();
    }

    @Then("user received valid HTTP response code 400 bad request for invalid email format and valid password")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLoginWithInvalidEmailFormatAndValidPassword() {
        post_login.validateHTTPResponseCode400WithInvalidEmailFormatAndValidPasswordForLogin();
    }

    @When("user send POST HTTP request for login with additional valid parameters")
    public void userSendPOSTHTTPRequestForLoginWithAdditionalValidParameter() {
        post_login.sendPOSTHTTPRequestForLoginWithAdditionalValidParameter();
    }

    @Then("user received POST HTTP response code 200 for login with additional valid parameters")
    public void userReceivedPOSTHTTPResponseCodeForLoginWithAdditionalValidParameters() {

        post_login.validateHTTPResponseCode200ForLoginWithAdditionalValidParameters();
    }
}
