# your_feature.feature

Feature: Sample Feature

  Scenario: Verify title of the website
    Given I open the Chrome browser
    When I navigate to "https://takanodan.cl/"
    Then the title should be "Example Domain"
    And close the browser
