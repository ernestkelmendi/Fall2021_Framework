Feature: Facebook Pay
  Scenario: Verify Facebook Pay opens in new window with expected title
    Given I launch facebook website
    When I click on facebook Pay
    Then I verify a open window opens
    And I verify title of facebook Pay is 'Facebook Pay: Simple, Secure, Free Payments'

  Scenario: Verify user can make a payment using Facebook Pay
    Given I launch facebook website
    When I click on facebook Pay
    And I make payment using Facebook Pay
    And I verify Payment successful message is displayed

