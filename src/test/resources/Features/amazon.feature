@All
Feature: Test Amazon application

  Background: 
    Given Open amazon application

  @Homepage
  Scenario: Test title of Homepage
    When User get the title of homepage
    Then Home page title should be matched

  #@BestSeller
  @ignore
  Scenario: Test title of BesteSellers page
    When User open bestsessler page
    And get the title of beste sessler
    Then Best sesslers page title should match

 # @Mobile
 @ignore
  Scenario: Test title of mobiles page
    When User open mobile page
    And get the title of mobile
    Then mobile page title should match

  @Fashion
  Scenario: Test title of FashionPage
    When User open fashion page
    And get the title of fashion
    Then fashion page title should match
