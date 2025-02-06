Feature: User can access homepage

    User is able to see the homepage of the website

Scenario: User is presented with homepage when they access website
    When User types url into browser
    Then User is presented homepage

Scenario: User can click the Make Appointment button
    Given User is on homepage
    When User clicks Make Appointment Button
    Then User is presented with login page