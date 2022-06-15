@DieticianLogin
Feature: Add New Patient Page
Background:
	Given User is on Dietician Website 
	Then User clicks Sign In with all field entered

  Scenario: Add New Patient Details
    Given User is on the Add New Patient Page
#   When User wants to enter New Patient details
    Then Patient Data Form is visible

  Scenario Outline: Empty Form submission For Add New Patient Details
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up mandatory fields
    Then Unable to update and show error message as "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName           | RowNumber |
      | NewPatient_FullName |         0 |

  Scenario Outline: "Full Name" Field Numeric Value Validation
    Given User is on the Add New Patient Page
    When User attempts to put numeric value in Full Name field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName           | RowNumber |
      | NewPatient_FullName |         1 |

  Scenario Outline: "Full Name" Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up Full Name field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName           | RowNumber |
      | NewPatient_FullName |         2 |

  Scenario Outline: "Addess line 1" Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User does not enter any value in Addess line 1 field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         0 |

  Scenario Outline: "Country" Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without selecting any value for Country field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         1 |

  Scenario Outline: City Field Numeric Value Validation
    Given User is on the Add New Patient Page
    When User attempts to put numeric value in City field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         2 |

  Scenario Outline: City Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up City field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         3 |

  Scenario Outline: State, province or region Field Numeric Value Validation
    Given User is on the Add New Patient Page
    When User attempts to put numeric value in State, province or region as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         4 |

  Scenario Outline: State, province or region Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up State, province or region field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         5 |

  Scenario Outline: "Postal code" Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up Postal code field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         6 |

  Scenario Outline: Postal code Field Wrong Data Format Validation
    Given User is on the Add New Patient Page
    When User entered not supported data format in Postal code field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName          | RowNumber |
      | NewPatient_Address |         7 |

  Scenario Outline: Email Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User does not enter any value in Email field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Email |         0 |

  Scenario Outline: Email Field Wrong Data Fomat Validation
    Given User is on the Add New Patient Page
    When User entered not supported data format in Email field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Email |         1 |

  Scenario Outline: Phone number Field Character Value Validation
    Given User is on the Add New Patient Page
    When User attempts to put characters in Phone number field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         0 |

  Scenario Outline: Phone number Field Empty Value Validation
    Given User is on the Add New Patient Page
    When User attempts to submit the form without filling up Phone number field as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         1 |

  Scenario Outline: Phone number should be 10 digits
    Given User is on the Add New Patient Page
    When User fills up the form with valid phone as in "<SheetName>" and <RowNumber>
    Then User can see Add New Patient button

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         2 |

  Scenario Outline: Phone number boundary value less then 10 digits
    Given User is on the Add New Patient Page
    When User fills up the form with Data less than 10 as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         3 |

  Scenario Outline: "Phone number " boundary value more then 10 digits
    Given User is on the Add New Patient Page
    When User fills up the form with Data more than 10 as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         4 |

  Scenario Outline: "Phone number" special character validation
    Given User is on the Add New Patient Page
    When User fills up the phone number with invalid characters as in "<SheetName>" and <RowNumber>
    Then Unable to enter and show error message as in "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | NewPatient_Phone |         5 |

  Scenario Outline: Inserting Valid New Patient data submission
    Given User is on the Add New Patient Page
    When User fills up the form with Valid Data Inputs as in "<SheetName>" and <RowNumber>
    Then User can see Add New Patient button
    
    Examples: 
      | SheetName        | RowNumber |
      | ValidNewPatient  |         7 |

  Scenario Outline: Valid New Patient data submission
    Given User is on the Add New Patient Page
    When User clicks on the Add New Patient button after entering valid Patient data as in "<SheetName>" and <RowNumber>
    Then User lands on My Patients page with the "New Patient" details displayed
    
    Examples: 
      | SheetName        | RowNumber |
      | ValidNewPatient  |         7 |
    
