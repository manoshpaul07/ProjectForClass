

Feature: Validate Booking a flight for a Delta 
  

  @flight

  Scenario Outline: 
    Given the user visits Delta booking flight website
    When the user types on "<From>" and "<To>" and selects their destinations 
    When the user selects their trip, depart and return time
    When the user selects the amount of passengers,selects best fares for 
    Then the user will click next arrow and will be able to see the tickets 

    Examples: 
      | From  |   To  |
      |  nyc  | Texas |
      
