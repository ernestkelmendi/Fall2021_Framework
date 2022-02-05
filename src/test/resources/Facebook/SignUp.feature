Feature: SignUp

  Background:
    Given I launch facebook website
    When I click on Create New Account button

  Scenario: Verify msg 'Please choose a gender. You can change who can see this later.' is displayed
    And I enter 'Aaa' as First name
    And I enter 'Bbb' as Surname
    And I enter '0123456789' as Mobile number or email address
    And I enter 'aa1234bb' as New password
    And I select '7' as DAY of Date of birth
    And I select 'Feb' as MONTH of Date of birth
    And I select '2001' as YEAR of Date of birth
    And I click Sign Up button
    Then I verify message 'Please choose a gender. You can change who can see this later.' is displayed

  Scenario: Verify current day is selected in Dropdown Day 'Date of birth'
    Then I verify current day is selected in Dropdown Day 'Date of birth'

  Scenario: Verify current month is selected in Dropdown Month 'Date of birth'
    Then I verify current month is selected in Dropdown Month 'Date of birth'

  Scenario: Verify current year is selected in Dropdown Year 'Date of birth'
    Then I verify current year is selected in Dropdown Year 'Date of birth'