# your_feature.feature

Feature: Sample Feature

  Scenario: Verify search a product
    Given I open the Firefox browser
    When I navigate to "https://takanodan.cl/"
    And search a product
    And select first product of result search
    Then the title should be "Example Domain"
    And close the browser
