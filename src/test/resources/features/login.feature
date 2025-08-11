Feature: Login functionality

  Scenario Outline: Successful login with valid credentials
    Given the user in on the homepage
    When the user is on the login page
    And the user enters a valid "<username>" and "<password>"
    And clicks the login button
    Then the user should be redirected to the dashboard

    Examples:
    |username|password|
    |admin   |admin   |