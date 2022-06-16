Feature: Dietician Home Page
Background:
		Given User is on Dietician Website
		When User clicks Sign In with all field entered
		
  Scenario: Verify Dietician Home Page After Login
      Then User can see the Home button on header menu
    
  Scenario: Verify New Patient Page After Login
    Then User can see the "New Patient" tab from the header menu
    
  Scenario: Verify My Patient Page After Login
    Then User can see the "My Patient" tab from the header menu
    
  Scenario: Verify Diet Plans Page After Login
    Then User can see the "Diet Plans" tab from the header menu
    
  Scenario Outline: Clicking New Patient Page After Login
    When User selects New patient button
    Then User lands on New Patient page as "<SheetName>" and <RowNumber>
		Examples:
      | SheetName           | RowNumber |
      | Page_Title					|         0 |
      
  Scenario Outline: Clicking My Patient Page After Login
    When User selects My Patient button
    Then User lands on My Patient page as "<SheetName>" and <RowNumber>
    Examples:
      | SheetName           | RowNumber |
      | Page_Title					|         2 |
      
  Scenario Outline: Clicking Diet Plans Page After Login
    When User selects Diet Plans button
    Then User lands on Diet Plans page as "<SheetName>" and <RowNumber>
    Examples:
      | SheetName           | RowNumber |
      | Page_Title					|         3 |
      
  Scenario: Verify Dietician Home Page Side Bar After Login
    Then User can see Banner or Announcements section in right side bar
    
  Scenario: Dietician Home Page "Logged in as Dietician name" message verification After Login
    Then User can see Logged in as Dietician name message in top of right side bar
    
  Scenario: Verify Dietician Home Page Content After Login
    Then User can read Dietician Home page image and content
    
  Scenario Outline: Verify Dietician Home Page SIGN OUT After Login
    When User can see SIGN OUT button after successful login
    Then User can click on SIGN OUT button and log off successfully as "<SheetName>" and <RowNumber>
    Examples:
      | SheetName           | RowNumber |
      | Page_Title			    |         4 |
    
    

