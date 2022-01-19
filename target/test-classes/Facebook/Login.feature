Feature: Login

  Scenario: Verify user gets error for invalid credentials
    Given I launch facebook website
    When I enter `InvalidEmail@gmail.com` as login email
    When I enter `InvalidPassword@123` as login password
    When I click on login button
    Then I verify login error is displayed