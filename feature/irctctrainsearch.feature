Feature: Search Trains on IRCTC

  Scenario Outline: Search for trains from Valid <FromLocation> to <ToLocation> on <TravelDate>
    Given the user is on the irctc home page for Booking Ticket
    When the user enters "<FromLocation>" as the departure station
    When the user enters "<ToLocation>" as the arrival station
    When the user selects "<TravelDate>" as the date
    When the user click the search button
    

    Examples: 
      | FromLocation | ToLocation   | TravelDate |
      | Kurnool    | Bengaluru | 2024-09-15 |

      
       Scenario Outline: Search for trains from Invalid <FromLocation> to <ToLocation> on <TravelDate>
    Given the user is on the irctc home page for Booking Ticket
    When the user enters "<FromLocation>" as the departure station
    When the user enters "<ToLocation>" as the arrival station
    When the user selects "<TravelDate>" as the date
    When the user click the search button
   

    Examples: 
      | FromLocation | ToLocation   | TravelDate |
      | Proddatur    | Bengaluru | 2024-09-15 |
      