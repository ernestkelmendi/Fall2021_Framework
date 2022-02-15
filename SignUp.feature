Feature: SignUpPage

  Background:
    Given I launch hotels website
    When I click on SignIn link
    When I click on SignUp link

  Scenario: Verify email error Msg "Please check your email address"
    And I enter '#!@###' as email
    And I enter '12345' as password
    Then I verify message 'Please check your email address' is displayed

  Scenario: Verify password error Msg "Please enter a password containing at least six characters"
    And I enter '#!@###' as email
    And I enter '12345' as password
    And I enter '12345' as first name
    Then I verify message 'Please enter a password containing at least six characters' is displayed

  Scenario: Verify password error Msg "Your password cannot be more than 20 characters long."
    And I enter '#!@###' as email
    And I enter '123456789aaaaaaaaaaaaa' as password
    And I enter '12345' as first name
    Then I verify message 'Your password cannot be more than 20 characters long.' is displayed

  Scenario: Verify first name error Msg "Please check your first name"
    And I enter '#!@###' as email
    And I enter '123456789aaaaaaaaaaaaa' as password
    And I enter '12345' as first name
    And I enter '12345' as last name
    Then I verify message 'Please check your first name' is displayed

  Scenario: Verify last name error Msg "Please check your last name"
    And I enter '#!@###' as email
    And I enter '123456789aaaaaaaaaaaaa' as password
    And I enter '12345' as first name
    And I enter '12345' as last name
    And I click 'Create Account' button
    Then I verify message 'Please check your first name' is displayed

  Scenario: Verify tick-mark is displayed
    And I enter 'test@test.com' as email
    And I enter 'abc1234' as password
    And I enter 'Ernest' as first name
    And I enter 'Kelmendi' as last name
    And I click 'Keep me signed in'
    Then I verify tick-mark is displayed for valid email address
    Then I verify tick-mark is displayed for valid password
    Then I verify tick-mark is displayed for valid first name
    Then I verify tick-mark is displayed for valid last name


