@US3
Feature:   "As a user, I want to learn how to use the pinbar"

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: The user logging
    When the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"


  Scenario: Verify that when users click the PinBar link he will see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.” and“How To Use Pinbar”
    When the user click the “Learn how to use this space”
    Then the user can see “How To Use Pinbar”
    And the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
    And the user should to see image
      #Expected source:/bundles/oronavigation/images/pinbar-location.jpg