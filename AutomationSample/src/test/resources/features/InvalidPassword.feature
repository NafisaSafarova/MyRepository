@InvalidPassword
Feature: Invalid Password
	If password field is left empty, field-is-required message should appear
	
Scenario:
	Given registration page is loaded
	When the user fills out the form
	And leaves password field empty
	Then this field is required message should appear