Feature: Stay reservation component
  I as a User
  I need to be able to make a stay reservation for said module

  @manual
  Scenario: Search stay by number of stars
    Given The user enters the page and performs the search for their stay
    When He filters the hotels by number of stars
    Then He should see that the list of stays that appear, correspond to the stars by which he filtered

  @manual
  Scenario: Search stay by neighborhood
    Given The user enters the page and performs the search for their stay
    When He filters the hotels by neighborhood
    Then He should see that the list of stays that appear, correspond to the neighborhood by which he filtered

  @manual
  Scenario: Location of stays through google maps
    Given The user enters the page and performs the search for their stay
    When He selects one of the stays and enters the maps module
    Then He should see that the location on maps is correct
    And He should see that some stays close to the selected ones come out

  @manual
  Scenario: Make a reservation without funds on the credit card
    Given The user enters the page and performs the search for their stay
    When He selects one of the stays and fill the form with his data
    And He is in the payment gateway and makes the payment with a card without funds
    Then He should see that the reservation was not made
    And He should see a message indicating that the card did not have sufficient funds and that the transaction was canceled

  @manual
  Scenario: Search for stay without destination city
    Given The user enters the stay reservation portal
    When He enters the filter data except the destination city
    And He does the search
    Then He should see what process does not let him advance and does not show results
    And He should see a message indicating that the destination city cannot be blank