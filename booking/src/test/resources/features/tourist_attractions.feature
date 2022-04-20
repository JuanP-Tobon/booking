Feature: Tourist Attractions Component
  I as a User
  I need to check the available tourist attractions with the filtered schedules

  Background:
    Given The user enters the main page

  Scenario: Tickets for attractions with erroneous data
    When The user filters by the characteristics that best tour their like
      | destination | pickupDate    | hour  | tickets |
      | museo       | 29 Abril 2022 | 12:00 | 5       |
    And The user enters his data
      | name | lastName | email            | phone      |
      |      | Ramirez  | prueba@gmail.com | 3212234332 |
    Then He should see that it does not let continue to the payment module and that the message Introduce tu nombre.