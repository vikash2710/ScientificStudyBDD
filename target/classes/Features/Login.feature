Feature: Login Feature

Scenario Outline: Login Scenario

Given user is already on Login Page
When title of login page is Scientific Study
Then user selects role as "<Role>"
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| username | password      | Role  |
	| admin    | schoolbesterp | Staff |
	