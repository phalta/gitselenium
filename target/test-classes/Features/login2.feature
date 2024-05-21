Feature: check login functanality

  Scenario Outline: login with valid credential
    Given  User is on login page
    When user enter username and password
    And click on submit button
    Then user navigte to login page
