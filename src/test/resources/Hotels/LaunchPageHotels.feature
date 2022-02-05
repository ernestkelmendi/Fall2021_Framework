Feature: LaunchPage

  Background:
    Given I launch hotels website


  Scenario: Verify 'Change Dates' button is displayed and enabled
    When I click on 'Search' tab
    And I type 'bora'
    And I click from suggestion on 'Bora Bora'
    When I click on 'Check-In' button
    And I click on 'Go Forward Arrow' button
    And I click on 'April 1 2022' button
    And I click on 'April 10 2022' button
    And I click on 'Apply' button
    And I click on 'Search' button
    And I scroll down to end of page
    Then I verify 'Change Dates' button is displayed and enabled

  Scenario: Verify number of travelers as selected
    When I click on 'Travelers' button
    And I click 'plus' button to increase by 1 traveler
    And I click 'plus' button to increase by 1 traveler
    And I click 'Add another room' button
    And I click 'Add another room' button
    And I click 'Done' button
    And I get text from 'Travelers' button
    Then I verify number of travelers as selected
