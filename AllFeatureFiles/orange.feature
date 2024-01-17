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

  Scenario: Validate Pim page
    When user click on pim link
    And user validate pim page by using url
    And user click on add employee and enter "Anita" and "Walke" and click on save button
    And user capture employee id
    And user click on employee list
    And user search employee using employee id and click on search button
		And user  select searched employee and click on checkbox
		And user click on delete
