Feature: Signup using accounts Function
Background: 
  Given User is on Dietician Website
  When User lands on Register page
  
 Scenario Outline: Validating the Sign up process with Facebook
 
  When User clicks Facebook Button in the Sign Up with your Email form
  Then User successfully logged into the account "<sheetName>" and <rowNumber>
  
  Examples: 
		|sheetName    | rowNumber|
		|Email signup |    1     |
  
  
  Scenario Outline: Validating the Sign up process with Google
 
  When User clicks Goolge Button in the Sign Up with your Email form
  Then User successfully logged into the account "<sheetName>" and <rowNumber>
  
  Examples: 
		|sheetName    | rowNumber|
		|Email signup |    1     |
  
  Scenario Outline: Validating the Login
 
  When User already have a account ,User clicks login in here button
  Then User redirected to login Page "<sheetName>" and <rowNumber>
  
  Examples: 
		|sheetName    | rowNumber|
		|Email signup |    2     |