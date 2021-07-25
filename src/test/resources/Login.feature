@F1
Feature: Validating login field of facebook application

  Background: 
    Given user is Fb page
    When user enter username and password
    And User click login button

  @reg
  Scenario: validating login of facebook
   
    Then user need to validate

  @smoke
  Scenario: validating login of facebook
    
    Then user need to validate

  @sanity
  Scenario: validating login of facebook
    Given user is on facebook application
    When user enter user name and password
      | username  | password   |
      | raj123    | abcdef     |
      | abcdf@366 | 123@abcdef |
    And user should click login button
    Then user need to validate

  @Retest
  Scenario: validating login of facebook
    Given user is on facebook application
    When user enter user name and password
      | username  | password   |
      | raj123    | abcdef     |
      | abcdf@366 | 123@abcdef |
    And user should click login button
    Then user need to validate
