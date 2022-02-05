Feature: HomePage

  Background:
    Given I launch darksky.net website

  Scenario: Verify feelsLike_tempValue is in between low_tempValue and high_tempValue
    When I store feelsLike_tempValue
    And I store low_tempValue
    And I store high_tempValue
    Then Verify feelsLike_tempValue is in between low_tempValue and high_tempValue
    And I quit pages
