Feature: Test Moneycontrol most active share page

Scenario: Test login with valid credentials

	And navigate  "https://www.moneycontrol.com/" url
	Then click on most active share link
	Then fetch Most Active stocks data
