Feature: Temperature

  Scenario-5: Verify feelsLike-tempValue is in between low-tempValue and high-tempValue
    Given I launch darksky website
    Then I verify feelsLike-tempValue is in between low and high tempValue

  Scenario-6: Verify correct-temp is displayed correctly when user changes temp-unit
    Given I launch darksky website
    When I change Temp unit from ˚F to ˚C
    Then I Verify temp value is displayed correctly when user changes the temp unit from ˚F to ˚C




