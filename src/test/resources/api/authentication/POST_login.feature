Feature: POST - login
  As a user
  I want to login
  So that i can see token data

  @LG01
  Scenario: POST - as a user i want to login with valid endpoint
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login
    Then user received POST HTTP response code 200 for login

  @LG02
  Scenario: POST - as a user i want to login with invalid endpoint
    Given user set POST endpoint with invalid endpoint for login
    When user send POST HTTP request with invalid endpoint for login
    Then user received POST HTTP responses code 404 for login

  @LG03
  Scenario: POST - as a user i want to login with input valid email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login
    Then user received POST HTTP response code 200 for login

  @LG04
  Scenario: POST - as a user i want to login with empty email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with empty email and password
    Then user received POST HTTP response code 400 bad request for login

  @LG05
  Scenario: POST - as a user i want to login with input invalid email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with input invalid email and password
    Then user received valid HTTP response code 500 internal server error for login

  @LG06
  Scenario: POST - as a user i want login with valid email and invalid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with input valid email and invalid password
    Then user received valid HTTP response code 500 internal server error for invalid password

  @LG07
  Scenario: POST - as a user i want login with invalid email and valid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with input invalid email and valid password
    Then user received valid HTTP response code 500 internal server error for invalid email

  @LG08
  Scenario: POST - as a user i want login with empty email and valid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with empty email and valid password
    Then user received POST HTTP response code 400 bad request for empty email

  @LG09
  Scenario: POST - as a user i want login with valid email and empty password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with valid email and empty password
    Then user received valid HTTP response code 500 internal server error for empty password

  @LG10
  Scenario: POST - as a user i want login with invalid email and empty password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with invalid email and empty password
    Then user received valid HTTP response code 400 bad request for invalid email empty password

  @LG11
  Scenario: POST - as a user i want login with empty email and invalid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with empty email and invalid password
    Then user received valid HTTP response code 400 bad request for empty email invalid password

  @LG12
  Scenario: POST - as a user i want login with other invalid email and empty password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with other invalid email and empty password
    Then user received valid HTTP response code 400 bad request for other invalid email empty password

  @LG13
  Scenario: POST - as a user i want login with invalid email format and valid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with invalid email format
    Then user received valid HTTP response code 400 bad request for invalid email format

  @LG14
  Scenario: POST - as a user i want login with valid email format and invalid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with valid email format
    Then user received valid HTTP response code 500 internal server error for valid email format and invalid password

  @LG15
  Scenario: POST - as a user i want login with invalid email format and incorrect password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with invalid email format and incorrrect password
    Then user received valid HTTP response code 400 bad request for invalid email format and incorrect password

  @LG16
  Scenario: POST - as a user i want login with other invalid email format and valid password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with invalid email format and valid password
    Then user received valid HTTP response code 400 bad request for invalid email format and valid password

  @LG17
  Scenario: POST - as a user i want login with valid email, valid password, and additional valid parameters
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with additional valid parameters
    Then user received POST HTTP response code 200 for login with additional valid parameters