@TeamPagePagination
Feature: Validating Pagination in Team Page
Background: 
	Given User is on Dietician Website 
	When User Clicks on the Team Page 

Scenario Outline: Checking Number of Doctors Name in First Page

	Then User Should see only limited number of Doctors list in "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  0       |
		
		
Scenario: Check previous page pagination link in first page 

	Then  User should see a disabled pagination link for the Pervious page
			
Scenario: Check Next page pagination link in first page 

	Then  User should see a enabled pagination link for the Next page
		
Scenario: Check Next page pagination link function 

    When User clicks pagination link for the Next page
	Then  User should redirected to the next page and see Enabled pagination link for the pervious page
		
Scenario: Check Next page pagination link in last page 

	Then  User should see a disabled pagination link for the Next page
	
Scenario: Check Previous page pagination link in last page

    Then  User should see a enabled pagination link for the Previous page