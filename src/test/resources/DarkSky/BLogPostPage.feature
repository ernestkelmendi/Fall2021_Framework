Feature: BlogPostPage

  Background:
    Given I launch darksky.net website

  Scenario: Verify blog post date is showing in correct format 'MMMM d, yyyy'
    When I click on link 'Dark Sky API'
    When I click on link 'blog post'
    And I store blog post page dates
    Then I verify blog post date is showing in correct format 'MMMM d, yyyy'
