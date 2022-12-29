Feature: Create Team

  Scenario: Ensure user create new company
    Given user in Home Page
    When user click skip
    And user click check box
    And user click Sign In
    And user click sign in with google account
    And user click account 1 to sign in
    When user click Create New Company
    And user input field name
    And user input field description
    And user click create
    Then user successfully create company
    When user click icon plus
    And user click add new team
    And user input field_name
    And user input field_description
    And user click create button
    Then user successfully create team