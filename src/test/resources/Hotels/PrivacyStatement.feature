Feature: PrivacyStatementNewTab

  Background:
    Given I launch hotels website
    When I click on SignIn link
    When I click on SignUp link
    When I click on 'Privacy Statement' link

  Scenario: Verify new tab opens for 'Privacy Statement'
    And I store launch page handle
    And I store all handles after clicking 'Privacy Statement' link
    And I store 'Privacy Statement' page handle
    Then I verify new tab opens for 'Privacy Statement'