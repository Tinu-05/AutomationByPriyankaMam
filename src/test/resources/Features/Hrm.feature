Feature: Test Orangehrm application

  Scenario Outline: 
    Given Open Hrm application
    When User enter "<username>" and "<password>"
    And click on Hrm login button
    Then As per validation valid user should be login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Poonam   | test123  |
      | Admin    | admin123 |
      | Suresh   | test123  |
