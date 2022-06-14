Feature: Test report pdf file

Background:
	Given User is on Dietician Website 
	When User clicks Sign In with all field entered
	And User clicks on My Patients tab
	And User has searched patients
	And User clicks on button View Previous Test Reports
	
	Scenario: Verify my patient tab on test report page
		When User is on View Patient Test Reports page
		Then My Patients tab is selected
		
	Scenario: Verify breadcrumbs on test report page
		When User is on View Patient Test Reports page
		Then It shows breadcrubs as Dietician Software, View Recent Test Reports
	
	Scenario: Verify user primary info
		When User is on View Patient Test Reports page
		Then It displays primary information like patient Id  number, name, email address, Phone number, Address
		
	Scenario: Verify title
		When User is on View Patient Test Reports page
		Then Title is displayed as View Patient Test Reports
	
	Scenario: Display patient test reports
		When User is on View Patient Test Reports page
		Then It displays patient old and latest test reports
		
	Scenario: Verify table heading
		When User is on View Patient Test Reports page
		Then It shows column heading as Record number, Doc-ID, File Uploaded time, Report name, Identified health conditions
	
	Scenario: Verify pagination
		When User is on View Patient Test Reports page
		Then More than 3 records should be displayed on different pages through pagination
		
	Scenario: Verify next link
		When User is on View Patient Test Reports page
		Then Pagination has Next link
	
	Scenario: Verify previous link
		When User is on View Patient Test Reports page
		Then Pagination has Previous link
		
	Scenario: Verify presence of pdf file for each report
		When User is on View Patient Test Reports page
		Then all records show view pdf option

	Scenario: Verify presence of doc id
		When User is on View Patient Test Reports page
	  Then Every report has Doc Id
	
	Scenario: Verify presence of uploaded time 
		When User is on View Patient Test Reports page
	  Then Every report shows file upload time

	Scenario: Verify uploaded datetime format
		When User is on View Patient Test Reports page
	  Then File uploaded time is shown in correct date and time format
	  
	Scenario: Verify age of uploaded time
		When User is on View Patient Test Reports page
	  Then Uploaded time field shows age of file upload in seconds,minutes,hour,days,months,years
	  	  
  Scenario: Verify file name
		When User is on View Patient Test Reports page
	  Then Every report has its name
	  
	Scenario: Verify identified conditions
		When User is on View Patient Test Reports page
	  Then Every report shows identified conditions from its test report file
	
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