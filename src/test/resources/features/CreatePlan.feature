Feature: Create Plan page functions 
Background: 
	Given User is on Dietician Website 
	When User lands on Create Plan page 
	
Scenario Outline: Validating the heading 

	Then User sees the heading of the page as in excel "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName       |RowNumber|
		|Create Plan Page|  0      | 
		
		
Scenario: Validating the Browse button visibility 

	Then User should see a button with name Browse on the page 
	
	
Scenario Outline: Validating the Browse button tool tip option 

	Then User should see a tool tip message as in excel "<SheetName>" and <RowNumber> for the Browse button 
	
	Examples: 
		|SheetName     |RowNumber|
		|CreatePlanPage|  0      | 
		
		
Scenario Outline: Validating the Browse button operation 

	When User clicks the Browse button and selects a document as "<SheetName>" and <RowNumber> 
	Then User should see the selected document in the field next to the Browse button on the page as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName     |RowNumber|
		|CreatePlanPage|  0      | 
		
		
Scenario: Validating the Upload button 

	Then User should see a button with name Upload on the page 
	
	
Scenario Outline: Validating the Upload button with no file selected 

	When User clicks the Upload button without selecting a document 
	Then User should see an error message as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName      |RowNumber  |
		|CreatePlanPage |    0	     | 
		
		
Scenario Outline: Validating the Upload functionality with incorrect file format 

	When User clicks the Upload button by selecting a non-PDF file 
	Then User should see an error message as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName      |RowNumber |
		|CreatePlanPage |    0     | 
		
		
		
Scenario Outline: Validating the Upload functionality with incorrect file size 

	When User clicks the Upload button by selecting a PDF file of size greater than 2MB as "<SheetName>" and <RowNumber> 
	Then User should see an error message as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName      |RowNumber |
		|CreatePlanPage |     1    | 
		
		
Scenario Outline: Validating the Upload functionality with incorrect file format and size 


	When User clicks the Upload button by selecting a non-pdf file of size greater than 2MB as "<SheetName>" and <RowNumber> 
	Then User should see an error message as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName     |RowNumber|
		|CreatePlanPage|   2     |
		
		
Scenario Outline: Validating the Upload functionality with correct file format and size 


	When User clicks the Upload button by selecting a pdf file of size less than 2MB as "<SheetName>" and <RowNumber> 
	Then User should see a message as "<SheetName>" and <RowNumber> 
	
	Examples: 
		|SheetName     |RowNumber|
		|CreatePlanPage|    1    |
		
		
Scenario: Validating option 1 menu visibility 


	Then User should see option 1 menu to update the health conditions 
	
	
Scenario: Validating visibility of Confirm button on option 1 menu 

	Then User should see a button with text CONFIRM in option 1 menu 
	
Scenario: Validating that the option 1 menu cannot be modified after confirming 

	When User clicks the CONFIRM button in option one menu 
	Then User cannot update the health conditions in option 1 menu 
	
	
Scenario: Validating option 2 menu visibility 

	Then User should see option 2 menu to update the health conditions 
	
	
Scenario: Validating visibility of Confirm button on option 2 menu 

	Then User should see a button with text CONFIRM in option 2 menu 
	
	
Scenario: Validating that the option 2 menu cannot be modified after confirming 

	When User clicks the CONFIRM button in option two 
	Then User cannot update the health conditions in option 2 menu 
	
	
Scenario: Validating the Generate Menu button visibility 

	Then User should see a button with text GENERATE MENU  at the bottom of the page 
	
Scenario: Validating the Generate Menu button operation 

	When User clicks the GENERATE MENU button 
	Then New Diet plan should be generated with the latest confirmed Health conditions 
	
	
Scenario: Validating the Generate Menu button operation 

	When User clicks the GENERATE MENU button 
	Then User should land on View Recent Diets page 
	
