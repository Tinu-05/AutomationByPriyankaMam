Feature: Test google application

Background:
Given Open Google Application

  Scenario: Test google title
    #Given Open Google Application
    When User get the actual title
    Then title should macthed with Google

  Scenario: Test google search feature
    #Given Open Google Application
    When User search with valid keyword "cucumber"
    Then User should get valid search result
