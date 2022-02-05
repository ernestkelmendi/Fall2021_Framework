Feature: Login

  Scenario-1: Verify user gets error for invalid credentials
    Given I launch facebook website
    When I enter '%^&&*()' as login email
    When I enter 'abcd@1234' as login password
    When I click on login button
    Then I verify login error is displayed

    Scenario-2: Verify flow when user login with empty credentials on Messenger login screen
      Given I launch facebook website
      When I click on Messenger link
      When I click on login button on Messenger link
      Then I verify continue button is displayed and enabled
      Then I verify "Keep me signed in" checkbox is not selected

  Scenario-4: Verify current date is selected in dropdown when user lands on Sign Up screen
    Given I launch facebook website
    When I click on sign up button
    Then I verify current date is selected in dropdown when user lands on Sign Up screen








