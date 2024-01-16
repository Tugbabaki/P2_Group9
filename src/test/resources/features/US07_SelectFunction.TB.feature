@B31G9-138
Feature: Default
	@B31G9-135
	Scenario Outline: AC01 - TB -Verify that once the users launch on the Vehicles page, the users can see all the checkboxes as unchecked.  Checklists
		Given user is logged in as a "<UserType>"
		When User clicks on Vehicles Page under Fleet Module Dropdown
		Then User verifies all checkboxes are unselected by default

		Examples:
			| UserType      |
			| store manager |
			| sales manager |


	@B31G9-136
	Scenario Outline: AC02 - TB - Verify that users can check the first checkbox to select all the cars
		Given user is logged in as a "<UserType>"
		When User clicks on Vehicles Page under Fleet Module Dropdown
		Then Verify that users can check the first checkbox to select all the cars

		Examples:
			| UserType      |
			| store manager |
			| sales manager |


	@B31G9-137
	Scenario Outline:  AC03 - TB - Verify that users can select any car
		Given user is logged in as a "<UserType>"
		When User clicks on Vehicles Page under Fleet Module Dropdown
		Then Verify that users can select any car

		Examples:
			| UserType      |
			| store manager |
			| sales manager |
