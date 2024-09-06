Feature: Irctc ModifySearch



Scenario: Modify the search Results
Given the user is on the IRCTC home page for booking ticket
   When the user enter "<FromLocation>" as the Departure Station
   When the user enter "<ToLocation>" as the Arrival Station
   When the user select "<TravelDate>" as the Date 
   When the user click the Search button
   When user click on All Classes
   When user click on the Modify Search

  
   Examples: 

      | FromLocation | ToLocation | TravelDate |

      |  Secunderabad   | Bengaluru | 2024-10-25 |
