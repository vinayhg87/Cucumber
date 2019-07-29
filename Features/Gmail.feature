
@tag
Feature: Login to Gmail application

  @tag1
  Scenario: Login to Gmail application and verification of incorrect username and password 
    Given Open the Firefox and launch Gamil URL
    When I login with following credentials
    | vinayhg@gmail.com | pass1234 |  
    Then Close the browser