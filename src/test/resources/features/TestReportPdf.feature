Feature: Test report pdf file

  Scenario: Verify test report PDF file
    Given User is on View Patient Test Reports page
    When user clicks on view PDF
    Then PDF is opened in proper readable format
    
  Scenario: User has clicked view PDF button 
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has patients details like patient ID, name, email, address, phone number
    Then PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctor's specialization
    Then PDF shows list of conditions, preferences list, Co-morbidites
    And PDF shows diet menu for 7 days, any warning and comments mentioned by doctor