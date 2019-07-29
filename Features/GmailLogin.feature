
@tag
Feature: Login to Gmail application

  @tag1
  Scenario: Login to Gmail application and verification of incorrect username and password 
    Given Open the Firefox and launch Gamil URL
    When I login with following credentials
    | vinayhg@gmail.com | pass1234 |  
    Then Close the browser
    
    
	@tag2  
	Scenario: Login to Gmail application and verification of incorrect username and password 
    Given Open the Firefox and launch Gamil URL
    When I login with following credentials
    | vinayhg@gmail.com | pass12342 | 
    Then Close the browser


  @tag3  
  Scenario: Login to Gmail application and verification of incorrect username and password 
   Given Open the Firefox and launch Gamil URL
   When I login with following credentials
    | vinayhg@gmail.com | pass123423 | 
   Then Close the browser