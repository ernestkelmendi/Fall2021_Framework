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

  Scenario: Verify 'Price Guarantee' heading
    And I scroll down
    And I click on 'Our price guarantee' link
    And I get text from 'Price Guarantee' heading
    Then I verify 'Price Guarantee' heading is displayed
    And I verify text from 'Price Guarantee' heading is expected

  Scenario: Verify 'Instant savings. Reward* nights. And more ...' heading
    And I scroll down
    And I click on 'Our price guarantee' link
    And I move back in a webpage
    And I scroll down
    And I click on 'Get a reward night' link
    And I get text from 'Instant savings.' heading
    Then I verify 'Instant savings.' heading is displayed
    And I verify text from 'Instant savings.' heading is expected

  Scenario: Verify icon is displayed
    And I scroll down
    Then I verify icon 'Free cancellation' is displayed
    And I verify icon 'Our price guarantee' is displayed
    And I verify icon 'Get a reward night' is displayed


