Feature: add to compare list functionality
  Scenario: add to compare list

    Given logged user want to add a product to compare list
    When logged user click on add to compare list
    Then product will be added to compare list