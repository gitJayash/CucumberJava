Feature: Test login functionality with multiple users

  Scenario Outline: Check login with multiple users

    Given Browser is open
    And user is on login
    When User enters username "<username>" and password "<password>"
    And User clicks on login
    Then User is navigated to the home

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |