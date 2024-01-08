@login
Feature:   "As a user (sales and store manager), I should be able to
  select any vehicle from the Vehicle page(web table)"

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"



