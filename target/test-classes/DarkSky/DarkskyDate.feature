Feature: Date

  Scenario-7: Verify blog post date is showing in correct format MonthName, Date Year
    Given I launch darksky website
    When I click on darksky API
    When I click on blog post
    Then I Verify dates are displayed in "MonthName, Date Year" format

  Scenario-8: Verify current date is selected/highlighted in TimeMachine calendar
    Given I launch darksky website
    When I click Time Machine button
    Then I Verify current date is selected or highlighted in TimeMachine calendar