Feature: Test the Sauce Demo application

  Scenario: validate the Login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Homepage Title and Url
    When user is on home page validate title
    And validate home page url

    
    Scenario: validate home page logo
    When user is on home page and validate home page logo