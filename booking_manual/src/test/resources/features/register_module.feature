Feature: Module to User Register
  I as a User
  I need to register my user on the platform

  @manual
  Scenario: Register correctly
    Given The user enters the page and selects the registration module
    When He fills out the form with the data correctly and clicks to register
    Then He should see that the user was successfully registered

  @manual
  Scenario: Register unsuccessfully
    Given The user enters the page and selects the registration module
    When He fills out the form with the data incorrectly and clicks to register
    Then He should see that the user was not registered
    And He should see that he gets a message indicating that the password does not meet the requirements