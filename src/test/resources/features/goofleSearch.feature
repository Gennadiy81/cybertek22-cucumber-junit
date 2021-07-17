
@all
Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever I want, and see relevant information
Background:
  Given User is on Google home page
  Scenario: Search page title verification

    Then User should see title is Google

  Scenario: User search title verification

    When  User searches for apple
    Then User should see apple in the title
@wip
    Scenario: User search title verification

      When User searches for "mango"
      Then User should see "mango" in the title