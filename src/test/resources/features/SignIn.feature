Feature: Sign In Page Title

Background:
    Given User lands Dietician Website 
    When User click on icon symbol on Sign In Page
    
Scenario Outline: Validating the title of Sign In Page
		Then User should see the title of the page as "Sign In"
		
Scenario Outline: Validating the Sign In page mandatory fields
	Then User should see all mandatory flields with star symbol on top of those fields
 
Scenario Outline: Validating the Sign In form heading
	Then User should see a form with heading "Sign In form", to sign In using Username
	
Scenario Outline: Validating Sign In button
   Then  User should see a button with text "SIGN IN" in the Sign In form
   
Scenario Outline: Validating Sign In Process with all fields empty
