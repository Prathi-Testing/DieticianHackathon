Feature: Test report pdf file

Background:
	Given User is on Dietician Website 
	When User clicks Sign In with all field entered
	And User clicks on "My Patients" tab
	And User has searched patients
	And User clicks on button 'View Previous Test Reports'


  Scenario: Verify test report PDF file
    Given User is on View Patient Test Reports page
    When user clicks on view PDF
    Then PDF is opened in proper readable format
    
  Scenario: User has clicked view PDF button 
    Given user clicks on view PDF
    When PDF is opened in proper readable format
    Then PDF has patients details like patient ID, name, email, address, phone number
    Then PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctor's specialization
    Then PDF shows list of conditions, preferences list, Co-morbidites
    And PDF shows diet menu for 7 days, any warning and comments mentioned by doctor