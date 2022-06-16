@ScreenAfterSignin
Feature: List of Dietician screen 
Background: 
	Given User is on Dietician Website 
	When  User clicks Sign In with all field entered


Scenario Outline: Validating View Recent Diets functionality 

	When User selects view recent diets after sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    0      |	
		
Scenario Outline: Validating View recent test reports functionality 

	When User selects view recent test reports after sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber>  
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    1      |	
		
Scenario Outline: Validating Add patient functionality 

	When User selects Add patient after sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    2      |	
Scenario Outline: Validating Dietician Home functionality 

	When User selects Dietician Home before sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    3      |	
		
Scenario Outline: Validating My patients functionality 

	When User selects My patients after sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber>  
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    4      |	
		
Scenario Outline: Validating confirm conditions and create plan functionality 

	When User selects confirm conditions and create plan after sigin in 
	Then User should redirected to particular page "<sheetName>" and <rowNumber>  
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    5      |	
		