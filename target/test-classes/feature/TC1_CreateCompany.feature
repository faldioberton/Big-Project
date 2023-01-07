Feature: Home

  Scenario: 1.Ensure user create new company
    Given user in page Home
    When user click Create New Company
    And user input field name
    And user input field description
    And user click create
    Then user successfully create company

