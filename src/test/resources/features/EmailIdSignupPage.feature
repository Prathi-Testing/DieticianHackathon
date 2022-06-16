@Register
Feature: Signup using email id  Function
Background: 
  Given User is on Dietician Website
  When User lands on Register page
  
Scenario Outline: Validate SignUp heading 

	Then User should see a form with heading in "<sheetNumber>" and <rowNumber> to sign up using Email Id
 
 Examples: 
		|sheetName    | rowNumber|
		|Email signup |    0     |
 
Scenario: Validating Signup button
	
	Then User should see signup button under signup using Email Id

Scenario Outline: Invalid credentials in First Name

	When User enters invalid credentials in First name and Valid credentails for other fields with "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName     | rowNumber|
		|Email signup  |    0     |
	
	
Scenario Outline: Invalid credentials in Last Name

	When User enters invalid credentials in Last name and Valid credentails for other fields with details "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName     | rowNumber|
		|Email signup  |    0     |
		
Scenario Outline: Invalid credentials in Email

	When User enters invalid credentials in Email and Valid credentails for other fields with details "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName    | rowNumber|
		|Email signup |    1     |
	
Scenario Outline: Invalid credentials in Password

	When User enters invalid credentials in Password and Valid credentails for other fields with details "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName      | rowNumber|
		|Email signup   |    2     |  
		|Email signup   |    3     |
		|Email signup   |    4     |
		
Scenario Outline: Invalid credentials in UserName

	When User enters invalid credentials in UserName and Valid credentails for other fields with details "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName    | rowNumber|
		|Email signup   |   5    |
		
Scenario Outline: Invalid credentials in Confirm password field

	When User enters invalid credentials in Confirm password field and Valid credentails for other fields with details "<sheetName>" and <rowNumber>
	Then User should receive error message "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName     | rowNumber|
		|Email signup   |    6   |		
		
Scenario Outline: Empty data in field

	When User submit form without entering field data "<sheetName>" and <rowNumber>
	Then User should receive error message for empty field  "<sheetName>" and <rowNumber>
	
	Examples: 
		|sheetName      | rowNumber|
		|Email signup   |    7    |	
	Scenario Outline: Valid SignUp with credentials 

	When User enters  Valid credentails in fields from "<sheetName>" and <rowNumber>
	Then User redirected to login Page "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName      | rowNumber|
		|Email signup   |    8     |  					
		