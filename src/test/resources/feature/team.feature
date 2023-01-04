Feature: Create Team

  Scenario: Ensure user create new company
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click icon plus
    And user click add new team
    And user input field_name
    And user input field_description
    And user click create button
    Then user successfully create team