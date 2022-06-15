@DieticianLogin
Feature: My Patient
  
 Scenario: Verify my patient tab
  Given User is on any page after login
  When User clicks on My Patients tab
  Then My Patients tab is selected

  Scenario: Verify breadcrumbs
    Given User is on any page after login
    When User clicks on My Patients tab
    Then It shows breadcrubs as Dietician Software MyPatients

  Scenario Outline: Confirm my patient title
    Given User is on any page after login
    When User clicks on My Patients tab
    Then User lands on My Patient page as "<SheetName>" and <RowNumber>
    
    Examples: 
      | sheetName  | rowNumber |
      | Page_Title |         2 |

  Scenario: Search feature
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Name, email and phone number filter options and search button are displayed

  Scenario: Verify search button text
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Button used for search has text as Search

  Scenario Outline: Verify default text in search filter input box goes away
    Given User is on My Patients tab
    When User starts typing inside field filter box from "<sheetName>" and <rowNumber>
    Then Text inside input filter box should disappear

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         0 |
      | MyPatient |         1 |
      | MyPatient |         2 |

  Scenario Outline: Search patients by name
    Given User is on My Patients tab
    When User clicks on search with name phrase into name filter box from "<sheetName>" and <rowNumber>
    Then Records for name phrase are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         3 |

  Scenario Outline: Search patients by email
    Given User is on My Patients tab
    When User clicks on search with email phrase into email address filter from "<sheetName>" and <rowNumber>
    Then Records for email phrase are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         4 |

  Scenario Outline: Search patients by phone number
    Given User is on My Patients tab
    When User clicks on search with phone number into phone number filter from "<sheetName>" and <rowNumber>
    Then Records for phone number are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         5 |

  Scenario Outline: Search patients by name and phone number
    Given User is on My Patients tab
    When User clicks on search button with name phrase into name filter box, phone number into phone number filter from "<sheetName>" and <rowNumber>
    Then Records for name phrase and phone number are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         3 |

  Scenario Outline: Search patients by name and email address
    Given User is on My Patients tab
    When User clicks on search button with name phrase into name filter box, email phrase into email address filter box from "<sheetName>" and <rowNumber>
    Then Records for name phrase and email phrase are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         4 |

  Scenario Outline: Search patients by email address and phone number
    Given User is on My Patients tab
    When User clicks on search button with phone number into phone number filter box, email phrase into email address filter box from "<sheetName>" and <rowNumber>
    Then Records for phone number and email phrase are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         5 |

  Scenario Outline: Search patients by email, Name and phone Number
    Given User is on My Patients tab
    When User clicks on search button with name phrase into name address filter box, phone number into phone number filter box and email phrase into email address filter box from "<sheetName>" and <rowNumber>
    Then Records for name phrase, phone number and email phrase are shown

    Examples: 
      | sheetName | rowNumber |
      | MyPatient |         6 |

  Scenario Outline: Search Filter
    Given User is on My Patients tab
    When User types in anything other than valid value in search filter field from "<sheetName>" and <rowNumber>
    Then It must throw error message from "<sheetName>" and <rowNumber>

    Examples: 
      | sheetName     | rowNumber |
      | MyPatient     |         9 |
      
  Scenario: Display list of all patients
    Given User is on My Patients tab
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only

  Scenario Outline: Verify column names
    Given User is on My Patients tab
    When User clicks on search button with all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions

  Scenario: Verify Action column has buttons
    Given User is on My Patients tab
    When User clicks on search button with or without all fields empty
    Then It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report Plan

  Scenario: Verify that page needs pagiation
    Given Patients records are displayed
    When Records are more than ten
    Then It must show pagination links

  Scenario Outline: Verify next pagination link functionality
    Given Patients records are displayed
    When User clicks on next pagination link
    Then It goes to next page as in "<sheetname>" and <rownumber>
    
    Examples: 
      | sheetName     | rowNumber |
      | MyPatient     |         0 |

  Scenario Outline: Verify previous link functionality
    Given Patients records are displayed
    When User clicks on previous pagination link
    Then It goes to previous page as in "<sheetname>" and <rownumber>
    
    Examples: 
      | sheetName     | rowNumber |
      | MyPatient     |         0 |
    

  Scenario: Verify that each patient has Cust ID, name, phone
    Given User has searched patients
    When Patients records are displayed
    Then Valid data is shown in given column

  Scenario: Last visit date is shown in valid date format
    Given User has searched patients
    When Patients records are displayed
    Then Verify that date is in valid format in details cloumn

  Scenario: Verify format of email address
    Given User has searched patients
    When Patients records are displayed
    Then Verify that email address is in valid format in details cloumn

  Scenario Outline: View patients previous diet plans
    Given Patients records are displayed
    When User clicks on button View Previous Diet Plans
    Then User lands on Diet Plans page as "<SheetName>" and <RowNumber>
    
    Examples: 
      | SheetName           | RowNumber |
      | Page_Title					|         3 |

  Scenario Outline: Create new diet plan
    Given Patients records are displayed
    When User clicks on button Create New Report/Plan
    Then User lands on Diet Plans page as "<SheetName>" and <RowNumber>
    
    Examples: 
      | SheetName           | RowNumber |
      | Page_Title					|         3 |

  Scenario Outline: View patients previous test reports
    Given Patients records are displayed
    When User clicks on button View Previous Test Reports
    Then User is on View Patient Test Reports page as "<SheetName>" and <RowNumber>
    
    Examples: 
      | SheetName           | RowNumber |
      | Page_Title					|         5 |

  Scenario: Previous test reports plans button should not be displayed for new patient
    Given Patients records are displayed
    When Patient is a new patient
    Then View Previous Test Reports and View Previous Diet Plan should not be present
