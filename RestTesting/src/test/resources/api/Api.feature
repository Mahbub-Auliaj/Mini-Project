Feature: user
  As an User
  I want to list of post
  so that I can get a post

  Scenario: GET As admin I have be able to get all post
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200 1
    And I receive valid get data for all post

  Scenario: POST As admin I have be able to make post
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201 1
    And I receive valid post data for new post

  Scenario: GET As admin I have be able to get single post
    Given I set GET single api endpoints
    When I send GET single HTTP request
    Then I receive valid HTTP response code 200 3
    And I receive valid get data for single post

  Scenario: PUT As admin i have be able to update a post
    Given I set PUT api endpoint
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200 4
    And I receive valid data for updated post

  Scenario: DELETE As admin i want to delete post
    Given I set DELETE api endpoint
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200