Feature: Sign In Page validations

Background: 
    Given User lands Dietician Website 
    When User click on icon symbol on Sign In Page
    
Scenario: Validating the title of Sign In Page
    Then User should see the title of the page as "Sign In"
		
Scenario : Validating the Sign In page mandatory fields
   Then User should see all mandatory flields with star symbol on top of those fields
	
 
Scenario: Validating the Sign In form heading
    Then User should see a form with heading "Sign In form", to sign In using Username
	
Scenario: Validating Sign In button
    Then  User should see a button with text "SIGN IN" in the Sign In form
   
Scenario: Validating Sign In Process with all fields empty
		Given User is on Sign In Page
		When User clicks Sign In Button in the Sign In form with all fields empty .
		Then User should get error message"Please fill out the mandatory fields"
		
Scenario: Validating Sign InProcess with invalid FirstName
   Given User is on Sign In Page
   When User clicks Sign In button entering numeric values for Username and valid values for password
   Then User should get a message Invalid entry for username field
	
Scenario: Validating Sign InProcess with invalid Password
   Given User is on Sign In Page
   When User clicks Sign In button entering extra length of password
   Then User should get a message Invalid entry for password field
   
Scenario: Validating Sign InProcess with invalid Password
   Given User is on Sign In Page
   When User clicks Sign In button entering extra length of password
   Then User should get a message Invalid entry for password field
   
Scenario: Validating Sign InProcess with invalid username and Password
   Given User is on Sign In Page
   When User clicks Sign In button entering invalid values for both fields
   Then User should get a message Invalid login credential

Scenario: Validating Sign In with "Forgot password "button
   Given User is on Sign In Page
   When User clicks on Forgot Password button
   Then User should be directed to  "Reset password"link
   
Scenario: Validating Sign In with all fields valid entry
   Given User is on Sign In Page
   When  User clicks Sign In with all field entered
   Then User logged in successfully
   
 
   



   
		
