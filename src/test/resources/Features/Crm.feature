Feature: Test CRM application

  Background: 
    Given Open CRM application

  Scenario: Test SingIn link
    When User click on SignIn link
    Then User should navigate to SignIn page

  Scenario: Test Login functionality
    Given User should be navigated to SignIn page
    When User enter emailid and password
    And click on Submit button
    Then User should navigate to Customer page
