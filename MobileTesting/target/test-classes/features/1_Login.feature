Feature: User be able to login
  As user I want to see home page
  So that I can buy product

  Scenario: While i am not a user, i cannot be able to login
    Given I am on the home page 1
    When I click login button
    And I input invalid username
    And I input invalid password
    And I click signin button
    Then I still on login Page

  Scenario: As user, I have be able to success login
    Given I am on the home page 1
    When I click login button
    And I input valid username
    And I input valid password
    And I click signin button
    Then I am success to log in
