Feature: Visibility of Text in Menu bar Home page 
Background: 
	Given User is on Dietician Website
	 
Scenario Outline: Validating first tab text in Menu bar 

	When User check first tab in Home Page
	Then User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  0       |
		
		
Scenario Outline: Validating second tab text in Menu bar 

	When  User check second tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  1       |		
		
Scenario Outline: Validating thrid tab text in Menu bar 

	When  User check thrid tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  2       |
		
Scenario Outline: Validating fourth tab text in Menu bar 

	When  User check fourth tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  3       |
		
Scenario Outline: Validating fifth tab text in Menu bar 

	When  User check fifth tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  4       |
		
Scenario Outline: Validating sixth tab text in Menu bar 

	When  User check sixth tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber>
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  5       |
		
Scenario Outline: Validating seven tab text in Menu bar 

	When  User check seven tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  6       |
		
Scenario Outline: Validating Eigth tab text in Menu bar 

	When  User check eigth tab in Home Page
	Then  User should see a tab with text as per the sheetname "<sheetName>" and rowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  6       |
		
Scenario: Visibility search icon in Menu bar 

	Then  User should see search icon 
	
Scenario: Visibility signin option in Menu bar 

	Then  User should see sigin option 
	
	
	
   