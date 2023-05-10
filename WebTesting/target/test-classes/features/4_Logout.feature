Feature: User have be able to log out
  As user
  I have be able to log out from page

  Scenario: As a user i have be able to log out
    Given I am on the home page 4
    When I click account button
    And I click logout
    Then I success to log out