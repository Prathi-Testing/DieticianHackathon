Feature: Validating Pagination in Team Page
Background: 
	Given User lands Dietician Website 
	When User Clicks on the Team Page 

Scenario Outline: Check the First Page Number of Doctors Name

	Then User Should see only limited number of Doctors list in "<sheetName>" and <RowNumber> 
	
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