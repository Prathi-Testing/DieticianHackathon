Feature: List of Dietician screen 
Background: 
	Given User is on Dietician Website 
	When User selects menu screen 
	

Scenario Outline: Validating View Recent Diets functionality 

	When User selects view recent diets before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
		
Scenario Outline: Validating View recent test reports functionality 

	When User selects view recent test reports before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
		
Scenario Outline: Validating Add patient functionality 

	When User selects Add patient before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
Scenario Outline: Validating Dietician Home functionality 

	When User selects Dietician Home before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
		
Scenario Outline: Validating My patients functionality 

	When User selects My patients before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
		
Scenario Outline: Validating confirm conditions and create plan functionality 

	When User selects confirm conditions and create plan before sigin in 
	Then User should redirected to sigin page text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName   | rowNumber |
		| screen Page |    8      |	
		
		
		
