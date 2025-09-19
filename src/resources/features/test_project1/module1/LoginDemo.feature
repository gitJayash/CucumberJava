Feature: Test login functionality

  Scenario: Check login is successful with valid credentials

    Given Browser is open
    And user is on login
#    When User enters <username> and <password>
    When User enters username and password
    And User clicks on login
    Then User is navigated to the home

#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |
