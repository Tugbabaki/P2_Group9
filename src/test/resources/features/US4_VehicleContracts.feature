@B31G9-109
Feature: Access to Vehicle Contracts page

  User story:
  As a user, I want to access to Vehicle Contracts page


  @B31G9-107
  Scenario Outline: TC01_SD Verify that Store managers and Sales managers can access the Vehicle Contracts page.
    Given user is logged in as a "<UserType>"
    When user navigate to the Vehicle Contracts page
    Then user should be on the Vehicle Contracts page

    Examples:
      | UserType      |
      | store manager |
      | sales manager |


  @B31G9-108
  Scenario: TC02_SD Verify that Drivers can NOT access the Vehicle Contracts page
    Given user is logged in as a "driver"
    When user navigate to the Vehicle Contracts page
    Then user should see the required message