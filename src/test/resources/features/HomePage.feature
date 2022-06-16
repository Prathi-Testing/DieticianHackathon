@DieticianSoftware
Feature: Testing Home page functions 

Background:
    Given User is on Dietician Website
    When User is on Home page 
    
Scenario Outline: Validating the title of the Home page 

	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  0      |
	
		
Scenario: Validating the Logo of the Home page 

	Then  User should see a logo with the company name on the Home Page 
				
Scenario Outline: Validating Product Link on Home Page 

	When User clicks on PRODUCT Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  1      |
 
Scenario Outline: Validating Client Link on Home Page 

	When User clicks on client Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  2      |
Scenario Outline: Validating Team Link on Home Page 

	When User clicks on Team Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  3      |
Scenario Outline: Validating Register Link on Home Page 
  
	When User clicks on Register Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  4      |
	
Scenario Outline: Validating About Link on Home Page 
 
	When User clicks on About Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  5      |

Scenario Outline: Validating Featured Link on Home Page 

	When User clicks on Featured Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  6      |

Scenario Outline: Validating Blog Link on Home Page 
 
	When User clicks on Blog Link on  Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  7      |

Scenario Outline: Validating Contact us Link on Home Page 

	When User clicks on Contact Link on Home Page
	Then User should see the title of the page as details in excel "<sheetName>" and RowNUmber <rowNumber>
	Examples: 
		|sheetName |rowNumber|
		|HomePage  |  8      |
	
	
	
	
	
	
	
	
	
		
	
 	
	
	
