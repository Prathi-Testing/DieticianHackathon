Feature: Testing Register page functions 

Background:
    Given User is on Dietician Website 
    When User lands on Register page 
    
Scenario Outline: Title of the Register page
	
	Then validate Title of the Page "<sheetName>" and <rowNumber>
	
	Examples:
	|  sheetName |  rowNumber |
	|   register |    0 	  |
  	
Scenario: Validating mandatory fields are marked with star

	Then  User should see star on the all mandatory fields 
				
