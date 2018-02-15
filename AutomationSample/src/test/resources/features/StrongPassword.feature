@StrongPassword
Feature: Strong Password
	the user enters password and the length is more than ten characters,
	strong password message shoud appear
	
Scenario Outline:
	Given registration page is loaded
	When the user fills out the form
	And enters "<strong password>"
	Then corresponding strong message should appear
	
Examples: 
|strong password|
|dcjfhri87eh|
|4k5jnhdbstxiirh|
|3456987smkskjdbcbg|
|nafisasfarovamasharipovna|
|nora1@ismailova12345678|