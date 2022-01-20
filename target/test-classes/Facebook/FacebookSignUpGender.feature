Feature: SignUp Gender on Facebook

  Scenario-3: Verify user gets error for invalid credentials
    Given I launch facebook website
    When I click on create new account
    When I enter the first name
    When I enter the last name
    When I enter the mobile number
    When I enter new password
    When I enter date of birth
    When I click on sign up button
    Then I verify please select gender error is displayed