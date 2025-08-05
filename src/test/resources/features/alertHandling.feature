Feature: Alert handling on the wait page

    Scenario: Validate the alert handling
        Given the user in on the homepage
        When they navigate to the "Wait conditions" section
        And they click the "Show alert" button
        And they accept the alert
        Then the message "Alert handle" should be displayed