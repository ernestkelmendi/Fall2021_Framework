Feature: Login

  Scenario: Verify user gets error for invalid credentials
    Given I launch facebook website
    When I enter `%^&&*()` as login email
    When I enter `abcd@1234` as login password
    When I click on login button
    Then I verify login error is displayed

  Scenario: Verify user gets error for valid credentials
    Given I launch facebook website
    When I enter `validEmail@gmail.com` as login email
    When I enter `correctPassword` as login password
    When I click on login button
    Then I verify user lands on home page

  Scenario: Verify user gets error for valid credentials2
    Given I launch facebook website
    When I enter `correctEmail2@gmail.com` as login email
    When I enter `correctPassword` as login password
    When I click on login button
    Then I verify user lands on home page

    # Backround
    # Scenario-1Feature:
    # Backround
    # Scenario-2Feature:
    # Backround
    # Scenario-3Feature:




