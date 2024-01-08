@us4-VehicleContracts
Feature: Access to Vehicle Contracts page

  User story:
  As a user, I want to access to Vehicle Contracts page

  @AC1
  Scenario Outline: Access Vehicle Contracts page
    Given user is logged in as a "<UserType>"
    When user navigate to the Vehicle Contracts page
    Then user should be on the Vehicle Contracts page

    Examples:
      | UserType      |
      | store manager |
      | sales manager |


  @AC2
  Scenario: Verify access restriction for Drivers
    Given I am logged in as a "Driver"
    When I attempt to navigate to the Vehicle Contracts page
    Then I should see the message "You do not have permission to perform this action."



