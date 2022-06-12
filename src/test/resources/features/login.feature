Feature: login validations

  Scenario: Validating the heading on  "Log in with  your email" form
    Given User is on Dietician Website
    When User lands on Sign In page
    Then User should see a form with heading "Log in with  your email" form", to sign In using email

  Scenario: Validating Login button on "Log in with  your email" form
    Given User is on Dietician Website
    When User lands on Sign In page
    Then User should see a button with text "Log in" in the Sign In form

  Scenario: Validating Sign In with Email and password empty
    Given User is on Sign in Page
    When User clicks Log In button with all fields empty
    Then User gets  error message " Please fill out fields in textbox"

  Scenario: Validating Sign In with invalid email and valid password
    Given User is on Sign in Page
    When User clicks Log In button with invalid email and valid password
    Then Users gets error message

  Scenario: Validating Sign In with valid email and empty password field
    Given User is on Sign in Page
    When User clicks Log In button with valid email and empty password
    Then Users gets error message

  Scenario: Validating Sign In with both invalid email and password
    Given User is on Sign in Page
    When User clicks Log In with both invalid email and password
    Then Users gets error message

  Scenario: Validating Sign In with both valid email and password
    Given User is on Sign in Page
    When User clicks Log In with both valid email and password
    Then User gets a message"logged in successfully"and sees signout button

  Scenario: Validating Sign In with Forgot your password
    Given User is on Sign in Page
    When User clicks on Forgot Password button
    Then User is redirected to reset password link

  Scenario: Validating Sign In with Google button
    Given User is on Sign in Page
    When User clicks"Google" button to log in
    Then User is redirected to Google  login Page

  Scenario: Validating Sign In with Signup button
    Given User is on Sign in Page
    When User clicks "Signup" link
    Then User is redirected to register Page
