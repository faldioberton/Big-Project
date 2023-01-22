Feature: Attach File

  Scenario: Ensure user attachment file to card
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    When user click feature board
    Then user in page Board
    When user open ones card
    Then user click Attach file
    And user click Allow
    And user click ones files
    Then user successfully attach file