@vyTruck
Feature:  Verify column visibility on the Vehicles Model page

  As a  Store manager or Sales manager I can see 10 certain columns on the Vehicles Model page.

  Background: User is on the login page
    Given user is on the VyTruck login page

  Scenario Outline: Verify column visibility for a "<role>"
    When the user logs in with username "<username>" and password "UserUser123"
    And user navigates to Vehicles Model page
    Then User is able to see the following columns on the page
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |
    Examples:
      | role          | username        |
      | store manager | storemanager51  |
      | store manager | storemanager71  |
      | store manager | storemanager61  |
      | store manager | storemanager81  |
      | sales manager | salesmanager101 |
      | sales manager | salesmanager102 |
      | sales manager | salesmanager111 |
      | sales manager | salesmanager112 |
      | sales manager | salesmanager121 |

  @message
  Scenario Outline: Verifying the informational message for a "driver"
    When  the user logs in with username "<username>" and password "UserUser123"
    And user clicks on Vehicles Model page
    Then User is able to see the error message "You do not have permission to perform this action."
    Examples:
      | username |
      | user1    |
      | user11   |
      | user12   |
      | user31   |
      | user42   |