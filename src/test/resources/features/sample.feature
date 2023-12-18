# your_feature.feature

Feature: Sample Feature

  Scenario: Verify search a product
    Given I open the Firefox browser
    When I navigate to "https://takanodan.cl/"
    And search a product "el señor de los anillos"
    And select first product of result search
