@PdfBox
Feature: Test report pdf file

Background:
	Given User is on Dietician Website 
	When User clicks Sign In with all field entered
	And User clicks on My Patients tab
	And User has searched patients
	And User clicks on button View Previous Test Reports
	Then User is on "Patient Test Reports" page
	
	Scenario: Verify my patient tab on test report page
		Then My Patients tab is selected
		
	Scenario: Verify breadcrumbs on test report page
		Then It shows breadcrubs as Dietician Software, View Recent Test Reports
	
	Scenario: Verify user primary info
		Then It displays primary information like patient Id  number, name, email address, Phone number, Address
		
	Scenario: Verify title
		Then Title is displayed as View Patient Test Reports
	
	Scenario: Display patient test reports
		Then It displays patient old and latest test reports
		
	Scenario: Verify table heading
		Then It shows column heading as Record number, Doc-ID, File Uploaded time, Report name, Identified health conditions
	
	Scenario: Verify pagination
		Then More than 3 records should be displayed on different pages through pagination
		
	Scenario: Verify next link
		Then Pagination has Next link
	
	Scenario: Verify previous link
		Then Pagination has Previous link
		
	Scenario: Verify presence of pdf file for each report
		Then all records show view pdf option

	Scenario: Verify presence of doc id
		Then Every report has Doc Id
	
	Scenario: Verify presence of uploaded time 
		Then Every report shows file upload time

	Scenario: Verify uploaded datetime format
		Then File uploaded time is shown in correct date and time format
	  
	Scenario: Verify age of uploaded time
		Then Uploaded time field shows age of file upload in seconds,minutes,hour,days,months,years
	  	  
  Scenario: Verify file name
		Then Every report has its name
	  
	Scenario: Verify identified conditions
		Then Every report shows identified conditions from its test report file
	
  Scenario: Verify test report PDF file
    When user clicks on view PDF
    Then PDF is opened in proper readable format
    
  Scenario: User has clicked view PDF button 
    Given user clicks on view PDF
    When PDF is opened in proper readable format
    Then PDF has patients details like patient ID, name, email, address, phone number
    Then PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctor's specialization
    Then PDF shows list of conditions, preferences list, Co-morbidites
    And PDF shows diet menu for 7 days, any warning and comments mentioned by doctor