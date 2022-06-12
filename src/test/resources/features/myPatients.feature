@DieticianLogin
Feature: My Patient
  
  Scenario : Verify my patient tab
  Given User is on any page after login
  When User clicks on My Patients tab
  Then My Patients tab is selected/ highlighted

  Scenario: Verify breadcrumbs
    Given User is on any page after login
    When User clicks on My Patients tab
    Then It shows breadcrubs as Dietician Software/ MyPatients

  Scenario: Confirm my patient title
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Page title is displayed as My Patients

  Scenario: Search feature
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Name, email and phone number filter options and search button are displayed

  Scenario: Verify search button text
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Button used for search has text as Search

  Scenario: Verify default text in name filter input box goes away
    Given User is on My Patients tab
    When User starts typing inside name filter box
    Then Text inside name filter box should disappear

  Scenario: Verify default text in email input box goes away
    Given User is on my patients
    When User starts typing inside email address filter box
    Then Text inside email address filter box should disappear

  Scenario: Verify default text in phone number input box goes away
    Given User is on my patients
    When User starts typing inside phone number filter box
    Then Text inside phone number filter box should disappear

  Scenario: Search patients by name
    Given User is on my patients
    When User clicks on search with <name phrase> into name filter box
    Then Records for <name phrase> are shown

  Scenario: Search patients by email
    Given User is on my patients
    When User clicks on search with <email phrase> into email address filter
    Then Records for <email phrase> are shown

  Scenario: Search patients by phone number
    Given User is on my patients
    When User clicks on search with <phone number> into phone number filter
    Then Records for <phone number> are shown

  Scenario: Search patients by name and phone number
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter
    Then Records for <name phrase> and <phone number> are shown

  Scenario: Search patients by name and email address
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box
    Then Records for <name phrase> and <email phrase> are shown

  Scenario: Search patients by email address and phone number
    Given User is on my patients
    When User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box
    Then Records for <phone number> and <email phrase> are shown

  Scenario: Search patients by email, Name and phone Number
    Given User is on my patients
    When User clicks on search button with <name phrase> into email address filter box, <phone number> into phone number filter box and <email phrase> into email address filter box
    Then Records for <name phrase>, <phone number> and <email phrase> are shown

  Scenario: Search Filter
    Given User is on my patients page
    When User types in anything other than [0-9\-\(\)] in phone number field
    Then It must throw error message and discontinue search action
    Given User is on my patients page
    When User types in anything other then valid character in email address field
    Then It must throw error message and discontinue search action
    Given User is on my patients page
    When User types in anything other than alphabets in name field
    Then It must throw error message and discontinue search action

  Scenario: Display list of all patients
    Given User is on my patients
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only

  Scenario: Verify column names
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions

  Scenario: Verify Action column has buttons
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report/ Plan

  Scenario: Verify that page needs pagiation
    Given Patients records are displayed
    When Records are more than 10
    Then It must show pagination links

  Scenario: Verify next pagination link functionality
    Given Patients records are displayed
    When User clicks on next pagination link
    Then It goes to next page and shows different patients on that page

  Scenario: Verify previous link functionality
    Given Patients records are displayed
    When User clicks on previous pagination link
    Then It goes to previous page

  Scenario: Verify that each patient has Cust ID
    Given User has searched patients
    When Patients records are displayed
    Then Customer Id is shown in column Cust ID column

  Scenario: Verify that each patient has name
    Given User has searched patients
    When Patients records are displayed
    Then Patient name is displayed in Name column

  Scenario: Verify detail column
    Given User has searched patients
    When Patients records are displayed
    Then Details column shows patient email or phone number or address

  Scenario: Verify last visit column
    Given User has searched patients
    When Patients records are displayed
    Then Last visit date is shown in valid date format

  Scenario: Last visit date is shown in valid date format
    Given User has searched patients
    When Patients records are displayed
    Then Verify that email address is in valid format in details cloumn

  Scenario: Verify format of email address
    Given User has searched patients
    When Patients records are displayed
    Then Verify that email address is in valid format in details cloumn

  Scenario: View patients previous diet plans
    Given Patients records are displayed
    When User clicks on button View Previous Diet Plans
    Then It redirects user to Generated Diet Plans page

  Scenario: Create new diet plan
    Given Patients records are displayed
    When User clicks on button Create New Report/Plan
    Then It redirects user to Confirm Health Conditions and Generate a New Diet plan page

  Scenario: View patients previous test reports
    Given Patients records are displayed
    When User clicks on button View Previous Test Reports
    Then It redirects user to View Patient Test Reports page

  Scenario: Previous test reports plans button should not be displayed for new patient
    Given Patients records are displayed
    When Patient is a new patient
    Then View Previous Test Reports and View Previous Diet Plan should not be present

  Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User is on View Patient Test Reports page
    Then My Patients tab is selected/ highlighted

  Scenario: Verify breadcrumbs on test report page
    Given User has searched patients after login
    When User is on View Patient Test Reports page
    Then It shows breadcrumbs as Dietician Software/ View Recent Test Reports

  Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User is on View Patient Test Reports page
    Then My Patients tab is highlighted

  Scenario: Verify breadcrumbs on test report page
    Given User has searched patients after login
    When User is on View Patient Test Reports page
    Then It shows breadcrumbs as Dietician Software/ View Recent Test Reports

  Scenario: Verify title
    Given User has searched patients after login
    When User is on View Patient Test Reports page
    Then Title is displayed as View Patient Test Reports

  Scenario: Verify user primary info
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then It displays primary information like patient Id  number, name, email address, Phone number, Address

  Scenario: Display patient's test reports
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then It displays patient's old and latest test reports

  Scenario: Verify table heading
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then It shows column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions

  Scenario: Verify pagination
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then More than 3 records should be displayed on different pages through pagination

  Scenario: Verify next link
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Pagination has Next link

  Scenario: Verify previous link
    Given	User clicks on button View Previous Test Reports

    When User is on View Patient Test Reports page
    Then Pagination has Previous link

  Scenario: Verify presence of pdf file for each report
    Given	User clicks on button View Previous Test Reports

    When User is on View Patient Test Reports page
    Then Every record shows view PDF option

  Scenario: Verify presence of doc id
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Every report has Doc Id

  Scenario: Verify presence of uploaded time
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Every report shows file upload time

  Scenario: Verify uploaded datetime format
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then File uploaded time is shown in correct date and time format

  Scenario: Verify age of uploaded time
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Uploaded time field shows age of file upload in seconds/minutes/hour/days/months/years

  Scenario: Verify file name
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Every report has its name

  Scenario: Verify identified conditions
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Every report shows identified conditions from its test report file

  Scenario: Verify test report PDF file
    Given User is on View Patient Test Reports page
    When user clicks on View PDF
    Then PDF is opened in proper readable format

  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has patients details like patient ID, name, email, address, phone number
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has doctor details like doc ID, doctor name, email address, clinic/facility name, doctor's specialization
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows list of conditions, preferences list, Co-morbidites
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows diet menu for 7 days, any warning and comments mentioned by doctor
