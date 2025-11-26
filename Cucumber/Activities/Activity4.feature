@activity4
Feature: Data driven test without examples 

  Scenario: Testing with correct data from inputs 
    Given the user is on the login page
    When the user enters "admin" and "password"
    And clicks the submit button
    Then verify success message as "Welcome Back, Admin!"