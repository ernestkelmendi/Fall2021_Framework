Feature: SignInPage

  Background:
    Given I launch hotels website
    When I click on SignIn link

  Scenario: Verify sign in error Msg "We don’t recognize the email and password combination you’ve entered..."
    And I enter '#!@###' as email using 'Sign in' page
    And I enter '12345' as password using 'Sign in' page
    And I click 'Sign In' button
    Then I verify 'Sign in' Error message 'We don’t recognize the email and password combination you’ve entered...' is displayed