Feature: Testing Home page functions 

Background:
    Given User lands Dietician Website 
    When User is on Home page 
    
Scenario Outline: Validating the title of the Home page 

	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  0      |
	
		
Scenario: Validating the Logo of the Home page 

	Then  User should see a logo with the company name on the Home Page 
				
Scenario: Validating Product Link on Home Page 

	When User clicks on PRODUCT Link on  Home Page
	Then User is re-directed to Product Page
 
Scenario: Validating Client Link on Home Page 

	When User clicks on client Link on  Home Page
	Then User is re-directed to client Page

Scenario: Validating Team Link on Home Page 

	When User clicks on Team Link on  Home Page
	Then User is re-directed to Team Page
	
Scenario: Validating Register Link on Home Page 
  
	When User clicks on Register Link on  Home Page
	Then User is re-directed to Register Page
	
Scenario: Validating About Link on Home Page 
 
	When User clicks on About Link on  Home Page
	Then User is re-directed to About Page

Scenario: Validating About Link on Home Page 

	When User clicks on Feature Link on  Home Page
	Then User is re-directed to Feature Page

Scenario: Validating Blog Link on Home Page 
 
	When User clicks on Blog Link on  Home Page
	Then User is re-directed to Blog Page

Scenario: Validating Contact us Link on Home Page 

	When User clicks on Contact Link on Home Page
	Then User is on Contact Page
	
	
	
	
	
	
	
	
	
		
	
 	
	
	
