Feature: Car rental Component
  I as a User
  I need to rent vehicles depending on the characteristics you want

  @manual
  Scenario: successfully rent a small car
    Given The user enters the page and accesses the vehicle rental component
    When He fills the filters by starting point and dates
    And He selects the category of small vehicles
    Then He should see that only small vehicles are listed and he can make a reservation for one of these

  @manual
  Scenario: successfully rent a medium car
    Given The user enters the page and accesses the vehicle rental component
    When He fills the filters by starting point and dates
    And He selects the category of medium vehicles
    Then He should see that only medium vehicles are listed and he can make a reservation for one of these

  @manual
  Scenario: successfully rent a large car
    Given The user enters the page and accesses the vehicle rental component
    When He fills the filters by starting point and dates
    And He selects the category of large vehicles
    Then He should see that only large vehicles are listed and he can make a reservation for one of these

  @manual
  Scenario: successfully rent a SUV car
    Given The user enters the page and accesses the vehicle rental component
    When He fills the filters by starting point and dates
    And He selects the category of SUV vehicles
    Then He should see that only SUV vehicles are listed and he can make a reservation for one of these

  @manual
  Scenario: Complete Reservation successfully
    Given The user enters the component and filters his search
    When He selects the vehicle that suits him best
    And He fills out the form correctly with his data to finalize the reservation
    Then He should see that the reservation has been successful and that all the data is correct

  @manual
  Scenario: Wrong reservation
    Given The user enters the component and filters his search
    When He selects the vehicle that suits him best
    And He fills out the form incorrectly with his data to finalize the reservation
    Then He should see that the reservation was not completed because the data is wrong

  @manual
  Scenario: Filter carts by price correctly
    Given The user enters the page and accesses the vehicle rental component
    When He fills the filters by starting point and dates
    And He uses the price filter module
    Then He should see that the car list prices are between the filtered ranges

  @manual
  Scenario: Filter cars by customer rating
    Given The user enters the page and accesses the vehicle rental component
    When He performs the filtering by the rating of the car
    Then He should see that only those of the selected rating appear in the list of cars