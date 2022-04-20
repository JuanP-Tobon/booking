Feature: Flight purchase module
  I as a User
  I need to carry out the entire flow, filtering by the characteristics of the desired flight and that the options do correspond to the filters

  Background:
    Given The user enters the main page

  Scenario: Check the best flight
    When the user enters the flight component and filters the desired characteristics
      | origin   | destination | departureDate | returnDate |
      | Medellín | Orlando     | abril 30      | mayo 19    |
    Then He should see that the characteristics of the flight is El mejor


  Scenario: Check the lowest price flight successfully
    When the user enters the flight component and filters the desired characteristics
      | origin   | destination | departureDate | returnDate |
      | Medellín | Orlando     | mayo 2        | mayo 13    |
    And He filters by the cheapest flights
    Then He should see that the price is less than or equal to the price that appeared without filtering