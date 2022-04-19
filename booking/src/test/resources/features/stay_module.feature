Feature: Stay client module
  I as a User
  I need to be able to make a stay reservation for said module

  Background:
    Given The user enters the main page

  Scenario Outline: Successfully make a reservation
    When He performs the search through the filters
      | destination   | arriveDate   | returnDate   | adultsPassengers   | bedrooms   |
      | <destination> | <arriveDate> | <returnDate> | <adultsPassengers> | <bedrooms> |
    And He selects the stay
    Then He should see that the stay has the correct data
      | arriveDate   | returnDate   | destination   |
      | <arriveDate> | <returnDate> | <destination> |

    Examples:
      | destination | arriveDate    | returnDate   | adultsPassengers | bedrooms |
      | Santa Marta | 30 abril 2022 | 11 mayo 2022 | 6                | 4        |
      | Medellín    | 9 mayo 2022   | 15 mayo 2022 | 11               | 5        |


  @this
  Scenario: Validate filters by price after search
    When He performs the search through the filters
      | destination | arriveDate    | returnDate   | adultsPassengers | bedrooms |
      | Santa Marta | 30 abril 2022 | 11 mayo 2022 | 6                | 4        |
    And He selects the lowest prices to filter
    Then He should see that the number of options is equal to the view in the filter
