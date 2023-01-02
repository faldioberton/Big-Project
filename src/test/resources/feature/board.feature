Feature: Board

  Scenario: Ensure user create new company
    Given user in page Home
    When user click Create New Company
    And user input field name
    And user input field description
    And user click create
    Then user successfully create company
    Given user in board Companies
    When user click icon plus
    And user click add new team
    And user input field_name
    And user input field_description
    And user click create button
    Then user successfully create team
    Given user in board Companies
    When user click box team
    And user click Board
    And user click icon plus