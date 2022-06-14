Feature: List of screen in public screen 
Background: 
	Given User is on Dietician Website 
	When User selects menu screen 
	
Scenario Outline: Public screen validation 

	Then User should see the link text from excel "<sheetName>"  and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    0      |
		
Scenario Outline: sign in link function 

	When User select Signin link under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    6      |
		
Scenario Outline: Register Function 

	When User select Register link under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    7      | 
		
Scenario Outline: Team link function 

	When User select Team link under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    8      |    
		
Scenario Outline: Testimonials link function 

	When User select Testimonials link under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    9      |
		
Scenario Outline: Forgot Password link function 

	When User select Forgot password  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    10      |
		
Scenario Outline: Product features link function 

	When User select Product features  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    11      |
		
Scenario Outline: Contact link function 

	When User select Contact  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    12      |		
		
Scenario Outline: Featured Content link function 

	When User select Featured content  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    13      |	
		
Scenario Outline: Blog link function 

	When User select  blog  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    14      |	 
		
Scenario Outline: Home link function 

	When User select  Home  under public 
	Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber  |
		| screen Page|    15      |	  	
		
      