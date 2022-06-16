Feature: login validations

  Background: 
    Given User is on Dietician Website
    When User lands on Sign In page

  Scenario: Validating the heading on  "Log in with  your email" form
    Then User should see a form with heading
    
  Scenario: Validating Login button on "Log in with  your email" form
    Then User should see a button with text "Log in"

  Scenario Outline: Validating login In with Email and password empty
    When User clicks Log In button with all fields empty
    Then User gets error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         5 |

  Scenario Outline: Validating Sign In with invalid email and valid password
    When User clicks Log In button with invalid email and valid password values "<sheetName>" <rowNumber>
    Then User gets error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         6 |

  Scenario Outline: Validating Sign In with valid email and empty password field
    When User clicks Log In button with valid email and empty password values "<sheetName>" <rowNumber>
    Then User gets error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         7 |

  Scenario Outline: Validating Sign In with both invalid email and password
    When User clicks Log In with both invalid email and password values "<sheetName>" <rowNumber>
    Then User gets error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         8|

  Scenario Outline: Validating Sign In with both valid email and password
    When User clicks Log In with both valid email and password values "<sheetName>" <rowNumber>
    Then User gets error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         9 |

  Scenario: Validating Sign In with Forgot your password
    When User clicks on Forgot Password button
    Then User is redirected to reset password link

  Scenario: Validating Sign In with Google button
    When User clicks Google button to log in
    Then User is redirected to Google  login Page

  Scenario: Validating Sign In with Facebook button
    When User clicks Facebook link
    Then User is redirected to Facebook  login Page

  Scenario Outline: Validating Sign In with Signup link
    When User select Signin link under public 
    Then User should redirected to particular page "<sheetName>" and <rowNumber> 
	
	Examples: 
		| sheetName  | rowNumber |
		| screen Page|    6      |
