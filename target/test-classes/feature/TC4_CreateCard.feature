Feature: Card

  Scenario: Ensure user create card
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    When user click feature board
    Then user in page Board
    And user click add new card
    And user input field_cardname
    And user click button switch Private_card
    And user click checklist
    Then user successfully create card