Feature: LoginMessengerFail

  Background:
    Given I launch facebook website
    When I click on Messenger Link

  Scenario: Verify link "mvnFind your account and log in." is displayed with empty credentials
    When I click on Messenger login button
    Then I verify Messenger login fail link is displayed

  Scenario: Verify button "Continue" is enable with empty credentials
    When I click on Messenger login button
    Then I verify button "Continue" is enable

  Scenario: Verify button "Continue" is displayed with empty credentials
    When I click on Messenger login button
    Then I verify button "Continue" is displayed

  Scenario: Verify "Keep me signed in" check-box is not selected by default
    When I click on Messenger login button
    Then I verify "Keep me signed in" check-box is not selected by default