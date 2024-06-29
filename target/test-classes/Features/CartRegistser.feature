Feature: Test Opencart application

  Scenario: Test Registeration process for new user
    Given Open Register page
    When User enters all details
      | fname  | lname  | email             | telephone | password | cpassword |
      | KiranM | Sharma | kiran12@gmail.com | 987765854 | test123  | test123   |
    And User click on newsletter yes
    And User check the privacyPolicy
    And Click on Continue button
    Then User should resgister successfully

  Scenario: Test login for register user
    Given Open CartLogin page
    When User enter "kiran12@gmail.com" and password "test123"
    And User click on Cart Login button
    Then User should able to login into Cartapplication
