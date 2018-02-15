@PasswordMismatch
Feature: Password Mismatch
	Re-entered password doesn't match password

Scenario:
		Given registration form is loaded
		When the user fills out the form
		And types password and re-enteres mismatching password
		Then Password mismatch message should appear