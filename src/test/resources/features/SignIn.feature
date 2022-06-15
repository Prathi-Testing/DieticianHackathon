Feature: Sign In Page validations

  Background: 
    Given User is on Dietician Website
    When User clicks on icon symbol

  Scenario: Validating the title of Sign In Page
    Then User should see the title of the page as Sign In

  Scenario: Validating the Sign In page mandatory fields
    Then User should see star on all mandatory fields

  Scenario: Validating the Sign In form heading
    Then User should see a form with heading "Sign In form", to sign In using Username

  Scenario: Validating Sign In button
    Then User should see a button with text SIGN IN in the Sign In form

  Scenario Outline: Validating Sign In Process with all fields empty
    When User clicks Sign In Button in the Sign In form with all fields empty .
    Then User should get error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         0 |

  Scenario Outline: Validating Sign InProcess with invalid SignInUsername
    When User clicks Sign In button entering numeric value for Username "<sheetName>" <rowNumber>
    Then User should get error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         1 |

  Scenario Outline: Validating Sign InProcess with invalid SignInPassword
    When User clicks Sign In button entering extra length values for password "<sheetName>" <rowNumber>
    Then User should get error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         2 |

  Scenario Outline: Validating Sign InProcess with invalid username and Password
    When User clicks Sign In button entering invalid values for Username and password "<sheetName>" <rowNumber>
    Then User should get error message "<sheetName>" <rowNumber>

    Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         3 |

  Scenario: Validating Sign In with Forgot password button
    When User clicks on Forgot Password button
    Then User should be directed to  Reset password link

  Scenario: Validating Sign In with Not member Yet button
    When User clicks on not member yet button
    Then User will land on Register Page

  Scenario: Validating Sign In with all fields valid entry
    When User clicks Sign In with all valid fields "<sheetName>" <rowNumber>
    Then User logged in successfully
     Examples: 
      | sheetName  | rowNumber |
      | SignInPage |         4 |
    
