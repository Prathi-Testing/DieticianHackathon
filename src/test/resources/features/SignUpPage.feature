Feature: Signup Page Function 
Background: 
	Given User is on Dietician Website 
	When User lands on Register page 
	
Scenario Outline: Validate SignUp heading 

	Then User should see a heading with details in "<sheetNumber>" and <rowNumber> to sign up using mobile number 
	
	Examples: 
		|sheetName    | rowNumber|
		|signupPage   |    0     |
		
Scenario: Validating Signup button 

	Then User should see signup button under signup using mobile number 
	
Scenario Outline: Invalid credentials in First Name 

	When User enters invalid credentials in First name and Valid credentails for other fields from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    0     |
		
		
Scenario Outline: Invalid credentials in Last Name 

	When User enters invalid credentials in Last name and Valid credentails for other fields from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    1     |
		
		
Scenario Outline: Invalid credentials in Any Other Field 

	When User enters invalid credentials in Any Other Field and Valid credentails for Names,Email,Password from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    2     |
		
Scenario Outline: Invalid credentials in Email 

	When User enters invalid credentials in Email and Valid credentails for other fields from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    3     |
		
Scenario Outline: Invalid credentials in Mobile Number 

	When User enters invalid credentials in Mobile Number and Valid credentails for other fields from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    4     |
		
Scenario Outline: Invalid credentials in Password 

	When User enters invalid credentials in Password and Valid credentails for other fields from "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    5     |  
		|signuppage  |    6     |
		|signuppage  |    7     |
		
		
Scenario Outline: Empty data in field 

	When User submit form without entering data "<sheetName>" and <rowNumber> 
	Then User should receive error message "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    12    |
		
Scenario Outline: Valid SignUp with credentials 

	When User enters  Valid credentails in all fields from "<sheetName>" and <rowNumber> 
	Then User redirected to login Page "<sheetName>" and <rowNumber> 
	
	Examples: 
		|sheetName   | rowNumber|
		|signupPage  |    8     |  
		
		
		