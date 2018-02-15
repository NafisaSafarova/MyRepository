@WeakPassword
Feature: Weak Password
	User enters password, and when the length is less than eight 
	characters, weak-password message should appear
	
Scenario Outline:
	Given registration page is loaded
	When the user fills out the form
	And enters "<weak password>"
	Then corresponding weak password message should appear
	
Examples:
|weak password|
|123|
|sdfg|
|1n2jg|
|vmnbjhg|