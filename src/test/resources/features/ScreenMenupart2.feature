Feature: List of Dietician screen 
Background: 
	Given User is on Dietician Website 
	When User selects menu screen 
	
Scenario Outline: Validating screen texts 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    0      |
		
Scenario Outline: Sigin text validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    1      |		
		
Scenario Outline: Register validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    2      |		
		
Scenario Outline: Team validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    3      |	
		
Scenario Outline: Testimonials validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    4      |	
		
		
Scenario Outline: Forgot Password validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    5      |	
		
Scenario Outline: Product Features validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    6      |	
		
Scenario Outline: Contact validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    7      |	
		
Scenario Outline: Blog validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    8      |	
		
		
Scenario Outline: Home validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    9      |	
		
Scenario Outline: Dietician validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber  |
		| screen Page2|    10      |	
		
Scenario Outline: View Recent Diets validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    11      |	
		
Scenario Outline: View Recent test reports validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    12      |	
		
Scenario Outline: Add Patient validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    1      |	
		
Scenario Outline: Dietician Home validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page2|    13      |	
		
Scenario Outline: My patient validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber  |
		| screen Page2|    14      |	
		
Scenario Outline: Confirm conditions and create plan validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber  |
		| screen Page2|    15      |	
		
Scenario Outline: Featured Content validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber  |
		| screen Page2|    16      |	
		
