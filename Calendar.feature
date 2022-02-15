Feature: Using calendar

  Background:
    Given I launch hotels website
    When I click on 'Check-In' button

  Scenario: Verify previous days of current month are not enabled
    And I verify current month is displayed
    And I get all previous days of current month
    Then I verify previous days of current month are not enabled

  Scenario: Verify 'Go Back Arrow' button is enabled for current month
    And I verify current month is displayed
    Then I verify 'Go Back Arrow' button is enabled for current month
