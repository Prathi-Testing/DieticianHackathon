@MenuScreen
Feature: List of Screens menu visibility
Background: 
Given User is on Dietician Website
When User is in home Page

Scenario: List screen visibility

Then User should see screen link

Scenario: Validating the functionality of list of screens link

When User selects menu screen
Then User should see a menu with list of clickable links is displayed

Scenario Outline: Validating screen name
When User selects menu screen
Then User should see the link text from excel "<sheetName>"  and <rowNumber>
 
 Examples: 
       | sheetName  | rowNumber |
       | screen Page|    0      |
       



