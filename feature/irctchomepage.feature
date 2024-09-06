Feature:  Irctc Home Page

  Scenario Outline: Check labels on the IRCTC Home Page
    Given the user is on the IRCTC Home page
    When the label for the Departure Station field should be "<departureLabel>"
    When label for the Arrival Station field should be "<arrivalLabel>"
    When the label for the All Classes field should be "<availableclassLabel>"
    When the label for the General should be "<generalLabel>"
    Then the user check all labels
    
    

    
    
      