Feature: Alert handling on the wait page

    Scenario: Validate the alert handling when Show Alert
        Given the user in on the homepage
        When they navigate to the Wait conditions section
        And they click the Show alert button
        And they accept the alert
        Then the message "Alert handled" should be displayed

    Scenario: Validate the alert when Showing a Prompt
        Given the user in on the homepage
        When they navigate to the Wait conditions section
        And they click the Show prompt button
        And they cancel the alert
        Then the message "Cancelled" should be displayed

    Scenario: Validate the alert when Showing a Prompt
        Given the user in on the homepage
        When they navigate to the Wait conditions section
        And they click the Show prompt button
        And they accept the alert
        Then the message "OK" should be displayed

    Scenario: Validate the visible button when it appears
        Given the user in on the homepage
        When they navigate to the Wait conditions section
        And they click the Trigger button
        And they click the newly visible button
        Then the message "Can you see me?" should be displayed