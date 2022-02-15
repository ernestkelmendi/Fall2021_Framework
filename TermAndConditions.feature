Feature: TermsAndConditionsNewTab

  Background:
    Given I launch hotels website
    When I click on SignIn link
    When I click on SignUp link
    When I click on 'Terms and Conditions' link

  Scenario: Verify new tab opens for 'Terms and Conditions'
    And I store launch page handle
    And I store all handles after clicking 'Term and Conditions' link
    And I store 'Terms and Conditions' page handle
    Then I verify new tab opens for 'Terms and Conditions'
