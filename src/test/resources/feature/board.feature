Feature: Board

  Scenario: Ensure user add feature board
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature board
    Then user in page Board
    When user click icon plus
    Then user input field new list
    And user click submit
    Then user successfully add board