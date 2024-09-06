Feature: Irctc Sort By Duration

  Scenario Outline: Check Sort By Duration Late First
    Given the user is on the irctc home page for booking Ticket
    When the user enter "<FromLocation>" as the Departure station
    When the user enter "<ToLocation>" as the Arrival station
    When the user select "<TravelDate>" as the date
    When user click the Search button
    When the user click on Sort by Duration
    Then Display All the Elements in the Sort By Duration
    When user clicks on Duration Late First

    Examples: 
      | FromLocation | ToLocation | TravelDate |
      | Kurnool      | Bengaluru  | 01/09/2024 |
