Feature: Test login functionality

  Scenario: Check login is successful with valid credentials

    Given Browser is open
    And user is on login
#    When User enters <username> and <password>
#    When User enters username and password --> //Thi is the previous one for nonparameterized for LoginDemo.
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on login
    Then User is navigated to the home

#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |
