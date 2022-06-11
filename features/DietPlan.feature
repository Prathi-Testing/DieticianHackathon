@DieticianLogin
Feature: DIfferent features in Diet plan page


Scenario: Validating the heading of the Diet plans page
  When User lands on "View Recent Diets" page
  Then User should see the heading "Generated Diet Plans" on the page


Scenario: Validating the tabs on the menu bar of Diets page
  When User lands on "View Recent Diets" page
  Then User should see that Diet Plans tab on the menu bar is selected


Scenario: Validating the default number of records displayed per page
  When User is on "View Recent Diets" Page
  Then User should see 5 records per page


Scenario: Validation of traversing next page button
  Given User is on "View Recent Diets" Page
  When More than one page of records are displayed and User is on first page
  Then Next Page button (>) is enabled



Scenario: Validation of traversing next page
  Given User is on "View Recent Diets" Page and more than one page of records are displayed, User is on first page
  When User selects the next page button (>)
  Then User should see the second page


Scenario: Validation of traversing next page button
  Given User is on "View Recent Diets" Page
  When More than one page of records are displayed and User is on last page
  Then Next Page button (>) is disabled


Scenario: Validation of traversing next page when one page is displayed 
  Given User is on "View Recent Diets" Page
  When One page of records are displayed
  Then Next Page button (>) is disabled


Scenario: Validation of traversing previous page button
  Given User is on "View Recent Diets" Page
  When More than one page of records are displayed and User is on last page
  Then Previous Page button (<) is enabled


Scenario: Validation of traversing previous page
  Given User is on "View Recent Diets" Page and more than one page of records are displayed and User is on second page
  When User selects the previous page button (<)
  Then User should see the first page


Scenario: Validation of traversing previous page button
  Given  User is on "View Recent Diets" Page
  When More than one page of records are displayed and User is on first page
  Then Previous Page button (>) is disabled


Scenario: Validation of traversing previous page when one page is displayed
  Given User is on "View Recent Diets" Page
  When One page of records are displayed
  Then Previous Page button (>) is disabled


Scenario: Validation of "View PDF" option
  Given User is logged on to Dietician website
  When User is on "View Recent Diets" Page
  Then View PDF option is available for the generated diet plans


Scenario: Validation of generated PDF for a diet plan
  Given User is on "View Recent Diets" Page
  When User selects the View PDF button for a generated diet plan
  Then User should see Patient details, Doctor details, Patient health details, 7-day menu, warnings, Comments in the pdf information


Scenario: Validation of download PDF option for a diet plan
  Given User is on "View Recent Diets" Page
  When User selects the View PDF button for a generated diet plan
  Then User should be able to see download option for the PDF