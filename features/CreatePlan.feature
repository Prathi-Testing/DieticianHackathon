@DieticianLogin
Feature: "Create Plan" page functions


Scenario: Validating the heading
	When User lands on "Create Plan" page
	Then User sees the heading "Confirm Health Conditions and Generate a new Diet Plan" on the page 


Scenario: Validating the Browse button visibility
	When User lands on "Create Plan" page
	Then User should see a button with name "Browse"on the page


Scenario: Validating the Browse button tool tip option
	When User lands on "Create Plan" page
	Then User should see a tool tip "PDF files only" for the Browse button


Scenario: Validating the Browse button operation
	Given User is on "Create Plan" page
	When User clicks the Browse button and selects a document
	Then User should see the selected document in the field next to the Browse button on the page


Scenario: Validating the Upload button
	When User lands on "Create Plan" page
	Then User should see a button with name"Upload" on the page


Scenario Outline: Validating the Upload button with no file selected

	Given User is on "Create Plan" page
	When User clicks the Upload button without selecting a document
	Then User should see an error message as "<SheetName>" and <RowNumber> 
	
	Examples:
	         |SheetName      |RowNumber |
	         |CreatePlanPage |    0     | 


Scenario Outline: Validating the Upload functionality with incorrect file format

	Given User is on "Create Plan" page
	When User clicks the Upload button by selecting a non-PDF file 
	Then User should see an error message as "<SheetName>" and <RowNumber>
	
	Examples:
	         |SheetName      |RowNumber |
	         |CreatePlanPage |    1     | 
	


Scenario Outline: Validating the Upload functionality with incorrect file size
	Given User is on "Create Plan" page
	When User clicks the Upload button by selecting a PDF file of size greater than 2MB
	Then User should see an error message as "<SheetName>" and <RowNumber>
	
	Examples: 
		      |SheetName      |RowNumber |
		      |CreatePlanPage |     2    | 


Scenario Outline: Validating the Upload functionality with incorrect file format and size

	Given User is on "Create Plan" page
	When User clicks the Upload button by selecting a non-pdf file of size greater than 2MB
	Then User should see an error message as "<SheetName>" and <RowNumber>
	
	Examples:
					|SheetName     |RowNumber|
					|CreatePlanPage|   3     |


Scenario Outline: Validating the Upload functionality with correct file format and size

	Given User is on "Create Plan" page
	When User clicks the Upload button by selecting a pdf file of size less than 2MB
	Then User should see a message as "<SheetName>" and <RowNumber> 
	
	Examples:
					|SheetName     |RowNumber|
					|CreatePlanPage|   4     |
					

Scenario:Validating option 1 menu visibility
	When User lands on "Confirm conditions and Create Plan" page
	Then User should see option 1 menu to update the health conditions


Scenario: Validating visibility of Confirm button on option 1 menu 
	When User lands on "Confirm conditions and Create Plan" page
	Then User should see a button with text " CONFIRM" in option 1 menu


Scenario: Validating the option 1 menu interaction
	When User lands on "Confirm conditions and Create Plan" page
	Then User can update the health conditions in option 1 menu


Scenario:Validating that the option 1 menu cannot be modified after confirming
	Given User is on "Create Plan" page
	When User clicks the CONFIRM button in option 1 menu
	Then User cannot update the health conditions in option 1 menu 


Scenario: Validating option 2 menu visibility
	When User lands on "Confirm conditions and Create Plan" page
	Then User should see option 2 menu to update the health conditions


Scenario: Validating visibility of Confirm button on option 2 menu 
	When User lands on "Confirm conditions and Create Plan" page
	Then User should see a button with text " CONFIRM" in option 2 menu

Scenario: Validating the option 2 menu interaction
	When User lands on "Confirm conditions and Create Plan" page
	Then User can update the health conditions in option 2 menu

Scenario: Validating that the option 2 menu cannot be modified after confirming
	Given User is on "Create Plan" page
	When User clicks the CONFIRM button in option 2
	Then User cannot update the health conditions in option 2 menu 


Scenario:Validating the Generate Menu button visibility
	When User lands on "Confirm conditions and Create Plan" page
	Then User should see a button with text "GENERATE MENU"  at the bottom of the page

Scenario:Validating the Generate Menu button operation
	Given User is on "Create Plan" page
	When User clicks the GENERATE MENU button
	Then New Diet plan should be generated with the latest confirmed Health conditions 


Scenario:Validating the Generate Menu button operation
	Given User is on "Create Plan" page
	When User clicks the GENERATE MENU button
	Then User should land on "View Recent Diets" page

