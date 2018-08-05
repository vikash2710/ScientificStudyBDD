Feature: Login Feature

@Login
Scenario: Login Scenario

Given user is already on Login Page
When title of login page is Scientific Study
Then user login into the web
Then user is on home page
Then Close the browser


#Examples:
#	| username | password      | Role  |
#	| admin    | schoolbesterp | Staff |
	