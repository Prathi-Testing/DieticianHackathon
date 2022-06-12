@DieticianLogin
Feature: Dietician Home Page

  Scenario: Verify Dietician Home Page After Login
    When User is on the Dietician Home page
    Then User can see the Home button on header menu

  Scenario: Verify New Patient Page After Login
    When User is on the Dietician Home page
    Then User can see the "New Patient" tab from the header menu

  Scenario: Verify My Patient Page After Login
    When User is on the Dietician Home page
    Then User can see the "My Patient" tab from the header menu

  Scenario: Verify Diet Plans Page After Login
    When User is on the Dietician Home page
    Then User can see the "Diet Plans" tab from the header menu

  Scenario: Clicking New Patient Page After Login
    Given User is on the Dietician Home page
    When User selects New patient button
    Then User lands on New Patient page

  Scenario: Clicking My Patient Page After Login
    Given User is on the Dietician Home page
    When User selects My Patient button
    Then User lands on My Patient page

  Scenario: Clicking Diet Plans Page After Login
    Given User is on the Dietician Home page
    When User selects Diet Plans button
    Then User lands on Diet Plans page

  Scenario: Verify Dietician Home Page Side Bar After Login
    When User is on the Dietician Home page
    Then User can see Banner or Announcements section in right side bar

  Scenario: Dietician Home Page "Logged in as Dietician name" message verification After Login
    When User is on the Dietician Home page
    Then User can see Logged in as Dietician name message in top of right side bar

  Scenario: Verify Dietician Home Page Content After Login
    When User is on the Dietician Home page
    Then User can read Dietician Home page image and content

  Scenario: Verify Dietician Home Page SIGN OUT After Login
    Given User is on the Dietician Home page
    When User can see SIGN OUT button after successful login
    Then User can click on SIGN OUT button for logging off successfully
