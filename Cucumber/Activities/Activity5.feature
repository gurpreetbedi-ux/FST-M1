@activity5
Feature: Data driven test with examples 

@loginTest
Scenario Outline: Testing with incorrect data from inputs 
    Given the user is on the login page
    When the user enters "<usernames>" and "<passwords>"
    And clicks the submit button
    Then verify error message as "Invalid credentials"
    
Examples:
|usernames|passwords|
|wrongAdmin|password|
|admin|wrongPassword|
|!@#!@#|AEPA(U#$!|
|	|	|    