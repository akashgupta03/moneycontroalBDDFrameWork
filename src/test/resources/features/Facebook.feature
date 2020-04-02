Feature: Test Facebook signup page

  Scenario: Test facebook birth years

    And navigate to "https://www.facebook.com/" url
    Then click on birth year button
    Then fetch the all the birth years
    Then verify the birth years "1995" is present