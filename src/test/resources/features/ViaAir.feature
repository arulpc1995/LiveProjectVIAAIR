@tag
Feature: To validate the flight booking detail

  @tag1
  Scenario Outline: Book the flight
    Given The user in home booking flight page
    When ther user click the trip way
    And the user enter valid origin and destination detail "<depart>","<arrival>"
    And the user enter valid Date to travel
    And the user select the count of passenger
    Then the user click the find flight button to view list of flight

    Examples: 
      | depart | arriavl |
      | fs     | df      |
