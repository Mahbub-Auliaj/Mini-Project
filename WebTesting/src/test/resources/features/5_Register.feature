Feature: User be able to Register
  As user
  I want to make a account
  So that I can login
  Scenario: While i am not a user, i have not be able to register
    Given I am on the login page
    When I click register
    And I input fullname
    And I input invalid email
    And I input register invalid password
    And I click register button
    Then I failed to register

  Scenario: As a user, i have be able to register
    Given I am on the login page
    When I click register
    And I input fullname
    And I input valid email
    And I input register valid password
    And I click register button
    Then I success to register
