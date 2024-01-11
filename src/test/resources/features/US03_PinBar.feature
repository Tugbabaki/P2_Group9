@us03
Feature:   "As a user, I want to learn how to use the pinbar"


  Scenario Outline: The user logging
    Given the user logged in as "<userType>"
    When the user click the “Learn how to use this space”
    Then the user can see “How To Use Pinbar”
    And the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
    And the user should to see image
    #Expected source:/bundles/oronavigation/images/pinbar-location.jpg
    Examples:
      | userType |
      | store_manager |
      | sales_manager |
      | driver |



