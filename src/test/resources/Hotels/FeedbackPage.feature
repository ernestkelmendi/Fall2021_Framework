Feature: Using Feedback Window

  Background:
    Given I launch hotels website
    When I click on 'Help' button
    When I click on 'Website feedback' link
    When I switch window handle to 'DirectWord' page

  Scenario: Verify error is displayed when user submits the empty feedback form
    And I click on 'Submit' button
    Then I verify error is displayed when user submits the empty feedback form

  Scenario: Verify red dotted box
    And I click on 'Submit' button
    Then I verify red dotted box

  Scenario: Verify message 'THANK YOU FOR YOUR FEEDBACK.'is displayed
    And I click on 'rating-five'
    And I enter 'Great Website!' as comments
    And I select 'Highly likely' from 'How likely are you to return'
    And I click on 'Yes' for 'Prior to this visit, have you ever booked'
    And I click on 'Yes' for 'Did you accomplish what you wanted to do on this page'
    And I click on 'Submit' button
    Then I verify message 'THANK YOU FOR YOUR FEEDBACK.' is displayed
