Feature: Visibility of Text in Menu bar Home page 
Background: 
	Given User lands Dietician Website Home page 
Scenario Outline: Validating tab text in Menu bar 

	When User check first tab 
	Then User should see a tab with producttext in sheetname "<sheetName>" and RowNumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  0       |
		
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check second tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |
		|HomePage  |  1       |		
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check thrid tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  2       |
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check fourth tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  3       |
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check fifth tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  4       |
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check sixth tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  5       |
		
Scenario Outline: Validating tab text in Menu bar 

	When  User check seven tab 
	Then  User should see a tab with text in sheetname "<sheetName>" and rownumber <rowNumber> 
	
	Examples: 
		|sheetName |rowNumber |		
		|HomePage  |  6       |
		
Scenario: Visibility search icon in Menu bar 

	Then  User should see search icon 
	
Scenario: Visibility signin option in Menu bar 

	Then  User should see sigin option 
	
	
	
   