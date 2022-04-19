Feature: Stay client module
  I as a User
  I need to be able to make a stay reservation for said module

  Background:
    Given The user enters the main page

  Scenario: Successfully make a reservation
    When He performs the search through the filters
      | destination                      | arriveDate    | returnDate   | adultsPassengers | bedrooms |
      | Santa Marta, Magdalena, Colombia | 30 abril 2022 | 11 mayo 2022 | 6                | 4        |
    And He selects the stay
    Then He should see that the stay has the correct data