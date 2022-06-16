@ContactUs
Feature: User fill data in Contact Us form 
Background: 
	Given User is on Dietician Website 
	When User clicks on Contact Link on Home Page 
	
	
	
Scenario Outline: Validating first Name fields in the form 

	When User Submit the form with invalid credentials in first Name and valid credentials in other fields from "<sheetNumber>" and <rowNumber> 
	Then User should receive error message "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName  |rowNumber |
		|HomePage   |  0       |
		
Scenario Outline: Validating Last Name fields in the form 

	When User Submit the form with invalid credentials in Last Name and valid credentials in other fields from "<sheetNumber>" and <rowNumber> 
	Then User should receive error message "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName  |rowNumber |
		|HomePage   |  1       |
		
Scenario Outline: Validating Emaid Id fields in the form 

	When User Submit the form with invalid credentials in email id and valid credentials in other fields from "<sheetNumber>" and <rowNumber> 
	Then User should receive error message "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName  |rowNumber |
		|HomePage   |  2       |	
		

		
Scenario Outline: Validating all fields with empty data in the form 

	When User Submit the form without filling the data "<sheetNumber>" and <rowNumber> 
	Then User should receive error message as per "<sheetNumber>" and <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  4       |
		
Scenario Outline: Validating subject field in the form 

	When User enter message in subject column  as per "<sheetNumber>" and <rowNumber> 
	Then validate the length of the message "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  0       |
		|HomePage  |  4       |
		
Scenario Outline: validating message field in the form 

	When User enter the message in Write your message column from "<sheetName>" and <rowNumber> 
	Then validate the length of the message "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  0       |
		|HomePage  |  4       |
		
Scenario Outline: Validating all fields with valid data in the form 

	When User Submit the form with valid data from "<sheetNumber>" and <rowNumber> 
	Then User should receive success "<sheetNumber>" and <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  3       |
		
	