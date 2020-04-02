Feature: Test Moneycontrol login page

Scenario: Test login with valid credentials
	Given open chrome driver
	And navigate to correct url
	And provide valid credentials
	Then user should be able to login successfully
