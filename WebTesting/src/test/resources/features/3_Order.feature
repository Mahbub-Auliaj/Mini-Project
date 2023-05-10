Feature: User have be able to make order
  As user
  I have be able to make orders
  So that i can buy something

  Scenario: As a user i have be able to make order
    Given I am on the home page 3
    When I click buy button
    And I click cart button
    And I go to payment page
    And I click pay button
    Then I can see transaction detail